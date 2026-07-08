package X;

import com.bytedance.retrofit2.mime.DigestUtil;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: X.0XMG, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XMG implements TypedOutput {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ AbstractC842530X3j LIZIZ;

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public final long length() {
        try {
            return this.LIZIZ.LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return -1L;
        }
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public final String md5Stub() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            writeTo(byteArrayOutputStream);
            return DigestUtil.md5Hex(byteArrayOutputStream.toByteArray());
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public final String mimeType() {
        return this.LIZIZ.LIZIZ() != null ? this.LIZIZ.LIZIZ().LIZ : "";
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public final String fileName() {
        return this.LIZ;
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public final void writeTo(OutputStream outputStream) {
        C1496710p3F c1496710p3F = new C1496710p3F(C1496330p2d.LIZ(outputStream));
        this.LIZIZ.LJ(c1496710p3F);
        c1496710p3F.flush();
        c1496710p3F.close();
    }

    public C0XMG(String str, C842540X3k c842540X3k) {
        this.LIZ = str;
        this.LIZIZ = c842540X3k;
    }
}
