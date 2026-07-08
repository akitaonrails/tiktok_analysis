package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NT0, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.utils.BillboardPCDisplayHelper$handleIMBanner$1", f = "BillboardPCDisplayHelper.kt", l = {199, 203}, m = "invokeSuspend")
public final class C0NT0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NT0(String str, String str2, String str3, boolean z, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NT0(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BillboardPCDisplayHelper@3037.handleIMBanner$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            if (this.LLILLJJLI) {
                C1729400v6Y c1729400v6Y = C1729400v6Y.LIZ;
                RootData rootData = new RootData(this.LLILLL, this.LLILZ, false, 28);
                String str = this.LLILZIL;
                this.LL = 1;
                if (c1729400v6Y.LIZJ(rootData, str, this) == objLJFF) {
                    C1C7U.LIZIZ("BillboardPCDisplayHelper@3037.handleIMBanner$1");
                    return objLJFF;
                }
            } else {
                C1729400v6Y c1729400v6Y2 = C1729400v6Y.LIZ;
                RootData rootData2 = new RootData(this.LLILLL, this.LLILZ, false, 28);
                this.LL = 2;
                if (c1729400v6Y2.LIZ(rootData2, this) == objLJFF) {
                    C1C7U.LIZIZ("BillboardPCDisplayHelper@3037.handleIMBanner$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BillboardPCDisplayHelper@3037.handleIMBanner$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
