package X;

import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS569S0100000_25;
import njp.a;

/* JADX INFO: renamed from: X.0tZ3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.ui.main.SocMediaPickerGridListKt$SocMediaPickerGridList$4", f = "SocMediaPickerGridList.kt", l = {108}, m = "invokeSuspend")
public final class C1670190tZ3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C05P0<Boolean> LLILLJJLI;
    public final /* synthetic */ C1690050u55 LLILLL;
    public final /* synthetic */ InterfaceC1665500tRU<SocMediaResource> LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ C259800zU<C1665510tRV<String>> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1670190tZ3(C05P0<Boolean> c05p0, C1690050u55 c1690050u55, InterfaceC1665500tRU<SocMediaResource> interfaceC1665500tRU, String str, C259800zU<C1665510tRV<String>> c259800zU, InterfaceC1364105Vn<? super C1670190tZ3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c05p0;
        this.LLILLL = c1690050u55;
        this.LLILZ = interfaceC1665500tRU;
        this.LLILZIL = str;
        this.LLILZLL = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1670190tZ3(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocMediaPickerGridListKt@a939.SocMediaPickerGridList$4");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            if (!this.LLILLJJLI.getValue().booleanValue()) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("SocMediaPickerGridListKt@a939.SocMediaPickerGridList$4");
                return unit;
            }
            C1698260uIK c1698260uIK = new C1698260uIK(C20028913Yh.LJIIIZ(new AwS569S0100000_25(this.LLILLL, 370)), this.LLILZ, 4);
            C1670210tZ5 c1670210tZ5 = new C1670210tZ5(this.LLILZIL, this.LLILZLL, this.LLILLL, this.LLILLJJLI);
            this.LL = 1;
            if (c1698260uIK.collect(c1670210tZ5, this) == objLJFF) {
                C1C7U.LIZIZ("SocMediaPickerGridListKt@a939.SocMediaPickerGridList$4");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SocMediaPickerGridListKt@a939.SocMediaPickerGridList$4");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
