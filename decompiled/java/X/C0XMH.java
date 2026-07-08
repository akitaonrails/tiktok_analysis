package X;

import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.OutputStream;

/* JADX INFO: renamed from: X.0XMH, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XMH implements TypedOutput {
    public final /* synthetic */ AbstractC842530X3j LIZ;

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public final String fileName() {
        return null;
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public final String md5Stub() {
        return null;
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public final long length() {
        try {
            return this.LIZ.LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return -1L;
        }
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public final String mimeType() {
        return this.LIZ.LIZIZ() != null ? this.LIZ.LIZIZ().LIZ : "";
    }

    public C0XMH(AbstractC842530X3j abstractC842530X3j) {
        this.LIZ = abstractC842530X3j;
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public final void writeTo(OutputStream outputStream) {
        C1496710p3F c1496710p3F = new C1496710p3F(C1496330p2d.LIZ(outputStream));
        this.LIZ.LJ(c1496710p3F);
        c1496710p3F.flush();
        c1496710p3F.close();
    }
}
