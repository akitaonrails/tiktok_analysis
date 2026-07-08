package X;

import com.ss.android.ugc.aweme.tablet.impl.business.login.QRCodeLoginViewModelV2;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.1ArX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tablet.impl.business.login.QRCodeLoginViewModelV2$checkStatusAgain$1", f = "QRCodeLoginViewModelV2.kt", l = {281}, m = "invokeSuspend")
public final class C2192571ArX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ QRCodeLoginViewModelV2 LLILLL;
    public final /* synthetic */ C05XL<Unit> LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2192571ArX(boolean z, QRCodeLoginViewModelV2 qRCodeLoginViewModelV2, C05XL<Unit> c05xl, String str, InterfaceC1364105Vn<? super C2192571ArX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = qRCodeLoginViewModelV2;
        this.LLILZ = c05xl;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2192571ArX(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long j;
        C1C7U.LIZ("QRCodeLoginViewModelV2@6a44.checkStatusAgain$1");
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
            if (this.LLILLJJLI) {
                j = 2000;
            } else {
                j = 1100;
            }
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("QRCodeLoginViewModelV2@6a44.checkStatusAgain$1");
                return objLJFF;
            }
        }
        QRCodeLoginViewModelV2 qRCodeLoginViewModelV2 = this.LLILLL;
        C05XL<Unit> c05xl = this.LLILZ;
        String str = this.LLILZIL;
        qRCodeLoginViewModelV2.getClass();
        C2199051B4t c2199051B4t = new C2199051B4t(c05xl, qRCodeLoginViewModelV2, str);
        this.LLILLL.yQ2(c2199051B4t);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str2 = this.LLILLL.LLJIJIL;
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("device_redirect_info", str2);
        QRCodeLoginViewModelV2 qRCodeLoginViewModelV22 = this.LLILLL;
        qRCodeLoginViewModelV22.zQ2(qRCodeLoginViewModelV22.LLJI, this.LLILZIL, linkedHashMap, c2199051B4t).LJIIIZ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("QRCodeLoginViewModelV2@6a44.checkStatusAgain$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
