package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0Pxj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C661890Pxj extends C661440Px0 {
    public InterfaceC676520QgE LLLLIIL;

    public final InterfaceC676520QgE getAutoPlayHandler() {
        return this.LLLLIIL;
    }

    public C661890Pxj(Context context) {
        super(context, null, 0);
    }

    @Override // X.C661440Px0
    public final void LIZLLL(Aweme aweme) {
        super.LIZLLL(aweme);
        C661850Pxf core = getCore();
        if (core != null) {
            int fitType = core.getFitType();
            C661850Pxf core2 = getCore();
            if (core2 != null) {
                core2.setFitType(fitType);
            }
        }
    }

    public final void setAutoPlayHandler(InterfaceC676520QgE interfaceC676520QgE) {
        this.LLLLIIL = interfaceC676520QgE;
    }
}
