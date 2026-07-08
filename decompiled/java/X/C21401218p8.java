package X;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.18p8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21401218p8 extends SpannableStringBuilder {
    public final Class<?> LL;
    public final List<C21401318p9> LLILLJJLI;

    public final void LIZ() {
        for (int i = 0; i < ((ArrayList) this.LLILLJJLI).size(); i++) {
            ((C21401318p9) ListProtector.get(this.LLILLJJLI, i)).LLILLJJLI.incrementAndGet();
        }
    }

    public final void LJ() {
        for (int i = 0; i < ((ArrayList) this.LLILLJJLI).size(); i++) {
            ((C21401318p9) ListProtector.get(this.LLILLJJLI, i)).LLILLJJLI.decrementAndGet();
        }
    }

    public final void LIZIZ() {
        LJ();
        for (int i = 0; i < ((ArrayList) this.LLILLJJLI).size(); i++) {
            ((C21401318p9) ListProtector.get(this.LLILLJJLI, i)).onTextChanged(this, 0, length(), length());
        }
    }

    public final C21401318p9 LIZJ(Object obj) {
        for (int i = 0; i < this.LLILLJJLI.size(); i++) {
            C21401318p9 c21401318p9 = (C21401318p9) ListProtector.get(this.LLILLJJLI, i);
            if (c21401318p9.LL == obj) {
                return c21401318p9;
            }
        }
        return null;
    }

    public final boolean LIZLLL(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this.LL != obj.getClass()) {
            return false;
        }
        return true;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        C21401318p9 c21401318p9LIZJ;
        if (LIZLLL(obj) && (c21401318p9LIZJ = LIZJ(obj)) != null) {
            obj = c21401318p9LIZJ;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        C21401318p9 c21401318p9LIZJ;
        if (LIZLLL(obj) && (c21401318p9LIZJ = LIZJ(obj)) != null) {
            obj = c21401318p9LIZJ;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        C21401318p9 c21401318p9LIZJ;
        if (LIZLLL(obj) && (c21401318p9LIZJ = LIZJ(obj)) != null) {
            obj = c21401318p9LIZJ;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        C21401318p9 c21401318p9LIZJ;
        if (LIZLLL(obj)) {
            c21401318p9LIZJ = LIZJ(obj);
            if (c21401318p9LIZJ != null) {
                obj = c21401318p9LIZJ;
            }
        } else {
            c21401318p9LIZJ = null;
        }
        super.removeSpan(obj);
        if (c21401318p9LIZJ != null) {
            ((ArrayList) this.LLILLJJLI).remove(c21401318p9LIZJ);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public C21401218p8(CharSequence charSequence, Class cls) {
        super(charSequence);
        this.LLILLJJLI = new ArrayList();
        C08IF.LIZLLL(cls, "watcherClass cannot be null");
        this.LL = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new C21401218p8(this.LL, this, i, i2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (this.LL == cls) {
            C21401318p9[] c21401318p9Arr = (C21401318p9[]) super.getSpans(i, i2, C21401318p9.class);
            T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, c21401318p9Arr.length));
            for (int i3 = 0; i3 < c21401318p9Arr.length; i3++) {
                tArr[i3] = c21401318p9Arr[i3].LL;
            }
            return tArr;
        }
        return (T[]) super.getSpans(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        if (cls == null || this.LL == cls) {
            cls = C21401318p9.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        LIZ();
        super.replace(i, i2, charSequence);
        LJ();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence) {
        replace(i, i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    public C21401218p8(Class<?> cls, CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        this.LLILLJJLI = new ArrayList();
        C08IF.LIZLLL(cls, "watcherClass cannot be null");
        this.LL = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (LIZLLL(obj)) {
            C21401318p9 c21401318p9 = new C21401318p9(obj);
            ((ArrayList) this.LLILLJJLI).add(c21401318p9);
            obj = c21401318p9;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        LIZ();
        super.replace(i, i2, charSequence, i3, i4);
        LJ();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        replace(i, i2, charSequence, i3, i4);
        return this;
    }
}
