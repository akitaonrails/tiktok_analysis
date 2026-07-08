package X;

import com.ss.android.ugc.aweme.live.ILiveGeckoLoaderService;

/* JADX INFO: renamed from: X.14gh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20329714gh implements ILiveGeckoLoaderService {
    public static final C20329714gh LIZ = new C20329714gh();

    @Override // com.ss.android.ugc.aweme.live.ILiveGeckoLoaderService
    public final void loadGeckoLottie(C1295960jpS c1295960jpS, String str, String str2, boolean z, InterfaceC1106470etp interfaceC1106470etp) {
        if (interfaceC1106470etp != null) {
            C1143680frq.LJIILL(c1295960jpS, str, str2, z, new C20749816Ho(interfaceC1106470etp, 1));
        } else {
            C1143680frq.LJIILL(c1295960jpS, str, str2, z, null);
        }
    }
}
