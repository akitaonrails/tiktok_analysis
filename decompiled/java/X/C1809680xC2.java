package X;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.rank.impl.list.controller.RankListController;
import com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankListViewModel;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankRootViewModel;
import com.bytedance.android.livesdk.livesetting.rank.LivePopularityRankingBonusTimeSetting;
import com.bytedance.android.livesdk.livesetting.rank.LiveRankBottomShowArrowSetting;
import com.bytedance.android.livesdk.livesetting.rank.LiveRankingBottomBarContentFix;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS155S0400000_27;
import kotlin.jvm.internal.AwS271S0300000_27;
import kotlin.jvm.internal.AwS418S0200000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0xC2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1809680xC2 {
    public final C1810410xDD LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final InterfaceC1809830xCH LIZLLL;
    public RankListFragment LJ;
    public C1117370fBP LJFF;
    public LinearLayoutManager LJI;
    public RankListV2Response.ClassTitle LJII;
    public ImageModel LJIIIIZZ;
    public int LJIIIZ;
    public C1809710xC5 LJIIJ = new C1809710xC5();
    public boolean LJIIJJI;
    public C430810Gut LJIIL;

    public static boolean LIZIZ(RankListV2Response.RankInfo rankInfo) {
        if (rankInfo != null) {
            RankListV2Response.Gap gap = rankInfo.gap;
            if (gap != null && 3 == gap.displayType) {
                return true;
            }
            RankListV2Response.Gap gap2 = rankInfo.gap;
            if (gap2 != null && 4 == gap2.displayType) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void LIZ(RankListV2Response.RankInfo rankInfo) {
        boolean z;
        ImageModel imageModel;
        C1324720kZq c1324720kZq;
        RankListV2Response.BottomBarButton bottomBarButton;
        String uri;
        RankListFragment rankListFragment;
        C1324720kZq c1324720kZq2;
        RankListV2Response.BottomBarButton bottomBarButton2;
        if (rankInfo != null) {
            RankListV2Response.Gap gap = rankInfo.gap;
            if (gap != null && (bottomBarButton2 = gap.button) != null && bottomBarButton2.buttonDisplayType == 2) {
                z = true;
            } else {
                z = false;
            }
            C1324720kZq c1324720kZq3 = null;
            if (z) {
                if (!this.LJIIJJI) {
                    this.LJIIJJI = true;
                    if (C497740JfY.LJJ() && (rankListFragment = this.LJ) != null && (c1324720kZq2 = rankListFragment.LLLII) != null) {
                        C786410Ut5.Yb(c1324720kZq2, -1.0f);
                    }
                }
                RankListV2Response.Gap gap2 = rankInfo.gap;
                if (gap2 != null && (bottomBarButton = gap2.button) != null) {
                    imageModel = bottomBarButton.buttonImage;
                    if (imageModel != null) {
                        ImageModel imageModel2 = this.LJIIIIZZ;
                        if (imageModel2 != null) {
                            uri = imageModel2.getUri();
                        } else {
                            uri = null;
                        }
                        if (!TextUtils.equals(uri, imageModel.getUri())) {
                            C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(imageModel);
                            RankListFragment rankListFragment2 = this.LJ;
                            if (rankListFragment2 != null) {
                                c1324720kZq3 = rankListFragment2.LLLII;
                            }
                            c1324610kZfLJIIIZ.LJJI(c1324720kZq3);
                        }
                    }
                    this.LJIIIIZZ = imageModel;
                    return;
                }
                imageModel = null;
                RankListFragment rankListFragment3 = this.LJ;
                if (rankListFragment3 != null && (c1324720kZq = rankListFragment3.LLLII) != null) {
                    c1324720kZq.setImageResource(R.drawable.ec5);
                }
                this.LJIIIIZZ = imageModel;
                return;
            }
            this.LJIIIIZZ = null;
            RankListFragment rankListFragment4 = this.LJ;
            if (rankListFragment4 == null) {
                return;
            }
            rankListFragment4.UR(rankInfo);
        }
    }

    public static boolean LJFF(RankListV2Response.Gap gap, boolean z) {
        RankListV2Response.BottomBarButton bottomBarButton;
        if (!z || gap == null || (bottomBarButton = gap.button) == null || bottomBarButton.action != 5) {
            return false;
        }
        return true;
    }

    public C1809680xC2(C1810410xDD c1810410xDD, boolean z, boolean z2, C1809770xCB c1809770xCB) {
        this.LIZ = c1810410xDD;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = c1809770xCB;
    }

    public final void LIZJ(Context context, C16F5 c16f5, Spannable spannable, C1809690xC3 c1809690xC3) {
        ForegroundColorSpan foregroundColorSpan;
        Integer numLIZJ;
        Integer numLIZJ2;
        int iLJJJ = a0.LJJJ(spannable, e3.e, 0, false, 6);
        int iLJJJ2 = a0.LJJJ(spannable, e3.f, 0, false, 6);
        if (iLJJJ != -1 && iLJJJ2 != -1) {
            C786410Ut5.LLJJJJ(c16f5, 0);
            C1119920fFW.LJ(context, spannable, 0, spannable.length(), 33, 9, 400);
            ForegroundColorSpan foregroundColorSpan2 = null;
            if (context != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.ex5, context)) != null) {
                foregroundColorSpan = new ForegroundColorSpan(numLIZJ2.intValue());
            } else {
                foregroundColorSpan = null;
            }
            C786410Ut5.o2(spannable, foregroundColorSpan, 0, spannable.length(), 33);
            SpannableString spannableString = new SpannableString(spannable.subSequence(iLJJJ + 1, iLJJJ2).toString());
            C1119920fFW.LJ(context, spannableString, 0, spannableString.length(), 33, 9, 500);
            if (!this.LIZIZ) {
                if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.eu6, context)) != null) {
                    foregroundColorSpan2 = new ForegroundColorSpan(numLIZJ.intValue());
                }
                C786410Ut5.p2(spannableString, foregroundColorSpan2, 0, spannableString.length(), 33);
                C786410Ut5.p2(spannableString, c1809690xC3, 0, spannableString.length(), 33);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannable);
            spannableStringBuilder.replace(iLJJJ, iLJJJ2 + 1, (CharSequence) spannableString);
            c16f5.setMovementMethod(LinkMovementMethod.getInstance());
            c16f5.setText(spannableStringBuilder);
            c16f5.setHighlightColor(0);
            return;
        }
        C786410Ut5.LLJJJJ(c16f5, 0);
        c16f5.setText(spannable.toString());
    }

    public final boolean LJI(TextView textView, Text text, RankListV2Response.Gap gap, boolean z) {
        final boolean z2;
        View view;
        C16F5 c16f5;
        if (gap == null || !LiveRankBottomShowArrowSetting.INSTANCE.getValue() || !Intrinsics.LJFF(this.LIZ.LIZIZ, RankTypeV2.LJIL) || this.LIZIZ || !LJFF(gap, z)) {
            return false;
        }
        if (this.LJIIL == null) {
            RankListFragment rankListFragment = this.LJ;
            C16FS c16fs = null;
            if (rankListFragment != null) {
                view = rankListFragment.LLJLILLLLZIIL;
                c16f5 = rankListFragment.LLJLLL;
                c16fs = rankListFragment.LLJZ;
            } else {
                view = null;
                c16f5 = null;
            }
            this.LJIIL = new C430810Gut(view, c16f5, c16fs);
        }
        final C430810Gut c430810Gut = this.LJIIL;
        if (c430810Gut == null) {
            return false;
        }
        RankListFragment rankListFragment2 = this.LJ;
        if (rankListFragment2 != null) {
            z2 = rankListFragment2.LLJILLL;
        } else {
            z2 = false;
        }
        if (c430810Gut.LIZIZ == null || text == null) {
            return false;
        }
        final String string = C1133830fbx.LJIILIIL(text, "").toString();
        if (TextUtils.isEmpty(string) || !Intrinsics.LJFF(textView, c430810Gut.LIZIZ)) {
            return false;
        }
        if (TextUtils.isEmpty(c430810Gut.LIZLLL) || !TextUtils.equals(c430810Gut.LIZLLL, string) || z2) {
            C16FS c16fs2 = c430810Gut.LIZJ;
            if (c16fs2 != null && c16fs2.getMeasuredWidth() > 0) {
                c430810Gut.LIZ(string, z2);
            } else {
                C16FS c16fs3 = c430810Gut.LIZJ;
                if (c16fs3 != null) {
                    HandlerHook.viewPost(c16fs3, new Runnable() { // from class: X.0Guu
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("ClassRankBottomBarPresenter@98c2.updateContent$1");
                            try {
                                c430810Gut.LIZ(string, z2);
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("ClassRankBottomBarPresenter@98c2.updateContent$1");
                        }
                    });
                }
            }
            c430810Gut.LIZLLL = string;
        }
        return true;
    }

    public final void LJII(Context context, final DataChannel dataChannel, final RankListController rankListController, C16F5 c16f5, final RankListV2Response.Gap gap) {
        final RankListV2Response.BottomBarFAQ bottomBarFAQ;
        String str;
        if (LivePopularityRankingBonusTimeSetting.INSTANCE.getOverallOpt() && gap != null && (bottomBarFAQ = gap.bottomBarFaq) != null && (str = bottomBarFAQ.schema) != null && str.length() != 0) {
            CharSequence text = c16f5.getText();
            if (text == null) {
                text = "";
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
            C20743516Fd c20743516FdLIZLLL = C20736316Cj.LIZLLL(R.attr.dw4, context);
            if (c20743516FdLIZLLL != null) {
                c20743516FdLIZLLL.setTint(C20736316Cj.LIZIZ(R.attr.ezt, context));
                c20743516FdLIZLLL.setBounds(0, 0, (int) C497740JfY.LIZIZ(11.64f), (int) C497740JfY.LIZIZ(11.64f));
                SpannableString spannableString = new SpannableString(e3.d);
                C786410Ut5.p2(spannableString, new C416760GVu(c20743516FdLIZLLL), 0, 1, 18);
                C786410Ut5.p2(spannableString, new AbstractC990620bsy() { // from class: X.0xBr
                    @Override // X.AbstractC990620bsy
                    public final void LIZ() {
                        String str2;
                        RankListViewModel rankListViewModelLJIIIZ;
                        RankListV2Response.BottomBarButton bottomBarButton;
                        boolean z = C1105900esu.LIZIZ;
                        C1105900esu.LJ(dataChannel, bottomBarFAQ.schema, true, false, "", new LinkedHashMap());
                        C1810690xDf c1810690xDf = C1810690xDf.LIZ;
                        DataChannel dataChannel2 = dataChannel;
                        String buttonType = EnumC1808150x9Z.BOTTOM_BAR_FAQ.getButtonType();
                        String str3 = this.LIZ.LIZIZ.rankName;
                        RankListV2Response.Gap gap2 = gap;
                        if (gap2 == null || (bottomBarButton = gap2.button) == null || (str2 = bottomBarButton.buttonType) == null) {
                            str2 = "";
                        }
                        RankListController rankListController2 = rankListController;
                        RankListV2Response.RankView rankView = (rankListController2 == null || (rankListViewModelLJIIIZ = rankListController2.LJIIIZ()) == null) ? null : rankListViewModelLJIIIZ.LLILLJJLI;
                        c1810690xDf.getClass();
                        C1810690xDf.LJIIJ(dataChannel2, buttonType, str3, "click", str2, rankView);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                }, 0, 1, 18);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) spannableString);
                c16f5.setMovementMethod(LinkMovementMethod.getInstance());
                c16f5.setHighlightColor(0);
                c16f5.setText(spannableStringBuilder);
            }
        }
    }

    public final void LIZLLL(final Context context, final RankListV2Response.Gap gap, final Text text, final C16F5 c16f5, Function0<Unit> function0, final RankListController rankListController, final DataChannel dataChannel, boolean z, boolean z2) {
        boolean z3;
        Function0<Unit> awS561S0100000_17;
        final C16FS c16fs;
        RankRootViewModel rankRootViewModelLIZ;
        RankListV2Response.BottomBarAnchorSkipStruct bottomBarAnchorSkipStruct;
        if (dataChannel != null && C500260Jjc.LJIIZILJ(dataChannel)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!LJI(c16f5, text, gap, z3) && gap != null) {
            final C1809690xC3 c1809690xC3 = new C1809690xC3();
            RankListV2Response.GapExtra gapExtra = gap.gapExtra;
            if (gapExtra != null && (bottomBarAnchorSkipStruct = gapExtra.skipInfo) != null && bottomBarAnchorSkipStruct.isSkip) {
                c1809690xC3.LL = new AwS271S0300000_27(rankListController, gap, context, 7);
            }
            int i = gap.banInfo;
            final View view = null;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        c1809690xC3.LL = new AwS271S0300000_27(rankListController, this, dataChannel, 9);
                    }
                } else if (rankListController != null && (rankRootViewModelLIZ = rankListController.LIZ()) != null && rankRootViewModelLIZ.LLILLL && z) {
                    c1809690xC3.LL = new AwS271S0300000_27(rankListController, this, dataChannel, 8);
                } else {
                    c1809690xC3.LL = null;
                }
            } else if (!this.LIZIZ) {
                c1809690xC3.LLILLJJLI = new AwS155S0400000_27((Function0) function0, (Function0<Unit>) dataChannel, (DataChannel) this, (C1809680xC2) rankListController, (RankListController) 3);
                if (this.LIZ.LIZ == EnumC1811400xEo.GIFT_RANK) {
                    awS561S0100000_17 = new AwS418S0200000_17(dataChannel, this, 27);
                } else {
                    awS561S0100000_17 = new AwS561S0100000_17(dataChannel, 264);
                }
                c1809690xC3.LL = awS561S0100000_17;
            }
            RankListFragment rankListFragment = this.LJ;
            if (rankListFragment != null) {
                c16fs = rankListFragment.LLJZ;
                view = rankListFragment.LLJLILLLLZIIL;
            } else {
                c16fs = null;
            }
            if (c16f5 != null && c16fs != null && view != null) {
                if (z2) {
                    HandlerHook.viewPost(c16fs, new Runnable() { // from class: X.0xFT
                        public final void LIZ() {
                            SpannableStringBuilder spannableStringBuilder;
                            if (c16fs.getParent() == null) {
                                return;
                            }
                            C1809680xC2 c1809680xC2 = this;
                            View view2 = view;
                            C16F5 c16f52 = c16f5;
                            C16FS c16fs2 = c16fs;
                            Text text2 = text;
                            c1809680xC2.getClass();
                            Spannable spannableLJIILIIL = C1133830fbx.LJIILIIL(text2, "");
                            if (LiveRankingBottomBarContentFix.INSTANCE.getValue()) {
                                int iLJIIIZ = C497740JfY.LJIIIZ(R.dimen.axd);
                                int measuredWidth = (((((view2.getMeasuredWidth() - c16fs2.getMeasuredWidth()) - iLJIIIZ) - C497740JfY.LJIIIZ(R.dimen.axf)) - C497740JfY.LJIIIZ(R.dimen.axe)) - c16f52.getPaddingLeft()) - c16f52.getPaddingRight();
                                if (measuredWidth > 0) {
                                    TextPaint paint = c16f52.getPaint();
                                    int iLJIIIZ2 = C497740JfY.LJIIIZ(R.dimen.axc) + ((int) paint.measureText(" ")) + ((int) paint.measureText("..."));
                                    int maxLines = c16f52.getMaxLines();
                                    StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(spannableLJIILIIL, 0, spannableLJIILIIL.length(), paint, measuredWidth).setMaxLines(Integer.MAX_VALUE).setIncludePad(false).build();
                                    if (staticLayoutBuild.getLineCount() > maxLines) {
                                        int i2 = maxLines - 1;
                                        if (measuredWidth - (staticLayoutBuild.getLineRight(i2) - staticLayoutBuild.getLineLeft(i2)) >= iLJIIIZ2) {
                                            int lineEnd = staticLayoutBuild.getLineEnd(i2);
                                            int length = spannableLJIILIIL.length();
                                            if (lineEnd > length) {
                                                lineEnd = length;
                                            }
                                            if (lineEnd > 0 && lineEnd <= spannableLJIILIIL.length()) {
                                                spannableStringBuilder = new SpannableStringBuilder(spannableLJIILIIL, 0, lineEnd);
                                                spannableStringBuilder.append((CharSequence) " ");
                                                spannableLJIILIIL = spannableStringBuilder;
                                            }
                                        } else {
                                            int lineEnd2 = staticLayoutBuild.getLineEnd(i2) - 6;
                                            int length2 = spannableLJIILIIL.length();
                                            if (lineEnd2 > length2) {
                                                lineEnd2 = length2;
                                            }
                                            if (lineEnd2 > 0 && lineEnd2 <= spannableLJIILIIL.length()) {
                                                spannableStringBuilder = new SpannableStringBuilder(spannableLJIILIIL, 0, lineEnd2);
                                                spannableStringBuilder.append((CharSequence) "...").append((CharSequence) " ");
                                                spannableLJIILIIL = spannableStringBuilder;
                                            }
                                        }
                                    }
                                }
                            }
                            this.LIZJ(context, c16f5, spannableLJIILIIL, c1809690xC3);
                            this.LJII(context, dataChannel, rankListController, c16f5, gap);
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("RankListPresenter@6fba.updateBottomBarTextView$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("RankListPresenter@6fba.updateBottomBarTextView$1");
                        }
                    });
                } else {
                    LIZJ(context, c16f5, C1133830fbx.LJIILIIL(text, ""), c1809690xC3);
                    LJII(context, dataChannel, rankListController, c16f5, gap);
                }
            }
        }
    }
}
