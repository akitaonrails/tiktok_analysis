package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS240S0000000_9;

/* JADX INFO: renamed from: X.0NpJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C605710NpJ extends C2217421BqW implements Function0<Unit> {
    public C605710NpJ(BulletinProfileViewModel bulletinProfileViewModel) {
        super(0, bulletinProfileViewModel, BulletinProfileViewModel.class, "onProfileNetworkFail", "onProfileNetworkFail$awemenotice_release()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String string;
        BulletinProfileViewModel bulletinProfileViewModel = (BulletinProfileViewModel) this.receiver;
        bulletinProfileViewModel.getClass();
        bulletinProfileViewModel.setState(AFwS240S0000000_9.get$arr$(856));
        C605400Noo c605400Noo = C605400Noo.LIZ;
        Long l = bulletinProfileViewModel.LLILLJJLI;
        if (l == null || (string = l.toString()) == null) {
            string = "";
        }
        c605400Noo.getClass();
        C605400Noo.LIZ(string).LJIIIZ("account_info", EnumC620170OUd.FAIL, EnumC617610OKh.LOCAL_NETWORK_AVAILABLE.getStatusCode());
        C0OPX.LJII("BBArch [ProfileVM] onProfileNetworkFail: network error");
        return Unit.LIZ;
    }
}
