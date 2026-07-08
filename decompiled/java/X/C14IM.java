package X;

import android.graphics.Rect;
import com.ss.android.ugc.aweme.tako.botpage.components.sug.TakoSugAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14IM, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14IM extends C09AY implements Function1<C14IN, Unit> {
    public final /* synthetic */ TakoSugAssem LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ float LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14IM(TakoSugAssem takoSugAssem, int i, float f) {
        super(1);
        this.LL = takoSugAssem;
        this.LLILLJJLI = i;
        this.LLILLL = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C14IN c14in) {
        Rect rect;
        C14IN c14in2 = c14in;
        c14in2.LIZ = 1;
        c14in2.LIZIZ = Integer.valueOf(this.LL.op(R.attr.a01));
        c14in2.LJ = Float.valueOf(this.LL.sp());
        if (this.LL.up()) {
            rect = null;
        } else {
            rect = new Rect(this.LLILLJJLI, 0, 0, 0);
        }
        c14in2.LJIIIIZZ = rect;
        c14in2.LJIIIZ = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        c14in2.LJI = Integer.valueOf((int) this.LLILLL);
        return Unit.LIZ;
    }
}
