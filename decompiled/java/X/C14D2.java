package X;

import com.ss.android.ugc.aweme.creative.file.CreativePathWorkspaceImpl;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;

/* JADX INFO: renamed from: X.14D2, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
@InterfaceC1294060jmO
public final class C14D2 {
    public static final /* synthetic */ int LIZ = 0;

    public static final Workspace LIZ(CreativeInfo creativeInfo) {
        return new Workspace(new CreativePathWorkspaceImpl(creativeInfo));
    }

    public static final Workspace LIZIZ(CreativeInfo creativeInfo, String str) {
        CreativePathWorkspaceImpl creativePathWorkspaceImpl = new CreativePathWorkspaceImpl(creativeInfo);
        creativePathWorkspaceImpl.concatVideoPath = null;
        creativePathWorkspaceImpl.concatAudioPath = null;
        creativePathWorkspaceImpl.mMusicPath = str;
        return new Workspace(creativePathWorkspaceImpl);
    }
}
