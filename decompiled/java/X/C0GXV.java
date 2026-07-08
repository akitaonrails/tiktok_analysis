package X;

import android.content.Context;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0GXV, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GXV extends C09AY implements Function0<TuxIconDrawable> {
    public final /* synthetic */ Context LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0GXV(Context context) {
        super(0);
        this.LL = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final TuxIconDrawable invoke() {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LIZ = R.raw.icon_pen_fill;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a0o);
        return c419910GdJ.LIZ(this.LL);
    }
}
