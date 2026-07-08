package Y;

import X.C1AV2;
import X.C1AVH;
import X.C2180521AVm;
import X.C710300Rtc;
import X.C718770SHj;
import X.C724240Sb0;
import X.C786410Ut5;
import X.EnumC2180541AVo;
import X.InterfaceC20343214is;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.mob.InteractAreaMobCommonAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public class ALAdapterS2S0210000_11 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                break;
            case 1:
                onAnimationEnd$1(this, animator);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                break;
            case 1:
                onAnimationStart$1(this, animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS2S0210000_11 aLAdapterS2S0210000_11, Animator animator) {
        super.onAnimationEnd(animator);
        if (!aLAdapterS2S0210000_11.z2) {
            for (View view : (List) aLAdapterS2S0210000_11.l0) {
                if (view.getVisibility() == 0) {
                    view.setTag(R.id.ekv, 0);
                    if (view instanceof InterfaceC20343214is) {
                        C1AV2 c1av2 = (C1AV2) aLAdapterS2S0210000_11.l1;
                        if (c1av2 == null) {
                            c1av2 = (C1AV2) C1AVH.LJIILL.getValue();
                        }
                        C2180521AVm.LIZ(view, EnumC2180541AVo.V_VISIBLITY, c1av2);
                    }
                    C786410Ut5.LJLLLLLL(8, view);
                }
            }
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS2S0210000_11 aLAdapterS2S0210000_11, Animator animator) {
        VideoItemParams item;
        DataCenter dataCenter;
        if (((C718770SHj) aLAdapterS2S0210000_11.l0).LLILLJJLI.xQ2()) {
            C786410Ut5.LJZL(0, ((C718770SHj) aLAdapterS2S0210000_11.l0).LLILZLL);
            C718770SHj c718770SHj = (C718770SHj) aLAdapterS2S0210000_11.l0;
            c718770SHj.LLILLJJLI.NQ2(C724240Sb0.LIZ(c718770SHj.LL));
        } else {
            C786410Ut5.LJLLLLLL(0, ((C718770SHj) aLAdapterS2S0210000_11.l0).LLJIJIL);
        }
        ((C718770SHj) aLAdapterS2S0210000_11.l0).LJLIIL(0);
        if (((C718770SHj) aLAdapterS2S0210000_11.l0).LLILLJJLI.xQ2()) {
            ((C718770SHj) aLAdapterS2S0210000_11.l0).LJLI();
        }
        ((C718770SHj) aLAdapterS2S0210000_11.l0).LLJI.invalidate();
        InteractAreaMobCommonAbility interactAreaMobCommonAbilityLJJJ = ((C718770SHj) aLAdapterS2S0210000_11.l0).LJJJ();
        if (interactAreaMobCommonAbilityLJJJ != null) {
            interactAreaMobCommonAbilityLJJJ.gW1(aLAdapterS2S0210000_11.z2, false);
        }
        if (!aLAdapterS2S0210000_11.z2 && (item = ((C718770SHj) aLAdapterS2S0210000_11.l0).LLILLJJLI.getItem()) != null && (dataCenter = item.dataCenter) != null) {
            dataCenter.zQ2(Boolean.FALSE, "is_desc_expanded");
        }
    }

    public static final void onAnimationStart$0(ALAdapterS2S0210000_11 aLAdapterS2S0210000_11, Animator animator) {
        super.onAnimationStart(animator);
        if (aLAdapterS2S0210000_11.z2) {
            for (View view : (List) aLAdapterS2S0210000_11.l0) {
                if (Intrinsics.LJFF(view.getTag(R.id.ekv), 0)) {
                    C786410Ut5.LJLLLLLL(0, view);
                }
            }
        }
    }

    public static final void onAnimationStart$1(ALAdapterS2S0210000_11 aLAdapterS2S0210000_11, Animator animator) {
        VideoItemParams item;
        DataCenter dataCenter;
        ((C718770SHj) aLAdapterS2S0210000_11.l0).LJLIIIL((C710300Rtc) aLAdapterS2S0210000_11.l1, true);
        ((C718770SHj) aLAdapterS2S0210000_11.l0).LJZL(true);
        ((C718770SHj) aLAdapterS2S0210000_11.l0).LJLIIL(4);
        if (((C718770SHj) aLAdapterS2S0210000_11.l0).LLILLJJLI.xQ2()) {
            C786410Ut5.LJLLLLLL(0, ((C718770SHj) aLAdapterS2S0210000_11.l0).LLJIJIL);
            ((C718770SHj) aLAdapterS2S0210000_11.l0).LJLLL();
        } else {
            C786410Ut5.LJLLLLLL(0, ((C718770SHj) aLAdapterS2S0210000_11.l0).LLJIJIL);
        }
        InteractAreaMobCommonAbility interactAreaMobCommonAbilityLJJJ = ((C718770SHj) aLAdapterS2S0210000_11.l0).LJJJ();
        if (interactAreaMobCommonAbilityLJJJ != null) {
            interactAreaMobCommonAbilityLJJJ.gW1(aLAdapterS2S0210000_11.z2, true);
        }
        if (aLAdapterS2S0210000_11.z2 && (item = ((C718770SHj) aLAdapterS2S0210000_11.l0).LLILLJJLI.getItem()) != null && (dataCenter = item.dataCenter) != null) {
            dataCenter.zQ2(Boolean.TRUE, "is_desc_expanded");
        }
    }

    public ALAdapterS2S0210000_11(Object obj, Object obj2, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.z2 = z;
    }
}
