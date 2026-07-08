package X;

import Y.ARunnableS112S0100000_12;
import Y.ARunnableS81S0200000_12;
import android.os.Handler;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.effect.beauty.data.LiveSmallItemBeautyViewModel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAIBeautySetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBeautySwitchSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0U6R, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U6R extends C0U6V {
    public final LiveSmallItemBeautyViewModel LJIIJJI;
    public final DataChannel LJIIL;
    public final C766950U6r LJIILIIL;
    public final ViewGroup LJIILJJIL;
    public final ViewGroup LJIILL;
    public final C19P4 LJIILLIIL;
    public final C0U78 LJIIZILJ;
    public C0U6S LJIJ;
    public final Map<String, Integer> LJIJI;

    @Override // X.C0U6V
    public final LiveEffect LIZJ() {
        List<LiveEffect> listLIZ = LIZ();
        if (listLIZ == null) {
            return null;
        }
        return (LiveEffect) C13LP.LJJJLZIJ(C0U7C.LJIIJJI(this.LJII, false, listLIZ), listLIZ);
    }

    @Override // X.C0U6V
    public final void LJFF() {
        RecyclerView recyclerView;
        C766590U5h c766590U5h;
        super.LJFF();
        LJIILIIL(true);
        C766950U6r c766950U6r = this.LJIILIIL;
        Object obj = null;
        AbstractC761520Tu2 abstractC761520Tu2 = c766950U6r != null ? c766950U6r.LLJIJIL : null;
        if ((abstractC761520Tu2 instanceof C766590U5h) && (c766590U5h = (C766590U5h) abstractC761520Tu2) != null) {
            C766640U5m c766640U5m = c766590U5h.LJIILJJIL;
            Iterator it2 = ((ArrayList) c766640U5m.LL).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((LiveEffect) next).LJJIJIIJI()) {
                    obj = next;
                    break;
                }
            }
            LiveEffect liveEffect = (LiveEffect) obj;
            if (liveEffect != null) {
                c766640U5m.LLLLZIL(((ArrayList) c766640U5m.LL).indexOf(liveEffect), liveEffect);
            }
        }
        C0U6S c0u6s = this.LJIJ;
        if (c0u6s != null) {
            C0U6X c0u6x = c0u6s.LJII;
            RecyclerView recyclerView2 = c0u6x.LLILLJJLI;
            if (recyclerView2 != null && (recyclerView2.getScrollState() != 0 || ((recyclerView = c0u6x.LLILLJJLI) != null && recyclerView.isComputingLayout()))) {
                C786410Ut5.LJJZZIII((Handler) c0u6x.LLIZ.getValue(), new ARunnableS112S0100000_12(c0u6x, 435));
            } else {
                c0u6x.LLLJ(c0u6x.LLILZIL);
                c0u6x.LLLILZ(0);
            }
        }
    }

    public static boolean LJIIJ(LiveEffect liveEffect) {
        if (LiveBeautySwitchSetting.INSTANCE.inExperiment() && !InterfaceC766480U4w.LJJIII.LIZIZ().booleanValue() && LJIIJJI(liveEffect.LJLL())) {
            return true;
        }
        return false;
    }

    public static boolean LJIIJJI(String str) {
        Boolean boolValueOf;
        if (str != null) {
            boolValueOf = Boolean.valueOf(u.LJJIIJZLJL(str, "beauty", false));
        } else {
            boolValueOf = null;
        }
        return C500260Jjc.LJJJI(boolValueOf);
    }

    @Override // X.C0U6V
    public final void LJI(LiveEffect liveEffect) {
        ViewGroup viewGroup = this.LJIILJJIL;
        if (viewGroup == null) {
            return;
        }
        String str = "";
        if (this.LJIJ == null) {
            ViewGroup viewGroup2 = this.LJIILL;
            DataChannel dataChannel = this.LJIIL;
            String strLLILL = liveEffect.LLILL();
            if (strLLILL == null) {
                strLLILL = "";
            }
            liveEffect.LJLL();
            this.LJIJ = new C0U6S(viewGroup, viewGroup2, dataChannel, strLLILL, liveEffect.getResourceId(), liveEffect.getName(), this.LIZLLL, this.LJIIZILJ);
        }
        C0U6S c0u6s = this.LJIJ;
        if (c0u6s != null) {
            c0u6s.LJIIIIZZ = new AwS556S0100000_12(this, 934);
            c0u6s.LJIIIZ = new AwS591S0100000_12(this, 1131);
            String strLLILL2 = liveEffect.LLILL();
            if (strLLILL2 != null) {
                str = strLLILL2;
            }
            liveEffect.LJLL();
            String resourceId = liveEffect.getResourceId();
            String name = liveEffect.getName();
            String str2 = this.LIZLLL;
            c0u6s.LIZLLL = resourceId;
            c0u6s.LIZJ = str;
            c0u6s.LJ = name;
            c0u6s.LJFF = str2;
            c0u6s.LJIILL = true;
            c0u6s.LJIILLIIL = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(c0u6s.LJIILJJIL), null, null, new C0U6Q(c0u6s, null), 3);
            C500260Jjc.LJIILIIL(c0u6s.LIZ);
            C500260Jjc.LLFFF(c0u6s.LJIIJ);
            C1EOY.LIZ.LJI(c0u6s.LJIIL);
        }
    }

    public final void LJIIL(int i) {
        LiveSmallItemBeautyViewModel liveSmallItemBeautyViewModel;
        LJIIIIZZ(i, this.LJFF);
        LiveEffect liveEffect = this.LJFF;
        if (liveEffect != null) {
            this.LJ.LJIL(i, liveEffect, this.LIZLLL);
        }
        LiveEffect liveEffect2 = this.LJFF;
        if (liveEffect2 != null) {
            LiveEffect.ComposerConfig composerConfigLJIIJ = C0U7C.LJIIJ(liveEffect2);
            if ((composerConfigLJIIJ != null && composerConfigLJIIJ.LIZIZ == i) || !C0UA1.LIZ().LJIILJJIL(liveEffect2.LIZ) || (liveSmallItemBeautyViewModel = this.LJIIJJI) == null) {
                return;
            }
            liveSmallItemBeautyViewModel.LLJILJILJ = true;
        }
    }

    public final void LJIILIIL(boolean z) {
        AbstractC761520Tu2 abstractC761520Tu2;
        LiveEffect liveEffect;
        if ((LiveBeautySwitchSetting.INSTANCE.inExperiment() || LiveAIBeautySetting.INSTANCE.enableDialogUpdate()) && LJIIJJI(this.LJII)) {
            C766950U6r c766950U6r = this.LJIILIIL;
            C766590U5h c766590U5h = null;
            if (c766950U6r != null) {
                abstractC761520Tu2 = c766950U6r.LLJIJIL;
            } else {
                abstractC761520Tu2 = null;
            }
            if (abstractC761520Tu2 instanceof C766590U5h) {
                c766590U5h = (C766590U5h) abstractC761520Tu2;
            }
            if (z) {
                if (c766590U5h != null) {
                    c766590U5h.LJIILJJIL.notifyDataSetChanged();
                }
            } else {
                if (c766590U5h == null || (liveEffect = this.LJFF) == null) {
                    return;
                }
                C766640U5m c766640U5m = c766590U5h.LJIILJJIL;
                if (c766640U5m.LLLLLLLLL()) {
                    C786410Ut5.LJJZZIII(c766640U5m.LLLLLLIL(), new ARunnableS81S0200000_12(liveEffect, c766640U5m, 137));
                    return;
                }
                int iIndexOf = ((ArrayList) c766640U5m.LL).indexOf(liveEffect);
                if (iIndexOf < 0 || iIndexOf >= ((ArrayList) c766640U5m.LL).size()) {
                    return;
                }
                c766640U5m.notifyItemChanged(iIndexOf, "item_update_white_dot");
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0U6R(LiveSmallItemBeautyViewModel liveSmallItemBeautyViewModel, DataChannel dataChannel, C766950U6r c766950U6r, ViewGroup viewGroup, ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT, C19P4 c19p4, C16F5 c16f5) {
        C0U78 c0u78LIZ = C0UA1.LIZ();
        super(dataChannel, c19p4, c16f5, C0UD4.LJFF, c0u78LIZ);
        this.LJIIJJI = liveSmallItemBeautyViewModel;
        this.LJIIL = dataChannel;
        this.LJIILIIL = c766950U6r;
        this.LJIILJJIL = viewGroup;
        this.LJIILL = viewOnClickListenerC1836610xtT;
        this.LJIILLIIL = c19p4;
        this.LJIIZILJ = c0u78LIZ;
        this.LJIJI = new LinkedHashMap();
    }
}
