package X;

import android.content.Context;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.103N, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public class C103N {
    public final CharSequence LIZ;
    public final Integer LIZIZ;
    public final Function1<Context, CharSequence> LIZJ;

    public C103N() {
    }

    public C103N(int i) {
        this.LIZIZ = Integer.valueOf(i);
        this.LIZJ = null;
    }

    public final CharSequence LIZ(Context context) {
        Function1<Context, CharSequence> function1 = this.LIZJ;
        if (function1 != null) {
            return function1.invoke(context);
        }
        CharSequence charSequence = this.LIZ;
        if (charSequence != null) {
            return charSequence;
        }
        Integer num = this.LIZIZ;
        if (num != null) {
            return context.getString(num.intValue());
        }
        return "";
    }

    public C103N(CharSequence charSequence) {
        this.LIZ = charSequence;
        this.LIZIZ = null;
        this.LIZJ = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C103N(Function1<? super Context, ? extends CharSequence> function1) {
        this.LIZ = null;
        this.LIZIZ = null;
        this.LIZJ = function1;
    }
}
