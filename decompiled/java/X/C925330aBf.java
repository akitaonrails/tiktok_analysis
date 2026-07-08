package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.0aBf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C925330aBf extends C09AY implements InterfaceC1631620sYq<Integer, String, Throwable, Unit> {
    public final /* synthetic */ C925310aBd LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ EnumC925350aBh LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C925330aBf(C925310aBd c925310aBd, long j, long j2, int i, EnumC925350aBh enumC925350aBh) {
        super(3);
        this.LL = c925310aBd;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
        this.LLILZ = i;
        this.LLILZIL = enumC925350aBh;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Integer num, String str, Throwable th) {
        int iIntValue = num.intValue();
        Throwable th2 = th;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("join.execute fail code=");
        sbLIZ.append(iIntValue);
        sbLIZ.append(" msg=");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("MultiGuestV3GuestBeInvitedPresenter", C2188811AlT.LIZIZ(sbLIZ));
        this.LL.LJ(this.LLILLJJLI, this.LLILLL, iIntValue, th2, true, this.LLILZ);
        if (this.LLILZIL == EnumC925350aBh.LINE_UP_IN_MICROOM) {
            C915130ZvD.LIZ(th2);
        }
        return Unit.LIZ;
    }
}
