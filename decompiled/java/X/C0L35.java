package X;

import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.cut.BackgroundVideoCompileConfigure;
import com.ss.android.ugc.aweme.shortvideo.cut.DiyPropVideoCompileConfigure;

/* JADX INFO: renamed from: X.0L35, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L35 {
    public static final BackgroundVideoCompileConfigure LIZ(Workspace workspace) {
        return new BackgroundVideoCompileConfigure(workspace.LL.Bg().getPath(), workspace.LL.oy().getPath());
    }

    public static final DiyPropVideoCompileConfigure LIZIZ(Workspace workspace) {
        return new DiyPropVideoCompileConfigure(workspace.LL.Jj().getPath());
    }
}
