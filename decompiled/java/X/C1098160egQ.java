package X;

import android.content.Context;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.chatroom.viewmodule.LiveGoalsWidget;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS22S1100100_17;

/* JADX INFO: renamed from: X.0egQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1098160egQ extends C09AY implements Function0<InterfaceC1541990qEH> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ LiveGoalsWidget LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1098160egQ(Context context, String str, LiveGoalsWidget liveGoalsWidget, long j, String str2) {
        super(0);
        this.LL = context;
        this.LLILLJJLI = str;
        this.LLILLL = liveGoalsWidget;
        this.LLILZ = j;
        this.LLILZIL = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1541990qEH invoke() {
        return ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).NN(this.LL, this.LLILLJJLI, null, true, new AwS22S1100100_17(this.LLILLL, this.LLILZ, this.LLILZIL, 1));
    }
}
