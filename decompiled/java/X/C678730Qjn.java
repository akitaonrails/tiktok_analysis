package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Qjn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C678730Qjn extends C09AY implements Function0<String> {
    public final /* synthetic */ C678240Qj0 LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C678730Qjn(C678240Qj0 c678240Qj0, int i, int i2, int i3, int i4, boolean z) {
        super(0);
        this.LL = c678240Qj0;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = i3;
        this.LLILZIL = i4;
        this.LLILZLL = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[LynxHeight] check=lynx_rendered_actual_visible_height item=");
        sbLIZ.append(C1397605dW.LIZLLL(this.LL));
        sbLIZ.append(" actualHeight=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" rootHeight=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(" currentMinHeight=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(" expectedHeight=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(" needsRelayout=");
        sbLIZ.append(this.LLILZLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
