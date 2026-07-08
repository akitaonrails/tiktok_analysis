package X;

import com.bytedance.android.livesdk.envelope.model.RedEnvelopeListResponse;
import com.bytedance.android.livesdk.impl.revenue.treasurebox.network.ActivityTreasureBoxApi;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JfI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C497580JfI extends C09AY implements Function0<C11NZ<C470590Icr<RedEnvelopeListResponse>>> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C497580JfI(String str, String str2) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C11NZ<C470590Icr<RedEnvelopeListResponse>> invoke() {
        C480460Ism.LIZ().getClass();
        return ((ActivityTreasureBoxApi) C480460Ism.LIZLLL(ActivityTreasureBoxApi.class)).getRedEnvelopList(this.LL, this.LLILLJJLI).LJJIJLIJ();
    }
}
