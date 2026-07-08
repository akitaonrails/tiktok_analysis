package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.1B4K, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B4K extends C09AY implements InterfaceC1631630sYr<String, Long, Integer, String, Unit> {
    public final /* synthetic */ C013C LL;
    public final /* synthetic */ C1B4R LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1B4K(C013C c013c, C1B4N c1b4n) {
        super(4);
        this.LL = c013c;
        this.LLILLJJLI = c1b4n;
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(String str, Long l, Integer num, String str2) {
        l.longValue();
        int iIntValue = num.intValue();
        String str3 = str2;
        this.LL.element = true;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Message: ");
        sbLIZ.append(str3);
        sbLIZ.append(", code: ");
        sbLIZ.append(iIntValue);
        C2188811AlT.LIZIZ(sbLIZ);
        if (iIntValue != -12) {
            this.LLILLJJLI.LIZ(C1B4F.LIZ(C1B4F.LJIILJJIL, 0, null, str3, 7));
        }
        return Unit.LIZ;
    }
}
