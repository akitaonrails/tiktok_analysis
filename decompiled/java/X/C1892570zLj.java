package X;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.localservice.live.common.config.TtlsLiveConfigSettings;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zLj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1892570zLj implements IFrameSlot {
    public final boolean LL;
    public final EnumC756810TmR LLILLJJLI;
    public final Function0<JSONObject> LLILLL;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLILZ;
    public k LLILZIL;
    public Integer LLILZLL;

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final /* bridge */ /* synthetic */ InterfaceC752610Tff LIZJ() {
        return null;
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final /* bridge */ /* synthetic */ String getScheme() {
        return null;
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final /* synthetic */ void onHide() {
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Rect LIZ() {
        /*
            r6 = this;
            X.0TmR r0 = r6.LLILLJJLI
            r5 = 0
            if (r0 != 0) goto L6
            return r5
        L6:
            X.0qEB r0 = r6.LLILZ
            if (r0 != 0) goto Lb
            return r5
        Lb:
            java.lang.Class<com.ss.android.ugc.aweme.live.ILiveOuterService> r0 = com.ss.android.ugc.aweme.live.ILiveOuterService.class
            r1 = 0
            r4 = 14
            r2 = r1
            r3 = r1
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r0, r1, r2, r3, r4, r5)
            com.ss.android.ugc.aweme.live.ILiveOuterService r0 = (com.ss.android.ugc.aweme.live.ILiveOuterService) r0
            if (r0 == 0) goto L44
            X.0TmP r2 = r0.j6()
            if (r2 == 0) goto L44
            X.0qEB r0 = r6.LLILZ
            if (r0 == 0) goto L42
            android.content.Context r1 = r0.getContext()
        L28:
            X.0TmR r0 = r6.LLILLJJLI
            android.graphics.Rect r2 = r2.getIconSlotLocation(r1, r0)
            if (r2 == 0) goto L45
            float r0 = r2.exactCenterX()
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
        L38:
            r0 = 0
            boolean r0 = kotlin.jvm.internal.Intrinsics.LIZLLL(r1, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L47
            return r2
        L42:
            r1 = r5
            goto L28
        L44:
            r2 = r5
        L45:
            r1 = r5
            goto L38
        L47:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1892570zLj.LIZ():android.graphics.Rect");
    }

    public final String LIZIZ() {
        k kVarLJJIIZ;
        try {
            k kVar = this.LLILZIL;
            if (kVar != null && (kVarLJJIIZ = kVar.LJIILIIL().LJJIIZ("product_id")) != null) {
                String strLJIL = kVarLJJIIZ.LJIL();
                if (strLJIL != null) {
                    return strLJIL;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return "";
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final Animation LJIIZILJ() {
        float f;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Rect rectLIZ = LIZ();
        int i = 0;
        int i2 = rectLIZ == null ? 1 : 0;
        if (rectLIZ != null) {
            float fExactCenterX = rectLIZ.exactCenterX();
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILZ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                ViewGroup.LayoutParams layoutParams = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    i = marginLayoutParams.leftMargin;
                }
            }
            f = fExactCenterX - i;
        } else {
            f = 0.0f;
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, i2, f, 1, 1.0f);
        scaleAnimation.setDuration(320L);
        scaleAnimation.setInterpolator(C0GY9.LIZIZ(0.17f, 0.0f, 0.26f, 1.0f));
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(scaleAnimation);
        return animationSet;
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final Animation LJIJ() {
        float f;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Rect rectLIZ = LIZ();
        int i = 0;
        int i2 = rectLIZ == null ? 1 : 0;
        if (rectLIZ != null) {
            float fExactCenterX = rectLIZ.exactCenterX();
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILZ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                ViewGroup.LayoutParams layoutParams = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    i = marginLayoutParams.leftMargin;
                }
            }
            f = fExactCenterX - i;
        } else {
            f = 0.0f;
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, i2, f, 1, 1.0f);
        scaleAnimation.setDuration(320L);
        scaleAnimation.setInterpolator(C0GY9.LIZIZ(0.17f, 0.0f, 0.26f, 1.0f));
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(scaleAnimation);
        return animationSet;
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final View LJIJI(Context context) {
        String str;
        String strJ3;
        JSONObject jSONObjectInvoke;
        if (this.LLILZIL == null) {
            return null;
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILZ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            return sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        }
        try {
            if (this.LL) {
                TtlsLiveConfigSettings.PopCardConfigModel popCardConfigModel = TtlsLiveConfigSettings.LIZ().popCardConfig;
                if (popCardConfigModel == null || (str = popCardConfigModel.audienceProductCardSchema) == null) {
                    str = "aweme://roma_redirect/?spark_page=poi_live_pop_product_card&live_scene=0";
                }
            } else {
                TtlsLiveConfigSettings.PopCardConfigModel popCardConfigModel2 = TtlsLiveConfigSettings.LIZ().popCardConfig;
                if (popCardConfigModel2 == null || (str = popCardConfigModel2.anchorProductCardSchema) == null) {
                    str = "aweme://roma_redirect/?spark_page=poi_live_pop_product_card&live_scene=1";
                }
            }
            Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
            Function0<JSONObject> function0 = this.LLILLL;
            if (function0 == null || (jSONObjectInvoke = function0.invoke()) == null || (strJ3 = C786410Ut5.J3(jSONObjectInvoke)) == null) {
                strJ3 = "{}";
            }
            builderBuildUpon.appendQueryParameter("pt_info", strJ3);
            String string = builderBuildUpon.toString();
            SparkContext sparkContext = new SparkContext();
            sparkContext.LJJLIIJ(string);
            n nVar = new n();
            nVar.LJJIFFI("pined_product", this.LLILZIL);
            Integer num = this.LLILZLL;
            if (num != null) {
                nVar.LJJIII(Integer.valueOf(num.intValue()), "pin_second_duration");
            }
            sparkContext.initData = nVar.toString();
            C1541950qED.LIZJ.getClass();
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = new C1541950qED(context, sparkContext).LIZ(false);
            C1546210qL5.LIZ.getClass();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, C814420VxA.LIZIZ(C1546210qL5.LIZ(90)));
            layoutParams.setMarginStart(C814420VxA.LIZIZ(C1546210qL5.LIZ(12)));
            C786410Ut5.C6(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ, layoutParams);
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.LJIIIIZZ();
            this.LLILZ = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ;
            return sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2276471E8n.LIZIZ.e("ttls-live", "ExplanationCardLiveSlot====getContentView===", e);
            return null;
        }
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final void LJIJJ(String str) {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILZ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            boolean z = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
        }
        this.LLILZ = null;
    }

    public final void LIZLLL(k kVar, Integer num) {
        String strLJIL;
        InterfaceC1541990qEH kitView;
        if (kVar != null) {
            try {
                k kVarLJJIIZ = kVar.LJIILIIL().LJJIIZ("product_id");
                if (kVarLJJIIZ != null) {
                    strLJIL = kVarLJJIIZ.LJIL();
                } else {
                    strLJIL = null;
                }
                if (Intrinsics.LJFF(strLJIL, LIZIZ())) {
                    this.LLILZIL = kVar;
                    this.LLILZLL = num;
                    SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILZ;
                    if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) != null) {
                        n nVar = new n();
                        nVar.LJJIFFI("pined_product", kVar);
                        if (num != null) {
                            nVar.LJJIII(Integer.valueOf(num.intValue()), "pin_second_duration");
                        }
                        kitView.d1(nVar.toString());
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2276471E8n c2276471E8n = C2276471E8n.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updateCardData===forWatcher=");
                sbLIZ.append(this.LL);
                sbLIZ.append("===productId=");
                sbLIZ.append(LIZIZ());
                c2276471E8n.LIZJ("ttls-live", e, "ExplanationCardLiveSlot", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1892570zLj(boolean z, EnumC756810TmR enumC756810TmR, Function0<? extends JSONObject> function0) {
        this.LL = z;
        this.LLILLJJLI = enumC756810TmR;
        this.LLILLL = function0;
    }
}
