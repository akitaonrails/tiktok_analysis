package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CLk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C312140CLk extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C0CM3 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C312140CLk(C0CM3 c0cm3) {
        super(0);
        this.LL = c0cm3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.LL.LJFF.length() > 0) {
            C311900CKm c311900CKm = C311900CKm.LIZLLL;
            c311900CKm.LIZLLL(this.LL.LJFF, "tag");
            c311900CKm.LIZLLL(0, "type");
            c311900CKm.LIZLLL(Integer.valueOf(this.LL.LIZJ), "priority");
        }
        return Unit.LIZ;
    }
}
