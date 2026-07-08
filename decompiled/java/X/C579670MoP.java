package X;

import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import java.io.File;

/* JADX INFO: renamed from: X.0MoP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C579670MoP implements C1DMJ {
    public final File LIZ;
    public final File LIZIZ;
    public final File LIZJ;
    public final File LIZLLL;

    @Override // X.C1DMJ
    public final File LIZ() {
        return this.LIZJ;
    }

    @Override // X.C1DMJ
    public final File LIZIZ() {
        return this.LIZLLL;
    }

    @Override // X.C1DMJ
    public final File LIZJ() {
        return this.LIZIZ;
    }

    @Override // X.C1DMJ
    public final File getWorkspace() {
        return this.LIZ;
    }

    public C579670MoP(Workspace workspace) {
        File fileLJ = workspace.LJ();
        fileLJ.mkdirs();
        this.LIZ = fileLJ;
        this.LIZIZ = workspace.LJ();
        this.LIZJ = workspace.LIZIZ();
        this.LIZLLL = workspace.LIZ();
        new C0VSJ(fileLJ, "photo");
    }
}
