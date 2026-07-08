package X;

import android.util.Size;
import android.view.MotionEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0k60, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1306220k60 extends C09AY implements Function1<MotionEvent, Boolean> {
    public final /* synthetic */ Function2<Integer, Integer, Unit> LL;
    public final /* synthetic */ C1690080u58 LLILLJJLI;
    public final /* synthetic */ Function1<Boolean, Unit> LLILLL;
    public final /* synthetic */ C05P0<Size> LLILZ;
    public final /* synthetic */ C05P0<Size> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1306220k60(Function2<? super Integer, ? super Integer, Unit> function2, C1690080u58 c1690080u58, Function1<? super Boolean, Unit> function1, C05P0<Size> c05p0, C05P0<Size> c05p02) {
        super(1);
        this.LL = function2;
        this.LLILLJJLI = c1690080u58;
        this.LLILLL = function1;
        this.LLILZ = c05p0;
        this.LLILZIL = c05p02;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        if (motionEvent2.getAction() == 0) {
            this.LL.invoke(Integer.valueOf(this.LLILLJJLI.LJII()), Integer.valueOf(this.LLILLJJLI.LJIIIIZZ()));
            if (motionEvent2.getY() > this.LLILZ.getValue().getHeight() - this.LLILZIL.getValue().getHeight()) {
                this.LLILLL.invoke(Boolean.FALSE);
            } else {
                this.LLILLL.invoke(Boolean.TRUE);
            }
        }
        return Boolean.FALSE;
    }
}
