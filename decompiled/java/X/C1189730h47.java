package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.cta.takeout.PoiTakeoutEduPopSettings;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0h47, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@InterfaceC20647615qs("poi_detail_takeout_intro_pop")
public final class C1189730h47 extends AbstractC20660115st<DialogFragment> {
    public static final int LLIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(266));
    public static final int LLIZLLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(232));
    public final InterfaceC20660615sy LL;
    public final FragmentManager LLILLJJLI;
    public final InterfaceC1189720h46 LLILLL;
    public final String LLILZ;
    public final int LLILZIL;
    public final JSONObject LLILZLL;

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 40;
    }

    public final void LJIIL(String str) {
        JSONObject jSONObject = this.LLILZLL;
        if (jSONObject != null) {
            C1185430gxB c1185430gxB = C1185430gxB.LIZ;
            String strOptString = jSONObject.optString("poi_id");
            String strOptString2 = jSONObject.optString("collect_info");
            String strOptString3 = jSONObject.optString("initial_poi_enter_from");
            String strOptString4 = jSONObject.optString("initial_poi_enter_method");
            String strOptString5 = jSONObject.optString("initial_poi_from_group_id");
            String strOptString6 = jSONObject.optString("initial_poi_id");
            String strOptString7 = jSONObject.optString("poi_detail_enter_from");
            String strOptString8 = jSONObject.optString("poi_detail_enter_method");
            String strOptString9 = jSONObject.optString("ttoclid");
            String strOptString10 = jSONObject.optString("partner_name");
            c1185430gxB.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "poi_detail");
            c2344009Gk.LJIIIIZZ("enter_method", "place_order");
            C1189060h32.LJJIFFI(c2344009Gk, "poi_id", strOptString);
            C1189060h32.LJJIFFI(c2344009Gk, "poi_detail_enter_from", strOptString7);
            C1189060h32.LJJIFFI(c2344009Gk, "poi_detail_enter_method", strOptString8);
            C1189060h32.LJJIFFI(c2344009Gk, "initial_poi_enter_from", strOptString3);
            C1189060h32.LJJIFFI(c2344009Gk, "initial_poi_enter_method", strOptString4);
            C1189060h32.LJJIFFI(c2344009Gk, "initial_poi_from_group_id", strOptString5);
            C1189060h32.LJJIFFI(c2344009Gk, "initial_poi_id", strOptString6);
            C1189060h32.LJJIFFI(c2344009Gk, "ttoclid", strOptString9);
            C1189060h32.LJJIFFI(c2344009Gk, "partner_name", strOptString10);
            C1189060h32.LJJIFFI(c2344009Gk, "action_type", str);
            C1189060h32.LIZJ(c2344009Gk, strOptString2);
            C20684815ws.LJIILLIIL("track_order_popup", c2344009Gk.LIZ);
        }
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C688120Qyw c688120Qyw) {
        int iIntValue;
        String str;
        int iIntValue2;
        CharSequence charSequence;
        CharSequence charSequence2;
        C770750ULh c770750ULh = new C770750ULh();
        Context context = c688120Qyw.LIZ;
        c770750ULh.LIZ = C1189060h32.LJIILLIIL(c688120Qyw.LIZ, new BitmapDrawable(context.getResources(), Bitmap.createScaledBitmap(BitmapFactory.decodeResource(context.getResources(), this.LLILZIL), LLIZ, LLIZLLLIL, false)));
        c770750ULh.LIZLLL = 2;
        PoiTakeoutEduPopSettings.LIZ.getClass();
        String str2 = PoiTakeoutEduPopSettings.LIZ().title;
        CharSequence charSequence3 = "";
        if (str2 == null) {
            str2 = "";
        }
        c770750ULh.LJ = str2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str3 = PoiTakeoutEduPopSettings.LIZ().subTitle;
        if (str3 == null) {
            str3 = "";
        }
        SpannableString spannableString = new SpannableString(str3);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1j, c688120Qyw.LIZ);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        C786410Ut5.p2(spannableString, new ForegroundColorSpan(iIntValue), 0, spannableString.length(), 33);
        C786410Ut5.p2(spannableString, new C444920HcY(101, false), 0, spannableString.length(), 33);
        PoiTakeoutEduPopSettings.HighlightWord highlightWord = PoiTakeoutEduPopSettings.LIZ().highlightWord;
        if (highlightWord == null || (str = highlightWord.name) == null) {
            str = "";
        }
        SpannableString spannableString2 = new SpannableString(str);
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, c688120Qyw.LIZ);
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = 0;
        }
        C786410Ut5.p2(spannableString2, new ForegroundColorSpan(iIntValue2), 0, spannableString2.length(), 33);
        C786410Ut5.p2(spannableString2, new C444920HcY(102, false), 0, spannableString2.length(), 33);
        int iLJJJ = a0.LJJJ(spannableString.toString(), "{s_uiGuidance}", 0, false, 6);
        if (iLJJJ != -1) {
            spannableStringBuilder.append((CharSequence) spannableString);
            spannableStringBuilder.replace(iLJJJ, iLJJJ + 14, (CharSequence) spannableString2);
        }
        c770750ULh.LIZJ(spannableStringBuilder);
        c770750ULh.LJIILLIIL = true;
        PoiTakeoutEduPopSettings.CtaBtn ctaBtn = PoiTakeoutEduPopSettings.LIZ().btnRight;
        if (ctaBtn == null || (charSequence = ctaBtn.cta) == null) {
            charSequence = "";
        }
        c770750ULh.LJI(charSequence, new AwS384S0200000_18(this, c688120Qyw, 304));
        PoiTakeoutEduPopSettings.CtaBtn ctaBtn2 = PoiTakeoutEduPopSettings.LIZ().btnLeft;
        if (ctaBtn2 != null && (charSequence2 = ctaBtn2.cta) != null) {
            charSequence3 = charSequence2;
        }
        c770750ULh.LJII(charSequence3, new AwS597S0100000_18(this, 1132));
        TuxSheet tuxSheet = c770750ULh.LIZIZ().LIZ;
        tuxSheet.LLILLL = true;
        tuxSheet.LLJLLL = false;
        tuxSheet.LLJLLIL = true;
        tuxSheet.LLILLJJLI = new DialogInterfaceOnDismissListenerC1208810hYt(this, 2);
        tuxSheet.LL = new DialogInterfaceOnCancelListenerC1208790hYr(this, 3);
        tuxSheet.show(this.LLILLJJLI, "poi_detail_takeout_intro_pop");
        LJIIL("show");
        return tuxSheet;
    }

    public C1189730h47(C1187040gzm c1187040gzm, FragmentManager fragmentManager, C1187060gzo c1187060gzo, String str, int i, JSONObject jSONObject) {
        super(c1187040gzm);
        this.LL = c1187040gzm;
        this.LLILLJJLI = fragmentManager;
        this.LLILLL = c1187060gzo;
        this.LLILZ = str;
        this.LLILZIL = i;
        this.LLILZLL = jSONObject;
    }
}
