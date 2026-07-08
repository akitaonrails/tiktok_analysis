package X;

import com.ss.android.ugc.aweme.vibefeed.model.VibeConfigResponse;
import com.ss.android.ugc.aweme.vibefeed.model.VibeFeedAcceptResponse;
import com.ss.android.ugc.aweme.vibefeed.model.VibeFeedCloseResponse;
import com.ss.android.ugc.aweme.vibefeed.model.VibeFeedInviteResponse;

/* JADX INFO: renamed from: X.0OmG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C629300OmG implements InterfaceC736910SvR<InterfaceC629290OmF> {
    @Override // X.InterfaceC736910SvR
    public final void release() {
    }

    @Override // X.InterfaceC736910SvR
    public final InterfaceC149400hg getOperator() {
        return new InterfaceC629290OmF() { // from class: X.0OmC
            @Override // X.InterfaceC629290OmF
            public final Object I(String str, String str2, String str3, EnumC912680ZrG enumC912680ZrG, InterfaceC1364105Vn<? super VibeConfigResponse> interfaceC1364105Vn) {
                return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C629240OmA(str3, str, str2, enumC912680ZrG, null));
            }

            @Override // X.InterfaceC629290OmF
            public final Object LJLLL(String str, String str2, String str3, EnumC912680ZrG enumC912680ZrG, InterfaceC1364105Vn<? super VibeFeedAcceptResponse> interfaceC1364105Vn) {
                return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C629250OmB(str3, str, str2, enumC912680ZrG, null));
            }

            @Override // X.InterfaceC629290OmF
            public final Object LLJJIJIIJIL(String str, String str2, String str3, EnumC912680ZrG enumC912680ZrG, InterfaceC1364105Vn<? super VibeFeedCloseResponse> interfaceC1364105Vn) {
                return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C629280OmE(str3, str, str2, enumC912680ZrG, null));
            }

            @Override // X.InterfaceC629290OmF
            public final Object LLLLLLIL(String str, String str2, String str3, EnumC912680ZrG enumC912680ZrG, InterfaceC1364105Vn<? super VibeFeedInviteResponse> interfaceC1364105Vn) {
                return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C629270OmD(str3, str, str2, enumC912680ZrG, null));
            }
        };
    }
}
