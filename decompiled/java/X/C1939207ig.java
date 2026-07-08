package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07ig, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1939207ig extends C09AY implements Function0<Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1939207ig(String str, String str2, String str3, String str4, String str5, String str6) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = str5;
        this.LLILZLL = str6;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append("Success");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append("\nschema: ");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append("\nbtm: ");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append('\n');
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(": ");
        sbLIZ.append(this.LLILZLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
