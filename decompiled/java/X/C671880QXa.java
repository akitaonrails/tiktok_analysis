package X;

import Y.ACListenerS145S0100000_10;
import Y.AObserverS214S0100000_10;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import avg.f;
import com.bytedance.router.SmartRoute;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mf.a;

/* JADX INFO: renamed from: X.0QXa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C671880QXa extends C0QXZ {
    public final LifecycleOwner LLJI;
    public TuxTextView LLJIJIL;
    public C20575915fJ LLJILJIL;
    public boolean LLJILJILJ;

    @Override // X.C0QXZ, X.C0QY2
    public void Aj() {
        Word word;
        Word word2;
        Word word3;
        Word word4;
        if (this.LLJILJILJ) {
            C0QW4 value = getCurrentSearchHintWord().getValue();
            String implId = null;
            if (Intrinsics.LJFF((value == null || (word4 = value.LIZ) == null) ? null : word4.getWord(), getDefaultHintWord())) {
                return;
            }
            C2344009Gk c2344009GkLIZ = LIZ();
            c2344009GkLIZ.LJIIIIZZ("words_source", "search_bar_outer");
            C0QW4 value2 = getCurrentSearchHintWord().getValue();
            c2344009GkLIZ.LJ(value2 != null ? Integer.valueOf(value2.LIZIZ) : null, "words_position");
            C0QW4 value3 = getCurrentSearchHintWord().getValue();
            c2344009GkLIZ.LJIIIIZZ("words_content", (value3 == null || (word3 = value3.LIZ) == null) ? null : word3.getWord());
            C0QW4 value4 = getCurrentSearchHintWord().getValue();
            c2344009GkLIZ.LJIIIIZZ("group_id", (value4 == null || (word2 = value4.LIZ) == null) ? null : C1208204o4.LIZ(word2));
            C0QW4 value5 = getCurrentSearchHintWord().getValue();
            if (value5 != null && (word = value5.LIZ) != null) {
                implId = word.getImplId();
            }
            c2344009GkLIZ.LJIIIIZZ("impr_id", implId);
            c2344009GkLIZ.LJIIIIZZ("search_position", getEntranceModel().LIZ);
            c2344009GkLIZ.LJIIIIZZ("search_entrance", getEntranceModel().LJIILIIL);
            C1018703yb.LIZIZ("trending_words_show", c2344009GkLIZ.LIZ);
        }
    }

    public void LJI() {
        String word;
        Word word2;
        int[] iArr = C0QYF.LIZ;
        if (C0QYF.LIZ(getEntranceModel().LJIIJ)) {
            return;
        }
        C2344009Gk c2344009GkLIZ = LIZ();
        String strLIZ = C670060QQa.LIZ(Integer.valueOf(getEntranceModel().LJIIJ), null, null);
        String str = Intrinsics.LJFF(strLIZ, EnumC670440QRm.NINE_PERCENT_SHOP.getValue()) ? "90percent_page" : Intrinsics.LJFF(strLIZ, EnumC670440QRm.HALF_SHOP.getValue()) ? "half_shop_page" : "fullpage";
        c2344009GkLIZ.LJFF("enter_from", getEntranceModel().LIZ);
        c2344009GkLIZ.LJFF("search_entrance", getEntranceModel().LJIILIIL);
        c2344009GkLIZ.LJFF("enter_method", "enter");
        c2344009GkLIZ.LJFF("enter_action", "enter");
        c2344009GkLIZ.LJFF("blankpage_type", str);
        C0QW4 value = getCurrentSearchHintWord().getValue();
        if (value == null || (word2 = value.LIZ) == null || (word = word2.getWord()) == null) {
            word = "";
        }
        c2344009GkLIZ.LJFF("search_keyword", word);
        C1018703yb.LIZIZ("enter_search_blankpage", c2344009GkLIZ.LIZ);
    }

    public final TuxTextView getTvSearchInputFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tv_search_input);
            this.LLJIJIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public void LIZLLL() {
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(getContext());
        if (c19egLIZIZ != null) {
            boolean z = false;
            IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
            if (iDetailFeedSafService != null && iDetailFeedSafService.LJ()) {
                z = true;
            }
            Fragment fragment = null;
            if (z) {
                Object objLJIILLIIL = SAFExtensionKt.LJIILLIIL(c19egLIZIZ);
                Fragment fragment2 = objLJIILLIIL != null ? (Fragment) objLJIILLIIL : null;
                if (fragment2 instanceof InterfaceC1058480deQ) {
                    fragment = fragment2;
                }
            }
            MutableLiveData<C0QW4> currentSearchHintWord = getCurrentSearchHintWord();
            LifecycleOwner lifecycleOwner = this.LLJI;
            LifecycleOwner lifecycleOwner2 = c19egLIZIZ;
            if (lifecycleOwner != null) {
                lifecycleOwner2 = lifecycleOwner;
            } else if (fragment != null) {
                lifecycleOwner2 = fragment;
            }
            currentSearchHintWord.observe(lifecycleOwner2, new AObserverS214S0100000_10(this, 138));
        }
        View.OnClickListener aCListenerS145S0100000_10 = new ACListenerS145S0100000_10(this, 87);
        if (C1848410yCV.LIZ) {
            aCListenerS145S0100000_10 = new f(aCListenerS145S0100000_10);
        }
        a aVar = new a(aCListenerS145S0100000_10);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
    }

    public void LJ() {
        C786410Ut5.Sd(R.layout.ewe, C786410Ut5.ne(getContext()), this);
        LJFF();
    }

    public final void LJFF() {
        Integer numLIZJ;
        C672540QZo c672540QZo = getEntranceModel().LJJIFFI;
        if (c672540QZo != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(c672540QZo.LIZ);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
            setBackground(c384050F3z.LIZ(getContext()));
        } else {
            GradientDrawable gradientDrawable = new GradientDrawable();
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.bs, getContext());
            if (numLIZJ2 != null) {
                gradientDrawable.setColor(numLIZJ2.intValue());
            }
            gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(8));
            setBackground(gradientDrawable);
        }
        C0QXI c0qxi = getEntranceModel().LJIIIZ;
        if (c0qxi != null) {
            int i = C0QXH.LIZIZ[c0qxi.ordinal()];
            if (i != 1) {
                if (i != 2 || (numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, getContext())) == null) {
                    return;
                }
                getTvSearchInputFromXml().setTextColor(numLIZJ.intValue());
                return;
            }
            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.uh, getContext());
            if (numLIZJ3 != null) {
                getTvSearchInputFromXml().setTextColor(numLIZJ3.intValue());
            }
        }
    }

    @Override // X.C0QXZ, X.C0QY2
    public final void f7() {
        TuxTextView tvSearchInputFromXml = getTvSearchInputFromXml();
        if (tvSearchInputFromXml != null) {
            C20575915fJ c20575915fJ = new C20575915fJ(this, tvSearchInputFromXml);
            this.LLJILJIL = c20575915fJ;
            c20575915fJ.LIZIZ();
        }
    }

    @Override // X.C0QY2
    public void rj() {
        C2344009Gk c2344009GkLIZ = LIZ();
        String str = getEntranceModel().LJIILL;
        if (str == null) {
            str = getEntranceModel().LIZ;
        }
        c2344009GkLIZ.LJIIIIZZ("enter_from", str);
        c2344009GkLIZ.LJIIIIZZ("search_entrance", getEntranceModel().LJIILIIL);
        C1018703yb.LIZIZ("show_search", c2344009GkLIZ.LIZ);
        this.LLJILJILJ = true;
    }

    public final C20575915fJ getEntranceAnimController() {
        return this.LLJILJIL;
    }

    @Override // X.C0QXZ, X.C0QY2
    public EnumC671980QXk getEntranceViewType() {
        return EnumC671980QXk.BLANK;
    }

    @Override // X.C0QXZ
    public SmartRoute LIZIZ(Context context) {
        Word word;
        SmartRoute smartRouteLIZIZ = super.LIZIZ(context);
        String string = null;
        if (smartRouteLIZIZ == null) {
            return null;
        }
        C0QW4 value = getCurrentSearchHintWord().getValue();
        if (value != null && (word = value.LIZ) != null) {
            try {
                string = C7740030o.LIZ().getGson().LJIILL(word);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
                string = word.toString();
            }
        }
        smartRouteLIZIZ.withParam("inbox_word", string);
        return smartRouteLIZIZ;
    }

    public void LIZJ(String str) {
        getTvSearchInputFromXml().setText(str);
    }

    @Override // X.C0QXZ, X.C0QY2
    public final void fc(Long l) {
        C20575915fJ c20575915fJ = this.LLJILJIL;
        if (c20575915fJ == null) {
            return;
        }
        c20575915fJ.LIZJ(l);
    }

    @Override // X.C0QXZ, X.C0QY2
    public final void gw(EnumC671640QWc enumC671640QWc) {
        if (this.LLJILJIL == null) {
            return;
        }
        int i = C0QXH.LIZ[enumC671640QWc.ordinal()];
        if (i != 1) {
            if (i == 2) {
                C20575915fJ c20575915fJ = this.LLJILJIL;
                if (c20575915fJ != null) {
                    c20575915fJ.LJFF = false;
                    return;
                }
                return;
            }
            throw new C1954807lC();
        }
        C20575915fJ c20575915fJ2 = this.LLJILJIL;
        if (c20575915fJ2 == null) {
            return;
        }
        c20575915fJ2.LIZ();
    }

    public final void setEntranceAnimController(C20575915fJ c20575915fJ) {
        this.LLJILJIL = c20575915fJ;
    }

    public final void setTvSearchInputFromXml(TuxTextView tuxTextView) {
        this.LLJIJIL = tuxTextView;
    }

    public C671880QXa(Context context, C671890QXb c671890QXb, Function0 function0, LifecycleOwner lifecycleOwner) {
        super(context, c671890QXb, function0);
        this.LLJI = lifecycleOwner;
        LJ();
        LIZLLL();
        setDefaultHintWordInView(c671890QXb.LJFF);
    }

    @Override // X.C0QXZ, X.C0QY2
    public final void Rm(int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.k3p);
        if (tuxIconView != null) {
            ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams2.width = i;
                marginLayoutParams2.height = i;
                marginLayoutParams2.setMarginStart(i2);
                marginLayoutParams2.topMargin = i3;
                marginLayoutParams2.bottomMargin = i4;
                marginLayoutParams2.setMarginEnd(0);
                C786410Ut5.M6(tuxIconView, marginLayoutParams2);
            }
        }
        TuxTextView tvSearchInputFromXml = getTvSearchInputFromXml();
        if (tvSearchInputFromXml != null) {
            ViewGroup.LayoutParams layoutParams2 = tvSearchInputFromXml.getLayoutParams();
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                marginLayoutParams.height = i5;
                C786410Ut5.R6(tvSearchInputFromXml, marginLayoutParams);
            }
        }
    }
}
