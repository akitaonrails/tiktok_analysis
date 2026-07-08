package X;

import Y.ACListenerS155S0100000_21;
import Y.AObserverS224S0100000_21;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.zhiliaoapp.musically.R;
import irm.AkS89S0100000_21;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AwS135S1100000_21;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0mR0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class DialogC1396120mR0 extends DialogC1389100mFg {
    public final C19EG LLJILJIL;
    public final C1396140mR2 LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public boolean LLJJIJI;

    public final C1396150mR3 LJLI() {
        return (C1396150mR3) this.LLJJI.getValue();
    }

    public final C2385709Wl LJLIIIL() {
        return (C2385709Wl) this.LLJJ.getValue();
    }

    @Override // X.C19EK, androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return (Lifecycle) this.LLJILLL.getValue();
    }

    @Override // X.C19GU, X.C19EK, android.app.Dialog
    public final void onStop() {
        ((LifecycleRegistry) this.LLJILLL.getValue()).handleLifecycleEvent(Lifecycle.Event.ON_STOP);
        super.onStop();
    }

    @Override // X.C19GU, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        Window window = getWindow();
        KeyboardUtils.LIZIZ(window != null ? window.getCurrentFocus() : null);
        super.dismiss();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((LifecycleRegistry) this.LLJILLL.getValue()).handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        LJLIIIL().LJIIIIZZ.LIZIZ(null);
    }

    @Override // X.DialogC1389100mFg, X.C19GU, X.C19EK, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        ((LifecycleRegistry) this.LLJILLL.getValue()).handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        super.onCreate(bundle);
        setContentView(R.layout.v9);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.setLayout(-1, -1);
            window.setSoftInputMode(16);
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                attributes.windowAnimations = R.style.a_6;
            }
        }
        if (!C0CHQ.LIZ().getAccountService().isLogin()) {
            C786410Ut5.LJZL(0, (LinearLayout) findViewById(R.id.nu7));
            C786410Ut5.T7((TextView) findViewById(R.id.vb8), new ACListenerS155S0100000_21(this, 162));
            TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.okt);
            if (tuxIconView != null) {
                C786410Ut5.a9(tuxIconView, new ACListenerS155S0100000_21(this, 159));
            }
        } else {
            Window window2 = getWindow();
            if (window2 != null && Build.VERSION.SDK_INT >= 26) {
                window2.setNavigationBarColor(-16777216);
                C1360720lVu.LIZJ(window2, false);
            }
            TuxIconView tuxIconView2 = (TuxIconView) findViewById(R.id.okt);
            if (tuxIconView2 != null) {
                C786410Ut5.a9(tuxIconView2, new ACListenerS155S0100000_21(this, 160));
            }
            ((TextView) findViewById(R.id.u59)).setHint(2131840572);
            findViewById(R.id.u59).setOnKeyListener(new View.OnKeyListener() { // from class: X.0m9f
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                    if (i == 66) {
                        DialogC1396120mR0 dialogC1396120mR0 = this.LL;
                        C0DLI.LIZ(dialogC1396120mR0.LLJILJIL, dialogC1396120mR0.findViewById(R.id.u59));
                        return true;
                    }
                    return false;
                }
            });
            ((TextView) findViewById(R.id.u59)).addTextChangedListener(new C1402120mag(this, 13));
            C786410Ut5.P7((ImageButton) findViewById(R.id.e00), new ACListenerS155S0100000_21(this, 161));
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.o5x);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setAdapter(LJLI());
            final Context context = recyclerView.getContext();
            recyclerView.addOnScrollListener(new C1379050lzT(context) { // from class: X.0lk5
                @Override // X.C1379050lzT, X.AbstractC1585810rMx
                public final void LJJIIJ(RecyclerView recyclerView2, int i) {
                    View currentFocus;
                    super.LJJIIJ(recyclerView2, i);
                    if (i == 1) {
                        Window window3 = this.LLILLJJLI.getWindow();
                        if (window3 != null) {
                            currentFocus = window3.getCurrentFocus();
                        } else {
                            currentFocus = null;
                        }
                        KeyboardUtils.LIZIZ(currentFocus);
                    }
                }
            });
            LJLI().setShowFooter(true);
            LJLI().setLoadEmptyText("");
            LJLI().setLoadMoreListener(new AwS565S0100000_21(this, 1325));
            C786410Ut5.U8((C197039127h) findViewById(R.id.zri), new AkS89S0100000_21(this, 30));
            if (!this.LLJILJILJ.LIZ) {
                ((TextView) findViewById(R.id.zri)).setText(2131848035);
            }
            C1396130mR1 c1396130mR1 = (C1396130mR1) this.LLJJIII.getValue();
            c1396130mR1.LIZ.LJ();
            C786410Ut5.LLLZLZ(c1396130mR1.LIZ, 0);
            c1396130mR1.LJI.LIZ.observe(c1396130mR1.LJFF, new AObserverS224S0100000_21(c1396130mR1, 62));
            c1396130mR1.LJI.LIZJ.observe(c1396130mR1.LJFF, new AObserverS224S0100000_21(c1396130mR1, 63));
            C2385709Wl.LIZIZ(LJLIIIL(), false, AFwS231S0000000_3.get$arr$(155), 1);
            LJLIIIL().LIZ.observe(this, new AObserverS224S0100000_21(this, 64));
            LJLIIIL().LIZIZ.observe(this, new AObserverS224S0100000_21(this, 65));
            LJLIIIL().LIZJ.observe(this, new AObserverS224S0100000_21(this, 66));
        }
        findViewById(R.id.evu).getLayoutParams().height = C814420VxA.LIZIZ(C14KQ.LJ(getContext()) * 0.65f);
        findViewById(R.id.evu).requestLayout();
    }

    public DialogC1396120mR0(C19EG c19eg, AwS135S1100000_21 awS135S1100000_21) {
        super(c19eg, R.style.a_7);
        this.LLJILJIL = c19eg;
        C1396140mR2 c1396140mR2 = new C1396140mR2();
        this.LLJILJILJ = c1396140mR2;
        awS135S1100000_21.invoke(c1396140mR2);
        this.LLJILLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1326));
        this.LLJJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1067));
        this.LLJJI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1324));
        this.LLJJIII = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1327));
    }
}
