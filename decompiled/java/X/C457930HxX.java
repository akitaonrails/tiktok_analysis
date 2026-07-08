package X;

import Y.AgS287S0100000_6;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.publishpanel.BulletinPublishPanelKeyboardAssem;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HxX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.assem.publishpanel.BulletinPublishPanelKeyboardAssem$initSubscribe$1", f = "BulletinPublishPanelKeyboardAssem.kt", l = {BaseNotice.CREATOR}, m = "invokeSuspend")
public final class C457930HxX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BulletinPublishPanelKeyboardAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C457930HxX(BulletinPublishPanelKeyboardAssem bulletinPublishPanelKeyboardAssem, InterfaceC1364105Vn<? super C457930HxX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bulletinPublishPanelKeyboardAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C457930HxX(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinPublishPanelKeyboardAssem@65e9.initSubscribe$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AnonymousClass0951 anonymousClass0951 = this.LLILLJJLI.Jo().LLIZ;
            AgS287S0100000_6 agS287S0100000_6 = new AgS287S0100000_6(this.LLILLJJLI, 125);
            this.LL = 1;
            if (anonymousClass0951.collect(agS287S0100000_6, this) == objLJFF) {
                C1C7U.LIZIZ("BulletinPublishPanelKeyboardAssem@65e9.initSubscribe$1");
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
