package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.nle.editor_jni.NLESegmentTransition;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IFoundationAVService;
import com.ss.android.ugc.aweme.services.IInternalAVService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0EBX, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EBX extends AbstractC360500EBk {
    public final VideoPublishEditModel LLJJIJIL;
    public final String LLJJJ;
    public final boolean LLJJJIL;
    public final Activity LLJJJJ;
    public final C1DRG LLJJJJJIL;
    public C0EDF LLJL;
    public boolean LLJLL;
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 473));
    public final int LLJJL = C0FU0.LIZ(4.0f);
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 475));
    public final ArrayList<String> LLJLIL = new ArrayList<>();
    public final ArrayList<String> LLJLILLLLZIIL = new ArrayList<>();
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 474));

    public final C0E48 LIZIZ() {
        return (C0E48) this.LLJJJJLIIL.getValue();
    }

    public final C0EBZ LLLLJI() {
        return (C0EBZ) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    @Override // X.AbstractC360500EBk
    public final C0EDF LLLLIILL() {
        return LLLLL();
    }

    @Override // X.AbstractC360500EBk
    public final void LLLLIL() {
        C0EDF c0edfLLLLL = LLLLL();
        if (c0edfLLLLL != null) {
            c0edfLLLLL.LIZLLL(true);
        }
    }

    public final C0EDF LLLLL() {
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLJL;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.yie);
            this.LLJL = (C0EDF) callbackFindViewById;
        }
        return (C0EDF) callbackFindViewById;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a9  */
    /* JADX WARN: Type inference failed for: r3v7, types: [X.09AY, kotlin.jvm.functions.Function1] */
    @Override // com.bytedance.scene.Scene
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJJL(boolean r19) {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EBX.LLJJL(boolean):void");
    }

    public final void LLLLLILLIL(String str) {
        String strV22;
        C361100EDs resourceListAdapter;
        List<ResourceItem> listLLLFZ;
        ResourceItem next;
        C0EDF c0edfLLLLL;
        C0EDQ currentSelectItem;
        ResourceItem resourceItem;
        C0EBZ c0ebzLLLLJI;
        NLESegmentTransition endTransition;
        C0EBZ c0ebzLLLLJI2;
        C0EBZ c0ebzLLLLJI3;
        if (str != null && !a0.LJJJIL(str)) {
            C0E48 c0e48LIZIZ = LIZIZ();
            if (c0e48LIZIZ == null) {
                return;
            }
            C0EBZ c0ebzLLLLJI4 = LLLLJI();
            String resourceId = null;
            if (c0ebzLLLLJI4 != null) {
                strV22 = c0ebzLLLLJI4.v22(c0e48LIZIZ);
            } else {
                strV22 = null;
            }
            C0EDF c0edfLLLLL2 = LLLLL();
            if (c0edfLLLLL2 != null && (resourceListAdapter = c0edfLLLLL2.getResourceListAdapter()) != null && (listLLLFZ = resourceListAdapter.LLLFZ()) != null && !listLLLFZ.isEmpty()) {
                Iterator<ResourceItem> it2 = listLLLFZ.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(next.getResourceId(), str)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                ResourceItem resourceItem2 = next;
                if (resourceItem2 != null) {
                    if ((strV22 == null || a0.LJJJIL(strV22)) && C301740BsC.LIZ() && (c0ebzLLLLJI = LLLLJI()) != null) {
                        c0ebzLLLLJI.ox0(c0e48LIZIZ, this.LLJJJ);
                    }
                    if (C703302op.LIZ(strV22) && !C301740BsC.LIZ() && (c0ebzLLLLJI3 = LLLLJI()) != null) {
                        c0ebzLLLLJI3.ox0(c0e48LIZIZ, "");
                    }
                    if (Intrinsics.LJFF(strV22, this.LLJJJ) && (c0ebzLLLLJI2 = LLLLJI()) != null) {
                        c0ebzLLLLJI2.SW1(c0e48LIZIZ, listLLLFZ.indexOf(resourceItem2));
                    }
                    NLETrackSlot nLETrackSlotLJJLIIIJLLLLLLLZ = c0e48LIZIZ.LLFII().LJJLIIIJLLLLLLLZ();
                    if (nLETrackSlotLJJLIIIJLLLLLLLZ != null) {
                        if (!C351220Dpo.LLLI("slot_extra_transition_effect_id", nLETrackSlotLJJLIIIJLLLLLLLZ)) {
                            nLETrackSlotLJJLIIIJLLLLLLLZ.setExtra("slot_extra_transition_effect_id", resourceItem2.getEffectId());
                        }
                        NLESegmentTransition endTransition2 = nLETrackSlotLJJLIIIJLLLLLLLZ.getEndTransition();
                        if (endTransition2 != null && !C351220Dpo.LLLI("transition_name", endTransition2) && (endTransition = nLETrackSlotLJJLIIIJLLLLLLLZ.getEndTransition()) != null) {
                            endTransition.setExtra("transition_name", resourceItem2.getName());
                        }
                    }
                }
                C0EDF c0edfLLLLL3 = LLLLL();
                if (c0edfLLLLL3 != null && (currentSelectItem = c0edfLLLLL3.getCurrentSelectItem()) != null && (resourceItem = currentSelectItem.LIZ) != null) {
                    resourceId = resourceItem.getResourceId();
                }
                if (!Intrinsics.LJFF(resourceId, str) && (c0edfLLLLL = LLLLL()) != null) {
                    C0EDF.LJIIL(c0edfLLLLL, str, C0E17.DIRECT_SCROLL, 8);
                    return;
                }
                return;
            }
            return;
        }
        C0EDF c0edfLLLLL4 = LLLLL();
        if (c0edfLLLLL4 != null) {
            c0edfLLLLL4.LJIILL(C0E17.NO_SCROLL);
        }
    }

    public static final Integer LLLLJ(Context context, Integer num) {
        if (num == null) {
            return null;
        }
        return C1308910kAL.LIZJ(num.intValue(), context);
    }

    public final void LLLLILI(ResourceItem resourceItem, int i, String str) {
        Pair<NLETrackSlot, NLETrackSlot> pairA60;
        String extra;
        Long lLJIILIIL;
        if (C0E0L.LIZ(resourceItem)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C0EBZ c0ebzLLLLJI = LLLLJI();
            if (c0ebzLLLLJI != null) {
                c0ebzLLLLJI.U60(this.LLJJJJ.getString(2131850732), LIZIZ());
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            C0LAB c0lab = new C0LAB();
            c0lab.LIZIZ(jCurrentTimeMillis2, "acc_advanced_edit_delete_transition_duration");
            C20684815ws.LJIILLIIL("acc_advanced_edit_delete_transition_duration", c0lab.LIZ);
            LLLLLIL("", "", "click");
            return;
        }
        Double d = resourceItem.transitionDefaultDuration;
        if (d != null) {
            d.doubleValue();
            C0EBZ c0ebzLLLLJI2 = LLLLJI();
            if (c0ebzLLLLJI2 != null && (pairA60 = c0ebzLLLLJI2.A60(LIZIZ())) != null) {
                NLETrackSlot first = pairA60.getFirst();
                C0EBZ c0ebzLLLLJI3 = LLLLJI();
                if (c0ebzLLLLJI3 != null) {
                    long jAf1 = c0ebzLLLLJI3.af1(LIZIZ());
                    long jDoubleValue = (long) (resourceItem.transitionDefaultDuration.doubleValue() * ((double) 1000000));
                    if (first != null && (extra = first.getExtra("ep_transition_cache_duration")) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(extra)) != null) {
                        jDoubleValue = lLJIILIIL.longValue();
                    }
                    String effectId = resourceItem.getEffectId();
                    String resourceId = resourceItem.getResourceId();
                    IFoundationAVService iFoundationAVService = (IFoundationAVService) PluggableExtentionKt.pluggableSpi$default(IInternalAVService.class, false, false, false, 14, null);
                    if (iFoundationAVService != null) {
                        iFoundationAVService.setLastInfo(new C1179004jM(effectId));
                        iFoundationAVService.setLastInfo(new C1259004wG(resourceId));
                    }
                    long jCurrentTimeMillis3 = System.currentTimeMillis();
                    C0EBZ c0ebzLLLLJI4 = LLLLJI();
                    if (c0ebzLLLLJI4 != null) {
                        c0ebzLLLLJI4.V20(new C350820DpA(this.LLJJJ, i, resourceItem.getPath(), Math.min(jAf1, jDoubleValue), resourceItem.overlap, effectId, resourceItem.getName(), resourceId, 768), LIZIZ());
                    }
                    long jCurrentTimeMillis4 = System.currentTimeMillis() - jCurrentTimeMillis3;
                    C0LAB c0lab2 = new C0LAB();
                    c0lab2.LIZIZ(jCurrentTimeMillis4, "acc_advanced_edit_add_transition_duration");
                    C20684815ws.LJIILLIIL("acc_advanced_edit_add_transition_duration", c0lab2.LIZ);
                    LLLLLIL(effectId, this.LLJJJ, str);
                }
            }
        }
    }

    public final void LLLLLIL(String str, String str2, String str3) {
        C0EBZ c0ebzLLLLJI;
        Pair<NLETrackSlot, NLETrackSlot> pairA60;
        NLETrackSlot first;
        VideoPublishEditModel videoPublishEditModel = this.LLJJIJIL;
        if (videoPublishEditModel != null && (c0ebzLLLLJI = LLLLJI()) != null && (pairA60 = c0ebzLLLLJI.A60(LIZIZ())) != null && (first = pairA60.getFirst()) != null) {
            boolean zHasExtra = first.hasExtra("split_ref_name");
            C0E48 c0e48LIZIZ = LIZIZ();
            if (c0e48LIZIZ != null) {
                Iterator<NLETrackSlot> it2 = c0e48LIZIZ.Rn().getSlots().iterator();
                int i = 0;
                while (true) {
                    if (it2.hasNext()) {
                        if (Intrinsics.LJFF(it2.next(), first)) {
                            break;
                        } else {
                            i++;
                        }
                    } else {
                        i = -1;
                        break;
                    }
                }
                C0E28.LIZ(videoPublishEditModel, c0e48LIZIZ, C1697810uHb.LJ(str), str3, C1697810uHb.LJ(Integer.valueOf(i + 1)), zHasExtra, str2);
            }
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (C357780E0y.LIZ()) {
            return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.c2p, viewGroup, false);
        }
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.c2o, viewGroup, false);
    }

    public C0EBX(VideoPublishEditModel videoPublishEditModel, String str, boolean z, Activity activity, C1DRG c1drg) {
        this.LLJJIJIL = videoPublishEditModel;
        this.LLJJJ = str;
        this.LLJJJIL = z;
        this.LLJJJJ = activity;
        this.LLJJJJJIL = c1drg;
    }
}
