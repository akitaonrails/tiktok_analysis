package X;

import android.content.Context;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0aq4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C950380aq4 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ DataChannel LL;
    public final /* synthetic */ C950360aq2 LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ InterfaceC950290apv LLILZIL;
    public final /* synthetic */ InterfaceC950290apv LLILZLL;
    public final /* synthetic */ InterfaceC950020apU LLIZ;
    public final /* synthetic */ Context LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C950380aq4(long j, Context context, C950360aq2 c950360aq2, InterfaceC950020apU interfaceC950020apU, InterfaceC950290apv interfaceC950290apv, InterfaceC950290apv interfaceC950290apv2, DataChannel dataChannel, boolean z) {
        super(0);
        this.LL = dataChannel;
        this.LLILLJJLI = c950360aq2;
        this.LLILLL = j;
        this.LLILZ = z;
        this.LLILZIL = interfaceC950290apv;
        this.LLILZLL = interfaceC950290apv2;
        this.LLIZ = interfaceC950020apU;
        this.LLIZLLLIL = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        DataChannel dataChannel = this.LL;
        C950360aq2 c950360aq2 = this.LLILLJJLI;
        long j = this.LLILLL;
        boolean z = this.LLILZ;
        InterfaceC950290apv interfaceC950290apv = this.LLILZIL;
        InterfaceC950290apv interfaceC950290apv2 = this.LLILZLL;
        C950340aq0.LJI(j, this.LLIZLLLIL, c950360aq2, this.LLIZ, interfaceC950290apv, interfaceC950290apv2, dataChannel, z);
        return Unit.LIZ;
    }
}
