package X;

import android.graphics.Rect;
import kotlin.Unit;

/* JADX INFO: renamed from: X.13fr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20069713fr extends C09AY implements InterfaceC1631630sYr<Integer, Integer, Integer, Integer, Unit> {
    public final /* synthetic */ C20068313fd LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20069713fr(C20068313fd c20068313fd, int i) {
        super(4);
        this.LL = c20068313fd;
        this.LLILLJJLI = i;
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(Integer num, Integer num2, Integer num3, Integer num4) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        int iIntValue3 = num3.intValue();
        int iIntValue4 = num4.intValue();
        C20068313fd c20068313fd = this.LL;
        c20068313fd.LIZ.LIZ(c20068313fd.LIZJ, this.LLILLJJLI, new Rect(iIntValue, iIntValue2, iIntValue3, iIntValue4));
        return Unit.LIZ;
    }
}
