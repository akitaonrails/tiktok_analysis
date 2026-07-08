package X;

import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavBackStackEntryState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.13qK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20134613qK extends C09AY implements Function1<NavBackStackEntry, Unit> {
    public final /* synthetic */ C013C LL;
    public final /* synthetic */ C013C LLILLJJLI;
    public final /* synthetic */ C20134113qF LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ C13E8<NavBackStackEntryState> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20134613qK(C013C c013c, C013C c013c2, C20134113qF c20134113qF, boolean z, C13E8<NavBackStackEntryState> c13e8) {
        super(1);
        this.LL = c013c;
        this.LLILLJJLI = c013c2;
        this.LLILLL = c20134113qF;
        this.LLILZ = z;
        this.LLILZIL = c13e8;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(NavBackStackEntry navBackStackEntry) {
        this.LL.element = true;
        this.LLILLJJLI.element = true;
        this.LLILLL.LJIJJ(navBackStackEntry, this.LLILZ, this.LLILZIL);
        return Unit.LIZ;
    }
}
