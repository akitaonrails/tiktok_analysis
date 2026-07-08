package X;

import android.content.Context;
import android.view.ContextThemeWrapper;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.cell.LiveDecorationCell;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0H5c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C435300H5c extends C09AY implements Function1<C197039127h, Unit> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ LiveDecorationCell LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C435300H5c(Context context, boolean z, LiveDecorationCell liveDecorationCell) {
        super(1);
        this.LL = context;
        this.LLILLJJLI = z;
        this.LLILLL = liveDecorationCell;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C197039127h c197039127h) {
        C197039127h c197039127h2 = c197039127h;
        boolean z = this.LLILLJJLI;
        Context context = this.LL;
        C384050F3z c384050F3z = new C384050F3z();
        if (z) {
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.exq);
        } else {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.c9i, new ContextThemeWrapper(context, R.style.z4));
            if (numLIZJ != null) {
                c384050F3z.LIZ = Integer.valueOf(numLIZJ.intValue());
            }
        }
        c197039127h2.setBackground(c384050F3z.LIZ(this.LL));
        c197039127h2.LJJLI(true);
        if (this.LLILLJJLI) {
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.c9i, new ContextThemeWrapper(this.LL, R.style.z4));
            if (numLIZJ2 != null) {
                c197039127h2.setTextColor(numLIZJ2.intValue());
            }
        } else {
            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.c5r, new ContextThemeWrapper(this.LLILLL.getContext(), R.style.z4));
            if (numLIZJ3 != null) {
                c197039127h2.setTextColor(numLIZJ3.intValue());
            }
        }
        return Unit.LIZ;
    }
}
