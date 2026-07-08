package X;

import com.ss.android.ugc.aweme.tablet.impl.business.login.QRCodeLoginViewModelV2;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1B4t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2199051B4t extends AbstractC1703720uR8 {
    public final /* synthetic */ C05XL<Unit> LIZJ;
    public final /* synthetic */ QRCodeLoginViewModelV2 LIZLLL;
    public final /* synthetic */ String LJ;

    @Override // X.C0XH7
    public final void LJI(C0XGA c0xga) {
        C1B54 c1b54 = (C1B54) c0xga;
        if (!this.LIZJ.isCompleted()) {
            String str = c1b54.LJIILJJIL;
            EnumC2199071B4v enumC2199071B4v = EnumC2199071B4v.CONFIRMED;
            if (Intrinsics.LJFF(str, enumC2199071B4v.getValue())) {
                this.LIZJ.LJIIZILJ(Unit.LIZ);
                QRCodeLoginViewModelV2 qRCodeLoginViewModelV2 = this.LIZLLL;
                qRCodeLoginViewModelV2.LL = c1b54.LJIIIZ;
                qRCodeLoginViewModelV2.LLILLJJLI.postValue(enumC2199071B4v);
                return;
            }
            EnumC2199071B4v enumC2199071B4v2 = EnumC2199071B4v.EXPIRED;
            if (Intrinsics.LJFF(str, enumC2199071B4v2.getValue())) {
                this.LIZJ.LJIIZILJ(Unit.LIZ);
                this.LIZLLL.LLILLJJLI.postValue(enumC2199071B4v2);
                this.LIZLLL.getClass();
                QRCodeLoginViewModelV2.DQ2(enumC2199071B4v2);
                return;
            }
            EnumC2199071B4v enumC2199071B4v3 = EnumC2199071B4v.REFUSED;
            if (Intrinsics.LJFF(str, enumC2199071B4v3.getValue())) {
                this.LIZJ.LJIIZILJ(Unit.LIZ);
                this.LIZLLL.LLILLJJLI.postValue(enumC2199071B4v2);
                this.LIZLLL.getClass();
                QRCodeLoginViewModelV2.DQ2(enumC2199071B4v3);
                return;
            }
            if (Intrinsics.LJFF(str, EnumC2199071B4v.NEW.getValue())) {
                this.LIZLLL.AQ2(this.LIZJ, this.LJ, false);
                return;
            }
            EnumC2199071B4v enumC2199071B4v4 = EnumC2199071B4v.SCANNED;
            if (Intrinsics.LJFF(str, enumC2199071B4v4.getValue())) {
                if (!((ConcurrentHashSet) this.LIZLLL.LLILZLL.getValue()).contains(this.LIZLLL.LLJI)) {
                    this.LIZLLL.LLILLJJLI.postValue(enumC2199071B4v4);
                    ((ConcurrentHashSet) this.LIZLLL.LLILZLL.getValue()).add(this.LIZLLL.LLJI);
                }
                this.LIZLLL.AQ2(this.LIZJ, this.LJ, true);
                return;
            }
            this.LIZLLL.AQ2(this.LIZJ, this.LJ, false);
        }
    }

    @Override // X.C0XH7
    public final void LJ(C0XGA c0xga, int i) {
        String str;
        if (!this.LIZJ.isCompleted()) {
            int iIntValue = 0;
            if (i != -1005) {
                this.LIZJ.LJIIZILJ(Unit.LIZ);
                EnumC2199071B4v enumC2199071B4v = EnumC2199071B4v.ERROR;
                if (c0xga != null) {
                    str = c0xga.LJFF;
                } else {
                    str = null;
                }
                enumC2199071B4v.setMsg(str);
                enumC2199071B4v.setErrorCode(Integer.valueOf(i));
                this.LIZLLL.LLILLJJLI.postValue(enumC2199071B4v);
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("platform", "qr_code");
                c2344009Gk.LJIIIIZZ("login_panel_type", C19252910Tv.LIZIZ.LIZLLL().LJIJ().LIZ());
                String msg = enumC2199071B4v.getMsg();
                if (msg == null) {
                    msg = "";
                }
                c2344009Gk.LJIIIIZZ("error_desc", msg);
                Integer errorCode = enumC2199071B4v.getErrorCode();
                if (errorCode != null) {
                    iIntValue = errorCode.intValue();
                }
                c2344009Gk.LIZJ(iIntValue, "error_code");
                C20684815ws.LJIILLIIL("login_failure", c2344009Gk.LIZ);
                return;
            }
            this.LIZLLL.AQ2(this.LIZJ, this.LJ, false);
        }
    }

    public C2199051B4t(C05XL<Unit> c05xl, QRCodeLoginViewModelV2 qRCodeLoginViewModelV2, String str) {
        this.LIZJ = c05xl;
        this.LIZLLL = qRCodeLoginViewModelV2;
        this.LJ = str;
    }
}
