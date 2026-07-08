package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.profile.model.SignatureExtraInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0iMb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1239630iMb extends AbstractC426530Gnz implements InterfaceC431250Gvb {
    public final Context LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final Function0<Unit> LLILZ;
    public final boolean LLILZIL;
    public boolean LLILZLL;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        String str;
        String str2;
        boolean z;
        if (this.LLILZIL) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        if (C300140Bpc.LIZ()) {
            str2 = "click_name";
        } else {
            str2 = "click_name_in_bio";
        }
        C879350Yeb c879350Yeb = C879350Yeb.LIZ;
        String str3 = this.LLILLJJLI;
        String str4 = this.LLILLL;
        c879350Yeb.getClass();
        if (str4 != null && str4.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C879350Yeb.LIZ(str3, str2, str);
        } else {
            C0I0B.LJFF.LIZJ();
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(C894660Z7w.LIZ(), "aweme://user/profile/");
            smartRouteBuildRoute.withParam("uid", str3);
            smartRouteBuildRoute.withParam("sec_user_id", str4);
            smartRouteBuildRoute.withParam("previous_page_position", "other_places");
            smartRouteBuildRoute.withParam("previous_page", str);
            smartRouteBuildRoute.withParam("enter_method", str2);
            smartRouteBuildRoute.open();
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("to_user_id", this.LLILLJJLI);
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        c2344009Gk.LIZLLL(C1256070in7.LIZ, "profile_entrance_id");
        C20684815ws.LJIILLIIL("enter_personal_detail", c2344009Gk.LIZ);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Integer numLIZJ;
        if (this.LLILZLL) {
            numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, this.LL);
        } else {
            numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, this.LL);
        }
        if (numLIZJ != null) {
            textPaint.setColor(numLIZJ.intValue());
            textPaint.setUnderlineText(false);
        }
    }

    public static final List<SignatureExtraInfo> LJIIJ(String str, String str2, List<SignatureExtraInfo> list) {
        String strSubstring;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        for (SignatureExtraInfo signatureExtraInfo : list) {
            Integer startIndex = signatureExtraInfo.getStartIndex();
            Integer endIndex = signatureExtraInfo.getEndIndex();
            if (startIndex != null && startIndex.intValue() >= 0 && endIndex != null && endIndex.intValue() < str.length()) {
                if (endIndex.intValue() + 1 == str.length()) {
                    strSubstring = str.substring(startIndex.intValue());
                } else {
                    strSubstring = str.substring(startIndex.intValue(), endIndex.intValue() + 1);
                }
                int iLJJJ = a0.LJJJ(str2, strSubstring, length, false, 4);
                if (iLJJJ >= 0 && strSubstring.length() + iLJJJ <= str2.length()) {
                    SignatureExtraInfo signatureExtraInfo2 = new SignatureExtraInfo();
                    signatureExtraInfo2.setStartIndex(Integer.valueOf(iLJJJ));
                    signatureExtraInfo2.setEndIndex(Integer.valueOf((strSubstring.length() + iLJJJ) - 1));
                    signatureExtraInfo2.setUserId(signatureExtraInfo.getUserId());
                    signatureExtraInfo2.setSecUserId(signatureExtraInfo.getSecUserId());
                    length = strSubstring.length() + iLJJJ;
                    arrayList.add(signatureExtraInfo2);
                }
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC431250Gvb
    public final void LIZJ(TextView textView, Spanned spanned, int i) {
        this.LLILZLL = false;
    }

    @Override // X.InterfaceC431250Gvb
    public final void LJ(TextView textView, Spanned spanned, int i) {
        Function0<Unit> function0 = this.LLILZ;
        if (function0 != null) {
            function0.invoke();
        }
        this.LLILZLL = true;
        textView.cancelPendingInputEvents();
    }

    public C1239630iMb(Context context, String str, String str2, Function0 function0, boolean z) {
        this.LL = context;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = function0;
        this.LLILZIL = z;
    }

    public static final SpannableString LJIIIZ(Context context, String str, List<SignatureExtraInfo> list, boolean z, Function0<Unit> function0) {
        SpannableString spannableString = new SpannableString(str);
        for (SignatureExtraInfo signatureExtraInfo : (ArrayList) list) {
            Integer startIndex = signatureExtraInfo.getStartIndex();
            Integer endIndex = signatureExtraInfo.getEndIndex();
            String userId = signatureExtraInfo.getUserId();
            String secUserId = signatureExtraInfo.getSecUserId();
            if (userId != null && secUserId != null && startIndex != null && startIndex.intValue() >= 0 && endIndex != null && endIndex.intValue() < str.length()) {
                C786410Ut5.p2(spannableString, new C1239630iMb(context, userId, secUserId, function0, z), startIndex.intValue(), endIndex.intValue() + 1, 33);
                if (!C2537109wv.LIZLLL()) {
                    C786410Ut5.p2(spannableString, new C444920HcY(63, false), startIndex.intValue(), endIndex.intValue() + 1, 33);
                } else {
                    C786410Ut5.p2(spannableString, new C444920HcY(62, false), startIndex.intValue(), endIndex.intValue() + 1, 33);
                }
                if (((Boolean) C2537109wv.LJIIL.getValue()).booleanValue()) {
                    C786410Ut5.p2(spannableString, new ForegroundColorSpan(C960203pA.LIZ(R.attr.a1o, context)), startIndex.intValue(), endIndex.intValue() + 1, 33);
                }
            }
        }
        return spannableString;
    }
}
