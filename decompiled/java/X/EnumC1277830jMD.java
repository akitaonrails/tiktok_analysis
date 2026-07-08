package X;

import com.ss.pusher.core.buffer.VideoFrame;
import com.ss.pusher.core.opengl.YuvHelper;
import java.nio.ByteBuffer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0jMD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class EnumC1277830jMD {
    public static final C1277810jMB LL;
    public static final C1277820jMC LLILLJJLI;
    public static final /* synthetic */ EnumC1277830jMD[] LLILLL;

    public EnumC1277830jMD() {
        throw null;
    }

    public abstract void LIZJ(ByteBuffer byteBuffer, VideoFrame.Buffer buffer);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0jMC] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0jMB] */
    static {
        ?? r3 = new EnumC1277830jMD() { // from class: X.0jMB
            @Override // X.EnumC1277830jMD
            public final void LIZJ(ByteBuffer byteBuffer, VideoFrame.Buffer buffer) {
                VideoFrame.I420Buffer i420 = buffer.toI420();
                YuvHelper.LIZ(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), byteBuffer, i420.getWidth(), i420.getHeight());
                i420.release();
            }
        };
        LL = r3;
        ?? r2 = new EnumC1277830jMD() { // from class: X.0jMC
            @Override // X.EnumC1277830jMD
            public final void LIZJ(ByteBuffer byteBuffer, VideoFrame.Buffer buffer) {
                VideoFrame.I420Buffer i420 = buffer.toI420();
                YuvHelper.LIZIZ(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), byteBuffer, i420.getWidth(), i420.getHeight());
                i420.release();
            }
        };
        LLILLJJLI = r2;
        LLILLL = new EnumC1277830jMD[]{r3, r2};
    }

    public static EnumC1277830jMD[] values() {
        return (EnumC1277830jMD[]) LLILLL.clone();
    }

    public static EnumC1277830jMD valueOf(String str) {
        return (EnumC1277830jMD) C08FF.LIZ(EnumC1277830jMD.class, str);
    }

    public EnumC1277830jMD(String str, int i) {
    }
}
