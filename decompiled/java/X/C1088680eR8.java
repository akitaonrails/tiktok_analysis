package X;

import Y.ARunnableS50S0300000_17;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import avg.f;
import com.bytedance.android.livesdk.rank.api.OpenAudienceRankingEvent;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import mf.a;

/* JADX INFO: renamed from: X.0eR8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class C1088680eR8 extends C2217421BqW implements Function0<Unit> {
    public C1088680eR8(C1088730eRD c1088730eRD) {
        super(0, c1088730eRD, C1088730eRD.class, "activate", "activate()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ViewGroup viewGroupLLLLLLL;
        View viewLJJJJLI;
        C1088730eRD c1088730eRD = (C1088730eRD) this.receiver;
        InterfaceC1088670eR7 interfaceC1088670eR7 = c1088730eRD.LIZIZ;
        if (interfaceC1088670eR7 == null || (viewGroupLLLLLLL = interfaceC1088670eR7.LLLLLLL()) == null || interfaceC1088670eR7.LJJJJLI() == null) {
            c1088730eRD.LIZ(1);
        } else {
            C1088660eR6 c1088660eR6 = c1088730eRD.LJ;
            if (c1088660eR6 != null) {
                c1088660eR6.LIZ(true);
            }
            c1088730eRD.LJ = null;
            C1088660eR6 c1088660eR62 = new C1088660eR6(viewGroupLLLLLLL.getContext());
            c1088730eRD.LJ = c1088660eR62;
            if (viewGroupLLLLLLL instanceof ConstraintLayout) {
                C19ME c19me = new C19ME(-2, -2);
                int id = 0;
                c19me.topToTop = 0;
                c19me.bottomToBottom = 0;
                InterfaceC1088670eR7 interfaceC1088670eR72 = c1088730eRD.LIZIZ;
                if (interfaceC1088670eR72 != null && (viewLJJJJLI = interfaceC1088670eR72.LJJJJLI()) != null) {
                    id = viewLJJJJLI.getId();
                }
                c19me.endToEnd = id;
                viewGroupLLLLLLL.addView(c1088660eR62, c19me);
                C1088660eR6 c1088660eR63 = c1088730eRD.LJ;
                if (c1088660eR63 != null) {
                    View.OnClickListener fVar = new View.OnClickListener() { // from class: X.0eR9
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DataChannelGlobal.LLILZ.GQ2(OpenAudienceRankingEvent.class);
                        }
                    };
                    if (C1848410yCV.LIZ) {
                        fVar = new f(fVar);
                    }
                    a aVar = new a(fVar);
                    if (C2213981Bky.LIZIZ.isOffline()) {
                        C2211941Bhg.LIZ.injectViewListener(c1088660eR63);
                    }
                    c1088660eR63.setOnClickListener(aVar);
                }
            }
            HandlerHook.viewPost(c1088660eR62, new ARunnableS50S0300000_17(c1088730eRD, c1088660eR62, interfaceC1088670eR7, 17));
        }
        return Unit.LIZ;
    }
}
