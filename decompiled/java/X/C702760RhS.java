package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RhS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C702760RhS extends C09AY implements Function0<String> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ EnumC702720RhO LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C702760RhS(String str, String str2, EnumC702720RhO enumC702720RhO) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = enumC702720RhO;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FcpNodeExposureDetector --- aid: ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", component: ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", is occupied but not show, because: ");
        sbLIZ.append(this.LLILLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
