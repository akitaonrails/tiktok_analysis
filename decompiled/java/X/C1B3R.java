package X;

import android.app.Activity;
import android.os.Bundle;
import com.ss.android.ugc.aweme.opensdkservice.IOpenPlatformService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.1B3R, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B3R extends C09AY implements Function2<Boolean, Boolean, Unit> {
    public final /* synthetic */ C1B3M LL;
    public final /* synthetic */ Activity LLILLJJLI;
    public final /* synthetic */ IOpenPlatformService LLILLL;
    public final /* synthetic */ C1B3S LLILZ;
    public final /* synthetic */ Bundle LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1B3R(C1B3M c1b3m, Activity activity, IOpenPlatformService iOpenPlatformService, C1B3S c1b3s, Bundle bundle) {
        super(2);
        this.LL = c1b3m;
        this.LLILLJJLI = activity;
        this.LLILLL = iOpenPlatformService;
        this.LLILZ = c1b3s;
        this.LLILZIL = bundle;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, Boolean bool2) {
        boolean zBooleanValue = bool.booleanValue();
        if (bool2.booleanValue()) {
            String str = this.LL.LIZ;
            C1236610iHj.LIZIZ(str, "auth_js_child_exit", "20003", C1236610iHj.LIZ(str, true, this.LLILLJJLI instanceof ActivityC2196911AyX), EnumC21632119lH.TTOP, EnumC19415410xc.MOBILE);
            this.LL.LIZJ(102, "Child mode is not supported");
        } else if (!zBooleanValue) {
            String str2 = this.LL.LIZ;
            C1236610iHj.LIZIZ(str2, "auth_js_not_login", "20004", C1236610iHj.LIZ(str2, true, this.LLILLJJLI instanceof ActivityC2196911AyX), EnumC21632119lH.TTOP, EnumC19415410xc.MOBILE);
            this.LL.LIZJ(103, "User is not logged in");
        } else {
            this.LL.LJFF(this.LLILLL, this.LLILZ, this.LLILZIL);
        }
        return Unit.LIZ;
    }
}
