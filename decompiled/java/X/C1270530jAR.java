package X;

import android.media.MediaCodec;
import android.util.AndroidRuntimeException;
import com.ss.ttlivestreamer.core.transport.MP4Transport;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.0jAR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1270530jAR extends MP4Transport implements InterfaceC1270570jAV {
    @Override // com.ss.ttlivestreamer.core.transport.MP4Transport, com.ss.ttlivestreamer.core.transport.NativeTransport, com.ss.ttlivestreamer.core.engine.NativeObject
    public final synchronized void release() {
        super.release();
    }

    public C1270530jAR(boolean z, boolean z2) {
        super(z, z2);
    }

    public static final int LLIZ(int i, MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer) {
        throw new AndroidRuntimeException("Should not be here.");
    }
}
