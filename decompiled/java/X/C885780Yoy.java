package X;

import android.content.Context;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Yoy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C885780Yoy extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C885760Yow LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ List<String> LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C885780Yoy(Context context, C885760Yow c885760Yow, List list, Function0 function0, boolean z) {
        super(0);
        this.LL = c885760Yow;
        this.LLILLJJLI = z;
        this.LLILLL = context;
        this.LLILZ = list;
        this.LLILZIL = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LJ(this.LLILLJJLI ? this.LLILLL.getString(2131846459) : this.LLILLL.getResources().getQuantityString(2131755678, this.LLILZ.size(), String.valueOf(this.LLILZ.size())));
        C0YUD c0yudLIZJ = this.LL.LIZ.LIZJ();
        if (c0yudLIZJ != null) {
            c0yudLIZJ.LIZ(this.LLILZ);
        }
        C885310YoD.LJIL(C885310YoD.LIZ, this.LL.LIZ.LIZIZ(), this.LLILZ.size(), this.LL.LIZ.LIZLLL());
        this.LLILZIL.invoke();
        return Unit.LIZ;
    }
}
