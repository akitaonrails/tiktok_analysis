package X;

import com.ss.android.vesdk.VECameraSettings;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS37S0010000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import njp.a;

/* JADX INFO: renamed from: X.0t1W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.hdr.HDRCameraComponent$updateSettingsAndReopenCamera$1", f = "HDRCameraComponent.kt", l = {170}, m = "invokeSuspend")
public final class C1649400t1W extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1660560tJW LL;
    public int LLILLJJLI;
    public final /* synthetic */ C1649390t1V LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1649400t1W(C1649390t1V c1649390t1V, boolean z, long j, InterfaceC1364105Vn<? super C1649400t1W> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1649390t1V;
        this.LLILZ = z;
        this.LLILZIL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1649400t1W(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1660560tJW c1660560tJWDq2;
        C1C7U.LIZ("HDRCameraComponent@3e9c.updateSettingsAndReopenCamera$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                c1660560tJWDq2 = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LLILLL.getCameraApiComponent().QN2(this.LLILZ);
            C1649390t1V c1649390t1V = this.LLILLL;
            c1649390t1V.LLJJIII = true;
            c1660560tJWDq2 = c1649390t1V.getCameraApiComponent().dq2();
            EnumC1448590nnd enumC1448590nndLIZLLL = C1660530tJT.LIZLLL(c1660560tJWDq2.LIZ);
            C1649390t1V c1649390t1V2 = this.LLILLL;
            this.LL = c1660560tJWDq2;
            this.LLILLJJLI = 1;
            if (c1649390t1V2.d5(enumC1448590nndLIZLLL, this) == objLJFF) {
                C1C7U.LIZIZ("HDRCameraComponent@3e9c.updateSettingsAndReopenCamera$1");
                return objLJFF;
            }
        }
        this.LLILLL.F4(this.LLILZ);
        this.LLILLL.getCameraApiComponent().St2().getMediaController().h5(new AwS37S0010000_25(this.LLILZ, 5));
        InterfaceC2254081DKk interfaceC2254081DKkSt2 = this.LLILLL.getCameraApiComponent().St2();
        C1649390t1V c1649390t1V3 = this.LLILLL;
        Function1<VECameraSettings.Builder, Unit> function1Z4 = c1649390t1V3.Z4(c1649390t1V3.getCameraApiComponent().St2().getCameraController().B4(), this.LLILZ);
        final C1649390t1V c1649390t1V4 = this.LLILLL;
        final long j = this.LLILZIL;
        interfaceC2254081DKkSt2.sh(c1660560tJWDq2, function1Z4, new InterfaceC2253331DHn() { // from class: X.0t1X
            @Override // X.InterfaceC2253331DHn
            public final void LIZIZ(int i2) {
                InterfaceC1650620t3U interfaceC1650620t3UO4 = c1649390t1V4.O4();
                if (interfaceC1650620t3UO4 != null) {
                    interfaceC1650620t3UO4.No1();
                } else {
                    c1649390t1V4.No1();
                }
                List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
                C0LAB c0lab = new C0LAB();
                c0lab.LJ("type", "hdr_start_camera");
                c0lab.LIZIZ(System.currentTimeMillis() - j, "step3");
                C2341909Fp.LIZ("tool_performance_operation_cost_time", c0lab.LIZ);
                C1649390t1V c1649390t1V5 = c1649390t1V4;
                c1649390t1V5.i3(new AwS604S0100000_25(c1649390t1V5, 155));
            }

            @Override // X.InterfaceC2253331DHn
            public final void LIZ(int i2, int i3, String str) {
                InterfaceC1650620t3U interfaceC1650620t3UO4 = c1649390t1V4.O4();
                if (interfaceC1650620t3UO4 != null) {
                    interfaceC1650620t3UO4.No1();
                } else {
                    c1649390t1V4.No1();
                }
                C1649390t1V c1649390t1V5 = c1649390t1V4;
                c1649390t1V5.i3(new AwS604S0100000_25(c1649390t1V5, 154));
            }
        }, C1DPV.LIZIZ.LIZIZ(C1DPW.OPEN_CAMERA_SWITCH_FROM_NOW, null));
        this.LLILLL.ev1();
        this.LLILLL.getCameraApiComponent().getPreviewView();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("HDRCameraComponent@3e9c.updateSettingsAndReopenCamera$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
