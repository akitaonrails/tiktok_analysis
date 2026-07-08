package X;

import android.view.View;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.CommonCommentKeyboard;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0TLW, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TLW extends C09AY implements Function0<Unit> {
    public final /* synthetic */ CommonCommentKeyboard LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ float LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0TLW(CommonCommentKeyboard commonCommentKeyboard, int i, float f) {
        super(0);
        this.LL = commonCommentKeyboard;
        this.LLILLJJLI = i;
        this.LLILLL = f;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        View viewLJJIJL = this.LL.LJJIJL();
        int i = this.LLILLJJLI;
        float f = this.LLILLL;
        if (C426750GoL.LIZLLL(viewLJJIJL.getContext())) {
            if (i == 0) {
                C786410Ut5.Jc(viewLJJIJL, viewLJJIJL.getMeasuredWidth() * f);
            } else {
                C786410Ut5.Jc(viewLJJIJL, viewLJJIJL.getMeasuredWidth());
            }
        } else if (i == 0) {
            C786410Ut5.Jc(viewLJJIJL, (-viewLJJIJL.getMeasuredWidth()) * f);
        } else {
            C786410Ut5.Jc(viewLJJIJL, -viewLJJIJL.getMeasuredWidth());
        }
        return Unit.LIZ;
    }
}
