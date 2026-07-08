package X;

import com.ss.android.ugc.aweme.inbox.bulletin.share.BulletinShareModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountEditResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBoardInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinPublishAction;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0OIS, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OIS extends C09AY implements Function1<C0OKY, C0OKY> {
    public final /* synthetic */ BulletinBoardInfo LL;
    public final /* synthetic */ BulletinProfileViewModel LLILLJJLI;
    public final /* synthetic */ BulletinAccountEditResponse LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ BulletinShareModel LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OIS(BulletinBoardInfo bulletinBoardInfo, BulletinProfileViewModel bulletinProfileViewModel, BulletinAccountEditResponse bulletinAccountEditResponse, int i, BulletinShareModel bulletinShareModel) {
        super(1);
        this.LL = bulletinBoardInfo;
        this.LLILLJJLI = bulletinProfileViewModel;
        this.LLILLL = bulletinAccountEditResponse;
        this.LLILZ = i;
        this.LLILZIL = bulletinShareModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0OKY invoke(C0OKY c0oky) {
        ArrayList arrayList;
        long jLongValue;
        C0OKY c0oky2 = c0oky;
        C1623606Xi c1623606Xi = new C1623606Xi(this.LL);
        ArrayList arrayList2 = null;
        EnumC617480OJu enumC617480OJuLIZ = C0OIV.LIZ(c0oky2.LLILLJJLI.LIZ(), null, this.LL.status);
        BulletinProfileViewModel bulletinProfileViewModel = this.LLILLJJLI;
        BulletinBoardInfo bulletinBoardInfo = this.LL;
        long j = bulletinBoardInfo.bulletinId;
        BulletinAccountEditResponse bulletinAccountEditResponse = this.LLILLL;
        List<InterfaceC1891350zJl> listIQ2 = bulletinProfileViewModel.IQ2(j, bulletinAccountEditResponse.bulletinFunctionSettings, bulletinAccountEditResponse.functionList, bulletinBoardInfo.editQuota, bulletinBoardInfo.status, Integer.valueOf(this.LLILZ));
        List<BulletinPublishAction> list = this.LLILLL.plusPostSettingList;
        if (list != null) {
            BulletinProfileViewModel bulletinProfileViewModel2 = this.LLILLJJLI;
            arrayList = new ArrayList();
            for (BulletinPublishAction bulletinPublishAction : list) {
                BulletinPublishAction bulletinPublishAction2 = bulletinPublishAction;
                if (!bulletinProfileViewModel2.GQ2() || bulletinPublishAction2.getPublishActionType() != EnumC620430OVd.IMAGE_UPLOAD.getPostType()) {
                    arrayList.add(bulletinPublishAction);
                }
            }
        } else {
            arrayList = null;
        }
        List<BulletinPublishAction> list2 = this.LLILLL.quickPostSettingList;
        if (list2 != null) {
            BulletinProfileViewModel bulletinProfileViewModel3 = this.LLILLJJLI;
            arrayList2 = new ArrayList();
            for (BulletinPublishAction bulletinPublishAction3 : list2) {
                BulletinPublishAction bulletinPublishAction4 = bulletinPublishAction3;
                if (!bulletinProfileViewModel3.GQ2() || bulletinPublishAction4.getPublishActionType() != EnumC620430OVd.IMAGE_UPLOAD.getPostType()) {
                    arrayList2.add(bulletinPublishAction3);
                }
            }
        }
        Long l = this.LL.quota;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        BulletinAccountEditResponse bulletinAccountEditResponse2 = this.LLILLL;
        return C0OKY.LIZ(c0oky2, c1623606Xi, null, null, this.LLILZIL, arrayList2, arrayList, 0L, enumC617480OJuLIZ, null, null, null, null, null, listIQ2, null, null, null, null, jLongValue, bulletinAccountEditResponse2.bizResourceEntry, bulletinAccountEditResponse2.embeddedPublishContent, bulletinAccountEditResponse2.toolkitOrders, null, null, null, null, null, false, null, null, 2139602758);
    }
}
