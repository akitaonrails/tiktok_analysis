package X;

import com.bytedance.android.livesdkapi.host.ILiveGameService;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/* JADX INFO: renamed from: X.0UeG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C777220UeG implements InterfaceC780000Uik {
    public C777260UeK LIZ;
    public C777260UeK LIZIZ;
    public C777260UeK LIZJ;
    public C776640UdK LIZLLL;

    @Override // X.InterfaceC780000Uik
    public final void LIZ() {
        C777260UeK c777260UeK = this.LIZ;
        if (c777260UeK == null) {
            c777260UeK = null;
        }
        c777260UeK.LIZ();
        C777260UeK c777260UeK2 = this.LIZIZ;
        if (c777260UeK2 == null) {
            c777260UeK2 = null;
        }
        EnumC777270UeL enumC777270UeL = c777260UeK2.LIZ;
        EnumC777270UeL enumC777270UeL2 = EnumC777270UeL.STARTED;
        if (enumC777270UeL != enumC777270UeL2) {
            c777260UeK2.LIZ = enumC777270UeL2;
            c777260UeK2.LIZJ = System.currentTimeMillis();
        }
        C777260UeK c777260UeK3 = this.LIZJ;
        (c777260UeK3 != null ? c777260UeK3 : null).LIZ();
        LJ();
        ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).XL0(3, "g_broadcast_float_status");
    }

    @Override // X.InterfaceC780000Uik
    public final void LIZJ() {
        C777260UeK c777260UeK = this.LIZ;
        if (c777260UeK == null) {
            c777260UeK = null;
        }
        c777260UeK.LIZ();
        C777260UeK c777260UeK2 = this.LIZIZ;
        if (c777260UeK2 == null) {
            c777260UeK2 = null;
        }
        c777260UeK2.LIZ();
        C777260UeK c777260UeK3 = this.LIZJ;
        C777260UeK c777260UeK4 = c777260UeK3 != null ? c777260UeK3 : null;
        EnumC777270UeL enumC777270UeL = c777260UeK4.LIZ;
        EnumC777270UeL enumC777270UeL2 = EnumC777270UeL.STARTED;
        if (enumC777270UeL != enumC777270UeL2) {
            c777260UeK4.LIZ = enumC777270UeL2;
            c777260UeK4.LIZJ = System.currentTimeMillis();
        }
        LJ();
        ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).XL0(5, "g_broadcast_float_status");
    }

    @Override // X.InterfaceC780000Uik
    public final void LIZLLL() {
        C777260UeK c777260UeK = this.LIZ;
        if (c777260UeK == null) {
            c777260UeK = null;
        }
        EnumC777270UeL enumC777270UeL = c777260UeK.LIZ;
        EnumC777270UeL enumC777270UeL2 = EnumC777270UeL.STARTED;
        if (enumC777270UeL != enumC777270UeL2) {
            c777260UeK.LIZ = enumC777270UeL2;
            c777260UeK.LIZJ = System.currentTimeMillis();
        }
        C777260UeK c777260UeK2 = this.LIZIZ;
        if (c777260UeK2 == null) {
            c777260UeK2 = null;
        }
        c777260UeK2.LIZ();
        C777260UeK c777260UeK3 = this.LIZJ;
        (c777260UeK3 != null ? c777260UeK3 : null).LIZ();
        LJ();
        ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).XL0(4, "g_broadcast_float_status");
    }

    public final void LJ() {
        C776640UdK c776640UdK = this.LIZLLL;
        if (c776640UdK != null) {
            C777260UeK c777260UeK = this.LIZ;
            if (c777260UeK == null) {
                c777260UeK = null;
            }
            long j = c777260UeK.LIZIZ;
            c776640UdK.LIZIZ = j;
            C777260UeK c777260UeK2 = this.LIZIZ;
            if (c777260UeK2 == null) {
                c777260UeK2 = null;
            }
            long j2 = c777260UeK2.LIZIZ;
            c776640UdK.LIZLLL = j2;
            C777260UeK c777260UeK3 = this.LIZJ;
            long j3 = (c777260UeK3 != null ? c777260UeK3 : null).LIZIZ;
            c776640UdK.LJFF = j3;
            long j4 = j2 + j + j3;
            c776640UdK.LIZ = j4;
            if (j4 > 0) {
                c776640UdK.LIZJ = LJFF(j / j4);
                c776640UdK.LJ = LJFF(c776640UdK.LIZLLL / c776640UdK.LIZ);
                LJFF(c776640UdK.LJFF / c776640UdK.LIZ);
            }
            C20441214yg.LIZIZ("GameUiTimeLogger", c776640UdK.toString());
        }
    }

    @Override // X.InterfaceC780000Uik
    public final void LJJJIL() {
        C777260UeK c777260UeK = this.LIZ;
        if (c777260UeK == null) {
            c777260UeK = null;
        }
        c777260UeK.LIZ();
        C777260UeK c777260UeK2 = this.LIZIZ;
        if (c777260UeK2 == null) {
            c777260UeK2 = null;
        }
        c777260UeK2.LIZ();
        C777260UeK c777260UeK3 = this.LIZJ;
        (c777260UeK3 != null ? c777260UeK3 : null).LIZ();
        LJ();
        ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).XL0(2, "g_broadcast_float_status");
    }

    @Override // X.InterfaceC780000Uik
    public final void LLLFF() {
        ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).XL0(6, "g_broadcast_float_status");
    }

    @Override // X.InterfaceC780000Uik
    public final void onInit() {
        this.LIZJ = new C777260UeK();
        this.LIZ = new C777260UeK();
        this.LIZIZ = new C777260UeK();
        this.LIZLLL = new C776640UdK();
        ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).XL0(1, "g_broadcast_float_status");
    }

    @Override // X.InterfaceC780000Uik
    public final void LIZIZ() {
        LJ();
        C777260UeK c777260UeK = this.LIZ;
        if (c777260UeK == null) {
            c777260UeK = null;
        }
        c777260UeK.getClass();
        EnumC777270UeL enumC777270UeL = EnumC777270UeL.RESET;
        c777260UeK.LIZ = enumC777270UeL;
        c777260UeK.LIZIZ = 0L;
        c777260UeK.LIZJ = 0L;
        C777260UeK c777260UeK2 = this.LIZIZ;
        if (c777260UeK2 == null) {
            c777260UeK2 = null;
        }
        c777260UeK2.getClass();
        c777260UeK2.LIZ = enumC777270UeL;
        c777260UeK2.LIZIZ = 0L;
        c777260UeK2.LIZJ = 0L;
        C777260UeK c777260UeK3 = this.LIZJ;
        C777260UeK c777260UeK4 = c777260UeK3 != null ? c777260UeK3 : null;
        c777260UeK4.getClass();
        c777260UeK4.LIZ = enumC777270UeL;
        c777260UeK4.LIZIZ = 0L;
        c777260UeK4.LIZJ = 0L;
        ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).XL0(7, "g_broadcast_float_status");
    }

    public static float LJFF(float f) {
        try {
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
            return CastFloatProtector.parseFloat(decimalFormat.format(Float.valueOf(f)));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return 0.0f;
        }
    }
}
