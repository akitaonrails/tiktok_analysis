package X;

import android.graphics.Rect;
import com.ss.android.ugc.aweme.tako.botpage.components.sug.TakoSugAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14IL, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14IL extends C09AY implements Function1<C14IN, Unit> {
    public final /* synthetic */ Integer LL;
    public final /* synthetic */ TakoSugAssem LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14IL(Integer num, TakoSugAssem takoSugAssem, int i, int i2, int i3, int i4) {
        super(1);
        this.LL = num;
        this.LLILLJJLI = takoSugAssem;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = i3;
        this.LLILZLL = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C14IN c14in) {
        C14IN c14in2 = c14in;
        if (this.LL != null) {
            c14in2.LIZ = 0;
            c14in2.LIZJ = Integer.valueOf(this.LLILLJJLI.op(this.LL.intValue()));
        } else {
            c14in2.LIZ = 1;
            c14in2.LIZIZ = Integer.valueOf(this.LLILLJJLI.op(R.attr.uk));
        }
        c14in2.LJ = Float.valueOf(this.LLILLJJLI.sp());
        c14in2.LJIIIIZZ = null;
        c14in2.LJIIJ = new Rect(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILLL))), this.LLILZ, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILZIL))), this.LLILZLL);
        c14in2.LJIIJJI = Float.valueOf(0.0f);
        return Unit.LIZ;
    }
}
