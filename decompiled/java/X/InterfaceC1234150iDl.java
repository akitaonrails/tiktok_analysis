package X;

import com.ss.android.ugc.aweme.account.unbind.UnbindResponse;

/* JADX INFO: renamed from: X.0iDl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public interface InterfaceC1234150iDl {
    public static final C0CQ3 LIZ = C0CQ3.LIZ;

    @InterfaceC1501240pAY("/passport/email/unbind/")
    C15O7<UnbindResponse> LIZ(@InterfaceC1501120pAM("passport_ticket") String str, @InterfaceC1501370pAl("x-tt-passport-csrf-token") String str2);

    @InterfaceC1501240pAY("/passport/mobile/unbind/")
    C15O7<UnbindResponse> LIZIZ(@InterfaceC1501120pAM("passport_ticket") String str, @InterfaceC1501370pAl("x-tt-passport-csrf-token") String str2);
}
