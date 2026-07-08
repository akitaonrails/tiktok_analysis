package X;

import com.ss.android.ugc.aweme.ecommerce.search.vision.record.qrcode.VisualSearchQRCodeScanAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HiQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.vision.record.qrcode.VisualSearchQRCodeScanAssem$bindAnchorView$1$1", f = "VisualSearchQRCodeScanAssem.kt", l = {393}, m = "invokeSuspend")
public final class C448560HiQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ VisualSearchQRCodeScanAssem LLILLJJLI;
    public final /* synthetic */ C448570HiR LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C448560HiQ(VisualSearchQRCodeScanAssem visualSearchQRCodeScanAssem, C448570HiR c448570HiR, String str, InterfaceC1364105Vn<? super C448560HiQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = visualSearchQRCodeScanAssem;
        this.LLILLL = c448570HiR;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C448560HiQ(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VisualSearchQRCodeScanAssem@571b.bindAnchorView$1$1");
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
            C448570HiR c448570HiR = this.LLILLL;
            String str = c448570HiR.LIZ;
            int i2 = c448570HiR.LJFF;
            int i3 = VisualSearchQRCodeScanAssem.LLLFZ;
            this.LL = 1;
            if (visualSearchQRCodeScanAssem.hp(i2, str, this) == objLJFF) {
                C1C7U.LIZIZ("VisualSearchQRCodeScanAssem@571b.bindAnchorView$1$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.op("search_visual_scan_it_tag", "click", this.LLILLL.LJ);
        VisualSearchQRCodeScanAssem visualSearchQRCodeScanAssem2 = this.LLILLJJLI;
        C448570HiR c448570HiR2 = this.LLILLL;
        visualSearchQRCodeScanAssem2.sp(c448570HiR2.LIZ, this.LLILZ, c448570HiR2.LJ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VisualSearchQRCodeScanAssem@571b.bindAnchorView$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
