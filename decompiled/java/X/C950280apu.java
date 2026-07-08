package X;

import android.content.Context;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0apu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C950280apu extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ DataChannel LLILLJJLI;
    public final /* synthetic */ C950360aq2 LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ InterfaceC950290apv LLILZLL;
    public final /* synthetic */ InterfaceC950290apv LLIZ;
    public final /* synthetic */ InterfaceC950020apU LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C950280apu(long j, Context context, C950360aq2 c950360aq2, InterfaceC950020apU interfaceC950020apU, C950270apt c950270apt, InterfaceC950290apv interfaceC950290apv, DataChannel dataChannel, boolean z) {
        super(1);
        this.LL = context;
        this.LLILLJJLI = dataChannel;
        this.LLILLL = c950360aq2;
        this.LLILZ = j;
        this.LLILZIL = z;
        this.LLILZLL = c950270apt;
        this.LLIZ = interfaceC950290apv;
        this.LLIZLLLIL = interfaceC950020apU;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (bool.booleanValue()) {
            Context context = this.LL;
            DataChannel dataChannel = this.LLILLJJLI;
            C950360aq2 c950360aq2 = this.LLILLL;
            long j = this.LLILZ;
            boolean z = this.LLILZIL;
            C950340aq0.LIZIZ(j, context, c950360aq2, this.LLIZLLLIL, this.LLILZLL, this.LLIZ, dataChannel, z);
        } else {
            InterfaceC950290apv interfaceC950290apv = this.LLIZ;
            if (interfaceC950290apv != null) {
                interfaceC950290apv.LIZIZ(1);
            }
        }
        return Unit.LIZ;
    }
}
