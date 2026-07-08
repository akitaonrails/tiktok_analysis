package X;

import android.content.Context;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0UNI, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UNI extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C0UQ6 LL;
    public final /* synthetic */ C772450URv LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ DataChannel LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0UNI(C0UQ6 c0uq6, C772450URv c772450URv, Context context, DataChannel dataChannel, String str) {
        super(0);
        this.LL = c0uq6;
        this.LLILLJJLI = c772450URv;
        this.LLILLL = context;
        this.LLILZ = dataChannel;
        this.LLILZIL = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C0UQ6 c0uq6 = this.LL;
        C772450URv c772450URv = this.LLILLJJLI;
        c0uq6.LIZIZ(c772450URv, new C0UNH(this.LLILLL, this.LLILZ, c772450URv, this.LLILZIL));
        return Unit.LIZ;
    }
}
