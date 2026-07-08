package X;

import android.text.SpannableStringBuilder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0SHq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C718840SHq {
    public List<C0SIR> LIZ;
    public Function1<Object, Unit> LIZIZ;

    public final CharSequence LIZIZ() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (C0SIR c0sir : this.LIZ) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) c0sir.LIZ);
            int length2 = spannableStringBuilder.length();
            for (Object obj : c0sir.LIZIZ) {
                if (obj instanceof C0HD1) {
                    ((C0HD1) obj).LLILZ = this.LIZIZ;
                }
                C786410Ut5.q2(spannableStringBuilder, obj, length, length2, 17);
            }
        }
        return spannableStringBuilder;
    }

    public final CharSequence LIZJ() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (C0SIR c0sir : this.LIZ) {
            int length = spannableStringBuilder.length();
            if (c0sir.LIZJ != C0SIK.WRAP) {
                spannableStringBuilder.append((CharSequence) c0sir.LIZ);
                int length2 = spannableStringBuilder.length();
                for (Object obj : c0sir.LIZIZ) {
                    if (obj instanceof C0HD1) {
                        ((C0HD1) obj).LLILZ = this.LIZIZ;
                    }
                    C786410Ut5.q2(spannableStringBuilder, obj, length, length2, 17);
                }
            } else {
                spannableStringBuilder.append((CharSequence) " ");
            }
        }
        return spannableStringBuilder;
    }

    public final String LIZLLL() {
        StringBuilder sb = new StringBuilder();
        Iterator<C0SIR> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            sb.append(it2.next().LIZ);
        }
        return sb.toString();
    }

    public C718840SHq(List<C0SIR> list) {
        this.LIZ = list;
    }

    public final void LIZ(Function0 function0) {
        ArrayList arrayList = new ArrayList(this.LIZ);
        ListProtector.add(arrayList, 0, function0.invoke());
        this.LIZ = arrayList;
    }

    public final void LJ(Function1 function1) {
        List<C0SIR> list = this.LIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C0SIR> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(function1.invoke(it2.next()));
        }
        this.LIZ = arrayList;
    }
}
