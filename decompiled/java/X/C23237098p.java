package X;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;

/* JADX INFO: renamed from: X.098p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23237098p extends TuxTextView {
    public static final /* synthetic */ int LLJJJJLIIL = 0;
    public final C054G LLJJJJ;
    public AnonymousClass0956 LLJJJJJIL;

    public final void LJJJJJ(long j) {
        long jLJIIIIZZ = C19990313Jl.LJIIIIZZ(j, EnumC19990213Jk.MILLISECONDS);
        setText(C786410Ut5.j4("%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(C19990113Jj.LJIIJ(jLJIIIIZZ)), Long.valueOf(C19990113Jj.LJIIJJI(jLJIIIIZZ))}, 2)));
    }

    public C23237098p(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.z4);
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLJJJJ = C2296808zG.LIZ(C2107308Nj.LIZ.LLIILII());
    }
}
