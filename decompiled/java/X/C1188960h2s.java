package X;

import Y.ACListenerS14S2200000_18;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import avg.f;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.PoiAnchorInfo;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import mf.a;

/* JADX INFO: renamed from: X.0h2s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1188960h2s extends LinearLayout {
    public TuxTextView LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public SmartImageView LLILZ;
    public String LLILZIL;
    public String LLILZLL;
    public Aweme LLIZ;

    public final void LIZIZ() {
        C1188950h2r c1188950h2r = C1188950h2r.LIZ;
        Aweme aweme = this.LLIZ;
        String str = this.LLILZIL;
        String str2 = this.LLILZLL;
        PageFinder pageFinderVia = PageFinder.via((View) this);
        c1188950h2r.getClass();
        if (aweme == null || str == null) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("dist_poi_entrance_type", "tag");
        c2344009Gk.LJIIIIZZ("dist_poi_entrance_subtype", str2);
        PoiDataStruct poiDataStruct = aweme.getPoiDataStruct();
        C1189060h32.LJIJJLI(c2344009Gk, "poi_id", poiDataStruct != null ? poiDataStruct.poiId : null);
        C1188950h2r.LIZIZ(c2344009Gk, aweme);
        PoiDataStruct poiDataStruct2 = aweme.getPoiDataStruct();
        C1189060h32.LIZJ(c2344009Gk, poiDataStruct2 != null ? poiDataStruct2.collectInfo : null);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinderVia);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("ttls_dist_poi_entrance_show", map, c1185050gwZ);
    }

    public final TuxTextView getDividerView() {
        return this.LLILLL;
    }

    public final TuxTextView getSubTitleView() {
        return this.LLILLJJLI;
    }

    public final SmartImageView getTagIcon() {
        return this.LLILZ;
    }

    public final TuxTextView getTitleView() {
        return this.LL;
    }

    public final void LIZJ(boolean z) {
        int i;
        int i2;
        Drawable drawableLIZ;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        this.LL = (TuxTextView) findViewById(R.id.x2e);
        this.LLILLJJLI = (TuxTextView) findViewById(R.id.x28);
        this.LLILLL = (TuxTextView) findViewById(R.id.y2q);
        this.LLILZ = (SmartImageView) findViewById(R.id.x1c);
        if (z) {
            i = 52;
            i2 = 16;
        } else {
            i = 72;
            i2 = 14;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2)));
        TuxTextView tuxTextView = this.LL;
        if (tuxTextView != null) {
            tuxTextView.setTuxFont(i);
        }
        TuxTextView tuxTextView2 = this.LLILLJJLI;
        if (tuxTextView2 != null) {
            tuxTextView2.setTuxFont(i);
        }
        TuxTextView tuxTextView3 = this.LLILLL;
        if (tuxTextView3 != null) {
            tuxTextView3.setTuxFont(i);
        }
        SmartImageView smartImageView = this.LLILZ;
        if (smartImageView != null && (layoutParams2 = smartImageView.getLayoutParams()) != null) {
            layoutParams2.width = iLIZIZ;
        }
        SmartImageView smartImageView2 = this.LLILZ;
        if (smartImageView2 != null && (layoutParams = smartImageView2.getLayoutParams()) != null) {
            layoutParams.height = iLIZIZ;
        }
        if (z) {
            drawableLIZ = null;
        } else {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.ij);
            drawableLIZ = c384050F3z.LIZ(getContext());
        }
        setBackground(drawableLIZ);
    }

    public final void setDividerView(TuxTextView tuxTextView) {
        this.LLILLL = tuxTextView;
    }

    public final void setSubTitleView(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setTagIcon(SmartImageView smartImageView) {
        this.LLILZ = smartImageView;
    }

    public final void setTitleView(TuxTextView tuxTextView) {
        this.LL = tuxTextView;
    }

    public C1188960h2s(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public final void LIZ(Aweme aweme, String str, String str2) {
        UrlModel urlModel;
        String str3;
        PoiAnchorInfo poiAnchorInfo;
        String str4;
        UrlModel urlModel2;
        if (aweme == null) {
            return;
        }
        this.LLIZ = aweme;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        String str5 = null;
        if (C0DJS.LIZ()) {
            C1180600gpO c1180600gpO = new C1180600gpO("feed_detail", "poi_anchor", null);
            PoiDataStruct poiDataStruct = aweme.getPoiDataStruct();
            if (poiDataStruct == null || (str4 = poiDataStruct.poiId) == null) {
                str4 = "";
            }
            c1180600gpO.LIZLLL = new C1202680hP0(str4, null, null, null, null, 30);
            aweme.getPoiDataStruct();
            Context context = getContext();
            PoiDataStruct poiDataStruct2 = aweme.getPoiDataStruct();
            if (poiDataStruct2 != null) {
                urlModel2 = poiDataStruct2.icon;
            } else {
                urlModel2 = null;
            }
            C1189360h3W c1189360h3WLIZIZ = C1179410gnT.LIZIZ(c1180600gpO, context, C438710HIf.LIZ(urlModel2));
            c1189360h3WLIZIZ.LIZLLL(this.LLILZ);
            c1189360h3WLIZIZ.LIZIZ();
        } else {
            PoiDataStruct poiDataStruct3 = aweme.getPoiDataStruct();
            if (poiDataStruct3 != null) {
                urlModel = poiDataStruct3.icon;
            } else {
                urlModel = null;
            }
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
            c1331670kl3LJIIIIZZ.LJJ(this.LLILZ);
            c1331670kl3LJIIIIZZ.LJIIJJI();
        }
        PoiDataStruct poiDataStruct4 = aweme.getPoiDataStruct();
        if (poiDataStruct4 != null) {
            str3 = poiDataStruct4.poiName;
        } else {
            str3 = null;
        }
        PoiDataStruct poiDataStruct5 = aweme.getPoiDataStruct();
        if (poiDataStruct5 != null && (poiAnchorInfo = poiDataStruct5.videoTag) != null) {
            str5 = poiAnchorInfo.suffix;
        }
        TuxTextView tuxTextView = this.LL;
        TuxTextView tuxTextView2 = this.LLILLJJLI;
        TuxTextView tuxTextView3 = this.LLILLL;
        if (str3 != null && tuxTextView != null && tuxTextView2 != null && tuxTextView3 != null) {
            C338880DQg.LIZ(str3, tuxTextView, str5, tuxTextView2, tuxTextView3, null);
        }
        View.OnClickListener aCListenerS14S2200000_18 = new ACListenerS14S2200000_18(this, aweme, str, str2, 0);
        if (C1848410yCV.LIZ) {
            aCListenerS14S2200000_18 = new f(aCListenerS14S2200000_18);
        }
        a aVar = new a(aCListenerS14S2200000_18);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
    }
}
