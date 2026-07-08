package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.comment.poll.PollCreateFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0DXL, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DXL extends C09AY implements Function1<Float, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ float LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ PollCreateFragment LLILZ;
    public final /* synthetic */ View LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DXL(int i, float f, int i2, PollCreateFragment pollCreateFragment, View view) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = f;
        this.LLILLL = i2;
        this.LLILZ = pollCreateFragment;
        this.LLILZIL = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Float f) {
        ViewGroup.LayoutParams layoutParams;
        int iFloatValue = (int) (this.LL - (this.LLILLJJLI * f.floatValue()));
        int i = this.LLILLL;
        if (iFloatValue < i) {
            iFloatValue = i;
        }
        PollCreateFragment pollCreateFragment = this.LLILZ;
        View view = this.LLILZIL;
        pollCreateFragment.getClass();
        if (iFloatValue > 0 && (layoutParams = view.getLayoutParams()) != null && layoutParams.height != iFloatValue) {
            layoutParams.height = iFloatValue;
            C786410Ut5.W5(view, layoutParams);
        }
        return Unit.LIZ;
    }
}
