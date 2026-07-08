package X;

import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SI3, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SI3 extends C09AY implements Function0<TuxIconDrawable> {
    public final /* synthetic */ C718770SHj LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SI3(C718770SHj c718770SHj) {
        super(0);
        this.LL = c718770SHj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final TuxIconDrawable invoke() {
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        C718770SHj c718770SHj = this.LL;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_chevron_down_fill;
        c419910GdJ.LJ = Integer.valueOf(c718770SHj.LJJJJ());
        c419910GdJ.LIZIZ = iLIZIZ;
        c419910GdJ.LIZJ = iLIZIZ;
        return c419910GdJ.LIZ(this.LL.LLJ.getContext());
    }
}
