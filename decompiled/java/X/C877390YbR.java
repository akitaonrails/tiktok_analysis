package X;

import android.app.Activity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0YbR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C877390YbR extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Function0<Unit> LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ List<C0Y8T> LLILLL;
    public final /* synthetic */ C878950Ydx LLILZ;
    public final /* synthetic */ List<String> LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;
    public final /* synthetic */ Activity LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C877390YbR(Activity activity, C878950Ydx c878950Ydx, String str, List list, List list2, Function0 function0, Function0 function02, Function0 function03) {
        super(0);
        this.LL = function0;
        this.LLILLJJLI = str;
        this.LLILLL = list;
        this.LLILZ = c878950Ydx;
        this.LLILZIL = list2;
        this.LLILZLL = function02;
        this.LLIZ = function03;
        this.LLIZLLLIL = activity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Function0<Unit> function0 = this.LL;
        if (function0 != null) {
            function0.invoke();
        }
        C885310YoD.LJIL(C885310YoD.LIZ, this.LLILLJJLI, this.LLILLL.size(), this.LLILZ.LLILLL.getMobValue());
        C877320YbK.LJIIIIZZ(C877320YbK.LIZ, this.LLILLJJLI, this.LLILZ, this.LLILZIL, "delete_confirm");
        InterfaceC876950Yaj interfaceC876950YajLIZIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ);
        List<C0Y8T> list = this.LLILLL;
        interfaceC876950YajLIZIZ.LJJII(new C463010IDr(this.LLIZ, list, this.LLIZLLLIL, 0), list, false);
        this.LLILZLL.invoke();
        return Unit.LIZ;
    }
}
