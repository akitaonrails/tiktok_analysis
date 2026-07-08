package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.poi.detail.dishes.PoiInnerPageMobData;
import com.ss.android.ugc.aweme.poi.experiment.PoiWebViewGneSettings;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0h8H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1192310h8H {
    public static final C1192310h8H LIZ = new C1192310h8H();

    public static int LIZJ(Context context, Context context2) {
        if (context2 != null && C960203pA.LIZIZ(context2)) {
            return R.style.z4;
        }
        int i = context.getResources().getConfiguration().uiMode & 48;
        if (i != 0 && i != 16 && i == 32) {
            return R.style.z4;
        }
        return R.style.zd;
    }

    public static void LJ(Context context, String str) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://webview");
        smartRouteBuildRoute.withParam("use_spark", true);
        smartRouteBuildRoute.withParam("url", str);
        smartRouteBuildRoute.withParam("use_webview_title", true);
        smartRouteBuildRoute.withParam("show_separate_line", true);
        smartRouteBuildRoute.open();
    }

    public static void LJFF(Context context, FragmentManager fragmentManager, Drawable drawable, C419910GdJ c419910GdJ, String str, CharSequence charSequence, String str2, Function0 function0) {
        C844470XAv.LIZ.getClass();
        int iLIZJ = LIZJ(C844470XAv.LIZ(), context);
        C770750ULh c770750ULh = new C770750ULh();
        if (drawable != null) {
            c770750ULh.LIZ = drawable;
            c770750ULh.LIZLLL = 1;
        }
        if (c419910GdJ != null) {
            c770750ULh.LIZIZ = c419910GdJ;
            c770750ULh.LIZLLL = 3;
        }
        c770750ULh.LJ = str;
        if (((SpannableStringBuilder) charSequence).length() > 0) {
            c770750ULh.LIZJ(charSequence);
        }
        c770750ULh.LJI(str2, new AwS597S0100000_18(c770750ULh, function0, 767));
        c770750ULh.LJIJI = Integer.valueOf(iLIZJ);
        c770750ULh.LJIILLIIL = true;
        TuxSheet tuxSheet = c770750ULh.LIZIZ().LIZ;
        tuxSheet.LLILLL = true;
        tuxSheet.LLJLLL = false;
        tuxSheet.LLJLLIL = true;
        tuxSheet.LL = new DialogInterfaceOnCancelListenerC1208790hYr(0);
        tuxSheet.LLILLJJLI = new DialogInterfaceOnDismissListenerC1208810hYt(5);
        tuxSheet.show(fragmentManager, "poi_pictures_disclaimer");
    }

    public static void LIZLLL(Context context, String str, String str2, String str3, String str4, List list, String str5, String str6, String str7, String str8, String str9) {
        String strLJJLIIIJ;
        String str10;
        String str11 = str3;
        String str12 = str2;
        String str13 = str6;
        String str14 = str5;
        String str15 = str4;
        String str16 = str9;
        String str17 = str8;
        Uri.Builder builderBuildUpon = UriProtector.parse(PoiWebViewGneSettings.LIZIZ()).buildUpon();
        String str18 = "";
        if (str17 == null) {
            str17 = "";
        }
        Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendQueryParameter("enter_from", str17);
        if (str16 == null) {
            str16 = "";
        }
        Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("enter_method", str16).appendQueryParameter("entrance", "poi_picture");
        if (str == null) {
            str = "";
        }
        Uri.Builder builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter("pic_id", str);
        if (str12 == null) {
            str12 = "";
        }
        Uri.Builder builderAppendQueryParameter4 = builderAppendQueryParameter3.appendQueryParameter("pic_source", str12);
        if (str11 == null) {
            str11 = "";
        }
        Uri.Builder builderAppendQueryParameter5 = builderAppendQueryParameter4.appendQueryParameter("google_pic_reference", str11);
        if (str15 == null) {
            str15 = "";
        }
        Uri.Builder builderAppendQueryParameter6 = builderAppendQueryParameter5.appendQueryParameter("pic_uri", str15);
        if (list == null || (strLJJLIIIJ = C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62)) == null) {
            strLJJLIIIJ = "";
        }
        Uri.Builder builderAppendQueryParameter7 = builderAppendQueryParameter6.appendQueryParameter("pic_url_list", strLJJLIIIJ);
        if (str14 == null) {
            str14 = "";
        }
        Uri.Builder builderAppendQueryParameter8 = builderAppendQueryParameter7.appendQueryParameter("google_user_name", str14);
        if (str13 == null) {
            str13 = "";
        }
        Uri.Builder builderAppendQueryParameter9 = builderAppendQueryParameter8.appendQueryParameter("poi_region", str13);
        if (str7 != null) {
            str18 = str7;
        }
        Uri.Builder builderAppendQueryParameter10 = builderAppendQueryParameter9.appendQueryParameter("poi_id", str18);
        if (C960203pA.LIZIZ(context)) {
            str10 = "dark";
        } else {
            str10 = "light";
        }
        Uri.Builder builderAppendQueryParameter11 = builderAppendQueryParameter10.appendQueryParameter("force_theme_style", str10);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(PoiWebViewGneSettings.LIZ());
        sbLIZ.append("&url=");
        sbLIZ.append(Uri.encode(builderAppendQueryParameter11.toString()));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C844470XAv.LIZ.getClass();
        SmartRouter.buildRoute(new ContextThemeWrapper(context, LIZJ(C844470XAv.LIZ(), null)), strLIZIZ).open();
    }

    public static CharSequence LIZ(Context context, String str, String str2, String str3, String str4, PoiInnerPageMobData poiInnerPageMobData, String str5, String str6, String str7, String str8, List list, String str9, String str10, View view) {
        String strJ4 = C786410Ut5.j4(str, Arrays.copyOf(new Object[]{str2}, 1));
        C444940Hca c444940Hca = new C444940Hca();
        c444940Hca.LIZJ = str2;
        c444940Hca.LIZIZ(101);
        c444940Hca.LIZIZ = false;
        c444940Hca.LIZLLL(5);
        c444940Hca.LJI = true;
        c444940Hca.LJIIIIZZ = new C1186160gyM(context, str5, str6, str7, str8, list, str9, poiInnerPageMobData, str4, str10, str3, view);
        C844470XAv.LIZ.getClass();
        CharSequence charSequenceLIZ = c444940Hca.LIZ(C844470XAv.LIZ());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strJ4);
        int iLJJJ = a0.LJJJ(spannableStringBuilder, str2, 0, false, 6);
        if (iLJJJ != -1) {
            spannableStringBuilder.replace(iLJJJ, str2.length() + iLJJJ, (CharSequence) "");
            spannableStringBuilder.insert(iLJJJ, charSequenceLIZ);
            C786410Ut5.q2(spannableStringBuilder, new CharacterStyle() { // from class: X.0h8I
                @Override // android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    textPaint.setUnderlineText(false);
                }
            }, iLJJJ, ((SpannableStringBuilder) charSequenceLIZ).length() + iLJJJ, 17);
        }
        return spannableStringBuilder;
    }
}
