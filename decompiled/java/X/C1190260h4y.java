package X;

import Y.ACListenerS121S0200000_18;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import avg.f;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.detail.reviews.PoiDetailReviewsViewModel;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.landing.viewmodel.PoiReviewsListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS384S0200000_18;
import mf.a;

/* JADX INFO: renamed from: X.0h4y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1190260h4y extends FrameLayout {
    public final TuxIconView LL;
    public final TuxTextView LLILLJJLI;
    public final TuxTextView LLILLL;
    public final LinearLayout LLILZ;
    public EnumC1189990h4X LLILZIL;
    public PoiReviewsListViewModel LLILZLL;
    public PoiDetailReviewsViewModel LLIZ;
    public String LLIZLLLIL;
    public Integer LLJ;
    public Integer LLJI;

    public final EnumC1189990h4X getCurrScene() {
        return this.LLILZIL;
    }

    public final PoiDetailReviewsViewModel getDetailVM() {
        return this.LLIZ;
    }

    public final String getTagId() {
        return this.LLIZLLLIL;
    }

    public final PoiReviewsListViewModel getVm() {
        return this.LLILZLL;
    }

    public C1190260h4y(Context context) {
        super(context);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.e7x, this, true);
        this.LL = (TuxIconView) findViewById(R.id.m4e);
        this.LLILLJJLI = (TuxTextView) findViewById(R.id.m4l);
        this.LLILLL = (TuxTextView) findViewById(R.id.m4d);
        this.LLILZ = (LinearLayout) findViewById(R.id.m4c);
    }

    public final void LIZ(PoiReviewsApi.PoiReviewTagModel poiReviewTagModel) {
        this.LLIZLLLIL = poiReviewTagModel.getTagId();
        Integer tagEmotion = poiReviewTagModel.getTagEmotion();
        if (tagEmotion != null && tagEmotion.intValue() == 3) {
            C786410Ut5.LLLLLLZZ(this.LL, 0);
        } else {
            C786410Ut5.LLLLLLZZ(this.LL, 8);
        }
        String tagName = poiReviewTagModel.getTagName();
        if (tagName != null && tagName.length() != 0) {
            if (poiReviewTagModel.getTagReviewCount() == null) {
                C786410Ut5.LLLLZLL(this.LLILLL, 8);
            }
            this.LLILLJJLI.setText(poiReviewTagModel.getTagName());
            this.LLILLL.setText(String.valueOf(poiReviewTagModel.getTagReviewCount()));
            if (poiReviewTagModel.isSelected()) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.zr);
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(5));
                c384050F3z.LJFF = Integer.valueOf(R.attr.a1h);
                c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(1.5d))));
                setBackground(c384050F3z.LIZ(getContext()));
                this.LLILLJJLI.setTuxFont(52);
            } else {
                C384050F3z c384050F3z2 = new C384050F3z();
                c384050F3z2.LIZIZ = Integer.valueOf(R.attr.zr);
                c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(5));
                setBackground(c384050F3z2.LIZ(getContext()));
                this.LLILLJJLI.setTuxFont(51);
            }
            View.OnClickListener aCListenerS121S0200000_18 = new ACListenerS121S0200000_18(this, poiReviewTagModel, 41);
            if (C1848410yCV.LIZ) {
                aCListenerS121S0200000_18 = new f(aCListenerS121S0200000_18);
            }
            a aVar = new a(aCListenerS121S0200000_18);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(this);
            }
            setOnClickListener(aVar);
            C2211631BhB.LJ(this, new AwS384S0200000_18(poiReviewTagModel, this, 197));
            return;
        }
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
    }

    public final void setCurrScene(EnumC1189990h4X enumC1189990h4X) {
        this.LLILZIL = enumC1189990h4X;
    }

    public final void setDetailVM(PoiDetailReviewsViewModel poiDetailReviewsViewModel) {
        this.LLIZ = poiDetailReviewsViewModel;
    }

    public final void setTagId(String str) {
        this.LLIZLLLIL = str;
    }

    public final void setVm(PoiReviewsListViewModel poiReviewsListViewModel) {
        this.LLILZLL = poiReviewsListViewModel;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.LLJ == null || this.LLJI == null) {
            this.LLJ = Integer.valueOf(getMeasuredWidth());
            this.LLJI = Integer.valueOf(getMeasuredHeight());
        }
        Integer num = this.LLJ;
        if (num != null) {
            int iIntValue = num.intValue();
            Integer num2 = this.LLJI;
            if (num2 != null) {
                setMeasuredDimension(iIntValue, num2.intValue());
            }
        }
    }
}
