package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinEmojiViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08Vc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinEmojiViewModel$onPrepared$1", f = "BulletinEmojiViewModel.kt", l = {}, m = "invokeSuspend")
public final class C2127408Vc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BulletinEmojiViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2127408Vc(BulletinEmojiViewModel bulletinEmojiViewModel, InterfaceC1364105Vn<? super C2127408Vc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = bulletinEmojiViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2127408Vc(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinEmojiViewModel@98a0.onPrepared$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.vQ2();
        this.LL.LLILZ.getValue();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinEmojiViewModel@98a0.onPrepared$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
