package X;

import android.app.Dialog;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.uiwidget.richtext.LsRichText;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.text.a0;
import wh6.AbS503S0200000_12;
import wh6.AbS699S0100000_18;

/* JADX INFO: renamed from: X.0h6W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1191220h6W {
    public static final C1191220h6W LIZ = new C1191220h6W();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(824));

    public static void LIZ(SmartImageView smartImageView, UrlModel urlModel) {
        if (urlModel == null) {
            C786410Ut5.LLFF(8, smartImageView);
            return;
        }
        C786410Ut5.LLFF(0, smartImageView);
        smartImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        C1189360h3W c1189360h3WLIZ = new C1180600gpO("poi_review_tabe_log_tab", "logo", null).LIZ(C438710HIf.LIZ(urlModel));
        c1189360h3WLIZ.LIZ.LIZLLL("PoiReviewsTabelogDisclaimer");
        c1189360h3WLIZ.LIZLLL(smartImageView);
        c1189360h3WLIZ.LIZIZ();
    }

    public static void LIZIZ(Context context, PoiReviewsApi.PoiReviewDisclaimer poiReviewDisclaimer, UrlModel urlModel, Function0 function0) {
        boolean z;
        int i;
        Object c098200Yq;
        final Context context2 = context;
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (!(!a0.LJJJIL(curUserId))) {
            curUserId = null;
        }
        int i2 = 0;
        if (curUserId == null) {
            z = false;
        } else {
            Keva keva = (Keva) LIZIZ.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("poi_review_tabelog_disclaimer_key_");
            sbLIZ.append(curUserId);
            z = keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
        }
        AFwS206S0000000_18 aFwS206S0000000_18 = AFwS206S0000000_18.get$arr$(825);
        if (poiReviewDisclaimer != null && !z) {
            String str = poiReviewDisclaimer.title;
            if (str != null && (!a0.LJJJIL(str))) {
                C19EG c19egLIZIZ = C1388190mED.LIZIZ(context2);
                if (c19egLIZIZ == null) {
                    function0.invoke();
                    return;
                }
                if (!c19egLIZIZ.isFinishing() && !c19egLIZIZ.isDestroyed()) {
                    LsRichText lsRichText = poiReviewDisclaimer.disClaimerContent;
                    C1193610hAN c1193610hAN = new C1193610hAN(context2);
                    if (lsRichText == null) {
                        lsRichText = null;
                    }
                    c1193610hAN.LIZ(lsRichText, new InterfaceC1193660hAS() { // from class: X.0h6J
                        @Override // X.InterfaceC1193660hAS
                        public final void LIZ(String str2, View view) {
                            if (C123100dR.LIZ(str2) && str2 != null) {
                                Context context3 = context2;
                                String string = UriProtector.parse("aweme://webview").buildUpon().appendQueryParameter("url", str2).toString();
                                C1367960lha.LIZ.getClass();
                                C1367960lha.LIZ().LJJLIIIJLLLLLLLZ(context3, string);
                            }
                        }
                    });
                    SpannableStringBuilder spannableStringBuilder = c1193610hAN.LIZIZ;
                    if ((!a0.LJJJIL(spannableStringBuilder)) && spannableStringBuilder != null) {
                        UrlModel urlModel2 = poiReviewDisclaimer.brandLogo;
                        C19EG c19egLIZIZ2 = C1388190mED.LIZIZ(context2);
                        if (c19egLIZIZ2 != null) {
                            context2 = c19egLIZIZ2;
                        }
                        Dialog dialog = new Dialog(context2, R.style.lv);
                        dialog.requestWindowFeature(1);
                        dialog.setContentView(R.layout.e83);
                        dialog.setCanceledOnTouchOutside(true);
                        dialog.setCancelable(true);
                        Window window = dialog.getWindow();
                        if (window != null) {
                            window.setBackgroundDrawableResource(android.R.color.transparent);
                        }
                        LIZ.getClass();
                        View viewFindViewById = dialog.findViewById(R.id.fw4);
                        View viewFindViewById2 = dialog.findViewById(R.id.fvh);
                        View viewFindViewById3 = dialog.findViewById(R.id.fvj);
                        TextView textView = (TextView) dialog.findViewById(R.id.fw9);
                        TextView textView2 = (TextView) dialog.findViewById(R.id.fvl);
                        TextView textView3 = (TextView) dialog.findViewById(R.id.fw5);
                        C786410Ut5.I7(new AbS699S0100000_18(dialog, 67, 42), viewFindViewById);
                        C786410Ut5.I7(null, viewFindViewById2);
                        C786410Ut5.I7(new AbS699S0100000_18(dialog, 68, 42), viewFindViewById3);
                        textView.setText(str);
                        textView2.setMovementMethod(LinkMovementMethod.getInstance());
                        textView2.setText(spannableStringBuilder);
                        FrameLayout frameLayout = (FrameLayout) dialog.findViewById(R.id.fvz);
                        if (urlModel == null && 0 == 0) {
                            C786410Ut5.LJZ(8, frameLayout);
                            frameLayout.setBackground(null);
                        } else {
                            C786410Ut5.LJZ(0, frameLayout);
                            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
                            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                            layoutParams.width = iLIZIZ;
                            layoutParams.height = iLIZIZ;
                            C786410Ut5.a6(frameLayout, layoutParams);
                            Context context3 = frameLayout.getContext();
                            if (context3 != null) {
                                C384050F3z c384050F3z = new C384050F3z();
                                if (C960203pA.LIZIZ(context3)) {
                                    i = R.attr.a1h;
                                } else {
                                    i = R.attr.e1;
                                }
                                c384050F3z.LIZIZ = Integer.valueOf(i);
                                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
                                frameLayout.setBackground(c384050F3z.LIZ(context3));
                            }
                        }
                        LIZ((SmartImageView) dialog.findViewById(R.id.fvy), urlModel);
                        LIZ((SmartImageView) dialog.findViewById(R.id.fw6), urlModel2);
                        TuxIconView tuxIconView = (TuxIconView) dialog.findViewById(R.id.fvf);
                        if (urlModel == null || urlModel2 == null) {
                            i2 = 8;
                        }
                        C786410Ut5.LLLLLLZZ(tuxIconView, i2);
                        textView3.setText(C20642515q3.LJI(2131849533));
                        C786410Ut5.I7(new AbS503S0200000_12(dialog, function0, 5), textView3);
                        try {
                            C786410Ut5.B4(dialog);
                            Window window2 = dialog.getWindow();
                            if (window2 != null) {
                                window2.setLayout(-1, -1);
                            }
                            aFwS206S0000000_18.invoke();
                            c098200Yq = Unit.LIZ;
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) == null) {
                            return;
                        }
                        function0.invoke();
                        return;
                    }
                    function0.invoke();
                    return;
                }
                function0.invoke();
                return;
            }
            function0.invoke();
            return;
        }
        function0.invoke();
    }
}
