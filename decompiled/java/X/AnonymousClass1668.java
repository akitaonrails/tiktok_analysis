package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.api.model.AmberAlertCardInfo;
import com.ss.android.ugc.aweme.compliance.api.model.PictureInfo;
import com.ss.android.ugc.aweme.compliance.protection.amberalert.AmberAlertStorage;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.1668, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class AnonymousClass1668 extends C1617910sCj {
    public final TuxIconView LL;
    public final TuxTextView LLILLJJLI;
    public final View LLILLL;
    public final View LLILZ;
    public final SmartImageView LLILZIL;
    public final TuxTextView LLILZLL;
    public final View LLIZ;
    public final SmartImageView LLIZLLLIL;
    public final TuxTextView LLJ;
    public final RecyclerView LLJI;
    public final C197039127h LLJIJIL;
    public final C197039127h LLJILJIL;
    public AmberAlertCardInfo LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public long LLJJI;
    public IViewPagerComponentAbility LLJJIII;

    public final C2344009Gk e0() {
        String str;
        C2344009Gk c2344009Gk = new C2344009Gk();
        AmberAlertCardInfo amberAlertCardInfo = this.LLJILJILJ;
        c2344009Gk.LJIIIIZZ("amberalert_id", amberAlertCardInfo != null ? amberAlertCardInfo.alertId : null);
        AmberAlertCardInfo amberAlertCardInfo2 = this.LLJILJILJ;
        c2344009Gk.LJ(amberAlertCardInfo2 != null ? amberAlertCardInfo2.amberAlertVersion : null, "amber_alert_version");
        AmberAlertCardInfo amberAlertCardInfo3 = this.LLJILJILJ;
        c2344009Gk.LJIIIIZZ("messagetimestamp", amberAlertCardInfo3 != null ? amberAlertCardInfo3.messageTimeStamp : null);
        Keva keva = C20548715av.LIZ;
        AmberAlertCardInfo amberAlertCardInfo4 = this.LLJILJILJ;
        if (amberAlertCardInfo4 == null || (str = amberAlertCardInfo4.alertId) == null) {
            str = "";
        }
        AmberAlertStorage amberAlertStorageLIZ = C20548715av.LIZ(str);
        c2344009Gk.LIZJ(amberAlertStorageLIZ != null ? amberAlertStorageLIZ.totalShownTimes : 0, "amber_alert_send_frequency");
        return c2344009Gk;
    }

    public AnonymousClass1668(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C786410Ut5.Sd(R.layout.bf2, C786410Ut5.ne(context), this);
        this.LL = (TuxIconView) findViewById(R.id.awd);
        this.LLILLJJLI = (TuxTextView) findViewById(R.id.awf);
        this.LLILLL = findViewById(R.id.qfo);
        this.LLILZ = findViewById(R.id.qfl);
        this.LLILZIL = (SmartImageView) findViewById(R.id.qfj);
        this.LLILZLL = (TuxTextView) findViewById(R.id.qfs);
        this.LLIZ = findViewById(R.id.qfm);
        this.LLIZLLLIL = (SmartImageView) findViewById(R.id.qfk);
        this.LLJ = (TuxTextView) findViewById(R.id.qft);
        this.LLJI = (RecyclerView) findViewById(R.id.awb);
        this.LLJIJIL = (C197039127h) findViewById(R.id.fq8);
        this.LLJILJIL = (C197039127h) findViewById(R.id.d9e);
    }

    public static void h0(View view, SmartImageView smartImageView, TuxTextView tuxTextView, PictureInfo pictureInfo) {
        String str = pictureInfo.pictureLink;
        if (str != null && str.length() != 0) {
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(UriProtector.parse(pictureInfo.pictureLink).buildUpon().appendQueryParameter("x-tt-pns-dt-pass-id", "269484039").toString());
            c1331670kl3LJIIIZ.LJJ(smartImageView);
            C786410Ut5.h3(c1331670kl3LJIIIZ);
            if (tuxTextView != null) {
                tuxTextView.setText(pictureInfo.pictureName);
            }
        }
    }
}
