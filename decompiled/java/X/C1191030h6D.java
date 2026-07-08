package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.poi.reviews.landing.ui.PoiReviewsNavAssem;
import com.ss.android.ugc.aweme.poi.uiwidget.richtext.LsRichText;
import com.ss.android.ugc.aweme.poi.uiwidget.richtext.LsRichTextItem;
import com.ss.android.ugc.aweme.poi.uiwidget.richtext.TextContent;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import kotlin.jvm.internal.AFwS256S0000000_18;

/* JADX INFO: renamed from: X.0h6D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@InterfaceC20647615qs("poi_review_intro_pop")
public final class C1191030h6D extends AbstractC20660115st<DialogFragment> {
    public final InterfaceC20660615sy LL;
    public final FragmentManager LLILLJJLI;
    public final InterfaceC1190960h66 LLILLL;

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 10;
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C688120Qyw c688120Qyw) {
        boolean z;
        C770750ULh c770750ULh = new C770750ULh();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_bubble_ellipsis_right;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        c770750ULh.LIZIZ = c419910GdJ;
        c770750ULh.LIZLLL = 3;
        c770750ULh.LJ = c688120Qyw.LIZ.getString(2131844845);
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "poi_review_enrich_review", false) == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Context context = c688120Qyw.LIZ;
            C1193610hAN c1193610hAN = new C1193610hAN(context);
            c1193610hAN.LIZ(new LsRichText(context.getString(2131849535), Collections.singletonList(new LsRichTextItem(0, "{{report}}", new TextContent(context.getString(2131849536), "https://support.tiktok.com/en/safety-hc/report-a-problem"), null, "{\"font\":\"tux://font?token=H4_REGULAR&from=poi_review_tabelog\",\"font_color\":\"tux://color?token=UITextInfo&from=poi_review_tabelog\"}", null)), "{\"font\":\"tux://font?token=H4_REGULAR&from=poi_review_tabelog\",\"font_color\":\"tux://color?token=UIText1&from=poi_review_tabelog\"}", null), new InterfaceC1193660hAS() { // from class: X.0h6E
                @Override // X.InterfaceC1193660hAS
                public final void LIZ(String str, View view) {
                    if (str == null) {
                        return;
                    }
                    String string = UriProtector.parse("aweme://webview").buildUpon().appendQueryParameter("url", str).toString();
                    C1367960lha.LIZ.getClass();
                    C1367960lha.LIZ().LJJLIIIJLLLLLLLZ(view.getContext(), string);
                }
            });
            c770750ULh.LJFF(new C345890DhD(c688120Qyw.LIZ.getString(2131846654), true), new C345890DhD(c688120Qyw.LIZ.getString(2131846655), true), new C345890DhD(c688120Qyw.LIZ.getString(2131846656), true), new C345890DhD(c1193610hAN.LIZIZ, true));
        } else {
            c770750ULh.LJFF(new C345890DhD(c688120Qyw.LIZ.getString(2131844842), true), new C345890DhD(c688120Qyw.LIZ.getString(2131844841), true), new C345890DhD(c688120Qyw.LIZ.getString(2131844843), true), new C345890DhD(c688120Qyw.LIZ.getString(2131844844), true));
        }
        c770750ULh.LJIILLIIL = true;
        c770750ULh.LJI(c688120Qyw.LIZ.getString(2131850354), AFwS256S0000000_18.get$arr$(898));
        TuxSheet tuxSheet = c770750ULh.LIZIZ().LIZ;
        tuxSheet.LLILLL = true;
        tuxSheet.LLJLLL = false;
        tuxSheet.LLJLLIL = true;
        tuxSheet.LLILLJJLI = new DialogInterfaceOnDismissListenerC1208810hYt(this, 3);
        tuxSheet.show(this.LLILLJJLI, "poi_review_intro");
        return tuxSheet;
    }

    public C1191030h6D(PoiReviewsNavAssem poiReviewsNavAssem, FragmentManager fragmentManager, C1190950h65 c1190950h65) {
        super(poiReviewsNavAssem);
        this.LL = poiReviewsNavAssem;
        this.LLILLJJLI = fragmentManager;
        this.LLILLL = c1190950h65;
    }
}
