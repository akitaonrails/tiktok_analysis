package X;

import android.content.Context;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HCa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C437100HCa extends AbstractC21434518uV {
    public final Context LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final TextView LIZLLL;
    public final Integer LJ;
    public final Integer LJFF;
    public final boolean LJI;

    @Override // X.AbstractC21434218uS
    public final Collection<String> LIZJ() {
        return C1697810uHb.LJIILJJIL("entity");
    }

    @Override // X.AbstractC21434518uV
    public final Object LJ(C21432118u7 c21432118u7, C14S7 c14s7, InterfaceC21435018ua interfaceC21435018ua) {
        Integer numLIZJ;
        boolean zLJFF = Intrinsics.LJFF(interfaceC21435018ua.name(), "entity");
        if (!this.LJI && ((Number) C1818507Ah.LIZ.getValue()).intValue() != 0) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C416540GUy(this.LIZLLL, this.LIZ, this.LIZIZ, this.LIZJ, interfaceC21435018ua.LIZIZ(), this.LJ, this.LJFF, zLJFF));
            Context context = this.LIZ;
            int iIntValue = R.attr.a1n;
            if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1n, context)) != null) {
                iIntValue = numLIZJ.intValue();
            }
            arrayList.add(new ForegroundColorSpan(iIntValue));
            return arrayList.toArray(new Object[0]);
        }
        return null;
    }

    public C437100HCa(Context context, String str, String str2, TextView textView, Integer num, Integer num2, boolean z) {
        this.LIZ = context;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = textView;
        this.LJ = num;
        this.LJFF = num2;
        this.LJI = z;
    }
}
