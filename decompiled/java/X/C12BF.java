package X;

import android.content.Context;
import com.bytedance.router.RouteIntent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.12BF, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12BF extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ RouteIntent LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;
    public final /* synthetic */ HashMap<String, String> LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12BF(Context context, RouteIntent routeIntent, Aweme aweme, HashMap<String, String> map, String str, String str2, String str3, String str4) {
        super(0);
        this.LL = context;
        this.LLILLJJLI = routeIntent;
        this.LLILLL = aweme;
        this.LLILZ = map;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = str3;
        this.LLIZLLLIL = str4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C12BK c12bk = C12BK.LIZ;
        Context context = this.LL;
        RouteIntent routeIntent = this.LLILLJJLI;
        Aweme aweme = this.LLILLL;
        HashMap<String, String> map = this.LLILZ;
        String str = this.LLILZIL;
        String str2 = this.LLILZLL;
        String str3 = this.LLIZ;
        String str4 = this.LLIZLLLIL;
        c12bk.getClass();
        C12BK.LIZIZ(context, routeIntent, aweme, true, map, str, str2, str3, str4);
        return Unit.LIZ;
    }
}
