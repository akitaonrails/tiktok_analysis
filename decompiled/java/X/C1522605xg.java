package X;

import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.StrangerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05xg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.StrangerViewModel$updateConversationCache$1", f = "StrangerViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1522605xg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ StrangerViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1522605xg(StrangerViewModel strangerViewModel, InterfaceC1364105Vn<? super C1522605xg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = strangerViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1522605xg(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StrangerViewModel@74da.updateConversationCache$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC876950Yaj interfaceC876950YajLIZIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ);
        C0Y8T c0y8tLIZ = interfaceC876950YajLIZIZ.LIZ(this.LL.LL.getConversationId());
        if (c0y8tLIZ != null) {
            interfaceC876950YajLIZIZ.LJJIIZI(c0y8tLIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StrangerViewModel@74da.updateConversationCache$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
