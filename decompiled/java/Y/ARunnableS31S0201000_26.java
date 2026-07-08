package Y;

import X.AbstractC426530Gnz;
import X.C0H9H;
import X.C12ES;
import X.C1699260uJw;
import X.C1699270uJx;
import X.C1699430uKD;
import X.C1721130utD;
import X.C1761490vwJ;
import X.C1765540w2q;
import X.C1766780w4q;
import X.C1857350yQv;
import X.C1C7U;
import X.C418440Gaw;
import X.C426750GoL;
import X.C786410Ut5;
import X.C814420VxA;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import android.graphics.RectF;
import android.os.Process;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.Surface;
import android.view.View;
import com.bytedance.android.live.design.view.sheet.LiveBottomSheetBehavior;
import com.bytedance.android.livesdk.livesetting.watchlive.player.LiveEnablePlayerSetTimeoutSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoUserGuideItem;
import com.tts.oecverify.BdTuring;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public class ARunnableS31S0201000_26 implements Runnable {
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
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0078 A[PHI: r1
      0x0078: PHI (r1v10 java.util.Map<java.lang.String, java.lang.Object>) = (r1v9 java.util.Map<java.lang.String, java.lang.Object>), (r1v12 java.util.Map<java.lang.String, java.lang.Object>) binds: [B:29:0x0077, B:14:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b0 A[Catch: all -> 0x00df, CancellationException -> 0x00ef, TryCatch #2 {CancellationException -> 0x00ef, all -> 0x00df, blocks: (B:31:0x007d, B:33:0x0083, B:34:0x0086, B:36:0x008c, B:38:0x0091, B:40:0x00a5, B:45:0x00b0, B:48:0x00be, B:50:0x00c3, B:51:0x00c7, B:53:0x00cb, B:55:0x00cf, B:56:0x00d3, B:47:0x00ba, B:41:0x00a8, B:43:0x00ac), top: B:64:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ba A[Catch: all -> 0x00df, CancellationException -> 0x00ef, PHI: r1
      0x00ba: PHI (r1v4 java.util.Map<java.lang.String, java.lang.Object>) = (r1v3 java.util.Map<java.lang.String, java.lang.Object>), (r1v6 java.util.Map<java.lang.String, java.lang.Object>) binds: [B:46:0x00b9, B:44:0x00ae] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x00ef, all -> 0x00df, blocks: (B:31:0x007d, B:33:0x0083, B:34:0x0086, B:36:0x008c, B:38:0x0091, B:40:0x00a5, B:45:0x00b0, B:48:0x00be, B:50:0x00c3, B:51:0x00c7, B:53:0x00cb, B:55:0x00cf, B:56:0x00d3, B:47:0x00ba, B:41:0x00a8, B:43:0x00ac), top: B:64:0x007d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$0() {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS31S0201000_26.LIZ$0():void");
    }

    public final void LIZ$1() {
        try {
            int width = (((C1766780w4q) this.l0).getWidth() - ((C1766780w4q) this.l0).getPaddingStart()) - ((C1766780w4q) this.l0).getPaddingEnd();
            if (((C1766780w4q) this.l0).getLayout() == null || ((C1766780w4q) this.l0).getLayout().getLineCount() == 0) {
                ((C1766780w4q) this.l0).measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(C12ES.LJIIIIZZ(((C1766780w4q) this.l0).getContext()), Integer.MIN_VALUE));
            }
            C1761490vwJ c1761490vwJ = new C1761490vwJ((C1766780w4q) this.l0, width, "", this.i2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
            CharSequence text = ((C1766780w4q) this.l0).getText();
            if (text == null) {
                text = "";
            }
            SpannableString spannableStringLIZ = c1761490vwJ.LIZ(SpannableString.valueOf(text));
            if (c1761490vwJ.LIZLLL) {
                ((C1766780w4q) this.l0).setMaxLines(Integer.MAX_VALUE);
                int width2 = (((C1766780w4q) this.l0).getWidth() - ((C1766780w4q) this.l0).getPaddingStart()) - ((C1766780w4q) this.l0).getPaddingEnd();
                final AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26((C1766780w4q) this.l0, 1385);
                ((C1766780w4q) this.l0).LLJJLIIIJLLLLLLLZ = new SpannableStringBuilder(((C1766780w4q) this.l0).getText());
                C1766780w4q c1766780w4q = (C1766780w4q) this.l0;
                SpannableStringBuilder spannableStringBuilder = c1766780w4q.LLJJLIIIJLLLLLLLZ;
                if (spannableStringBuilder != null) {
                    spannableStringBuilder.append((CharSequence) "\n");
                    SpannableStringBuilder spannableStringBuilder2 = c1766780w4q.LLJJLIIIJLLLLLLLZ;
                    if (spannableStringBuilder2 != null) {
                        AbstractC426530Gnz abstractC426530Gnz = new AbstractC426530Gnz() { // from class: X.0w4o
                            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                            public final void updateDrawState(TextPaint textPaint) {
                            }

                            @Override // android.text.style.ClickableSpan
                            public final void onClick(View view) {
                                awS570S0100000_26.invoke();
                            }
                        };
                        SpannableStringBuilder spannableStringBuilder3 = c1766780w4q.LLJJLIIIJLLLLLLLZ;
                        C786410Ut5.q2(spannableStringBuilder2, abstractC426530Gnz, 0, spannableStringBuilder3 != null ? spannableStringBuilder3.length() : 0, 33);
                    }
                    c1766780w4q.LJJJLZIJ(spannableStringBuilder, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15)), width2 - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15)), C426750GoL.LIZLLL(c1766780w4q.getContext()), awS570S0100000_26);
                }
                ((C1766780w4q) this.l0).LLJJL = new SpannableStringBuilder(spannableStringLIZ).append((CharSequence) ((C1766780w4q) this.l0).LLJL);
                SpannableStringBuilder spannableStringBuilder4 = ((C1766780w4q) this.l0).LLJJL;
                if (spannableStringBuilder4 != null) {
                    AbstractC426530Gnz abstractC426530Gnz2 = new AbstractC426530Gnz() { // from class: X.0w4p
                        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                        public final void updateDrawState(TextPaint textPaint) {
                        }

                        @Override // android.text.style.ClickableSpan
                        public final void onClick(View view) {
                            awS570S0100000_26.invoke();
                        }
                    };
                    SpannableStringBuilder spannableStringBuilder5 = ((C1766780w4q) this.l0).LLJJL;
                    C786410Ut5.q2(spannableStringBuilder4, abstractC426530Gnz2, 0, spannableStringBuilder5 != null ? spannableStringBuilder5.length() : 0, 33);
                }
                C1766780w4q c1766780w4q2 = (C1766780w4q) this.l0;
                c1766780w4q2.setText(c1766780w4q2.LLJJL);
                ((C1766780w4q) this.l0).requestLayout();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            ((C1766780w4q) this.l0).setText((CharSequence) this.l1);
            ((C1766780w4q) this.l0).setMaxLines(this.i2);
        }
    }

    public final void LIZ$2() {
        C1765540w2q c1765540w2q = (C1765540w2q) this.l0;
        c1765540w2q.LLJJIJIL = true;
        c1765540w2q.LLJJIJIIJIL = false;
        RectF rectF = c1765540w2q.LLJI[c1765540w2q.LLJ].LIZJ;
        if (rectF != null) {
            C0H9H.LJI((((int) rectF.bottom) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14))) - this.i2, (View) this.l1);
        }
        C786410Ut5.LJLLLLLL(0, (View) this.l1);
    }

    public static final void run$0(ARunnableS31S0201000_26 aRunnableS31S0201000_26) {
        C1699260uJw c1699260uJw = (C1699260uJw) aRunnableS31S0201000_26.l0;
        int i = aRunnableS31S0201000_26.i2;
        Surface surface = (Surface) aRunnableS31S0201000_26.l1;
        c1699260uJw.getClass();
        C1C7U.LIZ("TTLivePlayer2@b012.asyncSetSurface$2L");
        c1699260uJw.LJJJJZ(i, surface);
        C1C7U.LIZIZ("TTLivePlayer2@b012.asyncSetSurface$2L");
    }

    public static final void run$1(ARunnableS31S0201000_26 aRunnableS31S0201000_26) {
        ExecutorService executorService;
        C1699270uJx c1699270uJx = (C1699270uJx) aRunnableS31S0201000_26.l0;
        Surface surface = (Surface) aRunnableS31S0201000_26.l1;
        int i = aRunnableS31S0201000_26.i2;
        c1699270uJx.getClass();
        C1C7U.LIZ("TTLivePlayer3@b013.asyncSetSurface$1L");
        Process.setThreadPriority(-20);
        AObjectS72S0201000_26 aObjectS72S0201000_26 = new AObjectS72S0201000_26(c1699270uJx, i, surface, 1);
        if (LiveEnablePlayerSetTimeoutSetting.INSTANCE.getValue() && (executorService = c1699270uJx.LLJJIII) != null && !executorService.isShutdown()) {
            try {
                c1699270uJx.LLJJIII.submit(new ACallableS425S0100000_20(aObjectS72S0201000_26, 0)).get(i, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                TryCatchGuardChecker.doCheck(e);
                c1699270uJx.LL = new C1699430uKD(6);
            } catch (ExecutionException e2) {
                TryCatchGuardChecker.doCheck(e2);
                c1699270uJx.LL = new C1699430uKD(6);
            } catch (TimeoutException e3) {
                TryCatchGuardChecker.doCheck(e3);
                c1699270uJx.LL = new C1699430uKD(6);
            }
        } else {
            aObjectS72S0201000_26.invoke();
        }
        C1C7U.LIZIZ("TTLivePlayer3@b013.asyncSetSurface$1L");
    }

    public static final void run$2(ARunnableS31S0201000_26 aRunnableS31S0201000_26) {
        C1699260uJw c1699260uJw = (C1699260uJw) aRunnableS31S0201000_26.l0;
        int i = aRunnableS31S0201000_26.i2;
        Surface surface = (Surface) aRunnableS31S0201000_26.l1;
        c1699260uJw.getClass();
        C1C7U.LIZ("TTLivePlayer2@b012.asyncSetSurface$1L");
        Process.setThreadPriority(-20);
        c1699260uJw.LJIL(5, i, new AObjectS72S0201000_26(c1699260uJw, i, surface, 0));
        C1C7U.LIZIZ("TTLivePlayer2@b012.asyncSetSurface$1L");
    }

    public static final void run$3(ARunnableS31S0201000_26 aRunnableS31S0201000_26) {
        boolean zLIZ;
        C1C7U.LIZ("CarouselV2Card@1bab.updateCurrentPageHeightAfterLayout$1");
        try {
            ((C1721130utD) aRunnableS31S0201000_26.l0).LJIIIZ((ViewOnAttachStateChangeListenerC20631115oD) aRunnableS31S0201000_26.l1, aRunnableS31S0201000_26.i2 - 1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CarouselV2Card@1bab.updateCurrentPageHeightAfterLayout$1");
    }

    public static final void run$4(ARunnableS31S0201000_26 aRunnableS31S0201000_26) {
        boolean zLIZ;
        C1C7U.LIZ("CarouselV2Card@1bab.updateCurrentPageHeightAfterLayout$currentPage$1$1");
        try {
            ((C1721130utD) aRunnableS31S0201000_26.l0).LJIIIZ((ViewOnAttachStateChangeListenerC20631115oD) aRunnableS31S0201000_26.l1, aRunnableS31S0201000_26.i2 - 1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CarouselV2Card@1bab.updateCurrentPageHeightAfterLayout$currentPage$1$1");
    }

    public static final void run$5(ARunnableS31S0201000_26 aRunnableS31S0201000_26) {
        boolean zLIZ;
        C1C7U.LIZ("EcVideoGuideAssem@5df3.dismissShopGuide$1");
        try {
            aRunnableS31S0201000_26.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcVideoGuideAssem@5df3.dismissShopGuide$1");
    }

    public static final void run$6(ARunnableS31S0201000_26 aRunnableS31S0201000_26) {
        boolean zLIZ;
        C1C7U.LIZ("TakoUserLandingItemView@612e.bindContent$2");
        try {
            Function2 function2 = (Function2) aRunnableS31S0201000_26.l0;
            String str = ((TakoUserGuideItem) aRunnableS31S0201000_26.l1).text;
            if (str == null) {
                str = "";
            }
            function2.invoke(C1857350yQv.LIZIZ(str), Integer.valueOf(aRunnableS31S0201000_26.i2));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoUserLandingItemView@612e.bindContent$2");
    }

    public static final void run$7(ARunnableS31S0201000_26 aRunnableS31S0201000_26) {
        boolean zLIZ;
        C1C7U.LIZ("ResizeLogoTuxTextView@c6ec.setExpandDesc$1");
        try {
            aRunnableS31S0201000_26.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ResizeLogoTuxTextView@c6ec.setExpandDesc$1");
    }

    public static final void run$8(ARunnableS31S0201000_26 aRunnableS31S0201000_26) {
        boolean zLIZ;
        C1C7U.LIZ("LiveBottomSheetBehavior@e6e1.settleToStatePendingLayout$1");
        try {
            ((LiveBottomSheetBehavior) aRunnableS31S0201000_26.l1).settleToState((View) aRunnableS31S0201000_26.l0, aRunnableS31S0201000_26.i2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveBottomSheetBehavior@e6e1.settleToStatePendingLayout$1");
    }

    public static final void run$9(ARunnableS31S0201000_26 aRunnableS31S0201000_26) {
        boolean zLIZ;
        C1C7U.LIZ("PhotoSearchDynamicIndicator@c4b8.show$1$1$1");
        try {
            aRunnableS31S0201000_26.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PhotoSearchDynamicIndicator@c4b8.show$1$1$1");
    }

    public ARunnableS31S0201000_26(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
