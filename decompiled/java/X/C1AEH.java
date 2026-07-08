package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1AEH, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AEH extends C09AY implements Function0<String> {
    public final /* synthetic */ String LL = "startLiveFeed";
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1AEH(String str, String str2) {
        super(0);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return "event=" + this.LL + ",decision=" + this.LLILLJJLI + ",group=" + ((Number) C1AEJ.LIZ.getValue()).intValue() + ",destroyEnterInner=" + C1AEJ.LIZIZ().LJ + ',' + this.LLILLL;
    }
}
