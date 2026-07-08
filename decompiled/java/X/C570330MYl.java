package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0MYl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C570330MYl {
    public final AwemeDraft LIZ;
    public final C560950LzJ LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final Function1<InterfaceC1364105Vn<? super Unit>, Object> LJ;
    public final Function1<InterfaceC1364105Vn<? super Unit>, Object> LJFF;
    public final Function1<InterfaceC1364105Vn<? super Unit>, Object> LJI;

    public C570330MYl(AwemeDraft awemeDraft, C560950LzJ c560950LzJ, boolean z, C0M52 c0m52, Function1 function1, int i) {
        boolean z2;
        if ((i & 4) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        z = (i & 8) != 0 ? false : z;
        c0m52 = (i & 16) != 0 ? null : c0m52;
        function1 = (i & 64) != 0 ? null : function1;
        this.LIZ = awemeDraft;
        this.LIZIZ = c560950LzJ;
        this.LIZJ = z2;
        this.LIZLLL = z;
        this.LJ = c0m52;
        this.LJFF = null;
        this.LJI = function1;
    }
}
