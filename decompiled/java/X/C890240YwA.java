package X;

import com.ss.android.ugc.aweme.im.chatlist.impl.feature.maf.ui.MafChatListWidgetV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YwA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.maf.ui.MafChatListWidgetV2$onRemove$1", f = "MafChatListWidgetV2.kt", l = {}, m = "invokeSuspend")
public final class C890240YwA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MafChatListWidgetV2 LL;
    public final /* synthetic */ C1261860iwS LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C890240YwA(MafChatListWidgetV2 mafChatListWidgetV2, C1261860iwS c1261860iwS, InterfaceC1364105Vn<? super C890240YwA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = mafChatListWidgetV2;
        this.LLILLJJLI = c1261860iwS;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C890240YwA(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MafChatListWidgetV2@1caf.onRemove$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.Ho(this.LLILLJJLI.getUid());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MafChatListWidgetV2@1caf.onRemove$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
