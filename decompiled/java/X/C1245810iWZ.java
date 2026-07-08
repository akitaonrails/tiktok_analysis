package X;

import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS263S0300000_19;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: renamed from: X.0iWZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@InterfaceC20647615qs("campus_add_school_popup")
public final class C1245810iWZ extends AbstractC20659615so<TuxSheet> {
    public final C19EG LL;
    public final C1245860iWe LLILLJJLI;
    public final Function0<Unit> LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(715));

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 0;
    }

    @Override // com.bytedance.poplayer.BaseStandardPopupTask, com.bytedance.poplayer.IStandardPopupTask
    public final void LIZIZ() {
        ((C1007300cJs) this.LLILZ.getValue()).LIZ().storeBoolean("has_seen_add_school_popup", true);
        C0DOO c0doo = C0DOO.LIZ;
        EnumC1245820iWa enumC1245820iWa = EnumC1245820iWa.SHOW;
        C1245860iWe c1245860iWe = this.LLILLJJLI;
        c0doo.getClass();
        C0DOO.LJ(enumC1245820iWa, c1245860iWe);
    }

    @Override // X.AbstractC20656215sG
    public final String getPopupEnterFrom() {
        return C1231400i9K.LIZ[this.LLILLJJLI.internalEnterFrom.ordinal()] == 1 ? "edit_profile_page" : super.getPopupEnterFrom();
    }

    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        C19EG c19eg = this.LL;
        return new C688120Qyw(c19eg, c19eg, null);
    }

    @Override // com.bytedance.poplayer.IStandardPopupTask
    public final Object LJII(C688120Qyw c688120Qyw) {
        int iIntValue;
        int i;
        int i2;
        int i3;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1j, this.LL);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -16777216;
        }
        C1245840iWc.LIZ.getClass();
        boolean zLIZ = C1245840iWc.LIZ();
        C770750ULh c770750ULh = new C770750ULh();
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.vi;
        c770750ULh.LIZ = c0hti.LIZ(this.LL);
        C19EG c19eg = this.LL;
        if (zLIZ) {
            i = 2131846950;
        } else {
            i = 2131846954;
        }
        c770750ULh.LJ = c19eg.getString(i);
        C1667580tUq[] c1667580tUqArr = new C1667580tUq[3];
        C19EG c19eg2 = this.LL;
        if (zLIZ) {
            i2 = 2131846948;
        } else {
            i2 = 2131846951;
        }
        c1667580tUqArr[0] = new C1667580tUq(R.raw.icon_person_phd_tick, null, c19eg2.getString(i2), Integer.valueOf(iIntValue), 2);
        C19EG c19eg3 = this.LL;
        if (zLIZ) {
            i3 = 2131846949;
        } else {
            i3 = 2131846952;
        }
        c1667580tUqArr[1] = new C1667580tUq(R.raw.icon_two_person, null, c19eg3.getString(i3), Integer.valueOf(iIntValue), 2);
        c1667580tUqArr[2] = new C1667580tUq(R.raw.icon_globe, null, this.LL.getString(2131846953), Integer.valueOf(iIntValue), 2);
        c770750ULh.LJ(c1667580tUqArr);
        c770750ULh.LJI(this.LL.getString(2131846947), new AwS598S0100000_19(this, 802));
        C1390920mIc c1390920mIcLIZIZ = c770750ULh.LIZIZ();
        c1390920mIcLIZIZ.LJIIIIZZ(4);
        DialogInterfaceOnCancelListenerC1265930j31 dialogInterfaceOnCancelListenerC1265930j31 = new DialogInterfaceOnCancelListenerC1265930j31(this, 4);
        TuxSheet tuxSheet = c1390920mIcLIZIZ.LIZ;
        tuxSheet.LL = dialogInterfaceOnCancelListenerC1265930j31;
        return tuxSheet;
    }

    public C1245810iWZ(C19EG c19eg, C1245860iWe c1245860iWe, AwS263S0300000_19 awS263S0300000_19) {
        this.LL = c19eg;
        this.LLILLJJLI = c1245860iWe;
        this.LLILLL = awS263S0300000_19;
    }
}
