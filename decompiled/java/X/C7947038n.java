package X;

import android.text.SpannableStringBuilder;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.038n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7947038n {
    public static final /* synthetic */ int LIZJ = 0;
    public final List<C7946038m> LIZ;
    public Function1<Object, Unit> LIZIZ;

    public final SpannableStringBuilder LIZ() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (C7946038m c7946038m : this.LIZ) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) c7946038m.LIZ);
            int length2 = spannableStringBuilder.length();
            for (Object obj : c7946038m.LIZIZ) {
                if (obj instanceof C0HD1) {
                    ((C0HD1) obj).LLILZ = this.LIZIZ;
                }
                C786410Ut5.q2(spannableStringBuilder, obj, length, length2, 17);
            }
        }
        return spannableStringBuilder;
    }

    public C7947038n(List list) {
        this.LIZ = list;
    }
}
