package X;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.00jN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C159900jN extends C09AY implements Function2<String, String, Boolean> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C159900jN(String str) {
        super(2);
        this.LL = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Boolean invoke(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        boolean zLJFF = true;
        if (this.LL.length() > 0) {
            if (!a0.LJJIIZI(str3, this.LL, false) || !a0.LJJIIZI(str4, this.LL, false)) {
                zLJFF = false;
            }
        } else {
            zLJFF = Intrinsics.LJFF(str3, str4);
        }
        return Boolean.valueOf(zLJFF);
    }
}
