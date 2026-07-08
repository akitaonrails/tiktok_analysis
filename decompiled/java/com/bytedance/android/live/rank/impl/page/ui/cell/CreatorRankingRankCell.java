package com.bytedance.android.live.rank.impl.page.ui.cell;

import X.AbstractViewOnClickListenerC1105820esm;
import X.C01GW;
import X.C0JBN;
import X.C0KVU;
import X.C1091790eW9;
import X.C1143680frq;
import X.C1295960jpS;
import X.C1324610kZf;
import X.C13BV;
import X.C13LP;
import X.C13LZ;
import X.C1777430wM1;
import X.C1777580wMG;
import X.C1785370wYp;
import X.C1810690xDf;
import X.C1811290xEd;
import X.C1811310xEf;
import X.C1819620xS4;
import X.C19719612Di;
import X.C20736316Cj;
import X.C452501pT;
import X.C496970JeJ;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1154100g8e;
import X.InterfaceC1296230jpt;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.AAListenerS275S0200000_27;
import Y.ACListenerS161S0100000_27;
import Y.ALAdapterS21S0200000_27;
import android.animation.Animator;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.rank.impl.page.ui.cell.CreatorRankingRankCell;
import com.bytedance.android.livesdk.livesetting.rank.LiveFriendRankingZeroScoreHideSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveAvatarEntranceUnifySetting;
import com.bytedance.android.livesdk.model.BorderInfo;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class CreatorRankingRankCell extends PowerCell<C1777580wMG> {
    public Animator LLJJIII;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public final C01GW LL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 123));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 121));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 124));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 110));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 103));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 106));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 112));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 111));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 119));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 120));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 113));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 117));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 107));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 122));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 114));
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 115));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 118));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 116));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 109));
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 108));

    public final void N5() {
        Animator animator = this.LLJJIII;
        if (animator != null) {
            animator.cancel();
        }
        this.LLJJIII = null;
        C786410Ut5.B5(W5(), 1.0f);
        C786410Ut5.ic(W5(), 1.0f);
        C786410Ut5.Dc(W5(), 1.0f);
    }

    public final View R5() {
        return (View) this.LLJILJILJ.getValue();
    }

    public final View S5() {
        return (View) this.LLIZLLLIL.getValue();
    }

    public final View T5() {
        return (View) this.LLIZ.getValue();
    }

    public final C1295960jpS U5() {
        return (C1295960jpS) this.LLJJ.getValue();
    }

    public final int V5() {
        return ((Number) this.LLJJIJI.getValue()).intValue();
    }

    public final TuxTextView W5() {
        return (TuxTextView) this.LLJILLL.getValue();
    }

    public final void X5() {
        W5().setTextSize(1, ((Number) this.LLJJIJIL.getValue()).floatValue() / C497740JfY.LIZIZ.density);
        W5().setLetterSpacing(((Number) this.LLJJJ.getValue()).floatValue());
    }

    public final void a6() {
        C1295960jpS c1295960jpSU5 = U5();
        c1295960jpSU5.removeAllAnimatorListeners();
        if (c1295960jpSU5.isAnimating()) {
            c1295960jpSU5.cancelAnimation();
        }
        b6(false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        a6();
        N5();
        super.onViewDetachedFromWindow();
    }

    public final void I5(C1777580wMG c1777580wMG) {
        int iLIZIZ;
        float f;
        float f2;
        boolean z;
        boolean z2;
        int i;
        int iLJIIIZ;
        List urls;
        BorderInfo borderInfoLIZ;
        ImageModel avatarThumb;
        int iLIZIZ2;
        C1785370wYp c1785370wYp = c1777580wMG.LLILLJJLI.LIZIZ;
        c1777580wMG.LLIZLLLIL.invoke(Long.valueOf(c1785370wYp.LIZIZ));
        RankTypeV2 rankTypeV2 = c1777580wMG.LLILLL;
        long j = c1785370wYp.LIZIZ;
        TextView textView = (TextView) this.LL.getValue();
        String strValueOf = c1785370wYp.LIZJ;
        if (strValueOf == null) {
            strValueOf = String.valueOf(j);
        }
        textView.setText(strValueOf);
        if (j == 1) {
            iLIZIZ = C20736316Cj.LIZIZ(R.attr.eq1, this.itemView.getContext());
        } else if (j == 2) {
            iLIZIZ = C20736316Cj.LIZIZ(R.attr.eq9, this.itemView.getContext());
        } else if (j == 3) {
            iLIZIZ = C20736316Cj.LIZIZ(R.attr.eqg, this.itemView.getContext());
        } else {
            iLIZIZ = C20736316Cj.LIZIZ(R.attr.ezq, this.itemView.getContext());
        }
        ((TextView) this.LL.getValue()).setTextColor(iLIZIZ);
        if (1 <= j && j < 4) {
            f = 68.0f;
        } else {
            f = 60.0f;
        }
        int iLIZIZ3 = (int) C497740JfY.LIZIZ(f);
        ViewGroup.LayoutParams layoutParams = ((View) this.LLJ.getValue()).getLayoutParams();
        if (layoutParams.height != iLIZIZ3) {
            C1091790eW9 c1091790eW9 = (C1091790eW9) this.LLJ.getValue();
            layoutParams.height = iLIZIZ3;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1091790eW9);
            c1091790eW9.setLayoutParams(layoutParams);
        }
        if (1 <= j && j < 4) {
            f2 = 52.0f;
        } else {
            f2 = 44.0f;
        }
        int iLIZIZ4 = (int) C497740JfY.LIZIZ(f2);
        int iLIZIZ5 = ((int) C497740JfY.LIZIZ(5.0f)) + iLIZIZ4;
        ImageView imageView = (ImageView) this.LLILZ.getValue();
        ViewGroup.LayoutParams layoutParams2 = ((View) this.LLILZ.getValue()).getLayoutParams();
        layoutParams2.width = iLIZIZ4;
        layoutParams2.height = iLIZIZ4;
        C786410Ut5.c6(imageView, layoutParams2);
        View viewS5 = S5();
        ViewGroup.LayoutParams layoutParams3 = S5().getLayoutParams();
        layoutParams3.width = iLIZIZ5;
        layoutParams3.height = iLIZIZ5;
        C786410Ut5.W5(viewS5, layoutParams3);
        if (1 <= j && j < 4) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (j == 1) {
                iLIZIZ2 = C20736316Cj.LIZIZ(R.attr.eps, this.itemView.getContext());
            } else if (j == 2) {
                iLIZIZ2 = C20736316Cj.LIZIZ(R.attr.ept, this.itemView.getContext());
            } else {
                iLIZIZ2 = C20736316Cj.LIZIZ(R.attr.epu, this.itemView.getContext());
            }
            View view = (View) this.LLILZIL.getValue();
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(iLIZIZ2);
            view.setBackground(gradientDrawable);
            C786410Ut5.LJLLLLLL(0, (View) this.LLILZIL.getValue());
        } else {
            ((View) this.LLILZIL.getValue()).setBackground(null);
            C786410Ut5.LJLLLLLL(8, (View) this.LLILZIL.getValue());
        }
        ((TextView) this.LLILLJJLI.getValue()).setText(C0KVU.LIZ(c1785370wYp.LIZ));
        String str = c1785370wYp.LJ;
        if (str == null) {
            str = "";
        }
        ((TextView) this.LLILLL.getValue()).setText(str);
        if (LiveFriendRankingZeroScoreHideSetting.INSTANCE.getValue() && Intrinsics.LJFF(rankTypeV2, RankTypeV2.LJJIIZ) && Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT)) {
            z2 = true;
        } else {
            z2 = false;
        }
        TuxTextView tuxTextView = (TuxTextView) this.LLILLL.getValue();
        int i2 = 4;
        if (z2) {
            i = 4;
        } else {
            i = 0;
        }
        C786410Ut5.LLLLZLL(tuxTextView, i);
        View view2 = (View) this.LLJILJIL.getValue();
        if (!z2) {
            i2 = 0;
        }
        C786410Ut5.LJLLLLLL(i2, view2);
        ((C1811290xEd) this.LLJI.getValue()).setScene(EnumC1154100g8e.RANKING_PAGE_LIST);
        ((C1811290xEd) this.LLJI.getValue()).LIZ(c1785370wYp.LJI, rankTypeV2);
        Integer numValueOf = Integer.valueOf(S5().getLayoutParams().width);
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            iLJIIIZ = numValueOf.intValue();
        } else {
            iLJIIIZ = C497740JfY.LJIIIZ(R.dimen.awy);
        }
        c6(iLJIIIZ, 0);
        C0JBN c0jbnLIZ = C1819620xS4.LIZ();
        User user = c1785370wYp.LIZ;
        if (user != null && (avatarThumb = user.getAvatarThumb()) != null) {
            urls = avatarThumb.getUrls();
        } else {
            urls = null;
        }
        C1324610kZf c1324610kZfLIZJ = c0jbnLIZ.LIZJ(urls);
        c1324610kZfLIZJ.LJIILIIL = Boolean.TRUE;
        c1324610kZfLIZJ.LJIJJ = ImageView.ScaleType.CENTER_CROP;
        c1324610kZfLIZJ.LJIIIZ = R.drawable.eze;
        c1324610kZfLIZJ.LJJI((View) this.LLILZ.getValue());
        User user2 = c1785370wYp.LIZ;
        if (!c1777580wMG.LLILZ || user2 == null || (borderInfoLIZ = C496970JeJ.LIZ(user2)) == null) {
            C786410Ut5.LJLLLLLL(8, S5());
        } else {
            c6(C497740JfY.LJIIIZ(R.dimen.awy), (int) C497740JfY.LIZIZ(2.5f));
            C1143680frq.LJJI(S5(), borderInfoLIZ.icon, false);
            C786410Ut5.LJLLLLLL(0, S5());
            C1810690xDf c1810690xDf = C1810690xDf.LIZ;
            String str2 = c1777580wMG.LLILLL.rankName;
            DataChannel dataChannel = c1777580wMG.LLILZIL;
            boolean z3 = c1777580wMG.LLILZ;
            c1810690xDf.getClass();
            C1810690xDf.LJJJJ(str2, user2, borderInfoLIZ, dataChannel, z3);
        }
        long j2 = c1785370wYp.LJFF;
        T5().setPadding(0, 0, 0, 0);
        T5().getLayoutParams().width = (int) C497740JfY.LIZIZ(16.0f);
        T5().getLayoutParams().height = (int) C497740JfY.LIZIZ(16.0f);
        C500260Jjc.LJJLJLI(0, T5());
        C500260Jjc.LJJLJ(0, T5());
        if (j2 <= 0) {
            C786410Ut5.LJLLLLLL(8, T5());
        } else {
            if (LiveAvatarEntranceUnifySetting.getValue()) {
                int iLIZIZ6 = (int) C497740JfY.LIZIZ(2.0f);
                T5().setPadding(iLIZIZ6, iLIZIZ6, iLIZIZ6, iLIZIZ6);
                T5().getLayoutParams().width = (int) C497740JfY.LIZIZ(18.0f);
                T5().getLayoutParams().height = (int) C497740JfY.LIZIZ(18.0f);
                C500260Jjc.LJJLJLI((int) C497740JfY.LIZIZ(2.0f), T5());
                C500260Jjc.LJJLJ((int) C497740JfY.LIZIZ(2.0f), T5());
            }
            C1143680frq.LJI(T5(), C1811310xEf.LIZ(), null, true);
            C786410Ut5.LJLLLLLL(0, T5());
        }
        L5(c1777580wMG.LLILLJJLI.LIZJ, new AwS571S0100000_27(c1777580wMG, 104));
        ACListenerS161S0100000_27 aCListenerS161S0100000_27 = new ACListenerS161S0100000_27(new AwS571S0100000_27(c1777580wMG, 105), 211);
        C786410Ut5.h9((TuxTextView) this.LL.getValue(), aCListenerS161S0100000_27);
        C786410Ut5.Q7((ImageView) this.LLILZ.getValue(), aCListenerS161S0100000_27);
        C786410Ut5.I7(aCListenerS161S0100000_27, S5());
        C786410Ut5.I7(aCListenerS161S0100000_27, T5());
        C786410Ut5.I7(aCListenerS161S0100000_27, (View) this.LLILZLL.getValue());
        C786410Ut5.h9((TuxTextView) this.LLILLL.getValue(), aCListenerS161S0100000_27);
        C786410Ut5.I7(aCListenerS161S0100000_27, this.itemView);
        if (c1777580wMG.LLILLJJLI.LIZLLL) {
            int iLIZIZ7 = C20736316Cj.LIZIZ(R.attr.eyi, this.itemView.getContext());
            this.itemView.setBackgroundColor(Color.argb(C13LZ.LJ(C814420VxA.LIZIZ(Color.alpha(iLIZIZ7) * 0.6f), 0, 255), Color.red(iLIZIZ7), Color.green(iLIZIZ7), Color.blue(iLIZIZ7)));
        } else {
            this.itemView.setBackground(null);
        }
    }

    public final void b6(boolean z) {
        C1295960jpS c1295960jpSU5 = U5();
        int i = 0;
        c1295960jpSU5.setMinAndMaxFrame(0, 14);
        if (z) {
            i = 14;
        }
        c1295960jpSU5.setFrame(i);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        I5((C1777580wMG) interfaceC1891350zJl);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return PowerCell.inflateItemView$default(this, viewGroup, R.layout.g3z, false, 4, null);
    }

    public static PropertyValuesHolder P5(Property property, boolean z) {
        float f;
        float f2;
        Keyframe[] keyframeArr = new Keyframe[5];
        if (z) {
            f = 0.7f;
        } else {
            f = 1.0f;
        }
        keyframeArr[0] = Keyframe.ofFloat(0.0f, f);
        if (z) {
            f2 = 0.7f;
        } else {
            f2 = 1.0f;
        }
        keyframeArr[1] = Keyframe.ofFloat(0.55f, f2);
        keyframeArr[2] = Keyframe.ofFloat(0.7f, 0.7f);
        keyframeArr[3] = Keyframe.ofFloat(0.85f, 1.15f);
        keyframeArr[4] = Keyframe.ofFloat(1.0f, 1.0f);
        return PropertyValuesHolder.ofKeyframe(property, keyframeArr);
    }

    public final void L5(final C1777430wM1 c1777430wM1, final Function0<Unit> function0) {
        boolean z;
        int i;
        int i2;
        int iIntValue;
        boolean z2;
        if (!this.LLJJJIL) {
            this.LLJJJIL = true;
            U5().removeAllLottieOnCompositionLoadedListener();
            U5().addLottieOnCompositionLoadedListener(new InterfaceC1296230jpt() { // from class: X.0xFR
                @Override // X.InterfaceC1296230jpt
                public final void LIZ(C1294720jnS c1294720jnS) {
                    if (!this.LL.U5().isAnimating()) {
                        CreatorRankingRankCell creatorRankingRankCell = this.LL;
                        creatorRankingRankCell.b6(creatorRankingRankCell.LLJJJJ);
                    }
                }
            });
            C1143680frq.LJIILJJIL(U5(), "tiktok_live_revenue_demand_1", "ttlive_anim_creator_ranking_match_recommend.zip", false);
        }
        if (c1777430wM1 != null && c1777430wM1.LIZ) {
            z = true;
        } else {
            z = false;
        }
        View view = (View) this.LLJIJIL.getValue();
        int i3 = 8;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, view);
        View view2 = (View) this.LLJJI.getValue();
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        C786410Ut5.LJLLLLLL(i2, view2);
        ((View) this.LLJJI.getValue()).setClickable(z);
        String str = "";
        float f = 1.0f;
        if (!z) {
            R5().setEnabled(false);
            C786410Ut5.T4(R5(), 1.0f);
            C786410Ut5.LJLLLLLL(8, W5());
            W5().setText("");
            X5();
            a6();
            N5();
        } else if (c1777430wM1 != null) {
            this.LLJJJJ = c1777430wM1.LIZIZ;
            R5().setEnabled(!c1777430wM1.LJ);
            View viewR5 = R5();
            if (c1777430wM1.LIZJ) {
                f = 0.4f;
            }
            C786410Ut5.T4(viewR5, f);
            if (!U5().isAnimating()) {
                b6(c1777430wM1.LIZIZ);
            }
            Animator animator = this.LLJJIII;
            if ((animator == null || !animator.isRunning()) && !U5().isAnimating()) {
                TuxTextView tuxTextViewW5 = W5();
                if (c1777430wM1.LIZIZ) {
                    iIntValue = V5();
                } else {
                    iIntValue = ((Number) this.LLJJIJIIJIL.getValue()).intValue();
                }
                tuxTextViewW5.setTextColor(iIntValue);
            }
            String str2 = c1777430wM1.LIZLLL;
            TuxTextView tuxTextViewW52 = W5();
            if (str2 != null && str2.length() != 0) {
                i3 = 0;
            }
            C786410Ut5.LJLLLLLL(i3, tuxTextViewW52);
            TuxTextView tuxTextViewW53 = W5();
            if (str2 != null) {
                str = str2;
            }
            tuxTextViewW53.setText(str);
            X5();
            if (str2 != null) {
                int length = str2.length();
                if (length == 3) {
                    W5().setLetterSpacing((-0.8f) / (((Number) this.LLJJIJIL.getValue()).floatValue() / C497740JfY.LIZIZ.density));
                } else if (length >= 4) {
                    W5().setTextSize(1, 7.0f);
                    W5().setLetterSpacing(-0.114285715f);
                }
            }
        }
        C786410Ut5.I7(null, R5());
        R5().setClickable(false);
        C786410Ut5.I7(null, (View) this.LLJJI.getValue());
        View view3 = (View) this.LLJJI.getValue();
        if (c1777430wM1 != null && c1777430wM1.LIZ) {
            z2 = true;
        } else {
            z2 = false;
        }
        view3.setClickable(z2);
        if (c1777430wM1 != null && c1777430wM1.LIZ && !c1777430wM1.LJ) {
            C786410Ut5.I7(new AbstractViewOnClickListenerC1105820esm() { // from class: X.0xFQ
                @Override // X.AbstractViewOnClickListenerC1105820esm
                public final void LIZ() {
                    function0.invoke();
                    C1777430wM1 c1777430wM12 = c1777430wM1;
                    if (c1777430wM12.LIZIZ) {
                        this.a6();
                        return;
                    }
                    if (c1777430wM12.LIZJ) {
                        return;
                    }
                    final CreatorRankingRankCell creatorRankingRankCell = this;
                    String str3 = c1777430wM12.LIZLLL;
                    final boolean z3 = str3 == null || str3.length() == 0;
                    creatorRankingRankCell.N5();
                    final TuxTextView tuxTextViewW54 = creatorRankingRankCell.W5();
                    final C013C c013c = new C013C();
                    c013c.element = z3;
                    C786410Ut5.B5(tuxTextViewW54, z3 ? 0.0f : 1.0f);
                    tuxTextViewW54.setTextColor(z3 ? creatorRankingRankCell.V5() : ((Number) creatorRankingRankCell.LLJJIJIIJIL.getValue()).intValue());
                    final C013C c013c2 = new C013C();
                    ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(tuxTextViewW54, CreatorRankingRankCell.P5(View.SCALE_X, z3), CreatorRankingRankCell.P5(View.SCALE_Y, z3));
                    objectAnimatorOfPropertyValuesHolder.setDuration(667L);
                    objectAnimatorOfPropertyValuesHolder.setInterpolator(new LinearInterpolator());
                    objectAnimatorOfPropertyValuesHolder.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0eXT
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            if (!c013c2.element && tuxTextViewW54.getWidth() > 0 && tuxTextViewW54.getHeight() > 0) {
                                c013c2.element = true;
                                tuxTextViewW54.setPivotX(r1.getWidth() / 2.0f);
                                tuxTextViewW54.setPivotY(r1.getHeight() / 2.0f);
                            }
                            if (z3 && valueAnimator.getAnimatedFraction() >= 0.7f) {
                                C786410Ut5.B5(tuxTextViewW54, 1.0f);
                            }
                            if (!c013c.element && valueAnimator.getAnimatedFraction() >= 0.8f) {
                                c013c.element = true;
                                tuxTextViewW54.setTextColor(creatorRankingRankCell.V5());
                            }
                        }
                    });
                    objectAnimatorOfPropertyValuesHolder.addListener(new ALAdapterS21S0200000_27(tuxTextViewW54, creatorRankingRankCell, 8));
                    C786410Ut5.Pd(objectAnimatorOfPropertyValuesHolder);
                    creatorRankingRankCell.LLJJIII = objectAnimatorOfPropertyValuesHolder;
                    CreatorRankingRankCell creatorRankingRankCell2 = this;
                    C1295960jpS c1295960jpSU5 = creatorRankingRankCell2.U5();
                    c1295960jpSU5.removeAllAnimatorListeners();
                    c1295960jpSU5.cancelAnimation();
                    c1295960jpSU5.setSpeed(1.0f);
                    creatorRankingRankCell2.b6(false);
                    c1295960jpSU5.addAnimatorListener(new AAListenerS275S0200000_27(c1295960jpSU5, creatorRankingRankCell2, 5));
                    c1295960jpSU5.playAnimation();
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1000L);
                }
            }, (View) this.LLJJI.getValue());
        }
    }

    public final void c6(int i, int i2) {
        View viewS5 = S5();
        ViewGroup.LayoutParams layoutParams = S5().getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        C786410Ut5.W5(viewS5, layoutParams);
        C500260Jjc.LJLJI(i2, T5());
        C500260Jjc.LJJLJ(i2, T5());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        ?? arrayList;
        C1777580wMG c1777580wMG = (C1777580wMG) interfaceC1891350zJl;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof String) {
                arrayList = Collections.singletonList(obj);
            } else if (obj instanceof List) {
                arrayList = new ArrayList();
                for (Object obj2 : (Iterable) obj) {
                    if (obj2 instanceof String) {
                        arrayList.add(obj2);
                    }
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            C19719612Di.LJJI(arrayList, arrayList2);
        }
        if (C13LP.LLIIJI(arrayList2).contains("payload_match_recommend")) {
            L5(c1777580wMG.LLILLJJLI.LIZJ, new AwS571S0100000_27(c1777580wMG, 1419));
        } else {
            I5(c1777580wMG);
        }
    }
}
