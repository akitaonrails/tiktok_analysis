package X;

import com.ss.android.ugc.aweme.account.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.oneclicklogin.OIDCToken;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XGJ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XGJ extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ Function1<Integer, Unit> LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0XGJ(String str, String str2, String str3, String str4, Function0 function0, Function1 function1, boolean z) {
        super(1);
        this.LL = function1;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = str4;
        this.LLIZ = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        BaseLoginMethod baseLoginMethod;
        if (!bool.booleanValue()) {
            Function1<Integer, Unit> function1 = this.LL;
            if (function1 != null) {
                function1.invoke(-1);
            }
        } else {
            String strLIZLLL = this.LLILLJJLI;
            if (strLIZLLL == null) {
                strLIZLLL = C0XQ5.LIZLLL();
            }
            if (!this.LLILLL && ((baseLoginMethod = (BaseLoginMethod) C13LP.LJJJLL(C0XUE.LIZ.LJ(strLIZLLL))) == null || !Intrinsics.LJFF(baseLoginMethod.isOneClickLogin(), Boolean.TRUE))) {
                Function1<Integer, Unit> function12 = this.LL;
                if (function12 != null) {
                    function12.invoke(-1);
                }
            } else {
                C1227904rF c1227904rF = C1227904rF.LIZ;
                OIDCToken oIDCToken = new OIDCToken(this.LLILZ, this.LLILZIL, this.LLILZLL);
                c1227904rF.getClass();
                String strLJI = C1227904rF.LJI(oIDCToken);
                if (strLJI == null) {
                    Function1<Integer, Unit> function13 = this.LL;
                    if (function13 != null) {
                        function13.invoke(-1);
                    }
                } else {
                    C0XUE.LIZ.LJIIL(strLIZLLL, strLJI, this.LLIZ, this.LL);
                }
            }
        }
        return Unit.LIZ;
    }
}
