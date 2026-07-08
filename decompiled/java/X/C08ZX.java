package X;

import android.graphics.Color;
import android.text.Spannable;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.markdown.ui.span.ForegroundAlphaSpan;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.08ZX, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08ZX implements C0DR1 {
    public C08ZW LIZJ;
    public boolean LJFF;
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1624));
    public final long LIZIZ = 500;
    public final Set<TextView> LIZLLL = new LinkedHashSet();
    public final C054G LJ = C2296808zG.LIZIZ();

    @Override // X.C0DR1
    public final void reset() {
        this.LIZJ = null;
        this.LIZLLL.clear();
    }

    public final void LIZIZ() {
        Spannable spannable;
        int length;
        C08ZW c08zw = this.LIZJ;
        if (c08zw == null) {
            return;
        }
        Set<TextView> set = this.LIZLLL;
        Map<Integer, Integer> map = c08zw.LIZIZ;
        CharSequence charSequence = c08zw.LIZ;
        if (!(charSequence instanceof Spannable) || (spannable = (Spannable) charSequence) == null) {
            return;
        }
        List listLJLLJ = C13LP.LJLLJ(C13LP.LLIIII(map.keySet()));
        int i = 0;
        for (Object obj : spannable.getSpans(0, spannable.length(), ForegroundAlphaSpan.class)) {
            spannable.removeSpan(obj);
        }
        int i2 = 0;
        for (Object obj2 : listLJLLJ) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            int iIntValue = ((Number) obj2).intValue();
            if (spannable.length() > iIntValue) {
                if (i3 < listLJLLJ.size()) {
                    length = ((Number) ListProtector.get(listLJLLJ, i3)).intValue();
                    int length2 = spannable.length();
                    if (length > length2) {
                        length = length2;
                    }
                } else {
                    length = spannable.length();
                }
                Integer num = map.get(Integer.valueOf(iIntValue));
                if (num != null) {
                    int iIntValue2 = num.intValue();
                    if (iIntValue2 > 255) {
                        iIntValue2 = 255;
                    }
                    ForegroundAlphaSpan foregroundAlphaSpan = new ForegroundAlphaSpan(Color.argb(iIntValue2, i, i, i), iIntValue2);
                    for (C21418118rr c21418118rr : (C21418118rr[]) spannable.getSpans(iIntValue, length, C21418118rr.class)) {
                        c21418118rr.LLIZ = iIntValue2;
                    }
                    C786410Ut5.o2(spannable, foregroundAlphaSpan, iIntValue, length, 17);
                }
            }
            i2 = i3;
            i = 0;
        }
        Iterator<TextView> it2 = set.iterator();
        while (it2.hasNext()) {
            it2.next().invalidate();
        }
    }

    @Override // X.C0DR1
    public final void LIZ(C688690Qzr c688690Qzr, CharSequence charSequence) {
        CharSequence charSequence2;
        C08ZW c08zw = this.LIZJ;
        if (c08zw == null) {
            this.LIZJ = new C08ZW(charSequence);
            charSequence2 = null;
        } else {
            charSequence2 = c08zw.LIZ;
        }
        C08ZW c08zw2 = this.LIZJ;
        if (c08zw2 == null) {
            return;
        }
        if (charSequence2 == null) {
            c08zw2.LIZIZ.put(0, 0);
        } else if (charSequence.length() > charSequence2.length()) {
            c08zw2.LIZIZ.put(Integer.valueOf(charSequence2.length()), 0);
        }
        c08zw2.LIZ = charSequence;
        if (c08zw2.LIZIZ.isEmpty()) {
            return;
        }
        this.LIZLLL.add(c688690Qzr);
        LIZIZ();
        if (!this.LJFF) {
            this.LJFF = true;
            C23250099c.LIZLLL(this.LJ, null, null, new C08ZV(this, null), 3);
        }
    }
}
