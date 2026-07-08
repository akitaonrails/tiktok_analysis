package X;

import android.content.Context;
import android.graphics.Color;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.livesdk.livesetting.wallet.LiveGoogleABSCashierURLSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.comment.reviewtab.vm.ReviewViewModel;
import com.ss.android.ugc.aweme.commercialize.model.commenttab.ReviewArea;
import com.ss.android.ugc.aweme.commercialize.model.commenttab.SortItem;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS148S0201000_27;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: renamed from: X.0ycQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1864480ycQ extends ClickableSpan {
    public final int $t;
    public Object l0;

    public static final void updateDrawState$1(C1864480ycQ c1864480ycQ, TextPaint textPaint) {
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
            case 4:
                onClick$4(this, view);
                break;
            case 5:
                onClick$5(this, view);
                break;
            default:
                super.onClick(view);
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.$t) {
            case 1:
                updateDrawState$0(this, textPaint);
                break;
            case 2:
                updateDrawState$1(this, textPaint);
                break;
            case 3:
                updateDrawState$2(this, textPaint);
                break;
            case 4:
                updateDrawState$3(this, textPaint);
                break;
            case 5:
                textPaint.setUnderlineText(false);
                break;
            default:
                super.updateDrawState(textPaint);
                break;
        }
    }

    public C1864480ycQ(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.13BV] */
    public static final void onClick$0(C1864480ycQ c1864480ycQ, View view) {
        Context context;
        View view2;
        ReviewArea reviewArea;
        Object arrayList;
        List<SortItem> sortList;
        int i;
        C1022620cia.LIZ("ReviewVM", "onSpanClicked");
        ReviewViewModel reviewViewModel = (ReviewViewModel) c1864480ycQ.l0;
        reviewViewModel.getClass();
        C1022620cia.LIZ("ReviewVM", "openSortPanel");
        C1843830y57 c1843830y57 = reviewViewModel.LL;
        if (c1843830y57 != null && (context = c1843830y57.LIZ) != null && (view2 = c1843830y57.LIZIZ.LLIZLLLIL) != null) {
            C0HWQ c0hwq = new C0HWQ(context);
            AwemeRawAd awemeRawAdVQ2 = reviewViewModel.vQ2();
            if (awemeRawAdVQ2 != null) {
                reviewArea = awemeRawAdVQ2.getReviewArea();
            } else {
                reviewArea = null;
            }
            if (reviewArea != null && (sortList = reviewArea.getSortList()) != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(sortList, 10));
                int i2 = 0;
                for (SortItem sortItem : sortList) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        SortItem sortItem2 = sortItem;
                        String name = sortItem2.getName();
                        AwS148S0201000_27 awS148S0201000_27 = new AwS148S0201000_27(i2, reviewViewModel, sortItem2, 1);
                        if (i2 == reviewViewModel.LLILLJJLI.getSecond().intValue()) {
                            i = R.raw.icon_tick_fill_small;
                        } else {
                            i = 0;
                        }
                        arrayList.add(new C443090HZb(name, awS148S0201000_27, 0, null, i, null, 0, false, false, null, 1004));
                        i2 = i3;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            c0hwq.LJIIL(Collections.singletonList(arrayList));
            c0hwq.LLIZLLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(140));
            C1391600mJi c1391600mJi = c0hwq.LLILLJJLI;
            c1391600mJi.LIZIZ = view2;
            c1391600mJi.LJ = 150;
            c0hwq.LIZJ(new AwS606S0100000_27(reviewViewModel, 353));
            C1391600mJi c1391600mJi2 = c0hwq.LLILLJJLI;
            c1391600mJi2.LJIIL = false;
            c1391600mJi2.LIZLLL = EnumC1235690iGF.BOTTOM;
            C0P0T c0p0tLIZIZ = c0hwq.LIZIZ();
            reviewViewModel.LLILLJJLI = Pair.copy$default(reviewViewModel.LLILLJJLI, c0p0tLIZIZ, null, 2, null);
            c0p0tLIZIZ.show();
        }
        ((ReviewViewModel) c1864480ycQ.l0).BQ2(true);
    }

    public static final void onClick$1(C1864480ycQ c1864480ycQ, View view) {
        ((C1833460xoO) c1864480ycQ.l0).LIZJ();
    }

    public static final void onClick$2(C1864480ycQ c1864480ycQ, View view) {
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getRecordCommentsAndGiftsGuideSheet().LIZIZ(((C1833430xoL) c1864480ycQ.l0).LIZJ, false, "setting_page", null);
    }

    public static final void onClick$3(C1864480ycQ c1864480ycQ, View view) {
        Function0 function0 = (Function0) c1864480ycQ.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onClick$4(C1864480ycQ c1864480ycQ, View view) {
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(((DialogC1803170x1X) c1864480ycQ.l0).getContext(), LiveGoogleABSCashierURLSetting.INSTANCE.getValue().googleABSHelpCenterUrl);
    }

    public static final void onClick$5(C1864480ycQ c1864480ycQ, View view) {
        ((C1807000x7i) c1864480ycQ.l0).LL.LJI();
    }

    public static final void updateDrawState$0(C1864480ycQ c1864480ycQ, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        textPaint.setColor(C1383370m6R.LJFF(R.attr.a1j));
    }

    public static final void updateDrawState$2(C1864480ycQ c1864480ycQ, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(C1857690yRT.LJIIJ(R.attr.a1s));
        textPaint.setUnderlineText(false);
    }

    public static final void updateDrawState$3(C1864480ycQ c1864480ycQ, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        try {
            textPaint.setColor(Color.parseColor("#5F6368"));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
