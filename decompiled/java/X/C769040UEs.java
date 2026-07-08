package X;

import com.bytedance.android.live.effect.api.LiveGameEffectFetchedChannel;
import com.bytedance.android.live.effect.api.SetImageToPreviewChannel;
import com.bytedance.android.live.effect.model.LiveGoalInfo;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UEs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C769040UEs implements C0JFD {
    public static final C769040UEs LIZ = new C769040UEs();
    public static LiveEffect LIZIZ;
    public static LiveEffect LIZJ;
    public static boolean LIZLLL;

    public static final void LJ() {
        C0UFI c0ufi = C0UFI.LIZ;
        LiveGoalInfo liveGoalInfoLJIJ = C0UFI.LJIJ();
        liveGoalInfoLJIJ.effectPosition = InterfaceC772190UQv.X3.LIZIZ().intValue();
        InterfaceC772190UQv.V3.LJFF(C769080UEw.LIZJ(C769080UEw.LIZ(liveGoalInfoLJIJ)));
    }

    public static final void LIZ() {
        C0U78 c0u78LIZ = C0UA1.LIZ();
        String str = C0UD4.LIZIZ;
        LIZIZ = (LiveEffect) C13LP.LJJJLL(c0u78LIZ.qr(str));
        LIZJ = (LiveEffect) C13LP.LJJJLL(C0UA1.LIZ().qr("livebackground"));
        if (C767770U9v.LIZLLL()) {
            LIZLLL = true;
            LJFF(true);
        }
        C0UA1.LIZ().lr(str);
        C0UA1.LIZ().lr("livebackground");
    }

    public static final boolean LIZJ() {
        return !C0UA1.LIZ().qr("livegame").isEmpty();
    }

    public static LiveEffect LIZIZ(DataChannel dataChannel) {
        List list;
        Object next;
        List<T> list2;
        String name;
        Object obj = null;
        if (dataChannel == null || (list = (List) dataChannel.gg0(LiveGameEffectFetchedChannel.class)) == null) {
            return null;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((C0U74) next).LIZ, "livegame")) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C0U74 c0u74 = (C0U74) next;
        if (c0u74 == null || (list2 = c0u74.LIZIZ) == 0) {
            return null;
        }
        Iterator it3 = list2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next2 = it3.next();
            Effect effect = ((LiveEffect) next2).LIZJ;
            if (effect != null) {
                name = effect.getName();
            } else {
                name = null;
            }
            if (Intrinsics.LJFF(name, "draw_guess")) {
                obj = next2;
                break;
            }
        }
        return (LiveEffect) obj;
    }

    public static final void LIZLLL(final DataChannel dataChannel) {
        C0UA1.LIZ().lr("livegame");
        if (LIZIZ != null) {
            C0UA1.LIZ().kr(LIZIZ, C0UD4.LIZIZ);
        }
        if (LIZJ != null) {
            if (LIZLLL) {
                LIZLLL = false;
                LJFF(false);
            }
            C0UA1.LIZ().kr(LIZJ, "livebackground");
        }
        final String strUr = C0UA1.LIZ().ur();
        final String strAr = C0UA1.LIZ().Ar();
        if ((C767250U7v.LJFF(LIZIZ) || C767250U7v.LJFF(LIZJ)) && strUr != null && strAr != null) {
            C486790J7d.LIZLLL(new Runnable() { // from class: X.0JFm
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LiveGameEffectHelper@23ad.release$1");
                    try {
                        DataChannel dataChannel2 = dataChannel;
                        if (dataChannel2 != null) {
                            dataChannel2.zW(SetImageToPreviewChannel.class, new Pair(strUr, strAr));
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LiveGameEffectHelper@23ad.release$1");
                }
            }, null, 500L);
        }
        LIZIZ = null;
        LIZJ = null;
    }

    public static void LJFF(boolean z) {
        String strLIZ;
        C0UFI c0ufi = C0UFI.LIZ;
        LiveGoalInfo liveGoalInfoLJIJ = C0UFI.LJIJ();
        if (z) {
            liveGoalInfoLJIJ.effectPosition = 0;
        } else {
            liveGoalInfoLJIJ.effectPosition = InterfaceC772190UQv.X3.LIZIZ().intValue();
        }
        InterfaceC772190UQv.V3.LJFF(C769080UEw.LIZJ(C769080UEw.LIZ(liveGoalInfoLJIJ)));
        C0U78 c0u78LIZ = C0UA1.LIZ();
        if (z || (strLIZ = C769080UEw.LIZ(C0UFI.LJIJ())) == null) {
            strLIZ = "";
        }
        c0u78LIZ.setRenderCacheString("LiveGoal", strLIZ);
    }
}
