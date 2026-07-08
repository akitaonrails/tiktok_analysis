package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18Il, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21261718Il extends C09AY implements Function0<String> {
    public C21261718Il() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        String deviceId;
        C18IP.LIZ.getClass();
        InterfaceC21260718Ib interfaceC21260718Ib = C18IP.LIZJ;
        return (interfaceC21260718Ib == null || (deviceId = interfaceC21260718Ib.getDeviceId()) == null) ? "" : deviceId;
    }
}
