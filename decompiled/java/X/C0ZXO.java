package X;

import Y.AgS295S0100000_14;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.markdown.protocol.MarkdownMsgAssem;
import com.ss.android.ugc.aweme.im.messagelist.api.select.IMSelectTextAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZXO, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.smartreply.markdown.protocol.MarkdownMsgAssem$setupSelectTextObserver$1", f = "IMMarkdownMsgProtocol.kt", l = {372}, m = "invokeSuspend")
public final class C0ZXO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MarkdownMsgAssem<C0ZSC> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZXO(MarkdownMsgAssem<C0ZSC> markdownMsgAssem, InterfaceC1364105Vn<? super C0ZXO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = markdownMsgAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0ZXO(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C2252331DDr c2252331DDrHe2;
        C1C7U.LIZ("MarkdownMsgAssem@b08c.setupSelectTextObserver$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            IMSelectTextAbility iMSelectTextAbilityTp = this.LLILLJJLI.tp();
            if (iMSelectTextAbilityTp != null && (c2252331DDrHe2 = iMSelectTextAbilityTp.he2()) != null) {
                AgS295S0100000_14 agS295S0100000_14 = new AgS295S0100000_14(this.LLILLJJLI, 52);
                this.LL = 1;
                if (C2252331DDr.LJIIJ(c2252331DDrHe2, agS295S0100000_14, this) == objLJFF) {
                    C1C7U.LIZIZ("MarkdownMsgAssem@b08c.setupSelectTextObserver$1");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("MarkdownMsgAssem@b08c.setupSelectTextObserver$1");
                return unit;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
