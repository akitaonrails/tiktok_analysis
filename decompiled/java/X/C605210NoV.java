package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountInfoResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBoardInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0NoV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C605210NoV extends C2217421BqW implements Function1<BulletinAccountInfoResponse, Unit> {
    public C605210NoV(BulletinProfileViewModel bulletinProfileViewModel) {
        super(1, bulletinProfileViewModel, BulletinProfileViewModel.class, "onProfileNetworkSuccess", "onProfileNetworkSuccess$awemenotice_release(Lcom/ss/android/ugc/aweme/notice/repo/list/bean/BulletinAccountInfoResponse;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(BulletinAccountInfoResponse bulletinAccountInfoResponse) {
        BulletinAccountInfoResponse bulletinAccountInfoResponse2 = bulletinAccountInfoResponse;
        BulletinProfileViewModel bulletinProfileViewModel = (BulletinProfileViewModel) this.receiver;
        bulletinProfileViewModel.vQ2(bulletinAccountInfoResponse2);
        if (bulletinProfileViewModel.LLJLL) {
            C0OPX.LJII("BBArch [ProfileVM] applyFallbackSettings skipped: authoritative settings already applied");
        } else {
            bulletinProfileViewModel.bR2(bulletinAccountInfoResponse2, null);
        }
        BulletinBoardInfo bulletinBoardInfo = bulletinAccountInfoResponse2.accountInfo;
        if (bulletinBoardInfo != null) {
            bulletinProfileViewModel.WQ2(bulletinBoardInfo);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BBArch [ProfileVM] onProfileNetworkSuccess: fields applied (settingsApplied=");
        sbLIZ.append(bulletinProfileViewModel.LLJLL);
        sbLIZ.append(')');
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }
}
