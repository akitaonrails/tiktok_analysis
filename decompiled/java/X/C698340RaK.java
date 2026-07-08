package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RaK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C698340RaK extends C09AY implements Function0<String> {
    public final /* synthetic */ C698680Ras LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C698340RaK(C698680Ras c698680Ras, String str, String str2, String str3) {
        super(0);
        this.LL = c698680Ras;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Feed Interact Layer receive timing callback. signal#: ");
        sbLIZ.append(this.LL);
        sbLIZ.append(". reach_aid: ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", attach_aid: ");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", source_from: ");
        sbLIZ.append(this.LLILZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
