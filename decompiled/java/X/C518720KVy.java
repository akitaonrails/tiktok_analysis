package X;

import com.bytedance.android.livesdk.comp.api.pcs.data.api.PcsApi;
import webcast.api.sub.SMBOptInQualificationResponse;

/* JADX INFO: renamed from: X.0KVy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C518720KVy implements InterfaceC518730KVz {
    public final PcsApi LIZ;

    @Override // X.InterfaceC518730KVz
    public final C11NZ LIZ() {
        return this.LIZ.finishSmbTask(12);
    }

    @Override // X.InterfaceC518730KVz
    public final C11NZ<C470590Icr<SMBOptInQualificationResponse.ResponseData>> getSmbQualification() {
        return this.LIZ.getSmbQualification();
    }

    public C518720KVy(PcsApi pcsApi) {
        this.LIZ = pcsApi;
    }
}
