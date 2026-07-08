package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: renamed from: X.0RNq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C694920RNq {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(400));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(401));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(326));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(327));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(325));
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(403));
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(404));
    public static final C01GW LJII = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(405));
    public static final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(402));

    public static final C700950ReX LIZ(C0RN2 c0rn2, VideoItemParams videoItemParams, C690870R8b c690870R8b) {
        C0ROM<VideoItemParams, C690870R8b> c0romLIZIZ;
        List list = (List) LJI.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            String str = (String) obj;
            if (!((Set) LJII.getValue()).contains(str) || ((c0romLIZIZ = C0ROK.LIZIZ(c0rn2, str)) != null && c0romLIZIZ.LIZ(videoItemParams, c690870R8b))) {
                arrayList.add(obj);
            }
        }
        C13BV c13bv = C13BV.INSTANCE;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new C700970ReZ((String) it2.next()));
        }
        C13BV c13bv2 = C13BV.INSTANCE;
        return new C700950ReX(c13bv, arrayList2, c13bv2, c13bv2);
    }
}
