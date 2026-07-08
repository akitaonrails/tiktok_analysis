package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: renamed from: X.0U5s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C766700U5s implements C0U69<LiveEffect> {
    public final boolean LIZ;
    public long LIZIZ = System.currentTimeMillis();
    public final HashSet<String> LIZJ = new HashSet<>();
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 964));

    public C766700U5s(boolean z) {
        this.LIZ = z;
    }

    @Override // X.C0U69
    public final List<C0U74<LiveEffect>> LJIIIZ(List<C0U74<LiveEffect>> list) {
        List<LiveEffect> listLL;
        C770170UJb.LIZJ("SmallItemBeauty");
        C770170UJb.LIZLLL = "";
        Iterator<Object> it2 = new C1939607ik(list).iterator();
        while (it2.hasNext()) {
            for (T t : ((C0U74) it2.next()).LIZIZ) {
                LIZ(t, false);
                if (C0U7C.LJIILJJIL(t) && (listLL = t.LL()) != null) {
                    Iterator<LiveEffect> it3 = listLL.iterator();
                    while (it3.hasNext()) {
                        LIZ(it3.next(), false);
                    }
                }
            }
        }
        return list;
    }

    public final void LIZ(LiveEffect liveEffect, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("downloadEffect: ");
        sbLIZ.append(liveEffect.getEffectId());
        C20441214yg.LIZIZ("EffectMonitor#BeautyDownload", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("downloadEffect: ");
        sbLIZ2.append(C766720U5u.LJIILLIIL(liveEffect));
        sbLIZ2.append(", ");
        sbLIZ2.append(C0U7C.LJIILJJIL(liveEffect));
        sbLIZ2.append(", ");
        sbLIZ2.append(liveEffect.LJ());
        C20441214yg.LIZIZ("EffectMonitor#BeautyDownload", C2188811AlT.LIZIZ(sbLIZ2));
        if ((!C766720U5u.LJIILLIIL(liveEffect) || z) && !C0U7C.LJIILJJIL(liveEffect) && !liveEffect.LJ() && !this.LIZJ.contains(liveEffect.getResourceId())) {
            C20441214yg.LIZIZ("EffectMonitor#BeautyDownload", "realStartDownload");
            this.LIZIZ = System.currentTimeMillis();
            C766720U5u.LJ(liveEffect, (C0U45) this.LIZLLL.getValue());
        }
    }

    public final void LIZIZ(long j, LiveEffect liveEffect, boolean z) {
        if (liveEffect == null) {
            return;
        }
        String str = "done";
        String name = "";
        if (this.LIZ) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_beauty_resource_download");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis() - j), "duration");
            c474500IjALIZ.LJJII(Long.valueOf(liveEffect.getEffectId()), "effect_id");
            c474500IjALIZ.LJJII(liveEffect.getResourceId(), "resource_id");
            String strLJJIJLIJ = liveEffect.LJJIJLIJ();
            if (strLJJIJLIJ == null) {
                strLJJIJLIJ = liveEffect.getName();
            }
            c474500IjALIZ.LJJII(strLJJIJLIJ, "beauty_type_name");
            if (liveEffect.LLLIIII()) {
                name = liveEffect.getName();
            }
            c474500IjALIZ.LJJII(name, "beauty_type_name_tier2");
            if (!z) {
                str = "failed";
            }
            c474500IjALIZ.LJJII(str, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
            c474500IjALIZ.LIZ();
            return;
        }
        C0UD7 c0ud7 = C0UD7.LIZ;
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_guest_connection_beauty_resource_download");
        c474500IjALIZ2.LJIL();
        c474500IjALIZ2.LJJII(Long.valueOf(System.currentTimeMillis() - j), "duration");
        c474500IjALIZ2.LJJII(Long.valueOf(liveEffect.getEffectId()), "effect_id");
        c474500IjALIZ2.LJJII(liveEffect.getResourceId(), "resource_id");
        String strLJJIJLIJ2 = liveEffect.LJJIJLIJ();
        if (strLJJIJLIJ2 == null) {
            strLJJIJLIJ2 = liveEffect.getName();
        }
        c474500IjALIZ2.LJJII(strLJJIJLIJ2, "beauty_type_name");
        if (liveEffect.LLLIIII()) {
            name = liveEffect.getName();
        }
        c474500IjALIZ2.LJJII(name, "beauty_type_name_tier2");
        if (!z) {
            str = "failed";
        }
        c474500IjALIZ2.LJJII(str, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c474500IjALIZ2.LJJIIZI(C0UD7.LJIIJJI);
        c474500IjALIZ2.LIZ();
    }
}
