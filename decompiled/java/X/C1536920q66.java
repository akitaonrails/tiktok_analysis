package X;

import com.lynx.tasm.TemplateBundle;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.0q66, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1536920q66 {
    public final C1533790q13 LIZ;
    public final C1532310pyf LIZIZ;
    public final byte[] LIZJ;
    public final ByteBuffer LIZLLL;
    public TemplateBundle LJ;

    public C1536920q66(C1533790q13 c1533790q13, C1532310pyf c1532310pyf, byte[] bArr, ByteBuffer byteBuffer, TemplateBundle templateBundle, int i) {
        c1533790q13 = (i & 2) != 0 ? null : c1533790q13;
        c1532310pyf = (i & 4) != 0 ? null : c1532310pyf;
        bArr = (i & 8) != 0 ? null : bArr;
        byteBuffer = (i & 16) != 0 ? null : byteBuffer;
        int i2 = i & 32;
        templateBundle = (i & 128) != 0 ? null : templateBundle;
        int i3 = i & 256;
        int i4 = i & 1024;
        this.LIZ = c1533790q13;
        this.LIZIZ = c1532310pyf;
        this.LIZJ = bArr;
        this.LIZLLL = byteBuffer;
        this.LJ = templateBundle;
    }
}
