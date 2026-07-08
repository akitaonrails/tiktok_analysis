package X;

import Y.ARunnableS20S0100100_17;
import com.bytedance.android.livesdk.livesetting.gift.GiftCollaborateGiftingDownloadTimeOutMockSetting;
import com.bytedance.android.livesdk.livesetting.gift.GiftCollaborateGiftingDownloadTimeOutToastSetting;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0fYv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1131950fYv {
    public static final Map<Long, C1131940fYu> LIZ = new LinkedHashMap();
    public static final C1132330fZX LIZIZ = new InterfaceC1137580fi0() { // from class: X.0fZX
        @Override // X.InterfaceC1137580fi0
        public final void LIZ() {
        }

        @Override // X.InterfaceC1137580fi0
        public final boolean LIZIZ() {
            return false;
        }
    };

    public static InterfaceC1137580fi0 LIZ(long j) {
        if (!GiftCollaborateGiftingDownloadTimeOutToastSetting.INSTANCE.isEnabled()) {
            return LIZIZ;
        }
        C1131940fYu c1131940fYu = (C1131940fYu) ((LinkedHashMap) LIZ).get(Long.valueOf(j));
        if (c1131940fYu == null) {
            return LIZIZ;
        }
        if (c1131940fYu.LIZIZ != EnumC1131980fYy.LL) {
            return LIZIZ;
        }
        C0IK5.LIZLLL(c1131940fYu.LIZJ);
        Object obj = new Object();
        c1131940fYu.LJFF = obj;
        c1131940fYu.LIZIZ = EnumC1131980fYy.LLILLJJLI;
        C1131960fYw c1131960fYw = new C1131960fYw(c1131940fYu, null);
        c1131940fYu.LJI = c1131960fYw;
        if (GiftCollaborateGiftingDownloadTimeOutMockSetting.isEnabled()) {
            LIZIZ(j, obj);
            return c1131960fYw;
        }
        C486790J7d.LIZLLL(new ARunnableS20S0100100_17(j, obj, 8), obj, c1131940fYu.LIZLLL);
        return c1131960fYw;
    }

    public static void LIZIZ(long j, Object obj) {
        Map<Long, C1131940fYu> map = LIZ;
        C1131940fYu c1131940fYu = (C1131940fYu) ((LinkedHashMap) map).get(Long.valueOf(j));
        if (c1131940fYu != null && c1131940fYu.LJFF == obj && c1131940fYu.LIZIZ == EnumC1131980fYy.LLILLJJLI) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("phaseB TIMED_OUT effectId=");
            sbLIZ.append(j);
            sbLIZ.append(" after ");
            sbLIZ.append(c1131940fYu.LIZLLL);
            sbLIZ.append("ms");
            C20441214yg.LJIIL("GiftEffectDownloadTimeoutWatcher", C2188811AlT.LIZIZ(sbLIZ));
            C1131960fYw c1131960fYw = c1131940fYu.LJI;
            c1131940fYu.LIZIZ = EnumC1131980fYy.LLILLL;
            if (c1131960fYw != null) {
                c1131960fYw.LIZJ = true;
                c1131960fYw.LIZLLL = true;
                Function0<Unit> function0 = c1131960fYw.LIZIZ;
                if (function0 != null) {
                    function0.invoke();
                }
            }
            Function2<Long, EnumC1131970fYx, Unit> function2 = c1131940fYu.LJ;
            if (function2 != null) {
                function2.invoke(Long.valueOf(j), EnumC1131970fYx.TIMED_OUT);
            }
            map.remove(Long.valueOf(j));
        }
    }
}
