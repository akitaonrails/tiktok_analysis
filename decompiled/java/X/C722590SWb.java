package X;

import com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragmentV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0SWb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C722590SWb extends C2217421BqW implements Function1<Boolean, Unit> {
    public C722590SWb(PostModeCommentListFragmentV2 postModeCommentListFragmentV2) {
        super(1, postModeCommentListFragmentV2, PostModeCommentListFragmentV2.class, "onDescriptionVisible", "onDescriptionVisible(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        ((PostModeCommentListFragmentV2) this.receiver).iS(bool.booleanValue());
        return Unit.LIZ;
    }
}
