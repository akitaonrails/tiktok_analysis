package X;

import com.ss.android.ugc.aweme.main.assems.main.MainActivityLogAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0buG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C991420buG extends C09AY implements Function0<String> {
    public final /* synthetic */ MainActivityLogAssem LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C991420buG(MainActivityLogAssem mainActivityLogAssem, boolean z, boolean z2) {
        super(0);
        this.LL = mainActivityLogAssem;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onWindowFocusChanged ");
        sbLIZ.append(this.LL);
        sbLIZ.append(' ');
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(' ');
        sbLIZ.append(this.LLILLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
