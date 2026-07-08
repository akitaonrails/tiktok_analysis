package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.android.live.liveinteract.match.business.event.BattleUserTop23GuideShowChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.AwS146S0400000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0fuy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1145620fuy extends FrameLayout implements InterfaceC1145720fv8 {
    public final DataChannel LL;
    public View LLILLJJLI;
    public AppCompatImageView LLILLL;
    public C1126540fQC LLILZ;
    public View LLILZIL;
    public View LLILZLL;
    public View LLIZ;
    public C16FS LLIZLLLIL;
    public C16F5 LLJ;
    public C16F5 LLJI;
    public C16F5 LLJIJIL;
    public C1324720kZq LLJILJIL;
    public int LLJILJILJ;
    public long LLJILLL;
    public C466310IQj LLJJ;
    public boolean LLJJI;
    public C1324720kZq LLJJIII;
    public C1324720kZq LLJJIJI;
    public FrameLayout LLJJIJIIJIL;

    public void setBackgroundAlpha(float f) {
    }

    public final void LIZLLL() {
        C20441214yg.LJ("lipengwei", "removeBorderAnimView");
        C1324720kZq c1324720kZq = this.LLJJIJI;
        if (c1324720kZq != null) {
            C500260Jjc.LJIILLIIL(c1324720kZq);
        }
        C1324720kZq c1324720kZq2 = this.LLJJIII;
        if (c1324720kZq2 != null) {
            C500260Jjc.LJIILLIIL(c1324720kZq2);
        }
        FrameLayout frameLayout = this.LLJJIJIIJIL;
        if (frameLayout != null) {
            C786410Ut5.LJJJZ(this.LLJJIJI, frameLayout);
        }
        FrameLayout frameLayout2 = this.LLJJIJIIJIL;
        if (frameLayout2 != null) {
            C786410Ut5.LJJJZ(this.LLJJIII, frameLayout2);
        }
        C1324720kZq c1324720kZq3 = this.LLJILJIL;
        if (c1324720kZq3 != null) {
            C500260Jjc.LLFFF(c1324720kZq3);
        }
        C1126540fQC c1126540fQC = this.LLILZ;
        if (c1126540fQC != null) {
            C500260Jjc.LLFFF(c1126540fQC);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C466310IQj c466310IQj = this.LLJJ;
        if (c466310IQj != null) {
            c466310IQj.LIZ();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLILLJJLI = findViewById(R.id.xe9);
        this.LLILZIL = findViewById(R.id.l_c);
        this.LLILZLL = findViewById(R.id.c30);
        this.LLIZ = findViewById(R.id.er_);
        this.LLILLL = (AppCompatImageView) findViewById(R.id.lo7);
        this.LLILZ = (C1126540fQC) findViewById(R.id.lo8);
        this.LLIZLLLIL = (C16FS) findViewById(R.id.cqw);
        this.LLJI = (C16F5) findViewById(R.id.zx4);
        this.LLJIJIL = (C16F5) findViewById(R.id.zx3);
        this.LLJ = (C16F5) findViewById(R.id.zx2);
        this.LLJILJIL = (C1324720kZq) findViewById(R.id.oyy);
    }

    public final DataChannel getDataChannel() {
        return this.LL;
    }

    public C1145620fuy(Context context, DataChannel dataChannel) {
        super(context, null, 0);
        this.LL = dataChannel;
        this.LLJILJILJ = 2;
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.h2m, this, true);
    }

    public static String LIZIZ(int i, boolean z) {
        if (i != 2) {
            if (i != 3) {
                return "";
            }
            if (z) {
                return C497740JfY.LJIJI(2131853757);
            }
            return C497740JfY.LJIJI(2131853753);
        }
        if (z) {
            return C497740JfY.LJIJI(2131853756);
        }
        return C497740JfY.LJIJI(2131853753);
    }

    @Override // X.InterfaceC1145720fv8
    public final void LIZ(C1145600fuw c1145600fuw, AwS146S0400000_17 awS146S0400000_17) {
        long jLongValue;
        int iIntValue;
        String str;
        int i;
        Integer num;
        Long l;
        if (c1145600fuw.LIZ instanceof C1144910ftp) {
            C1144880ftm c1144880ftm = c1145600fuw.LJ;
            if (c1144880ftm != null && (l = c1144880ftm.LJIIIIZZ) != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            this.LLJILLL = jLongValue;
            if (jLongValue > 0 && (jLongValue - C158B.LIZ()) / ((long) LSPassThroughRecordSizeConfig.DEFAULT) > 5) {
                int visibility = getVisibility();
                setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, this);
                C1144880ftm c1144880ftm2 = c1145600fuw.LJ;
                if (c1144880ftm2 != null && (num = c1144880ftm2.LJII) != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = this.LLJILJILJ;
                }
                this.LLJILJILJ = iIntValue;
                boolean z = c1145600fuw.LIZJ;
                this.LLJJI = z;
                if (z) {
                    View view = this.LLIZ;
                    if (view != null) {
                        C500260Jjc.LLFFF(view);
                    }
                    C500260Jjc.LJJZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)), this.LLILLJJLI);
                    AppCompatImageView appCompatImageView = this.LLILLL;
                    if (appCompatImageView != null) {
                        C500260Jjc.LJLJLLL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), appCompatImageView);
                        C500260Jjc.LJJZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), appCompatImageView);
                    }
                    C1126540fQC c1126540fQC = this.LLILZ;
                    if (c1126540fQC != null) {
                        C500260Jjc.LJLJLLL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60)), c1126540fQC);
                        C500260Jjc.LJJZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60)), c1126540fQC);
                    }
                    View view2 = this.LLILZLL;
                    if (view2 != null) {
                        C500260Jjc.LJLJLLL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)), view2);
                    }
                    C1324720kZq c1324720kZq = this.LLJILJIL;
                    if (c1324720kZq != null) {
                        C500260Jjc.LJLJLLL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), c1324720kZq);
                        C500260Jjc.LJJZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(21)), c1324720kZq);
                    }
                    View view3 = this.LLILZIL;
                    if (view3 != null) {
                        view3.setBackground(new ColorDrawable(C20736316Cj.LIZIZ(R.attr.esg, getContext())));
                    }
                    C16F5 c16f5 = this.LLJI;
                    if (c16f5 != null) {
                        C500260Jjc.LJIILIIL(c16f5);
                    }
                    C16F5 c16f52 = this.LLJIJIL;
                    if (c16f52 != null) {
                        C500260Jjc.LJIILIIL(c16f52);
                    }
                    C16F5 c16f53 = this.LLJ;
                    if (c16f53 != null) {
                        C500260Jjc.LLFFF(c16f53);
                    }
                    String strLIZIZ = LIZIZ(this.LLJILJILJ, true);
                    C16F5 c16f54 = this.LLJ;
                    if (c16f54 != null) {
                        c16f54.setText(strLIZIZ);
                    }
                    C1144880ftm c1144880ftm3 = c1145600fuw.LJ;
                    if (c1144880ftm3 != null) {
                        c1144880ftm3.LIZ = strLIZIZ;
                    }
                    C16F5 c16f55 = this.LLJ;
                    if (c16f55 != null) {
                        c16f55.setText(LIZIZ(this.LLJILJILJ, true));
                    }
                } else {
                    View view4 = this.LLIZ;
                    if (view4 != null) {
                        C500260Jjc.LJIILIIL(view4);
                    }
                    C16F5 c16f56 = this.LLJI;
                    if (c16f56 != null) {
                        C500260Jjc.LLFFF(c16f56);
                    }
                    C16F5 c16f57 = this.LLJIJIL;
                    if (c16f57 != null) {
                        C500260Jjc.LLFFF(c16f57);
                    }
                    C16F5 c16f58 = this.LLJ;
                    if (c16f58 != null) {
                        C500260Jjc.LJIILIIL(c16f58);
                    }
                    final int i2 = this.LLJILJILJ;
                    long jLIZ = this.LLJILLL - C158B.LIZ();
                    C16F5 c16f59 = this.LLJI;
                    if (c16f59 != null) {
                        c16f59.setText(LIZJ(i2, (int) (jLIZ / ((long) LSPassThroughRecordSizeConfig.DEFAULT))));
                    }
                    C466310IQj c466310IQj = this.LLJJ;
                    if (c466310IQj != null) {
                        c466310IQj.LIZ();
                    }
                    C466310IQj c466310IQj2 = new C466310IQj(jLIZ, 1000L, new InterfaceC466320IQk() { // from class: X.0fuz
                        @Override // X.InterfaceC466320IQk
                        public final void LIZLLL() {
                        }

                        @Override // X.InterfaceC466320IQk
                        public final void onStart() {
                        }

                        @Override // X.InterfaceC466320IQk
                        public final void LJJI(long j) {
                            if (j < 1000) {
                                C466310IQj c466310IQj3 = this.LIZ.LLJJ;
                                if (c466310IQj3 != null) {
                                    c466310IQj3.LIZ();
                                    return;
                                }
                                return;
                            }
                            C1145620fuy c1145620fuy = this.LIZ;
                            C16F5 c16f510 = c1145620fuy.LLJI;
                            if (c16f510 == null) {
                                return;
                            }
                            c16f510.setText(c1145620fuy.LIZJ(i2, (int) (j / ((long) LSPassThroughRecordSizeConfig.DEFAULT))));
                        }
                    });
                    this.LLJJ = c466310IQj2;
                    c466310IQj2.LJ();
                    String strLIZIZ2 = LIZIZ(this.LLJILJILJ, false);
                    C16F5 c16f510 = this.LLJIJIL;
                    if (c16f510 != null) {
                        c16f510.setText(strLIZIZ2);
                    }
                    C1144880ftm c1144880ftm4 = c1145600fuw.LJ;
                    if (c1144880ftm4 != null) {
                        c1144880ftm4.LIZ = strLIZIZ2;
                    }
                    C1324720kZq c1324720kZq2 = this.LLJILJIL;
                    if (c1324720kZq2 != null) {
                        C500260Jjc.LJJLJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), c1324720kZq2);
                    }
                    View view5 = this.LLILZIL;
                    if (view5 != null) {
                        view5.setBackground(new ColorDrawable(C20736316Cj.LIZIZ(R.attr.etq, getContext())));
                    }
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)));
                    layoutParams.gravity = 80;
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
                    setLayoutParams(layoutParams);
                }
                if (c1145600fuw.LIZLLL != null) {
                    AppCompatImageView appCompatImageView2 = this.LLILLL;
                    if (appCompatImageView2 != null) {
                        C786410Ut5.LLILIL(appCompatImageView2, 0);
                    }
                    C20441214yg.LJ("MatchBottomGuideTop23Layout", "updateBottomConfig: leftIconRes is not null");
                    C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(c1145600fuw.LIZLLL);
                    c1324610kZfLJIIIZ.LJIILIIL = Boolean.TRUE;
                    c1324610kZfLJIIIZ.LJJI(this.LLILLL);
                }
                C1143680frq.LJ(this.LLILZ, "tiktok_live_interaction_demand_16", "seat_top2_animation.webp", ImageView.ScaleType.CENTER_INSIDE);
                C1144880ftm c1144880ftm5 = c1145600fuw.LJ;
                String str2 = null;
                if (c1144880ftm5 != null) {
                    str = c1144880ftm5.LJ;
                } else {
                    str = null;
                }
                if (C500260Jjc.LJJIIZ(str)) {
                    C16FS c16fs = this.LLIZLLLIL;
                    if (c16fs != null) {
                        C1144880ftm c1144880ftm6 = c1145600fuw.LJ;
                        if (c1144880ftm6 != null) {
                            str2 = c1144880ftm6.LJ;
                        }
                        c16fs.setText(str2);
                    }
                } else {
                    C16FS c16fs2 = this.LLIZLLLIL;
                    if (c16fs2 != null) {
                        c16fs2.setText(C497740JfY.LJIJI(2131842142));
                    }
                }
                C16FS c16fs3 = this.LLIZLLLIL;
                if (c16fs3 != null) {
                    C500260Jjc.LJLIIIL(500L, c16fs3, new AwS596S0100000_17(awS146S0400000_17, 365));
                }
                C1324720kZq c1324720kZq3 = this.LLJILJIL;
                if (c1324720kZq3 != null) {
                    C500260Jjc.LLFFF(c1324720kZq3);
                    int i3 = this.LLJILJILJ;
                    if (i3 != 2 && i3 == 3) {
                        i = R.drawable.ez_;
                    } else {
                        i = R.drawable.eza;
                    }
                    c1324720kZq3.setActualImageResource(i);
                    return;
                }
                return;
            }
            int visibility2 = getVisibility();
            setVisibility(8);
            C1602160rnK.LIZIZ(visibility2, 8, this);
        }
    }

    public final SpannableString LIZJ(int i, int i2) {
        int iIntValue = -340459;
        if (i != 2) {
            if (i != 3) {
                return new SpannableString("");
            }
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.c5q, new ContextThemeWrapper(getContext(), R.style.z4));
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            }
            SpannableString spannableString = new SpannableString(C786410Ut5.j4(C497740JfY.LJIJI(2131853755), Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1)));
            C786410Ut5.p2(spannableString, new ForegroundColorSpan(iIntValue), a0.LJJJJI(spannableString, String.valueOf(i2), 0, 6), spannableString.toString().length(), 33);
            return spannableString;
        }
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.c5q, new ContextThemeWrapper(getContext(), R.style.z4));
        if (numLIZJ2 != null) {
            iIntValue = numLIZJ2.intValue();
        }
        SpannableString spannableString2 = new SpannableString(C786410Ut5.j4(C497740JfY.LJIJI(2131853754), Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1)));
        C786410Ut5.p2(spannableString2, new ForegroundColorSpan(iIntValue), a0.LJJJJI(spannableString2, String.valueOf(i2), 0, 6), spannableString2.toString().length(), 33);
        return spannableString2;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        DataChannel dataChannel;
        super.onVisibilityChanged(view, i);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onVisibilityChanged: visibility ");
        sbLIZ.append(i);
        C20441214yg.LJ("lipengwei", C2188811AlT.LIZIZ(sbLIZ));
        if (i != 4 && i != 8) {
            return;
        }
        LIZLLL();
        if (!this.LLJJI || (dataChannel = this.LL) == null) {
            return;
        }
        dataChannel.zW(BattleUserTop23GuideShowChannel.class, Boolean.FALSE);
    }
}
