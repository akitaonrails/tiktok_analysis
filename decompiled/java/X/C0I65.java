package X;

import android.graphics.Bitmap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0I65, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I65 extends C09AY implements Function1<C0I66, C0I66> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0I65(int i, int i2, boolean z, boolean z2) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = z;
        this.LLILZ = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0I66 invoke(C0I66 c0i66) {
        C0I66 c0i662 = c0i66;
        c0i662.LJIIL = true;
        c0i662.LJIILIIL = Bitmap.Config.ARGB_8888;
        c0i662.LIZLLL = this.LL;
        c0i662.LIZJ = this.LLILLJJLI;
        boolean z = this.LLILLL;
        c0i662.LJI = z;
        if (!z) {
            c0i662.LJIIIIZZ = this.LLILZ;
            c0i662.LJI = false;
            c0i662.LJIIIZ = true;
            c0i662.LIZ();
        }
        return c0i662;
    }
}
