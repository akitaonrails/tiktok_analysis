package X;

import android.app.Activity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0YbS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C877400YbS extends C09AY implements Function0<Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ Activity LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ EnumC885270Yo9 LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ InterfaceC879010Ye3 LLIZ;
    public final /* synthetic */ List<String> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C877400YbS(boolean z, Activity activity, String str, boolean z2, EnumC885270Yo9 enumC885270Yo9, String str2, InterfaceC879010Ye3 interfaceC879010Ye3, List<String> list) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = activity;
        this.LLILLL = str;
        this.LLILZ = z2;
        this.LLILZIL = enumC885270Yo9;
        this.LLILZLL = str2;
        this.LLIZ = interfaceC879010Ye3;
        this.LLIZLLLIL = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Activity activity;
        boolean z = this.LL;
        if (z && (activity = this.LLILLJJLI) != null) {
            C877320YbK c877320YbK = C877320YbK.LIZ;
            String str = this.LLILLL;
            boolean z2 = this.LLILZ;
            C877370YbP c877370YbP = new C877370YbP(z2, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, activity, z);
            c877320YbK.getClass();
            C0CNO.LIZLLL(0L, new C341210DZf(activity, str, z2, c877370YbP));
        }
        return Unit.LIZ;
    }
}
