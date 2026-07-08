package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS29S1101000_26;
import njp.a;

/* JADX INFO: renamed from: X.0v6Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.utils.BillboardPCDisplayHelper$cancelBillboard$1", f = "BillboardPCDisplayHelper.kt", l = {82}, m = "invokeSuspend")
public final class C1729410v6Z extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ RootData LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1729410v6Z(RootData rootData, int i, String str, InterfaceC1364105Vn<? super C1729410v6Z> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = rootData;
        this.LLILZ = i;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1729410v6Z c1729410v6Z = new C1729410v6Z(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1729410v6Z.LLILLJJLI = obj;
        return c1729410v6Z;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("BillboardPCDisplayHelper@3037.cancelBillboard$1");
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C1729400v6Y c1729400v6Y = C1729400v6Y.LIZ;
            RootData rootData = this.LLILLL;
            C1730290v7z c1730290v7z = C1730290v7z.LIZ;
            int i2 = this.LLILZ;
            c1730290v7z.getClass();
            if (i2 == 0) {
                z = true;
            } else {
                z = false;
            }
            C1729480v6g c1729480v6g = new C1729480v6g(interfaceC497601wk, this.LLILZIL, this.LLILZ);
            AwS29S1101000_26 awS29S1101000_26 = new AwS29S1101000_26(interfaceC497601wk, this.LLILZIL, this.LLILZ, 1);
            this.LL = 1;
            if (c1729400v6Y.LIZIZ(rootData, z, c1729480v6g, awS29S1101000_26, this) == objLJFF) {
                C1C7U.LIZIZ("BillboardPCDisplayHelper@3037.cancelBillboard$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BillboardPCDisplayHelper@3037.cancelBillboard$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
