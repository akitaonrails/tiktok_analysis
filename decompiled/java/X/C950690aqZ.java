package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.common.ISharedBgAbility;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0aqZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C950690aqZ {
    public final InterfaceC950700aqa LIZ;
    public final Function2<List<C950750aqf>, Boolean, Unit> LIZIZ;
    public final Function1<Boolean, Unit> LIZJ;
    public volatile List<? extends LiveEffect> LIZLLL;

    public final ISharedBgAbility LIZIZ() {
        InterfaceC665370Q7z interfaceC665370Q7z;
        DataChannel dataChannel = this.LIZ.getDataChannel();
        if (dataChannel == null || (interfaceC665370Q7z = (InterfaceC665370Q7z) dataChannel.gg0(C956790b0P.class)) == null) {
            return null;
        }
        return (ISharedBgAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z, ISharedBgAbility.class, null);
    }

    public final String LIZ() {
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModelGL0;
        C935540aS8 state;
        String str;
        ISharedBgAbility iSharedBgAbilityLIZIZ = LIZIZ();
        return (iSharedBgAbilityLIZIZ == null || (multiGuestSharedBgAnchorViewModelGL0 = iSharedBgAbilityLIZIZ.GL0()) == null || (state = multiGuestSharedBgAnchorViewModelGL0.getState()) == null || (str = state.LLILZ) == null) ? "" : str;
    }

    public final Boolean LIZJ() {
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModelGL0;
        C935540aS8 state;
        ISharedBgAbility iSharedBgAbilityLIZIZ = LIZIZ();
        if (iSharedBgAbilityLIZIZ == null || (multiGuestSharedBgAnchorViewModelGL0 = iSharedBgAbilityLIZIZ.GL0()) == null || (state = multiGuestSharedBgAnchorViewModelGL0.getState()) == null) {
            return null;
        }
        return Boolean.valueOf(state.LLIZ);
    }

    public static void LIZLLL(List list, boolean z) {
        String resourceId;
        long effectId;
        if (z) {
            return;
        }
        IntRange intRangeLJIIIZ = C1697810uHb.LJIIIZ(list);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(intRangeLJIIIZ, 10));
        C531650Kt9 it2 = intRangeLJIIIZ.iterator();
        while (it2.LLILLL) {
            arrayList.add(Integer.valueOf(it2.nextInt() + 1));
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            LiveEffect liveEffect = ((C950750aqf) it3.next()).LIZ;
            if (liveEffect != null) {
                effectId = liveEffect.getEffectId();
            } else {
                effectId = 0;
            }
            arrayList2.add(Long.valueOf(effectId));
        }
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            LiveEffect liveEffect2 = ((C950750aqf) it4.next()).LIZ;
            if (liveEffect2 == null || (resourceId = liveEffect2.getResourceId()) == null) {
                resourceId = "";
            }
            arrayList3.add(resourceId);
        }
        C935470aS1.LJ(EnumC937290aUx.DESIGN_PAGE.getValue(), arrayList, arrayList2, arrayList3);
    }

    public C950690aqZ(InterfaceC950700aqa interfaceC950700aqa, C950950aqz c950950aqz, C950990ar3 c950990ar3) {
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModelGL0;
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModelGL02;
        this.LIZ = interfaceC950700aqa;
        this.LIZIZ = c950950aqz;
        this.LIZJ = c950990ar3;
        ISharedBgAbility iSharedBgAbilityLIZIZ = LIZIZ();
        if (iSharedBgAbilityLIZIZ != null && (multiGuestSharedBgAnchorViewModelGL02 = iSharedBgAbilityLIZIZ.GL0()) != null) {
            MultiGuestSharedBgAnchorViewModel.HQ2(multiGuestSharedBgAnchorViewModelGL02, new C2217371BqR() { // from class: X.0aqb
                @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C935540aS8) obj).LLILZ;
                }

                @Override // X.C2217371BqR, X.AbstractC2217331BqN
                public final void set(Object obj, Object obj2) {
                    ((C935540aS8) obj).LLILZ = (String) obj2;
                }
            }, interfaceC950700aqa.LJJJJ(), new AwS591S0100000_12(this, 847));
        }
        ISharedBgAbility iSharedBgAbilityLIZIZ2 = LIZIZ();
        if (iSharedBgAbilityLIZIZ2 != null && (multiGuestSharedBgAnchorViewModelGL0 = iSharedBgAbilityLIZIZ2.GL0()) != null) {
            MultiGuestSharedBgAnchorViewModel.HQ2(multiGuestSharedBgAnchorViewModelGL0, new C2217371BqR() { // from class: X.0aVt
                @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C935540aS8) obj).LLIZ);
                }

                @Override // X.C2217371BqR, X.AbstractC2217331BqN
                public final void set(Object obj, Object obj2) {
                    ((C935540aS8) obj).LLIZ = ((Boolean) obj2).booleanValue();
                }
            }, interfaceC950700aqa.LJJJJ(), new AwS594S0100000_15(this, 682));
        }
    }
}
