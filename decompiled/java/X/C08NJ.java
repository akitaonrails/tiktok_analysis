package X;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: X.08NJ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public class C08NJ extends IOException {
    public final File LL;
    public final File LLILLJJLI;
    public final String LLILLL;

    public final File getFile() {
        return this.LL;
    }

    public final File getOther() {
        return this.LLILLJJLI;
    }

    public final String getReason() {
        return this.LLILLL;
    }

    public C08NJ(File file, File file2, String str) {
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(" -> ");
            sbLIZ.append(file2);
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (str != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(": ");
            sbLIZ2.append(str);
            sb.append(C2188811AlT.LIZIZ(sbLIZ2));
        }
        super(sb.toString());
        this.LL = file;
        this.LLILLJJLI = file2;
        this.LLILLL = str;
    }

    public /* synthetic */ C08NJ(File file, File file2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i & 2) != 0 ? null : file2, (i & 4) != 0 ? null : str);
    }
}
