package X;

import android.os.Bundle;
import android.util.AndroidRuntimeException;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.engine.VideoSink;
import com.ss.ttlivestreamer.core.utils.AVLog;
import java.nio.ByteBuffer;
import javax.microedition.khronos.egl.EGLContext;

/* JADX INFO: renamed from: X.0jCs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1272040jCs extends VideoSink {
    public C0UHD LL;
    public EGLContext LLILLJJLI;
    public ByteBuffer LLILLL;
    public ByteBuffer LLILZ;
    public final C1272050jCt LLILZIL = new C1272050jCt();

    @Override // com.ss.ttlivestreamer.core.engine.VideoSink
    public final void OnDiscardedFrame() {
    }

    public final ByteBuffer LLIZ(VideoFrame videoFrame) {
        int parcel;
        VideoFrame.IExtraData extraData = videoFrame.getExtraData();
        if (extraData != null && (extraData.getExtraDataFlag() & 1) > 0) {
            ByteBuffer byteBuffer = this.LLILZ;
            if (byteBuffer == null) {
                int iPeekParcelSize = extraData.peekParcelSize();
                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(iPeekParcelSize);
                this.LLILZ = byteBufferAllocateDirect;
                parcel = extraData.readParcel(byteBufferAllocateDirect);
                if (parcel > iPeekParcelSize || parcel < 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Bug ");
                    sbLIZ.append(parcel);
                    sbLIZ.append(" VS ");
                    sbLIZ.append(iPeekParcelSize);
                    AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException(C2188811AlT.LIZIZ(sbLIZ));
                    C1274080jGA.LIZ.LIZ("TextureFrameAvailableSink.parseExtraData@1", androidRuntimeException);
                    if (C1274040jG6.LIZ()) {
                        throw androidRuntimeException;
                    }
                }
            } else {
                parcel = extraData.readParcel(byteBuffer);
                if (parcel < 0) {
                    int iPeekParcelSize2 = extraData.peekParcelSize();
                    if (this.LLILZ.capacity() > iPeekParcelSize2) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Read parcel error. extraBuffer ");
                        sbLIZ2.append(iPeekParcelSize2);
                        sbLIZ2.append(" VS ");
                        sbLIZ2.append(this.LLILZ.capacity());
                        AVLog.ioe("TextureFrameAvailableSink", C2188811AlT.LIZIZ(sbLIZ2));
                        return null;
                    }
                    ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(iPeekParcelSize2);
                    this.LLILZ = byteBufferAllocateDirect2;
                    parcel = extraData.readParcel(byteBufferAllocateDirect2);
                    if (parcel != iPeekParcelSize2) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("Bug ");
                        sbLIZ3.append(parcel);
                        sbLIZ3.append(" VS ");
                        sbLIZ3.append(iPeekParcelSize2);
                        AndroidRuntimeException androidRuntimeException2 = new AndroidRuntimeException(C2188811AlT.LIZIZ(sbLIZ3));
                        C1274080jGA.LIZ.LIZ("TextureFrameAvailableSink.parseExtraData@2", androidRuntimeException2);
                        if (C1274040jG6.LIZ()) {
                            throw androidRuntimeException2;
                        }
                    }
                }
            }
            if (parcel <= 0) {
                return null;
            }
            this.LLILZ.position(0);
            this.LLILZ.limit(parcel);
            return this.LLILZ.slice();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        if (r10.equals(r12) == true) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c5, code lost:
    
        if (r10 != null) goto L20;
     */
    @Override // com.ss.ttlivestreamer.core.engine.VideoSink
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onFrame(com.ss.ttlivestreamer.core.buffer.VideoFrame r28) {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1272040jCs.onFrame(com.ss.ttlivestreamer.core.buffer.VideoFrame):void");
    }

    @Override // com.ss.ttlivestreamer.core.engine.VideoSink, X.InterfaceC1269980j9Y
    public final void onData(VideoFrame videoFrame, Bundle bundle) {
        onFrame(videoFrame);
    }
}
