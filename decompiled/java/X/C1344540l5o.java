package X;

import android.content.Context;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: renamed from: X.0l5o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1344540l5o {
    public static int LIZIZ;
    public static boolean LIZJ;
    public static final C1344540l5o LIZ = new C1344540l5o();
    public static final List<Integer> LIZLLL = new ArrayList();
    public static final List<Integer> LJ = new ArrayList();
    public static final List<Integer> LJFF = new ArrayList();
    public static final Set<Integer> LJI = new LinkedHashSet();
    public static final Set<Integer> LJII = new LinkedHashSet();
    public static final Set<Integer> LJIIIIZZ = new LinkedHashSet();
    public static final int LJIIIZ = R.layout.a2z;
    public static final int LJIIJ = R.layout.a30;
    public static final C01GW LJIIJJI = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(528));
    public static final C01GW LJIIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(530));
    public static final C01GW LJIILIIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(529));
    public static final C01GW LJIILJJIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(527));

    public static void LIZIZ() {
        C1353700lKa.LIZIZ();
        C1350650lFf.LIZ.getClass();
        C1350650lFf.LIZIZ();
        C1911270zpt.LIZJ();
        C2250521D6s.LIZIZ();
        C1350650lFf.LIZIZ();
        C1380700m28.LIZIZ.getValue();
        ((CommentService) ServiceManager.get().getService(CommentService.class)).LIZJ();
        ((Number) C0BJY.LIZ.getValue()).intValue();
        C818490W8x.LIZ();
        C1350650lFf.LIZIZ();
    }

    public static void LIZJ(Context context, Aweme aweme) {
        if (LIZJ || context == null || aweme == null || C294200Bg2.LIZ()) {
            return;
        }
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1343980l4u(aweme, context, null), 2);
    }

    public static final void LIZ(Context context, ArrayList<C443120HZe<String, Context, List<Integer>>> arrayList, String str, List<Integer> list) {
        C01GW<Map<String, Integer>> c01gw = C1357700lR2.LJFF;
        for (Pair pair : C1356320lOo.LIZIZ(context, C13LP.LLIIII(list))) {
            arrayList.add(new C443120HZe<>(str, pair.getFirst(), pair.getSecond()));
        }
    }
}
