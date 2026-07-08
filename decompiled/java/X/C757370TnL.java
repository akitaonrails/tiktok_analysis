package X;

import Y.ACListenerS116S0200000_12;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.bytedance.keva.Keva;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS378S0200000_12;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0TnL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@InterfaceC20647615qs("ai_remix_profile_compliance_notice_popup")
public final class C757370TnL extends AbstractC20660815t0 {
    public final C20515215Pi LL;
    public final C01GW LLILLJJLI;

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 0;
    }

    public C757370TnL(C0TGX c0tgx, C20515215Pi c20515215Pi) {
        super(c0tgx);
        this.LL = c20515215Pi;
        this.LLILLJJLI = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(433));
    }

    @Override // X.InterfaceC20659015si
    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (!a0.LJJJIL(curUserId)) {
            C1952607kq c1952607kq = C1952607kq.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("profile_banner_shown_");
            sbLIZ.append(curUserId);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c1952607kq.getClass();
            C1952607kq.LIZ().storeBoolean(strLIZIZ, true);
            Keva.getRepo("keva_repo_ai_remix_global").storeLong("profile_banner_last_shown_time", System.currentTimeMillis());
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("action_type", "show");
        InterfaceC563050M6l interfaceC563050M6l = (InterfaceC563050M6l) this.LLILLJJLI.getValue();
        if (interfaceC563050M6l != null) {
            interfaceC563050M6l.LIZ(c0lab, "ttcrt_remix_inform_banner_show");
        }
        C20515215Pi c20515215Pi = this.LL;
        c20515215Pi.LJI(new AwS585S0100000_6(this, 314));
        Context context = c688120Qyw.LIZ;
        String strLIZIZ2 = C555520LqY.LIZIZ(2131846115);
        String strLIZIZ3 = C555520LqY.LIZIZ(2131846114);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZIZ3);
        sbLIZ2.append(' ');
        sbLIZ2.append(strLIZIZ2);
        String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ2);
        int iLJJJ = a0.LJJJ(strLIZIZ4, strLIZIZ2, 0, false, 6);
        SpannableString spannableString = new SpannableString(strLIZIZ4);
        C786410Ut5.p2(spannableString, new C444920HcY(61, false), 0, strLIZIZ4.length(), 17);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
        if (numLIZJ != null) {
            C786410Ut5.p2(spannableString, new ForegroundColorSpan(numLIZJ.intValue()), 0, strLIZIZ4.length(), 17);
        }
        C786410Ut5.p2(spannableString, new C444920HcY(62, false), iLJJJ, strLIZIZ2.length() + iLJJJ, 17);
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1q, context);
        if (numLIZJ2 != null) {
            C786410Ut5.p2(spannableString, new ForegroundColorSpan(numLIZJ2.intValue()), iLJJJ, strLIZIZ2.length() + iLJJJ, 17);
        }
        C1057450dcl c1057450dcl = c20515215Pi.LIZ;
        c1057450dcl.LJFF = spannableString;
        c1057450dcl.LJIIJ = 0;
        c1057450dcl.LIZIZ = 8000L;
        c1057450dcl.LIZJ = true;
        c1057450dcl.LJIIJJI = new ACListenerS116S0200000_12(this, c688120Qyw, 77);
        c20515215Pi.LIZ.LJIILJJIL = new AwS378S0200000_12(this, c20656615sK, 80);
        this.LL.LJ();
    }
}
