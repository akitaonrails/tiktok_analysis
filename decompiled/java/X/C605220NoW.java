package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountInfoResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0NoW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C605220NoW extends C2217421BqW implements Function1<BulletinAccountInfoResponse, Unit> {
    public C605220NoW(BulletinProfileViewModel bulletinProfileViewModel) {
        super(1, bulletinProfileViewModel, BulletinProfileViewModel.class, "onProfileDbSuccess", "onProfileDbSuccess$awemenotice_release(Lcom/ss/android/ugc/aweme/notice/repo/list/bean/BulletinAccountInfoResponse;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(BulletinAccountInfoResponse bulletinAccountInfoResponse) {
        ((BulletinProfileViewModel) this.receiver).vQ2(bulletinAccountInfoResponse);
        C0OPX.LJII("BBArch [ProfileVM] onProfileDbSuccess: DB fields applied");
        return Unit.LIZ;
    }
}
