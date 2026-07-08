package X;

import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.VideoTagContainer;
import com.ss.android.ugc.feed.platform.cell.interact.next.standardized.assem.FcpContainerAssem;
import com.ss.android.ugc.feed.platform.cell.trigger.AbsComponentTrigger;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import com.ss.android.ugc.feed.platform.container.protocol.priority.VideoTagCategoryProtocol;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RJy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C693960RJy extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ VideoTagContainer LL;
    public final /* synthetic */ List<VideoTagCategoryProtocol> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C693960RJy(VideoTagContainer videoTagContainer, List<? extends VideoTagCategoryProtocol> list) {
        super(1);
        this.LL = videoTagContainer;
        this.LLILLJJLI = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        VideoTagContainer videoTagContainer = this.LL;
        videoTagContainer.subscribeChildAssemState(assembler2, new C0RK4(videoTagContainer.Fp()));
        List<VideoTagCategoryProtocol> list = this.LLILLJJLI;
        if (list != null) {
            VideoTagContainer videoTagContainer2 = this.LL;
            for (PriorityProtocol priorityProtocol : list) {
                videoTagContainer2.getClass();
                if (priorityProtocol instanceof BaseCellTriggerComponent) {
                    C0RJE.LIZJ(assembler2, videoTagContainer2, new AwS377S0200000_11(videoTagContainer2, priorityProtocol, 4));
                } else if (priorityProtocol instanceof BaseCellSlotComponent) {
                    assembler2.MQ2(videoTagContainer2, new AwS377S0200000_11(videoTagContainer2, priorityProtocol, 5));
                } else if (priorityProtocol instanceof AbsComponentTrigger) {
                    assembler2.MQ2(videoTagContainer2, new C0RKC(videoTagContainer2, priorityProtocol));
                } else if (priorityProtocol instanceof FcpContainerAssem) {
                    assembler2.LQ2(videoTagContainer2, new C693950RJx(videoTagContainer2, priorityProtocol));
                    if (Intrinsics.LJFF(((FcpContainerAssem) priorityProtocol).LLJL, "high_tag_standardized_container")) {
                        videoTagContainer2.LLLIILIL.put("high_tag_standardized_container", (C0RWZ) priorityProtocol);
                    }
                } else {
                    throw new IllegalStateException("The type implementing VideoTagCategoryProtocol is not supported!");
                }
            }
        }
        return Unit.LIZ;
    }
}
