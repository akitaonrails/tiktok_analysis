package X;

import com.ss.android.ugc.aweme.experiment.CommentVHPreloadCountSetting;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0l3a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1343160l3a {
    public static int LIZ;
    public static int LIZIZ;
    public static int LIZJ;
    public static final int LIZLLL;
    public static final int LJ;
    public static boolean LJFF;

    static {
        C01GW c01gw = CommentVHPreloadCountSetting.LIZIZ;
        LIZ = ((CommentVHPreloadCountSetting.PreloadConfig) c01gw.getValue()).firstLevelCommentPreloadCount;
        LIZIZ = ((CommentVHPreloadCountSetting.PreloadConfig) c01gw.getValue()).secondLevelCommentPreloadCount;
        LIZJ = ((CommentVHPreloadCountSetting.PreloadConfig) c01gw.getValue()).replyButtonPreloadCount;
        LIZLLL = R.layout.a2z;
        LJ = R.layout.a30;
    }
}
