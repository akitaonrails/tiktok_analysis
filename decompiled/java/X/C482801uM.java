package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.api.smb.SMBGoLivePageResponse;

/* JADX INFO: renamed from: X.01uM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C482801uM extends C2217421BqW implements Function1<C470590Icr<SMBGoLivePageResponse.Data>, Unit> {
    public C482801uM(Object obj) {
        super(1, obj, C482301uH.class, "onSmbPermissionResponse", "onSmbPermissionResponse(Lcom/bytedance/android/live/network/response/Response;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C470590Icr<SMBGoLivePageResponse.Data> c470590Icr) {
        C470590Icr<SMBGoLivePageResponse.Data> c470590Icr2 = c470590Icr;
        C482301uH c482301uH = (C482301uH) this.receiver;
        if (c482301uH.LJIIIZ != null) {
            C758430Tp3.LIZ(c470590Icr2.data);
            c482301uH.LIZLLL(C758440Tp4.LIZIZ);
        }
        return Unit.LIZ;
    }
}
