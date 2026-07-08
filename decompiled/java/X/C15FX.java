package X;

import Y.AAListenerS277S0200000_31;
import Y.AAListenerS341S0100000_31;
import Y.AAListenerS88S0400000_31;
import Y.ACListenerS150S0100000_15;
import Y.ACListenerS165S0100000_31;
import Y.ARunnableS117S0100000_17;
import Y.ARunnableS131S0100000_31;
import Y.ARunnableS26S0100100_31;
import Y.ARunnableS86S0200000_17;
import Y.AUListenerS233S0200000_31;
import Y.AUListenerS266S0100000_17;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.gift.GiftService;
import com.bytedance.android.live.gift.LogGiftCloseToastShowEvent;
import com.bytedance.android.live.gift.SendGiftEvent;
import com.bytedance.android.live.liveinteract.api.BattleBonusTaskShowChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleBonusContainerChangeEvent;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.level.FansClubPanelV2Settings;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchBonusTaskContainerFixedSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchCoreScenariosMetricsSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchLowEndOptimizationSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveSpeedChallengeNpeFixSetting;
import com.bytedance.android.livesdk.livesetting.revenuestrategy.LiveHeartMeTaskSleepFansEnable;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.revenue.level.api.event.FansClubChannel;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattlePrompt;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTaskGiftAmountGuide;
import com.bytedance.android.livesdkapi.depend.model.live.match.PreviewPeriod;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS77S0100100_31;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.15FX, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15FX extends RelativeLayout implements C15FU {
    public boolean LL;
    public RelativeLayout LLILLJJLI;
    public ViewGroup LLILLL;
    public LinearLayout LLILZ;
    public C1324720kZq LLILZIL;
    public C427330GpH LLILZLL;
    public ConstraintLayout LLIZ;
    public ConstraintLayout LLIZLLLIL;
    public C1324720kZq LLJ;
    public C427330GpH LLJI;
    public ProgressBar LLJIJIL;
    public C16F5 LLJILJIL;
    public CardView LLJILJILJ;
    public C16FV LLJILLL;
    public LinearLayout LLJJ;
    public C427330GpH LLJJI;
    public C16F5 LLJJIII;
    public View LLJJIJI;
    public FrameLayout LLJJIJIIJIL;
    public C1126540fQC LLJJIJIL;
    public C15FZ LLJJJ;
    public EnumC20488815Fe LLJJJIL;
    public boolean LLJJJJ;
    public DataChannel LLJJJJJIL;
    public C15FV LLJJJJLIIL;
    public final BPEAHandler LLJJL;
    public ValueAnimator LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public int LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;
    public boolean LLJZ;

    @Override // X.C15FU
    public final void LIZ() {
        if (this.LL) {
            C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131842775));
        }
    }

    public final void LJI() {
        if (this.LLJL) {
            C1126540fQC c1126540fQC = this.LLJJIJIL;
            if (c1126540fQC != null) {
                C786410Ut5.LLJJI(c1126540fQC, 8);
            }
            ConstraintLayout constraintLayout = this.LLIZ;
            if (constraintLayout != null) {
                C786410Ut5.Y7(constraintLayout, new ACListenerS165S0100000_31(this, 19));
                return;
            }
            return;
        }
        C1126540fQC c1126540fQC2 = this.LLJJIJIL;
        if (c1126540fQC2 != null) {
            C786410Ut5.LLJJI(c1126540fQC2, 0);
        }
        C1126540fQC c1126540fQC3 = this.LLJJIJIL;
        if (c1126540fQC3 != null) {
            c1126540fQC3.LJII();
        }
        ConstraintLayout constraintLayout2 = this.LLIZ;
        if (constraintLayout2 != null) {
            C786410Ut5.Y7(constraintLayout2, new ACListenerS165S0100000_31(this, 20));
        }
    }

    public final void LJII() {
        FrameLayout frameLayout = this.LLJJIJIIJIL;
        if (frameLayout != null) {
            int width = frameLayout.getWidth() - ((int) C497740JfY.LIZIZ(24.0f));
            float fLIZIZ = -((int) C497740JfY.LIZIZ(67.0f));
            float f = width;
            float fLIZIZ2 = (f * 1.0f) + ((int) C497740JfY.LIZIZ(67.0f)) + ((int) C497740JfY.LIZIZ(24.0f));
            if (width == 0) {
                return;
            }
            int i = this.LLJJJ.LJIIJ;
            if (C497740JfY.LJJ()) {
                fLIZIZ = (int) C497740JfY.LIZIZ(67.0f);
                fLIZIZ2 = (((-1.0f) * f) - ((int) C497740JfY.LIZIZ(67.0f))) - ((int) C497740JfY.LIZIZ(24.0f));
            }
            C15FV c15fv = this.LLJJJJLIIL;
            if (c15fv == null) {
                c15fv = null;
            }
            if (c15fv.LLJI.compareTo(C159M.TASK_SUCCEED) >= 0) {
                CardView cardView = this.LLJILJILJ;
                if (cardView != null) {
                    C500260Jjc.LJJZZIII(i, cardView);
                }
            } else {
                float f2 = 1;
                C15FV c15fv2 = this.LLJJJJLIIL;
                int iLIZIZ = ((int) (f * (f2 - (((c15fv2 == null ? null : c15fv2).LLJJIJI * 1.0f) / (c15fv2 != null ? c15fv2 : null).LLJJIII)))) + ((int) C497740JfY.LIZIZ(12.0f));
                CardView cardView2 = this.LLJILJILJ;
                if (cardView2 != null) {
                    C500260Jjc.LJLJJL(this.LLJJJ.LJIIJ, cardView2);
                }
                CardView cardView3 = this.LLJILJILJ;
                if (cardView3 != null) {
                    C500260Jjc.LJJLJLI(iLIZIZ, cardView3);
                }
            }
            if (isAttachedToWindow()) {
                ValueAnimator valueAnimator = this.LLJJLIIIJLLLLLLLZ;
                if (valueAnimator != null) {
                    valueAnimator.removeAllUpdateListeners();
                    ValueAnimator valueAnimator2 = this.LLJJLIIIJLLLLLLLZ;
                    if (valueAnimator2 != null) {
                        valueAnimator2.end();
                    }
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fLIZIZ, fLIZIZ2);
                this.LLJJLIIIJLLLLLLLZ = valueAnimatorOfFloat;
                if (valueAnimatorOfFloat != null) {
                    valueAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.52f, 0.0f, 0.74f, 0.0f));
                }
                ValueAnimator valueAnimator3 = this.LLJJLIIIJLLLLLLLZ;
                if (valueAnimator3 != null) {
                    valueAnimator3.setDuration(1500L);
                }
                ValueAnimator valueAnimator4 = this.LLJJLIIIJLLLLLLLZ;
                if (valueAnimator4 != null) {
                    valueAnimator4.removeAllUpdateListeners();
                }
                ValueAnimator valueAnimator5 = this.LLJJLIIIJLLLLLLLZ;
                if (valueAnimator5 != null) {
                    valueAnimator5.addUpdateListener(new AUListenerS266S0100000_17(this, 6));
                }
                ValueAnimator valueAnimator6 = this.LLJJLIIIJLLLLLLLZ;
                if (valueAnimator6 != null) {
                    valueAnimator6.setRepeatMode(1);
                }
                ValueAnimator valueAnimator7 = this.LLJJLIIIJLLLLLLLZ;
                if (valueAnimator7 != null) {
                    valueAnimator7.setRepeatCount(20);
                }
                ValueAnimator valueAnimator8 = this.LLJJLIIIJLLLLLLLZ;
                if (valueAnimator8 != null) {
                    valueAnimator8.start();
                }
            }
        }
    }

    public final void LJIIIIZZ() {
        if (this.LL) {
            C15FV c15fv = this.LLJJJJLIIL;
            if (c15fv == null) {
                c15fv = null;
            }
            if (c15fv.LLJI.compareTo(C159M.TASK_IN_PROCESS) >= 0) {
                C15FV c15fv2 = this.LLJJJJLIIL;
                if ((c15fv2 == null ? null : c15fv2).LLJI != C159M.TASK_FAILED) {
                    if ((c15fv2 == null ? null : c15fv2).LLJJIJI == 0) {
                        if (!(c15fv2 != null ? c15fv2 : null).LJI()) {
                            CardView cardView = this.LLJILJILJ;
                            if (cardView != null) {
                                C786410Ut5.LLILLL(cardView, 8);
                            }
                            C16FV c16fv = this.LLJILLL;
                            if (c16fv != null) {
                                C786410Ut5.LLJJJJJIL(c16fv, 8);
                                return;
                            }
                            return;
                        }
                    }
                    C16FV c16fv2 = this.LLJILLL;
                    if (c16fv2 != null) {
                        C786410Ut5.LLJJJJJIL(c16fv2, 0);
                    }
                    CardView cardView2 = this.LLJILJILJ;
                    if (cardView2 != null) {
                        C786410Ut5.LLILLL(cardView2, 0);
                    }
                    CardView cardView3 = this.LLJILJILJ;
                    if (cardView3 == null || cardView3.getWidth() != 0) {
                        LJII();
                        return;
                    }
                    CardView cardView4 = this.LLJILJILJ;
                    if (cardView4 != null) {
                        HandlerHook.viewPost(cardView4, new ARunnableS117S0100000_17(this, 319));
                        return;
                    }
                    return;
                }
            }
            ValueAnimator valueAnimator = this.LLJJLIIIJLLLLLLLZ;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                ValueAnimator valueAnimator2 = this.LLJJLIIIJLLLLLLLZ;
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllUpdateListeners();
                }
                ValueAnimator valueAnimator3 = this.LLJJLIIIJLLLLLLLZ;
                if (valueAnimator3 != null) {
                    valueAnimator3.end();
                }
            }
            CardView cardView5 = this.LLJILJILJ;
            if (cardView5 != null) {
                C786410Ut5.LLILLL(cardView5, 8);
            }
            C16FV c16fv3 = this.LLJILLL;
            if (c16fv3 != null) {
                C786410Ut5.LLJJJJJIL(c16fv3, 8);
            }
        }
    }

    public final void LJIIIZ() {
        if (this.LLJZ) {
            LJIILLIIL();
            this.LLJZ = false;
        }
        IActionHandlerService iActionHandlerService = (IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class);
        Context context = getContext();
        C15FV c15fv = this.LLJJJJLIIL;
        if (c15fv == null) {
            c15fv = null;
        }
        iActionHandlerService.handle(context, c15fv.LLJJL);
    }

    public final boolean LJIIL() {
        C15FV c15fv = this.LLJJJJLIIL;
        if (c15fv == null || this.LLJL) {
            return false;
        }
        return c15fv.LLJJJJ == 1 || c15fv.LLJJJJ == 2 || c15fv.LLJJJJ == 3 || c15fv.LLJJJJ == 4;
    }

    public final void LJIILLIIL() {
        C15FV c15fv = this.LLJJJJLIIL;
        if (c15fv == null) {
            c15fv = null;
        }
        String string = C1844920y6s.LIZIZ(c15fv.LLJJJJLIIL).toString();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        C766270U4b.LJIIIIZZ(4000L, getContext(), string);
        InterfaceC1094160eZy.V0.LJFF(Boolean.TRUE);
    }

    public final void LJIJI() {
        String strLIZIZ;
        C15FV c15fv = this.LLJJJJLIIL;
        if (c15fv == null) {
            c15fv = null;
        }
        if (c15fv.LLJJI == 0) {
            C1324720kZq c1324720kZq = this.LLJ;
            if (c1324720kZq != null) {
                C786410Ut5.LLJJIII(c1324720kZq, 8);
            }
            C15FV c15fv2 = this.LLJJJJLIIL;
            if (c15fv2 == null) {
                c15fv2 = null;
            }
            C20489215Fi c20489215Fi = new C20489215Fi(c15fv2.LLJLLL, null, null);
            C427330GpH c427330GpH = this.LLJI;
            LJIILIIL(this, c20489215Fi, new C20489115Fh(null, c427330GpH, c427330GpH, this.LLIZ));
            return;
        }
        C427330GpH c427330GpH2 = this.LLJI;
        if (c427330GpH2 != null) {
            if (C497740JfY.LJJ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                C15FV c15fv3 = this.LLJJJJLIIL;
                if (c15fv3 == null) {
                    c15fv3 = null;
                }
                sbLIZ.append(c15fv3.LLJJIII);
                sbLIZ.append('/');
                C15FV c15fv4 = this.LLJJJJLIIL;
                sbLIZ.append((c15fv4 != null ? c15fv4 : null).LLJJIJI);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                C15FV c15fv5 = this.LLJJJJLIIL;
                if (c15fv5 == null) {
                    c15fv5 = null;
                }
                sbLIZ2.append(c15fv5.LLJJIJI);
                sbLIZ2.append('/');
                C15FV c15fv6 = this.LLJJJJLIIL;
                sbLIZ2.append((c15fv6 != null ? c15fv6 : null).LLJJIII);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            c427330GpH2.setText(strLIZIZ);
        }
        LJIILL(0, this.LLIZLLLIL);
    }

    public final BattleTaskGiftAmountGuide getBattleTaskGuideInfo$liveinteract_impl_release() {
        C15FV c15fv = this.LLJJJJLIIL;
        if (c15fv == null) {
            c15fv = null;
        }
        return c15fv.LLLIIIIL;
    }

    public final int getTaskState() {
        C15FV c15fv = this.LLJJJJLIIL;
        if (c15fv == null) {
            c15fv = null;
        }
        int i = C159N.LIZ[c15fv.LLJI.ordinal()];
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? -1 : 0;
        }
        return 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        LJIILJJIL("leave_room");
        this.LL = false;
        ValueAnimator valueAnimator = this.LLJJLIIIJLLLLLLLZ;
        if (valueAnimator != null) {
            valueAnimator.end();
            ValueAnimator valueAnimator2 = this.LLJJLIIIJLLLLLLLZ;
            if (valueAnimator2 != null) {
                valueAnimator2.removeAllUpdateListeners();
            }
            this.LLJJLIIIJLLLLLLLZ = null;
        }
        C20488615Fc.LIZ(EnumC20488515Fb.NONE, 0L, this.LLJL);
        this.LLJJL.removeCallbacksAndMessages(null);
        super.onDetachedFromWindow();
    }

    @Override // X.C15FU
    public final void LIZIZ() {
        C15FR c15fr;
        C15FR c15fr2;
        ProgressBar progressBar;
        LJIJI();
        if (this.LL && (progressBar = this.LLJIJIL) != null) {
            int progress = progressBar.getProgress();
            C15FV c15fv = this.LLJJJJLIIL;
            if (c15fv == null) {
                c15fv = null;
            }
            if (progress != ((int) c15fv.LLJJIJI) * 10) {
                int[] iArr = new int[2];
                iArr[0] = progressBar.getProgress();
                C15FV c15fv2 = this.LLJJJJLIIL;
                if (c15fv2 == null) {
                    c15fv2 = null;
                }
                iArr[1] = ((int) c15fv2.LLJJIJI) * 10;
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iArr);
                valueAnimatorOfInt.setDuration(100L);
                valueAnimatorOfInt.addUpdateListener(new AUListenerS233S0200000_31(this, progressBar, 17));
                valueAnimatorOfInt.addListener(new AAListenerS341S0100000_31(this, 33));
                valueAnimatorOfInt.start();
            }
        }
        LJI();
        if (LJIIL() && LiveMatchCoreScenariosMetricsSetting.INSTANCE.enableBonusTrack()) {
            C15FV c15fv3 = this.LLJJJJLIIL;
            C15FV c15fv4 = c15fv3 == null ? null : c15fv3;
            String str = c15fv4.LLLIIII;
            c15fv4.LLLIIII = null;
            if (str != null) {
                C974540bT2 c974540bT2 = C974540bT2.LIZ;
                if (c15fv3 == null) {
                    c15fv3 = null;
                }
                long j = c15fv3.LLJJIJI;
                long jLIZ = C158B.LIZ();
                long jLIZ2 = C158B.LIZ();
                Map<String, List<C15FR>> map = C974540bT2.LJJIIJZLJL;
                LinkedHashMap linkedHashMap = (LinkedHashMap) map;
                List list = (List) linkedHashMap.get(str);
                if (list != null && (c15fr2 = (C15FR) C13LP.LJJJLL(list)) != null) {
                    c15fr2.LIZ = j;
                    c15fr2.LIZLLL = jLIZ;
                    c15fr2.LJ = jLIZ2;
                }
                List list2 = (List) linkedHashMap.get(str);
                if (list2 == null || (c15fr = (C15FR) C13LP.LJJJLL(list2)) == null) {
                    return;
                }
                ListProtector.remove(list2, 0);
                if (list2.isEmpty()) {
                    map.remove(str);
                }
                C975320bUI.LJIIZILJ("bonus_progress_update", LJ(c15fr, 1, null));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LL = true;
        this.LLILLJJLI = (RelativeLayout) findViewById(R.id.trr);
        this.LLILLL = (ViewGroup) findViewById(R.id.byc);
        this.LLILZ = (LinearLayout) findViewById(R.id.nkj);
        this.LLILZIL = (C1324720kZq) findViewById(R.id.jx5);
        this.LLILZLL = (C427330GpH) findViewById(R.id.tv_task_notice);
        this.LLIZ = (ConstraintLayout) findViewById(R.id.byb);
        this.LLIZLLLIL = (ConstraintLayout) findViewById(R.id.ewo);
        this.LLJ = (C1324720kZq) findViewById(R.id.lxa);
        this.LLJI = (C427330GpH) findViewById(R.id.tv_task_in_progress);
        this.LLJIJIL = (ProgressBar) findViewById(R.id.q6a);
        this.LLJILJIL = (C16F5) findViewById(R.id.zg7);
        this.LLJILJILJ = (CardView) findViewById(R.id.njt);
        this.LLJILLL = (C16FV) findViewById(R.id.wave_anim);
        this.LLJJ = (LinearLayout) findViewById(R.id.dvf);
        this.LLJJI = (C427330GpH) findViewById(R.id.zav);
        this.LLJJIII = (C16F5) findViewById(R.id.zfy);
        this.LLJJIJI = findViewById(R.id.fz_);
        this.LLJJIJIIJIL = (FrameLayout) findViewById(R.id.c8i);
        this.LLJJIJIL = (C1126540fQC) findViewById(R.id.lx6);
        if (LiveMatchLowEndOptimizationSettings.INSTANCE.isEnabled()) {
            ConstraintLayout constraintLayout = this.LLIZ;
            if (constraintLayout != null) {
                constraintLayout.setBackgroundResource(this.LLJJJ.LJIILJJIL);
            }
            setBonusResultBg(EnumC20488815Fe.TASK_CAPSULE);
        }
    }

    public final boolean getCpcToastShow() {
        return this.LLJLIL;
    }

    public final void LIZLLL(AbstractC986700bme abstractC986700bme) {
        C15FZ c15fz;
        LinearLayout linearLayout;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        C15FZ c15fz2 = C15FZ.LJIJJ;
        if (abstractC986700bme instanceof C986710bmf) {
            c15fz = C15FZ.LJIJJ;
        } else if (abstractC986700bme instanceof C986690bmd) {
            c15fz = C15FZ.LJIJJLI;
        } else {
            throw new C1954807lC();
        }
        if (c15fz == this.LLJJJ) {
            return;
        }
        this.LLJJJ = c15fz;
        RelativeLayout relativeLayout = this.LLILLJJLI;
        if (relativeLayout != null) {
            ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
            layoutParams.height = c15fz.LIZIZ;
            C786410Ut5.e6(relativeLayout, layoutParams);
            relativeLayout.setPadding(relativeLayout.getPaddingLeft(), c15fz.LIZJ, relativeLayout.getPaddingRight(), c15fz.LIZJ);
        }
        ViewGroup viewGroup = this.LLILLL;
        if (viewGroup != null) {
            ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
            layoutParams2.height = c15fz.LIZLLL;
            boolean z = layoutParams2 instanceof ViewGroup.MarginLayoutParams;
            if (z) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams2;
                if (marginLayoutParams3 != null) {
                    marginLayoutParams3.setMarginEnd(c15fz.LJFF);
                }
                if (z && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                    marginLayoutParams2.setMarginStart(c15fz.LJFF);
                }
            }
            C786410Ut5.X5(layoutParams2, viewGroup);
            viewGroup.setPadding(c15fz.LJ, viewGroup.getPaddingTop(), c15fz.LJ, viewGroup.getPaddingBottom());
            viewGroup.setBackgroundResource(c15fz.LJIJ);
        }
        LinearLayout linearLayout2 = this.LLILZ;
        if (linearLayout2 != null) {
            ViewGroup.LayoutParams layoutParams3 = linearLayout2.getLayoutParams();
            layoutParams3.height = c15fz.LIZLLL;
            C786410Ut5.d6(linearLayout2, layoutParams3);
        }
        ConstraintLayout constraintLayout = this.LLIZ;
        if (constraintLayout != null) {
            ViewGroup.LayoutParams layoutParams4 = constraintLayout.getLayoutParams();
            layoutParams4.height = c15fz.LIZLLL;
            C786410Ut5.m6(constraintLayout, layoutParams4);
            constraintLayout.setBackgroundResource(c15fz.LJIIZILJ);
        }
        FrameLayout frameLayout = this.LLJJIJIIJIL;
        if (frameLayout != null) {
            ViewGroup.LayoutParams layoutParams5 = frameLayout.getLayoutParams();
            layoutParams5.height = c15fz.LIZLLL;
            C786410Ut5.a6(frameLayout, layoutParams5);
            frameLayout.setPadding(c15fz.LJ, frameLayout.getPaddingTop(), c15fz.LJ, frameLayout.getPaddingBottom());
        }
        ProgressBar progressBar = this.LLJIJIL;
        if (progressBar != null) {
            ViewGroup.LayoutParams layoutParams6 = progressBar.getLayoutParams();
            layoutParams6.height = c15fz.LJI;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(progressBar);
            progressBar.setLayoutParams(layoutParams6);
            progressBar.setProgressDrawable(C497740JfY.LJIIJ(c15fz.LJIILLIIL));
        }
        C1324720kZq c1324720kZq = this.LLJ;
        if (c1324720kZq != null) {
            ViewGroup.LayoutParams layoutParams7 = c1324720kZq.getLayoutParams();
            int i = c15fz.LJII;
            layoutParams7.width = i;
            layoutParams7.height = i;
            C786410Ut5.u6(c1324720kZq, layoutParams7);
        }
        C1324720kZq c1324720kZq2 = this.LLILZIL;
        if (c1324720kZq2 != null) {
            ViewGroup.LayoutParams layoutParams8 = c1324720kZq2.getLayoutParams();
            int i2 = c15fz.LJII;
            layoutParams8.width = i2;
            layoutParams8.height = i2;
            C786410Ut5.u6(c1324720kZq2, layoutParams8);
        }
        C1126540fQC c1126540fQC = this.LLJJIJIL;
        if (c1126540fQC != null) {
            ViewGroup.LayoutParams layoutParams9 = c1126540fQC.getLayoutParams();
            int i3 = c15fz.LJIIIIZZ;
            layoutParams9.width = i3;
            layoutParams9.height = i3;
            C786410Ut5.t6(c1126540fQC, layoutParams9);
        }
        CardView cardView = this.LLJILJILJ;
        if (cardView != null) {
            ViewGroup.LayoutParams layoutParams10 = cardView.getLayoutParams();
            layoutParams10.height = c15fz.LIZLLL;
            boolean z2 = layoutParams10 instanceof ViewGroup.MarginLayoutParams;
            if (z2) {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams10;
                if (marginLayoutParams4 != null) {
                    marginLayoutParams4.setMarginEnd(c15fz.LJIIJ);
                }
                if (z2 && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams10) != null) {
                    marginLayoutParams.setMarginStart(c15fz.LJIIJ);
                }
            }
            C786410Ut5.j6(cardView, layoutParams10);
            cardView.setRadius(c15fz.LJIIJJI);
        }
        C16FV c16fv = this.LLJILLL;
        if (c16fv != null) {
            ViewGroup.LayoutParams layoutParams11 = c16fv.getLayoutParams();
            layoutParams11.height = c15fz.LJIIIZ;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c16fv);
            c16fv.setLayoutParams(layoutParams11);
        }
        for (C16F5 c16f5 : C1697810uHb.LJIIJJI(this.LLILZLL, this.LLJI, this.LLJJI)) {
            if (c16f5 != null) {
                c16f5.setTextAppearance(c15fz.LJIIL.getStyleRes());
                c16f5.setTextSize(2, c15fz.LJIIL.getSp());
                c16f5.setTextColor(C497740JfY.LIZLLL(R.attr.fxc, c16f5.getContext()));
            }
        }
        for (C16F5 c16f52 : C1697810uHb.LJIIJJI(this.LLJILJIL, this.LLJJIII)) {
            if (c16f52 != null) {
                c16f52.setTextAppearance(c15fz.LJIIL.getStyleRes());
                c16f52.setTextSize(2, c15fz.LJIIL.getSp());
                c16f52.setTextColor(C497740JfY.LIZLLL(R.attr.fxc, c16f52.getContext()));
            }
        }
        EnumC20488815Fe enumC20488815Fe = this.LLJJJIL;
        if (enumC20488815Fe != EnumC20488815Fe.NONE && (linearLayout = this.LLJJ) != null) {
            linearLayout.setBackgroundResource(C20489015Fg.LIZ(c15fz, enumC20488815Fe));
        }
    }

    public final void LJIIJ(boolean z) {
        C15FV c15fv;
        C1095140ebY c1095140ebY;
        if (this.LLJL) {
            return;
        }
        long j = 0;
        if (z) {
            LJIIJJI(0L);
            return;
        }
        C15FV c15fv2 = this.LLJJJJLIIL;
        if (c15fv2 == null) {
            c15fv = null;
        } else {
            c15fv = c15fv2;
        }
        if (c15fv.LLJJJJ == 21) {
            int i = 2131856490;
            if (LiveHeartMeTaskSleepFansEnable.INSTANCE.enable()) {
                DataChannel dataChannel = this.LLJJJJJIL;
                if (dataChannel != null && (c1095140ebY = (C1095140ebY) dataChannel.gg0(FansClubChannel.class)) != null && c1095140ebY.LJ == 2) {
                    Gift fansClubGift = GiftService.LLILLJJLI.getFansClubGift();
                    if (fansClubGift != null) {
                        j = fansClubGift.id;
                    }
                    LJIIJJI(j);
                    return;
                }
                if (this.LLJLILLLLZIIL) {
                    if (!FansClubPanelV2Settings.INSTANCE.enableFansClubPanelV2()) {
                        i = 2131856492;
                    }
                    C766270U4b.LJIIJJI(C497740JfY.LJIJI(i));
                    return;
                }
                LJIIIZ();
                return;
            }
            if (this.LLJLILLLLZIIL) {
                if (!FansClubPanelV2Settings.INSTANCE.enableFansClubPanelV2()) {
                    i = 2131856492;
                }
                C766270U4b.LJIIJJI(C497740JfY.LJIJI(i));
                return;
            }
            LJIIIZ();
            return;
        }
        if (c15fv2 == null) {
            c15fv2 = null;
        }
        if (c15fv2.LLJJJJJIL == 1) {
            LJIIIZ();
        } else {
            LJIIJJI(0L);
        }
    }

    public final void LJIIJJI(long j) {
        Room room;
        boolean z;
        C15FV c15fv;
        DataChannel dataChannel = this.LLJJJJJIL;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            boolean z2 = true;
            if (room.getRoomAuthStatus() != null && room.getRoomAuthStatus().isEnableGift()) {
                z = true;
            } else {
                z = false;
            }
            if (((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().No0() <= 0) {
                z2 = false;
            }
            EnumC1118300fCu enumC1118300fCuLIZIZ = C1118310fCv.LIZIZ(this.LLJL, z2, z);
            if (enumC1118300fCuLIZIZ != EnumC1118300fCu.GREY && enumC1118300fCuLIZIZ != EnumC1118300fCu.HIDE) {
                if (room.getOwner() != null) {
                    C15FV c15fv2 = null;
                    if (!InterfaceC1094160eZy.V0.LIZIZ().booleanValue()) {
                        C15FV c15fv3 = this.LLJJJJLIIL;
                        if (c15fv3 == null) {
                            c15fv3 = null;
                        }
                        if (c15fv3.LLJJJJLIIL != null) {
                            LJIILLIIL();
                        }
                    }
                    C1121570fIB c1121570fIB = new C1121570fIB(room.getOwner());
                    c1121570fIB.LIZJ = "pk_task";
                    HashMap map = new HashMap();
                    C15FV c15fv4 = this.LLJJJJLIIL;
                    if (c15fv4 == null) {
                        c15fv4 = null;
                    }
                    map.put("pk_task_num", String.valueOf(c15fv4.LLJJJJ));
                    C15FV c15fv5 = this.LLJJJJLIIL;
                    if (c15fv5 == null) {
                        c15fv = null;
                    } else {
                        c15fv = c15fv5;
                    }
                    String str = c15fv.LLJJJIL;
                    if (c15fv5 != null) {
                        c15fv2 = c15fv5;
                    }
                    C925640aCA.LIZJ(Integer.valueOf(c15fv2.LLJJJJ), str, map);
                    c1121570fIB.LJFF = map;
                    if (j != 0) {
                        c1121570fIB.LJIIIZ = j;
                    }
                    DataChannel dataChannel2 = this.LLJJJJJIL;
                    if (dataChannel2 != null) {
                        dataChannel2.LC0(SendGiftEvent.class, c1121570fIB);
                        return;
                    }
                    return;
                }
                return;
            }
            if (room.getRoomAuthStatus() != null && room.getRoomAuthStatus().getRoomAuthOffReasons() != null && room.getRoomAuthStatus().getRoomAuthOffReasons().getGift() != null) {
                C766270U4b.LJIIJJI(room.getRoomAuthStatus().getRoomAuthOffReasons().getGift());
                DataChannel dataChannel3 = this.LLJJJJJIL;
                if (dataChannel3 != null) {
                    dataChannel3.LC0(LogGiftCloseToastShowEvent.class, Boolean.TRUE);
                }
            }
        }
    }

    public final void LJIILJJIL(String str) {
        if (!LJIIL() || !LiveMatchCoreScenariosMetricsSetting.INSTANCE.enableBonusTrack()) {
            return;
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) C974540bT2.LJJIIJZLJL;
        List listLJIJJLI = C15438062q.LJIJJLI(linkedHashMap.values());
        linkedHashMap.clear();
        Iterator it2 = ((ArrayList) listLJIJJLI).iterator();
        while (it2.hasNext()) {
            C975320bUI.LJIIZILJ("bonus_progress_update", LJ((C15FR) it2.next(), 0, str));
        }
    }

    public final void setAnchor(boolean z) {
        this.LLJL = z;
    }

    public final void setBonusResultBg(EnumC20488815Fe enumC20488815Fe) {
        LinearLayout linearLayout;
        this.LLJJJIL = enumC20488815Fe;
        if (enumC20488815Fe != EnumC20488815Fe.NONE && (linearLayout = this.LLJJ) != null) {
            linearLayout.setBackgroundResource(C20489015Fg.LIZ(this.LLJJJ, enumC20488815Fe));
        }
    }

    public final void setCpcToastShow(boolean z) {
        this.LLJLIL = z;
    }

    public C15FX(Context context, AttributeSet attributeSet) {
        C15FZ c15fz;
        long j;
        super(context, attributeSet, 0);
        C15FZ c15fz2 = C15FZ.LJIJJ;
        C986710bmf c986710bmf = C986710bmf.LIZIZ;
        if (c986710bmf instanceof C986710bmf) {
            c15fz = C15FZ.LJIJJ;
        } else if (c986710bmf instanceof C986690bmd) {
            c15fz = C15FZ.LJIJJLI;
        } else {
            throw new C1954807lC();
        }
        this.LLJJJ = c15fz;
        this.LLJJJIL = EnumC20488815Fe.NONE;
        this.LLJJL = new BPEAHandler(Looper.getMainLooper());
        C1095140ebY c1095140ebYUw0 = ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).uw0();
        if (c1095140ebYUw0 != null) {
            j = c1095140ebYUw0.LIZ;
        } else {
            j = 0;
        }
        this.LLJLILLLLZIIL = j > 0;
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.ht1, this, true);
        this.LLJLLIL = true;
        this.LLJZ = true;
    }

    @Override // X.C15FU
    public final void LIZJ(long j, C159M c159m) throws JSONException {
        C15FV c15fv;
        boolean z;
        boolean z2;
        C15FV c15fv2;
        C15FV c15fv3;
        C15FV c15fv4;
        C15FV c15fv5;
        int i;
        Boolean boolValueOf;
        boolean z3;
        int i2;
        final ViewGroup viewGroup;
        int i3;
        boolean z4;
        DataChannel dataChannel;
        C15FV c15fv6;
        C15FV c15fv7;
        String str;
        DataChannel dataChannel2;
        if (c159m.compareTo(C159M.DISABLED) > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("state enabled ,state = ");
            sbLIZ.append(c159m);
            C20441214yg.LIZIZ("BattleTaskContainer", C2188811AlT.LIZIZ(sbLIZ));
            RelativeLayout relativeLayout = this.LLILLJJLI;
            if ((relativeLayout == null || relativeLayout.getVisibility() != 0) && (dataChannel2 = this.LLJJJJJIL) != null) {
                dataChannel2.zW(BattleBonusTaskShowChannel.class, Boolean.TRUE);
            }
            RelativeLayout relativeLayout2 = this.LLILLJJLI;
            if (relativeLayout2 != null) {
                C786410Ut5.LLIIL(relativeLayout2, 0);
            }
            RelativeLayout relativeLayout3 = this.LLILLJJLI;
            if (relativeLayout3 != null) {
                C786410Ut5.Y4(relativeLayout3, 1.0f);
            }
        }
        long jLIZ = C158B.LIZ();
        switch (C159N.LIZ[c159m.ordinal()]) {
            case 1:
                FrameLayout frameLayout = this.LLJJIJIIJIL;
                if (frameLayout != null) {
                    C786410Ut5.LJZ(0, frameLayout);
                }
                LinearLayout linearLayout = this.LLJJ;
                if (linearLayout != null) {
                    C786410Ut5.LJZL(0, linearLayout);
                }
                ConstraintLayout constraintLayout = this.LLIZ;
                if (constraintLayout != null) {
                    C786410Ut5.LL(8, constraintLayout);
                }
                this.LLJLLIL = true;
                C1126540fQC c1126540fQC = this.LLJJIJIL;
                if (c1126540fQC != null) {
                    C786410Ut5.LLJJI(c1126540fQC, 8);
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("eggtask_reward_start, left_time = ");
                sbLIZ2.append(j);
                C20441214yg.LJIIIZ("BattleTaskContainer", C2188811AlT.LIZIZ(sbLIZ2));
                C16F5 c16f5 = this.LLJJIII;
                if (c16f5 != null) {
                    C15FV c15fv8 = this.LLJJJJLIIL;
                    if (c15fv8 == null) {
                        c15fv4 = null;
                    } else {
                        c15fv4 = c15fv8;
                    }
                    long j2 = c15fv4.LLJLIL;
                    if (c15fv8 == null) {
                        c15fv8 = null;
                    }
                    LJIJ(j - (j2 - c15fv8.LLJLILLLLZIIL), c16f5);
                    JSONObject jSONObject = C975320bUI.LIZ;
                    C15FV c15fv9 = this.LLJJJJLIIL;
                    if (c15fv9 == null) {
                        c15fv5 = null;
                    } else {
                        c15fv5 = c15fv9;
                    }
                    long j3 = c15fv5.LLJLIL;
                    if (c15fv9 == null) {
                        c15fv9 = null;
                    }
                    C975320bUI.LIZ.putOpt("msc_buff_remain_seconds", Long.valueOf(j - (j3 - c15fv9.LLJLILLLLZIIL)));
                }
                C427330GpH c427330GpH = this.LLILZLL;
                if (c427330GpH != null) {
                    c427330GpH.LJJJJIZL();
                }
                C500260Jjc.LJIILIIL(this.LLILLL);
                FrameLayout frameLayout2 = this.LLJJIJIIJIL;
                if (frameLayout2 != null) {
                    C786410Ut5.O7(frameLayout2, new ACListenerS165S0100000_31(this, 21));
                }
                if (!this.LLJJJJ) {
                    this.LLJJJJ = true;
                    LinearLayout linearLayout2 = this.LLJJ;
                    LJFF(linearLayout2, linearLayout2, new AwS575S0100000_31(this, 139));
                    if (!this.LLJL) {
                        C15FV c15fv10 = this.LLJJJJLIIL;
                        if (c15fv10 == null) {
                            c15fv2 = null;
                        } else {
                            c15fv2 = c15fv10;
                        }
                        String str2 = c15fv2.LLJJJIL;
                        if (c15fv10 == null) {
                            c15fv3 = null;
                        } else {
                            c15fv3 = c15fv10;
                        }
                        int i4 = c15fv3.LLJJJJ;
                        if (c15fv10 == null) {
                            c15fv10 = null;
                        }
                        C925640aCA.LJIILJJIL(i4, str2, c15fv10.LJI());
                    }
                    C978500bZQ.LIZIZ("match_color_eggs_reward_start");
                    JSONObject jSONObject2 = C975320bUI.LIZ;
                    boolean z5 = this.LLJL;
                    C15FV c15fv11 = this.LLJJJJLIIL;
                    if (c15fv11 == null) {
                        c15fv = null;
                    } else {
                        c15fv = c15fv11;
                    }
                    String str3 = c15fv.LLJJJIL;
                    if (c15fv11 == null) {
                        c15fv11 = null;
                    }
                    long j4 = c15fv11.LLJLILLLLZIIL;
                    JSONObject jSONObject3 = new JSONObject();
                    C975320bUI.LJIIJJI(str3, j, jSONObject3);
                    if (z5) {
                        C975320bUI.LJIILL("reward_start", jSONObject3);
                    } else {
                        C975320bUI.LJIILLIIL("reward_start", jSONObject3);
                    }
                    C975320bUI.LIZ.put("msc_buff_remain_seconds", j4);
                    C973660bRc c973660bRc = C973660bRc.LIZ;
                    if (getTranslationY() == 0.0f) {
                        z2 = true;
                        z = true;
                    } else {
                        z = false;
                        z2 = true;
                    }
                    c973660bRc.LJLJJL(2, z2 ^ z, this.LLJLIL);
                }
                EnumC20488515Fb enumC20488515Fb = EnumC20488515Fb.REWARD;
                C20488615Fc.LIZ(enumC20488515Fb, jLIZ, this.LLJL);
                C20488615Fc.LIZIZ(enumC20488515Fb.getValue(), this.LLJL);
                break;
            case 2:
                C1126540fQC c1126540fQC2 = this.LLJJIJIL;
                if (c1126540fQC2 != null) {
                    if (this.LLJL) {
                        i = 8;
                    } else {
                        i = 0;
                    }
                    C786410Ut5.LLJJI(c1126540fQC2, i);
                }
                this.LLJJL.removeCallbacksAndMessages(null);
                this.LLJJJJ = false;
                AwS77S0100100_31 awS77S0100100_31 = new AwS77S0100100_31(this, j, 1);
                C15FV c15fv12 = this.LLJJJJLIIL;
                if (c15fv12 == null) {
                    c15fv12 = null;
                }
                ImageModel imageModel = c15fv12.LLJJJ;
                if (LiveSpeedChallengeNpeFixSetting.INSTANCE.enable()) {
                    ViewGroup viewGroup2 = this.LLILLL;
                    if (viewGroup2 != null && viewGroup2.getVisibility() != 8) {
                        C427330GpH c427330GpH2 = this.LLILZLL;
                        if (c427330GpH2 != null) {
                            c427330GpH2.LJJJJIZL();
                        }
                        AnimatorSet animatorSet = new AnimatorSet();
                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroup2, (Property<ViewGroup, Float>) View.ALPHA, 1.0f, 0.0f);
                        objectAnimatorOfFloat.setDuration(100L);
                        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(viewGroup2, (Property<ViewGroup, Float>) View.SCALE_Y, 1.0f, 0.0f);
                        objectAnimatorOfFloat2.setDuration(150L);
                        animatorSet.playSequentially(objectAnimatorOfFloat, objectAnimatorOfFloat2);
                        LJIIZILJ(j, imageModel);
                        ConstraintLayout constraintLayout2 = this.LLIZ;
                        if (constraintLayout2 != null) {
                            C786410Ut5.c5(constraintLayout2, 0.0f);
                            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(constraintLayout2, (Property<ConstraintLayout, Float>) View.ALPHA, 0.0f, 1.0f);
                            objectAnimatorOfFloat3.setDuration(150L);
                            objectAnimatorOfFloat3.addListener(new AAListenerS88S0400000_31(this, viewGroup2, constraintLayout2, awS77S0100100_31, 4));
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            animatorSet2.playSequentially(animatorSet, objectAnimatorOfFloat3);
                            animatorSet2.start();
                        } else {
                            awS77S0100100_31.invoke();
                        }
                    } else {
                        awS77S0100100_31.invoke();
                    }
                } else {
                    ViewGroup viewGroup3 = this.LLILLL;
                    if (viewGroup3 != null && viewGroup3.getVisibility() == 8) {
                        awS77S0100100_31.invoke();
                    } else {
                        C427330GpH c427330GpH3 = this.LLILZLL;
                        if (c427330GpH3 != null) {
                            c427330GpH3.LJJJJIZL();
                        }
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.LLILLL, (Property<ViewGroup, Float>) View.ALPHA, 1.0f, 0.0f);
                        objectAnimatorOfFloat4.setDuration(100L);
                        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.LLILLL, (Property<ViewGroup, Float>) View.SCALE_Y, 1.0f, 0.0f);
                        objectAnimatorOfFloat5.setDuration(150L);
                        animatorSet3.playSequentially(objectAnimatorOfFloat4, objectAnimatorOfFloat5);
                        LJIIZILJ(j, imageModel);
                        ConstraintLayout constraintLayout3 = this.LLIZ;
                        if (constraintLayout3 != null) {
                            C786410Ut5.c5(constraintLayout3, 0.0f);
                        }
                        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.LLIZ, (Property<ConstraintLayout, Float>) View.ALPHA, 0.0f, 1.0f);
                        objectAnimatorOfFloat6.setDuration(150L);
                        objectAnimatorOfFloat6.addListener(new AAListenerS277S0200000_31(this, awS77S0100100_31, 6));
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        animatorSet4.playSequentially(animatorSet3, objectAnimatorOfFloat6);
                        animatorSet4.start();
                    }
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("eggtask_task_update, left_time = ");
                sbLIZ3.append(j);
                C20441214yg.LJIIIZ("BattleTaskContainer", C2188811AlT.LIZIZ(sbLIZ3));
                EnumC20488515Fb enumC20488515Fb2 = EnumC20488515Fb.PROGRESS;
                C20488615Fc.LIZ(enumC20488515Fb2, jLIZ, this.LLJL);
                C20488615Fc.LIZIZ(enumC20488515Fb2.getValue(), this.LLJL);
                break;
            case 3:
                ViewGroup viewGroup4 = this.LLILLL;
                if (viewGroup4 != null) {
                    C786410Ut5.LJLZ(0, viewGroup4);
                }
                FrameLayout frameLayout3 = this.LLJJIJIIJIL;
                if (frameLayout3 != null) {
                    C786410Ut5.LJZ(8, frameLayout3);
                }
                ConstraintLayout constraintLayout4 = this.LLIZ;
                if (constraintLayout4 != null) {
                    C786410Ut5.LL(8, constraintLayout4);
                }
                ConstraintLayout constraintLayout5 = this.LLIZLLLIL;
                if (constraintLayout5 != null) {
                    C786410Ut5.LL(8, constraintLayout5);
                }
                this.LLJLLIL = true;
                LinearLayout linearLayout3 = this.LLJJ;
                if (linearLayout3 != null) {
                    C786410Ut5.LJZL(8, linearLayout3);
                }
                this.LLJJJJ = false;
                this.LLJLLL = false;
                ViewGroup viewGroup5 = this.LLILLL;
                if (viewGroup5 != null) {
                    C786410Ut5.K7(viewGroup5, new ACListenerS150S0100000_15(this, 51));
                }
                ValueAnimator valueAnimator = this.LLJJLIIIJLLLLLLLZ;
                if (valueAnimator != null) {
                    boolValueOf = Boolean.valueOf(valueAnimator.isRunning());
                } else {
                    boolValueOf = null;
                }
                if (!C500260Jjc.LJJIJIIJIL(boolValueOf)) {
                    ValueAnimator valueAnimator2 = this.LLJJLIIIJLLLLLLLZ;
                    if (valueAnimator2 != null) {
                        valueAnimator2.removeAllUpdateListeners();
                    }
                    ValueAnimator valueAnimator3 = this.LLJJLIIIJLLLLLLLZ;
                    if (valueAnimator3 != null) {
                        valueAnimator3.end();
                    }
                }
                C15FV c15fv13 = this.LLJJJJLIIL;
                if (c15fv13 == null) {
                    c15fv13 = null;
                }
                final List<PreviewPeriod> list = c15fv13.LLJIJIL;
                if (list.size() != 0 && this.LLILLL != null && this.LLILZ != null) {
                    C15FV c15fv14 = this.LLJJJJLIIL;
                    if (c15fv14 == null) {
                        c15fv14 = null;
                    }
                    long j5 = c15fv14.LLJILJIL - j;
                    if (list.size() > 1) {
                        int size = list.size();
                        i2 = 0;
                        for (int i5 = 0; i5 < size && ((PreviewPeriod) ListProtector.get(list, i5)).duration < j5; i5++) {
                            j5 -= ((PreviewPeriod) ListProtector.get(list, i5)).duration;
                            i2++;
                        }
                    } else {
                        i2 = 0;
                    }
                    if (list.size() > i2 && ((PreviewPeriod) ListProtector.get(list, i2)).icon != null) {
                        C1324720kZq c1324720kZq = this.LLILZIL;
                        if (c1324720kZq != null) {
                            C786410Ut5.LLJJIII(c1324720kZq, 0);
                        }
                        C1819620xS4.LIZ().LJIIIZ(((PreviewPeriod) ListProtector.get(list, i2)).icon).LJJI(this.LLILZIL);
                    } else {
                        C1324720kZq c1324720kZq2 = this.LLILZIL;
                        if (c1324720kZq2 != null) {
                            C786410Ut5.LLJJIII(c1324720kZq2, 8);
                        }
                    }
                    LinearLayout linearLayout4 = this.LLILZ;
                    if (linearLayout4 != null) {
                        C786410Ut5.W4(linearLayout4, 0.0f);
                    }
                    ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.LLILLL, (Property<ViewGroup, Float>) View.SCALE_Y, 0.0f, 1.0f);
                    objectAnimatorOfFloat7.setDuration(150L);
                    ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(this.LLILZ, (Property<LinearLayout, Float>) View.ALPHA, 0.0f, 1.0f);
                    objectAnimatorOfFloat8.setDuration(100L);
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    animatorSet5.playSequentially(objectAnimatorOfFloat7, objectAnimatorOfFloat8);
                    animatorSet5.start();
                    SpannableStringBuilder spannableStringBuilderLIZIZ = C1844920y6s.LIZIZ(((PreviewPeriod) ListProtector.get(list, i2)).promot);
                    final C427330GpH c427330GpH4 = this.LLILZLL;
                    if (c427330GpH4 != null && (viewGroup = this.LLILLL) != null) {
                        c427330GpH4.setText(spannableStringBuilderLIZIZ);
                        viewGroup.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                        int iLJIIZILJ = C497740JfY.LJIIZILJ() - ((int) C497740JfY.LIZIZ(156.0f));
                        int measuredWidth = viewGroup.getMeasuredWidth();
                        if (measuredWidth >= iLJIIZILJ) {
                            iLJIIZILJ = measuredWidth;
                        }
                        if (this.LLJJJ.LJIILIIL) {
                            i3 = -2;
                        } else {
                            i3 = iLJIIZILJ;
                        }
                        C971140bNY.LIZJ(i3, viewGroup);
                        if (this.LLJJJ.LIZ <= iLJIIZILJ) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        c427330GpH4.setText(C1844920y6s.LIZ(c427330GpH4, spannableStringBuilderLIZIZ, z4));
                        LJIILL(iLJIIZILJ, null);
                        this.LLJLL = i2;
                        C973660bRc c973660bRc2 = C973660bRc.LIZ;
                        C15FV c15fv15 = this.LLJJJJLIIL;
                        if (c15fv15 == null) {
                            c15fv15 = null;
                        }
                        String strLIZLLL = c15fv15.LIZLLL();
                        C15FV c15fv16 = this.LLJJJJLIIL;
                        if (c15fv16 == null) {
                            c15fv16 = null;
                        }
                        c973660bRc2.LJJLIL(this.LLJLL + 1, strLIZLLL, c15fv16.LLJJJIL);
                        if (list.size() > 1 && i2 != list.size() - 1) {
                            int size2 = list.size();
                            long j6 = 0;
                            for (int i6 = i2; i6 < size2; i6++) {
                                if (i6 == i2) {
                                    j6 = (((PreviewPeriod) ListProtector.get(list, i2)).duration - j5) * 1000;
                                } else {
                                    j6 += ((PreviewPeriod) ListProtector.get(list, i6)).duration * 1000;
                                }
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append("noticeDuration = ");
                                sbLIZ4.append(j6);
                                sbLIZ4.append(" index = ");
                                sbLIZ4.append(i6);
                                C20441214yg.LIZIZ("BattleTaskContainer", C2188811AlT.LIZIZ(sbLIZ4));
                                final int i7 = i6;
                                C786410Ut5.LJLIIL(j6, this.LLJJL, new Runnable() { // from class: X.15FY
                                    public final void LIZ() {
                                        if (!this.LL.LL || i7 + 1 >= list.size()) {
                                            return;
                                        }
                                        C971140bNY.LIZJ(-2, viewGroup);
                                        C15FX c15fx = this.LL;
                                        C20489215Fi c20489215Fi = new C20489215Fi(((PreviewPeriod) ListProtector.get(list, i7 + 1)).promot, null, ((PreviewPeriod) ListProtector.get(list, i7 + 1)).icon);
                                        C15FX c15fx2 = this.LL;
                                        C15FX.LJIILIIL(c15fx, c20489215Fi, new C20489115Fh(c15fx2.LLILZIL, c427330GpH4, c15fx2.LLILZ, viewGroup));
                                        C973660bRc c973660bRc3 = C973660bRc.LIZ;
                                        C15FV c15fv17 = this.LL.LLJJJJLIIL;
                                        if (c15fv17 == null) {
                                            c15fv17 = null;
                                        }
                                        String strLIZLLL2 = c15fv17.LIZLLL();
                                        C15FV c15fv18 = this.LL.LLJJJJLIIL;
                                        c973660bRc3.LJJLIL(i7 + 2, strLIZLLL2, (c15fv18 != null ? c15fv18 : null).LLJJJIL);
                                        this.LL.LLJLL = i7 + 1;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean zLIZ;
                                        C1C7U.LIZ("MatchBonusTaskContainer@a606.noticeAppearAnimation$2$1$1");
                                        try {
                                            LIZ();
                                        } finally {
                                            if (!zLIZ) {
                                            }
                                        }
                                        C1C7U.LIZIZ("MatchBonusTaskContainer@a606.noticeAppearAnimation$2$1$1");
                                    }
                                });
                            }
                        }
                    }
                }
                JSONObject jSONObject4 = C975320bUI.LIZ;
                boolean z6 = this.LLJL;
                C15FV c15fv17 = this.LLJJJJLIIL;
                if (c15fv17 == null) {
                    c15fv17 = null;
                }
                String str4 = c15fv17.LLJJJIL;
                JSONObject jSONObject5 = new JSONObject();
                C975320bUI.LJIIJJI(str4, j, jSONObject5);
                if (z6) {
                    C975320bUI.LJIILL("task_preview", jSONObject5);
                } else {
                    C975320bUI.LJIILLIIL("task_preview", jSONObject5);
                }
                C978500bZQ.LIZIZ("match_color_eggs_guide");
                C973660bRc c973660bRc3 = C973660bRc.LIZ;
                if (getTranslationY() == 0.0f) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                c973660bRc3.LJLJJL(0, !z3, this.LLJLIL);
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("eggtask_preview, left_time = ");
                sbLIZ5.append(j);
                C20441214yg.LJIIIZ("BattleTaskContainer", C2188811AlT.LIZIZ(sbLIZ5));
                EnumC20488515Fb enumC20488515Fb3 = EnumC20488515Fb.PREVIEW;
                C20488615Fc.LIZ(enumC20488515Fb3, jLIZ, this.LLJL);
                C20488615Fc.LIZIZ(enumC20488515Fb3.getValue(), this.LLJL);
                break;
            case 4:
                C20441214yg.LIZIZ("BattleTaskContainer", "state disabled");
                RelativeLayout relativeLayout4 = this.LLILLJJLI;
                if (relativeLayout4 != null && relativeLayout4.getVisibility() == 0) {
                    if (LiveMatchBonusTaskContainerFixedSettings.INSTANCE.isEnable() && (dataChannel = this.LLJJJJJIL) != null) {
                        dataChannel.zW(BattleBonusTaskShowChannel.class, Boolean.FALSE);
                    }
                    ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(this.LLILLJJLI, (Property<RelativeLayout, Float>) View.ALPHA, 1.0f, 0.0f);
                    objectAnimatorOfFloat9.setDuration(200L);
                    objectAnimatorOfFloat9.addListener(new AAListenerS341S0100000_31(this, 2));
                    C786410Ut5.Pd(objectAnimatorOfFloat9);
                }
                break;
            case 5:
                FrameLayout frameLayout4 = this.LLJJIJIIJIL;
                if (frameLayout4 != null) {
                    C786410Ut5.LJZ(0, frameLayout4);
                }
                LinearLayout linearLayout5 = this.LLJJ;
                if (linearLayout5 != null) {
                    C786410Ut5.LJZL(0, linearLayout5);
                }
                C16F5 c16f52 = this.LLJJIII;
                if (c16f52 != null) {
                    C786410Ut5.LLJJJJ(c16f52, 8);
                }
                View view = this.LLJJIJI;
                if (view != null) {
                    C786410Ut5.LJLLLLLL(8, view);
                }
                setBonusResultBg(EnumC20488815Fe.TASK_FAILED);
                CardView cardView = this.LLJILJILJ;
                if (cardView != null) {
                    C786410Ut5.LLILLL(cardView, 8);
                }
                ValueAnimator valueAnimator4 = this.LLJJLIIIJLLLLLLLZ;
                if (valueAnimator4 != null) {
                    valueAnimator4.removeAllUpdateListeners();
                }
                ValueAnimator valueAnimator5 = this.LLJJLIIIJLLLLLLLZ;
                if (valueAnimator5 != null) {
                    valueAnimator5.end();
                }
                this.LLJLLL = false;
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("eggtask_settle, left_time = ");
                sbLIZ6.append(j);
                sbLIZ6.append(" , task failed");
                C20441214yg.LJIIIZ("BattleTaskContainer", C2188811AlT.LIZIZ(sbLIZ6));
                LJFF(this.LLIZ, this.LLJJ, new AwS575S0100000_31(this, 137));
                LinearLayout linearLayout6 = this.LLJJ;
                if (linearLayout6 != null) {
                    HandlerHook.viewPostDelay(linearLayout6, new ARunnableS26S0100100_31(this, j, 0), 3000L);
                }
                EnumC20488515Fb enumC20488515Fb4 = EnumC20488515Fb.PROGRESS_RESULT;
                C20488615Fc.LIZ(enumC20488515Fb4, jLIZ, this.LLJL);
                C20488615Fc.LIZIZ(enumC20488515Fb4.getValue(), this.LLJL);
                break;
            case 6:
                FrameLayout frameLayout5 = this.LLJJIJIIJIL;
                if (frameLayout5 != null) {
                    C786410Ut5.LJZ(0, frameLayout5);
                }
                LinearLayout linearLayout7 = this.LLJJ;
                if (linearLayout7 != null) {
                    C786410Ut5.LJZL(0, linearLayout7);
                }
                C16F5 c16f53 = this.LLJJIII;
                if (c16f53 != null) {
                    C786410Ut5.LLJJJJ(c16f53, 8);
                }
                View view2 = this.LLJJIJI;
                if (view2 != null) {
                    C786410Ut5.LJLLLLLL(8, view2);
                }
                this.LLJJJJ = false;
                this.LLJLLL = false;
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append("eggtask_task_settle, left_time = ");
                sbLIZ7.append(j);
                sbLIZ7.append(" ,task succeed");
                C20441214yg.LJIIIZ("BattleTaskContainer", C2188811AlT.LIZIZ(sbLIZ7));
                setBonusResultBg(EnumC20488815Fe.BONUS_CAPSULE);
                LJFF(this.LLIZ, this.LLJJ, new AwS575S0100000_31(this, 138));
                LJIIIIZZ();
                LinearLayout linearLayout8 = this.LLJJ;
                if (linearLayout8 != null) {
                    HandlerHook.viewPostDelay(linearLayout8, new ARunnableS131S0100000_31(this, 16), 3000L);
                }
                C15FV c15fv18 = this.LLJJJJLIIL;
                if (c15fv18 == null) {
                    c15fv18 = null;
                }
                if (!c15fv18.LJI()) {
                    JSONObject jSONObject6 = C975320bUI.LIZ;
                    C15FV c15fv19 = this.LLJJJJLIIL;
                    if (c15fv19 == null) {
                        c15fv19 = null;
                    }
                    C975320bUI.LIZ.putOpt("pk_msc_task_progress", Long.valueOf(c15fv19.LLJJIII));
                }
                EnumC20488515Fb enumC20488515Fb5 = EnumC20488515Fb.PROGRESS_RESULT;
                C20488615Fc.LIZ(enumC20488515Fb5, jLIZ, this.LLJL);
                C20488615Fc.LIZIZ(enumC20488515Fb5.getValue(), this.LLJL);
                break;
            case 7:
                FrameLayout frameLayout6 = this.LLJJIJIIJIL;
                if (frameLayout6 != null) {
                    C786410Ut5.LJZ(0, frameLayout6);
                }
                LinearLayout linearLayout9 = this.LLJJ;
                if (linearLayout9 != null) {
                    C786410Ut5.LJZL(0, linearLayout9);
                }
                ConstraintLayout constraintLayout6 = this.LLIZLLLIL;
                if (constraintLayout6 != null) {
                    C786410Ut5.LL(8, constraintLayout6);
                }
                C427330GpH c427330GpH5 = this.LLILZLL;
                if (c427330GpH5 != null) {
                    c427330GpH5.LJJJJIZL();
                }
                C500260Jjc.LJIILIIL(this.LLILLL);
                this.LLJLLIL = true;
                this.LLJJJJ = false;
                this.LLJLLL = false;
                ValueAnimator valueAnimator6 = this.LLJJLIIIJLLLLLLLZ;
                if (valueAnimator6 != null) {
                    valueAnimator6.removeAllUpdateListeners();
                }
                ValueAnimator valueAnimator7 = this.LLJJLIIIJLLLLLLLZ;
                if (valueAnimator7 != null) {
                    valueAnimator7.end();
                }
                CardView cardView2 = this.LLJILJILJ;
                if (cardView2 != null) {
                    C786410Ut5.LLILLL(cardView2, 8);
                }
                C16FV c16fv = this.LLJILLL;
                if (c16fv != null) {
                    C786410Ut5.LLJJJJJIL(c16fv, 8);
                }
                FrameLayout frameLayout7 = this.LLJJIJIIJIL;
                if (frameLayout7 != null) {
                    C786410Ut5.O7(frameLayout7, new View.OnClickListener() { // from class: X.15Fj
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                        }
                    });
                }
                C427330GpH c427330GpH6 = this.LLJJI;
                if (c427330GpH6 != null) {
                    C971140bNY.LIZJ(-2, c427330GpH6);
                }
                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                sbLIZ8.append("eggtask_reward_settle, left_time = ");
                sbLIZ8.append(j);
                C20441214yg.LJIIIZ("BattleTaskContainer", C2188811AlT.LIZIZ(sbLIZ8));
                LinearLayout linearLayout10 = this.LLJJ;
                LJFF(linearLayout10, linearLayout10, new AwS77S0100100_31(this, j, 0));
                InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
                if (interfaceC973730bRjYf2 != null && interfaceC973730bRjYf2.LIZ()) {
                    str = "cut_short";
                } else {
                    str = "normal";
                }
                LJIILJJIL(str);
                C978500bZQ.LIZIZ("match_in_progress");
                JSONObject jSONObject7 = C975320bUI.LIZ;
                boolean z7 = this.LLJL;
                C15FV c15fv20 = this.LLJJJJLIIL;
                if (c15fv20 == null) {
                    c15fv20 = null;
                }
                String str5 = c15fv20.LLJJJIL;
                JSONObject jSONObject8 = new JSONObject();
                C975320bUI.LJIIJJI(str5, j, jSONObject8);
                if (z7) {
                    C975320bUI.LJIILL("task_over", jSONObject8);
                } else {
                    C975320bUI.LJIILLIIL("task_over", jSONObject8);
                }
                EnumC20488515Fb enumC20488515Fb6 = EnumC20488515Fb.REWARD_RESULT;
                C20488615Fc.LIZ(enumC20488515Fb6, jLIZ, this.LLJL);
                C20488615Fc.LIZIZ(enumC20488515Fb6.getValue(), this.LLJL);
                break;
            default:
                throw new C1954807lC();
        }
        if (c159m != C159M.DISABLED) {
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            C15FV c15fv21 = this.LLJJJJLIIL;
            if (c15fv21 == null) {
                c15fv6 = null;
            } else {
                c15fv6 = c15fv21;
            }
            int i8 = c15fv6.LLJJJJ;
            if (c15fv21 == null) {
                c15fv7 = null;
            } else {
                c15fv7 = c15fv21;
            }
            String str6 = c15fv7.LLJJJIL;
            if (c15fv21 == null) {
                c15fv21 = null;
            }
            dataChannelGlobal.JQ2(C1148330fzL.class, new C1128480fTK(i8, str6, c15fv21.LIZLLL()));
            return;
        }
        DataChannelGlobal.LLILZ.JQ2(C1148330fzL.class, null);
    }

    public final void LJIILL(int i, View view) {
        if (view == null) {
            DataChannel dataChannel = this.LLJJJJJIL;
            if (dataChannel != null) {
                dataChannel.LC0(BattleBonusContainerChangeEvent.class, Integer.valueOf(i));
                return;
            }
            return;
        }
        if (view.getMeasuredWidth() == 0) {
            HandlerHook.viewPost(view, new ARunnableS86S0200000_17(this, view, 93));
            return;
        }
        DataChannel dataChannel2 = this.LLJJJJJIL;
        if (dataChannel2 == null) {
            return;
        }
        dataChannel2.LC0(BattleBonusContainerChangeEvent.class, Integer.valueOf(view.getMeasuredWidth()));
    }

    public final void LJIIZILJ(long j, ImageModel imageModel) {
        C15FV c15fv;
        C15FV c15fv2;
        int i;
        FrameLayout frameLayout = this.LLJJIJIIJIL;
        if (frameLayout != null) {
            C786410Ut5.LJZ(0, frameLayout);
        }
        ConstraintLayout constraintLayout = this.LLIZ;
        if (constraintLayout != null) {
            C786410Ut5.LL(0, constraintLayout);
        }
        ConstraintLayout constraintLayout2 = this.LLIZLLLIL;
        if (constraintLayout2 != null) {
            C786410Ut5.LL(0, constraintLayout2);
        }
        ProgressBar progressBar = this.LLJIJIL;
        C15FV c15fv3 = null;
        if (progressBar != null) {
            C15FV c15fv4 = this.LLJJJJLIIL;
            if (c15fv4 == null) {
                c15fv2 = null;
            } else {
                c15fv2 = c15fv4;
            }
            if (c15fv2.LLJJIII > 0) {
                if (c15fv4 == null) {
                    c15fv4 = null;
                }
                i = ((int) c15fv4.LLJJIII) * 10;
            } else {
                i = 100;
            }
            progressBar.setMax(i);
        }
        LJIJI();
        C16F5 c16f5 = this.LLJILJIL;
        if (c16f5 != null) {
            C15FV c15fv5 = this.LLJJJJLIIL;
            if (c15fv5 == null) {
                c15fv = null;
            } else {
                c15fv = c15fv5;
            }
            long j2 = c15fv.LLJILLL;
            if (c15fv5 != null) {
                c15fv3 = c15fv5;
            }
            LJIJ(j - (j2 - c15fv3.LLJJ), c16f5);
            if (this.LLJLLIL) {
                this.LLJLLIL = false;
                if (imageModel != null) {
                    C1324720kZq c1324720kZq = this.LLJ;
                    if (c1324720kZq != null) {
                        C786410Ut5.LLJJIII(c1324720kZq, 0);
                    }
                    C1819620xS4.LIZ().LJIIIZ(imageModel).LJJI(this.LLJ);
                    return;
                }
                C1324720kZq c1324720kZq2 = this.LLJ;
                if (c1324720kZq2 == null) {
                    return;
                }
                C786410Ut5.LLJJIII(c1324720kZq2, 8);
            }
        }
    }

    public final void LJIJ(long j, C16F5 c16f5) {
        if (j >= 0) {
            c16f5.setText(C497740JfY.LJIJJ(2131853291, Long.valueOf(j)));
            return;
        }
        c16f5.setText(C497740JfY.LJIJJ(2131853291, CardStruct.IStatusCode.DEFAULT));
        if (j >= -2 || this.LLJL) {
            return;
        }
        LJIILJJIL("msg_timeout");
        C15FV c15fv = this.LLJJJJLIIL;
        if (c15fv == null) {
            c15fv = null;
        }
        c15fv.LJIIIIZZ();
        C15FU c15fu = c15fv.LLILZ;
        if (c15fu == null) {
            return;
        }
        c15fu.LIZJ(c15fv.LLJ, c15fv.LLJI);
    }

    public static JSONObject LJ(C15FR c15fr, int i, String str) throws JSONException {
        long jLIZ = C158B.LIZ();
        JSONObject jSONObject = new JSONObject();
        c15fr.getClass();
        C975320bUI.LJIIJ(jSONObject, null, 0, 464);
        jSONObject.putOpt("distinct_key", C15FR.LIZ());
        jSONObject.putOpt("show", Integer.valueOf(i));
        long j = 0;
        jSONObject.putOpt("gift_id", 0L);
        jSONObject.putOpt("progress_before", 0L);
        jSONObject.putOpt("progress_after", Long.valueOf(c15fr.LIZ));
        jSONObject.putOpt("send_success_pk_remain_time", 0L);
        jSONObject.putOpt("send_success_task_progress_remain_time", 0L);
        jSONObject.putOpt("send_success_timestamp", 0L);
        long j2 = c15fr.LIZIZ;
        if (j2 > 0) {
            jSONObject.putOpt("receive_im_timestamp", Long.valueOf(j2));
        }
        long j3 = jLIZ - 0;
        if (j3 < 0) {
            j3 = 0;
        }
        jSONObject.putOpt("send_to_now_cost", Long.valueOf(j3));
        if (i == 1) {
            jSONObject.putOpt("update_ui_timestamp", Long.valueOf(c15fr.LIZLLL));
            long j4 = c15fr.LJ - 0;
            if (j4 >= 0) {
                j = j4;
            }
            jSONObject.putOpt("send_to_update_cost", Long.valueOf(j));
        } else if (str != null && str.length() != 0) {
            jSONObject.putOpt("unshow_reason", str);
            return jSONObject;
        }
        return jSONObject;
    }

    public static void LJIILIIL(final C15FX c15fx, C20489215Fi c20489215Fi, final C20489115Fh c20489115Fh) {
        SpannableStringBuilder spannableStringBuilder;
        float measuredWidth;
        int measuredWidth2;
        boolean z;
        int iMeasureText;
        Number numberValueOf;
        int iIntValue;
        float f;
        int iLIZIZ;
        TextPaint paint;
        CharSequence text;
        C1324720kZq c1324720kZq;
        if (c15fx.LL) {
            if ((c20489215Fi.LIZ == null && TextUtils.isEmpty(c20489215Fi.LIZIZ)) || c20489115Fh.LIZJ == null || c20489115Fh.LIZLLL == null || c20489115Fh.LIZIZ == null) {
                return;
            }
            BattlePrompt battlePrompt = c20489215Fi.LIZ;
            if (battlePrompt != null) {
                spannableStringBuilder = C1844920y6s.LIZIZ(battlePrompt);
            } else {
                spannableStringBuilder = new SpannableStringBuilder(c20489215Fi.LIZIZ);
            }
            if (Intrinsics.LJFF(c20489115Fh.LIZIZ.getText().toString(), spannableStringBuilder.toString())) {
                return;
            }
            final C118300cf c118300cf = new C118300cf();
            c118300cf.element = c15fx.LLJJJ.LIZ;
            float fLIZIZ = ((int) C497740JfY.LIZIZ(100.0f)) * 1.0f;
            if (c20489115Fh.LIZLLL.getMeasuredWidth() == 0) {
                measuredWidth = fLIZIZ;
            } else {
                measuredWidth = c20489115Fh.LIZLLL.getMeasuredWidth() * 1.0f;
            }
            c20489115Fh.LIZIZ.setText(spannableStringBuilder);
            if (c20489215Fi.LIZJ != null && (c1324720kZq = c20489115Fh.LIZ) != null) {
                C786410Ut5.LLJJIII(c1324720kZq, 0);
                c118300cf.element -= C439101nJ.LIZ(20);
                C1819620xS4.LIZ().LJIIIZ(c20489215Fi.LIZJ).LJJI(c20489115Fh.LIZ);
            } else {
                C1324720kZq c1324720kZq2 = c20489115Fh.LIZ;
                if (c1324720kZq2 != null) {
                    C786410Ut5.LLJJIII(c1324720kZq2, 8);
                }
            }
            c20489115Fh.LIZLLL.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            if (Intrinsics.LJFF(c20489115Fh.LIZLLL, c15fx.LLILLL)) {
                measuredWidth2 = C497740JfY.LJIIZILJ() - ((int) C497740JfY.LIZIZ(156.0f));
                if (c15fx.LLJJJ.LJIILIIL) {
                    measuredWidth2 = c20489115Fh.LIZLLL.getMeasuredWidth();
                }
            } else {
                measuredWidth2 = c20489115Fh.LIZLLL.getMeasuredWidth();
            }
            if (c118300cf.element <= measuredWidth2) {
                z = true;
            } else {
                z = false;
            }
            if (c20489115Fh.LIZIZ.getText().length() == 0) {
                C427330GpH c427330GpH = c20489115Fh.LIZIZ;
                c427330GpH.setText(C1844920y6s.LIZ(c427330GpH, spannableStringBuilder, z));
                c15fx.LJIILL(0, c20489115Fh.LIZLLL);
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("need = ");
            sbLIZ.append(z);
            sbLIZ.append(" ,max = ");
            sbLIZ.append(c118300cf.element);
            sbLIZ.append(" expect = ");
            sbLIZ.append(measuredWidth2);
            sbLIZ.append(", min = ");
            sbLIZ.append(fLIZIZ);
            C20441214yg.LJ("TaskText", C2188811AlT.LIZIZ(sbLIZ));
            TextPaint paint2 = c20489115Fh.LIZIZ.getPaint();
            if (paint2 != null) {
                iMeasureText = (int) paint2.measureText(spannableStringBuilder.toString());
            } else {
                iMeasureText = 0;
            }
            C15FV c15fv = c15fx.LLJJJJLIIL;
            String string = null;
            if (c15fv == null) {
                c15fv = null;
            }
            if (c15fv.LJI() && measuredWidth2 > C497740JfY.LJIIZILJ() - ((int) C497740JfY.LIZIZ(24.0f))) {
                C15FV c15fv2 = c15fx.LLJJJJLIIL;
                if (c15fv2 == null) {
                    c15fv2 = null;
                }
                if (c15fv2.LLJI == C159M.BONUS_IN_PROCESS) {
                    C16F5 c16f5 = c15fx.LLJJIII;
                    if (c16f5 != null && (paint = c16f5.getPaint()) != null) {
                        C16F5 c16f52 = c15fx.LLJJIII;
                        if (c16f52 != null && (text = c16f52.getText()) != null) {
                            string = text.toString();
                        }
                        iLIZIZ = (int) paint.measureText(string);
                        f = 44.0f;
                    } else {
                        f = 44.0f;
                        iLIZIZ = (int) C497740JfY.LIZIZ(44.0f);
                    }
                    if (iLIZIZ < ((int) C497740JfY.LIZIZ(f))) {
                        iLIZIZ = (int) C497740JfY.LIZIZ(f);
                    }
                    int iLJIIZILJ = (C497740JfY.LJIIZILJ() - ((int) C497740JfY.LIZIZ(f))) - iLIZIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("marquee text width = ");
                    sbLIZ2.append(iLJIIZILJ);
                    sbLIZ2.append(" ,contentWidth = ");
                    sbLIZ2.append(iMeasureText);
                    C20441214yg.LJ("TaskText", C2188811AlT.LIZIZ(sbLIZ2));
                    if (iMeasureText != 0 && iMeasureText >= iLJIIZILJ) {
                        C971140bNY.LIZJ(iLJIIZILJ, c20489115Fh.LIZIZ);
                    }
                    C16F5 c16f53 = c15fx.LLJJIII;
                    if (c16f53 != null) {
                        C971140bNY.LIZJ(iLIZIZ, c16f53);
                    }
                }
            }
            if (measuredWidth2 < fLIZIZ) {
                numberValueOf = Float.valueOf(fLIZIZ);
            } else {
                numberValueOf = Integer.valueOf(measuredWidth2);
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("need = ");
            sbLIZ3.append(z);
            sbLIZ3.append(" ,max = ");
            sbLIZ3.append(c118300cf.element);
            sbLIZ3.append(" expect = ");
            sbLIZ3.append(measuredWidth2);
            sbLIZ3.append(", min = ");
            sbLIZ3.append(fLIZIZ);
            sbLIZ3.append(" ,after = ");
            sbLIZ3.append(numberValueOf);
            sbLIZ3.append(" ,before = ");
            sbLIZ3.append(measuredWidth);
            C20441214yg.LJ("TaskText", C2188811AlT.LIZIZ(sbLIZ3));
            int[] iArr = new int[2];
            iArr[0] = (int) measuredWidth;
            if (!z) {
                iIntValue = numberValueOf.intValue();
            } else {
                iIntValue = c118300cf.element;
            }
            iArr[1] = iIntValue;
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iArr);
            valueAnimatorOfInt.setDuration(150L);
            valueAnimatorOfInt.addUpdateListener(new AUListenerS233S0200000_31(c15fx, c20489115Fh, 4));
            final int i = measuredWidth2;
            final SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
            final boolean z2 = z;
            valueAnimatorOfInt.addListener(new Animator.AnimatorListener() { // from class: X.15Fa
                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    if (this.LL.LL) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("do onend, ,");
                        sbLIZ4.append(z2);
                        C20441214yg.LJ("TaskText", C2188811AlT.LIZIZ(sbLIZ4));
                        C427330GpH c427330GpH2 = c20489115Fh.LIZIZ;
                        c427330GpH2.setText(C1844920y6s.LIZ(c427330GpH2, spannableStringBuilder2, z2));
                        C15FX c15fx2 = this.LL;
                        ViewGroup viewGroup = c20489115Fh.LIZLLL;
                        c15fx2.getClass();
                        viewGroup.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if (this.LL.LL) {
                            ViewGroup viewGroup2 = c20489115Fh.LIZLLL;
                            int measuredWidth3 = viewGroup2.getMeasuredWidth();
                            int i2 = c118300cf.element;
                            if (measuredWidth3 > i2) {
                                measuredWidth3 = i2;
                            }
                            C971140bNY.LIZJ(measuredWidth3, viewGroup2);
                        }
                        this.LL.LJIILL(i, null);
                    }
                }
            });
            C786410Ut5.T4(c20489115Fh.LIZJ, 0.0f);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c20489115Fh.LIZJ, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
            objectAnimatorOfFloat.setDuration(150L);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(valueAnimatorOfInt, objectAnimatorOfFloat);
            animatorSet.start();
        }
    }

    public final void LJFF(ViewGroup viewGroup, ViewGroup viewGroup2, Function0<Unit> function0) {
        if (!this.LL || viewGroup == null || viewGroup2 == null) {
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(150L);
        objectAnimatorOfFloat.addListener(new AAListenerS88S0400000_31(this, function0, viewGroup, viewGroup2, 0));
        if (!Intrinsics.LJFF(viewGroup, viewGroup2)) {
            C786410Ut5.R4(0.0f, viewGroup2);
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(viewGroup2, (Property<ViewGroup, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(150L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.start();
    }
}
