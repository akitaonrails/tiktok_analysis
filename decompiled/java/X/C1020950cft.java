package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.component.ugen.handler.CarouselLabelData;
import com.ss.android.ugc.aweme.component.ugen.handler.CarouselLabelInfo;
import com.ss.android.ugc.aweme.component.ugen.handler.EventTrackInfo;
import com.ss.android.ugc.aweme.component.ugen.handler.LabelPosition;
import com.ss.android.ugc.aweme.component.ugen.handler.ProductInfo;
import com.ss.android.ugc.aweme.component.ugen.handler.StatusInfo;
import com.ss.android.ugc.aweme.component.ugen.handler.StyleInfo;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cft, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1020950cft implements InterfaceC1015560cXC {
    public boolean LIZ;
    public C1015550cXB LIZIZ;
    public CarouselLabelData LIZJ;
    public int LIZLLL;
    public boolean LJ;
    public final CarouselLabelInfo LJFF = new CarouselLabelInfo(new ProductInfo("", ""), new StyleInfo(false, true, false, false, 156), new StatusInfo(true, true, null, null));
    public final EventTrackInfo LJI = new EventTrackInfo(0, 0, "", "", 0, "unknown");
    public final C01GW LJII = C452501pT.LIZIZ(new AwS560S0100000_16(this, 655));
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public String LJIIJJI;
    public String LJIIL;
    public CarouselLabelInfo LJIILIIL;

    @Override // X.InterfaceC1015560cXC
    public final void LIZ() {
        this.LJIILIIL = null;
        this.LJIIIIZZ = false;
        this.LJIIIZ = false;
    }

    @Override // X.InterfaceC1015560cXC
    public final void LIZIZ(C1015550cXB c1015550cXB, C1015960cXq c1015960cXq) {
    }

    @Override // X.InterfaceC1015560cXC
    public final void LIZJ(C1015550cXB c1015550cXB, C1050000dQk c1050000dQk) {
    }

    @Override // X.InterfaceC1015560cXC
    public final void LJFF(C1015550cXB c1015550cXB) {
    }

    @Override // X.InterfaceC1015560cXC
    public final boolean LJII() {
        return false;
    }

    @Override // X.InterfaceC1015560cXC
    public final void LJIIIIZZ(C1015550cXB c1015550cXB) {
    }

    @Override // X.InterfaceC1015560cXC
    public final void LJIIIZ(C1015550cXB c1015550cXB) {
    }

    public final CarouselLabelInfo LJIIJ() {
        ProductInfo productInfo = this.LJFF.product;
        ProductInfo productInfoCopy = productInfo.copy(productInfo.anchorTitle, productInfo.discount);
        StyleInfo styleInfo = this.LJFF.styleInfo;
        StyleInfo styleInfoCopy = styleInfo.copy(styleInfo.disableLabel, styleInfo.showIcon, styleInfo.isBiggerStyle, styleInfo.isShowThreeLines, styleInfo.maxWidth);
        StatusInfo statusInfo = this.LJFF.statusInfo;
        LabelPosition labelPosition = statusInfo.position;
        return new CarouselLabelInfo(productInfoCopy, styleInfoCopy, statusInfo.copy(statusInfo.isShow, false, statusInfo.imageLoadStatus, labelPosition != null ? labelPosition.copy(labelPosition.bottom, labelPosition.left) : null));
    }

    public final JSONObject LJIIJJI() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("anchor_title", this.LJFF.product.anchorTitle);
        jSONObject2.put("discount", this.LJFF.product.discount);
        jSONObject.put("product", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("disable_label", this.LJFF.styleInfo.disableLabel);
        jSONObject3.put("show_icon", this.LJFF.styleInfo.showIcon);
        jSONObject3.put("is_bigger_style", this.LJFF.styleInfo.isBiggerStyle());
        jSONObject3.put("is_show_three_lines", this.LJFF.styleInfo.isShowThreeLines());
        jSONObject3.put("max_width", this.LJFF.styleInfo.maxWidth);
        jSONObject.put("style_info", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("isShow", this.LJFF.statusInfo.isShow());
        jSONObject4.put("animation", this.LJFF.statusInfo.animation);
        LabelPosition labelPosition = this.LJFF.statusInfo.position;
        if (labelPosition != null) {
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("bottom", labelPosition.bottom);
            jSONObject5.put("left", labelPosition.left);
            jSONObject4.put("position", jSONObject5);
        }
        jSONObject.put("status_info", jSONObject4);
        return jSONObject;
    }

    public static JSONObject LJIIL(String str) {
        boolean z;
        Object c098200Yq;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        Object obj = null;
        if (z) {
            return null;
        }
        try {
            c098200Yq = new JSONObject(str);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (JSONObject) obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x009e, code lost:
    
        if (r14.equals("othershow") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00eb, code lost:
    
        return X.C2097608Jq.LJIIIIZZ(new kotlin.Pair("image_location", java.lang.Integer.valueOf(r13.LJI.imageLocation)), new kotlin.Pair("image_cnt", java.lang.Integer.valueOf(r13.LJI.imageCnt)), new kotlin.Pair("product_id", r13.LJI.productId), new kotlin.Pair("product_count", java.lang.Integer.valueOf(r13.LJI.productCount)), new kotlin.Pair("enter_method", r13.LJI.enterMethod));
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (r14.equals("othershow_fail") != false) goto L24;
     */
    @Override // X.InterfaceC1015560cXC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.Object> LIZLLL(java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1020950cft.LIZLLL(java.lang.String):java.util.Map");
    }

    @Override // X.InterfaceC1015560cXC
    public final boolean LJI(AnoleComponentModel anoleComponentModel) {
        return Intrinsics.LJFF(anoleComponentModel.type, EnumC1008920cMU.CAROUSEL_PRODUCT_LABEL_UGEN.getType());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c3  */
    @Override // X.InterfaceC1015560cXC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJ(X.C1015550cXB r8, X.AbstractC1003980cEW r9) {
        /*
            Method dump skipped, instruction units count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1020950cft.LJ(X.0cXB, X.0cEW):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(org.json.JSONObject r18, X.C1015550cXB r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1020950cft.LJIILIIL(org.json.JSONObject, X.0cXB, boolean):void");
    }
}
