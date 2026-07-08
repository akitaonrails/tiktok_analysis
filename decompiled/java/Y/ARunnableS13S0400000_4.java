package Y;

import X.AbstractC305760Byg;
import X.C072Z;
import X.C08JS;
import X.C0BEC;
import X.C0C4Z;
import X.C0CJ1;
import X.C0CJ2;
import X.C0CJW;
import X.C0CKZ;
import X.C1150504el;
import X.C1308910kAL;
import X.C1361400lX0;
import X.C13EQ;
import X.C13LP;
import X.C1505630pHd;
import X.C15O7;
import X.C1702430uP3;
import X.C1720406oU;
import X.C1852707Nl;
import X.C189200o6;
import X.C1BWL;
import X.C1C7U;
import X.C202094145s;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2187801Ajq;
import X.C2187891Ajz;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C259800zU;
import X.C305780Byi;
import X.C311520CJa;
import X.C311600CJi;
import X.C318400Cdy;
import X.C371430EhJ;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C790600Uzq;
import X.C793770VBv;
import X.C814420VxA;
import X.EnumC311620CJk;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.otis.memory.OtisGson;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.poi_api.experiment.PoiPublishRetagOptimizationExperiment;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.setting.IAbTestManager;
import com.ss.android.ugc.aweme.settingsrequest.api.FetchABTestCommonChunkTask;
import com.ss.android.ugc.aweme.settingsrequest.api.optimized.FetchABTestCommonOptimizedChunkTask;
import com.ss.android.ugc.aweme.settingsrequest.api.optimized.FetchABTestCommonOptimizedRequest;
import com.ss.android.ugc.aweme.settingsrequest.api.optimized.FetchABTestCommonOptimizedTask;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.EffectTemplateCategoryFragment;
import com.ss.android.ugc.profile.business.profile.background.ProfileBgVideoPreviewActivity;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class ARunnableS13S0400000_4 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e8  */
    /* JADX WARN: Type inference failed for: r11v0, types: [T, com.google.gson.n, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$0() throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1091
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS13S0400000_4.LIZ$0():void");
    }

    public final void LIZ$1() {
        int height = ((View) this.l0).getHeight();
        int bottom = ((FrameLayout) this.l1).getBottom();
        if (height <= 0 || bottom <= 0) {
            return;
        }
        int i = height - bottom;
        if (i < 0) {
            i = 0;
        }
        C371430EhJ c371430EhJ = (C371430EhJ) this.l2;
        ViewGroup.LayoutParams layoutParams = c371430EhJ.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.bottomMargin = i;
        C786410Ut5.W5(c371430EhJ, layoutParams2);
        LinearLayout linearLayout = ((ProfileBgVideoPreviewActivity) this.l3).LLJ;
        if (linearLayout != null) {
            ViewGroup.LayoutParams layoutParams3 = linearLayout.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
            layoutParams4.bottomMargin = i + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
            C786410Ut5.W5(linearLayout, layoutParams4);
        }
    }

    public final void LIZ$2() {
        Object objM10unboximpl = ((C189200o6) this.l0).m10unboximpl();
        if (C189200o6.m7isFailureimpl(objM10unboximpl)) {
            objM10unboximpl = null;
        }
        Integer num = (Integer) objM10unboximpl;
        if (num == null || num.intValue() < 0) {
            return;
        }
        Effect effect = (Effect) ListProtector.get((List) this.l1, num.intValue());
        EffectTemplateCategoryFragment effectTemplateCategoryFragment = (EffectTemplateCategoryFragment) this.l2;
        int size = ((List) this.l1).size();
        int size2 = ((List) this.l3).size();
        ((EffectTemplateCategoryFragment) this.l2).cS((((effectTemplateCategoryFragment.LLJZ.getItemCount() - size2) - 1) - size) + num.intValue(), num.intValue(), effect);
    }

    public final void LIZ$3() throws JSONException {
        int iLIZIZ = C318400Cdy.LIZIZ(C318400Cdy.LIZ(C13LP.LJJLIIIJ(C13EQ.LJJIJLIJ((Set) this.l0), ",", null, null, 0, null, null, 62)));
        Integer num = (Integer) this.l1;
        if (num == null || iLIZIZ != num.intValue()) {
            C311520CJa.LIZ.getClass();
            C311520CJa.LIZIZ();
            C0CJ2.LJI("{}");
            C311600CJi c311600CJi = (C311600CJi) this.l2;
            if (c311600CJi != null) {
                c311600CJi.LJ(1);
            }
            ((FetchABTestCommonChunkTask) this.l3).LLILZIL = EnumC311620CJk.HASH_CHECK_FAILED;
        }
    }

    public final void LIZ$4() {
        n nVar;
        try {
            C0CKZ c0ckz = C0CKZ.LIZLLL;
            c0ckz.LJ("ab_settings_migrate");
            c0ckz.LJ("ab_settings_migrate_before_save_config_data");
            C0CJ1 c0cj1 = ((FetchABTestCommonOptimizedChunkTask) this.l0).LLILLJJLI.LJFF;
            String string = ((Keva) c0cj1.LJII.getValue()).getString(c0cj1.LIZJ, null);
            if (string == null || (nVar = (n) C08JS.LIZIZ().LJII(string, n.class)) == null) {
                nVar = new n();
            }
            n nVar2 = new n();
            HashSet hashSetLLIFFJFJJ = C13LP.LLIFFJFJJ(nVar.LJJIJIL());
            for (Map.Entry<String, k> entry : ((n) this.l1).entrySet()) {
                nVar.LJJIFFI(entry.getKey(), entry.getValue());
            }
            List list = (List) this.l2;
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    nVar.LJJIJL((String) it2.next());
                }
            }
            n nVarLIZ = ((FetchABTestCommonOptimizedChunkTask) this.l0).LIZ(nVar, nVar2);
            boolean zLIZ = C0BEC.LIZ(C1BWL.LIZ());
            C0CJ1 c0cj12 = ((FetchABTestCommonOptimizedChunkTask) this.l0).LLILLJJLI.LJFF;
            ((Keva) c0cj12.LJII.getValue()).storeString(c0cj12.LIZJ, new OtisGson().LIZIZ(nVar, zLIZ, 5242880));
            new n();
            ((Function2) this.l3).invoke(nVar2, hashSetLLIFFJFJJ);
            if (C1702430uP3.LIZJ) {
                C2187451AjH.LJFF(2000L);
            }
            C1150504el.LIZ().LIZLLL("method_save_config_value", false);
            if (C2187891Ajz.LIZJ()) {
                Map<String, C1505630pHd> map = C2187801Ajq.LIZ;
                ThreadMethodProxy.setPriority(C786410Ut5.u3(), 1);
            }
            C0CKZ c0ckz2 = C0CKZ.LIZLLL;
            c0ckz2.LJI("ab_settings_migrate_before_save_config_data");
            c0ckz2.LJ("ab_settings_migrate_save_config_data");
            c0ckz2.LJI("ab_settings_migrate_save_config_data");
            c0ckz2.LJ("ab_settings_migrate_inject_ab_response");
            C15O7.LIZIZ(new Callable() { // from class: X.0CKh
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Unit unit;
                    C1C7U.LIZ("FetchABTestCommonOptimizedChunkTask@1720.handleSettingsMigrateIfNeed$1$2$2");
                    if (C0CCS.LIZ) {
                        C2187451AjH.LJJI(3000L);
                    }
                    IAbTestManager iAbTestManager = (IAbTestManager) PluggableExtentionKt.pluggableSpi$default(IAbTestManager.class, false, false, false, 14, null);
                    if (iAbTestManager != null) {
                        iAbTestManager.LIZLLL(true);
                        unit = Unit.LIZ;
                    } else {
                        unit = null;
                    }
                    C1C7U.LIZIZ("FetchABTestCommonOptimizedChunkTask@1720.handleSettingsMigrateIfNeed$1$2$2");
                    return unit;
                }
            }, C15O7.LJIIIIZZ, null);
            AbstractC305760Byg.LLIZLLLIL.LIZLLL(nVarLIZ);
            if (C1852707Nl.LIZ()) {
                Thread.sleep(C072Z.LIZ());
            }
            IAbTestManager iAbTestManager = (IAbTestManager) PluggableExtentionKt.pluggableSpi$default(IAbTestManager.class, false, false, false, 14, null);
            if (iAbTestManager != null) {
                iAbTestManager.LIZIZ(nVarLIZ);
            }
            if (C2187891Ajz.LIZJ()) {
                Map<String, C1505630pHd> map2 = C2187801Ajq.LIZ;
                ThreadMethodProxy.setPriority(C786410Ut5.u3(), 5);
            }
            C1150504el.LIZ().LJI("method_save_config_value", false);
            C0C4Z.LIZ = null;
            if (!C1720406oU.LIZIZ.LIZ("config_fetch_success")) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "1");
                c2344009Gk.LJIIIIZZ("source", CardStruct.IStatusCode.DEFAULT);
                c2344009Gk.LIZJ(1, "is_adapter");
                C20684815ws.LJIILLIIL("config_fetch_success", c2344009Gk.LIZ);
            }
            c0ckz2.LJI("ab_settings_migrate_inject_ab_response");
            C0CJW.LIZLLL.LJI(SystemClock.uptimeMillis() - C202094145s.LJIILL, "ab_settings_migrate_inject_ab_response_coordinate");
            c0ckz2.LJI("ab_settings_migrate");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LIZ$5() {
        n nVar;
        try {
            C0CKZ c0ckz = C0CKZ.LIZLLL;
            c0ckz.LJ("ab_settings_migrate");
            c0ckz.LJ("ab_settings_migrate_before_save_config_data");
            C0CJ1 c0cj1 = ((FetchABTestCommonOptimizedRequest) this.l0).LLILLJJLI.LJFF;
            String string = ((Keva) c0cj1.LJII.getValue()).getString(c0cj1.LIZJ, null);
            if (string == null || (nVar = (n) C08JS.LIZIZ().LJII(string, n.class)) == null) {
                nVar = new n();
            }
            n nVar2 = new n();
            HashSet hashSetLLIFFJFJJ = C13LP.LLIFFJFJJ(nVar.LJJIJIL());
            for (Map.Entry<String, k> entry : ((n) this.l1).entrySet()) {
                nVar.LJJIFFI(entry.getKey(), entry.getValue());
            }
            List list = (List) this.l2;
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    nVar.LJJIJL((String) it2.next());
                }
            }
            n nVarLIZ = ((FetchABTestCommonOptimizedRequest) this.l0).LIZ(nVar, nVar2);
            boolean zLIZ = C0BEC.LIZ(C1BWL.LIZ());
            C0CJ1 c0cj12 = ((FetchABTestCommonOptimizedRequest) this.l0).LLILLJJLI.LJFF;
            ((Keva) c0cj12.LJII.getValue()).storeString(c0cj12.LIZJ, new OtisGson().LIZIZ(nVar, zLIZ, 5242880));
            new n();
            ((Function2) this.l3).invoke(nVar2, hashSetLLIFFJFJJ);
            if (C1702430uP3.LIZJ) {
                C2187451AjH.LJFF(2000L);
            }
            C1150504el.LIZ().LIZLLL("method_save_config_value", false);
            if (C2187891Ajz.LIZJ()) {
                Map<String, C1505630pHd> map = C2187801Ajq.LIZ;
                ThreadMethodProxy.setPriority(C786410Ut5.u3(), 1);
            }
            C0CKZ c0ckz2 = C0CKZ.LIZLLL;
            c0ckz2.LJI("ab_settings_migrate_before_save_config_data");
            c0ckz2.LJ("ab_settings_migrate_save_config_data");
            c0ckz2.LJI("ab_settings_migrate_save_config_data");
            c0ckz2.LJ("ab_settings_migrate_inject_ab_response");
            C15O7.LIZIZ(new Callable() { // from class: X.0CKi
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Unit unit;
                    C1C7U.LIZ("FetchABTestCommonOptimizedRequest@46af.handleSettingsMigrateIfNeed$1$2$2");
                    if (C0CCS.LIZ) {
                        C2187451AjH.LJJI(3000L);
                    }
                    IAbTestManager iAbTestManager = (IAbTestManager) PluggableExtentionKt.pluggableSpi$default(IAbTestManager.class, false, false, false, 14, null);
                    if (iAbTestManager != null) {
                        iAbTestManager.LIZLLL(true);
                        unit = Unit.LIZ;
                    } else {
                        unit = null;
                    }
                    C1C7U.LIZIZ("FetchABTestCommonOptimizedRequest@46af.handleSettingsMigrateIfNeed$1$2$2");
                    return unit;
                }
            }, C15O7.LJIIIIZZ, null);
            AbstractC305760Byg.LLIZLLLIL.LIZLLL(nVarLIZ);
            if (C1852707Nl.LIZ()) {
                Thread.sleep(C072Z.LIZ());
            }
            IAbTestManager iAbTestManager = (IAbTestManager) PluggableExtentionKt.pluggableSpi$default(IAbTestManager.class, false, false, false, 14, null);
            if (iAbTestManager != null) {
                iAbTestManager.LIZIZ(nVarLIZ);
            }
            if (C2187891Ajz.LIZJ()) {
                Map<String, C1505630pHd> map2 = C2187801Ajq.LIZ;
                ThreadMethodProxy.setPriority(C786410Ut5.u3(), 5);
            }
            C1150504el.LIZ().LJI("method_save_config_value", false);
            C0C4Z.LIZ = null;
            if (!C1720406oU.LIZIZ.LIZ("config_fetch_success")) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "1");
                c2344009Gk.LJIIIIZZ("source", CardStruct.IStatusCode.DEFAULT);
                c2344009Gk.LIZJ(1, "is_adapter");
                C20684815ws.LJIILLIIL("config_fetch_success", c2344009Gk.LIZ);
            }
            c0ckz2.LJI("ab_settings_migrate_inject_ab_response");
            C0CJW.LIZLLL.LJI(SystemClock.uptimeMillis() - C202094145s.LJIILL, "ab_settings_migrate_inject_ab_response_coordinate");
            c0ckz2.LJI("ab_settings_migrate");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LIZ$6() {
        n nVar;
        try {
            C0CKZ c0ckz = C0CKZ.LIZLLL;
            c0ckz.LJ("ab_settings_migrate");
            c0ckz.LJ("ab_settings_migrate_before_save_config_data");
            C0CJ1 c0cj1 = ((FetchABTestCommonOptimizedTask) this.l0).LLILLJJLI.LJFF;
            String string = ((Keva) c0cj1.LJII.getValue()).getString(c0cj1.LIZJ, null);
            if (string == null || (nVar = (n) C08JS.LIZIZ().LJII(string, n.class)) == null) {
                nVar = new n();
            }
            n nVar2 = new n();
            HashSet hashSetLLIFFJFJJ = C13LP.LLIFFJFJJ(nVar.LJJIJIL());
            for (Map.Entry<String, k> entry : ((n) this.l1).entrySet()) {
                nVar.LJJIFFI(entry.getKey(), entry.getValue());
            }
            List list = (List) this.l2;
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    nVar.LJJIJL((String) it2.next());
                }
            }
            n nVarLIZ = ((FetchABTestCommonOptimizedTask) this.l0).LIZ(nVar, nVar2);
            boolean zLIZ = C0BEC.LIZ(C1BWL.LIZ());
            C0CJ1 c0cj12 = ((FetchABTestCommonOptimizedTask) this.l0).LLILLJJLI.LJFF;
            ((Keva) c0cj12.LJII.getValue()).storeString(c0cj12.LIZJ, new OtisGson().LIZIZ(nVar, zLIZ, 5242880));
            new n();
            ((Function2) this.l3).invoke(nVar2, hashSetLLIFFJFJJ);
            if (C1702430uP3.LIZJ) {
                C2187451AjH.LJFF(2000L);
            }
            C1150504el.LIZ().LIZLLL("method_save_config_value", false);
            if (C2187891Ajz.LIZJ()) {
                Map<String, C1505630pHd> map = C2187801Ajq.LIZ;
                ThreadMethodProxy.setPriority(C786410Ut5.u3(), 1);
            }
            C0CKZ c0ckz2 = C0CKZ.LIZLLL;
            c0ckz2.LJI("ab_settings_migrate_before_save_config_data");
            c0ckz2.LJ("ab_settings_migrate_save_config_data");
            c0ckz2.LJI("ab_settings_migrate_save_config_data");
            c0ckz2.LJ("ab_settings_migrate_inject_ab_response");
            C15O7.LIZIZ(new Callable() { // from class: X.0CKj
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Unit unit;
                    C1C7U.LIZ("FetchABTestCommonOptimizedTask@962.handleSettingsMigrateIfNeed$1$2$2");
                    if (C0CCS.LIZ) {
                        C2187451AjH.LJJI(3000L);
                    }
                    IAbTestManager iAbTestManager = (IAbTestManager) PluggableExtentionKt.pluggableSpi$default(IAbTestManager.class, false, false, false, 14, null);
                    if (iAbTestManager != null) {
                        iAbTestManager.LIZLLL(true);
                        unit = Unit.LIZ;
                    } else {
                        unit = null;
                    }
                    C1C7U.LIZIZ("FetchABTestCommonOptimizedTask@962.handleSettingsMigrateIfNeed$1$2$2");
                    return unit;
                }
            }, C15O7.LJIIIIZZ, null);
            AbstractC305760Byg.LLIZLLLIL.LIZLLL(nVarLIZ);
            if (C1852707Nl.LIZ()) {
                Thread.sleep(C072Z.LIZ());
            }
            IAbTestManager iAbTestManager = (IAbTestManager) PluggableExtentionKt.pluggableSpi$default(IAbTestManager.class, false, false, false, 14, null);
            if (iAbTestManager != null) {
                iAbTestManager.LIZIZ(nVarLIZ);
            }
            if (C2187891Ajz.LIZJ()) {
                Map<String, C1505630pHd> map2 = C2187801Ajq.LIZ;
                ThreadMethodProxy.setPriority(C786410Ut5.u3(), 5);
            }
            C1150504el.LIZ().LJI("method_save_config_value", false);
            C0C4Z.LIZ = null;
            if (!C1720406oU.LIZIZ.LIZ("config_fetch_success")) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "1");
                c2344009Gk.LJIIIIZZ("source", CardStruct.IStatusCode.DEFAULT);
                c2344009Gk.LIZJ(1, "is_adapter");
                C20684815ws.LJIILLIIL("config_fetch_success", c2344009Gk.LIZ);
            }
            c0ckz2.LJI("ab_settings_migrate_inject_ab_response");
            C0CJW.LIZLLL.LJI(SystemClock.uptimeMillis() - C202094145s.LJIILL, "ab_settings_migrate_inject_ab_response_coordinate");
            c0ckz2.LJI("ab_settings_migrate");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v74, types: [T, java.lang.String] */
    public final void LIZ$7() {
        ForegroundColorSpan foregroundColorSpan;
        int width = ((View) this.l0).getWidth();
        float fMeasureText = ((TuxTextView) this.l1).getPaint().measureText((String) ((C259800zU) this.l2).element);
        ((TuxTextView) this.l1).setTuxFont(63);
        float fMeasureText2 = ((TuxTextView) this.l1).getPaint().measureText((String) ((C259800zU) this.l3).element);
        ((TuxTextView) this.l1).setTuxFont(72);
        float f = width;
        if (fMeasureText <= f && fMeasureText + fMeasureText2 > f) {
            C259800zU c259800zU = (C259800zU) this.l3;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('\n');
            sbLIZ.append((String) ((C259800zU) this.l3).element);
            c259800zU.element = C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append((String) ((C259800zU) this.l2).element);
        sbLIZ2.append((String) ((C259800zU) this.l3).element);
        SpannableString spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ2));
        PoiPublishRetagOptimizationExperiment.LIZ.getClass();
        PoiPublishRetagOptimizationExperiment.Config config = PoiPublishRetagOptimizationExperiment.LIZIZ;
        Boolean bool = config.bannerUseNewColor;
        int i = (bool == null || !bool.booleanValue()) ? R.attr.a04 : R.attr.a1n;
        Boolean bool2 = config.bannerUseNewColor;
        if (bool2 == null || !bool2.booleanValue()) {
            Integer numLIZJ = C1308910kAL.LIZJ(i, ((TuxTextView) this.l1).getContext());
            foregroundColorSpan = new ForegroundColorSpan(numLIZJ != null ? numLIZJ.intValue() : 0);
        } else {
            Integer numLIZJ2 = C1308910kAL.LIZJ(i, new C1361400lX0(((TuxTextView) this.l1).getContext(), R.style.z4));
            foregroundColorSpan = new ForegroundColorSpan(numLIZJ2 != null ? numLIZJ2.intValue() : 0);
        }
        C786410Ut5.p2(spannableString, foregroundColorSpan, ((String) ((C259800zU) this.l2).element).length(), ((String) ((C259800zU) this.l2).element).length() + ((String) ((C259800zU) this.l3).element).length(), 17);
        C786410Ut5.p2(spannableString, 63, ((String) ((C259800zU) this.l2).element).length(), ((String) ((C259800zU) this.l2).element).length() + ((String) ((C259800zU) this.l3).element).length(), 17);
        ((TuxTextView) this.l1).setText(spannableString);
    }

    public static final void run$0(ARunnableS13S0400000_4 aRunnableS13S0400000_4) {
        boolean zLIZ;
        C1C7U.LIZ("FetchABTestCommonRequest@87b9.request$result$5$runnable$1");
        try {
            aRunnableS13S0400000_4.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FetchABTestCommonRequest@87b9.request$result$5$runnable$1");
    }

    public static final void run$1(ARunnableS13S0400000_4 aRunnableS13S0400000_4) {
        boolean zLIZ;
        C1C7U.LIZ("ProfileBgVideoPreviewActivity@7f12.updateDisplayReadOnlyPlaybackUiPosition$1");
        try {
            aRunnableS13S0400000_4.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProfileBgVideoPreviewActivity@7f12.updateDisplayReadOnlyPlaybackUiPosition$1");
    }

    public static final void run$2(ARunnableS13S0400000_4 aRunnableS13S0400000_4) {
        boolean zLIZ;
        C1C7U.LIZ("EffectTemplateCategoryFragment@9d8c.showNonEmptyView$2");
        try {
            aRunnableS13S0400000_4.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EffectTemplateCategoryFragment@9d8c.showNonEmptyView$2");
    }

    public static final void run$3(ARunnableS13S0400000_4 aRunnableS13S0400000_4) {
        boolean zLIZ;
        C1C7U.LIZ("FetchABTestCommonChunkTask@eeed.storeValue$runnable$1$1$10");
        try {
            aRunnableS13S0400000_4.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FetchABTestCommonChunkTask@eeed.storeValue$runnable$1$1$10");
    }

    public static final void run$4(ARunnableS13S0400000_4 aRunnableS13S0400000_4) {
        boolean zLIZ;
        C1C7U.LIZ("FetchABTestCommonOptimizedChunkTask@1720.handleSettingsMigrateIfNeed$1");
        try {
            aRunnableS13S0400000_4.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FetchABTestCommonOptimizedChunkTask@1720.handleSettingsMigrateIfNeed$1");
    }

    public static final void run$5(ARunnableS13S0400000_4 aRunnableS13S0400000_4) {
        boolean zLIZ;
        C1C7U.LIZ("FetchABTestCommonOptimizedRequest@46af.handleSettingsMigrateIfNeed$1");
        try {
            aRunnableS13S0400000_4.LIZ$5();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FetchABTestCommonOptimizedRequest@46af.handleSettingsMigrateIfNeed$1");
    }

    public static final void run$6(ARunnableS13S0400000_4 aRunnableS13S0400000_4) {
        boolean zLIZ;
        C1C7U.LIZ("FetchABTestCommonOptimizedTask@962.handleSettingsMigrateIfNeed$1");
        try {
            aRunnableS13S0400000_4.LIZ$6();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FetchABTestCommonOptimizedTask@962.handleSettingsMigrateIfNeed$1");
    }

    public static final void run$7(ARunnableS13S0400000_4 aRunnableS13S0400000_4) {
        boolean zLIZ;
        C1C7U.LIZ("ApmAgent@713b.monitorEvent$2");
        try {
            C305780Byi c305780Byi = (C305780Byi) aRunnableS13S0400000_4.l0;
            JSONObject jSONObjectLIZ = new C790600Uzq(c305780Byi.LIZ, c305780Byi.LIZIZ, (JSONObject) aRunnableS13S0400000_4.l1, (JSONObject) aRunnableS13S0400000_4.l2, (JSONObject) aRunnableS13S0400000_4.l3).LIZ();
            if (jSONObjectLIZ != null) {
                C793770VBv.LJIIZILJ("monitorEvent", C786410Ut5.J3(jSONObjectLIZ));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ApmAgent@713b.monitorEvent$2");
    }

    public static final void run$8(ARunnableS13S0400000_4 aRunnableS13S0400000_4) {
        boolean zLIZ;
        C1C7U.LIZ("PoiReTagBottomBarScene@a3f1.tryShow$lambda$13$$inlined$doOnPreDraw$1");
        try {
            aRunnableS13S0400000_4.LIZ$7();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PoiReTagBottomBarScene@a3f1.tryShow$lambda$13$$inlined$doOnPreDraw$1");
    }

    public ARunnableS13S0400000_4(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
