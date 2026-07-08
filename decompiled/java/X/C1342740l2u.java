package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.texttoimage.ICommentInlineBannerReadyListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0l2u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1342740l2u {
    public static WeakReference<ViewOnAttachStateChangeListenerC20604515jv> LIZIZ;
    public static WeakReference<Aweme> LIZJ;
    public static final C1342740l2u LIZ = new C1342740l2u();
    public static String LIZLLL = "";
    public static final ConcurrentHashMap<String, ICommentInlineBannerReadyListener> LJ = new ConcurrentHashMap<>();
    public static final Set<String> LJFF = Collections.newSetFromMap(new ConcurrentHashMap());
    public static final Set<String> LJI = Collections.newSetFromMap(new ConcurrentHashMap());
    public static final Set<String> LJII = Collections.newSetFromMap(new ConcurrentHashMap());
    public static final Set<String> LJIIIIZZ = Collections.newSetFromMap(new ConcurrentHashMap());

    public static void LIZ(String str) {
        if (!C1340250kyt.LIZ || str.length() == 0) {
            return;
        }
        LJI.remove(str);
    }

    public static boolean LIZIZ(String str) {
        if (!C1340250kyt.LIZ || str == null || str.length() == 0) {
            return false;
        }
        return LJIIIIZZ.contains(str);
    }

    public static boolean LIZJ(String str) {
        if (!C1340250kyt.LIZ || str.length() == 0) {
            return false;
        }
        return LJI.contains(str);
    }

    public static void LIZLLL(String str) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        C20600815jK<InterfaceC1891350zJl> c20600815jKLIZJ;
        C1342730l2t c1342730l2t;
        Comment comment;
        if (!C1340250kyt.LIZ) {
            return;
        }
        LJFF.remove(str);
        WeakReference<ViewOnAttachStateChangeListenerC20604515jv> weakReference = LIZIZ;
        if (weakReference != null && (viewOnAttachStateChangeListenerC20604515jv = weakReference.get()) != null && (c20600815jKLIZJ = C1345700l7g.LIZJ(viewOnAttachStateChangeListenerC20604515jv)) != null) {
            int i = 0;
            for (InterfaceC1891350zJl interfaceC1891350zJl : (ArrayList) c20600815jKLIZJ.LJII()) {
                String cid = null;
                if ((interfaceC1891350zJl instanceof C1342730l2t) && (c1342730l2t = (C1342730l2t) interfaceC1891350zJl) != null && (comment = c1342730l2t.LL) != null) {
                    cid = comment.getCid();
                }
                if (Intrinsics.LJFF(cid, str)) {
                    if (i >= 0) {
                        C20600815jK.LJIILIIL(c20600815jKLIZJ, i);
                        return;
                    }
                    return;
                }
                i++;
            }
        }
    }

    public static int LJ(LinearLayoutManager linearLayoutManager) {
        Object c098200Yq;
        try {
            c098200Yq = Integer.valueOf(linearLayoutManager.findFirstVisibleItemPosition());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = -1;
        }
        return ((Number) c098200Yq).intValue();
    }

    public static int LJFF(LinearLayoutManager linearLayoutManager) {
        Object c098200Yq;
        try {
            c098200Yq = Integer.valueOf(linearLayoutManager.findLastVisibleItemPosition());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = -1;
        }
        return ((Number) c098200Yq).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d3 A[PHI: r12
      0x00d3: PHI (r12v1 com.ss.android.ugc.aweme.feed.model.Aweme) = (r12v0 com.ss.android.ugc.aweme.feed.model.Aweme), (r12v6 com.ss.android.ugc.aweme.feed.model.Aweme) binds: [B:59:0x00c5, B:63:0x00d1] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI(com.ss.android.ugc.aweme.comment.model.Comment r16, com.ss.android.ugc.aweme.feed.model.Aweme r17, java.lang.Object r18, java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1342740l2u.LJI(com.ss.android.ugc.aweme.comment.model.Comment, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.Object, java.lang.String, java.lang.String):void");
    }
}
