package X;

import Y.AgS284S0100000_3;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinMediaViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08oQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinMediaViewModel$1", f = "BulletinMediaViewModel.kt", l = {137}, m = "invokeSuspend")
public final class C2229608oQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BulletinMediaViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2229608oQ(BulletinMediaViewModel bulletinMediaViewModel, InterfaceC1364105Vn<? super C2229608oQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bulletinMediaViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2229608oQ(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinMediaViewModel@c77a.<init>$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            BulletinMediaViewModel bulletinMediaViewModel = this.LLILLJJLI;
            C2252321DDq c2252321DDq = bulletinMediaViewModel.LLILLL.LJ;
            AgS284S0100000_3 agS284S0100000_3 = new AgS284S0100000_3(bulletinMediaViewModel, 7);
            this.LL = 1;
            if (c2252321DDq.collect(agS284S0100000_3, this) == objLJFF) {
                C1C7U.LIZIZ("BulletinMediaViewModel@c77a.<init>$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
