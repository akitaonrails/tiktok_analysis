package X;

import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.setting.model.BlackList;

/* JADX INFO: renamed from: X.0CPl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC313190CPl {
    @InterfaceC1501200pAU("/aweme/v1/user/block/list/")
    ListenableFuture<BlackList> LIZ(@InterfaceC1501120pAM("index") int i, @InterfaceC1501120pAM("count") int i2);
}
