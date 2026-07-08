package X;

import java.io.File;
import java.util.LinkedList;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0UNm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C771320UNm implements InterfaceC771310UNl {
    public boolean LIZ;
    public int LIZIZ;
    public int LIZJ;
    public long LIZLLL;
    public final LinkedList<File> LJ = new LinkedList<>();

    @Override // X.InterfaceC771310UNl
    public final int getPriority() {
        return 10;
    }

    @Override // X.InterfaceC771310UNl
    public final Map<String, String> execute() {
        for (File file : this.LJ) {
            if (C771340UNo.LIZJ()) {
                this.LJ.clear();
                return C2097608Jq.LJIIIIZZ(new Pair("deleteFileCount", String.valueOf(this.LIZIZ)), new Pair("deleteFileSize", String.valueOf(this.LIZLLL)));
            }
            this.LIZLLL += file.length();
            this.LIZIZ++;
            file.delete();
        }
        this.LJ.clear();
        return C2097608Jq.LJIIIIZZ(new Pair("deleteFileCount", String.valueOf(this.LIZIZ)), new Pair("deleteFileSize", String.valueOf(this.LIZLLL)));
    }

    @Override // X.InterfaceC771310UNl
    public final void LIZ(File file, boolean z) {
        if (z) {
            return;
        }
        if (file.isDirectory() && !this.LIZ) {
            return;
        }
        this.LIZJ++;
        this.LJ.add(0, file);
    }
}
