package X;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Z2Q, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z2Q {
    public final boolean LIZ;
    public final Drawable LIZIZ;
    public final CharSequence LIZJ;
    public final Function0<String> LIZLLL;
    public final C01GW LJ;

    public C0Z2Q() {
        throw null;
    }

    public final CharSequence LIZ(CharSequence charSequence) {
        CharSequence charSequence2 = this.LIZJ;
        if (charSequence2 != null && !a0.LJJJIL(charSequence2)) {
            if (charSequence instanceof SpannableStringBuilder) {
                return ((SpannableStringBuilder) charSequence).insert(0, this.LIZJ);
            }
            if (charSequence instanceof SpannableString) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append(this.LIZJ);
                spannableStringBuilder.append(charSequence);
                return spannableStringBuilder;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((Object) this.LIZJ);
            sbLIZ.append((Object) charSequence);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (charSequence == null) {
            return "";
        }
        return charSequence;
    }

    public C0Z2Q(boolean z, Drawable drawable, CharSequence charSequence, Function0 function0, int i) {
        drawable = (i & 2) != 0 ? null : drawable;
        charSequence = (i & 4) != 0 ? null : charSequence;
        function0 = (i & 8) != 0 ? null : function0;
        this.LIZ = z;
        this.LIZIZ = drawable;
        this.LIZJ = charSequence;
        this.LIZLLL = function0;
        this.LJ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS558S0100000_14(this, 1671));
    }
}
