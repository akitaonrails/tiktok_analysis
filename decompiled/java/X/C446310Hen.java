package X;

import Y.ARunnableS17S0101000_6;
import android.text.Editable;
import android.text.Spanned;
import android.text.TextWatcher;
import android.widget.EditText;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Hen, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C446310Hen implements TextWatcher {
    public final EditText LL;
    public boolean LLILLJJLI;
    public final Map<Pair<Integer, Integer>, List<C446320Heo>> LLILLL = new LinkedHashMap();
    public String LLILZ = "";
    public int LLILZIL;
    public int LLILZLL;

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C446310Hen(C21397018oS c21397018oS) {
        this.LL = c21397018oS;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (editable != null && this.LLILLJJLI && (!this.LLILLL.isEmpty())) {
            this.LL.removeTextChangedListener(this);
            for (Map.Entry entry : ((LinkedHashMap) this.LLILLL).entrySet()) {
                Pair pair = (Pair) entry.getKey();
                List<C446320Heo> list = (List) entry.getValue();
                int iIntValue = ((Number) pair.getFirst()).intValue();
                int iIntValue2 = ((Number) pair.getSecond()).intValue();
                if (iIntValue2 <= this.LLILZ.length() && this.LLILZ.substring(iIntValue, iIntValue2).length() != 0) {
                    for (C446320Heo c446320Heo : list) {
                        editable.setSpan(c446320Heo.LIZ, iIntValue, iIntValue2, c446320Heo.LIZIZ);
                    }
                }
            }
            ((LinkedHashMap) this.LLILLL).clear();
            this.LLILLJJLI = false;
            HandlerHook.viewPost(this.LL, new ARunnableS17S0101000_6(C13LZ.LJ(this.LLILZIL + this.LLILZLL, 0, editable.length()), this, 15));
            this.LL.addTextChangedListener(this);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        this.LLILLJJLI = false;
        this.LLILZIL = i;
        this.LLILZLL = i3;
        if (charSequence != null) {
            if (i == 0 && i2 == charSequence.length()) {
                z = true;
            } else {
                z = false;
            }
            this.LLILLJJLI = z;
            this.LLILZ = charSequence.toString();
            ((LinkedHashMap) this.LLILLL).clear();
            if (this.LLILLJJLI && (charSequence instanceof Spanned)) {
                int iMin = Math.min(i2, i3);
                Spanned spanned = (Spanned) charSequence;
                for (Object obj : spanned.getSpans(0, iMin, Object.class)) {
                    int spanStart = spanned.getSpanStart(obj);
                    int spanEnd = spanned.getSpanEnd(obj);
                    if (spanEnd > spanStart && spanEnd < iMin) {
                        int spanFlags = spanned.getSpanFlags(obj);
                        Pair pair = new Pair(Integer.valueOf(spanStart), Integer.valueOf(spanEnd));
                        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLILLL;
                        Object arrayList = linkedHashMap.get(pair);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            linkedHashMap.put(pair, arrayList);
                        }
                        ((List) arrayList).add(new C446320Heo(spanFlags, obj));
                    }
                }
            }
        }
    }
}
