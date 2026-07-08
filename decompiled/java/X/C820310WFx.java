package X;

import com.appsflyer.AppsFlyerLib;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0WFx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C820310WFx extends C09AY implements Function0<C814380Vx6<Unit>> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C820310WFx(String str, String str2, String str3) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C814380Vx6<Unit> invoke() {
        AppsFlyerLib.getInstance().setPreinstallAttribution(this.LL, this.LLILLJJLI, this.LLILLL);
        return C814390Vx7.LIZ(Unit.LIZ);
    }
}
