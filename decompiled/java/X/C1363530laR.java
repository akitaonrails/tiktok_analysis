package X;

import Y.AgS170S0300000_21;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0laR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.ui.viewholder.SharePanelHeadViewHolder$bind$2", f = "SharePanelHeadViewHolder.kt", l = {378}, m = "invokeSuspend")
public final class C1363530laR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1363950lb7 LLILLL;
    public final /* synthetic */ IMContact LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1363530laR(C1363950lb7 c1363950lb7, IMContact iMContact, InterfaceC1364105Vn<? super C1363530laR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1363950lb7;
        this.LLILZ = iMContact;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1363530laR c1363530laR = new C1363530laR(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1363530laR.LLILLJJLI = obj;
        return c1363530laR;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SharePanelHeadViewHolder@4d07.bind$2");
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
            C1363950lb7 c1363950lb7 = this.LLILLL;
            C515901zh c515901zh = c1363950lb7.LLJZIJLIL;
            AgS170S0300000_21 agS170S0300000_21 = new AgS170S0300000_21(this.LLILZ, c1363950lb7, interfaceC497601wk, 0);
            this.LL = 1;
            if (c515901zh.collect(agS170S0300000_21, this) == objLJFF) {
                C1C7U.LIZIZ("SharePanelHeadViewHolder@4d07.bind$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SharePanelHeadViewHolder@4d07.bind$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
