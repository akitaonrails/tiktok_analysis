package X;

import android.content.Context;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0bPd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C972430bPd extends FrameLayout implements C0UUV {
    public boolean LL;

    @Override // X.C0UUV
    public boolean LIZ() {
        return this.LL;
    }

    public final boolean getMIsNeedIntercept() {
        return this.LL;
    }

    public C972430bPd(Context context) {
        super(context, null, 0);
        setLayoutDirection(0);
    }

    public final void setMIsNeedIntercept(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("test release oldValue = ");
        sbLIZ.append(this.LL);
        sbLIZ.append(" value = ");
        sbLIZ.append(z);
        C20441214yg.LJIIIZ("ViewInterceptFrameLayout", C2188811AlT.LIZIZ(sbLIZ));
        this.LL = z;
    }
}
