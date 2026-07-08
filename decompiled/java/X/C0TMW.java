package X;

import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0TMW, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TMW extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ Fragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0TMW(Fragment fragment) {
        super(1);
        this.LL = fragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        assembler.QQ2(this.LL, new C1338205Lo());
        Unit unit = Unit.LIZ;
        C1566110qrB<Object> c1566110qrB = C1566090qr9.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initRoot()>>> fragment:");
        sbLIZ.append(this.LL);
        sbLIZ.append(",supervisor:");
        sbLIZ.append(unit);
        C1566080qr8.LIZJ(C2188811AlT.LIZIZ(sbLIZ), null);
        return unit;
    }
}
