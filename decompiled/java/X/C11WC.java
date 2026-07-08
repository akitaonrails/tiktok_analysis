package X;

import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.wiki.CheckAnchorModerationResultResponse;

/* JADX INFO: renamed from: X.11WC, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public interface C11WC {
    public static final C11WD LIZ = C11WD.LIZ;

    @InterfaceC1501200pAU("aweme/v1/anchor/add/check/")
    ListenableFuture<CheckAnchorModerationResultResponse> LIZ(@InterfaceC1501120pAM("type") int i, @InterfaceC1501120pAM("url") String str, @InterfaceC1501120pAM("keyword") String str2, @InterfaceC1501120pAM("language") String str3, @InterfaceC1501120pAM("subtype") String str4);
}
