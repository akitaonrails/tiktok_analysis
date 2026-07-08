package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0eQE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1088120eQE extends LinearLayout {
    public static final /* synthetic */ int LLJJIJI = 0;
    public final C1088110eQD LL;
    public final C1088110eQD LLILLJJLI;
    public final C1088110eQD LLILLL;
    public final C1088110eQD LLILZ;
    public final C1088110eQD LLILZIL;
    public final C1088110eQD LLILZLL;
    public final C430320Gu6 LLIZ;
    public final C430320Gu6 LLIZLLLIL;
    public final boolean LLJ;
    public ValueAnimator LLJI;
    public final ArrayList<C1088110eQD> LLJIJIL;
    public final ArrayList<C430320Gu6> LLJILJIL;
    public final int LLJILJILJ;
    public final int LLJILLL;
    public final int LLJJ;
    public boolean LLJJI;
    public volatile boolean LLJJIII;

    public final void setIsGradient(boolean z) {
        this.LLJJI = z;
        Iterator<C1088110eQD> it2 = this.LLJIJIL.iterator();
        while (it2.hasNext()) {
            it2.next().setIsGradient(z);
        }
        Iterator<C430320Gu6> it3 = this.LLJILJIL.iterator();
        while (it3.hasNext()) {
            it3.next().setIsGradient(z);
        }
    }

    public final void setTextColor(int i) {
        Iterator<C1088110eQD> it2 = this.LLJIJIL.iterator();
        while (it2.hasNext()) {
            it2.next().setTextColor(i);
        }
        Iterator<C430320Gu6> it3 = this.LLJILJIL.iterator();
        while (it3.hasNext()) {
            it3.next().setTextColor(i);
        }
    }

    public final void setTextSize(float f) {
        C1088110eQD c1088110eQD = this.LL;
        if (c1088110eQD != null) {
            c1088110eQD.setTextSize(f);
        }
        C1088110eQD c1088110eQD2 = this.LLILLJJLI;
        if (c1088110eQD2 != null) {
            c1088110eQD2.setTextSize(f);
        }
        C430320Gu6 c430320Gu6 = this.LLIZ;
        if (c430320Gu6 != null) {
            c430320Gu6.setTextSize(f);
        }
        C1088110eQD c1088110eQD3 = this.LLILLL;
        if (c1088110eQD3 != null) {
            c1088110eQD3.setTextSize(f);
        }
        C1088110eQD c1088110eQD4 = this.LLILZ;
        if (c1088110eQD4 != null) {
            c1088110eQD4.setTextSize(f);
        }
        C430320Gu6 c430320Gu62 = this.LLIZLLLIL;
        if (c430320Gu62 != null) {
            c430320Gu62.setTextSize(f);
        }
        C1088110eQD c1088110eQD5 = this.LLILZIL;
        if (c1088110eQD5 != null) {
            c1088110eQD5.setTextSize(f);
        }
        C1088110eQD c1088110eQD6 = this.LLILZLL;
        if (c1088110eQD6 != null) {
            c1088110eQD6.setTextSize(f);
        }
    }

    public C1088120eQE(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJIJIL = new ArrayList<>();
        this.LLJILJIL = new ArrayList<>();
        this.LLJILJILJ = R.style.a8q;
        this.LLJILLL = R.attr.fx9;
        this.LLJJ = R.attr.fxc;
        this.LLJJI = true;
        C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.hac, this, true);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.LiveShowTimeStickerCountdownView);
            this.LLJ = typedArrayObtainStyledAttributes.getBoolean(R$styleable.LiveShowTimeStickerCountdownView_is_show_hour, this.LLJ);
            this.LLJILJILJ = typedArrayObtainStyledAttributes.getResourceId(R$styleable.LiveShowTimeStickerCountdownView_text_style, R.style.a8q);
            this.LLJILLL = typedArrayObtainStyledAttributes.getResourceId(R$styleable.LiveShowTimeStickerCountdownView_count_down_stroke_color, R.attr.fx9);
            this.LLJJ = typedArrayObtainStyledAttributes.getResourceId(R$styleable.LiveShowTimeStickerCountdownView_count_down_text_color, R.attr.fxc);
            this.LLJJI = typedArrayObtainStyledAttributes.getBoolean(R$styleable.LiveShowTimeStickerCountdownView_count_down_is_gradient, true);
            typedArrayObtainStyledAttributes.recycle();
        }
        C1088110eQD c1088110eQD = (C1088110eQD) findViewById(R.id.tv_time_hour_1);
        this.LL = c1088110eQD;
        C1088110eQD c1088110eQD2 = (C1088110eQD) findViewById(R.id.tv_time_hour_2);
        this.LLILLJJLI = c1088110eQD2;
        C430320Gu6 c430320Gu6 = (C430320Gu6) findViewById(R.id.tv_time_hour_end);
        this.LLIZ = c430320Gu6;
        C1088110eQD c1088110eQD3 = (C1088110eQD) findViewById(R.id.tv_time_minute_1);
        this.LLILLL = c1088110eQD3;
        C1088110eQD c1088110eQD4 = (C1088110eQD) findViewById(R.id.tv_time_minute_2);
        this.LLILZ = c1088110eQD4;
        C430320Gu6 c430320Gu62 = (C430320Gu6) findViewById(R.id.tv_time_minute_end);
        this.LLIZLLLIL = c430320Gu62;
        C1088110eQD c1088110eQD5 = (C1088110eQD) findViewById(R.id.tv_time_second_1);
        this.LLILZIL = c1088110eQD5;
        C1088110eQD c1088110eQD6 = (C1088110eQD) findViewById(R.id.tv_time_second_2);
        this.LLILZLL = c1088110eQD6;
        if (!this.LLJ) {
            if (c1088110eQD != null) {
                C439101nJ.LJI(c1088110eQD);
            }
            if (c1088110eQD2 != null) {
                C439101nJ.LJI(c1088110eQD2);
            }
            if (c430320Gu6 != null) {
                C439101nJ.LJI(c430320Gu6);
            }
        }
        setLayoutDirection(0);
        ArrayList<C1088110eQD> arrayListLJ = C1697810uHb.LJ(c1088110eQD, c1088110eQD2, c1088110eQD3, c1088110eQD4, c1088110eQD5, c1088110eQD6);
        this.LLJIJIL = arrayListLJ;
        this.LLJILJIL = C1697810uHb.LJ(c430320Gu6, c430320Gu62);
        c430320Gu6.setText(":");
        c430320Gu62.setText(":");
        int iLIZIZ = C20736316Cj.LIZIZ(this.LLJILLL, context);
        int iLIZIZ2 = C20736316Cj.LIZIZ(this.LLJJ, context);
        for (C1088110eQD c1088110eQD7 : arrayListLJ) {
            int i = this.LLJILJILJ;
            c1088110eQD7.LL.LJJJI(i);
            c1088110eQD7.LL.setStrokeColor(iLIZIZ);
            c1088110eQD7.LL.setTextColor(iLIZIZ2);
            c1088110eQD7.LLILLJJLI.LJJJI(i);
            c1088110eQD7.LLILLJJLI.setStrokeColor(iLIZIZ);
            c1088110eQD7.LLILLJJLI.setTextColor(iLIZIZ2);
            c1088110eQD7.LL.setText(String.valueOf(c1088110eQD7.LLILZ));
            c1088110eQD7.LLILLJJLI.setText(String.valueOf(c1088110eQD7.LLILZ));
            C430320Gu6 c430320Gu63 = c1088110eQD7.LLILLJJLI;
            int visibility = c430320Gu63.getVisibility();
            c430320Gu63.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c430320Gu63);
        }
        for (C430320Gu6 c430320Gu64 : this.LLJILJIL) {
            c430320Gu64.LJJJI(this.LLJILJILJ);
            c430320Gu64.setStrokeColor(iLIZIZ);
            c430320Gu64.setTextColor(iLIZIZ2);
        }
        setIsGradient(this.LLJJI);
    }

    public final void LIZ(long j, boolean z) {
        long j2 = 60;
        long j3 = j / j2;
        long j4 = (j3 / j2) % ((long) 24);
        long j5 = j3 % j2;
        long j6 = j % j2;
        long j7 = 10;
        this.LL.LIZ((int) (j4 / j7), z);
        this.LLILLJJLI.LIZ((int) (j4 % j7), z);
        this.LLILLL.LIZ((int) (j5 / j7), z);
        this.LLILZ.LIZ((int) (j5 % j7), z);
        this.LLILZIL.LIZ((int) (j6 / j7), z);
        this.LLILZLL.LIZ((int) (j6 % j7), z);
    }
}
