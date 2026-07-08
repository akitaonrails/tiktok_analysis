package X;

import android.content.Context;
import com.ss.android.ugc.aweme.tako.router.ITakoRouterService;
import kotlin.jvm.internal.AFwS219S0000000_30;

/* JADX INFO: renamed from: X.14Fg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20234214Fg extends AbstractC1864010ybf {
    public static final C01GW<ITakoRouterService> LJIILJJIL = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(280));
    public final String LJIIL;
    public final String LJIILIIL;

    @Override // X.AbstractC1864010ybf
    public final String LIZ() {
        return this.LJIIL;
    }

    @Override // X.AbstractC1864010ybf
    public final String LIZIZ() {
        return this.LJIILIIL;
    }

    public final void LJII(Context context) {
        ITakoRouterService value = LJIILJJIL.getValue();
        if (value != null) {
            value.LIZ(context, this);
        }
    }

    public C20234214Fg(String str, String str2) {
        this.LJIIL = str;
        this.LJIILIIL = str2;
    }
}
