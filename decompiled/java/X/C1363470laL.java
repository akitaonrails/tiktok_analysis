package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0laL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.ui.viewholder.SharePanelHeadViewHolder$bindActivityStatus$1", f = "SharePanelHeadViewHolder.kt", l = {}, m = "invokeSuspend")
public final class C1363470laL extends C09AX implements Function2<C595660NXw, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1363950lb7 LLILLJJLI;
    public final /* synthetic */ IMContact LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1363470laL(C1363950lb7 c1363950lb7, IMContact iMContact, InterfaceC1364105Vn<? super C1363470laL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1363950lb7;
        this.LLILLL = iMContact;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1363470laL c1363470laL = new C1363470laL(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c1363470laL.LL = obj;
        return c1363470laL;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SharePanelHeadViewHolder@4d07.bindActivityStatus$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LLILLJJLI.T5(this.LLILLL, C896480ZEw.LIZIZ((C595660NXw) this.LL));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SharePanelHeadViewHolder@4d07.bindActivityStatus$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C595660NXw c595660NXw, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c595660NXw, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
