package X;

import Y.ACListenerS138S0100000_3;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.publish.privacy.PostBtnConfigure;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: renamed from: X.1924, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class AnonymousClass1924 extends C193N<C05YF, C1275404yu, C07UI> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public static final int LLJILLL;
    public final InterfaceC1731706qJ LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;
    public final Function0<C1275404yu> LLJ;
    public final C07UI LLJI;
    public final InterfaceC1738600vLO LLJIJIL;
    public final C10J3 LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AnonymousClass1924.class, "permissionOptionApi", "getPermissionOptionApi()Lcom/ss/android/ugc/aweme/shortvideo/component/permission/PermissionOptionApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(AnonymousClass1924.class, "visibilityOptionPanelApi", "getVisibilityOptionPanelApi()Lcom/ss/android/ugc/aweme/shortvideo/component/privacy/v2/IVisibilityOptionPanelComponentApi;", 0);
        c09r3.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJILLL = 8;
    }

    @Override // X.C193N
    public AnonymousClass1931<?, C1275404yu, C07UI> F4() {
        final InterfaceC1445380niS interfaceC1445380niSP4 = P4();
        return new AnonymousClass1931<C1738630vLR, C1275404yu, C07UI>(interfaceC1445380niSP4) { // from class: X.0vLQ
            public final InterfaceC1445380niS LIZJ;

            {
                this.LIZJ = interfaceC1445380niSP4;
            }

            @Override // X.AnonymousClass1931
            public final AbstractC1738640vLS LJ(Context context, ViewGroup viewGroup) {
                Context context2 = viewGroup.getContext();
                FrameLayout frameLayout = new FrameLayout(context2);
                C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, -2));
                C197039127h c197039127h = new C197039127h(context2, null, 6, 0);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
                layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
                C786410Ut5.J6(c197039127h, layoutParams);
                c197039127h.setButtonSize(3);
                c197039127h.setButtonVariant(0);
                c197039127h.setButtonStartIcon(Integer.valueOf(R.raw.icon_post));
                c197039127h.setEnabled(false);
                c197039127h.setText(context2.getString(2131845588));
                frameLayout.addView(c197039127h);
                return new C1738630vLR(frameLayout, c197039127h);
            }

            @Override // X.AnonymousClass1931
            public final void LIZLLL(AbstractC1738640vLS abstractC1738640vLS, C193X c193x, C1664690tQB c1664690tQB, Object obj) {
                String string;
                C1738630vLR c1738630vLR = (C1738630vLR) abstractC1738640vLS;
                LIZ(c1664690tQB.LIZ(new C2217381BqS() { // from class: X.05mz
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj2) {
                        return Boolean.valueOf(((C1275404yu) obj2).LIZ);
                    }
                }), c1738630vLR, Lifecycle.State.STARTED, new AwS605S0100000_26(c1738630vLR, 419));
                C786410Ut5.U8(c1738630vLR.LL, new ACListenerS138S0100000_3((C07UI) obj, 13));
                PostBtnConfigure postBtnConfigureWj0 = this.LIZJ.Wj0();
                C197039127h c197039127h = c1738630vLR.LL;
                if (postBtnConfigureWj0 == null || (string = postBtnConfigureWj0.getBtnText()) == null || string.length() <= 0) {
                    string = c1738630vLR.itemView.getContext().getString(2131845588);
                }
                c197039127h.setText(string);
            }
        };
    }

    public final InterfaceC855150Xgf O4() {
        return (InterfaceC855150Xgf) this.LLIZ.getValue(this, LLJILJILJ[0]);
    }

    public final InterfaceC1445380niS P4() {
        return (InterfaceC1445380niS) this.LLIZLLLIL.getValue(this, LLJILJILJ[1]);
    }

    @Override // X.C193N, X.C193O
    public void Q3() {
        O4().JN2().LJIIIZ(this, Lifecycle.State.STARTED, new AwS611S0100000_32(this, 142));
    }

    @Override // X.C193N, X.C193O
    public /* bridge */ /* synthetic */ Object B3() {
        return this.LLJI;
    }

    @Override // X.C193N, X.C193O
    public InterfaceC1738600vLO E3() {
        return this.LLJIJIL;
    }

    @Override // X.C193N
    public C10J3 H4() {
        return this.LLJILJIL;
    }

    public C07UI K4() {
        return this.LLJI;
    }

    @Override // X.C193N, X.C193O, X.AbstractC1664470tPp
    public Function0<C1275404yu> o2() {
        return this.LLJ;
    }

    public AnonymousClass1924(C1DRG c1drg) {
        super(c1drg);
        this.LLIZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC855150Xgf.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1445380niS.class, null);
        this.LLJ = new AwS576S0100000_32(this, 302);
        this.LLJI = new C07UI(new AwS576S0100000_32(this, 301));
        this.LLJIJIL = EnumC214771193h.VISIBILITY_POST_BUTTON;
        this.LLJILJIL = C193D.LIZ;
    }
}
