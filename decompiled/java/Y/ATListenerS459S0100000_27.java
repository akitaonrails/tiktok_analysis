package Y;

import X.C0WZX;
import X.C13LC;
import X.C1807490x8V;
import X.C1854760yMk;
import X.C1856230yP7;
import X.C1857200yQg;
import X.C1862330yYx;
import X.C1863850ybP;
import X.C1864200yby;
import X.C2204961BRm;
import X.C376400EpK;
import X.EnumC1863020ya4;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.feed.drawerfeed.search.LiveSearchResultFragment;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.LiveReplayVideoPlayerDialogFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.inner.InputInnerAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.answer.image.TakoNewImageAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.answer.image.list.TakoAnswerImageListItemAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.questionnaire.second.TakoSecondLevelQuestionnaireInputItemCell;
import com.ss.android.ugc.aweme.tako.botpage.components.video.videogeneration.TakoVideoGenerationCoverAssem;
import com.ss.android.ugc.aweme.tako.multiconversation.sug.TakoMiddlePageSugAssem;
import com.ss.android.ugc.aweme.tako.otherpage.entitysug.TakoEntityInfoSheetFragment;
import com.ss.android.ugc.aweme.tako.otherpage.waiting.TakoWaitingListActivity;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes28.dex */
public class ATListenerS459S0100000_27 implements View.OnTouchListener {
    public final int $t;
    public Object l0;

    public static final /* synthetic */ boolean onTouch$14(ATListenerS459S0100000_27 aTListenerS459S0100000_27, View view, MotionEvent motionEvent) {
        return ((Boolean) ((Function2) aTListenerS459S0100000_27.l0).invoke(view, motionEvent)).booleanValue();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$t) {
            case 0:
                return onTouch$0(this, view, motionEvent);
            case 1:
                return onTouch$1(this, view, motionEvent);
            case 2:
                return onTouch$2(this, view, motionEvent);
            case 3:
                return onTouch$3(this, view, motionEvent);
            case 4:
                return onTouch$4(this, view, motionEvent);
            case 5:
                return onTouch$5(this, view, motionEvent);
            case 6:
                return onTouch$6(this, view, motionEvent);
            case 7:
                return onTouch$7(this, view, motionEvent);
            case 8:
                return onTouch$8(this, view, motionEvent);
            case BdTuring.TYPE_ECAF /* 9 */:
                return onTouch$9(this, view, motionEvent);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return onTouch$10(this, view, motionEvent);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return onTouch$11(this, view, motionEvent);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return onTouch$12(this, view, motionEvent);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return onTouch$13(this, view, motionEvent);
            case 14:
                return onTouch$14(this, view, motionEvent);
            case 15:
                return onTouch$15(this, view, motionEvent);
            case 16:
                return onTouch$16(this, view, motionEvent);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return onTouch$17(this, view, motionEvent);
            default:
                return false;
        }
    }

    public ATListenerS459S0100000_27(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onTouch$0(ATListenerS459S0100000_27 aTListenerS459S0100000_27, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            ((TakoNewImageAssem) aTListenerS459S0100000_27.l0).LLLFF = motionEvent.getX();
            ((TakoNewImageAssem) aTListenerS459S0100000_27.l0).LLLFFI = motionEvent.getY();
            return false;
        }
        return false;
    }

    public static final boolean onTouch$1(ATListenerS459S0100000_27 aTListenerS459S0100000_27, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            ((TakoAnswerImageListItemAssem) aTListenerS459S0100000_27.l0).LLLIIIL = motionEvent.getX();
            ((TakoAnswerImageListItemAssem) aTListenerS459S0100000_27.l0).LLLIIL = motionEvent.getY();
            return false;
        }
        return false;
    }

    public static final boolean onTouch$10(ATListenerS459S0100000_27 aTListenerS459S0100000_27, View view, MotionEvent motionEvent) {
        Function1<? super MotionEvent, Unit> function1;
        Function1<? super MotionEvent, Unit> function12;
        Function1<? super MotionEvent, Unit> function13;
        Function0<Unit> function0;
        if (motionEvent.getActionMasked() == 0 && (function0 = ((C1854760yMk) aTListenerS459S0100000_27.l0).LLLFZ.LJII) != null) {
            function0.invoke();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    C1854760yMk c1854760yMk = (C1854760yMk) aTListenerS459S0100000_27.l0;
                    if (c1854760yMk.LLLIIII && (function13 = c1854760yMk.LLLFZ.LJIILJJIL) != null) {
                        function13.invoke(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), 3, motionEvent.getX(), motionEvent.getY(), motionEvent.getPressure(), motionEvent.getSize(), motionEvent.getMetaState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags()));
                    }
                    C1854760yMk c1854760yMk2 = (C1854760yMk) aTListenerS459S0100000_27.l0;
                    c1854760yMk2.LLLII = null;
                    c1854760yMk2.LLLIIII = false;
                } else {
                    C1854760yMk c1854760yMk3 = (C1854760yMk) aTListenerS459S0100000_27.l0;
                    if (c1854760yMk3.LLLIIII && (function12 = c1854760yMk3.LLLFZ.LJIILJJIL) != null) {
                        function12.invoke(motionEvent);
                        return false;
                    }
                }
                return false;
            }
            C1854760yMk c1854760yMk4 = (C1854760yMk) aTListenerS459S0100000_27.l0;
            if (c1854760yMk4.LLLIIII && (function1 = c1854760yMk4.LLLFZ.LJIILJJIL) != null) {
                function1.invoke(motionEvent);
            }
            C1854760yMk c1854760yMk5 = (C1854760yMk) aTListenerS459S0100000_27.l0;
            c1854760yMk5.LLLII = null;
            c1854760yMk5.LLLIIII = false;
            return false;
        }
        ((C1854760yMk) aTListenerS459S0100000_27.l0).LLLII = MotionEvent.obtain(motionEvent.getDownTime(), SystemClock.uptimeMillis(), 0, motionEvent.getX(), motionEvent.getY(), motionEvent.getPressure(), motionEvent.getSize(), motionEvent.getMetaState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags());
        return false;
    }

    public static final boolean onTouch$11(ATListenerS459S0100000_27 aTListenerS459S0100000_27, View view, MotionEvent motionEvent) {
        Function1<? super MotionEvent, Unit> function1;
        Function1<? super MotionEvent, Unit> function12;
        Function1<? super MotionEvent, Unit> function13;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    C1854760yMk c1854760yMk = (C1854760yMk) aTListenerS459S0100000_27.l0;
                    if (c1854760yMk.LLLIIIL && (function13 = c1854760yMk.LLLFZ.LJIILJJIL) != null) {
                        function13.invoke(c1854760yMk.LJIJJLI(motionEvent, 3));
                    }
                    C1854760yMk c1854760yMk2 = (C1854760yMk) aTListenerS459S0100000_27.l0;
                    c1854760yMk2.LLLIIIIL = null;
                    c1854760yMk2.LLLIIIL = false;
                } else {
                    C1854760yMk c1854760yMk3 = (C1854760yMk) aTListenerS459S0100000_27.l0;
                    if (c1854760yMk3.LLLIIIL && (function12 = c1854760yMk3.LLLFZ.LJIILJJIL) != null) {
                        function12.invoke(c1854760yMk3.LJIJJLI(motionEvent, 2));
                        return false;
                    }
                }
                return false;
            }
            C1854760yMk c1854760yMk4 = (C1854760yMk) aTListenerS459S0100000_27.l0;
            if (c1854760yMk4.LLLIIIL && (function1 = c1854760yMk4.LLLFZ.LJIILJJIL) != null) {
                function1.invoke(c1854760yMk4.LJIJJLI(motionEvent, 1));
            }
            C1854760yMk c1854760yMk5 = (C1854760yMk) aTListenerS459S0100000_27.l0;
            c1854760yMk5.LLLIIIIL = null;
            c1854760yMk5.LLLIIIL = false;
            return false;
        }
        C1854760yMk c1854760yMk6 = (C1854760yMk) aTListenerS459S0100000_27.l0;
        c1854760yMk6.LLLIIIIL = c1854760yMk6.LJIJJLI(motionEvent, 0);
        return false;
    }

    public static final boolean onTouch$12(ATListenerS459S0100000_27 aTListenerS459S0100000_27, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            ((C1857200yQg) aTListenerS459S0100000_27.l0).LLJIJIL = motionEvent.getX();
            ((C1857200yQg) aTListenerS459S0100000_27.l0).LLJILJIL = motionEvent.getY();
            return false;
        }
        return false;
    }

    public static final boolean onTouch$13(ATListenerS459S0100000_27 aTListenerS459S0100000_27, View view, MotionEvent motionEvent) {
        C1807490x8V c1807490x8V;
        Function1<RecyclerView.ViewHolder, Unit> function1;
        if (motionEvent.getAction() == 0 && (function1 = (c1807490x8V = (C1807490x8V) aTListenerS459S0100000_27.l0).LLILLL) != null) {
            function1.invoke(c1807490x8V);
            return false;
        }
        return false;
    }

    public static final boolean onTouch$15(ATListenerS459S0100000_27 aTListenerS459S0100000_27, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            ((TakoEntityInfoSheetFragment) aTListenerS459S0100000_27.l0).LLJLIL = motionEvent.getX();
            ((TakoEntityInfoSheetFragment) aTListenerS459S0100000_27.l0).LLJLILLLLZIIL = motionEvent.getY();
            return false;
        }
        return false;
    }

    public static final boolean onTouch$16(ATListenerS459S0100000_27 aTListenerS459S0100000_27, View view, MotionEvent motionEvent) {
        String str;
        String str2;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        String strUN0;
        EnumC1863020ya4 enumC1863020ya4JS1;
        C13LC<C1864200yby> c13lcAp0;
        C1864200yby c1864200yby;
        C13LC<C1864200yby> c13lcAp02;
        C1864200yby c1864200yby2;
        if (motionEvent.getActionMasked() == 0) {
            InputInnerAssem inputInnerAssem = (InputInnerAssem) aTListenerS459S0100000_27.l0;
            inputInnerAssem.LLJLLL = true;
            TakoChatUIAbility takoChatUIAbility = (TakoChatUIAbility) inputInnerAssem.LLLJIL.getValue();
            if (takoChatUIAbility != null && takoChatUIAbility.Ve0()) {
                ITakoContextAbility iTakoContextAbilitySp = inputInnerAssem.sp();
                String mobOnboardingStyle = null;
                if (iTakoContextAbilitySp != null && (c13lcAp02 = iTakoContextAbilitySp.Ap0()) != null && (c1864200yby2 = (C1864200yby) c13lcAp02.LIZIZ()) != null) {
                    str = c1864200yby2.LL;
                } else {
                    str = null;
                }
                String str3 = "";
                if (str == null) {
                    str = "";
                }
                ITakoContextAbility iTakoContextAbilitySp2 = inputInnerAssem.sp();
                if (iTakoContextAbilitySp2 != null && (c13lcAp0 = iTakoContextAbilitySp2.Ap0()) != null && (c1864200yby = (C1864200yby) c13lcAp0.LIZIZ()) != null) {
                    str2 = c1864200yby.LLILLJJLI;
                } else {
                    str2 = null;
                }
                ITakoContextAbility iTakoContextAbilitySp3 = inputInnerAssem.sp();
                if (iTakoContextAbilitySp3 != null && (c13lcT71 = iTakoContextAbilitySp3.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
                    C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                    String str4 = c1863850ybP.LL;
                    if (str4 == null) {
                        str4 = "";
                    }
                    String str5 = c1863850ybP.LLILLJJLI;
                    if (str5 == null) {
                        str5 = "";
                    }
                    String str6 = c1863850ybP.LLILZIL;
                    if (str6 == null) {
                        str6 = "";
                    }
                    TakoChatUIAbility takoChatUIAbility2 = (TakoChatUIAbility) inputInnerAssem.LLLJIL.getValue();
                    if (takoChatUIAbility2 != null) {
                        strUN0 = takoChatUIAbility2.uN0();
                    } else {
                        strUN0 = null;
                    }
                    String str7 = c1863850ybP.LLJ;
                    if (str7 == null) {
                        str7 = "";
                    }
                    if (str2 != null) {
                        str3 = str2;
                    }
                    TakoChatUIAbility takoChatUIAbility3 = (TakoChatUIAbility) inputInnerAssem.LLLJIL.getValue();
                    if (takoChatUIAbility3 != null && (enumC1863020ya4JS1 = takoChatUIAbility3.jS1()) != null) {
                        mobOnboardingStyle = enumC1863020ya4JS1.getMobOnboardingStyle();
                    }
                    C1862330yYx.LJJZ(512, c1862330yYx, str4, str5, str6, str, c1863850ybP.LLIZ, strUN0, str7, str3, "click_input", mobOnboardingStyle);
                }
            }
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1 && actionMasked != 2) {
                ((InputInnerAssem) aTListenerS459S0100000_27.l0).getClass();
            } else if (motionEvent.getActionMasked() == 1) {
                ((InputInnerAssem) aTListenerS459S0100000_27.l0).getClass();
                return false;
            }
            return false;
        }
        InputInnerAssem inputInnerAssem2 = (InputInnerAssem) aTListenerS459S0100000_27.l0;
        MotionEvent.obtain(motionEvent.getDownTime(), SystemClock.uptimeMillis(), 0, motionEvent.getX(), motionEvent.getY(), motionEvent.getPressure(), motionEvent.getSize(), motionEvent.getMetaState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags());
        inputInnerAssem2.getClass();
        return false;
    }

    public static final boolean onTouch$17(ATListenerS459S0100000_27 aTListenerS459S0100000_27, View view, MotionEvent motionEvent) {
        Editable editableLLJILLL;
        if (motionEvent.getAction() == 1) {
            LiveSearchResultFragment liveSearchResultFragment = (LiveSearchResultFragment) aTListenerS459S0100000_27.l0;
            EditText editText = liveSearchResultFragment.LL;
            if (editText != null) {
                editText.setCursorVisible(true);
            }
            EditText editText2 = liveSearchResultFragment.LL;
            String string = null;
            if (editText2 != null && (editableLLJILLL = C2204961BRm.LLJILLL(editText2, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl7S+2DnkbzffxjyqvOq01IYdy3U3sot4Nq0BUPT9XZNE/sSZ7pF27HePL3ouwTvs=", null))) != null) {
                string = editableLLJILLL.toString();
            }
            if (!TextUtils.isEmpty(string)) {
                liveSearchResultFragment.UR(string);
                return false;
            }
            liveSearchResultFragment.RR();
            return false;
        }
        return false;
    }

    public static final boolean onTouch$2(ATListenerS459S0100000_27 aTListenerS459S0100000_27, View view, MotionEvent motionEvent) {
        ViewParent parent;
        if (view.canScrollVertically(1) || view.canScrollVertically(-1)) {
            ViewParent parent2 = ((TakoSecondLevelQuestionnaireInputItemCell) aTListenerS459S0100000_27.l0).itemView.getParent();
            if (parent2 != null) {
                parent2.requestDisallowInterceptTouchEvent(true);
            }
            if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (parent = ((TakoSecondLevelQuestionnaireInputItemCell) aTListenerS459S0100000_27.l0).itemView.getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
        }
        return false;
    }

    public static final boolean onTouch$3(ATListenerS459S0100000_27 aTListenerS459S0100000_27, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            ((C1856230yP7) aTListenerS459S0100000_27.l0).LLILZIL = motionEvent.getX();
            ((C1856230yP7) aTListenerS459S0100000_27.l0).LLILZLL = motionEvent.getY();
            return false;
        }
        return false;
    }

    public static final boolean onTouch$4(ATListenerS459S0100000_27 aTListenerS459S0100000_27, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            ((TakoVideoGenerationCoverAssem) aTListenerS459S0100000_27.l0).LLJLLIL = motionEvent.getX();
            ((TakoVideoGenerationCoverAssem) aTListenerS459S0100000_27.l0).LLJLLL = motionEvent.getY();
            return false;
        }
        return false;
    }

    public static final boolean onTouch$5(ATListenerS459S0100000_27 aTListenerS459S0100000_27, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            ((TakoMiddlePageSugAssem) aTListenerS459S0100000_27.l0).LLLFFI = System.currentTimeMillis() - (SystemClock.uptimeMillis() - motionEvent.getEventTime());
            ((TakoMiddlePageSugAssem) aTListenerS459S0100000_27.l0).LLLFZ++;
            return false;
        }
        return false;
    }

    public static final boolean onTouch$6(ATListenerS459S0100000_27 aTListenerS459S0100000_27, View view, MotionEvent motionEvent) {
        Integer numValueOf;
        if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null && numValueOf.intValue() == 2) {
            ((TakoWaitingListActivity) aTListenerS459S0100000_27.l0).LLJILLL.LIZIZ(null);
            return true;
        }
        return true;
    }

    public static final boolean onTouch$7(ATListenerS459S0100000_27 aTListenerS459S0100000_27, View view, MotionEvent motionEvent) {
        Integer numValueOf;
        if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null && numValueOf.intValue() == 2) {
            ((TakoWaitingListActivity) aTListenerS459S0100000_27.l0).LLJILLL.LIZIZ(null);
            return true;
        }
        return true;
    }

    public static final boolean onTouch$8(ATListenerS459S0100000_27 aTListenerS459S0100000_27, View view, MotionEvent motionEvent) {
        Integer numValueOf;
        if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null && numValueOf.intValue() == 2) {
            ((TakoWaitingListActivity) aTListenerS459S0100000_27.l0).LLJILLL.LIZIZ(null);
            return true;
        }
        return true;
    }

    public static final boolean onTouch$9(ATListenerS459S0100000_27 aTListenerS459S0100000_27, View view, MotionEvent motionEvent) {
        Integer numValueOf;
        C376400EpK c376400EpK;
        if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null && numValueOf.intValue() != 0) {
            if ((numValueOf.intValue() == 1 || numValueOf.intValue() == 3) && (c376400EpK = ((LiveReplayVideoPlayerDialogFragment) aTListenerS459S0100000_27.l0).LLJJI) != null) {
                c376400EpK.performClick();
                return false;
            }
            return false;
        }
        return false;
    }
}
