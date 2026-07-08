package X;

import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fXo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.GiftServiceKt$getGiftTagInPublicScreenAsync$1", f = "GiftServiceKt.kt", l = {}, m = "invokeSuspend")
public final class C1131260fXo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ GiftMessage LL;
    public final /* synthetic */ DataChannel LLILLJJLI;
    public final /* synthetic */ Function1<List<? extends CharSequence>, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1131260fXo(GiftMessage giftMessage, DataChannel dataChannel, Function1<? super List<? extends CharSequence>, Unit> function1, InterfaceC1364105Vn<? super C1131260fXo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = giftMessage;
        this.LLILLJJLI = dataChannel;
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1131260fXo(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0117  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1131260fXo.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
