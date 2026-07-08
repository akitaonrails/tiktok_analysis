package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchPdpEnterParams;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QtD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C684570QtD extends LinearLayout {
    public TuxIconView LL;
    public TuxTextView LLILLJJLI;
    public PhotoSearchPdpEnterParams LLILLL;
    public boolean[] LLILZ;
    public int LLILZIL;

    private final TuxIconView getFindSimilarIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.hyr);
            this.LL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    private final TuxTextView getFindSimilarTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.hyv);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final void LIZ() {
        if (getVisibility() == 8) {
            return;
        }
        C0H1U.LIZIZ(this);
    }

    public final void LIZJ(String str) throws JSONException {
        PhotoSearchPdpEnterParams photoSearchPdpEnterParams = this.LLILLL;
        if (photoSearchPdpEnterParams != null) {
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("search_entrance", photoSearchPdpEnterParams.searchEntrance);
            jSONObject.put("page_name", photoSearchPdpEnterParams.pageName);
            jSONObject.put("raw_photo_source", "pdp_carousel_pic");
            jSONObject.put("enter_product_id", photoSearchPdpEnterParams.enterProductId);
            jSONObject.put("track_id", photoSearchPdpEnterParams.trackId);
            jSONObject.put("rank", this.LLILZIL + 1);
            jSONObject.put("enter_from", "product_detail");
            jSONObject.put("enter_from_second", "product_detail");
            jSONObject.put("photo_search_module", "carousel_image_find_similar");
            jSONObject.put("photo_search_previous_page", "product_detail");
            c1507790pL7.getClass();
            C1507790pL7.LIZLLL(str, jSONObject);
        }
    }

    public final void LIZLLL(boolean z) throws JSONException {
        if (Intrinsics.LJFF(C13LQ.LJJII(this.LLILZIL, this.LLILZ), Boolean.FALSE) && !z) {
            LIZJ("find_similar_tab_show");
            this.LLILZ[this.LLILZIL] = true;
        }
        if (getVisibility() == 0) {
            return;
        }
        C12ES.LJIILL(0, this);
    }

    public final void setCurrentIndex(int i) {
        this.LLILZIL = i;
    }

    public C684570QtD(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILZ = new boolean[0];
        C01GW c01gw = C954703oH.LIZ;
        C954703oH.LIZ(context, R.layout.arq, this, true);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(20));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zl);
        Drawable drawableLIZ = c384050F3z.LIZ(context);
        C19659111vp c19659111vp = new C19659111vp();
        c19659111vp.LIZJ = C418440Gaw.LIZIZ(2);
        c19659111vp.LIZLLL = C418440Gaw.LIZIZ(12);
        c19659111vp.LJ = Integer.valueOf(R.attr.p0);
        c19659111vp.LIZ = C418440Gaw.LIZIZ(20);
        c19659111vp.LJI = new Rect(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
        setBackground(C426750GoL.LJIILIIL(drawableLIZ, c19659111vp.LIZ(context)));
    }

    public final void LIZIZ(PhotoSearchPdpEnterParams photoSearchPdpEnterParams, Boolean bool, int i) {
        boolean z;
        this.LLILLL = photoSearchPdpEnterParams;
        boolean[] zArr = this.LLILZ;
        if (zArr.length != i) {
            boolean[] zArr2 = new boolean[i];
            for (int i2 = 0; i2 < i; i2++) {
                if (i2 < zArr.length) {
                    z = zArr[i2];
                } else {
                    z = false;
                }
                zArr2[i2] = z;
            }
            this.LLILZ = zArr2;
        }
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            C786410Ut5.LJLLLLLL(0, this);
            if (Intrinsics.LJFF(C13LQ.LJJII(this.LLILZIL, this.LLILZ), Boolean.FALSE)) {
                LIZJ("find_similar_tab_show");
                this.LLILZ[this.LLILZIL] = true;
            }
        }
        int iIntValue = ((Number) C289740BXg.LIZ.getValue()).intValue();
        if (iIntValue != 1) {
            if (iIntValue != 2) {
                C786410Ut5.LJLLLLLL(8, this);
                return;
            }
            C426750GoL.LJIIL(this, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), 16);
            TuxIconView findSimilarIconFromXml = getFindSimilarIconFromXml();
            if (findSimilarIconFromXml != null) {
                C1744700vVE.LJIIL(findSimilarIconFromXml, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
                C1744700vVE.LJIIIIZZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)), findSimilarIconFromXml);
            }
            TuxTextView findSimilarTextFromXml = getFindSimilarTextFromXml();
            if (findSimilarTextFromXml == null) {
                return;
            }
            C12ES.LJIILL(0, findSimilarTextFromXml);
            return;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        setPadding(iLIZIZ, iLIZIZ, iLIZIZ, iLIZIZ);
        TuxIconView findSimilarIconFromXml2 = getFindSimilarIconFromXml();
        if (findSimilarIconFromXml2 != null) {
            C1744700vVE.LJIIL(findSimilarIconFromXml2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
            C1744700vVE.LJIIIIZZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), findSimilarIconFromXml2);
        }
        TuxTextView findSimilarTextFromXml2 = getFindSimilarTextFromXml();
        if (findSimilarTextFromXml2 == null) {
            return;
        }
        C0H1U.LIZIZ(findSimilarTextFromXml2);
    }
}
