package X;

import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.dynamic.card.data.CardInfo;
import com.ss.android.ugc.aweme.dynamic.card.data.DynamicClientData;
import com.ss.android.ugc.aweme.dynamic.card.data.MessageInfo;
import com.ss.android.ugc.aweme.im.message.template.card.DynamicCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicUiLocationType;
import com.ss.android.ugc.aweme.im.message.template.component.FallbackInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.IconTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.messagelist.protocols.DynamicCardReusedUISlot;
import com.ss.android.ugc.aweme.im.messagelist.protocols.IMDynamicCardFrame;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.text.a0;
import kotlin.text.u;
import okio.ByteString;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18SQ, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18SQ implements C0ZVX {
    public static final /* synthetic */ int LJIIIZ = 0;
    public final ViewGroup LIZ;
    public final C18SV LIZIZ;
    public final C18SU LIZJ;
    public final C18ST LIZLLL;
    public final C189W LJ;
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS576S0100000_32(this, 742));
    public C869590Y9l LJI;
    public DynamicCardTemplate LJII;
    public DynamicInfoComponent LJIIIIZZ;

    @Override // X.C0ZVX
    public final void LJFF() {
    }

    @Override // X.C0ZVX
    public final void LJI() {
        C869590Y9l c869590Y9l = this.LJI;
        if (c869590Y9l == null) {
            return;
        }
        LJIIIIZZ().updateData(LJII(c869590Y9l, this.LJIIIIZZ));
    }

    public final C18SR LJIIIIZZ() {
        return (C18SR) this.LJFF.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ() {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.im.message.template.card.DynamicCardTemplate r0 = r6.LJII
            r4 = 0
            if (r0 == 0) goto Lb1
            com.ss.android.ugc.aweme.im.message.template.component.FallbackInfoComponent r0 = r0.fallbackInfo
            if (r0 == 0) goto Lb1
            com.ss.android.ugc.aweme.im.message.template.component.ImageComponent r0 = r0.imageComponent
            if (r0 == 0) goto Lb1
            com.ss.android.ugc.aweme.im.message.template.component.IconTypeComponent r0 = r0.iconType
            if (r0 == 0) goto Lb1
            int[] r1 = X.C902230ZaP.LIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 == r0) goto Lad
            r0 = 2
            if (r1 != r0) goto Lb1
            X.0ZVa r5 = X.EnumC900680ZVa.MODERATION
        L21:
            X.18SR r1 = r6.LJIIIIZZ()
            r0 = 0
            r1.setVisibility(r0)
            int r0 = X.C900710ZVd.LIZ
            X.0Y9l r3 = r6.LJI
            com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicInfoComponent r2 = r6.LJIIIIZZ
            if (r2 == 0) goto Lab
            int r0 = r2.defaultWidth
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L43:
            com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicInfoComponent r0 = r6.LJIIIIZZ
            if (r0 == 0) goto La9
            int r0 = r0.defaultHeight
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L59:
            kotlin.Pair r1 = X.C900710ZVd.LIZIZ(r3, r2, r1, r0)
            java.lang.Object r0 = r1.getFirst()
            java.lang.Number r0 = (java.lang.Number) r0
            int r3 = r0.intValue()
            java.lang.Object r0 = r1.getSecond()
            java.lang.Number r0 = (java.lang.Number) r0
            int r2 = r0.intValue()
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "showFallbackUI("
            r1.append(r0)
            X.18SR r0 = r6.LJIIIIZZ()
            int r0 = r0.hashCode()
            r1.append(r0)
            java.lang.String r0 = ", "
            r1.append(r0)
            X.0Y9l r0 = r6.LJI
            if (r0 == 0) goto L92
            java.lang.String r4 = r0.getUuid()
        L92:
            r1.append(r4)
            java.lang.String r0 = ") fallbackUiType="
            r1.append(r0)
            r1.append(r5)
            X.C2188811AlT.LIZIZ(r1)
            X.18SV r0 = r6.LIZIZ
            r0.b6(r5)
            r0.j5(r3, r2)
            return
        La9:
            r0 = r4
            goto L59
        Lab:
            r1 = r4
            goto L43
        Lad:
            X.0ZVa r5 = X.EnumC900680ZVa.LOADING
            goto L21
        Lb1:
            X.0ZVa r5 = X.EnumC900680ZVa.NONE
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18SQ.LJIIIZ():void");
    }

    @Override // X.C0ZVX
    public final void onAttachedToWindow() {
        String uuid;
        C869590Y9l c869590Y9l = this.LJI;
        if (c869590Y9l == null || (uuid = c869590Y9l.getUuid()) == null) {
            return;
        }
        boolean zAdd = this.LIZJ.LIZJ.add(uuid);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAttachedToWindow(");
        sbLIZ.append(LJIIIIZZ().hashCode());
        sbLIZ.append(", ");
        C869590Y9l c869590Y9l2 = this.LJI;
        sbLIZ.append(c869590Y9l2 != null ? c869590Y9l2.getUuid() : null);
        sbLIZ.append(") isFirstShow=");
        sbLIZ.append(zAdd);
        C2188811AlT.LIZIZ(sbLIZ);
        LJIIIIZZ().LIZ("dm_page_scroll", new JSONObject().put("event", "show").put("is_first_show", zAdd));
    }

    @Override // X.C0ZVX
    public final void onDetachedFromWindow() throws JSONException {
        LJIIIIZZ().LIZ("dm_page_scroll", new JSONObject().put("event", "hide"));
    }

    @Override // X.C0ZVX
    public final void LIZ() {
        LJIIIIZZ().LIZLLL();
    }

    @Override // X.C0ZVX
    public final boolean LIZIZ() {
        return LJIIIIZZ().LIZIZ();
    }

    @Override // X.C0ZVX
    public final boolean LIZJ() {
        return LJIIIIZZ().LIZJ();
    }

    @Override // X.C0ZVX
    public final void LIZLLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sendEventByJSON(");
        sbLIZ.append(LJIIIIZZ().hashCode());
        sbLIZ.append(", ");
        C869590Y9l c869590Y9l = this.LJI;
        sbLIZ.append(c869590Y9l != null ? c869590Y9l.getUuid() : null);
        sbLIZ.append(") eventName=");
        sbLIZ.append("dm_msg_card_click_event");
        sbLIZ.append(" params=");
        sbLIZ.append((Object) null);
        C2188811AlT.LIZIZ(sbLIZ);
        LJIIIIZZ().LIZ("dm_msg_card_click_event", null);
    }

    @Override // X.C0ZVX
    public final void LJ(C869590Y9l c869590Y9l, DynamicCardTemplate dynamicCardTemplate) throws UnsupportedEncodingException {
        DynamicInfoComponent dynamicInfoComponent;
        IconTypeComponent iconTypeComponent;
        ImageComponent imageComponent;
        DynamicInfoComponent dynamicInfoComponent2;
        this.LJI = c869590Y9l;
        this.LJII = dynamicCardTemplate;
        FallbackInfoComponent fallbackInfoComponent = null;
        if (dynamicCardTemplate != null) {
            dynamicInfoComponent = dynamicCardTemplate.dynamicInfo;
        } else {
            dynamicInfoComponent = null;
        }
        this.LJIIIIZZ = dynamicInfoComponent;
        String str = this.LJ.LJI;
        if (str == null && (dynamicCardTemplate == null || (dynamicInfoComponent2 = dynamicCardTemplate.dynamicInfo) == null || (str = dynamicInfoComponent2.schema) == null)) {
            str = "";
        }
        String strDecode = URLDecoder.decode(str, "UTF-8");
        if (this.LJ.LIZIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strDecode);
            sbLIZ.append("&thread_strategy=2");
            strDecode = C2188811AlT.LIZIZ(sbLIZ);
        }
        if (dynamicCardTemplate != null) {
            FallbackInfoComponent fallbackInfoComponent2 = dynamicCardTemplate.fallbackInfo;
            if (fallbackInfoComponent2 == null || (imageComponent = fallbackInfoComponent2.imageComponent) == null || (iconTypeComponent = imageComponent.iconType) == null) {
                iconTypeComponent = IconTypeComponent.DEFAULT;
            }
            if (iconTypeComponent == IconTypeComponent.DEFAULT && this.LJIIIIZZ != null) {
                LJIIIIZZ().setVisibility(true);
                C18SV c18sv = this.LIZIZ;
                c18sv.C5();
                c18sv.j5(-2, -2);
                LJIIIIZZ().LJ(strDecode, LJII(c869590Y9l, this.LJIIIIZZ), c869590Y9l, this.LJIIIIZZ);
                return;
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onBind(");
        sbLIZ2.append(LJIIIIZZ().hashCode());
        sbLIZ2.append(", ");
        sbLIZ2.append(c869590Y9l.getUuid());
        sbLIZ2.append(") fallbackInfo=");
        if (dynamicCardTemplate != null) {
            fallbackInfoComponent = dynamicCardTemplate.fallbackInfo;
        }
        sbLIZ2.append(fallbackInfoComponent);
        sbLIZ2.append(" curDynamicInfo=");
        sbLIZ2.append(this.LJIIIIZZ);
        C2188811AlT.LIZIZ(sbLIZ2);
        LJIIIZ();
    }

    public final Map<String, String> LJII(C869590Y9l c869590Y9l, DynamicInfoComponent dynamicInfoComponent) {
        boolean z;
        int i;
        String strBase64;
        CardInfo cardInfo;
        int value;
        Object c098200Yq;
        String str;
        Object c098200Yq2;
        String str2;
        boolean z2;
        DynamicUiLocationType dynamicUiLocationType;
        C13DA c13da = new C13DA();
        C0I0B c0i0b = C0I0B.LJFF;
        String curUserId = ((C1400340mXo) c0i0b.LIZ()).getCurUserId();
        Map<String, Object> mapOu = this.LIZLLL.ou();
        String strValueOf = String.valueOf(c869590Y9l.getMsgId());
        String uuid = c869590Y9l.getUuid();
        String strValueOf2 = String.valueOf(c869590Y9l.getSender());
        if (((C1400340mXo) c0i0b.LIZ()).LIZJ(String.valueOf(c869590Y9l.getSender()))) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            curUserId = this.LIZJ.LIZIZ;
        }
        if (((C1400340mXo) c0i0b.LIZ()).LIZJ(String.valueOf(c869590Y9l.getSender()))) {
            i = 1;
        } else {
            i = 0;
        }
        boolean z3 = !C0YNY.LIZ(InterfaceC874680YTa.LIZ).LJIILLIIL(c869590Y9l, false);
        Long lValueOf = Long.valueOf(c869590Y9l.getCreatedAt());
        ByteString persistentExtra = c869590Y9l.getPersistentExtra();
        C2181808gi c2181808gi = null;
        if (persistentExtra != null) {
            strBase64 = persistentExtra.base64();
        } else {
            strBase64 = null;
        }
        MessageInfo messageInfo = new MessageInfo(strValueOf, uuid, strValueOf2, curUserId, i, z3, lValueOf, strBase64);
        if (dynamicInfoComponent != null) {
            cardInfo = new CardInfo(dynamicInfoComponent.cardKey, dynamicInfoComponent.cardTemplate, dynamicInfoComponent.businessType, dynamicInfoComponent.businessId, c869590Y9l.getScene(), dynamicInfoComponent.defaultWidth, dynamicInfoComponent.defaultHeight, dynamicInfoComponent.bizParams);
        } else {
            cardInfo = null;
        }
        C13DA c13da2 = new C13DA();
        c13da2.putAll(this.LIZLLL.G8());
        Map mapBuild = c13da2.build();
        Map<String, Object> mapIb = this.LIZLLL.ib();
        if (dynamicInfoComponent != null && (dynamicUiLocationType = dynamicInfoComponent.uiLocationType) != null) {
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
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        if (c098200Yq == null) {
            c098200Yq = "";
        }
        c13da.put("__client_data", c098200Yq);
        if (dynamicInfoComponent == null || (str = dynamicInfoComponent.rawData) == null) {
            str = "";
        }
        c13da.put("__server_data", str);
        try {
            JSONObject jSONObject = new JSONObject();
            Map<String, String> localExt = c869590Y9l.getLocalExt();
            if (localExt != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, String> entry : localExt.entrySet()) {
                    String key = entry.getKey();
                    if (key != null && a0.LJJIIZI(key, "fe_local_data_", false)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    jSONObject.put(u.LJJIFFI((String) entry2.getKey(), "fe_local_data_", "", false), entry2.getValue());
                }
            }
            c13da.put("__client_db_extra_data", C786410Ut5.J3(jSONObject));
            JSONObject jSONObject2 = new JSONObject();
            String str3 = C601680Nio.LIZ;
            for (Map.Entry entry3 : C601680Nio.LIZIZ(c869590Y9l.getUuid()).entrySet()) {
                jSONObject2.put((String) entry3.getKey(), entry3.getValue());
            }
            c13da.put("__client_ram_data", C786410Ut5.J3(jSONObject2));
            String str4 = this.LIZJ.LIZ;
            String uuid2 = c869590Y9l.getUuid();
            C2184008h4 c2184008h4 = (C2184008h4) ((LinkedHashMap) C2196508j5.LIZ).get(str4);
            if (c2184008h4 != null) {
                c2181808gi = c2184008h4.LLILZ.get(uuid2);
            }
            if (c2181808gi != null && (str2 = c2181808gi.LIZJ) != null) {
            }
            c13da.putAll(this.LIZLLL.getBusinessData());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getData(");
            sbLIZ.append(LJIIIIZZ().hashCode());
            sbLIZ.append(", ");
            sbLIZ.append(c869590Y9l.getUuid());
            sbLIZ.append(')');
            C2188811AlT.LIZIZ(sbLIZ);
            c098200Yq2 = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
        if (thM5exceptionOrNullimpl != null) {
            thM5exceptionOrNullimpl.getMessage();
        }
        return c13da.build();
    }

    public C18SQ(IMDynamicCardFrame iMDynamicCardFrame, DynamicCardReusedUISlot dynamicCardReusedUISlot, C18SU c18su, DynamicCardReusedUISlot dynamicCardReusedUISlot2, C189W c189w) {
        this.LIZ = iMDynamicCardFrame;
        this.LIZIZ = dynamicCardReusedUISlot;
        this.LIZJ = c18su;
        this.LIZLLL = dynamicCardReusedUISlot2;
        this.LJ = c189w;
    }
}
