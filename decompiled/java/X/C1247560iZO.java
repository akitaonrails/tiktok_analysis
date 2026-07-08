package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0iZO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1247560iZO extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Activity LL;
    public final /* synthetic */ User LLILLJJLI;
    public final /* synthetic */ InterfaceC19225710Jj LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ AwemeRawAd LLIZLLLIL;
    public final /* synthetic */ C10EW LLJ;
    public final /* synthetic */ Function0<Unit> LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1247560iZO(Activity activity, User user, InterfaceC19225710Jj interfaceC19225710Jj, String str, String str2, String str3, String str4, AwemeRawAd awemeRawAd, C10EW c10ew, Function0<Unit> function0) {
        super(0);
        this.LL = activity;
        this.LLILLJJLI = user;
        this.LLILLL = interfaceC19225710Jj;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = str4;
        this.LLIZLLLIL = awemeRawAd;
        this.LLJ = c10ew;
        this.LLJI = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        String string = this.LL.getString(2131827615);
        if (string == null) {
            string = "";
        }
        String strJ4 = C786410Ut5.j4(string, Arrays.copyOf(new Object[]{this.LLILLJJLI.getUniqueId()}, 1));
        C1389890mGx c1389890mGx = new C1389890mGx(this.LL);
        c1389890mGx.LJIIJ(strJ4);
        c1389890mGx.LJIIJJI();
        String uid = this.LLILLJJLI.getUid();
        String secUid = this.LLILLJJLI.getSecUid();
        C1440005kM.LIZ(new C1247570iZP(uid, secUid != null ? secUid : ""));
        C10EK c10ek = C10EK.LIZ;
        Activity activity = this.LL;
        User user = this.LLILLJJLI;
        InterfaceC19225710Jj interfaceC19225710Jj = this.LLILLL;
        String str = this.LLILZ;
        String str2 = this.LLILZIL;
        String str3 = this.LLILZLL;
        String str4 = this.LLIZ;
        AwemeRawAd awemeRawAd = this.LLIZLLLIL;
        C10EW c10ew = this.LLJ;
        c10ek.getClass();
        C10EK.LJIIIZ(activity, user, interfaceC19225710Jj, str, str2, str3, str4, awemeRawAd, c10ew);
        this.LLJI.invoke();
        return Unit.LIZ;
    }
}
