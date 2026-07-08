package X;

import Y.ACListenerS152S0100000_17;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import avg.f;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.RandomGiftPanelBanner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.effectmanager.common.utils.CollectionUtil;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import mf.a;

/* JADX INFO: renamed from: X.0fNS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1124840fNS extends FrameLayout implements C0T8B {
    public boolean LL;
    public final ImageView LLILLJJLI;
    public final ImageView LLILLL;
    public final C1124850fNT LLILZ;
    public final C16F5 LLILZIL;
    public final ImageView LLILZLL;
    public final View LLIZ;
    public final ConstraintLayout LLIZLLLIL;

    @Override // X.C0T8B
    public final boolean h() {
        return (this.LL && this.LLIZ.getVisibility() == 0) ? false : true;
    }

    public final void setBannerClickListener(Function0<Unit> function0) {
        View.OnClickListener aCListenerS152S0100000_17 = new ACListenerS152S0100000_17(function0, 48);
        if (C1848410yCV.LIZ) {
            aCListenerS152S0100000_17 = new f(aCListenerS152S0100000_17);
        }
        a aVar = new a(aCListenerS152S0100000_17);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
    }

    public final void setData(RandomGiftPanelBanner randomGiftPanelBanner) {
        String str;
        boolean z;
        GradientDrawable gradientDrawable;
        if (!CollectionUtil.isListEmpty(randomGiftPanelBanner.bgColors)) {
            List<String> list = randomGiftPanelBanner.bgColors;
            String str2 = null;
            if (list != null) {
                str = (String) ListProtector.get(list, 0);
            } else {
                str = null;
            }
            List<String> list2 = randomGiftPanelBanner.bgColors;
            if (list2 != null) {
                str2 = (String) ListProtector.get(list2, 1);
            }
            if (str != null && ((str.length() == 7 || str.length() == 9) && Pattern.matches("#[0-9a-fA-F]+", str))) {
                ImageView imageView = this.LLILZLL;
                int color = ColorProtector.parseColor(str);
                int color2 = ColorProtector.parseColor(str2);
                if (getLayoutDirection() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, new int[]{color, color2});
                } else {
                    gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{color, color2});
                }
                imageView.setImageDrawable(gradientDrawable);
                this.LL = true;
            }
        } else {
            setBackgroundResource(R.drawable.dtf);
            this.LL = false;
        }
        ImageModel imageModel = randomGiftPanelBanner.shadingImage;
        if (imageModel != null) {
            C1117830fC9.LIZLLL(this.LLILLL, imageModel, getLayoutParams().width, getLayoutParams().height);
        }
        ImageModel imageModel2 = randomGiftPanelBanner.leftIcon;
        if (imageModel2 != null) {
            C1126570fQF.LIZLLL(this.LLILLJJLI, imageModel2, getLayoutParams().width, getLayoutParams().height, R.drawable.exe, null, 80);
        }
        String str3 = randomGiftPanelBanner.displayText;
        if (str3 != null) {
            this.LLILZIL.setText(str3);
            this.LLILZIL.setHorizontalFadingEdgeEnabled(true);
            this.LLILZIL.setWillNotDraw(false);
            C1118060fCW.LIZ(this.LLILZIL);
        }
        if (randomGiftPanelBanner.round == 1) {
            if (randomGiftPanelBanner.collectNum != 0) {
                C786410Ut5.LJLLLLLL(0, this.LLILZ);
                this.LLILZ.setProgress((randomGiftPanelBanner.collectNum / randomGiftPanelBanner.targetNum) * 100);
                return;
            } else {
                C786410Ut5.LJLLLLLL(8, this.LLILZ);
                return;
            }
        }
        C786410Ut5.LJLLLLLL(0, this.LLILZ);
        long j = randomGiftPanelBanner.collectNum;
        if (j != 0) {
            this.LLILZ.setProgress((j / randomGiftPanelBanner.targetNum) * 100);
        } else {
            this.LLILZ.setProgress((0.5f / randomGiftPanelBanner.targetNum) * 100);
        }
    }

    public C1124840fNS(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        FrameLayout.inflate(context, R.layout.hzn, this);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.tsc);
        this.LLIZLLLIL = constraintLayout;
        ImageView imageView = (ImageView) findViewById(R.id.mk3);
        this.LLILLJJLI = imageView;
        this.LLILLL = (ImageView) findViewById(R.id.uxp);
        this.LLILZ = (C1124850fNT) findViewById(R.id.s_4);
        C16F5 c16f5 = (C16F5) findViewById(R.id.iwr);
        c16f5.setTypeface(C1119920fFW.LIZJ(c16f5.getTextSize(), 500, context));
        this.LLILZIL = c16f5;
        this.LLILZLL = (ImageView) findViewById(R.id.bxa);
        this.LLIZ = findViewById(R.id.wit);
        if (C1125810fP1.LIZJ()) {
            C19MB c19mb = new C19MB();
            c19mb.LJII(constraintLayout);
            c19mb.LJIILL(R.id.s_4, 0);
            c19mb.LJIIIZ(R.id.s_4, 7, R.id.wit, 6, 0);
            c19mb.LIZIZ(this.LLIZLLLIL);
            C500260Jjc.LJLJLLL((int) C1117830fC9.LIZJ(36), imageView);
            C500260Jjc.LJJZ((int) C1117830fC9.LIZJ(36), imageView);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getLayoutDirection() == 1) {
            C786410Ut5.Qb(this.LLILLJJLI, -1.0f);
            C786410Ut5.Qb(this.LLILLL, -1.0f);
        }
    }
}
