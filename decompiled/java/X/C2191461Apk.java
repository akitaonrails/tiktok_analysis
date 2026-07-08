package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Apk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2191461Apk extends C09AY implements Function0<String> {
    public final /* synthetic */ C675200Qe6<Object> LL;
    public final /* synthetic */ EnumC1158510gFl LLILLJJLI;
    public final /* synthetic */ EnumC994770bzf LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2191461Apk(C675200Qe6<Object> c675200Qe6, EnumC1158510gFl enumC1158510gFl, EnumC994770bzf enumC994770bzf, String str, String str2) {
        super(0);
        this.LL = c675200Qe6;
        this.LLILLJJLI = enumC1158510gFl;
        this.LLILLL = enumC994770bzf;
        this.LLILZ = str;
        this.LLILZIL = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TAKE_MISS path=concurrent domain=");
        sbLIZ.append(this.LL.LIZ);
        sbLIZ.append(" reason=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" mode=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(" keyType=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(" key=");
        sbLIZ.append(this.LLILZIL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
