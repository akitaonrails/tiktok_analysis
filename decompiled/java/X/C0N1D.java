package X;

import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0N1D, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N1D extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0N1D(String str) {
        super(0);
        this.LL = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        HashSet<String> hashSet = C0N1B.LJFF;
        String str = this.LL;
        if (str == null) {
            str = "";
        }
        hashSet.add(str);
        return Unit.LIZ;
    }
}
