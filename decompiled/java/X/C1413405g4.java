package X;

import com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinPageLoadStatusAssem;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinChannelAccessControl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05g4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinPageLoadStatusAssem$onAccessControlChanged$1", f = "BulletinPageLoadStatusAssem.kt", l = {}, m = "invokeSuspend")
public final class C1413405g4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BulletinPageLoadStatusAssem LL;
    public final /* synthetic */ BulletinChannelAccessControl LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1413405g4(BulletinPageLoadStatusAssem bulletinPageLoadStatusAssem, BulletinChannelAccessControl bulletinChannelAccessControl, InterfaceC1364105Vn<? super C1413405g4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = bulletinPageLoadStatusAssem;
        this.LLILLJJLI = bulletinChannelAccessControl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1413405g4(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinPageLoadStatusAssem@f9e.onAccessControlChanged$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C19EG c19egLIZ = C724240Sb0.LIZ(this.LL);
        if (c19egLIZ != null) {
            BulletinChannelAccessControl bulletinChannelAccessControl = this.LLILLJJLI;
            C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ);
            c1389890mGx.LJIIJ(bulletinChannelAccessControl.toastMsg);
            c1389890mGx.LIZ(true);
            c1389890mGx.LJIIJJI();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinPageLoadStatusAssem@f9e.onAccessControlChanged$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
