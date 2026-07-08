package X;

import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0fV3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1129550fV3 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1128710fTh LL;
    public final /* synthetic */ GiftPage LLILLJJLI;
    public final /* synthetic */ LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1129550fV3(C1128710fTh c1128710fTh, GiftPage giftPage, LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> linkedList, boolean z, long j) {
        super(0);
        this.LL = c1128710fTh;
        this.LLILLJJLI = giftPage;
        this.LLILLL = linkedList;
        this.LLILZ = z;
        this.LLILZIL = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        final C1128710fTh c1128710fTh = this.LL;
        final GiftPage giftPage = this.LLILLJJLI;
        final LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> linkedList = this.LLILLL;
        final boolean z = this.LLILZ;
        final long j = this.LLILZIL;
        Runnable runnable = new Runnable() { // from class: X.0fV2
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("GiftPanelLeafV2@f893.processPage$2$runnable$1");
                try {
                    C1128710fTh c1128710fTh2 = c1128710fTh;
                    c1128710fTh2.LJJJJLI(giftPage, linkedList, c1128710fTh2.LLJJLIIIJLLLLLLLZ, z, j);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("GiftPanelLeafV2@f893.processPage$2$runnable$1");
            }
        };
        if (c1128710fTh.LLLLLLJ) {
            c1128710fTh.LLLLLLJ = false;
            RunnableC781530UlD runnableC781530UlD = c1128710fTh.LLJJIII;
            if (runnableC781530UlD != null) {
                HandlerHook.viewPost(runnableC781530UlD, runnable);
            }
        } else {
            runnable.run();
        }
        return Unit.LIZ;
    }
}
