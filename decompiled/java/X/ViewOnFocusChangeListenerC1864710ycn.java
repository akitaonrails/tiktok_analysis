package X;

import Y.ARunnableS127S0100000_27;
import android.view.View;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.livesdk.chatroom.view.StickerEditFragment;
import com.bytedance.android.livesdk.game.gamelist.GameTopicSearchAssem;
import com.bytedance.android.livesdk.utils.KeyBoardUtil;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.IBottomInputHostAbility;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.inner.InputInnerAssem;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.vm.BottomInputViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS39S0010000_27;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: renamed from: X.0ycn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class ViewOnFocusChangeListenerC1864710ycn implements View.OnFocusChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.$t) {
            case 0:
                onFocusChange$0(this, view, z);
                break;
            case 1:
                onFocusChange$1(this, view, z);
                break;
            case 2:
                onFocusChange$2(this, view, z);
                break;
            case 3:
                onFocusChange$3(this, view, z);
                break;
            case 4:
                onFocusChange$4(this, view, z);
                break;
        }
    }

    public ViewOnFocusChangeListenerC1864710ycn(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onFocusChange$0(ViewOnFocusChangeListenerC1864710ycn viewOnFocusChangeListenerC1864710ycn, View view, boolean z) {
        Function1<Boolean, Unit> function1;
        C1852540yJA c1852540yJA = ((C1852530yJ9) viewOnFocusChangeListenerC1864710ycn.l0).LLIZ;
        if (c1852540yJA != null && (function1 = c1852540yJA.LIZLLL) != null) {
            function1.invoke(Boolean.valueOf(z));
        }
    }

    public static final void onFocusChange$1(ViewOnFocusChangeListenerC1864710ycn viewOnFocusChangeListenerC1864710ycn, View view, boolean z) {
        HandlerHook.viewPostDelay(view, new ARunnableS127S0100000_27((StickerEditFragment) viewOnFocusChangeListenerC1864710ycn.l0, 6), 100L);
        LiveEditText liveEditText = ((StickerEditFragment) viewOnFocusChangeListenerC1864710ycn.l0).LLILLJJLI;
        if (liveEditText != null) {
            liveEditText.setOnFocusChangeListener(null);
        }
    }

    public static final void onFocusChange$2(ViewOnFocusChangeListenerC1864710ycn viewOnFocusChangeListenerC1864710ycn, View view, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("et_search onFocusChanged. hasFocus=");
        sbLIZ.append(z);
        C20441214yg.LJIIIZ("GameCategoryListDialogV2", C2188811AlT.LIZIZ(sbLIZ));
        if (!z) {
            KeyBoardUtil.LIZJ(((GameTopicSearchAssem) viewOnFocusChangeListenerC1864710ycn.l0).Go().getContext(), ((GameTopicSearchAssem) viewOnFocusChangeListenerC1864710ycn.l0).Go());
        }
    }

    public static final void onFocusChange$3(ViewOnFocusChangeListenerC1864710ycn viewOnFocusChangeListenerC1864710ycn, View view, boolean z) {
        Function1<? super Boolean, Unit> function1 = ((C1854760yMk) viewOnFocusChangeListenerC1864710ycn.l0).LLLFZ.LJI;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
    }

    public static final void onFocusChange$4(ViewOnFocusChangeListenerC1864710ycn viewOnFocusChangeListenerC1864710ycn, View view, boolean z) {
        boolean z2;
        String strNV1;
        int i;
        if (z) {
            ((InputInnerAssem) viewOnFocusChangeListenerC1864710ycn.l0).LLJZ = System.currentTimeMillis();
            z2 = !((InputInnerAssem) viewOnFocusChangeListenerC1864710ycn.l0).LLJLLL;
        } else {
            ((InputInnerAssem) viewOnFocusChangeListenerC1864710ycn.l0).LLJLLL = false;
            z2 = false;
        }
        InputInnerAssem inputInnerAssem = (InputInnerAssem) viewOnFocusChangeListenerC1864710ycn.l0;
        inputInnerAssem.getClass();
        if (z) {
            C1862330yYx.LJJJI(C1862330yYx.LIZ, inputInnerAssem.getCommonParams(), z2);
        } else {
            C1854150yLl c1854150yLl = inputInnerAssem.kp().getState().LLILLJJLI;
            if ((c1854150yLl == null || (i = c1854150yLl.LL) == 0 || i == 1) && inputInnerAssem.kp().vQ2() == 0) {
                BottomInputViewModel bottomInputViewModelKp = inputInnerAssem.kp();
                IBottomInputHostAbility iBottomInputHostAbility = (IBottomInputHostAbility) inputInnerAssem.LLLIZZ.getValue();
                if (iBottomInputHostAbility != null) {
                    strNV1 = iBottomInputHostAbility.NV1();
                } else {
                    strNV1 = null;
                }
                bottomInputViewModelKp.zQ2(strNV1);
            }
        }
        BottomInputViewModel bottomInputViewModelKp2 = ((InputInnerAssem) viewOnFocusChangeListenerC1864710ycn.l0).kp();
        if (bottomInputViewModelKp2.getState().LLJJIII != z) {
            bottomInputViewModelKp2.setState(new AwS39S0010000_27(z, 17));
            bottomInputViewModelKp2.withState(new AwS606S0100000_27(bottomInputViewModelKp2, 336));
        }
    }
}
