package X;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0dFi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1043160dFi extends C09AY implements Function0<ArrayList<String>> {
    public final /* synthetic */ C1043130dFf LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1043160dFi(C1043130dFf c1043130dFf) {
        super(0);
        this.LL = c1043130dFf;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ArrayList<String> invoke() {
        String[] stringArray = this.LL.LIZ().getStringArray("ruleDomains", null);
        ArrayList<String> arrayList = new ArrayList<>();
        if (stringArray != null) {
            C13LQ.LJJLIIIJL(arrayList, stringArray);
        }
        return arrayList;
    }
}
