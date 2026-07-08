package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: renamed from: X.0UAV, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UAV extends LinearLayout {
    public final int LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public boolean LLILZIL;
    public LiveEffect LLILZLL;
    public C0UBJ LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;

    private final View getFavoriteContent() {
        return (View) this.LLILZ.getValue();
    }

    public final C16F5 getFavoriteTextView() {
        return (C16F5) this.LLILLL.getValue();
    }

    public final C20588315hJ getMIconIV() {
        return (C20588315hJ) this.LLILLJJLI.getValue();
    }

    public final void LIZJ() {
        getFavoriteContent().setBackgroundResource(R.drawable.ef9);
    }

    public final C0UBJ getFavoriteStatusListener() {
        return this.LLIZ;
    }

    public final int getMinWidth() {
        return this.LL;
    }

    public final boolean getNeedCallback() {
        return this.LLJI;
    }

    public final boolean getShowEnable() {
        return this.LLIZLLLIL;
    }

    public final void setFavoriteStatusListener(C0UBJ c0ubj) {
        this.LLIZ = c0ubj;
    }

    public final void setNeedCallback(boolean z) {
        this.LLJI = z;
    }

    public final void setShowEnable(boolean z) {
        this.LLIZLLLIL = z;
    }

    public C0UAV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = (int) C497740JfY.LIZIZ(32.0f);
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS556S0100000_12(this, 718));
        this.LLILLL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 717));
        this.LLILZ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 716));
        this.LLIZLLLIL = true;
        this.LLJI = true;
    }

    public final void LIZ(LiveEffect liveEffect, boolean z, Function0<Unit> function0) {
        if (!this.LLIZLLLIL) {
            C786410Ut5.LLJJLIIIJLLLLLLLZ(this, 8);
            return;
        }
        if (liveEffect == null) {
            C786410Ut5.LLJJLIIIJLLLLLLLZ(this, 8);
            return;
        }
        C786410Ut5.LLJJLIIIJLLLLLLLZ(this, 0);
        C500260Jjc.LJIILIIL(getFavoriteTextView());
        this.LLILZLL = liveEffect;
        this.LLILZIL = z;
        function0.invoke();
    }

    public static void LIZIZ(C0UAV c0uav, LiveEffect liveEffect, boolean z, boolean z2, int i) {
        boolean z3 = false;
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            z3 = true;
        }
        c0uav.LLJI = z3;
        if (z2) {
            c0uav.LIZ(liveEffect, z, new AwS556S0100000_12(c0uav, 719));
        } else {
            c0uav.LIZ(liveEffect, z, new AwS556S0100000_12(c0uav, 720));
        }
    }
}
