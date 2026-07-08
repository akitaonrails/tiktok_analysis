package X;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0bDM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C964820bDM extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ C965340bEC LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C964820bDM(C965340bEC c965340bEC) {
        super(1);
        this.LL = c965340bEC;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (bool.booleanValue()) {
            C964760bDG c964760bDG = this.LL.LJIJI;
            Iterator<InterfaceC964770bDH> it2 = c964760bDG.LJII.iterator();
            while (it2.hasNext()) {
                it2.next().LJLLL(c964760bDG.LIZLLL);
            }
        } else {
            C964760bDG c964760bDG2 = this.LL.LJIJI;
            Iterator<InterfaceC964770bDH> it3 = c964760bDG2.LJII.iterator();
            while (it3.hasNext()) {
                it3.next().LJLLILLLL(c964760bDG2.LIZLLL);
            }
        }
        return Unit.LIZ;
    }
}
