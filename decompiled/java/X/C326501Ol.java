package X;

import android.text.Spannable;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Ol, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.tray.view.RightTagViewUtils$loadImageInRightTagSuspend$2", f = "RightTagViewUtils.kt", l = {}, m = "invokeSuspend")
public final class C326501Ol extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Spannable>, Object> {
    public final /* synthetic */ GiftMessage LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C326501Ol(GiftMessage giftMessage, InterfaceC1364105Vn<? super C326501Ol> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = giftMessage;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C326501Ol(this.LL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x007c  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C326501Ol.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Spannable> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
