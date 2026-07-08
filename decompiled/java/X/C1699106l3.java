package X;

import Y.ACListenerS106S0200000_2;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.06l3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1699106l3 extends CardView implements C06OA {
    public final /* synthetic */ C06ME LLIZLLLIL;

    @Override // X.C06OA
    public final void LLLZIL(C06MF c06mf) {
        this.LLIZLLLIL.LLLZIL(c06mf);
    }

    @Override // X.C06OA
    public final void LLZLI() {
        this.LLIZLLLIL.LLZLI();
    }

    @Override // X.C06OA
    public final void l(C06MF c06mf) {
        this.LLIZLLLIL.l(c06mf);
    }

    public C1699106l3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLIZLLLIL = new C06ME();
        C786410Ut5.LJLLJ(context, R.layout.cem, this);
    }

    public final void LJIIIIZZ(C19EG c19eg, C1699306l5 c1699306l5, Function0<Unit> function0) {
        C786410Ut5.h9((TuxTextView) findViewById(R.id.m04), new ACListenerS106S0200000_2(c1699306l5, c19eg, 1));
        C786410Ut5.a9((TuxIconView) findViewById(R.id.fy2), new ACListenerS106S0200000_2(function0, this, 2));
        String string = getContext().getString(2131830883);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c1699306l5.LJ);
        sbLIZ.append('/');
        sbLIZ.append(c1699306l5.LJFF);
        ((TextView) findViewById(R.id.j8a)).setText(C786410Ut5.j4(string, new Object[]{c1699306l5.LIZLLL, C2188811AlT.LIZIZ(sbLIZ)}));
    }
}
