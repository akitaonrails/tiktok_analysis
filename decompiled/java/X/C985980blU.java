package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.biz.PlaybookBizDataChanged;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0blU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C985980blU extends C09AY implements Function1<Unit, Unit> {
    public final /* synthetic */ RecyclerView LL;
    public final /* synthetic */ Set<Long> LLILLJJLI;
    public final /* synthetic */ DataChannel LLILLL;
    public final /* synthetic */ C986010blX LLILZ;
    public final /* synthetic */ C259800zU<Function1<Unit, Unit>> LLILZIL;
    public final /* synthetic */ LifecycleOwner LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C985980blU(RecyclerView recyclerView, Set<Long> set, DataChannel dataChannel, C986010blX c986010blX, C259800zU<Function1<Unit, Unit>> c259800zU, LifecycleOwner lifecycleOwner) {
        super(1);
        this.LL = recyclerView;
        this.LLILLJJLI = set;
        this.LLILLL = dataChannel;
        this.LLILZ = c986010blX;
        this.LLILZIL = c259800zU;
        this.LLILZLL = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Unit unit) {
        C20441214yg.LJIIIZ("PlaybookBizHelper", "PlaybookBizDataChanged");
        final RecyclerView recyclerView = this.LL;
        final Set<Long> set = this.LLILLJJLI;
        final DataChannel dataChannel = this.LLILLL;
        final C986010blX c986010blX = this.LLILZ;
        final C259800zU<Function1<Unit, Unit>> c259800zU = this.LLILZIL;
        final LifecycleOwner lifecycleOwner = this.LLILZLL;
        HandlerHook.viewPost(recyclerView, new Runnable() { // from class: X.0blT
            public final void LIZ() {
                Function1<Unit, Unit> function1;
                if (!C985960blS.LIZIZ(recyclerView, set, dataChannel, c986010blX) || (function1 = c259800zU.element) == null) {
                    return;
                }
                DataChannel dataChannel2 = dataChannel;
                LifecycleOwner lifecycleOwner2 = lifecycleOwner;
                if (dataChannel2 != null) {
                    dataChannel2.GQ2(lifecycleOwner2, PlaybookBizDataChanged.class, function1);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PlaybookBizHelper@440f.observe$1$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PlaybookBizHelper@440f.observe$1$1");
            }
        });
        return Unit.LIZ;
    }
}
