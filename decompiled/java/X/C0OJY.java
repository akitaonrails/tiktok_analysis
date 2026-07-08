package X;

import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0OJY, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C0OJY extends C2217421BqW implements Function1<BulletinBaseItem, Boolean> {
    public C0OJY(BulletinListViewModel bulletinListViewModel) {
        super(1, bulletinListViewModel, BulletinListViewModel.class, "needSaveBulletinBaseItem", "needSaveBulletinBaseItem(Lcom/ss/android/ugc/aweme/inbox/bulletin/data/item/BulletinBaseItem;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(BulletinBaseItem bulletinBaseItem) {
        this.receiver.getClass();
        return Boolean.valueOf(BulletinListViewModel.MQ2(bulletinBaseItem));
    }
}
