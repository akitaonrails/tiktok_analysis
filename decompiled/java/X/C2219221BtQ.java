package X;

import android.app.Application;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1BtQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2219221BtQ extends C09AY implements Function0<InterfaceC2269341Ds4> {
    public final /* synthetic */ Application LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2219221BtQ(Application application) {
        super(0);
        this.LL = application;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC2269341Ds4 invoke() {
        return new C2269331Ds3(this.LL);
    }
}
