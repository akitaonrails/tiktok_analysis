package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0iuk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1260800iuk extends C09AY implements Function0<String> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1260800iuk(String str, String str2) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        String str = this.LL;
        String str2 = this.LLILLJJLI;
        if (str2 == null) {
            str2 = "";
        }
        return C1211130hcd.LIZ(str, str2);
    }
}
