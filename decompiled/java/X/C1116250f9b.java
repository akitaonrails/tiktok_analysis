package X;

import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.emoji.EmoteWithIndex;
import com.bytedance.android.livesdk.dataChannel.StarCommentPurchasePageEvent;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0f9b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1116250f9b extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Pair<List<EmoteModel>, List<EmoteWithIndex>> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1116250f9b(String str, String str2, Pair<? extends List<EmoteModel>, ? extends List<EmoteWithIndex>> pair) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = pair;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        DataChannelGlobal.LLILZ.FQ2(StarCommentPurchasePageEvent.class, new C1116330f9j(this.LL, this.LLILLJJLI, this.LLILLL.getSecond()));
        return Unit.LIZ;
    }
}
