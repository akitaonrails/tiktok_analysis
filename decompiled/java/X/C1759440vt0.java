package X;

import Y.AAListenerS141S0300000_26;
import Y.ARunnableS75S0200000_6;
import Y.AUListenerS255S0100000_5;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.PathInterpolator;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopUpButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopUpButtonExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.dto.PdpComponentAction;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS154S0400000_26;
import kotlin.jvm.internal.AwS2S3100000_1;
import kotlin.jvm.internal.AwS7S0700000_26;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0vt0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1759440vt0 implements InterfaceC1749170vcR {
    public static final /* synthetic */ int LJIIIZ = 0;
    public final PdpViewModel LIZ;
    public C20515215Pi LIZJ;
    public C0NLF LIZLLL;
    public TuxSheet LJ;
    public C1389880mGw LJFF;
    public boolean LJII;
    public WeakReference<ViewGroup> LIZIZ = new WeakReference<>(null);
    public final SparkContext LJI = new SparkContext();
    public final HashMap<EnumC1759580vtE, SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB> LJIIIIZZ = new HashMap<>();

    @Override // X.InterfaceC1749170vcR
    public final void LIZ(View view, String str) {
    }

    public final void LJFF() {
        C20515215Pi c20515215Pi = this.LIZJ;
        if (c20515215Pi != null) {
            c20515215Pi.LIZIZ();
        }
        TuxSheet tuxSheet = this.LJ;
        if (tuxSheet != null) {
            tuxSheet.dismiss();
        }
        C1389880mGw c1389880mGw = this.LJFF;
        if (c1389880mGw != null) {
            c1389880mGw.LIZIZ();
        }
        LJI();
        this.LIZJ = null;
        this.LJ = null;
        this.LJFF = null;
        this.LIZLLL = null;
        InterfaceC1059280dfi interfaceC1059280dfiLJJIJLIJ = this.LJI.LJJIJLIJ();
        if (interfaceC1059280dfiLJJIJLIJ != null) {
            interfaceC1059280dfiLJJIJLIJ.close();
        }
    }

    public final void LJI() {
        View viewFindViewWithTag;
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = this.LIZIZ.get();
        if (viewGroup2 == null || (viewFindViewWithTag = viewGroup2.findViewWithTag("pdp_bottom_banner")) == null) {
            return;
        }
        ViewParent parent = viewFindViewWithTag.getParent();
        if (!(parent instanceof ViewGroup) || (viewGroup = (ViewGroup) parent) == null) {
            return;
        }
        C786410Ut5.LJJJLZIJ(viewFindViewWithTag, viewGroup);
    }

    public C1759440vt0(PdpViewModel pdpViewModel) {
        this.LIZ = pdpViewModel;
    }

    public final void LJIIJ(String str) {
        for (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB : this.LJIIIIZZ.values()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("pdp_unique_id", this.LIZ.LLZZLLIL);
                InterfaceC1541990qEH kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView();
                if (kitView != null) {
                    kitView.LIZ(str, jSONObject);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1019103yf.LIZ(EnumC1014603xw.ERR_PDP_SPARK_SEND_EVENT, e, null);
            }
        }
    }

    @Override // X.InterfaceC1749170vcR
    public final void LIZIZ(View view, String str) {
        Context context;
        if (str != null && view != null && (context = view.getContext()) != null) {
            C919503ib.LIZIZ(context, str, new LinkedHashMap(), false).open();
        }
    }

    @Override // X.InterfaceC1749170vcR
    public final void LIZJ(PopUpButton popUpButton, String str) {
        String str2;
        C1054004Ag c1054004Ag = this.LIZ.LLJLILLLLZIIL;
        if (c1054004Ag != null) {
            String strLIZ = C04H7.LIZ(popUpButton);
            PopUpButtonExtraInfo popUpButtonExtraInfo = popUpButton.extraInfo;
            if (popUpButtonExtraInfo != null) {
                str2 = popUpButtonExtraInfo.daInfo;
            } else {
                str2 = null;
            }
            InterfaceC1748810vbr interfaceC1748810vbrLJJIJLIJ = c1054004Ag.LJJIJLIJ();
            if (interfaceC1748810vbrLJJIJLIJ != null) {
                C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIJLIJ, new C049X(), new AwS2S3100000_1(c1054004Ag, strLIZ, str, str2, 4));
            }
        }
    }

    public final void LJ(ViewGroup viewGroup, EnumC1759580vtE enumC1759580vtE) {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LJIIIIZZ.get(enumC1759580vtE);
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            C786410Ut5.LJLLLLLL(8, viewGroup);
            if (viewGroup.indexOfChild(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) != -1) {
                C786410Ut5.LJJJLZIJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, viewGroup);
            }
            boolean z = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
            this.LJIIIIZZ.remove(enumC1759580vtE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0169 A[PHI: r2
      0x0169: PHI (r2v9 java.lang.String) = (r2v7 java.lang.String), (r2v13 java.lang.String), (r2v14 java.lang.String) binds: [B:82:0x0167, B:80:0x0163, B:74:0x0155] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BasicPopUp r22, java.lang.String r23) {
        /*
            Method dump skipped, instruction units count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1759440vt0.LJIIL(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BasicPopUp, java.lang.String):void");
    }

    public final void LJIILIIL(int i, String str) {
        LJFF();
        ViewGroup viewGroup = this.LIZIZ.get();
        if (viewGroup == null) {
            return;
        }
        C1389880mGw c1389880mGw = new C1389880mGw(viewGroup);
        this.LJFF = c1389880mGw;
        c1389880mGw.LJ(i);
        c1389880mGw.LJI(R.attr.a1h);
        c1389880mGw.LJIIIZ(str);
        c1389880mGw.LJIIJ();
    }

    public final void LJIILJJIL(int i, Integer num) {
        LJFF();
        ViewGroup viewGroup = this.LIZIZ.get();
        if (viewGroup == null) {
            return;
        }
        C1389880mGw c1389880mGw = new C1389880mGw(viewGroup);
        this.LJFF = c1389880mGw;
        if (num != null) {
            int iIntValue = num.intValue();
            c1389880mGw.LJ(i);
            c1389880mGw.LJI(R.attr.a1h);
            c1389880mGw.LJIIIIZZ(iIntValue);
            c1389880mGw.LJIIJ();
        }
    }

    @Override // X.InterfaceC1749170vcR
    public final void LIZLLL(PopUpButton popUpButton, String str, View view) {
        String str2;
        this.LIZ.LLLLL.LIZ(new PdpComponentAction(popUpButton.action, popUpButton.schema, popUpButton.extraInfo), view, true);
        C1054004Ag c1054004Ag = this.LIZ.LLJLILLLLZIIL;
        if (c1054004Ag != null) {
            String strLIZ = C04H7.LIZ(popUpButton);
            PopUpButtonExtraInfo popUpButtonExtraInfo = popUpButton.extraInfo;
            if (popUpButtonExtraInfo != null) {
                str2 = popUpButtonExtraInfo.daInfo;
            } else {
                str2 = null;
            }
            InterfaceC1748810vbr interfaceC1748810vbrLJJIJLIJ = c1054004Ag.LJJIJLIJ();
            if (interfaceC1748810vbrLJJIJLIJ != null) {
                C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIJLIJ, new C049Y(), new AwS2S3100000_1(c1054004Ag, strLIZ, str, str2, 5));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x02ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BasicPopUp r24, java.lang.String r25, X.InterfaceC1759670vtN r26) {
        /*
            Method dump skipped, instruction units count: 871
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1759440vt0.LJIIIIZZ(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BasicPopUp, java.lang.String, X.0vtN):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(final X.EnumC1759580vtE r21, final X.C1759590vtF r22, android.content.Context r23, final android.view.ViewGroup r24, com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel r25, final kotlin.jvm.functions.Function0<kotlin.Unit> r26, X.C0NLF r27) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1759440vt0.LJIIJJI(X.0vtE, X.0vtF, android.content.Context, android.view.ViewGroup, com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel, kotlin.jvm.functions.Function0, X.0NLF):void");
    }

    public static void LJII(final C1759440vt0 c1759440vt0, View view, final EnumC1759580vtE enumC1759580vtE, Integer num, Boolean bool, Function0 function0, AwS7S0700000_26 awS7S0700000_26, int i) {
        AwS7S0700000_26 awS7S0700000_262 = awS7S0700000_26;
        Function0 function02 = function0;
        Boolean bool2 = bool;
        if ((i & 8) != 0) {
            bool2 = Boolean.FALSE;
        }
        if ((i & 16) != 0) {
            function02 = null;
        }
        if ((i & 32) != 0) {
            awS7S0700000_262 = null;
        }
        c1759440vt0.getClass();
        if (view instanceof ViewGroup) {
            EnumC1759580vtE enumC1759580vtE2 = EnumC1759580vtE.BOTTOM;
            if (enumC1759580vtE == enumC1759580vtE2 && Intrinsics.LJFF(bool2, Boolean.TRUE)) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (viewGroup != null) {
                    HandlerHook.viewPost(viewGroup, new ARunnableS75S0200000_6((Object) viewGroup, (Object) function02, 117));
                    return;
                }
                return;
            }
            if (num != null) {
                if (num.intValue() == 0) {
                    final ViewGroup viewGroup2 = (ViewGroup) view;
                    if (viewGroup2 == null || viewGroup2.getVisibility() != 0) {
                        return;
                    }
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroup2, (Property<ViewGroup, Float>) View.TRANSLATION_Y, viewGroup2.getTranslationY(), 0.0f);
                    objectAnimatorOfFloat.setInterpolator(new PathInterpolator(0.42f, 0.0f, 0.75f, 0.53f));
                    objectAnimatorOfFloat.setDuration(400L);
                    objectAnimatorOfFloat.addListener(new C1759690vtP() { // from class: X.0vtJ
                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                            c1759440vt0.LJ(viewGroup2, enumC1759580vtE);
                        }
                    });
                    C786410Ut5.Pd(objectAnimatorOfFloat);
                    return;
                }
                if (num.intValue() == 1) {
                    ViewGroup viewGroup3 = (ViewGroup) view;
                    if (viewGroup3 == null || viewGroup3.getVisibility() != 0) {
                        return;
                    }
                    float translationY = viewGroup3.getTranslationY();
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(viewGroup3, (Property<ViewGroup, Float>) View.TRANSLATION_Y, translationY, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200)) + translationY);
                    objectAnimatorOfFloat2.setInterpolator(new PathInterpolator(0.55f, 0.0f, 0.82f, 0.48f));
                    objectAnimatorOfFloat2.setDuration(400L);
                    ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(viewGroup3, (Property<ViewGroup, Float>) View.ALPHA, 1.0f, 0.0f);
                    objectAnimatorOfFloat3.setInterpolator(new PathInterpolator(0.33f, 0.0f, 0.67f, 1.0f));
                    objectAnimatorOfFloat3.setDuration(200L);
                    objectAnimatorOfFloat2.addUpdateListener(new AUListenerS255S0100000_5(objectAnimatorOfFloat3, 35));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.play(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3);
                    animatorSet.addListener(new AAListenerS141S0300000_26(viewGroup3, enumC1759580vtE, c1759440vt0, 0));
                    animatorSet.start();
                    return;
                }
                c1759440vt0.LJ((ViewGroup) view, enumC1759580vtE);
                return;
            }
            if (enumC1759580vtE == enumC1759580vtE2) {
                ViewGroup viewGroup4 = (ViewGroup) view;
                AwS154S0400000_26 awS154S0400000_26 = new AwS154S0400000_26(c1759440vt0, (C1759440vt0) view, (View) enumC1759580vtE, (EnumC1759580vtE) awS7S0700000_262, (Function0<Unit>) 27);
                if (viewGroup4 == null) {
                    return;
                }
                HandlerHook.viewPost(viewGroup4, new ARunnableS75S0200000_6((Object) viewGroup4, (Object) awS154S0400000_26, 117));
                return;
            }
            c1759440vt0.LJ((ViewGroup) view, enumC1759580vtE);
        }
    }
}
