package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinVoiceRecordViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08bm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinVoiceRecordViewModel$start$recorder$3$1", f = "BulletinVoiceRecordViewModel.kt", l = {}, m = "invokeSuspend")
public final class C2151208bm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BulletinVoiceRecordViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2151208bm(BulletinVoiceRecordViewModel bulletinVoiceRecordViewModel, InterfaceC1364105Vn<? super C2151208bm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = bulletinVoiceRecordViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2151208bm(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinVoiceRecordViewModel@b0e5.start$recorder$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.FQ2(EnumC194439115h.INITIAL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinVoiceRecordViewModel@b0e5.start$recorder$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
