package X;

import Y.ACListenerS151S0100000_16;
import Y.ARunnableS106S0100000_6;
import Y.ARunnableS116S0100000_16;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.ugc.aweme.commercialize.search.ISearchAdEventLogger;
import com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0cPt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1011030cPt extends AbstractC1010710cPN<C990480bsk> {
    public final int LLILZLL;
    public final int LLIZ;
    public boolean LLIZLLLIL;
    public IVideoPlayTaskManager LLJ;
    public InterfaceC1010450cOx LLJI;
    public long LLJIJIL;
    public boolean LLJILJIL;

    @Override // X.AbstractC1010710cPN, X.C0PPF
    public final void onViewAttachedToWindow() {
    }

    @Override // X.AbstractC1010710cPN
    /* JADX INFO: renamed from: LJIIIZ, reason: merged with bridge method [inline-methods] */
    public final C990480bsk LIZIZ() {
        ViewGroup viewGroup;
        if (C658180Prk.LIZ[this.LL.LIZJ.ordinal()] != 1 || (viewGroup = this.LL.LIZ) == null) {
            return null;
        }
        return (C990480bsk) viewGroup.findViewById(R.id.pw7);
    }

    public final void LJIIL() {
        IVideoPlayTaskManager iVideoPlayTaskManager = this.LLJ;
        if (iVideoPlayTaskManager != null) {
            C988300bpE c988300bpE = new C988300bpE("transformBtnChangeColor");
            c988300bpE.LIZIZ(this.LLJIJIL);
            c988300bpE.LIZJ = this.LLIZ;
            c988300bpE.LIZLLL = new ARunnableS116S0100000_16(this, 165);
            c988300bpE.LJ = false;
            iVideoPlayTaskManager.LLIFFJFJJ(c988300bpE.LIZ());
        }
    }

    public final void LJIJI() {
        IVideoPlayTaskManager iVideoPlayTaskManager = this.LLJ;
        if (iVideoPlayTaskManager != null) {
            C988300bpE c988300bpE = new C988300bpE("transformBtnShow");
            c988300bpE.LIZIZ(this.LLJIJIL);
            c988300bpE.LIZJ = this.LLILZLL;
            c988300bpE.LIZLLL = new ARunnableS116S0100000_16(this, 166);
            c988300bpE.LJ = false;
            iVideoPlayTaskManager.LLIFFJFJJ(c988300bpE.LIZ());
        }
    }

    public final void LJII() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cta change color hasChangeColor=");
        sbLIZ.append(this.LLIZLLLIL);
        C2188811AlT.LIZIZ(sbLIZ);
        int i = C2510609se.LIZ;
        if (this.LLIZLLLIL) {
            return;
        }
        C990480bsk c990480bskLIZIZ = LIZIZ();
        if (c990480bskLIZIZ != null) {
            c990480bskLIZIZ.LIZIZ();
        }
        this.LL.LJFF.LIZ = 3;
        this.LLIZLLLIL = true;
    }

    public final void LJIIJ() {
        C990480bsk c990480bskLIZIZ = LIZIZ();
        if (c990480bskLIZIZ != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c990480bskLIZIZ.getLayoutParams();
            marginLayoutParams.bottomMargin = -200;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c990480bskLIZIZ);
            c990480bskLIZIZ.setLayoutParams(marginLayoutParams);
        }
        C990480bsk c990480bskLIZIZ2 = LIZIZ();
        if (c990480bskLIZIZ2 != null) {
            c990480bskLIZIZ2.LIZJ(c990480bskLIZIZ2.LLJIJIL, 0);
        }
        this.LLIZLLLIL = false;
    }

    public final void LJIJJ() {
        AnonymousClass0951 anonymousClass0951LIZJ;
        C1011570cQl c1011570cQl;
        C990480bsk c990480bskLIZIZ = LIZIZ();
        if (c990480bskLIZIZ != null) {
            ARunnableS106S0100000_6 aRunnableS106S0100000_6 = c990480bskLIZIZ.LLILZ;
            if (aRunnableS106S0100000_6 != null) {
                HandlerHook.viewRemoveCallbacks(c990480bskLIZIZ, aRunnableS106S0100000_6);
            }
            if (c990480bskLIZIZ.LLILZ == null) {
                c990480bskLIZIZ.LLILZ = new ARunnableS106S0100000_6((Object) c990480bskLIZIZ, 232);
            }
            HandlerHook.viewPostDelay(c990480bskLIZIZ, c990480bskLIZIZ.LLILZ, 0L);
            InterfaceC1011430cQX interfaceC1011430cQX = this.LL.LIZLLL;
            c990480bskLIZIZ.LJ((interfaceC1011430cQX == null || (anonymousClass0951LIZJ = interfaceC1011430cQX.LIZJ()) == null || (c1011570cQl = (C1011570cQl) anonymousClass0951LIZJ.getValue()) == null) ? 0 : c1011570cQl.LIZIZ);
        }
        if (!this.LLJILJIL) {
            ISearchAdEventLogger iSearchAdEventLogger = this.LL.LJ;
            C1009980cOC.LIZ.getClass();
            iSearchAdEventLogger.logAd(C1009980cOC.LJI);
            this.LLJILJIL = true;
        }
        C1010580cPA c1010580cPA = this.LL;
        c1010580cPA.LJFF.LIZ = c1010580cPA.LIZJ == EnumC658110Prd.PRECISE_AD ? 3 : 2;
        int i = C2510609se.LIZ;
    }

    @Override // X.AbstractC1010710cPN, X.C0PPF
    public final void bind() {
        C990480bsk c990480bskLIZIZ = LIZIZ();
        if (c990480bskLIZIZ != null) {
            c990480bskLIZIZ.LIZ(this.LLILLJJLI, new ACListenerS151S0100000_16(this, 85));
        }
        InterfaceC1011430cQX interfaceC1011430cQX = this.LL.LIZLLL;
        if (interfaceC1011430cQX != null) {
            interfaceC1011430cQX.LIZLLL(EnumC1011130cQ3.ENTER_DETAIL, new AwS560S0100000_16(this, 767));
        }
        InterfaceC1011430cQX interfaceC1011430cQX2 = this.LL.LIZLLL;
        if (interfaceC1011430cQX2 != null) {
            interfaceC1011430cQX2.LIZLLL(EnumC1011130cQ3.RETURN_FROM_DETAIL, new AwS560S0100000_16(this, 768));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bind SearchAdButtonComponent componentView = ");
        sbLIZ.append(LIZIZ());
        C2188811AlT.LIZIZ(sbLIZ);
        int i = C2510609se.LIZ;
        C990480bsk c990480bskLIZIZ2 = LIZIZ();
        if (c990480bskLIZIZ2 != null) {
            C427690Gpr.LJ(c990480bskLIZIZ2, 0.0f);
        }
    }

    @Override // X.AbstractC1010710cPN, X.C0PPF
    public final void onViewDetachedFromWindow() {
        LJIIJ();
        this.LLJILJIL = false;
    }

    public C1011030cPt(C1010580cPA c1010580cPA) {
        float f;
        super(c1010580cPA);
        AwemeSearchAdModel awemeSearchAdModel = this.LLILLL;
        if (awemeSearchAdModel != null) {
            f = awemeSearchAdModel.showButtonSeconds;
        } else {
            f = 0.0f;
        }
        this.LLILZLL = (int) (f * 1000.0f);
        this.LLIZ = (int) ((awemeSearchAdModel != null ? awemeSearchAdModel.buttonColorShowSeconds : 0.0f) * 1000.0f);
        this.LLJIJIL = -1L;
    }

    @Override // X.AbstractC1010710cPN
    public final void LIZJ(InterfaceC1010450cOx interfaceC1010450cOx) {
        C1009940cO8.LIZIZ(interfaceC1010450cOx, this.LLILZIL, C2097908Jt.LIZJ(new Pair(C1010930cPj.LIZ, new AwS417S0200000_16(this, interfaceC1010450cOx, 75))));
    }

    @Override // X.AbstractC1010710cPN
    public final boolean LJFF(C1010580cPA c1010580cPA) {
        if (C658180Prk.LIZ[c1010580cPA.LIZJ.ordinal()] == 2) {
            Aweme aweme = this.LLILLJJLI;
            if (aweme != null && C1010120cOQ.LJIIL(aweme)) {
                return true;
            }
            return false;
        }
        Aweme aweme2 = this.LLILLJJLI;
        if (aweme2 != null && C1010120cOQ.LJIIL(aweme2) && !C1010120cOQ.LIZ(this.LLILLJJLI, EnumC656000PoE.SEARCH_AD_TWO_COLUMN_CARD_BOTTOM.getValue())) {
            return true;
        }
        return false;
    }
}
