package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.ByteBuffer;
import kotlin.jvm.functions.Function0;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.0Wxd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C840190Wxd extends C09AY implements Function0<String> {
    public final /* synthetic */ C840160Wxa LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C840190Wxd(C840160Wxa c840160Wxa) {
        super(0);
        this.LL = c840160Wxa;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        String str;
        C840200Wxe c840200Wxe = this.LL.LIZIZ;
        ByteBuffer byteBuffer = c840200Wxe.LIZLLL;
        if (byteBuffer != null) {
            try {
                byte[] bArr = new byte[c840200Wxe.LJ];
                byteBuffer.get(bArr);
                String str2 = new String(bArr, Charsets.UTF_8);
                C189200o6.m2constructorimpl(str2);
                str = str2;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C098200Yq c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
                str = c098200Yq;
            }
            if (!C189200o6.m7isFailureimpl(str)) {
                return str;
            }
        }
        return null;
    }
}
