package X;

import Y.AUListenerS275S0100000_27;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.net.Uri;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.livesetting.rank.LivePopularityRankingBonusTimeConfig;
import com.bytedance.android.livesdk.livesetting.rank.TeamRankStickerSetting;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xDr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1810810xDr extends FrameLayout {
    public final ViewGroup LL;
    public final C1324720kZq LLILLJJLI;
    public final TextView LLILLL;
    public final View LLILZ;
    public final View LLILZIL;
    public final LiveIconView LLILZLL;
    public final View LLIZ;
    public final ViewGroup LLIZLLLIL;
    public final C1324720kZq LLJ;
    public final TextView LLJI;
    public final View LLJIJIL;
    public final LiveIconView LLJILJIL;
    public final View LLJILJILJ;
    public final float LLJILLL;
    public int LLJJ;
    public RankTypeV2 LLJJI;
    public DataChannel LLJJIII;
    public boolean LLJJIJI;
    public final List<RankListV2Response.Bulletin> LLJJIJIIJIL;
    public int LLJJIJIL;
    public boolean LLJJJ;
    public AnonymousClass0956 LLJJJIL;
    public ValueAnimator LLJJJJ;
    public ValueAnimator LLJJJJJIL;
    public ValueAnimator LLJJJJLIIL;

    public final int LIZIZ() {
        if (C497740JfY.LJJ()) {
            return 1048576 - this.LLILLL.getWidth();
        }
        return 0;
    }

    private final void setupClickableContainer(final RankListV2Response.Bulletin bulletin) {
        DataChannel dataChannel;
        C786410Ut5.LLJJIJIL(this.LLILZLL, 8);
        C786410Ut5.LJLLLLLL(8, this.LLIZ);
        C786410Ut5.K7(this.LL, null);
        String str = bulletin.schema;
        if (str != null && str.length() > 0) {
            C786410Ut5.LLJJIJIL(this.LLILZLL, 0);
            C786410Ut5.LJLLLLLL(0, this.LLIZ);
            Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
            if (this.LLJJ > 0 && (dataChannel = this.LLJJIII) != null && Intrinsics.LJFF(dataChannel.gg0(C0TZM.class), Boolean.TRUE)) {
                builderBuildUpon.appendQueryParameter("height", String.valueOf(this.LLJJ));
            }
            final String string = builderBuildUpon.build().toString();
            C786410Ut5.K7(this.LL, new AbstractViewOnClickListenerC1105820esm() { // from class: X.0xDx
                @Override // X.AbstractViewOnClickListenerC1105820esm
                public final void LIZ() {
                    boolean z = C1105900esu.LIZIZ;
                    C1105900esu.LJ(this.LLILZIL.LLJJIII, string, true, false, "", new LinkedHashMap());
                    C1810690xDf c1810690xDf = C1810690xDf.LIZ;
                    C1810810xDr c1810810xDr = this.LLILZIL;
                    DataChannel dataChannel2 = c1810810xDr.LLJJIII;
                    RankTypeV2 rankTypeV2 = c1810810xDr.LLJJI;
                    String str2 = bulletin.noticeType;
                    c1810690xDf.getClass();
                    C1810690xDf.LJJIJLIJ(rankTypeV2, dataChannel2, str2);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1200L);
                }
            });
        }
    }

    public final String LIZ(RankListV2Response.Bulletin bulletin) {
        int i;
        int i2;
        if (Intrinsics.LJFF(bulletin.noticeType, "team_rank_first_introduce")) {
            if (C500260Jjc.LJIIZILJ(this.LLJJIII)) {
                if (TeamRankStickerSetting.INSTANCE.getUseNewStyle()) {
                    i2 = 2131755934;
                } else {
                    i2 = 2131755929;
                }
                LivePopularityRankingBonusTimeConfig livePopularityRankingBonusTimeConfig = LivePopularityRankingBonusTimeConfig.INSTANCE;
                return C497740JfY.LJIIL(i2, (int) livePopularityRankingBonusTimeConfig.getValue().giftPoint, String.valueOf(livePopularityRankingBonusTimeConfig.getValue().giftPoint));
            }
            if (TeamRankStickerSetting.INSTANCE.getUseNewStyle()) {
                i = 2131755935;
            } else {
                i = 2131755930;
            }
            LivePopularityRankingBonusTimeConfig livePopularityRankingBonusTimeConfig2 = LivePopularityRankingBonusTimeConfig.INSTANCE;
            return C497740JfY.LJIIL(i, (int) livePopularityRankingBonusTimeConfig2.getValue().giftPoint, String.valueOf(livePopularityRankingBonusTimeConfig2.getValue().giftPoint));
        }
        return C1133830fbx.LJIILIIL(bulletin.content, "").toString();
    }

    public final void LIZJ(final Runnable runnable) {
        int lineWidth;
        if (!this.LLJJJ) {
            return;
        }
        final int size = (this.LLJJIJIL + 1) % ((ArrayList) this.LLJJIJIIJIL).size();
        C786410Ut5.LJLZ(0, this.LLIZLLLIL);
        C786410Ut5.bd(this.LLJILLL, this.LLIZLLLIL);
        C786410Ut5.R4(0.0f, this.LLIZLLLIL);
        this.LLJI.setText(LIZ((RankListV2Response.Bulletin) ListProtector.get(this.LLJJIJIIJIL, size)));
        Layout layout = this.LLJI.getLayout();
        if (layout != null) {
            lineWidth = (int) layout.getLineWidth(0);
        } else {
            lineWidth = 0;
        }
        if (lineWidth > this.LLILLL.getWidth()) {
            C786410Ut5.LJLLLLLL(0, this.LLJIJIL);
        } else {
            C786410Ut5.LJLLLLLL(8, this.LLJIJIL);
        }
        C1324610kZf c1324610kZfLIZJ = C1819620xS4.LIZ().LIZJ(((RankListV2Response.Bulletin) ListProtector.get(this.LLJJIJIIJIL, size)).icon.getUrls());
        c1324610kZfLIZJ.LJIILIIL = Boolean.TRUE;
        c1324610kZfLIZJ.LJIJJ = ImageView.ScaleType.CENTER_CROP;
        int width = this.LLJ.getWidth();
        int height = this.LLJ.getHeight();
        c1324610kZfLIZJ.LJ = width;
        c1324610kZfLIZJ.LJFF = height;
        c1324610kZfLIZJ.LJJI(this.LLJ);
        String str = ((RankListV2Response.Bulletin) ListProtector.get(this.LLJJIJIIJIL, size)).schema;
        if (str != null && str.length() > 0) {
            C786410Ut5.LLJJIJIL(this.LLJILJIL, 0);
            C786410Ut5.LJLLLLLL(0, this.LLJILJILJ);
        } else {
            C786410Ut5.LLJJIJIL(this.LLJILJIL, 8);
            C786410Ut5.LJLLLLLL(8, this.LLJILJILJ);
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.LLJJJJJIL = valueAnimatorOfFloat;
        if (valueAnimatorOfFloat != null) {
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        }
        ValueAnimator valueAnimator = this.LLJJJJJIL;
        if (valueAnimator != null) {
            valueAnimator.setDuration(200L);
        }
        ValueAnimator valueAnimator2 = this.LLJJJJJIL;
        if (valueAnimator2 != null) {
            valueAnimator2.addUpdateListener(new AUListenerS275S0100000_27(this, 0));
        }
        ValueAnimator valueAnimator3 = this.LLJJJJJIL;
        if (valueAnimator3 != null) {
            valueAnimator3.start();
        }
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.LLJJJJLIIL = valueAnimatorOfFloat2;
        if (valueAnimatorOfFloat2 != null) {
            valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        }
        ValueAnimator valueAnimator4 = this.LLJJJJLIIL;
        if (valueAnimator4 != null) {
            valueAnimator4.setDuration(200L);
        }
        ValueAnimator valueAnimator5 = this.LLJJJJLIIL;
        if (valueAnimator5 != null) {
            valueAnimator5.setStartDelay(100L);
        }
        ValueAnimator valueAnimator6 = this.LLJJJJLIIL;
        if (valueAnimator6 != null) {
            valueAnimator6.addUpdateListener(new AUListenerS275S0100000_27(this, 1));
        }
        ValueAnimator valueAnimator7 = this.LLJJJJLIIL;
        if (valueAnimator7 != null) {
            valueAnimator7.addListener(new C1704130uRn() { // from class: X.0xDu
                @Override // X.C1704130uRn, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    C786410Ut5.R4(1.0f, this.LL.LL);
                    float fMeasureText = 0.0f;
                    C786410Ut5.bd(0.0f, this.LL.LL);
                    C786410Ut5.LJLZ(8, this.LL.LLIZLLLIL);
                    C1324610kZf c1324610kZfLIZJ2 = C1819620xS4.LIZ().LIZJ(((RankListV2Response.Bulletin) ListProtector.get(this.LL.LLJJIJIIJIL, size)).icon.getUrls());
                    c1324610kZfLIZJ2.LJIJJ = ImageView.ScaleType.CENTER_CROP;
                    int width2 = this.LL.LLILLJJLI.getWidth();
                    int height2 = this.LL.LLILLJJLI.getHeight();
                    c1324610kZfLIZJ2.LJ = width2;
                    c1324610kZfLIZJ2.LJFF = height2;
                    c1324610kZfLIZJ2.LJJI(this.LL.LLILLJJLI);
                    C1810810xDr c1810810xDr = this.LL;
                    String strLIZ = c1810810xDr.LIZ((RankListV2Response.Bulletin) ListProtector.get(c1810810xDr.LLJJIJIIJIL, size));
                    this.LL.LLILLL.setText(strLIZ);
                    C1810810xDr c1810810xDr2 = this.LL;
                    c1810810xDr2.LLILLL.setScrollX(c1810810xDr2.LIZIZ());
                    C1810810xDr c1810810xDr3 = this.LL;
                    c1810810xDr3.LLJJIJIL = size;
                    C786410Ut5.LJLLLLLL(8, c1810810xDr3.LLILZ);
                    TextPaint paint = this.LL.LLILLL.getPaint();
                    if (paint != null) {
                        fMeasureText = paint.measureText(strLIZ);
                    }
                    if (fMeasureText > this.LL.LLILLL.getWidth()) {
                        C786410Ut5.LJLLLLLL(0, this.LL.LLILZIL);
                    } else {
                        C786410Ut5.LJLLLLLL(8, this.LL.LLILZIL);
                    }
                    runnable.run();
                }
            });
        }
        ValueAnimator valueAnimator8 = this.LLJJJJLIIL;
        if (valueAnimator8 != null) {
            valueAnimator8.start();
        }
    }

    public final void LIZLLL(RankListV2Response.Bulletin bulletin) {
        if (!this.LLJJJ) {
            return;
        }
        setupClickableContainer(bulletin);
        String strLIZ = LIZ(bulletin);
        this.LLILLL.setText(strLIZ);
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLJJJIL = C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1810820xDs(this, strLIZ, null), 3);
    }

    public C1810810xDr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJILLL = (int) C497740JfY.LIZIZ(32.0f);
        this.LLJJI = RankTypeV2.LJJIJIIJI;
        FrameLayout.inflate(context, R.layout.h3u, this);
        this.LL = (ViewGroup) findViewById(R.id.d0_);
        this.LLILLJJLI = (C1324720kZq) findViewById(R.id.d1_);
        this.LLILLL = (TextView) findViewById(R.id.d5_);
        View viewFindViewById = findViewById(R.id.d58);
        this.LLILZ = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.d0v);
        this.LLILZIL = viewFindViewById2;
        LiveIconView liveIconView = (LiveIconView) findViewById(R.id.jz4);
        this.LLILZLL = liveIconView;
        this.LLIZ = findViewById(R.id.view_end_placeholder);
        this.LLIZLLLIL = (ViewGroup) findViewById(R.id.cyc);
        this.LLJ = (C1324720kZq) findViewById(R.id.cye);
        this.LLJI = (TextView) findViewById(R.id.cyf);
        View viewFindViewById3 = findViewById(R.id.cyd);
        this.LLJIJIL = viewFindViewById3;
        LiveIconView liveIconView2 = (LiveIconView) findViewById(R.id.jz3);
        this.LLJILJIL = liveIconView2;
        this.LLJILJILJ = findViewById(R.id.view_animator_end_placeholder);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bo, context);
        if (numLIZJ != null) {
            setBackgroundColor(numLIZJ.intValue());
        }
        if (C497740JfY.LJJ()) {
            viewFindViewById.setBackgroundResource(R.drawable.dms);
            viewFindViewById2.setBackgroundResource(R.drawable.dmr);
            viewFindViewById3.setBackgroundResource(R.drawable.dmr);
            C786410Ut5.Yb(this.LLILLJJLI, -1.0f);
            C786410Ut5.Yb(this.LLJ, -1.0f);
            C786410Ut5.Zb(this.LLILZLL, -1.0f);
            C786410Ut5.Zb(this.LLJILJIL, -1.0f);
            C20743516Fd c20743516FdLIZLLL = C20736316Cj.LIZLLL(R.attr.d33, context);
            if (liveIconView != null) {
                liveIconView.setIcon(c20743516FdLIZLLL);
            }
            if (liveIconView2 != null) {
                liveIconView2.setIcon(c20743516FdLIZLLL);
            }
        }
        this.LLJJIJIIJIL = new ArrayList();
    }
}
