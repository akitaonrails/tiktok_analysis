package X;

import java.io.File;

/* JADX INFO: renamed from: X.01bL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C364901bL {
    public final File LIZ;
    public final String LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C364901bL() {
        this(null, 0 == true ? 1 : 0, 3);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SocialAvatarImageResource(file=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", imageCDNUrl=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C364901bL(File file, String str) {
        this.LIZ = file;
        this.LIZIZ = str;
    }

    public /* synthetic */ C364901bL(File file, String str, int i) {
        this((i & 1) != 0 ? null : file, (i & 2) != 0 ? null : str);
    }
}
