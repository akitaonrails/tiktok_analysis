package X;

import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.draft.MessageDraftVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0I34, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.draft.MessageDraftVM$restoreMessageDraft$1", f = "MessageDraftVM.kt", l = {}, m = "invokeSuspend")
public final class C0I34 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractC879060Ye8 LL;
    public final /* synthetic */ MessageDraftVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0I34(AbstractC879060Ye8 abstractC879060Ye8, MessageDraftVM messageDraftVM, InterfaceC1364105Vn<? super C0I34> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = abstractC879060Ye8;
        this.LLILLJJLI = messageDraftVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0I34(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C869590Y9l c869590Y9lLIZ;
        boolean zLJJIIZI;
        C1C7U.LIZ("MessageDraftVM@6afd.restoreMessageDraft$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0I3B c0i3bLJII = this.LL.LJII();
        Long l = c0i3bLJII.quotedMessageId;
        if (l != null) {
            c869590Y9lLIZ = ((C0I39) this.LLILLJJLI.LLIZLLLIL.getValue()).LIZ(l.longValue());
        } else {
            c869590Y9lLIZ = null;
        }
        String str = c0i3bLJII.draftContent;
        if (str != null) {
            zLJJIIZI = a0.LJJIIZI(str, e3.g, false);
        } else {
            zLJJIIZI = false;
        }
        this.LLILLJJLI.LLILLJJLI.setValue(c0i3bLJII);
        this.LLILLJJLI.LLILZ.setValue(c869590Y9lLIZ);
        this.LLILLJJLI.LLILZLL.setValue(false);
        this.LLILLJJLI.LLJIJIL.setValue(Boolean.valueOf(zLJJIIZI));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageDraftVM@6afd.restoreMessageDraft$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
