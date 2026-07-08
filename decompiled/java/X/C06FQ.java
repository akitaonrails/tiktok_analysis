package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.06FQ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C06FQ extends C2217421BqW implements Function0<String> {
    public C06FQ(C06FO c06fo) {
        super(0, c06fo, C06FO.class, "getCurrUid", "getCurrUid()Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        String curUserId;
        this.receiver.getClass();
        InterfaceC461710I8r interfaceC461710I8r = (InterfaceC461710I8r) C06FO.LIZIZ.getValue();
        return (interfaceC461710I8r == null || (curUserId = interfaceC461710I8r.getCurUserId()) == null) ? "" : curUserId;
    }
}
