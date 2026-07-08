package X;

import Y.AObserverS212S0100000_8;
import Y.ARunnableS41S0300000_8;
import android.content.Context;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxPageViewModel;

/* JADX INFO: renamed from: X.0M0u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C561580M0u implements C0M1L {
    public C20515215Pi LIZ;
    public final C054G LIZIZ = C2296808zG.LIZ(C0PEM.LIZJ.plus(C23118094a.LIZ()));

    @Override // X.C0M1L
    public final void onDestroy() {
        C2296808zG.LIZJ(this.LIZIZ, null);
    }

    @Override // X.C0M1L
    public final void LIZ(View view, DraftBoxPageViewModel draftBoxPageViewModel, InterfaceC561590M0v interfaceC561590M0v) {
        Context context;
        C19EG c19egLIZIZ;
        if (view != null && (context = view.getContext()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            draftBoxPageViewModel.LLIZ.observe(c19egLIZIZ, new AObserverS212S0100000_8(this, 112));
            HandlerHook.viewPost(view, new ARunnableS41S0300000_8(this, c19egLIZIZ, interfaceC561590M0v, 13));
        }
    }
}
