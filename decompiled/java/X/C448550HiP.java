package X;

import com.ss.android.ugc.aweme.ecommerce.search.vision.record.qrcode.VisualSearchQRCodeScanAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HiP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.vision.record.qrcode.VisualSearchQRCodeScanAssem$consumePictureQRCodeResult$1", f = "VisualSearchQRCodeScanAssem.kt", l = {1193}, m = "invokeSuspend")
public final class C448550HiP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ VisualSearchQRCodeScanAssem LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C448550HiP(VisualSearchQRCodeScanAssem visualSearchQRCodeScanAssem, String str, int i, String str2, InterfaceC1364105Vn<? super C448550HiP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = visualSearchQRCodeScanAssem;
        this.LLILLL = str;
        this.LLILZ = i;
        this.LLILZIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C448550HiP(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VisualSearchQRCodeScanAssem@571b.consumePictureQRCodeResult$1");
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
            VisualSearchQRCodeScanAssem visualSearchQRCodeScanAssem = this.LLILLJJLI;
            String str = this.LLILLL;
            int i2 = this.LLILZ;
            int i3 = VisualSearchQRCodeScanAssem.LLLFZ;
            this.LL = 1;
            obj = visualSearchQRCodeScanAssem.hp(i2, str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("VisualSearchQRCodeScanAssem@571b.consumePictureQRCodeResult$1");
                return objLJFF;
            }
        }
        VisualSearchQRCodeScanAssem visualSearchQRCodeScanAssem2 = this.LLILLJJLI;
        String str2 = this.LLILLL;
        String str3 = this.LLILZIL;
        int i4 = VisualSearchQRCodeScanAssem.LLLFZ;
        visualSearchQRCodeScanAssem2.sp(str2, str3, null);
        this.LLILLJJLI.cp(this.LLILLL, (C448660Hia) obj);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VisualSearchQRCodeScanAssem@571b.consumePictureQRCodeResult$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
