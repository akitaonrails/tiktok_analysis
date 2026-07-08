package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Apf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2191411Apf extends C09AY implements Function0<String> {
    public final /* synthetic */ EnumC994780bzg LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C2191421Apg<T> LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2191411Apf(EnumC994780bzg enumC994780bzg, String str, C2191421Apg<T> c2191421Apg, boolean z) {
        super(0);
        this.LL = enumC994780bzg;
        this.LLILLJJLI = str;
        this.LLILLL = c2191421Apg;
        this.LLILZ = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TAKE_HIT path=concurrent mode=");
        sbLIZ.append(this.LL);
        sbLIZ.append(" keyType=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" key=");
        sbLIZ.append(this.LLILLL.LIZ);
        sbLIZ.append(" useOnlyOnce=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(" deferred=");
        sbLIZ.append(System.identityHashCode(this.LLILLL.LIZJ));
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
