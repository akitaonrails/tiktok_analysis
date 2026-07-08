package X;

import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0g2I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1150160g2I {
    public final List<Object> LIZ = new ArrayList();
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;

    public final void LIZ(Object obj) {
        if (obj != null) {
            if (obj instanceof ClickableSpan) {
                ListProtector.add(this.LIZ, 0, obj);
            } else {
                ((ArrayList) this.LIZ).add(obj);
            }
        }
    }

    public final void LIZIZ(SpannableStringBuilder spannableStringBuilder) {
        Iterator it2 = ((ArrayList) this.LIZ).iterator();
        while (it2.hasNext()) {
            C786410Ut5.q2(spannableStringBuilder, it2.next(), this.LIZIZ, this.LIZJ, this.LIZLLL);
        }
    }
}
