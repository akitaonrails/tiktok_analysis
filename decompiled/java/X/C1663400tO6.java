package X;

import com.ss.android.vesdk.VERecorder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS5S1202000_25;

/* JADX INFO: renamed from: X.0tO6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1663400tO6 extends C1663420tO8 implements InterfaceC1631630sYr<Integer, Integer, String, VERecorder, Unit> {
    public final InterfaceC1631630sYr<Integer, Integer, String, VERecorder, Unit> LLILLJJLI;

    public C1663400tO6(Function0 function0, InterfaceC1631630sYr interfaceC1631630sYr) {
        super(function0);
        this.LLILLJJLI = interfaceC1631630sYr;
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(Integer num, Integer num2, String str, VERecorder vERecorder) {
        LIZ(new AwS5S1202000_25(this, num.intValue(), num2.intValue(), str, vERecorder, 0));
        return Unit.LIZ;
    }
}
