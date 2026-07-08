package X;

import com.bytedance.crash.jni.NativeBridge;

/* JADX INFO: renamed from: X.0Vf6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C803220Vf6 implements InterfaceC803370VfL {
    public final long LIZ;

    @Override // X.InterfaceC803370VfL
    public final void flush() {
        NativeBridge.LJJLIIIJILLIZJL(this.LIZ);
    }

    @Override // X.InterfaceC803370VfL
    public final void release() {
        NativeBridge.LJJLIIIJJI(this.LIZ);
    }

    public C803220Vf6(long j) {
        this.LIZ = j;
    }

    @Override // X.InterfaceC803370VfL
    public final void LIZ(String str) {
        NativeBridge.LJJLIIIJ(str.length(), this.LIZ, str);
    }

    @Override // X.InterfaceC803370VfL
    public final void LIZIZ(int i) {
        LIZ(Integer.toString(i));
    }

    @Override // X.InterfaceC803370VfL
    public final void LIZJ(long j) {
        LIZ(Long.toString(j));
    }

    @Override // X.InterfaceC803370VfL
    public final void LIZLLL(char[] cArr, int i) {
        NativeBridge.LJJLIIIIJ(this.LIZ, cArr, i);
    }
}
