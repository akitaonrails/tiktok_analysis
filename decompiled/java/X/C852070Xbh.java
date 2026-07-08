package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.account.oneclicklogin.IOneClickLoginService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AwS581S0100000_2;

/* JADX INFO: renamed from: X.0Xbh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C852070Xbh extends C09AY implements Function1<C1397660mTU, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C259800zU<C0XWD> LLILLL;
    public final /* synthetic */ Activity LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C852070Xbh(String str, int i, C259800zU<C0XWD> c259800zU, Activity activity) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = c259800zU;
        this.LLILZ = activity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397660mTU c1397660mTU) {
        C0XWJ c0xwj = C0XWJ.LIZ;
        String str = this.LL;
        int i = this.LLILLJJLI;
        c0xwj.getClass();
        C0XWJ.LJIILL(i, str, true);
        ((IOneClickLoginService) ServiceManager.get().getService(IOneClickLoginService.class)).LJIIIIZZ(false, this.LLILLL.element, this.LL, "popup", AFwS200S0000000_13.get$arr$(329), new AwS581S0100000_2(this.LLILZ, 649));
        C849850XVn.LIZIZ.LIZJ().LJIJI("91", "oneClickLogin_promptModal_save_androidCTA", true);
        return Unit.LIZ;
    }
}
