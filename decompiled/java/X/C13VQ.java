package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IInternalAVService;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.13VQ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13VQ {
    public static final C13VQ LIZ = new C13VQ();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(291));

    public static long LIZ(C13VQ c13vq, File file, boolean z) {
        Set prefixAllowList;
        AFwS219S0000000_30 aFwS219S0000000_30 = AFwS219S0000000_30.get$arr$(292);
        c13vq.getClass();
        C13VP.LIZ.getClass();
        long j = 0;
        if (C13VP.LIZ() && file != null && file.exists()) {
            if (!((IInternalAVService) ServiceManager.get().getService(IInternalAVService.class)).isPublishing(null) && (((Number) C274590ApV.LIZ.getValue()).intValue() & 4) == 4) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LIZ.getClass();
                linkedHashSet.addAll(((C13VR) LIZIZ.getValue()).LIZIZ());
                C19881812qe c19881812qe = new C19881812qe(linkedHashSet, new InterfaceC19882712qn() { // from class: X.13Vi
                    @Override // X.InterfaceC19882712qn
                    public final Object apply(Object obj) {
                        return new Regex("/data/data/").replaceFirst((String) obj, "/data/user/0/");
                    }
                });
                C19881812qe c19881812qe2 = new C19881812qe(linkedHashSet, new InterfaceC19882712qn() { // from class: X.13Vh
                    @Override // X.InterfaceC19882712qn
                    public final Object apply(Object obj) {
                        return new Regex("/data/user/0/").replaceFirst((String) obj, "/data/data/");
                    }
                });
                linkedHashSet.addAll(c19881812qe);
                linkedHashSet.addAll(c19881812qe2);
                linkedHashSet.add(new C20022113Vr().LJIIJ(EnumC20227914Cv.LOCAL_EXTRACT_MUSIC, "", false).getAbsolutePath());
                linkedHashSet.add(new C20022113Vr().LJIIJ(EnumC20227914Cv.STYLE_EFFECT, "", false).getAbsolutePath());
                prefixAllowList = linkedHashSet;
            } else {
                prefixAllowList = ((C13VR) LIZIZ.getValue()).getPrefixAllowList();
            }
            C13VD c13vd = new C13VD(prefixAllowList, null, 2);
            if (file.exists()) {
                C13VF c13vf = new C13VF();
                c13vf.LIZ(c13vd);
                c13vf.LIZIZ(file);
            }
            j = 0 + c13vd.LIZJ;
            if (z) {
                C13VU c13vu = new C13VU(prefixAllowList, 2);
                c13vu.LIZJ = true;
                C13VF c13vf2 = new C13VF();
                c13vf2.LIZ(c13vu);
                c13vf2.LIZIZ(file);
                c13vu.LIZIZ(AFwS219S0000000_30.get$arr$(293));
                aFwS219S0000000_30.getClass();
            }
        }
        return j;
    }
}
