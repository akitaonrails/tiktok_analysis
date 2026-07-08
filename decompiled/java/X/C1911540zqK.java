package X;

import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;

/* JADX INFO: renamed from: X.0zqK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1911540zqK extends C1619110sEf {
    public static final C1911540zqK LL = new C1911540zqK();
    public static InterfaceC1911550zqL LLILLJJLI;

    @Override // X.C1619110sEf, X.InterfaceC20643015q8
    public final void LIZIZ(InnerPushMessage innerPushMessage) {
        InterfaceC1911550zqL interfaceC1911550zqL = LLILLJJLI;
        if (interfaceC1911550zqL != null) {
            interfaceC1911550zqL.onShow();
        }
    }

    @Override // X.C1619110sEf, X.InterfaceC20643015q8
    public final void LJIIL(int i, InnerPushMessage innerPushMessage) {
        InterfaceC1911550zqL interfaceC1911550zqL = LLILLJJLI;
        if (interfaceC1911550zqL != null) {
            interfaceC1911550zqL.LIZIZ();
        }
    }
}
