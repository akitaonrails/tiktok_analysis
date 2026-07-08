package X;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.18p9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21401318p9 implements TextWatcher, SpanWatcher {
    public final Object LL;
    public final AtomicInteger LLILLJJLI = new AtomicInteger(0);

    public C21401318p9(Object obj) {
        this.LL = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.LL).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((TextWatcher) this.LL).beforeTextChanged(charSequence, i, i2, i3);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
        if (this.LLILLJJLI.get() > 0 && (obj instanceof AbstractC21403418pU)) {
            return;
        }
        ((SpanWatcher) this.LL).onSpanAdded(spannable, obj, i, i2);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
        if (this.LLILLJJLI.get() > 0 && (obj instanceof AbstractC21403418pU)) {
            return;
        }
        ((SpanWatcher) this.LL).onSpanRemoved(spannable, obj, i, i2);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((TextWatcher) this.LL).onTextChanged(charSequence, i, i2, i3);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
        int i5 = i3;
        int i6 = i;
        if (this.LLILLJJLI.get() > 0 && (obj instanceof AbstractC21403418pU)) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28) {
            if (i6 > i2) {
                i6 = 0;
            }
            if (i5 > i4) {
                i5 = 0;
            }
        }
        ((SpanWatcher) this.LL).onSpanChanged(spannable, obj, i6, i2, i5, i4);
    }
}
