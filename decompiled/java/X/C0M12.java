package X;

import Y.AObserverS212S0100000_8;
import Y.ARunnableS77S0200000_8;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxPageViewModel;

/* JADX INFO: renamed from: X.0M12, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M12 implements C0M1L {
    public static final /* synthetic */ int LJ = 0;
    public DraftBoxPageViewModel LIZ;
    public TuxTextView LIZIZ;
    public long LIZJ;
    public TuxTextView LIZLLL;

    @Override // X.C0M1L
    public final void onDestroy() {
    }

    public final void LIZIZ(Long l) {
        Boolean boolValueOf;
        try {
            TuxTextView tuxTextView = this.LIZIZ;
            if (tuxTextView != null) {
                boolValueOf = Boolean.valueOf(HandlerHook.viewPost(tuxTextView, new ARunnableS77S0200000_8(this, l, 42)));
            } else {
                boolValueOf = null;
            }
            C189200o6.m2constructorimpl(boolValueOf);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // X.C0M1L
    public final void LIZ(View view, DraftBoxPageViewModel draftBoxPageViewModel, InterfaceC561590M0v interfaceC561590M0v) {
        TuxTextView tuxTextView;
        String string;
        Resources resources;
        Context context;
        C19EG c19egLIZIZ;
        DraftBoxPageViewModel draftBoxPageViewModel2;
        MutableLiveData<Long> mutableLiveData;
        if (view instanceof TuxTextView) {
            tuxTextView = (TuxTextView) view;
        } else {
            tuxTextView = null;
        }
        this.LIZIZ = tuxTextView;
        this.LIZ = draftBoxPageViewModel;
        if (tuxTextView != null && (context = tuxTextView.getContext()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null && (draftBoxPageViewModel2 = this.LIZ) != null && (mutableLiveData = draftBoxPageViewModel2.LLIZLLLIL) != null) {
            mutableLiveData.observe(c19egLIZIZ, new AObserverS212S0100000_8(this, 116));
        }
        TuxTextView tuxTextView2 = this.LIZLLL;
        if (tuxTextView2 != null) {
            if (view != null && (resources = view.getResources()) != null) {
                string = resources.getString(2131821839);
            } else {
                string = null;
            }
            tuxTextView2.setText(string);
        }
        LIZIZ(null);
    }
}
