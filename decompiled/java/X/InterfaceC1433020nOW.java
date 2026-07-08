package X;

import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.liveevent.LiveEventResponse;

/* JADX INFO: renamed from: X.0nOW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public interface InterfaceC1433020nOW {
    @InterfaceC1501200pAU("/tiktok/event/list/v1")
    ListenableFuture<LiveEventResponse> LIZ(@InterfaceC1501120pAM("host_user_id") String str, @InterfaceC1501120pAM("query_type") int i, @InterfaceC1501120pAM("offset") int i2, @InterfaceC1501120pAM("count") int i3);
}
