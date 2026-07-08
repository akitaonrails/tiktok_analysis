package X;

import com.ss.android.ugc.aweme.detail.ui.DetailFeedVideoViewHolder;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Rvj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C711610Rvj extends C2217421BqW implements Function1<C0RF0, DetailFeedVideoViewHolder> {
    public static final C711610Rvj LL = new C711610Rvj();

    public C711610Rvj() {
        super(1, DetailFeedVideoViewHolder.class, "<init>", "<init>(Lcom/ss/android/ugc/aweme/feed/adapter/VideoViewHolderProducerParams;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final DetailFeedVideoViewHolder invoke(C0RF0 c0rf0) {
        return new DetailFeedVideoViewHolder(c0rf0);
    }
}
