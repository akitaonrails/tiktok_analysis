package X;

import com.ss.android.ugc.aweme.commercialize.ucp.api.model.PdpSupplementData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0D0g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.PdpProductLoader$init$1", f = "PdpProductLoader.kt", l = {35}, m = "invokeSuspend")
public final class C332120D0g extends C09AX implements Function1<InterfaceC1364105Vn<? super C189200o6<? extends C0D3K>>, Object> {
    public int LL;
    public final /* synthetic */ C332130D0h LLILLJJLI;
    public final /* synthetic */ C332690D2l LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ PdpSupplementData LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C332120D0g(C332130D0h c332130D0h, C332690D2l c332690D2l, String str, PdpSupplementData pdpSupplementData, InterfaceC1364105Vn<? super C332120D0g> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c332130D0h;
        this.LLILLL = c332690D2l;
        this.LLILZ = str;
        this.LLILZIL = pdpSupplementData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C332120D0g(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super C189200o6<? extends C0D3K>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objLJFF;
        C1C7U.LIZ("PdpProductLoader@2309.init$1");
        Object objLJFF2 = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objLJFF = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            if (Intrinsics.LJFF(C332170D0l.LIZIZ(), "pdp_failed")) {
                objLJFF = new C098200Yq(new Exception("recommend debug forced pdp failure"));
                C189200o6.m2constructorimpl(objLJFF);
            } else {
                C331730CzT c331730CzT = this.LLILLJJLI.LIZ;
                C332690D2l c332690D2l = this.LLILLL;
                String str = c332690D2l.productId;
                String str2 = this.LLILZ;
                PdpSupplementData pdpSupplementData = this.LLILZIL;
                int i2 = c332690D2l.protocolType;
                this.LL = 1;
                objLJFF = c331730CzT.LJFF(str, str2, pdpSupplementData, i2, this);
                if (objLJFF == objLJFF2) {
                    C1C7U.LIZIZ("PdpProductLoader@2309.init$1");
                    return objLJFF2;
                }
            }
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLJFF);
        C1C7U.LIZIZ("PdpProductLoader@2309.init$1");
        return c189200o6M1boximpl;
    }
}
