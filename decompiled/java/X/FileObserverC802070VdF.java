package X;

import android.os.FileObserver;
import java.io.File;

/* JADX INFO: renamed from: X.0VdF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class FileObserverC802070VdF extends FileObserver {
    public final File LIZ;
    public final /* synthetic */ RunnableC802050VdD LIZIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileObserverC802070VdF(RunnableC802050VdD runnableC802050VdD, File file) {
        super(file.getAbsolutePath(), 264);
        this.LIZIZ = runnableC802050VdD;
        this.LIZ = file;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i, String str) {
        if ((i & 8) != 0) {
            this.LIZIZ.LJIIJ();
        }
    }
}
