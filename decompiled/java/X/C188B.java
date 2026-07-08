package X;

import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.tools.entry.anchor.AiChatSheetFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.188B, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.tools.entry.anchor.AiChatSheetFragment$quotaRefreshListener$1$onChanged$1", f = "AiChatSheetFragment.kt", l = {}, m = "invokeSuspend")
public final class C188B extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AiChatSheetFragment LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C188B(AiChatSheetFragment aiChatSheetFragment, int i, int i2, InterfaceC1364105Vn<? super C188B> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = aiChatSheetFragment;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C188B(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String string;
        boolean z;
        String currentContent;
        C1C7U.LIZ("AiChatSheetFragment@3bdc.quotaRefreshListener$1$onChanged$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AiChatSheetFragment aiChatSheetFragment = this.LL;
        aiChatSheetFragment.LLJI = this.LLILLJJLI;
        aiChatSheetFragment.LLJ = this.LLILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("refresh UI on quota changed, max: ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", remain: ");
        sbLIZ.append(this.LLILLL);
        C21290818Tq.LIZ("VisualPoetSheetFragment", C2188811AlT.LIZIZ(sbLIZ));
        this.LL.bS();
        AiChatSheetFragment aiChatSheetFragment2 = this.LL;
        C0MFG c0mfg = aiChatSheetFragment2.LLJILJILJ;
        if (c0mfg != null && (currentContent = c0mfg.getCurrentContent()) != null) {
            string = a0.LJLIIIL(currentContent).toString();
        } else {
            string = null;
        }
        boolean z2 = true;
        int i = 0;
        if (string != null && string.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        C197039127h c197039127h = aiChatSheetFragment2.LLJILJIL;
        if (c197039127h != null) {
            if (z || aiChatSheetFragment2.LLJ <= 0) {
                z2 = false;
            }
            c197039127h.setEnabled(z2);
        }
        AiChatSheetFragment aiChatSheetFragment3 = this.LL;
        TuxTextView tuxTextView = aiChatSheetFragment3.LLJILLL;
        if (tuxTextView != null) {
            if (aiChatSheetFragment3.LLJ > 0) {
                i = 8;
            }
            C786410Ut5.LLLLZLL(tuxTextView, i);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AiChatSheetFragment@3bdc.quotaRefreshListener$1$onChanged$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
