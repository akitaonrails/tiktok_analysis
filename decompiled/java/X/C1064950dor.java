package X;

import com.ss.android.ugc.aweme.ad.feed.dialog.FeedAdDislikeSubReasonV2Dialog;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0dor, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class C1064950dor extends C2217421BqW implements Function2<String, Integer, Unit> {
    public C1064950dor(Object obj) {
        super(2, obj, FeedAdDislikeSubReasonV2Dialog.class, "onReasonUnselected", "onReasonUnselected(Ljava/lang/String;I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, Integer num) {
        num.intValue();
        ((ArrayList) ((FeedAdDislikeSubReasonV2Dialog) this.receiver).LLJI).remove(str);
        return Unit.LIZ;
    }
}
