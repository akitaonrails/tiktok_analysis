package X;

import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentListAssemVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS126S1100000_12;
import kotlin.jvm.internal.AwS1S1700000_21;
import kotlin.jvm.internal.AwS600S0100000_21;

/* JADX INFO: renamed from: X.0l2X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1342510l2X extends C09AY implements Function1<C1397620mTQ, Unit> {
    public final /* synthetic */ Resources LL;
    public final /* synthetic */ LifecycleOwner LLILLJJLI;
    public final /* synthetic */ Comment LLILLL;
    public final /* synthetic */ InterfaceC1342370l2J LLILZ;
    public final /* synthetic */ Aweme LLILZIL;
    public final /* synthetic */ Function1<Comment, Unit> LLILZLL;
    public final /* synthetic */ C20600815jK<InterfaceC1891350zJl> LLIZ;
    public final /* synthetic */ Fragment LLIZLLLIL;
    public final /* synthetic */ String LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1342510l2X(Resources resources, CommentListAssemVM commentListAssemVM, Comment comment, InterfaceC1342370l2J interfaceC1342370l2J, Aweme aweme, AwS600S0100000_21 awS600S0100000_21, C20600815jK c20600815jK, Fragment fragment, String str) {
        super(1);
        this.LL = resources;
        this.LLILLJJLI = commentListAssemVM;
        this.LLILLL = comment;
        this.LLILZ = interfaceC1342370l2J;
        this.LLILZIL = aweme;
        this.LLILZLL = awS600S0100000_21;
        this.LLIZ = c20600815jK;
        this.LLIZLLLIL = fragment;
        this.LLJ = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397620mTQ c1397620mTQ) {
        C1397620mTQ c1397620mTQ2 = c1397620mTQ;
        c1397620mTQ2.LJFF = true;
        c1397620mTQ2.LIZJ(0, this.LL.getString(2131829197), new AwS1S1700000_21(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, 1));
        c1397620mTQ2.LIZJ(1, this.LL.getString(2131829196), new AwS126S1100000_12(this.LLJ, this.LLILZIL, 12));
        return Unit.LIZ;
    }
}
