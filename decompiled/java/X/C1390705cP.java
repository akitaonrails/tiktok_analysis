package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05cP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.common.toolbar.ProgressUIKt$infiniteRotate$1$1$1", f = "ProgressUI.kt", l = {134, 139}, m = "invokeSuspend")
public final class C1390705cP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ EnumC1669110tXJ LLILLL;
    public final /* synthetic */ C1677480tko<Float, C1677280tkU> LLILZ;
    public final /* synthetic */ C1677040tk6<Float> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1390705cP(boolean z, EnumC1669110tXJ enumC1669110tXJ, C1677480tko<Float, C1677280tkU> c1677480tko, C1677040tk6<Float> c1677040tk6, InterfaceC1364105Vn<? super C1390705cP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = enumC1669110tXJ;
        this.LLILZ = c1677480tko;
        this.LLILZIL = c1677040tk6;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1390705cP(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        float f;
        C1C7U.LIZ("ProgressUIKt@6768.infiniteRotate$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1 || i == 2) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            if (this.LLILLJJLI) {
                if (this.LLILLL == EnumC1669110tXJ.Clockwise) {
                    f = 360.0f;
                } else {
                    f = -360.0f;
                }
                C1677480tko<Float, C1677280tkU> c1677480tko = this.LLILZ;
                Float fLIZLLL = C2286608xc.LIZLLL(f);
                C1677040tk6<Float> c1677040tk6 = this.LLILZIL;
                this.LL = 1;
                if (C1677480tko.LIZJ(c1677480tko, fLIZLLL, c1677040tk6, null, null, this, 12) == objLJFF) {
                    C1C7U.LIZIZ("ProgressUIKt@6768.infiniteRotate$1$1$1");
                    return objLJFF;
                }
            } else {
                C1677480tko<Float, C1677280tkU> c1677480tko2 = this.LLILZ;
                this.LL = 2;
                if (c1677480tko2.LJI(this) == objLJFF) {
                    C1C7U.LIZIZ("ProgressUIKt@6768.infiniteRotate$1$1$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProgressUIKt@6768.infiniteRotate$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
