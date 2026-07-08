package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.Buffer;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.0pel, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1519970pel extends AbstractC1532350pyj<ByteBuffer> {
    @Override // X.AbstractC1532350pyj
    public final void LIZLLL() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1532350pyj
    public final Integer LIZJ() {
        return Integer.valueOf(((Buffer) this.LIZ).capacity());
    }

    public C1519970pel(ByteBuffer byteBuffer) {
        super(byteBuffer, ByteBuffer.class);
        if (byteBuffer.isDirect()) {
        } else {
            throw new IllegalArgumentException("directBuffer is not direct");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1532350pyj
    public final AbstractC1532350pyj<ByteBuffer> LIZ(C1532710pzJ c1532710pzJ) {
        Object obj;
        try {
            ByteBuffer byteBufferDuplicate = ((ByteBuffer) this.LIZ).duplicate();
            byteBufferDuplicate.position(0);
            C189200o6.m2constructorimpl(byteBufferDuplicate);
            obj = byteBufferDuplicate;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(obj);
        if (thM5exceptionOrNullimpl != null) {
            C1532760pzO.LIZIZ(C1532920pze.LIZJ, "ByteBuffer", "shallowCloneOrNull", "clone bytebuffer failed", thM5exceptionOrNullimpl, null, 32);
        }
        boolean zM7isFailureimpl = C189200o6.m7isFailureimpl(obj);
        Object obj2 = obj;
        if (zM7isFailureimpl) {
            obj2 = null;
        }
        ByteBuffer byteBuffer = (ByteBuffer) obj2;
        if (byteBuffer == null) {
            return null;
        }
        return new C1519970pel(byteBuffer);
    }
}
