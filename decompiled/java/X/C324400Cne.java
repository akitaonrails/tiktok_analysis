package X;

import android.view.View;
import com.bytedance.android.live.broadcast.api.ShowAiSummaryBoard;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.aisummary.AiSummarySmallImageStylePanelView;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cne, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.aisummary.AiSummarySmallImageStylePanelView$startObservingViewModel$1$1", f = "AiSummarySmallImageStylePanelView.kt", l = {296}, m = "invokeSuspend")
public final class C324400Cne extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AiSummarySmallImageStylePanelView LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C324400Cne(AiSummarySmallImageStylePanelView aiSummarySmallImageStylePanelView, InterfaceC1364105Vn<? super C324400Cne> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aiSummarySmallImageStylePanelView;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C324400Cne(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AiSummarySmallImageStylePanelView@6894.startObservingViewModel$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            final AiSummarySmallImageStylePanelView aiSummarySmallImageStylePanelView = this.LLILLJJLI;
            AnonymousClass0951 anonymousClass0951 = aiSummarySmallImageStylePanelView.LL.LLILLJJLI;
            InterfaceC346701Wf interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0xGg
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                    DataChannel dataChannelProvideDataChannel;
                    C1812670xGr c1812670xGr = (C1812670xGr) obj2;
                    AiSummarySmallImageStylePanelView aiSummarySmallImageStylePanelView2 = aiSummarySmallImageStylePanelView;
                    aiSummarySmallImageStylePanelView2.getClass();
                    int i2 = C1812610xGl.LIZ[c1812670xGr.LIZIZ.ordinal()];
                    if (i2 != 1) {
                        if (i2 != 2 && i2 != 3 && i2 != 4) {
                            throw new C1954807lC();
                        }
                        C1390410mHn c1390410mHn = aiSummarySmallImageStylePanelView2.LLIZ;
                        if (c1390410mHn != null) {
                            C500260Jjc.LJIILLIIL(c1390410mHn);
                        }
                        View view = aiSummarySmallImageStylePanelView2.LLIZLLLIL;
                        if (view != null) {
                            C500260Jjc.LLFFF(view);
                        }
                        AbstractC1812590xGj abstractC1812590xGj = c1812670xGr.LIZ;
                        if (abstractC1812590xGj instanceof C1812570xGh) {
                            aiSummarySmallImageStylePanelView2.I5(abstractC1812590xGj.LL);
                            if (aiSummarySmallImageStylePanelView2.LLJ != null) {
                                C0IP3 c0ip3LIZIZ = C475510Ikn.LIZIZ(((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getTopFragmentActivity());
                                if (c0ip3LIZIZ != null && (dataChannelProvideDataChannel = c0ip3LIZIZ.provideDataChannel()) != null) {
                                    dataChannelProvideDataChannel.zW(ShowAiSummaryBoard.class, Boolean.TRUE);
                                }
                                C1812570xGh c1812570xGh = aiSummarySmallImageStylePanelView2.LLILZLL;
                                if (c1812570xGh != null) {
                                    c1812570xGh.LLILZ = null;
                                    c1812570xGh.LLILLL = EnumC1812620xGm.SUCCESS;
                                    c1812570xGh.LLILLJJLI = abstractC1812590xGj.LL;
                                }
                            }
                        }
                    } else {
                        C1390410mHn c1390410mHn2 = aiSummarySmallImageStylePanelView2.LLIZ;
                        if (c1390410mHn2 != null) {
                            C500260Jjc.LLFFF(c1390410mHn2);
                        }
                        C1390410mHn c1390410mHn3 = aiSummarySmallImageStylePanelView2.LLIZ;
                        if (c1390410mHn3 != null) {
                            c1390410mHn3.LIZJ();
                        }
                        View view2 = aiSummarySmallImageStylePanelView2.LLIZLLLIL;
                        if (view2 != null) {
                            C500260Jjc.LJIILLIIL(view2);
                        }
                    }
                    AiSummarySmallImageStylePanelView aiSummarySmallImageStylePanelView3 = aiSummarySmallImageStylePanelView;
                    aiSummarySmallImageStylePanelView3.P5(aiSummarySmallImageStylePanelView3.LLILLJJLI, 0);
                    AiSummarySmallImageStylePanelView aiSummarySmallImageStylePanelView4 = aiSummarySmallImageStylePanelView;
                    aiSummarySmallImageStylePanelView4.P5(aiSummarySmallImageStylePanelView4.LLILLL, 1);
                    AiSummarySmallImageStylePanelView aiSummarySmallImageStylePanelView5 = aiSummarySmallImageStylePanelView;
                    aiSummarySmallImageStylePanelView5.P5(aiSummarySmallImageStylePanelView5.LLILZ, 2);
                    return Unit.LIZ;
                }
            };
            this.LL = 1;
            if (anonymousClass0951.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("AiSummarySmallImageStylePanelView@6894.startObservingViewModel$1$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
