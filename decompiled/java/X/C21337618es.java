package X;

import android.text.SpanWatcher;
import android.text.SpannableStringBuilder;

/* JADX INFO: renamed from: X.18es, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21337618es extends SpannableStringBuilder {
    public C21337618es() {
        this(0);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final /* bridge */ int length() {
        return super.length();
    }

    public C21337618es(int i) {
        super("");
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final /* bridge */ char charAt(int i) {
        return super.charAt(i);
    }

    public C21337618es(CharSequence charSequence) {
        super(charSequence);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (cls == null) {
            return (T[]) new Object[0];
        }
        if (cls.equals(SpanWatcher.class)) {
            return (T[]) new SpanWatcher[0];
        }
        return (T[]) super.getSpans(i, i2, cls);
    }
}
