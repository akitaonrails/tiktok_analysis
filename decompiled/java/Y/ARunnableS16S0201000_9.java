package Y;

import X.C098200Yq;
import X.C0NI0;
import X.C0NI2;
import X.C10LU;
import X.C1483340ohg;
import X.C1601400rm6;
import X.C189200o6;
import X.C1C7U;
import X.C1EE2;
import X.C2179971ATj;
import X.C278560Avu;
import X.C282900B6y;
import X.C582980Mtk;
import X.C630470Oo9;
import X.EnumC1334360kpO;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.DynamicLayout;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinUnreadIndicatorAssem;
import java.util.List;
import kotlin.Unit;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes10.dex */
public class ARunnableS16S0201000_9 implements Runnable {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C630470Oo9 c630470Oo9;
        Rect rect = new Rect();
        ((View) this.l0).getHitRect(rect);
        int i = -((int) ((this.i2 * ((View) this.l0).getResources().getDisplayMetrics().density) + 0.5f));
        rect.inset(i, i);
        TouchDelegate touchDelegate = ((ViewGroup) this.l1).getTouchDelegate();
        if (touchDelegate instanceof C630470Oo9) {
            c630470Oo9 = (C630470Oo9) touchDelegate;
        } else {
            c630470Oo9 = new C630470Oo9((ViewGroup) this.l1);
            ((ViewGroup) this.l1).setTouchDelegate(c630470Oo9);
        }
        c630470Oo9.LIZ.add(new TouchDelegate(rect, (View) this.l0));
    }

    public final void LIZ$1() {
        for (Aweme aweme : (List) this.l0) {
            if (((Boolean) C282900B6y.LIZ.getValue()).booleanValue()) {
                C0NI0 c0ni0 = C0NI0.LIZ;
                C0NI2 c0ni2 = C0NI2.PRELOAD;
                c0ni0.getClass();
                C0NI0.LJFF(aweme, c0ni2);
            }
            C1483340ohg.LJIL(this.i2, aweme);
            if (C582980Mtk.LIZIZ(aweme)) {
                C1EE2.LIZIZ.LJJIFFI((Context) this.l1, "homepage_friends", aweme, new IntRange(0, ((Number) C278560Avu.LIZ.getValue()).intValue()), EnumC1334360kpO.LOW);
            }
        }
    }

    public final void LIZ$2() {
        SpannableStringBuilder spannableStringBuilder;
        int iOffsetByCodePoints;
        int width = (((C10LU) this.l0).L5().getWidth() - ((C10LU) this.l0).L5().getPaddingLeft()) - ((C10LU) this.l0).L5().getPaddingRight();
        if (width <= 0) {
            return;
        }
        int[] iArr = {62, 72, 82};
        int i = 0;
        do {
            ((C10LU) this.l0).L5().setTuxFont(iArr[i]);
            int i2 = C10LU.LLJILJIL;
            spannableStringBuilder = (SpannableStringBuilder) this.l1;
            TextPaint paint = ((C10LU) this.l0).L5().getPaint();
            int i3 = this.i2;
            DynamicLayout dynamicLayout = new DynamicLayout(spannableStringBuilder, paint, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            if (dynamicLayout.getLineCount() > 2) {
                float fMeasureText = width - (paint.measureText("... ") + i3);
                int lineStart = dynamicLayout.getLineStart(1);
                String string = spannableStringBuilder.toString();
                while (lineStart < spannableStringBuilder.length() - 1 && '\n' != spannableStringBuilder.charAt(lineStart) && (iOffsetByCodePoints = string.offsetByCodePoints(lineStart, 1)) <= spannableStringBuilder.length()) {
                    fMeasureText -= paint.measureText(spannableStringBuilder, lineStart, iOffsetByCodePoints);
                    if (fMeasureText <= 0.0f) {
                        break;
                    } else {
                        lineStart = iOffsetByCodePoints;
                    }
                }
                CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder.subSequence(0, lineStart));
                spannableStringBuilder2.append((CharSequence) "... ");
                spannableStringBuilder2.append(charSequenceSubSequence);
                spannableStringBuilder = spannableStringBuilder2;
            }
            if (spannableStringBuilder == ((SpannableStringBuilder) this.l1)) {
                break;
            } else {
                i++;
            }
        } while (i < 3);
        ((C10LU) this.l0).L5().setText(spannableStringBuilder);
    }

    public static final void run$0(ARunnableS16S0201000_9 aRunnableS16S0201000_9) {
        try {
            ((TextView) aRunnableS16S0201000_9.l0).setTypeface((Typeface) aRunnableS16S0201000_9.l1, aRunnableS16S0201000_9.i2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public static final void run$1(ARunnableS16S0201000_9 aRunnableS16S0201000_9) {
        boolean zLIZ;
        C1C7U.LIZ("BulletinUnreadIndicatorAssem@2ee0.smoothScrollToPosition$1$1");
        try {
            ((BulletinUnreadIndicatorAssem) aRunnableS16S0201000_9.l0).Ho().LIZ = aRunnableS16S0201000_9.i2;
            ((LinearLayoutManager) aRunnableS16S0201000_9.l1).startSmoothScroll(((BulletinUnreadIndicatorAssem) aRunnableS16S0201000_9.l0).Ho());
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BulletinUnreadIndicatorAssem@2ee0.smoothScrollToPosition$1$1");
    }

    public static final void run$2(ARunnableS16S0201000_9 aRunnableS16S0201000_9) {
        boolean zLIZ;
        C1C7U.LIZ("TouchDelegateUtils@78fe.expandHitRect$1");
        try {
            aRunnableS16S0201000_9.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TouchDelegateUtils@78fe.expandHitRect$1");
    }

    public static final void run$3(ARunnableS16S0201000_9 aRunnableS16S0201000_9) {
        boolean zLIZ;
        C1C7U.LIZ("FriendsV3FeedRepository@1744.preloadResource$2");
        try {
            aRunnableS16S0201000_9.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FriendsV3FeedRepository@1744.preloadResource$2");
    }

    public static final void run$4(ARunnableS16S0201000_9 aRunnableS16S0201000_9) {
        boolean zLIZ;
        C1C7U.LIZ("SuperRecommendViewHolderV2@a91f.bindSignature$1");
        try {
            aRunnableS16S0201000_9.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SuperRecommendViewHolderV2@a91f.bindSignature$1");
    }

    public static final void run$5(ARunnableS16S0201000_9 aRunnableS16S0201000_9) {
        boolean zLIZ;
        C1C7U.LIZ("FypFeedFetchOpt@ccf9.handleData$2");
        try {
            try {
                ((C1601400rm6) aRunnableS16S0201000_9.l0).LIZ(aRunnableS16S0201000_9.i2, (FeedItemList) aRunnableS16S0201000_9.l1);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FypFeedFetchOpt@ccf9.handleData$2");
    }

    public ARunnableS16S0201000_9(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.l0 = obj2;
        this.i2 = i;
        this.l1 = obj;
    }
}
