package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS25S1400000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lM2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1354600lM2 {
    public static final C1354600lM2 LIZ = new C1354600lM2();
    public static final Map<String, Comment> LIZIZ = new LinkedHashMap();

    public static Comment LIZIZ(String str) {
        return (Comment) ((LinkedHashMap) LIZIZ).get(str);
    }

    public static float LIZJ(String str) {
        Object next;
        Iterator it2 = ((LinkedHashMap) LIZIZ).values().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((Comment) next).getCid(), str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Comment comment = (Comment) next;
        if (comment != null) {
            return comment.getCommentPostProgress();
        }
        return 0.0f;
    }

    public static boolean LIZLLL(Comment comment) {
        Collection<Comment> collectionValues = ((LinkedHashMap) LIZIZ).values();
        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
            for (Comment comment2 : collectionValues) {
                if (Intrinsics.LJFF(comment2.getCid(), comment.getCid()) && comment2.getCommentPostStatus() == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean LJ(Comment comment) {
        Collection<Comment> collectionValues = ((LinkedHashMap) LIZIZ).values();
        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
            for (Comment comment2 : collectionValues) {
                if (Intrinsics.LJFF(comment2.getCid(), comment.getCid()) && comment2.getCommentPostStatus() == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void LJII(String str) {
        Iterator it2 = ((LinkedHashMap) LIZIZ).entrySet().iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(((Comment) ((Map.Entry) it2.next()).getValue()).getCid(), str)) {
                it2.remove();
                return;
            }
        }
    }

    public static void LJIIIIZZ(Comment comment) {
        Object next;
        if (comment.getCommentPostStatus() != 2 && comment.getCommentPostStatus() != 1) {
            LJII(comment.getCid());
            return;
        }
        Iterator it2 = ((LinkedHashMap) LIZIZ).values().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((Comment) next).getCid(), comment.getCid())) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Comment comment2 = (Comment) next;
        if (comment2 != null) {
            comment2.setCommentPostProgress(comment.getCommentPostProgress());
            comment2.setCommentPostStatus(comment.getCommentPostStatus());
            comment2.setCommentPostItemList(comment.getCommentPostItemList());
            comment2.setTextImageCommentPostItemList(comment.getTextImageCommentPostItemList());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia LIZ(X.C1354600lM2 r28, com.ss.android.ugc.aweme.feed.model.Aweme r29, java.lang.String r30) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1354600lM2.LIZ(X.0lM2, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia");
    }

    public static void LJFF(Aweme aweme, Comment comment, Context context, String str, String str2, Function1 function1, Bitmap bitmap) {
        C0MNH c0mnh;
        if (context == null || aweme == null || comment == null) {
            return;
        }
        if (C294390BgL.LIZ()) {
            c0mnh = C0MNH.STORY;
        } else {
            c0mnh = C0MNH.POST;
        }
        if (bitmap == null && c0mnh == C0MNH.STORY) {
            C823050WQl.LIZLLL().execute(new C0H1T(context, comment, aweme, c0mnh, new C1354610lM3(comment, c0mnh, str2, context, aweme, str, function1)));
            return;
        }
        LJI(comment, c0mnh, str2, context, aweme, str, function1, bitmap);
    }

    public static final void LJI(Comment comment, C0MNH c0mnh, String str, Context context, Aweme aweme, String str2, Function1<? super C0ML2, Unit> function1, Bitmap bitmap) {
        String str3 = str2;
        C0MN4 c0mn4 = new C0MN4(comment, bitmap, c0mnh, str, false, true, false);
        C1E2V c1e2v = C1E2V.LIZIZ;
        C1354600lM2 c1354600lM2 = LIZ;
        if (str3 == null) {
            str3 = "";
        }
        c1e2v.startForward(context, LIZ(c1354600lM2, aweme, str3), c0mn4, new AwS25S1400000_21((Function1) function1, (Function1<? super C0ML2, Unit>) comment, (Comment) c0mnh, (C0MNH) context, (Context) str, (String) 2));
    }
}
