package X;

import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.mvtemplate.model.MvDetailListModel;
import com.ss.android.ugc.aweme.mvtemplate.model.MvDetailModel;

/* JADX INFO: renamed from: X.0Ozy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC637800Ozy {
    @InterfaceC1501200pAU("/aweme/v1/mv/detail/")
    ListenableFuture<MvDetailModel> LIZ(@InterfaceC1501120pAM("mv_id") String str, @InterfaceC1501120pAM("mv_template_type") int i, @InterfaceC1501120pAM("source_id") int i2);

    @InterfaceC1501200pAU("/aweme/v1/mv/aweme/")
    ListenableFuture<MvDetailListModel> LIZIZ(@InterfaceC1501120pAM("mv_id") String str, @InterfaceC1501120pAM("cursor") long j, @InterfaceC1501120pAM("mv_template_type") int i, @InterfaceC1501120pAM("source_id") int i2);
}
