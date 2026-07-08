package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinEmojiDetailListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06KK, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinEmojiDetailListViewModel$retry$2", f = "BulletinEmojiDetailListViewModel.kt", l = {}, m = "invokeSuspend")
public final class C06KK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BulletinEmojiDetailListViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06KK(BulletinEmojiDetailListViewModel bulletinEmojiDetailListViewModel, InterfaceC1364105Vn<? super C06KK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = bulletinEmojiDetailListViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06KK(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinEmojiDetailListViewModel@caf4.retry$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.manualListRefresh();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinEmojiDetailListViewModel@caf4.retry$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
