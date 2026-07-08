package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.05NY, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05NY extends C09AY implements Function0<Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05NY(String str, String str2, String str3, String str4, String str5) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = str5;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append("Failed");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append("\nBtmIsEmpty\nschema: ");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append('\n');
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(": ");
        sbLIZ.append(this.LLILZIL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
