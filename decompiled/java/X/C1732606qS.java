package X;

import Y.ACListenerS137S0100000_2;
import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.06qS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1732606qS extends RelativeLayout implements InterfaceC1732806qU, C06OA {
    public final /* synthetic */ C06ME LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public EnumC1651806dQ LLILZLL;
    public Function0<Unit> LLIZ;

    private final int getLayoutRes() {
        return R.layout.cfr;
    }

    @Override // X.C06OA
    public final void LLLZIL(C06MF c06mf) {
        this.LL.LLLZIL(c06mf);
    }

    @Override // X.C06OA
    public final void LLZLI() {
        this.LL.LLZLI();
    }

    @Override // X.C06OA
    public final void l(C06MF c06mf) {
        this.LL.l(c06mf);
    }

    private final View getIvClose() {
        return (View) this.LLILLL.getValue();
    }

    private final PrivacySettingsFeature getPrivacySettings() {
        return (PrivacySettingsFeature) this.LLILLJJLI.getValue();
    }

    private final C197039127h getTbButton() {
        return (C197039127h) this.LLILZIL.getValue();
    }

    private final TuxTextView getTvContent() {
        return (TuxTextView) this.LLILZ.getValue();
    }

    private final View getParentView() {
        Object parent = getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    public final void LIZIZ() {
        getPrivacySettings().LJFF("message_read_status", 1, C11S5.LIZ(), C1701940uOG.LIZIZ(), AFwS187S0000000_2.get$arr$(415), AFwS229S0000000_2.get$arr$(266), false);
    }

    public final void dismiss() {
        View parentView = getParentView();
        if (parentView != null) {
            C786410Ut5.LJLLLLLL(8, parentView);
        }
        LLZLI();
    }

    public final Function0<Unit> getOnDismissEventListener() {
        return this.LLIZ;
    }

    public final EnumC1651806dQ getStyle() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1732806qU
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        C1732706qT.onCreate(this);
    }

    @Override // X.InterfaceC1732806qU
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        C1732706qT.onDestroy(this);
    }

    @Override // X.InterfaceC1732806qU
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        C1732706qT.onPause(this);
    }

    @Override // X.InterfaceC1732806qU
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        C1732706qT.onResume(this);
    }

    @Override // X.InterfaceC1732806qU
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart() {
        C1732706qT.onStart(this);
    }

    @Override // X.InterfaceC1732806qU
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        C1732706qT.onStop(this);
    }

    public C1732606qS(Context context) {
        Lifecycle lifecycle;
        super(context, null, 0);
        this.LL = new C06ME();
        this.LLILLJJLI = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(805));
        this.LLILLL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 955));
        this.LLILZ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 957));
        this.LLILZIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 956));
        C786410Ut5.Sd(getLayoutRes(), C786410Ut5.ne(context), this);
        Object objLJIIIIZZ = SAFExtensionKt.LJIIIIZZ(context);
        if (objLJIIIIZZ != null) {
            C0R1H.LIZIZ((Fragment) objLJIIIIZZ, this);
        } else {
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
            if (c19egLIZIZ != null && (lifecycle = c19egLIZIZ.getLifecycle()) != null) {
                lifecycle.addObserver(this);
            }
        }
        C786410Ut5.I7(new ACListenerS137S0100000_2(this, 53), getIvClose());
        getTvContent().setMovementMethod(LinkMovementMethod.getInstance());
    }

    private final void setText(EnumC1651806dQ enumC1651806dQ) {
        String strJ4;
        String string = getContext().getString(2131848777);
        int i = C1652006dS.LIZ[enumC1651806dQ.ordinal()];
        int iIntValue = 0;
        if (i != 1) {
            if (i != 2) {
                return;
            } else {
                strJ4 = C786410Ut5.j4(getContext().getString(2131848776), Arrays.copyOf(new Object[]{string}, 1));
            }
        } else {
            strJ4 = C786410Ut5.j4(getContext().getString(2131848792), Arrays.copyOf(new Object[]{string}, 1));
        }
        int iLJJJ = a0.LJJJ(strJ4, string, 0, false, 6);
        int length = string.length() + iLJJJ;
        SpannableString spannableString = new SpannableString(strJ4);
        if (iLJJJ > 0 && length > 0) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            }
            C786410Ut5.p2(spannableString, new ForegroundColorSpan(iIntValue), iLJJJ, length, 33);
            C786410Ut5.p2(spannableString, new C1766806vy(this, enumC1651806dQ, 0), iLJJJ, length, 33);
        }
        getTvContent().setText(spannableString);
    }

    public final void LIZ(boolean z) {
        Function0<Unit> function0 = this.LLIZ;
        if (function0 != null) {
            function0.invoke();
        }
        C1651506dN.LIZJ(z);
    }

    public final void setOnDismissEventListener(Function0<Unit> function0) {
        this.LLIZ = function0;
    }

    public final void setStyle(EnumC1651806dQ enumC1651806dQ) {
        this.LLILZLL = enumC1651806dQ;
        if (enumC1651806dQ != null) {
            int i = C1652006dS.LIZ[enumC1651806dQ.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    C786410Ut5.LLLLLLJ(getTbButton(), 8);
                    setText(enumC1651806dQ);
                    return;
                }
                return;
            }
            C197039127h tbButton = getTbButton();
            C786410Ut5.LLLLLLJ(tbButton, 0);
            C786410Ut5.U8(tbButton, new ACListenerS137S0100000_2(this, 34));
            setText(enumC1651806dQ);
        }
    }
}
