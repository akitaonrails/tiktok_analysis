package X;

/* JADX INFO: renamed from: X.0pSp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public enum EnumC1512570pSp {
    CPU,
    GPU,
    DSP,
    NPU,
    Auto,
    METAL,
    OPENCL,
    OPENGL,
    VULKAN,
    CUDA,
    CoreML;

    public static EnumC1512570pSp valueOf(String str) {
        return (EnumC1512570pSp) C08FF.LIZ(EnumC1512570pSp.class, str);
    }
}
