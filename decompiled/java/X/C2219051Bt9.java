package X;

import com.google.gson.Gson;
import com.google.gson.e;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Bt9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2219051Bt9 extends C09AY implements Function0<Gson> {
    public C2219051Bt9() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Gson invoke() {
        Gson gson;
        InterfaceC2219141BtI interfaceC2219141BtI = C2219091BtD.LJIIIZ;
        return (interfaceC2219141BtI == null || (gson = interfaceC2219141BtI.getGson()) == null) ? new e().LIZ() : gson;
    }
}
