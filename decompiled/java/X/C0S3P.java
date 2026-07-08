package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0S3P, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public abstract class C0S3P extends AbstractC714940S2q {
    public final C0S3T LJIIJJI;
    public InterfaceC714910S2n LJIIL;

    public abstract int LJFF();

    public abstract InterfaceC714910S2n LJI();

    @Override // X.AbstractC714940S2q
    public final InterfaceC714910S2n LIZJ() {
        if (this.LJIIL == null) {
            this.LJIIL = LJI();
        }
        return this.LJIIL;
    }

    @Override // X.AbstractC714940S2q
    public View LIZIZ(Context context, ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(context), LJFF(), viewGroup, false);
    }

    public C0S3P(int i, ViewGroup.LayoutParams layoutParams, C0S3T c0s3t) {
        super(i, layoutParams);
        this.LJIIJJI = c0s3t;
    }
}
