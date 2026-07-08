package X;

import com.lynx.tasm.LynxView;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0X82, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X82 implements InterfaceC1898907cB {
    public final WeakReference<C0X8D> LIZ;
    public final WeakReference<LynxView> LIZIZ;
    public final String LIZJ;
    public final byte[] LIZLLL;
    public final ByteBuffer LJ;
    public final boolean LJFF;
    public final String LJI;
    public final EnumC843700X7w LJII;
    public final long LJIIIIZZ;
    public final String LJIIIZ;
    public final C0X87 LJIIJ;

    public final int hashCode() {
        String str = this.LIZJ;
        int iHashCode = (((str != null ? str.hashCode() : 0) * 31) + C786410Ut5.Z2(this.LJFF)) * 31;
        String str2 = this.LJI;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.LJIIIIZZ)) * 31;
        String str3 = this.LJIIIZ;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "LynxSecurityVerificationEntity(securityTarget=" + this.LIZ + ", lynxView=" + this.LIZIZ + ", templateUrl=" + this.LIZJ + ", originTasm=" + Arrays.toString(this.LIZLLL) + ", originTasmBuffer=" + this.LJ + ", verified=" + this.LJFF + ", errorMsg=" + this.LJI + ", errorCode=" + this.LJII + ", signId=" + this.LJIIIIZZ + ", extraConfig=" + this.LJIIIZ + ", tasmType=" + this.LJIIJ + ')';
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.LJFF(C0X82.class, cls)) {
            return false;
        }
        if (obj != null) {
            C0X82 c0x82 = (C0X82) obj;
            if (!Intrinsics.LJFF(this.LIZJ, c0x82.LIZJ) || !Arrays.equals(this.LIZLLL, c0x82.LIZLLL) || this.LJFF != c0x82.LJFF || !Intrinsics.LJFF(this.LJI, c0x82.LJI) || this.LJIIIIZZ != c0x82.LJIIIIZZ) {
                return false;
            }
            return Intrinsics.LJFF(this.LJIIIZ, c0x82.LJIIIZ);
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bytedance.lynx.service.security.LynxSecurityVerificationEntity");
    }

    public C0X82(WeakReference<C0X8D> weakReference, WeakReference<LynxView> weakReference2, String str, byte[] bArr, ByteBuffer byteBuffer, boolean z, String str2, EnumC843700X7w enumC843700X7w, long j, String str3, C0X87 c0x87) {
        this.LIZ = weakReference;
        this.LIZIZ = weakReference2;
        this.LIZJ = str;
        this.LIZLLL = bArr;
        this.LJ = byteBuffer;
        this.LJFF = z;
        this.LJI = str2;
        this.LJII = enumC843700X7w;
        this.LJIIIIZZ = j;
        this.LJIIIZ = str3;
        this.LJIIJ = c0x87;
    }
}
