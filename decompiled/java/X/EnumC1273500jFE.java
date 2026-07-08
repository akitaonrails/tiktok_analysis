package X;

import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.opengl.YuvHelper;
import java.nio.ByteBuffer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0jFE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class EnumC1273500jFE {
    public static final C1273480jFC LL;
    public static final C1273490jFD LLILLJJLI;
    public static final /* synthetic */ EnumC1273500jFE[] LLILLL;

    public EnumC1273500jFE() {
        throw null;
    }

    public abstract void LIZJ(ByteBuffer byteBuffer, VideoFrame.Buffer buffer);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0jFD] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0jFC] */
    static {
        ?? r3 = new EnumC1273500jFE() { // from class: X.0jFC
            @Override // X.EnumC1273500jFE
            public final void LIZJ(ByteBuffer byteBuffer, VideoFrame.Buffer buffer) {
                VideoFrame.I420Buffer i420 = buffer.toI420();
                YuvHelper.I420Copy(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), byteBuffer, i420.getWidth(), i420.getHeight());
                i420.release();
            }
        };
        LL = r3;
        ?? r2 = new EnumC1273500jFE() { // from class: X.0jFD
            @Override // X.EnumC1273500jFE
            public final void LIZJ(ByteBuffer byteBuffer, VideoFrame.Buffer buffer) {
                VideoFrame.I420Buffer i420 = buffer.toI420();
                YuvHelper.I420ToNV12(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), byteBuffer, i420.getWidth(), i420.getHeight());
                i420.release();
            }
        };
        LLILLJJLI = r2;
        LLILLL = new EnumC1273500jFE[]{r3, r2};
    }

    public static EnumC1273500jFE[] values() {
        return (EnumC1273500jFE[]) LLILLL.clone();
    }

    public static EnumC1273500jFE valueOf(String str) {
        return (EnumC1273500jFE) C08FF.LIZ(EnumC1273500jFE.class, str);
    }

    public EnumC1273500jFE(String str, int i) {
    }
}
