package X;

import com.ss.android.ugc.aweme.main.assems.main.MainActivityLogAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0buJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C991450buJ extends C09AY implements Function0<String> {
    public final /* synthetic */ MainActivityLogAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C991450buJ(MainActivityLogAssem mainActivityLogAssem) {
        super(0);
        this.LL = mainActivityLogAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStart ");
        sbLIZ.append(this.LL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
