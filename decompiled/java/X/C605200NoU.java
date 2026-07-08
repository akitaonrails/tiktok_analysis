package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinSettingList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0NoU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C605200NoU extends C2217421BqW implements Function1<BulletinSettingList, Unit> {
    public C605200NoU(BulletinProfileViewModel bulletinProfileViewModel) {
        super(1, bulletinProfileViewModel, BulletinProfileViewModel.class, "onSettingsSuccess", "onSettingsSuccess$awemenotice_release(Lcom/ss/android/ugc/aweme/notice/repo/list/bean/BulletinSettingList;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(BulletinSettingList bulletinSettingList) {
        BulletinProfileViewModel bulletinProfileViewModel = (BulletinProfileViewModel) this.receiver;
        bulletinProfileViewModel.bR2(null, bulletinSettingList);
        bulletinProfileViewModel.LLJLL = true;
        C0OPX.LJII("BBArch [ProfileVM] onSettingsSuccess: authoritative settings applied");
        return Unit.LIZ;
    }
}
