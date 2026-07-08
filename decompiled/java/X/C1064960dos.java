package X;

import com.ss.android.ugc.aweme.ad.feed.dialog.FeedAdDislikeSubReasonV2Dialog;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0dos, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class C1064960dos extends C2217421BqW implements Function0<Unit> {
    public C1064960dos(Object obj) {
        super(0, obj, FeedAdDislikeSubReasonV2Dialog.class, "onSelectionChanged", "onSelectionChanged()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ((FeedAdDislikeSubReasonV2Dialog) this.receiver).MR().setEnabled(!((ArrayList) r2.LLJI).isEmpty());
        return Unit.LIZ;
    }
}
