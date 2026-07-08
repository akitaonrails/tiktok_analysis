package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Yj6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.ui.viewholder.VerticalShareListViewHolder$bind$2", f = "VerticalShareListViewHolder.kt", l = {}, m = "invokeSuspend")
public final class C882140Yj6 extends C09AX implements Function2<C595660NXw, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1363960lb8 LLILLJJLI;
    public final /* synthetic */ IMContact LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C882140Yj6(C1363960lb8 c1363960lb8, IMContact iMContact, InterfaceC1364105Vn<? super C882140Yj6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1363960lb8;
        this.LLILLL = iMContact;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C882140Yj6 c882140Yj6 = new C882140Yj6(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c882140Yj6.LL = obj;
        return c882140Yj6;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VerticalShareListViewHolder@2072.bind$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LLILLJJLI.P5(this.LLILLL, C896480ZEw.LIZIZ((C595660NXw) this.LL));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VerticalShareListViewHolder@2072.bind$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C595660NXw c595660NXw, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c595660NXw, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
