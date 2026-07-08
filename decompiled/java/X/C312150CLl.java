package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CLl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C312150CLl extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C0CM8 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C312150CLl(C0CM8 c0cm8) {
        super(0);
        this.LL = c0cm8;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.LL.LLILLJJLI.length() > 0) {
            C311900CKm c311900CKm = C311900CKm.LIZLLL;
            c311900CKm.LIZLLL(this.LL.LLILLJJLI, "tag");
            c311900CKm.LIZLLL(1, "type");
            c311900CKm.LIZLLL(Integer.valueOf(this.LL.LL), "priority");
        }
        return Unit.LIZ;
    }
}
