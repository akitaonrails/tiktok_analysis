package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.tako.botpage.components.sug.TakoSugGridAssem;
import com.ss.android.ugc.aweme.tako.multiconversation.sug.TakoMiddlePageSugAssem;
import com.ss.android.ugc.aweme.tako.multiconversation.sug.TakoMiddlePageSugListCardAssem;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.tako.startup.onboarding.ui.TakoOnboardingAssem;
import com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0yco, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class ViewOnAttachStateChangeListenerC1864720yco implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onViewAttachedToWindow$0(ViewOnAttachStateChangeListenerC1864720yco viewOnAttachStateChangeListenerC1864720yco, View view) {
    }

    public static final void onViewDetachedFromWindow$1(ViewOnAttachStateChangeListenerC1864720yco viewOnAttachStateChangeListenerC1864720yco, View view) {
    }

    public static final void onViewDetachedFromWindow$2(ViewOnAttachStateChangeListenerC1864720yco viewOnAttachStateChangeListenerC1864720yco, View view) {
    }

    public static final void onViewDetachedFromWindow$3(ViewOnAttachStateChangeListenerC1864720yco viewOnAttachStateChangeListenerC1864720yco, View view) {
    }

    public static final void onViewDetachedFromWindow$4(ViewOnAttachStateChangeListenerC1864720yco viewOnAttachStateChangeListenerC1864720yco, View view) {
    }

    public static final void onViewDetachedFromWindow$5(ViewOnAttachStateChangeListenerC1864720yco viewOnAttachStateChangeListenerC1864720yco, View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) throws JSONException {
        switch (this.$t) {
            case 0:
                onViewAttachedToWindow$0(this, view);
                break;
            case 1:
                onViewAttachedToWindow$1(this, view);
                break;
            case 2:
                onViewAttachedToWindow$2(this, view);
                break;
            case 3:
                onViewAttachedToWindow$3(this, view);
                break;
            case 4:
                onViewAttachedToWindow$4(this, view);
                break;
            case 5:
                onViewAttachedToWindow$5(this, view);
                break;
            case 6:
                onViewAttachedToWindow$6(this, view);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewDetachedFromWindow$0(this, view);
                break;
            case 1:
                onViewDetachedFromWindow$1(this, view);
                break;
            case 2:
                onViewDetachedFromWindow$2(this, view);
                break;
            case 3:
                onViewDetachedFromWindow$3(this, view);
                break;
            case 4:
                onViewDetachedFromWindow$4(this, view);
                break;
            case 5:
                onViewDetachedFromWindow$5(this, view);
                break;
            case 6:
                onViewDetachedFromWindow$6(this, view);
                break;
        }
    }

    public static final void onViewAttachedToWindow$1(ViewOnAttachStateChangeListenerC1864720yco viewOnAttachStateChangeListenerC1864720yco, View view) throws JSONException {
        Map<String, String> commonParams;
        ((View) viewOnAttachStateChangeListenerC1864720yco.l0).removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1864720yco);
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        TakoSugGridAssem takoSugGridAssem = (TakoSugGridAssem) viewOnAttachStateChangeListenerC1864720yco.l1;
        Map<String, String> map = takoSugGridAssem.LLJLLIL;
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) takoSugGridAssem.LLJJLIIIJLLLLLLLZ.getValue();
        if (iTakoContextAbility != null) {
            commonParams = iTakoContextAbility.getCommonParams();
        } else {
            commonParams = null;
        }
        c1862330yYx.mobTikbotQuickInteractionShow(map, commonParams);
    }

    public static final void onViewAttachedToWindow$2(ViewOnAttachStateChangeListenerC1864720yco viewOnAttachStateChangeListenerC1864720yco, View view) throws JSONException {
        Map<String, String> commonParams;
        ((View) viewOnAttachStateChangeListenerC1864720yco.l0).removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1864720yco);
        ((TakoMiddlePageSugAssem) viewOnAttachStateChangeListenerC1864720yco.l1).LLLF = System.currentTimeMillis();
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        TakoMiddlePageSugAssem takoMiddlePageSugAssem = (TakoMiddlePageSugAssem) viewOnAttachStateChangeListenerC1864720yco.l1;
        Map<String, String> map = takoMiddlePageSugAssem.LLL;
        ITakoContextAbility iTakoContextAbilityUp = takoMiddlePageSugAssem.up();
        if (iTakoContextAbilityUp != null) {
            commonParams = iTakoContextAbilityUp.getCommonParams();
        } else {
            commonParams = null;
        }
        c1862330yYx.mobTikbotQuickInteractionShow(map, commonParams);
    }

    public static final void onViewAttachedToWindow$3(ViewOnAttachStateChangeListenerC1864720yco viewOnAttachStateChangeListenerC1864720yco, View view) throws JSONException {
        Map<String, String> commonParams;
        ((View) viewOnAttachStateChangeListenerC1864720yco.l0).removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1864720yco);
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        TakoSugGridAssem takoSugGridAssem = (TakoSugGridAssem) viewOnAttachStateChangeListenerC1864720yco.l1;
        Map<String, String> map = takoSugGridAssem.LLJLLIL;
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) takoSugGridAssem.LLJJLIIIJLLLLLLLZ.getValue();
        if (iTakoContextAbility != null) {
            commonParams = iTakoContextAbility.getCommonParams();
        } else {
            commonParams = null;
        }
        c1862330yYx.mobTikbotQuickInteractionShow(map, commonParams);
    }

    public static final void onViewAttachedToWindow$4(ViewOnAttachStateChangeListenerC1864720yco viewOnAttachStateChangeListenerC1864720yco, View view) {
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        String str;
        C13LC<C1864200yby> c13lcAp0;
        C1864200yby c1864200yby;
        C13LC<C1864200yby> c13lcAp02;
        C1864200yby c1864200yby2;
        ((View) viewOnAttachStateChangeListenerC1864720yco.l0).removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1864720yco);
        ITakoContextAbility iTakoContextAbilityMp = ((TakoOnboardingAssem) viewOnAttachStateChangeListenerC1864720yco.l1).mp();
        if (iTakoContextAbilityMp != null && (c13lcT71 = iTakoContextAbilityMp.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
            ITakoContextAbility iTakoContextAbilityMp2 = ((TakoOnboardingAssem) viewOnAttachStateChangeListenerC1864720yco.l1).mp();
            String str2 = null;
            if (iTakoContextAbilityMp2 != null && (c13lcAp02 = iTakoContextAbilityMp2.Ap0()) != null && (c1864200yby2 = (C1864200yby) c13lcAp02.LIZIZ()) != null) {
                str = c1864200yby2.LL;
            } else {
                str = null;
            }
            String str3 = "";
            if (str == null) {
                str = "";
            }
            ITakoContextAbility iTakoContextAbilityMp3 = ((TakoOnboardingAssem) viewOnAttachStateChangeListenerC1864720yco.l1).mp();
            if (iTakoContextAbilityMp3 != null && (c13lcAp0 = iTakoContextAbilityMp3.Ap0()) != null && (c1864200yby = (C1864200yby) c13lcAp0.LIZIZ()) != null) {
                str2 = c1864200yby.LLILLJJLI;
            }
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
            String str7 = c1863850ybP.LLJ;
            if (str7 == null) {
                str7 = "";
            }
            if (str2 != null) {
                str3 = str2;
            }
            C1862330yYx.LJJZZI(256, c1862330yYx, str4, str5, str6, str, c1863850ybP.LLIZ, "user_onboarding", str7, str3, ((TakoOnboardingAssem) viewOnAttachStateChangeListenerC1864720yco.l1).LLJJIJIIJIL.getMobOnboardingStyle());
        }
    }

    public static final void onViewAttachedToWindow$5(ViewOnAttachStateChangeListenerC1864720yco viewOnAttachStateChangeListenerC1864720yco, View view) throws JSONException {
        Map<String, String> commonParams;
        ((View) viewOnAttachStateChangeListenerC1864720yco.l0).removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1864720yco);
        ((TakoMiddlePageSugAssem) viewOnAttachStateChangeListenerC1864720yco.l1).LLLF = System.currentTimeMillis();
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        TakoMiddlePageSugAssem takoMiddlePageSugAssem = (TakoMiddlePageSugAssem) viewOnAttachStateChangeListenerC1864720yco.l1;
        Map<String, String> map = takoMiddlePageSugAssem.LLL;
        ITakoContextAbility iTakoContextAbilityUp = takoMiddlePageSugAssem.up();
        if (iTakoContextAbilityUp != null) {
            commonParams = iTakoContextAbilityUp.getCommonParams();
        } else {
            commonParams = null;
        }
        c1862330yYx.mobTikbotQuickInteractionShow(map, commonParams);
    }

    public static final void onViewAttachedToWindow$6(ViewOnAttachStateChangeListenerC1864720yco viewOnAttachStateChangeListenerC1864720yco, View view) {
        C416320GUc.LIZ++;
        RecyclerView recyclerView = (RecyclerView) viewOnAttachStateChangeListenerC1864720yco.l0;
        if (recyclerView != null) {
            recyclerView.addOnLayoutChangeListener(((TakoMiddlePageSugListCardAssem) viewOnAttachStateChangeListenerC1864720yco.l1).LLLIIL);
        }
        view.addOnLayoutChangeListener(((TakoMiddlePageSugListCardAssem) viewOnAttachStateChangeListenerC1864720yco.l1).LLLIILIL);
        TakoChatUIAbility takoChatUIAbility = (TakoChatUIAbility) ((TakoMiddlePageSugListCardAssem) viewOnAttachStateChangeListenerC1864720yco.l1).LLLFZ.getValue();
        if (takoChatUIAbility != null) {
            takoChatUIAbility.w01(false);
        }
    }

    public static final void onViewDetachedFromWindow$0(ViewOnAttachStateChangeListenerC1864720yco viewOnAttachStateChangeListenerC1864720yco, View view) {
        ((View) viewOnAttachStateChangeListenerC1864720yco.l0).removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1864720yco);
        ((C13Y1) viewOnAttachStateChangeListenerC1864720yco.l1).LJJII();
    }

    public static final void onViewDetachedFromWindow$6(ViewOnAttachStateChangeListenerC1864720yco viewOnAttachStateChangeListenerC1864720yco, View view) {
        TakoChatUIAbility takoChatUIAbility;
        RecyclerView recyclerView = (RecyclerView) viewOnAttachStateChangeListenerC1864720yco.l0;
        if (recyclerView != null) {
            recyclerView.removeOnLayoutChangeListener(((TakoMiddlePageSugListCardAssem) viewOnAttachStateChangeListenerC1864720yco.l1).LLLIIL);
        }
        view.removeOnLayoutChangeListener(((TakoMiddlePageSugListCardAssem) viewOnAttachStateChangeListenerC1864720yco.l1).LLLIILIL);
        int i = C416320GUc.LIZ - 1;
        C416320GUc.LIZ = i;
        if (i == 0 && (takoChatUIAbility = (TakoChatUIAbility) ((TakoMiddlePageSugListCardAssem) viewOnAttachStateChangeListenerC1864720yco.l1).LLLFZ.getValue()) != null) {
            takoChatUIAbility.w01(true);
        }
    }

    public ViewOnAttachStateChangeListenerC1864720yco(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
