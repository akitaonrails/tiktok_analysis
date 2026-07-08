package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorServiceV2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14ph, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20385514ph extends C09AY implements Function1<Context, View> {
    public final /* synthetic */ Function1<Context, View> LL;
    public final /* synthetic */ PlaybookAnchorServiceV2 LLILLJJLI;
    public final /* synthetic */ C20382814pG LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C20385514ph(Function1<? super Context, ? extends View> function1, PlaybookAnchorServiceV2 playbookAnchorServiceV2, C20382814pG c20382814pG) {
        super(1);
        this.LL = function1;
        this.LLILLJJLI = playbookAnchorServiceV2;
        this.LLILLL = c20382814pG;
    }

    @Override // kotlin.jvm.functions.Function1
    public final View invoke(Context context) {
        View viewInvoke;
        Context context2 = context;
        Function1<Context, View> function1 = this.LL;
        if (function1 == null || (viewInvoke = function1.invoke(context2)) == null) {
            PlaybookAnchorServiceV2 playbookAnchorServiceV2 = this.LLILLJJLI;
            C20392414qo c20392414qo = new C20392414qo((PlaybookAnchorViewModel) playbookAnchorServiceV2.LLILLJJLI, context2, playbookAnchorServiceV2.LLJI, playbookAnchorServiceV2.LLJJIII, C500260Jjc.LJJJI(Boolean.valueOf(this.LLILLL.LJJIIZI)));
            this.LLILLL.LJJIIZ = new C20388514qB(c20392414qo);
            return c20392414qo;
        }
        return viewInvoke;
    }
}
