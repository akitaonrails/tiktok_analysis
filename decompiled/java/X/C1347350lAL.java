package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.commentv2.keyboard.inboxquickcomment.SingleKeyboardFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0lAL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1347350lAL {
    public static final C1347350lAL LIZ = new C1347350lAL();

    public static void LIZ(C19EH c19eh) {
        if (((Boolean) C0A8R.LIZ.getValue()).booleanValue()) {
            c19eh.LJIIL();
        } else {
            c19eh.LJIIJ();
        }
    }

    public static final void LJ(Context context) {
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        Fragment fragmentLJJJJZI;
        SingleKeyboardFragment singleKeyboardFragment;
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null && (fragmentLJJJJZI = supportFragmentManager.LJJJJZI("single_keyboard_input")) != null && (fragmentLJJJJZI instanceof SingleKeyboardFragment) && (singleKeyboardFragment = (SingleKeyboardFragment) fragmentLJJJJZI) != null && singleKeyboardFragment.PR()) {
            singleKeyboardFragment.yQ(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ed A[PHI: r8
      0x00ed: PHI (r8v5 androidx.fragment.app.FragmentManager) = (r8v4 androidx.fragment.app.FragmentManager), (r8v6 androidx.fragment.app.FragmentManager) binds: [B:47:0x00eb, B:45:0x00e5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(X.C19EG r19, androidx.fragment.app.Fragment r20, com.ss.android.ugc.aweme.feed.model.Aweme r21, com.ss.android.ugc.aweme.comment.model.CommentContextSource r22, X.C1346920l9e r23) {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1347350lAL.LIZLLL(X.19EG, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.comment.model.CommentContextSource, X.0l9e):void");
    }

    public static SingleKeyboardFragment LIZIZ(Aweme aweme, Comment comment, String str, String str2, String str3, C1346920l9e c1346920l9e, CommentContextSource commentContextSource) {
        SingleKeyboardFragment singleKeyboardFragment = new SingleKeyboardFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIZ(bundle, "aweme_args", aweme);
        C786410Ut5.LJJIZ(bundle, "comment_args", comment);
        C786410Ut5.LJJIZ(bundle, "enter_from", str);
        C786410Ut5.LJJIZ(bundle, "enter_method", str2);
        C786410Ut5.LJJIZ(bundle, "keyboard_config", c1346920l9e);
        C786410Ut5.LJJIZ(bundle, "from_page", str3);
        C786410Ut5.LJJIZ(bundle, "keyboard_source", commentContextSource);
        singleKeyboardFragment.setArguments(bundle);
        return singleKeyboardFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0114 A[PHI: r9
      0x0114: PHI (r9v4 androidx.fragment.app.FragmentManager) = (r9v2 androidx.fragment.app.FragmentManager), (r9v5 androidx.fragment.app.FragmentManager) binds: [B:56:0x0112, B:54:0x010c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.InterfaceC737440SwI LIZJ(X.C19EG r15, androidx.fragment.app.Fragment r16, com.ss.android.ugc.aweme.feed.model.Aweme r17, com.ss.android.ugc.aweme.comment.model.Comment r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, X.C1346920l9e r22, com.ss.android.ugc.aweme.comment.model.CommentContextSource r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1347350lAL.LIZJ(X.19EG, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.comment.model.Comment, java.lang.String, java.lang.String, java.lang.String, X.0l9e, com.ss.android.ugc.aweme.comment.model.CommentContextSource):X.0SwI");
    }
}
