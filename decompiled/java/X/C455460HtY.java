package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HtY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.saas.host.impl.im.sticker.GroupChatStickerConsumerHelper$pause$1", f = "GroupChatStickerConsumerHelper.kt", l = {}, m = "invokeSuspend")
public final class C455460HtY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C705930RmZ LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C455460HtY(C705930RmZ c705930RmZ, InterfaceC1364105Vn<? super C455460HtY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c705930RmZ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C455460HtY(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC455470HtZ interfaceC455470HtZ;
        C1C7U.LIZ("GroupChatStickerConsumerHelper@5707.pause$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C705930RmZ c705930RmZ = this.LL;
        if (c705930RmZ != null && (interfaceC455470HtZ = c705930RmZ.LJIILLIIL) != null) {
            interfaceC455470HtZ.pause();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GroupChatStickerConsumerHelper@5707.pause$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
