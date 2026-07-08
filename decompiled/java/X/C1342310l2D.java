package X;

import android.content.Context;
import android.util.LruCache;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0l2D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1342310l2D implements InterfaceC1350330lF9, InterfaceC720600SOk {
    public static final Set<Long> LJI = new LinkedHashSet();
    public final Keva LIZ = Keva.getRepo("comment_top_bar_activity");
    public final String LIZIZ = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUserId();
    public final LruCache<String, CommentTopBarStruct> LIZJ = new LruCache<>(10);
    public String LIZLLL;
    public boolean LJ;
    public Aweme LJFF;

    @Override // X.InterfaceC1350330lF9
    public final String H3() {
        return "comment_activity";
    }

    @Override // X.InterfaceC1350330lF9
    public final void LIZ() {
    }

    @Override // X.InterfaceC1350330lF9
    public final void LJ() {
        this.LJ = true;
    }

    @Override // X.InterfaceC1350330lF9
    public final Map LJFF(Aweme aweme) {
        return null;
    }

    @Override // X.InterfaceC1350330lF9
    public final Map LJII(Aweme aweme) {
        return null;
    }

    @Override // X.InterfaceC1350330lF9
    public final int zg() {
        return 15;
    }

    @Override // X.InterfaceC720600SOk
    public final void LIZIZ(Aweme aweme) {
        LIZJ(null, aweme);
    }

    @Override // X.InterfaceC1350330lF9
    public final Integer LJIIIIZZ(Aweme aweme) {
        return Integer.valueOf(R.layout.a56);
    }

    @Override // X.InterfaceC1350330lF9
    public final void LJIIIZ(Aweme aweme) {
        if (this.LJ) {
            this.LJ = false;
            LIZJ(null, aweme);
        }
    }

    @Override // X.InterfaceC720600SOk
    public final boolean LJIIJJI(Aweme aweme) {
        boolean z = true;
        if (((Number) C276070Art.LIZ.getValue()).intValue() != 1) {
            z = false;
        }
        if (z) {
            return LIZLLL(aweme, null, null);
        }
        return LJI(null, aweme);
    }

    public static String LJIILIIL(C1342310l2D c1342310l2D, CommentTopBarStruct commentTopBarStruct) {
        boolean z;
        c1342310l2D.getClass();
        if ("".length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c1342310l2D.LIZIZ);
            sbLIZ.append('_');
            sbLIZ.append(Long.valueOf(commentTopBarStruct.id));
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(c1342310l2D.LIZIZ);
        sbLIZ2.append('_');
        sbLIZ2.append(Long.valueOf(commentTopBarStruct.id));
        sbLIZ2.append('_');
        sbLIZ2.append("");
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    @Override // X.InterfaceC1350330lF9
    public final void LIZJ(CommentContextSource commentContextSource, Aweme aweme) {
        CommentTopBarStruct commentTopBarStruct;
        C1350340lFA.LIZ(this, aweme, commentContextSource);
        Long lValueOf = null;
        if (aweme != null && aweme.getAid() != null && (commentTopBarStruct = this.LIZJ.get(aweme.getAid())) != null) {
            lValueOf = Long.valueOf(commentTopBarStruct.id);
        }
        C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
        EnumC1342350l2H enumC1342350l2H = EnumC1342350l2H.SHOW;
        String str = this.LIZLLL;
        c1350920lG6.getClass();
        C1350920lG6.LJLI(enumC1342350l2H, lValueOf, aweme, str);
    }

    @Override // X.InterfaceC1350330lF9
    public final boolean LJI(CommentContextSource commentContextSource, Aweme aweme) {
        List<CommentTopBarStruct> commentTopBarStructList;
        List<CommentTopBarStruct> commentTopBarStructList2;
        List<CommentTopBarStruct> listLJLLLL;
        String aid = null;
        if (aweme != null) {
            aid = aweme.getAid();
        }
        if (aid != null && aweme != null && (commentTopBarStructList = aweme.getCommentTopBarStructList()) != null && !commentTopBarStructList.isEmpty() && aweme != null && (commentTopBarStructList2 = aweme.getCommentTopBarStructList()) != null && (listLJLLLL = C13LP.LJLLLL(new Comparator() { // from class: X.0349
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return C20085613iQ.LIZIZ(Long.valueOf(((CommentTopBarStruct) t).priority), Long.valueOf(((CommentTopBarStruct) t2).priority));
            }
        }, commentTopBarStructList2)) != null) {
            for (CommentTopBarStruct commentTopBarStruct : listLJLLLL) {
                Set<Long> set = LJI;
                if (set.contains(Long.valueOf(commentTopBarStruct.id))) {
                    this.LIZJ.put(aweme.getAid(), commentTopBarStruct);
                    return true;
                }
                int i = this.LIZ.getInt(LJIILIIL(this, commentTopBarStruct), 0);
                long j = commentTopBarStruct.maxExposures;
                if (j == 0 || i < j) {
                    this.LIZJ.put(aweme.getAid(), commentTopBarStruct);
                    set.add(Long.valueOf(commentTopBarStruct.id));
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC1350330lF9
    public final boolean LIZLLL(Aweme aweme, C2189821An6 c2189821An6, String str) {
        if (LJI(null, aweme) && aweme != null && aweme.getAid() != null && this.LIZJ.get(aweme.getAid()) != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1350330lF9
    public final View LJIIL(Context context, Aweme aweme, CommentContextSource commentContextSource) {
        String strEnterFrom;
        String strEnterMethod = null;
        if (context == null) {
            return null;
        }
        this.LJFF = aweme;
        if (commentContextSource != null) {
            strEnterFrom = CommentContextSourceKt.enterFrom(commentContextSource);
            strEnterMethod = CommentContextSourceKt.enterMethod(commentContextSource);
        } else {
            strEnterFrom = null;
        }
        View viewLJIIJ = LJIIJ(context, aweme, strEnterFrom, strEnterMethod);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, C0HD5.LJ(48, (C1340720kze) viewLJIIJ, context));
        if (viewLJIIJ != null) {
            C786410Ut5.W5(viewLJIIJ, layoutParams);
            C1340720kze c1340720kze = (C1340720kze) viewLJIIJ;
            C426750GoL.LJIIL(viewLJIIJ, Integer.valueOf(C0HD5.LJ(12, c1340720kze, context)), 0, Integer.valueOf(C0HD5.LJ(12, c1340720kze, context)), 0, 16);
        }
        return viewLJIIJ;
    }

    @Override // X.InterfaceC720600SOk
    public final View LJIIJ(Context context, Aweme aweme, String str, String str2) {
        String aid;
        CommentTopBarStruct commentTopBarStruct;
        this.LIZLLL = str;
        if (aweme == null || (aid = aweme.getAid()) == null || (commentTopBarStruct = this.LIZJ.get(aid)) == null) {
            return null;
        }
        C1340720kze c1340720kze = new C1340720kze(context, commentTopBarStruct, aweme, str, new C1342330l2F(this));
        String strLJIILIIL = LJIILIIL(this, commentTopBarStruct);
        this.LIZ.storeInt(strLJIILIIL, this.LIZ.getInt(strLJIILIIL, 0) + 1);
        return c1340720kze;
    }
}
