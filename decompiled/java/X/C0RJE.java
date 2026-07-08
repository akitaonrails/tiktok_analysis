package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility;
import com.ss.android.ugc.aweme.feed.assem.live.LiveNoticeCTAButtonTrigger;
import com.ss.android.ugc.aweme.feed.assem.relationbtn.VideoRelationBtnTrigger;
import com.ss.android.ugc.aweme.feed.assem.story.FeedStoryTagTriggerV2;
import com.ss.android.ugc.aweme.feed.assem.story.FeedStoryTagTriggerV2ForGenreTagContainer;
import com.ss.android.ugc.aweme.feed.assem.story.QuickDMEntranceTrigger;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.cell.interact.info.UpvoteVideoTrigger;
import com.ss.android.ugc.feed.platform.cell.interact.next.standardized.assem.FcpContainerAssem;
import com.ss.android.ugc.feed.platform.cell.trigger.AbsComponentTrigger;
import com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityProtocol;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import com.ss.android.ugc.feed.platform.container.protocol.priority.VideoBottomLabelProtocol;
import com.ss.android.ugc.feed.platform.container.protocol.priority.VideoTagCategoryProtocol;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS479S0200000_11;

/* JADX INFO: renamed from: X.0RJE, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RJE {
    public static final void LIZ(BaseCellSlotComponent<?> baseCellSlotComponent, Function0<Unit> function0) {
        if (baseCellSlotComponent.LJJIJL().getParent() == null) {
            C786410Ut5.x3(baseCellSlotComponent.LJJIJL().getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC738840SyY(function0, baseCellSlotComponent, 3));
        } else {
            function0.invoke();
        }
    }

    public static final boolean LIZIZ(LifecycleOwner lifecycleOwner, boolean z) {
        IInternalShareApi.LIZ.getClass();
        if (C1370970lmR.LIZ().LIZIZ().LJJIII(lifecycleOwner) || (lifecycleOwner instanceof UpvoteVideoTrigger) || (lifecycleOwner instanceof VideoRelationBtnTrigger) || (lifecycleOwner instanceof QuickDMEntranceTrigger) || (lifecycleOwner instanceof FeedStoryTagTriggerV2) || (lifecycleOwner instanceof FeedStoryTagTriggerV2ForGenreTagContainer) || (lifecycleOwner instanceof FcpContainerAssem) || (lifecycleOwner instanceof LiveNoticeCTAButtonTrigger) || ((lifecycleOwner instanceof C0RJM) && ((C0RJM) lifecycleOwner).Kj())) {
            return false;
        }
        if ((lifecycleOwner instanceof C0RJL) && ((C0RJL) lifecycleOwner).oh()) {
            return false;
        }
        if ((lifecycleOwner instanceof VideoBottomLabelProtocol) && !C1111504Wj.LIZ()) {
            return false;
        }
        if ((lifecycleOwner instanceof AbsComponentTrigger) && C0BX5.LIZ()) {
            return true;
        }
        if ((lifecycleOwner instanceof BaseCellTriggerComponent) && C0BX5.LIZ()) {
            return true;
        }
        if ((lifecycleOwner instanceof BottomBarPriorityProtocol) && ((Number) C283260B8i.LIZ.getValue()).intValue() == 0) {
            return true;
        }
        if ((lifecycleOwner instanceof VideoTagCategoryProtocol) && ((Number) C283970BBb.LIZ.getValue()).intValue() == 0) {
            return true;
        }
        if ((!(lifecycleOwner instanceof PriorityProtocol) || ((Number) C0B8O.LIZ.getValue()).intValue() != 1) && !z) {
            return false;
        }
        return true;
    }

    public static final void LIZJ(Assembler assembler, ReusedUIAssem reusedUIAssem, Function1 function1) {
        BaseFeedPageParams baseFeedPageParamsNJ2;
        C0REQ c0req = new C0REQ();
        function1.invoke(c0req);
        BaseCellTriggerComponent<? extends C03H5> baseCellTriggerComponent = c0req.LIZIZ;
        if (baseCellTriggerComponent == null) {
            C13IQ<? extends BaseCellTriggerComponent<? extends C03H5>> c13iq = c0req.LIZ;
            if (c13iq == null) {
                c13iq = null;
            }
            baseCellTriggerComponent = (BaseCellTriggerComponent) C09R7.LIZ(c13iq).newInstance();
        }
        IVideoCellAbility iVideoCellAbility = (IVideoCellAbility) C1558520qew.LIZ(C1558520qew.LJIIL(reusedUIAssem), IVideoCellAbility.class, null);
        if (iVideoCellAbility == null || (baseFeedPageParamsNJ2 = iVideoCellAbility.nJ2()) == null || !baseCellTriggerComponent.kp(baseFeedPageParamsNJ2, iVideoCellAbility.Yf2())) {
            return;
        }
        assembler.LQ2(reusedUIAssem, new C0RER(baseCellTriggerComponent, c0req));
    }

    /* JADX WARN: Incorrect types in method signature: <T:Lcom/bytedance/assem/arch/reused/ReusedAssem<*>;:LX/0Rxx<Lcom/ss/android/ugc/aweme/feed/model/VideoItemParams;>;:LX/0RBc;>(TT;Lcom/ss/android/ugc/aweme/feed/adapter/VideoViewModel;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;)LX/0ZP4; */
    public static final C0ZP4 LIZLLL(ReusedAssem reusedAssem, VideoViewModel videoViewModel, Function0 function0) {
        if (((Number) C0BXE.LIZIZ.getValue()).intValue() == 0) {
            return reusedAssem.selectSubscribe(videoViewModel, new C2217381BqS() { // from class: X.0RJJ
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C709790Rsn) obj).LLJLL;
                }
            }, new C2217381BqS() { // from class: X.0RJF
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C709790Rsn) obj).LLILLL;
                }
            }, new C2217381BqS() { // from class: X.0RJG
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C709790Rsn) obj).LLJJIJIL;
                }
            }, C736820SvI.LIZIZ(videoViewModel.usedInReusedScene), null, new C739030Syr(reusedAssem, function0, (Function0<Unit>) 1));
        }
        return C736680Sv4.LJIIIZ(reusedAssem, videoViewModel, new C2217381BqS() { // from class: X.0RJH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, new C2217381BqS() { // from class: X.0RJI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLJJIJIL;
            }
        }, null, new AwS479S0200000_11(reusedAssem, function0, (Function0<Unit>) 1), 12);
    }
}
