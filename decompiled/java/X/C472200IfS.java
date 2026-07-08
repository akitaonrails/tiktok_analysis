package X;

import com.bytedance.android.livesdk.model.FeedItem;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0IfS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C472200IfS extends C2217421BqW implements Function1<FeedItem, Integer> {
    public static final C472200IfS LL = new C472200IfS();

    public C472200IfS() {
        super(1, C472220IfU.class, "groupPriorityFrequentlyFirst", "groupPriorityFrequentlyFirst(Lcom/bytedance/android/livesdk/model/FeedItem;)I", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Integer invoke(FeedItem feedItem) {
        return Integer.valueOf(C472220IfU.LIZ(feedItem));
    }
}
