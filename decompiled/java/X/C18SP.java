package X;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxViewClient;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.dynamic.card.data.CardInfo;
import com.ss.android.ugc.aweme.dynamic.card.data.DynamicClientData;
import com.ss.android.ugc.aweme.dynamic.card.data.MessageInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.message.template.card.DynamicCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicUiLocationType;
import com.ss.android.ugc.aweme.im.message.template.component.FallbackInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.IconTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.messagelist.protocols.DynamicCardReusedUISlot;
import com.ss.android.ugc.aweme.im.messagelist.protocols.IMDynamicCardFrame;
import com.zhiliaoapp.musically.R;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import okio.ByteString;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18SP, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18SP implements C0ZVX {
    public static final /* synthetic */ int LJIILJJIL = 0;
    public final ViewGroup LIZ;
    public final C18SV LIZIZ;
    public final C18SU LIZJ;
    public final C18ST LIZLLL;
    public final C189W LJ;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LJFF;
    public C869590Y9l LJII;
    public DynamicCardTemplate LJIIIIZZ;
    public DynamicInfoComponent LJIIIZ;
    public boolean LJIIJ;
    public String LJI = "";
    public long LJIIJJI = -1;
    public final ConcurrentHashMap<String, String> LJIIL = new ConcurrentHashMap<>();
    public final ViewTreeObserverOnWindowFocusChangeListenerC20575215fC LJIILIIL = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: X.15fC
        @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
        public final void onWindowFocusChanged(boolean z) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
            if (z && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LL.LJFF) != null) {
                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.requestLayout();
            }
        }
    };

    @Override // X.C0ZVX
    public final void LJFF() {
    }

    @Override // X.C0ZVX
    public final void LIZ() {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LJFF;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
        }
    }

    @Override // X.C0ZVX
    public final boolean LIZIZ() {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LJFF;
        return sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LIZIZ();
    }

    @Override // X.C0ZVX
    public final void LJI() {
        DynamicCardTemplate dynamicCardTemplate;
        C869590Y9l c869590Y9l = this.LJII;
        if (c869590Y9l == null || (dynamicCardTemplate = this.LJIIIIZZ) == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LJIIIZ(c869590Y9l, dynamicCardTemplate, linkedHashMap);
        LJIIL(linkedHashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ() {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.im.message.template.card.DynamicCardTemplate r0 = r6.LJIIIIZZ
            r2 = 0
            if (r0 == 0) goto Lb4
            com.ss.android.ugc.aweme.im.message.template.component.FallbackInfoComponent r0 = r0.fallbackInfo
            if (r0 == 0) goto Lb4
            com.ss.android.ugc.aweme.im.message.template.component.ImageComponent r0 = r0.imageComponent
            if (r0 == 0) goto Lb4
            com.ss.android.ugc.aweme.im.message.template.component.IconTypeComponent r0 = r0.iconType
            if (r0 == 0) goto Lb4
            int[] r1 = X.C902240ZaQ.LIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 == r0) goto Lb0
            r0 = 2
            if (r1 != r0) goto Lb4
            X.0ZVa r4 = X.EnumC900680ZVa.MODERATION
        L21:
            X.0qEB r0 = r6.LJFF
            if (r0 == 0) goto L28
            X.C1584506Ih.LIZ(r0)
        L28:
            int r0 = X.C900710ZVd.LIZ
            X.0Y9l r5 = r6.LJII
            com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicInfoComponent r3 = r6.LJIIIZ
            if (r3 == 0) goto Lae
            int r0 = r3.defaultWidth
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L42:
            com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicInfoComponent r0 = r6.LJIIIZ
            if (r0 == 0) goto Lac
            int r0 = r0.defaultHeight
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L58:
            kotlin.Pair r3 = X.C900710ZVd.LIZIZ(r5, r3, r1, r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "showFallbackUI("
            r1.append(r0)
            X.0qEB r0 = r6.LJFF
            if (r0 == 0) goto Laa
            int r0 = r0.hashCode()
        L6d:
            r1.append(r0)
            java.lang.String r0 = ", "
            r1.append(r0)
            X.0Y9l r0 = r6.LJII
            if (r0 == 0) goto L7d
            java.lang.String r2 = r0.getUuid()
        L7d:
            r1.append(r2)
            java.lang.String r0 = ") fallbackUiType="
            r1.append(r0)
            r1.append(r4)
            X.C2188811AlT.LIZIZ(r1)
            X.18SV r0 = r6.LIZIZ
            r0.b6(r4)
            X.18SV r2 = r6.LIZIZ
            java.lang.Object r0 = r3.getFirst()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            java.lang.Object r0 = r3.getSecond()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r2.j5(r1, r0)
            return
        Laa:
            r0 = 0
            goto L6d
        Lac:
            r0 = r2
            goto L58
        Lae:
            r1 = r2
            goto L42
        Lb0:
            X.0ZVa r4 = X.EnumC900680ZVa.LOADING
            goto L21
        Lb4:
            X.0ZVa r4 = X.EnumC900680ZVa.NONE
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18SP.LJIIJ():void");
    }

    @Override // X.C0ZVX
    public final void onAttachedToWindow() throws JSONException {
        String uuid;
        InterfaceC1541990qEH kitView;
        C869590Y9l c869590Y9l = this.LJII;
        if (c869590Y9l == null || (uuid = c869590Y9l.getUuid()) == null) {
            return;
        }
        boolean zAdd = this.LIZJ.LIZJ.add(uuid);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAttachedToWindow((");
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LJFF;
        sbLIZ.append(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null ? Integer.valueOf(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.hashCode()) : null);
        sbLIZ.append(", ");
        sbLIZ.append(uuid);
        sbLIZ.append(")) isFirstShow=");
        sbLIZ.append(zAdd);
        C2188811AlT.LIZIZ(sbLIZ);
        JSONObject jSONObjectPut = new JSONObject().put("event", "show").put("is_first_show", zAdd);
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LJFF;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 == null || (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.getKitView()) == null) {
            return;
        }
        kitView.LIZ("dm_page_scroll", jSONObjectPut);
    }

    @Override // X.C0ZVX
    public final void onDetachedFromWindow() throws JSONException {
        InterfaceC1541990qEH kitView;
        JSONObject jSONObjectPut = new JSONObject().put("event", "hide");
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LJFF;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB == null || (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) == null) {
            return;
        }
        kitView.LIZ("dm_page_scroll", jSONObjectPut);
    }

    @Override // X.C0ZVX
    public final void LIZLLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sendEventByJSON eventName = ");
        sbLIZ.append("dm_msg_card_click_event");
        sbLIZ.append(" uuid = ");
        C869590Y9l c869590Y9l = this.LJII;
        sbLIZ.append(c869590Y9l != null ? c869590Y9l.getUuid() : null);
        sbLIZ.append(" this = ");
        sbLIZ.append(hashCode());
        sbLIZ.append(" params = ");
        sbLIZ.append((Object) null);
        C2188811AlT.LIZIZ(sbLIZ);
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LJFF;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LIZ("dm_msg_card_click_event", null);
        }
    }

    @Override // X.C0ZVX
    public final boolean LIZJ() {
        return this.LJIIJ;
    }

    public final void LJIIJJI(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) {
        C869590Y9l c869590Y9l;
        Map mapLIZ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            int width = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getWidth();
            int height = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getHeight();
            if (width == 0 || height == 0 || (c869590Y9l = this.LJII) == null || (mapLIZ = C900710ZVd.LIZ(width, height, c869590Y9l)) == null) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onMeasureUpdate(");
            sbLIZ.append(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.hashCode());
            sbLIZ.append(", ");
            sbLIZ.append(c869590Y9l.getUuid());
            sbLIZ.append(") width=");
            sbLIZ.append(width);
            sbLIZ.append(" height=");
            sbLIZ.append(height);
            C2188811AlT.LIZIZ(sbLIZ);
            C0YNY.LIZ(InterfaceC874680YTa.LIZ).LIZIZ().LJFF(Collections.singletonList(new Pair(c869590Y9l, mapLIZ)), false, new C0Y3I("DynamicCardKitView update cached width/height"));
        }
    }

    public final void LJIIL(Map<String, ? extends Object> map) {
        Object tag;
        Integer numValueOf;
        InterfaceC1541990qEH kitView;
        Integer numValueOf2;
        InterfaceC1541990qEH kitView2;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LJFF;
        String uuid = null;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            tag = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getTag(R.id.xh);
        } else {
            tag = null;
        }
        if (!(tag instanceof Map)) {
            tag = null;
        }
        if (Intrinsics.LJFF(map, tag)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateSparkViewData onShow(");
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LJFF;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null) {
                numValueOf2 = Integer.valueOf(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.hashCode());
            } else {
                numValueOf2 = null;
            }
            sbLIZ.append(numValueOf2);
            sbLIZ.append(", ");
            C869590Y9l c869590Y9l = this.LJII;
            if (c869590Y9l != null) {
                uuid = c869590Y9l.getUuid();
            }
            sbLIZ.append(uuid);
            sbLIZ.append(')');
            C2188811AlT.LIZIZ(sbLIZ);
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 = this.LJFF;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 != null && (kitView2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3.getKitView()) != null) {
                kitView2.onShow();
                return;
            }
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("updateSparkViewData updateData(");
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4 = this.LJFF;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4 != null) {
            numValueOf = Integer.valueOf(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4.hashCode());
        } else {
            numValueOf = null;
        }
        sbLIZ2.append(numValueOf);
        sbLIZ2.append(", ");
        C869590Y9l c869590Y9l2 = this.LJII;
        if (c869590Y9l2 != null) {
            uuid = c869590Y9l2.getUuid();
        }
        sbLIZ2.append(uuid);
        sbLIZ2.append(')');
        C2188811AlT.LIZIZ(sbLIZ2);
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB5 = this.LJFF;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB5 != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB5.getKitView()) != null) {
            kitView.updateData(map);
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB6 = this.LJFF;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB6 == null) {
            return;
        }
        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB6.setTag(R.id.xh, map);
    }

    public static final void LJII(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, String str) {
        ViewGroup.LayoutParams layoutParams;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LIZIZ()) {
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (layoutParams = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getLayoutParams()) != null && layoutParams.width == -2 && layoutParams.height == -2) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("changeSparkViewWrapContent(");
            sbLIZ.append(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.hashCode());
            sbLIZ.append(", ");
            sbLIZ.append(str);
            sbLIZ.append(')');
            C2188811AlT.LIZIZ(sbLIZ);
            ViewGroup.LayoutParams layoutParams2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getLayoutParams();
            if (layoutParams2 == null) {
                return;
            }
            layoutParams2.width = -2;
            layoutParams2.height = -2;
            C786410Ut5.C6(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, layoutParams2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [X.15f7] */
    /* JADX WARN: Type inference failed for: r0v35, types: [T, java.util.Map] */
    @Override // X.C0ZVX
    public final void LJ(C869590Y9l c869590Y9l, DynamicCardTemplate dynamicCardTemplate) throws JSONException {
        int iHashCode;
        String uuid;
        String uuid2;
        FallbackInfoComponent fallbackInfoComponent;
        IconTypeComponent iconTypeComponent;
        final String uuid3;
        String str;
        String str2;
        String scene;
        boolean z;
        SparkContext sparkContext;
        String strLJIJI;
        boolean zLJFF;
        Integer numValueOf;
        Integer numValueOf2;
        String uuid4;
        Integer numValueOf3;
        Integer numValueOf4;
        Integer numValueOf5;
        String uuid5;
        ViewTreeObserver viewTreeObserver;
        String strLJIJI2;
        ImageComponent imageComponent;
        int iHashCode2 = 0;
        this.LJIIJ = false;
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        LJIIIZ(c869590Y9l, dynamicCardTemplate, linkedHashMap);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBind(");
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LJFF;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            iHashCode = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.hashCode();
        } else {
            iHashCode = 0;
        }
        sbLIZ.append(iHashCode);
        sbLIZ.append(", ");
        C869590Y9l c869590Y9l2 = this.LJII;
        if (c869590Y9l2 != null) {
            uuid = c869590Y9l2.getUuid();
        } else {
            uuid = null;
        }
        sbLIZ.append(uuid);
        sbLIZ.append(") schema=");
        sbLIZ.append(this.LJI);
        C2188811AlT.LIZIZ(sbLIZ);
        if (dynamicCardTemplate != null) {
            FallbackInfoComponent fallbackInfoComponent2 = dynamicCardTemplate.fallbackInfo;
            if (fallbackInfoComponent2 == null || (imageComponent = fallbackInfoComponent2.imageComponent) == null || (iconTypeComponent = imageComponent.iconType) == null) {
                iconTypeComponent = IconTypeComponent.DEFAULT;
            }
            boolean z2 = true;
            if (iconTypeComponent == IconTypeComponent.DEFAULT && this.LJIIIZ != null) {
                if (this.LJFF != null) {
                    z = false;
                } else {
                    SparkContext sparkContext2 = new SparkContext();
                    String str3 = this.LJI;
                    C869590Y9l c869590Y9l3 = this.LJII;
                    if (c869590Y9l3 != null) {
                        uuid3 = c869590Y9l3.getUuid();
                    } else {
                        uuid3 = null;
                    }
                    final C259800zU c259800zU = new C259800zU();
                    final ?? r0 = new LynxViewClient() { // from class: X.15f7
                        @Override // com.lynx.tasm.LynxViewClient
                        public final void LJII() {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("onDataUpdated(");
                            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LL.LJFF;
                            sbLIZ2.append(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null ? sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.hashCode() : 0);
                            sbLIZ2.append(", ");
                            sbLIZ2.append(uuid3);
                            sbLIZ2.append(')');
                            C2188811AlT.LIZIZ(sbLIZ2);
                        }

                        @Override // com.lynx.tasm.LynxViewClient
                        public final void LJIIJ() {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("onFirstScreen(");
                            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LL.LJFF;
                            sbLIZ2.append(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null ? sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.hashCode() : 0);
                            sbLIZ2.append(", ");
                            sbLIZ2.append(uuid3);
                            sbLIZ2.append(')');
                            C2188811AlT.LIZIZ(sbLIZ2);
                            C18SP c18sp = this.LL;
                            c18sp.LJIIJJI(c18sp.LJFF);
                            C18SP.LJII(this.LL.LJFF, uuid3);
                        }

                        @Override // com.lynx.tasm.LynxViewClient
                        public final void LJIJ() {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("onPageUpdate(");
                            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LL.LJFF;
                            sbLIZ2.append(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null ? sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.hashCode() : 0);
                            sbLIZ2.append(", ");
                            sbLIZ2.append(uuid3);
                            sbLIZ2.append(')');
                            C2188811AlT.LIZIZ(sbLIZ2);
                            C18SP c18sp = this.LL;
                            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 = c18sp.LJFF;
                            String str4 = uuid3;
                            c18sp.LJIIJJI(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3);
                            C18SP.LJII(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3, str4);
                        }

                        @Override // com.lynx.tasm.LynxViewClient
                        public final void LJJIIZI() {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("onUpdateDataWithoutChange(");
                            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LL.LJFF;
                            sbLIZ2.append(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null ? sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.hashCode() : 0);
                            sbLIZ2.append(", ");
                            sbLIZ2.append(uuid3);
                            sbLIZ2.append(')');
                            C2188811AlT.LIZIZ(sbLIZ2);
                        }
                    };
                    AbstractC1542200qEc abstractC1542200qEc = new AbstractC1542200qEc() { // from class: X.15fE
                        @Override // X.AbstractC1537870q7d
                        public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
                            int iHashCode3;
                            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("onLoadFinish(");
                            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 = this.LLILLJJLI.LJFF;
                            int iHashCode4 = 0;
                            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 != null) {
                                iHashCode3 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3.hashCode();
                            } else {
                                iHashCode3 = 0;
                            }
                            sbLIZ2.append(iHashCode3);
                            sbLIZ2.append(", ");
                            sbLIZ2.append(uuid3);
                            sbLIZ2.append(')');
                            C2188811AlT.LIZIZ(sbLIZ2);
                            C18SP c18sp = this.LLILLJJLI;
                            if (c18sp.LJIIJJI != -1 && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = c18sp.LJFF) != null && sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.LIZIZ()) {
                                long jElapsedRealtime = SystemClock.elapsedRealtime();
                                C18SP c18sp2 = this.LLILLJJLI;
                                long j = jElapsedRealtime - c18sp2.LJIIJJI;
                                C18SP.LJIIIIZZ(c18sp2, uuid3, c259800zU, j, true, 0);
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("onLoadFinish(");
                                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4 = this.LLILLJJLI.LJFF;
                                if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4 != null) {
                                    iHashCode4 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4.hashCode();
                                }
                                sbLIZ3.append(iHashCode4);
                                sbLIZ3.append(", ");
                                sbLIZ3.append(uuid3);
                                sbLIZ3.append(") duration=");
                                sbLIZ3.append(j);
                                C2188811AlT.LIZIZ(sbLIZ3);
                            }
                            this.LLILLJJLI.LJIIJJI = -1L;
                        }

                        @Override // X.AbstractC1537870q7d
                        public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str4) {
                            int iHashCode3;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("onLoadStart(");
                            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LLILLJJLI.LJFF;
                            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null) {
                                iHashCode3 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.hashCode();
                            } else {
                                iHashCode3 = 0;
                            }
                            sbLIZ2.append(iHashCode3);
                            sbLIZ2.append(", ");
                            sbLIZ2.append(uuid3);
                            sbLIZ2.append(')');
                            C2188811AlT.LIZIZ(sbLIZ2);
                            this.LLILLJJLI.LJIIJJI = SystemClock.elapsedRealtime();
                        }

                        @Override // X.AbstractC1537870q7d
                        public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH, String str4, C1542120qEU c1542120qEU) {
                            int iHashCode3;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("onLoadFailed(");
                            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LLILLJJLI.LJFF;
                            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null) {
                                iHashCode3 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.hashCode();
                            } else {
                                iHashCode3 = 0;
                            }
                            sbLIZ2.append(iHashCode3);
                            sbLIZ2.append(", ");
                            sbLIZ2.append(uuid3);
                            sbLIZ2.append(") hybridKitError=");
                            sbLIZ2.append(c1542120qEU.LIZ());
                            C2188811AlT.LIZIZ(sbLIZ2);
                            if (this.LLILLJJLI.LJIIJJI != -1) {
                                long jElapsedRealtime = SystemClock.elapsedRealtime();
                                C18SP c18sp = this.LLILLJJLI;
                                C18SP.LJIIIIZZ(c18sp, uuid3, c259800zU, jElapsedRealtime - c18sp.LJIIJJI, false, c1542120qEU.LIZ);
                            }
                            C18SP c18sp2 = this.LLILLJJLI;
                            c18sp2.LJIIJJI = -1L;
                            c18sp2.LJIIJ();
                        }
                    };
                    AbstractC1539010q9T abstractC1539010q9T = new AbstractC1539010q9T() { // from class: X.15f6
                        @Override // X.AbstractC1539010q9T, X.InterfaceC1057870ddR
                        public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
                            C1537910q7h c1537910q7h;
                            int iHashCode3;
                            if ((interfaceC1531560pxS instanceof C1537910q7h) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) != null) {
                                c1537910q7h.LJIIIIZZ(r0);
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("AbsKitInitParamHandler(");
                                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LJFF;
                                if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null) {
                                    iHashCode3 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.hashCode();
                                } else {
                                    iHashCode3 = 0;
                                }
                                sbLIZ2.append(iHashCode3);
                                sbLIZ2.append(", ");
                                sbLIZ2.append(uuid3);
                                sbLIZ2.append(')');
                                C2188811AlT.LIZIZ(sbLIZ2);
                                c1537910q7h.LJIJJ = TemplateData.LJII(linkedHashMap);
                            }
                        }
                    };
                    AbstractC1542070qEP abstractC1542070qEP = new AbstractC1542070qEP() { // from class: X.18oA
                        @Override // X.InterfaceC1163110gNB
                        public final void LJIIJ(Context context) {
                        }

                        @Override // X.InterfaceC1163110gNB
                        public final View LJJJLIIL(InterfaceC1051240dSk interfaceC1051240dSk) {
                            return null;
                        }

                        @Override // X.InterfaceC1163110gNB
                        public final View LJJL() {
                            return null;
                        }
                    };
                    Pair[] pairArr = new Pair[4];
                    DynamicInfoComponent dynamicInfoComponent = this.LJIIIZ;
                    if (dynamicInfoComponent == null || (str = dynamicInfoComponent.cardTemplate) == null) {
                        str = "";
                    }
                    pairArr[0] = new Pair("card_template", str);
                    DynamicInfoComponent dynamicInfoComponent2 = this.LJIIIZ;
                    if (dynamicInfoComponent2 == null || (str2 = dynamicInfoComponent2.cardKey) == null) {
                        str2 = "";
                    }
                    pairArr[1] = new Pair("card_key", str2);
                    C869590Y9l c869590Y9l4 = this.LJII;
                    if (c869590Y9l4 == null || (scene = c869590Y9l4.getScene()) == null) {
                        scene = "";
                    }
                    pairArr[2] = new Pair("lynx_scene", scene);
                    pairArr[3] = new Pair("is_cached", CardStruct.IStatusCode.DEFAULT);
                    c259800zU.element = C2097608Jq.LJIIIIZZ(pairArr);
                    sparkContext2.LJJLIIJ(str3);
                    sparkContext2.LJJJJZ(abstractC1539010q9T);
                    sparkContext2.LJJJJZI(abstractC1542200qEc);
                    sparkContext2.LJJLIIIJLJLI(abstractC1542070qEP);
                    if (((Number) C0AAF.LIZ.getValue()).intValue() == 1) {
                        sparkContext2.shortLinkUrlCacheMap = this.LJIIL;
                    }
                    C1537900q7g c1537900q7g = C1541950qED.LIZJ;
                    MutableContextWrapper mutableContextWrapper = new MutableContextWrapper(this.LIZ.getContext());
                    c1537900q7g.getClass();
                    SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = new C1541950qED(mutableContextWrapper, sparkContext2).LIZ(false);
                    this.LJFF = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ;
                    this.LIZ.addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ, 0);
                    z = true;
                }
                this.LJIIJ = !z;
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LJFF;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null) {
                    C1584506Ih.LIZIZ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2);
                }
                this.LIZIZ.C5();
                this.LIZIZ.j5(-2, -2);
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 = this.LJFF;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 != null) {
                    sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3.getSparkContext();
                } else {
                    sparkContext = null;
                }
                if (((Number) C0AAF.LIZ.getValue()).intValue() == 1) {
                    if (sparkContext != null) {
                        strLJIJI2 = sparkContext.LJIJI();
                    } else {
                        strLJIJI2 = null;
                    }
                    if (Intrinsics.LJFF(strLJIJI2, this.LJI) || (sparkContext != null && sparkContext.LJJJJI(sparkContext.LJIJI(), this.LJI))) {
                        zLJFF = true;
                    } else {
                        zLJFF = false;
                    }
                } else {
                    if (sparkContext != null) {
                        strLJIJI = sparkContext.LJIJI();
                    } else {
                        strLJIJI = null;
                    }
                    zLJFF = Intrinsics.LJFF(strLJIJI, this.LJI);
                }
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4 = this.LJFF;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4 != null && sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4.LIZIZ() && zLJFF) {
                    z2 = false;
                }
                if (!this.LJIIJ || z2) {
                    SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB5 = this.LJFF;
                    if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB5 != null && (viewTreeObserver = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB5.getViewTreeObserver()) != null) {
                        viewTreeObserver.removeOnWindowFocusChangeListener(this.LJIILIIL);
                        viewTreeObserver.addOnWindowFocusChangeListener(this.LJIILIIL);
                    }
                    int i = C900710ZVd.LIZ;
                    C869590Y9l c869590Y9l5 = this.LJII;
                    DynamicInfoComponent dynamicInfoComponent3 = this.LJIIIZ;
                    if (dynamicInfoComponent3 != null) {
                        numValueOf = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(dynamicInfoComponent3.defaultWidth))));
                    } else {
                        numValueOf = null;
                    }
                    DynamicInfoComponent dynamicInfoComponent4 = this.LJIIIZ;
                    if (dynamicInfoComponent4 != null) {
                        numValueOf2 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(dynamicInfoComponent4.defaultHeight))));
                    } else {
                        numValueOf2 = null;
                    }
                    Pair pairLIZIZ = C900710ZVd.LIZIZ(c869590Y9l5, dynamicInfoComponent3, numValueOf, numValueOf2);
                    int iIntValue = ((Number) pairLIZIZ.getFirst()).intValue();
                    int iIntValue2 = ((Number) pairLIZIZ.getSecond()).intValue();
                    SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB6 = this.LJFF;
                    if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB6 != null) {
                        ViewGroup.LayoutParams layoutParams = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB6.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.width = iIntValue;
                            layoutParams.height = iIntValue2;
                        } else {
                            layoutParams = null;
                        }
                        C786410Ut5.C6(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB6, layoutParams);
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("setContainerSize(");
                    SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB7 = this.LJFF;
                    if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB7 != null) {
                        iHashCode2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB7.hashCode();
                    }
                    sbLIZ2.append(iHashCode2);
                    sbLIZ2.append(", ");
                    C869590Y9l c869590Y9l6 = this.LJII;
                    if (c869590Y9l6 != null) {
                        uuid4 = c869590Y9l6.getUuid();
                    } else {
                        uuid4 = null;
                    }
                    sbLIZ2.append(uuid4);
                    sbLIZ2.append(") width=");
                    sbLIZ2.append(iIntValue);
                    sbLIZ2.append(" height=");
                    sbLIZ2.append(iIntValue2);
                    sbLIZ2.append(" defaultWidth=");
                    DynamicInfoComponent dynamicInfoComponent5 = this.LJIIIZ;
                    if (dynamicInfoComponent5 != null) {
                        numValueOf3 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(dynamicInfoComponent5.defaultWidth))));
                    } else {
                        numValueOf3 = null;
                    }
                    sbLIZ2.append(numValueOf3);
                    sbLIZ2.append(" defaultHeight=");
                    DynamicInfoComponent dynamicInfoComponent6 = this.LJIIIZ;
                    if (dynamicInfoComponent6 != null) {
                        numValueOf4 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(dynamicInfoComponent6.defaultHeight))));
                    } else {
                        numValueOf4 = null;
                    }
                    sbLIZ2.append(numValueOf4);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    if (z2) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("onBind(");
                        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB8 = this.LJFF;
                        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB8 != null) {
                            numValueOf5 = Integer.valueOf(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB8.hashCode());
                        } else {
                            numValueOf5 = null;
                        }
                        sbLIZ3.append(numValueOf5);
                        sbLIZ3.append(", ");
                        C869590Y9l c869590Y9l7 = this.LJII;
                        if (c869590Y9l7 != null) {
                            uuid5 = c869590Y9l7.getUuid();
                        } else {
                            uuid5 = null;
                        }
                        sbLIZ3.append(uuid5);
                        sbLIZ3.append(") reload");
                        C2188811AlT.LIZIZ(sbLIZ3);
                        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB9 = this.LJFF;
                        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB9 != null) {
                            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB9.LJJIJLIJ(TemplateData.LJII(linkedHashMap), this.LJI, false);
                        }
                        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB10 = this.LJFF;
                        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB10 != null) {
                            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB10.setTag(R.id.xh, linkedHashMap);
                            return;
                        }
                        return;
                    }
                }
                LJIIL(linkedHashMap);
                return;
            }
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("onBind(");
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB11 = this.LJFF;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB11 != null) {
            iHashCode2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB11.hashCode();
        }
        sbLIZ4.append(iHashCode2);
        sbLIZ4.append(", ");
        C869590Y9l c869590Y9l8 = this.LJII;
        if (c869590Y9l8 != null) {
            uuid2 = c869590Y9l8.getUuid();
        } else {
            uuid2 = null;
        }
        sbLIZ4.append(uuid2);
        sbLIZ4.append(") fallbackInfo=$");
        if (dynamicCardTemplate != null) {
            fallbackInfoComponent = dynamicCardTemplate.fallbackInfo;
        } else {
            fallbackInfoComponent = null;
        }
        sbLIZ4.append(fallbackInfoComponent);
        sbLIZ4.append(" curDynamicInfo=");
        sbLIZ4.append(this.LJIIIZ);
        C2188811AlT.LIZIZ(sbLIZ4);
        LJIIJ();
    }

    public final void LJIIIZ(C869590Y9l c869590Y9l, DynamicCardTemplate dynamicCardTemplate, Map<String, Object> map) {
        DynamicInfoComponent dynamicInfoComponent;
        int i;
        String strBase64;
        CardInfo cardInfo;
        int value;
        Object c098200Yq;
        String str;
        Object c098200Yq2;
        Integer numValueOf;
        String uuid;
        String uuid2;
        C2181808gi c2181808gi;
        String str2;
        DynamicUiLocationType dynamicUiLocationType;
        this.LJII = c869590Y9l;
        this.LJIIIIZZ = dynamicCardTemplate;
        if (dynamicCardTemplate != null) {
            dynamicInfoComponent = dynamicCardTemplate.dynamicInfo;
        } else {
            dynamicInfoComponent = null;
        }
        this.LJIIIZ = dynamicInfoComponent;
        String str3 = this.LJ.LJI;
        if (str3 == null && (dynamicInfoComponent == null || (str3 = dynamicInfoComponent.schema) == null)) {
            str3 = "";
        }
        this.LJI = URLDecoder.decode(str3, "UTF-8");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C0I0B c0i0b = C0I0B.LJFF;
        String curUserId = ((C1400340mXo) c0i0b.LIZ()).getCurUserId();
        Map<String, Object> mapOu = this.LIZLLL.ou();
        String strValueOf = String.valueOf(c869590Y9l.getMsgId());
        String uuid3 = c869590Y9l.getUuid();
        String strValueOf2 = String.valueOf(c869590Y9l.getSender());
        if (((C1400340mXo) c0i0b.LIZ()).LIZJ(String.valueOf(c869590Y9l.getSender()))) {
            curUserId = this.LIZJ.LIZIZ;
        }
        if (((C1400340mXo) c0i0b.LIZ()).LIZJ(String.valueOf(c869590Y9l.getSender()))) {
            i = 1;
        } else {
            i = 0;
        }
        boolean z = !C0YNY.LIZ(InterfaceC874680YTa.LIZ).LJIILLIIL(c869590Y9l, false);
        Long lValueOf = Long.valueOf(c869590Y9l.getCreatedAt());
        ByteString persistentExtra = c869590Y9l.getPersistentExtra();
        if (persistentExtra != null) {
            strBase64 = persistentExtra.base64();
        } else {
            strBase64 = null;
        }
        MessageInfo messageInfo = new MessageInfo(strValueOf, uuid3, strValueOf2, curUserId, i, z, lValueOf, strBase64);
        DynamicInfoComponent dynamicInfoComponent2 = this.LJIIIZ;
        if (dynamicInfoComponent2 != null) {
            cardInfo = new CardInfo(dynamicInfoComponent2.cardKey, dynamicInfoComponent2.cardTemplate, dynamicInfoComponent2.businessType, dynamicInfoComponent2.businessId, c869590Y9l.getScene(), dynamicInfoComponent2.defaultWidth, dynamicInfoComponent2.defaultHeight, dynamicInfoComponent2.bizParams);
        } else {
            cardInfo = null;
        }
        C13DA c13da = new C13DA();
        c13da.putAll(this.LIZLLL.G8());
        Map mapBuild = c13da.build();
        Map<String, Object> mapIb = this.LIZLLL.ib();
        DynamicInfoComponent dynamicInfoComponent3 = this.LJIIIZ;
        if (dynamicInfoComponent3 != null && (dynamicUiLocationType = dynamicInfoComponent3.uiLocationType) != null) {
            value = dynamicUiLocationType.getValue();
        } else {
            value = C18SX.MessageNormal.getValue();
        }
        try {
            c098200Yq = C09EF.LIZ.LJIILL(new DynamicClientData(mapOu, messageInfo, value, cardInfo, mapBuild, false, C2097608Jq.LJ(), mapIb));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq) || c098200Yq == null) {
            c098200Yq = "";
        }
        linkedHashMap.put("__client_data", c098200Yq);
        DynamicInfoComponent dynamicInfoComponent4 = this.LJIIIZ;
        if (dynamicInfoComponent4 == null || (str = dynamicInfoComponent4.rawData) == null) {
            str = "";
        }
        linkedHashMap.put("__server_data", str);
        try {
            JSONObject jSONObject = new JSONObject();
            Map<String, String> localExt = c869590Y9l.getLocalExt();
            if (localExt != null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry<String, String> entry : localExt.entrySet()) {
                    String key = entry.getKey();
                    if (key != null && a0.LJJIIZI(key, "fe_local_data_", false)) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                    jSONObject.put(u.LJJIFFI((String) entry2.getKey(), "fe_local_data_", "", false), entry2.getValue());
                }
            }
            linkedHashMap.put("__client_db_extra_data", C786410Ut5.J3(jSONObject));
            JSONObject jSONObject2 = new JSONObject();
            String str4 = C601680Nio.LIZ;
            for (Map.Entry entry3 : C601680Nio.LIZIZ(c869590Y9l.getUuid()).entrySet()) {
                jSONObject2.put((String) entry3.getKey(), entry3.getValue());
            }
            linkedHashMap.put("__client_ram_data", C786410Ut5.J3(jSONObject2));
            String str5 = this.LIZJ.LIZ;
            String uuid4 = c869590Y9l.getUuid();
            C2184008h4 c2184008h4 = (C2184008h4) ((LinkedHashMap) C2196508j5.LIZ).get(str5);
            if (c2184008h4 != null && (c2181808gi = c2184008h4.LLILZ.get(uuid4)) != null && (str2 = c2181808gi.LIZJ) != null) {
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getLynxData in container try to get streaming_data, curMsgUuid = ");
            C869590Y9l c869590Y9l2 = this.LJII;
            if (c869590Y9l2 != null) {
                uuid2 = c869590Y9l2.getUuid();
            } else {
                uuid2 = null;
            }
            sbLIZ.append(uuid2);
            C2188811AlT.LIZIZ(sbLIZ);
            linkedHashMap.putAll(this.LIZLLL.getBusinessData());
            c098200Yq2 = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getLynxData(");
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LJFF;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                numValueOf = Integer.valueOf(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.hashCode());
            } else {
                numValueOf = null;
            }
            sbLIZ2.append(numValueOf);
            sbLIZ2.append(", ");
            C869590Y9l c869590Y9l3 = this.LJII;
            if (c869590Y9l3 != null) {
                uuid = c869590Y9l3.getUuid();
            } else {
                uuid = null;
            }
            sbLIZ2.append(uuid);
            sbLIZ2.append(") t=");
            sbLIZ2.append(thM5exceptionOrNullimpl.getMessage());
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        map.putAll(linkedHashMap);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.15fC] */
    public C18SP(IMDynamicCardFrame iMDynamicCardFrame, DynamicCardReusedUISlot dynamicCardReusedUISlot, C18SU c18su, DynamicCardReusedUISlot dynamicCardReusedUISlot2, C189W c189w) {
        this.LIZ = iMDynamicCardFrame;
        this.LIZIZ = dynamicCardReusedUISlot;
        this.LIZJ = c18su;
        this.LIZLLL = dynamicCardReusedUISlot2;
        this.LJ = c189w;
    }

    public static final void LJIIIIZZ(C18SP c18sp, String str, C259800zU<Map<String, String>> c259800zU, long j, boolean z, Integer num) {
        int iHashCode;
        String str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadedEvent(");
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c18sp.LJFF;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            iHashCode = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.hashCode();
        } else {
            iHashCode = 0;
        }
        sbLIZ.append(iHashCode);
        sbLIZ.append(", ");
        sbLIZ.append(str);
        sbLIZ.append(") duration=");
        sbLIZ.append(j);
        sbLIZ.append(" isSuccess=");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        C0I0B.LJFF.LIZIZ();
        C13DA c13da = new C13DA();
        c13da.put("load_duration", String.valueOf(j));
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c13da.put("load_status", str2);
        c13da.put("error_code", String.valueOf(num));
        Map<String, String> map = c259800zU.element;
        if (map != null) {
            c13da.putAll(map);
        }
        C20684815ws.LJIILLIIL("dm_lynx_load_duration", c13da.build());
    }
}
