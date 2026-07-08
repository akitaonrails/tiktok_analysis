package X;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import java.util.Map;

/* JADX INFO: renamed from: X.0ctu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1029640ctu extends AbstractC1036010d4B {
    public C1029630ctt LLJILJIL;

    @Override // X.AbstractC1036010d4B, X.InterfaceC1036210d4V
    public final void LJFF(boolean z) {
    }

    @Override // X.AbstractC1036010d4B
    public final void LJIILJJIL() {
    }

    @Override // X.AbstractC1036010d4B
    public final void LJIILL(boolean z) {
    }

    @Override // X.AbstractC1036010d4B
    public TimeInterpolator getAnimInterpolator() {
        return new C21388418n4();
    }

    public C1029640ctu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.W5(C786410Ut5.Td(C786410Ut5.ne(context), R.layout.l_, this, true), new ViewGroup.MarginLayoutParams(-1, -2));
        setLynx(true);
    }

    @Override // X.AbstractC1036010d4B
    public final void LJIIZILJ(Map map, Map map2) {
        AwemeRawAd awemeRawAd;
        C1029630ctt c1029630ctt = this.LLJILJIL;
        if (c1029630ctt != null && (awemeRawAd = c1029630ctt.LIZ) != null) {
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("landing_ad", "othershow", awemeRawAd);
            if (map != null) {
                c1022820ciuLIZLLL.LIZLLL(map);
            }
            if (map2 != null) {
                c1022820ciuLIZLLL.LIZ(map2);
            }
            c1022820ciuLIZLLL.LJII();
        }
    }
}
