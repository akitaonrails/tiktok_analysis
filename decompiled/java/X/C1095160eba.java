package X;

import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS135S0110000_17;

/* JADX INFO: renamed from: X.0eba, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1095160eba extends C09AY implements Function0<Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1095160eba(long j, AwS135S0110000_17 awS135S0110000_17) {
        super(0);
        this.LL = j;
        this.LLILLJJLI = awS135S0110000_17;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        DataChannelGlobal.LLILZ.JQ2(C1148100fyy.class, Long.valueOf(this.LL));
        this.LLILLJJLI.invoke();
        return Unit.LIZ;
    }
}
