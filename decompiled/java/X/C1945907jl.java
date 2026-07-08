package X;

import android.net.Uri;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.07jl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1945907jl extends C09AY implements Function1<CharSequence, Pair<? extends String, ? extends String>> {
    public C1945907jl() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Pair<? extends String, ? extends String> invoke(CharSequence charSequence) {
        String strDecode;
        CharSequence charSequence2 = charSequence;
        int iLJJIZ = a0.LJJIZ(charSequence2, '=', 0, false, 6);
        if (iLJJIZ == -1) {
            iLJJIZ = charSequence2.length();
        }
        String string = charSequence2.subSequence(0, iLJJIZ).toString();
        if (iLJJIZ < charSequence2.length()) {
            strDecode = charSequence2.subSequence(iLJJIZ + 1, charSequence2.length()).toString();
        } else {
            strDecode = "";
        }
        if (a0.LJJIJ(string, '%')) {
            string = Uri.decode(string);
        }
        if (a0.LJJIJ(strDecode, '%')) {
            strDecode = Uri.decode(strDecode);
        }
        return new Pair<>(string, strDecode);
    }
}
