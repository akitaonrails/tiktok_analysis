package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicCohostWillJoinCrashFix;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRustCohostPrepareStateFix;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bH8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C967160bH8 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ EnumC2231411CVf LLILLJJLI;
    public final /* synthetic */ C967130bH5 LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C967160bH8(int i, EnumC2231411CVf enumC2231411CVf, C967130bH5 c967130bH5, boolean z) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = enumC2231411CVf;
        this.LLILLL = c967130bH5;
        this.LLILZ = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Long lLJLJJL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUserListChanged");
        sbLIZ.append(", listChangeType = ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", source <");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append('>');
        C1304630k3R.LIZLLL(6, C2188811AlT.LIZIZ(sbLIZ), this.LLILLL.LIZJ);
        List<LinkUser> listLIZ = LIZ(false);
        List<LinkUser> listLIZ2 = LIZ(true);
        if (LinkMicRustCohostPrepareStateFix.INSTANCE.enable()) {
            Iterator<InterfaceC967450bHb> it2 = this.LLILLL.LJIJJLI.iterator();
            while (it2.hasNext()) {
                it2.next().LJIILLIIL(listLIZ, listLIZ2);
            }
        }
        LIZ(true);
        LIZ(true);
        LIZ(true);
        LIZ(true);
        LIZ(true);
        LIZ(true);
        LIZ(true);
        List<LinkUser> listLIZ3 = LIZ(true);
        if (this.LLILLL.LIZIZ) {
            if (LinkMicCohostWillJoinCrashFix.INSTANCE.enable()) {
                this.LLILLL.LJIILL.clear();
                C967130bH5 c967130bH5 = this.LLILLL;
                Iterator<LinkUser> it3 = listLIZ3.iterator();
                while (it3.hasNext()) {
                    Long l = it3.next().userId;
                    if (l != null) {
                        long jLongValue = l.longValue();
                        ConcurrentHashMap<Long, Long> concurrentHashMap = c967130bH5.LJIILL;
                        Long lValueOf = Long.valueOf(jLongValue);
                        InterfaceC966930bGl interfaceC966930bGl = c967130bH5.LIZLLL;
                        concurrentHashMap.put(lValueOf, Long.valueOf((interfaceC966930bGl == null || (lLJLJJL = interfaceC966930bGl.LJLJJL(jLongValue)) == null) ? 0L : lLJLJJL.longValue()));
                    }
                }
            }
            C967130bH5 c967130bH52 = this.LLILLL;
            EnumC2231411CVf enumC2231411CVf = this.LLILLJJLI;
            List listLJLIL = C13LP.LJLIL(listLIZ3, listLIZ2);
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : (ArrayList) listLJLIL) {
                if (hashSet.add(((LinkUser) obj).linkMicId)) {
                    arrayList.add(obj);
                }
            }
            c967130bH52.LIZIZ(enumC2231411CVf, arrayList);
        }
        int i = this.LL;
        if (i == 0 && this.LLILZ) {
            this.LLILLL.LIZ(31);
        } else {
            this.LLILLL.LIZ(i);
        }
        return Unit.LIZ;
    }
}
