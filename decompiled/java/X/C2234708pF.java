package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.comment.longpresspanel.ui.CommentLongPressFragment;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.story.model.ContentReuseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AwS582S0100000_3;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: renamed from: X.08pF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2234708pF extends C09AY implements Function1<InterfaceC2234608pE, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ ContentReuseResponse LLILLJJLI;
    public final /* synthetic */ CommentLongPressFragment LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ Comment LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2234708pF(boolean z, ContentReuseResponse contentReuseResponse, CommentLongPressFragment commentLongPressFragment, Context context, Comment comment) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = contentReuseResponse;
        this.LLILLL = commentLongPressFragment;
        this.LLILZ = context;
        this.LLILZIL = comment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC2234608pE interfaceC2234608pE) {
        InterfaceC2234608pE interfaceC2234608pE2 = interfaceC2234608pE;
        if (!this.LL) {
            ContentReuseResponse contentReuseResponse = this.LLILLJJLI;
            if (contentReuseResponse == null) {
                interfaceC2234608pE2.LIZ(new AwS585S0100000_6(this.LLILZ, 50));
                interfaceC2234608pE2.LIZJ(AFwS231S0000000_3.get$arr$(29));
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LLILLL), null, null, new C2234508pD(this.LLILZIL, interfaceC2234608pE2, this.LLILLL, null), 3);
            } else {
                Integer num = contentReuseResponse.allowReuseOfContent;
                if (num == null || num.intValue() != 1) {
                    interfaceC2234608pE2.LIZJ(new AwS582S0100000_3(this.LLILLL, 30));
                }
            }
        }
        return Unit.LIZ;
    }
}
