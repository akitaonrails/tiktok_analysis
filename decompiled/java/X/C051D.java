package X;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.051D, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C051D extends C09AY implements Function1<Pair<? extends String, ? extends Object>, CharSequence> {
    public C051D() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(Pair<? extends String, ? extends Object> pair) {
        String string;
        Pair<? extends String, ? extends Object> pair2 = pair;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(pair2.getFirst());
        sbLIZ.append('=');
        Object second = pair2.getSecond();
        if (second == null || (string = second.toString()) == null) {
            string = "null";
        }
        sbLIZ.append(string);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
