package X;

import Y.ACListenerS140S0100000_5;
import Y.AObjectS240S0100000_5;
import Y.ARunnableS74S0200000_5;
import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParamType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationSubType;
import com.ss.android.ugc.aweme.network.NetworkConnectivityUtil$createLifeCycleObserver$1;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0Esa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C378420Esa extends AbstractC360500EBk implements InterfaceC378650Esx {
    public static final /* synthetic */ int LLLLIIL = 0;
    public final VideoPublishEditModel LLJJIJIL;
    public final Activity LLJJJ;
    public final C1DRG LLJJJIL;
    public final Function1<Integer, Unit> LLJJJJ;
    public SmartImageView LLJJLIIIJLLLLLLLZ;
    public SmartImageView LLJL;
    public Integer LLL;
    public boolean LLLF;
    public boolean LLLFF;
    public boolean LLLFFI;
    public final C01GW LLLFZ;
    public final C01GW LLLI;
    public C378700Et2 LLLII;
    public int LLLIIII;
    public final C01GW LLLIIIIL;
    public final C01GW LLLIIIL;
    public final C01GW LLLIIL;
    public final C01GW LLLIILIL;
    public final C01GW LLLIL;
    public boolean LLLILZ;
    public AnonymousClass0956 LLLILZJ;
    public NLETrackSlot LLLILZLLLI;
    public C361050EDn LLLIZZ;
    public final C01GW LLLJ;
    public final C01GW LLLJIL;
    public final C01GW LLLJL;
    public final C01GW LLLL;
    public final MutableLiveData<Pair<Boolean, Boolean>> LLLLII;
    public final C560530Lyd<Boolean> LLLLIIIILLL;
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 497));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 508));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 491));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 509));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 469));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 471));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 472));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 493));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 495));
    public C378430Esb LLJZIJLIL = new C378430Esb(0);

    @Override // X.AbstractC360500EBk
    public final C0EDF LLLLIILL() {
        return null;
    }

    @Override // X.AbstractC360500EBk
    public final void LLLLIL() {
    }

    public final C0E48 LIZIZ() {
        return (C0E48) this.LLLIIIIL.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLLIL() {
        /*
            r7 = this;
            X.0E48 r0 = r7.LIZIZ()
            r6 = 0
            if (r0 == 0) goto L7b
            X.0Dq1 r0 = r0.LLFII()
            if (r0 == 0) goto L7b
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r3 = r0.LJJLIIIJLLLLLLLZ()
            if (r3 == 0) goto L7c
            java.lang.String r1 = r3.getUUID()
        L17:
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = r7.LLLILZLLLI
            if (r0 == 0) goto L79
            java.lang.String r0 = r0.getUUID()
        L1f:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L65
            X.0956 r0 = r7.LLLILZJ
            r5 = 0
            r4 = 1
            if (r0 == 0) goto L38
            boolean r0 = r0.isActive()
            if (r0 != r4) goto L38
            X.0956 r0 = r7.LLLILZJ
            if (r0 == 0) goto L38
            r0.LIZIZ(r6)
        L38:
            r7.LLLLJI(r6, r6)
            X.01GW r0 = r7.LLLFZ
            java.lang.Object r1 = r0.getValue()
            X.0EBZ r1 = (X.C0EBZ) r1
            if (r1 == 0) goto L68
            X.0E48 r0 = r7.LIZIZ()
            java.util.List r2 = r1.ox1(r0)
            if (r2 == 0) goto L68
            int r1 = r2.size()
            r0 = 2
            if (r1 < r0) goto L68
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r2, r5)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r2, r4)
            java.lang.String r0 = (java.lang.String) r0
            r7.LLLLJI(r1, r0)
        L65:
            r7.LLLILZLLLI = r3
            return
        L68:
            androidx.lifecycle.LifecycleCoroutineScope r2 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r7)
            X.0Dtl r1 = new X.0Dtl
            r1.<init>(r7, r6)
            r0 = 3
            X.0956 r0 = X.C23250099c.LIZLLL(r2, r6, r6, r1, r0)
            r7.LLLILZJ = r0
            goto L65
        L79:
            r0 = r6
            goto L1f
        L7b:
            r3 = r6
        L7c:
            r1 = r6
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C378420Esa.LLLLLIL():void");
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onDestroyView() {
        C368000Ebm c368000Ebm;
        super.onDestroyView();
        if (!this.LLLFFI) {
            ((InterfaceC355850DxH) this.LLLL.getValue()).LIZLLL(C378120Es6.LIZJ(AIGCGenerationParamType.T2V_TYPE));
        }
        AnonymousClass0956 anonymousClass0956 = this.LLLILZJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLLILZJ = null;
        C0E5S c0e5s = (C0E5S) this.LLLJ.getValue();
        View viewXg = c0e5s != null ? c0e5s.xg() : null;
        if ((viewXg instanceof C368000Ebm) && (c368000Ebm = (C368000Ebm) viewXg) != null) {
            c368000Ebm.enableMainTrackTransitionClickable(true);
        }
        LLLLLJLJLL(false);
    }

    @Override // com.bytedance.scene.Scene
    public final void onPause() {
        super.onPause();
        C201955140j.LIZLLL(C563650M8t.LIZIZ, "AI_Transition", "onPause: ai transition tab scene");
    }

    @Override // com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        C201955140j.LIZLLL(C563650M8t.LIZIZ, "AI_Transition", "onResume: ai transition tab scene");
    }

    @Override // com.bytedance.scene.Scene
    public final void onStart() {
        super.onStart();
        C201955140j.LIZLLL(C563650M8t.LIZIZ, "AI_Transition", "onStart: ai transition tab scene");
    }

    @Override // com.bytedance.scene.Scene
    public final void onStop() {
        super.onStop();
        C201955140j.LIZLLL(C563650M8t.LIZIZ, "AI_Transition", "onStop: ai transition tab scene");
    }

    @Override // X.InterfaceC378650Esx
    public final /* bridge */ /* synthetic */ MutableLiveData isLoading() {
        return this.LLLLII;
    }

    @Override // com.bytedance.scene.Scene
    public final void LLJJL(boolean z) {
        if (z) {
            if (!this.LLLILZ) {
                this.LLLILZ = true;
                ((InterfaceC381940EyG) this.LLLJL.getValue()).LJFF(C378120Es6.LIZJ(AIGCGenerationParamType.T2V_TYPE), null, C378120Es6.LIZIZ(AIGCGenerationSubType.AI_TRANSITION), new AwS584S0100000_5(this, 402));
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C378460Ese(this, null), 3);
            }
            LLLLLIL();
        }
    }

    public final void LLLLJ(boolean z) {
        Context sceneContext;
        String str;
        String str2;
        String str3;
        VideoPublishEditModel videoPublishEditModel = this.LLJJIJIL;
        if (videoPublishEditModel == null || (sceneContext = getSceneContext()) == null) {
            return;
        }
        String str4 = this.LLJZIJLIL.LIZJ;
        if (str4 == null) {
            C378700Et2 c378700Et2 = this.LLLII;
            if (c378700Et2 == null || (str = c378700Et2.LIZIZ) == null) {
                str = "Generate video to use as transition";
            }
        } else {
            str = str4;
        }
        String string = sceneContext.getString(2131841124, "5");
        if (str4 == null) {
            str2 = "default";
        } else {
            str2 = "modify";
        }
        C377120EqU c377120EqU = C377120EqU.LIZ;
        C0E48 c0e48LIZIZ = LIZIZ();
        boolean z2 = this.LLLF;
        String str5 = (String) C13LP.LJJJLZIJ(0, C379370Eu7.LIZJ());
        if (str5 == null) {
            str5 = "";
        }
        int i = this.LLJZIJLIL.LIZLLL;
        if (z) {
            str3 = "enable";
        } else {
            str3 = "disable";
        }
        c377120EqU.getClass();
        C377120EqU.LJIIIZ(videoPublishEditModel, c0e48LIZIZ, "ep_transition", false, z2, str5, str, string, i, str3, 0, "ai_transition", 0, 2, str2, null, null, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLLILLIL(X.C378430Esb r5) {
        /*
            r4 = this;
            r4.LLJZIJLIL = r5
            java.lang.String r0 = r5.LIZ
            r3 = 0
            if (r0 == 0) goto L49
            java.lang.String r0 = r5.LIZIZ
            if (r0 == 0) goto L49
            java.lang.String r0 = r5.LIZJ
            if (r0 == 0) goto L47
            int r1 = r0.length()
        L13:
            r0 = 2000(0x7d0, float:2.803E-42)
            r2 = 1
            if (r1 > r0) goto L49
            int r0 = r5.LIZLLL
            if (r0 <= 0) goto L49
            boolean r0 = r5.LJ
            if (r0 == 0) goto L49
        L20:
            X.01GW r0 = r4.LLJLIL
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            r0.setEnabled(r2)
            r0.setClickable(r2)
            X.01GW r0 = r4.LLJLLIL
            java.lang.Object r1 = r0.getValue()
            android.view.View r1 = (android.view.View) r1
            if (r2 == 0) goto L45
            r0 = 8
        L3a:
            X.C786410Ut5.LJLLLLLL(r0, r1)
            if (r2 != 0) goto L44
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r4.LLLLL(r3, r0)
        L44:
            return
        L45:
            r0 = 0
            goto L3a
        L47:
            r1 = 0
            goto L13
        L49:
            r2 = 0
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C378420Esa.LLLLLILLIL(X.0Esb):void");
    }

    public final void LLLLLJIL(String str) {
        String string = str;
        LLLLLILLIL(C378430Esb.LIZ(this.LLJZIJLIL, null, null, string, 0, false, 27));
        if (string == null || string.length() == 0) {
            string = getString(2131834187);
        }
        ((TextView) this.LLJLLL.getValue()).setText(string);
    }

    public final void LLLLLJLJLL(boolean z) {
        InterfaceC377410Eqx interfaceC377410Eqx = (InterfaceC377410Eqx) this.LLLIILIL.getValue();
        if (interfaceC377410Eqx != null && interfaceC377410Eqx.LJLILLLLZI()) {
            return;
        }
        if (z) {
            InterfaceC360800ECo interfaceC360800ECo = (InterfaceC360800ECo) this.LLLIIL.getValue();
            if (interfaceC360800ECo != null) {
                interfaceC360800ECo.IO();
            }
            InterfaceC360800ECo interfaceC360800ECo2 = (InterfaceC360800ECo) this.LLLIIL.getValue();
            if (interfaceC360800ECo2 != null) {
                C0EB4.LIZIZ(interfaceC360800ECo2, new EnumC373450EkZ[]{EnumC373450EkZ.UNDO, EnumC373450EkZ.REDO, EnumC373450EkZ.FULL_SCREEN}, null, Boolean.FALSE, null, null, 26);
                return;
            }
            return;
        }
        InterfaceC360800ECo interfaceC360800ECo3 = (InterfaceC360800ECo) this.LLLIIL.getValue();
        if (interfaceC360800ECo3 != null) {
            interfaceC360800ECo3.Fi2();
        }
        InterfaceC360800ECo interfaceC360800ECo4 = (InterfaceC360800ECo) this.LLLIIL.getValue();
        if (interfaceC360800ECo4 == null) {
            return;
        }
        C0EB4.LIZIZ(interfaceC360800ECo4, new EnumC373450EkZ[]{EnumC373450EkZ.FULL_SCREEN}, null, Boolean.TRUE, null, null, 26);
    }

    @Override // X.InterfaceC378650Esx
    public final void LLILLL(int i, String str) {
        String str2;
        if (str != null && str.length() != 0) {
            this.LLLIIII = i;
        } else {
            this.LLLIIII = 0;
        }
        LLLLLJIL(str);
        if (getSceneContext() == null) {
            return;
        }
        C378430Esb c378430Esb = this.LLJZIJLIL;
        if (c378430Esb.LIZ != null && c378430Esb.LIZIZ != null && (((str2 = c378430Esb.LIZJ) == null || str2.length() <= 2000) && c378430Esb.LIZLLL > 0 && c378430Esb.LJ)) {
            try {
                if (C036E.LIZ.LIZIZ()) {
                    ((View) this.LLJLIL.getValue()).performClick();
                    return;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        ((View) this.LLJLLIL.getValue()).performClick();
    }

    public final void LLLLILI(Function0<Unit> function0, Function0<Unit> function02) {
        C379140Etk.LIZ.getClass();
        if (C379140Etk.LJFF()) {
            function02.invoke();
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        VideoPublishEditModel videoPublishEditModel = this.LLJJIJIL;
        if (videoPublishEditModel != null) {
            C377120EqU c377120EqU = C377120EqU.LIZ;
            C0E48 c0e48LIZIZ = LIZIZ();
            c377120EqU.getClass();
            C20684815ws.LJIILLIIL("ai_create_authorized_popup_show", C377120EqU.LIZJ(videoPublishEditModel, c0e48LIZIZ).LIZ);
        }
        Activity activity = this.mActivity;
        if (activity == null) {
            return;
        }
        this.LLLLIIIILLL.LJIIJ(Boolean.TRUE);
        C383990F3t c383990F3t = C383990F3t.LIZ;
        AwS371S0200000_5 awS371S0200000_5 = new AwS371S0200000_5(this, (C378420Esa) function02, (Function0<Unit>) 84);
        AwS549S0100000_5 awS549S0100000_5 = new AwS549S0100000_5(this, 483);
        AwS406S0200000_5 awS406S0200000_5 = new AwS406S0200000_5(this, (C378420Esa) function0, (Function0<Unit>) 51);
        c383990F3t.getClass();
        C383990F3t.LJII(activity, awS371S0200000_5, awS549S0100000_5, awS406S0200000_5);
    }

    public final void LLLLJI(String str, String str2) {
        SmartImageView smartImageView;
        SmartImageView smartImageView2;
        if (str != null && (smartImageView2 = this.LLJJLIIIJLLLLLLLZ) != null) {
            C1331670kl3 c1331670kl3LJII = C1331660kl2.LJII(new C0VSJ(str));
            c1331670kl3LJII.LJJIJL(smartImageView2.getContext());
            c1331670kl3LJII.LJJI(smartImageView2);
            C786410Ut5.h3(c1331670kl3LJII);
        }
        if (str2 != null && (smartImageView = this.LLJL) != null) {
            C1331670kl3 c1331670kl3LJII2 = C1331660kl2.LJII(new C0VSJ(str2));
            c1331670kl3LJII2.LJJIJL(smartImageView.getContext());
            c1331670kl3LJII2.LJJI(smartImageView);
            C786410Ut5.h3(c1331670kl3LJII2);
        }
        LLLLLILLIL(C378430Esb.LIZ(this.LLJZIJLIL, str, str2, null, 0, false, 28));
    }

    public final void LLLLL(boolean z, Boolean bool) {
        int i;
        float f;
        C368000Ebm c368000Ebm;
        C360690ECd c360690ECd;
        this.LLLLII.setValue(new Pair<>(Boolean.valueOf(z), bool));
        boolean z2 = !z;
        ((View) this.LLJLIL.getValue()).setEnabled(z2);
        ((View) this.LLJJL.getValue()).setEnabled(z2);
        TuxIconView tuxIconView = (TuxIconView) this.LLJLILLLLZIIL.getValue();
        int i2 = 8;
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView, i);
        C1295960jpS c1295960jpS = (C1295960jpS) this.LLJLL.getValue();
        if (z) {
            i2 = 0;
        }
        C786410Ut5.LLD(i2, c1295960jpS);
        if (!z) {
            c1295960jpS.cancelAnimation();
        } else {
            c1295960jpS.setRepeatCount(-1);
            if (!c1295960jpS.isAnimating()) {
                c1295960jpS.setProgress(0.0f);
                c1295960jpS.playAnimation();
            }
        }
        C361050EDn c361050EDn = this.LLLIZZ;
        if (c361050EDn != null && (c360690ECd = c361050EDn.LIZ.LLLII) != null) {
            c360690ECd.setInterceptAllEvent(z);
        }
        C0E5S c0e5s = (C0E5S) this.LLLJ.getValue();
        View viewXg = null;
        if (c0e5s != null) {
            viewXg = c0e5s.xg();
        }
        if ((viewXg instanceof C368000Ebm) && (c368000Ebm = (C368000Ebm) viewXg) != null) {
            c368000Ebm.enableMainTrackTransitionClickable(z2);
        }
        LLLLLJLJLL(z);
        View view = this.mView;
        if (view != null) {
            if (z) {
                f = 0.4f;
            } else {
                f = 1.0f;
            }
            C786410Ut5.T4(view, f);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.09AY, kotlin.jvm.functions.Function1] */
    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        boolean zLIZIZ;
        ConnectivityManager connectivityManager;
        C385670FAf<C377750ErV> c385670FAfQl0;
        C385670FAf<C377660ErM> c385670FAfF21;
        super.onViewCreated(view, bundle);
        ?? r1 = this.LLJJIJIIJIL;
        if (r1 != 0) {
            r1.invoke(Boolean.TRUE);
        }
        this.LLJJLIIIJLLLLLLLZ = (SmartImageView) view.findViewById(R.id.vyq);
        this.LLJL = (SmartImageView) view.findViewById(R.id.h4v);
        if (C423170GiZ.LIZ(view.getContext())) {
            C786410Ut5.Eb((SmartImageView) this.LLJZ.getValue(), 180.0f);
        }
        C786410Ut5.Y7((ConstraintLayout) this.LLJLIL.getValue(), new ACListenerS140S0100000_5(this, 42));
        C786410Ut5.Y7((ConstraintLayout) this.LLJJL.getValue(), new ACListenerS140S0100000_5(this, 44));
        C786410Ut5.I7(new ACListenerS140S0100000_5(this, 45), (View) this.LLJLLIL.getValue());
        C786410Ut5.Y7((ConstraintLayout) this.LLJJJJLIIL.getValue(), new ACListenerS140S0100000_5(this, 46));
        InterfaceC377650ErL interfaceC377650ErL = (InterfaceC377650ErL) this.LLLIIIL.getValue();
        if (interfaceC377650ErL != null && (c385670FAfF21 = interfaceC377650ErL.F21()) != null) {
            c385670FAfF21.LIZ(this, new AObjectS240S0100000_5(this, 76));
        }
        InterfaceC377650ErL interfaceC377650ErL2 = (InterfaceC377650ErL) this.LLLIIIL.getValue();
        if (interfaceC377650ErL2 != null && (c385670FAfQl0 = interfaceC377650ErL2.Ql0()) != null) {
            c385670FAfQl0.LIZ(this, new AObjectS240S0100000_5(this, 77));
        }
        Context sceneContext = getSceneContext();
        Object objH2 = null;
        if (sceneContext != null) {
            objH2 = C786410Ut5.H2(sceneContext, "connectivity");
        }
        if ((objH2 instanceof ConnectivityManager) && (connectivityManager = (ConnectivityManager) objH2) != null) {
            getLifecycle().addObserver(new NetworkConnectivityUtil$createLifeCycleObserver$1(connectivityManager, new InterfaceC565580MGe() { // from class: X.0Esd
                @Override // X.InterfaceC565580MGe
                public final void LIZ(EnumC565560MGc enumC565560MGc) {
                    C378420Esa c378420Esa = this.LIZ;
                    C12WG.LIZJ(c378420Esa, new ARunnableS74S0200000_5(enumC565560MGc, c378420Esa, 24));
                }
            }));
        }
        LLLLLIL();
        C378430Esb c378430Esb = this.LLJZIJLIL;
        getSceneContext();
        try {
            zLIZIZ = C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            zLIZIZ = false;
        }
        LLLLLILLIL(C378430Esb.LIZ(c378430Esb, null, null, null, 0, zLIZIZ, 15));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (C357780E0y.LIZ()) {
            return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.np, viewGroup, false);
        }
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.no, viewGroup, false);
    }

    public C378420Esa(VideoPublishEditModel videoPublishEditModel, Activity activity, C1DRG c1drg, AwS584S0100000_5 awS584S0100000_5) {
        this.LLJJIJIL = videoPublishEditModel;
        this.LLJJJ = activity;
        this.LLJJJIL = c1drg;
        this.LLJJJJ = awS584S0100000_5;
        C379140Etk.LIZ.getClass();
        this.LLLF = C379140Etk.LJFF();
        this.LLLFZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 487));
        this.LLLI = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(145));
        this.LLLIIIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 490));
        this.LLLIIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 492));
        this.LLLIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 486));
        this.LLLIILIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 482));
        this.LLLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 488));
        this.LLLJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 498));
        this.LLLJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 501));
        this.LLLJL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 494));
        this.LLLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 496));
        this.LLLLII = new MutableLiveData<>();
        this.LLLLIIIILLL = new C560530Lyd<>();
    }
}
