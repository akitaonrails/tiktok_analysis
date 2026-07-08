package X;

import android.text.SpannableStringBuilder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0lVY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1360500lVY extends SpannableStringBuilder {
    public static final /* synthetic */ int LLILLJJLI = 0;
    public final List<Integer> LL = new ArrayList();

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final /* bridge */ int length() {
        return super.length();
    }

    public final void LIZ(int i) {
        ((ArrayList) this.LL).add(Integer.valueOf(i));
    }

    public final int LIZIZ(int i) {
        int size = this.LL.size();
        for (int i2 = 0; i2 < size && ((Number) ListProtector.get(this.LL, i2)).intValue() <= i; i2++) {
            i++;
        }
        return i;
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final /* bridge */ char charAt(int i) {
        return super.charAt(i);
    }

    public final void LIZJ(int i, int i2, Object obj) {
        setSpan(obj, LIZIZ(i), LIZIZ(i2), 33);
    }
}
