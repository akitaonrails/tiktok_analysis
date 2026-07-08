package X;

import kotlin.jvm.functions.Function0;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.0qMK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1546980qMK extends C09AY implements Function0<String> {
    public final /* synthetic */ C1546870qM9 LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1546980qMK(C1546870qM9 c1546870qM9, String str) {
        super(0);
        this.LL = c1546870qM9;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        C0VSJ c0vsjLIZ = this.LL.LIZ(this.LLILLJJLI);
        if (c0vsjLIZ.exists()) {
            return C09BH.LJI(c0vsjLIZ, Charsets.UTF_8);
        }
        return null;
    }
}
