package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0yle, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1870200yle extends C09AY implements Function0<Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1870200yle(String str, String str2) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("view: ");
        sbLIZ.append(this.LL);
        sbLIZ.append("\nbtm: ");
        sbLIZ.append(this.LLILLJJLI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
