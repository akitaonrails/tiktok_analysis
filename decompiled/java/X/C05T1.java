package X;

import com.google.android.gms.common.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05T1, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoPreviewImageToVideoButtonKt$TakoPreviewImageToVideoButton$1$1", f = "TakoPreviewImageToVideoButton.kt", l = {58, 59}, m = "invokeSuspend")
public final class C05T1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C1677480tko<Float, C1677280tkU> LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05T1(int i, C1677480tko c1677480tko, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = c1677480tko;
        this.LLILZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        boolean z = this.LLILLJJLI;
        return new C05T1(this.LLILZ, this.LLILLL, interfaceC1364105Vn, z);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoPreviewImageToVideoButtonKt@3468.TakoPreviewImageToVideoButton$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    int i2 = this.LLILZ + 1;
                    C1860520yW2.LIZ.getClass();
                    C1860520yW2.LJIIL().storeInt("tako_preview_i2v_shimmer_show_times", i2);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TakoPreviewImageToVideoButtonKt@3468.TakoPreviewImageToVideoButton$1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            if (this.LLILLJJLI) {
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(100L, this) == objLJFF) {
                    C1C7U.LIZIZ("TakoPreviewImageToVideoButtonKt@3468.TakoPreviewImageToVideoButton$1$1");
                    return objLJFF;
                }
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("TakoPreviewImageToVideoButtonKt@3468.TakoPreviewImageToVideoButton$1$1");
            return unit2;
        }
        C1677480tko<Float, C1677280tkU> c1677480tko = this.LLILLL;
        Float fLIZLLL = C2286608xc.LIZLLL(1.0f);
        C1677050tk7 c1677050tk7LIZLLL = C1671550tbF.LIZLLL(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, 0, C05Y0.LIZLLL, 2);
        this.LL = 2;
        if (C1677480tko.LIZJ(c1677480tko, fLIZLLL, c1677050tk7LIZLLL, null, null, this, 12) == objLJFF) {
            C1C7U.LIZIZ("TakoPreviewImageToVideoButtonKt@3468.TakoPreviewImageToVideoButton$1$1");
            return objLJFF;
        }
        int i22 = this.LLILZ + 1;
        C1860520yW2.LIZ.getClass();
        C1860520yW2.LJIIL().storeInt("tako_preview_i2v_shimmer_show_times", i22);
        Unit unit22 = Unit.LIZ;
        C1C7U.LIZIZ("TakoPreviewImageToVideoButtonKt@3468.TakoPreviewImageToVideoButton$1$1");
        return unit22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
