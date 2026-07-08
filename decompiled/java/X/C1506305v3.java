package X;

import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.suggestedreply.protocol.IMSuggestedReplyMsgAssem;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.IInputFieldAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05v3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.smartreply.suggestedreply.protocol.IMSuggestedReplyMsgAssem$generateTextView$3$1$1$1", f = "IMSuggestedReplyMsgProtocol.kt", l = {}, m = "invokeSuspend")
public final class C1506305v3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ IMSuggestedReplyMsgAssem LL;
    public final /* synthetic */ TuxTextView LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1506305v3(IMSuggestedReplyMsgAssem iMSuggestedReplyMsgAssem, TuxTextView tuxTextView, InterfaceC1364105Vn<? super C1506305v3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = iMSuggestedReplyMsgAssem;
        this.LLILLJJLI = tuxTextView;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1506305v3(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMSuggestedReplyMsgAssem@4d76.generateTextView$3$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IMSuggestedReplyMsgAssem iMSuggestedReplyMsgAssem = this.LL;
        IInputFieldAbility iInputFieldAbility = iMSuggestedReplyMsgAssem.LLJLLL;
        if (iInputFieldAbility == null) {
            synchronized (iMSuggestedReplyMsgAssem) {
                iInputFieldAbility = iMSuggestedReplyMsgAssem.LLJLLL;
                if (iInputFieldAbility == null) {
                    C0QSJ c0qsjOp = iMSuggestedReplyMsgAssem.op();
                    if (c0qsjOp != null) {
                        iInputFieldAbility = (IInputFieldAbility) c0qsjOp.getAbility(IInputFieldAbility.class);
                        C687700QyG.LJ(iInputFieldAbility, IInputFieldAbility.class);
                    } else {
                        iInputFieldAbility = null;
                    }
                    iMSuggestedReplyMsgAssem.LLJLLL = iInputFieldAbility;
                }
            }
        }
        iInputFieldAbility.J5(this.LLILLJJLI.getText());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMSuggestedReplyMsgAssem@4d76.generateTextView$3$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
