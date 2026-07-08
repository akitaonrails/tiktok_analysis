package X;

import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.text.a0;
import wh6.AbS686S0100000_2;

/* JADX INFO: renamed from: X.06qf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC20647615qs("dm_age_graduation")
public final class C1733906qf extends AbstractC20660115st<DialogFragment> {
    public final Context LL;
    public final FragmentManager LLILLJJLI;
    public final int LLILLL;

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LLILLL;
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C688120Qyw c688120Qyw) {
        C21411818qq c21411818qq;
        Context context = this.LL;
        final C1734006qg c1734006qg = new C1734006qg(context);
        FragmentManager fragmentManager = this.LLILLJJLI;
        C1734106qh.LIZ.getClass();
        final C1733606qc c1733606qc = new C1733606qc(context);
        C1733806qe c1733806qe = c1734006qg.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AgeGraduationSheet bindState, state = ");
        sbLIZ.append(c1733806qe);
        C2188811AlT.LIZIZ(sbLIZ);
        c1733606qc.LLILLJJLI = c1733806qe;
        C786410Ut5.Sd(R.layout.cef, C786410Ut5.ne(c1733606qc.getContext()), c1733606qc);
        String strLJIIJ = C1383370m6R.LJIIJ(2131830873);
        SpannableString spannableString = new SpannableString(C1710306mr.LIZIZ(2131830874, strLJIIJ));
        int iLJJJ = a0.LJJJ(spannableString.toString(), strLJIIJ, 0, false, 6);
        C786410Ut5.p2(spannableString, new AbstractC426530Gnz() { // from class: X.0Dbf
            @Override // android.text.style.ClickableSpan
            public final void onClick(View view) {
                C342440Dbe c342440Dbe = C342440Dbe.LIZ;
                Context context2 = view.getContext();
                c342440Dbe.getClass();
                C342440Dbe.LIZ(context2);
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                C444890HcV c444890HcV = new C444890HcV();
                c444890HcV.LIZ(63);
                textPaint.setTypeface(c444890HcV.getTypeface());
                textPaint.setUnderlineText(false);
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, c1733606qc.getContext());
                if (numLIZJ != null) {
                    textPaint.setColor(numLIZJ.intValue());
                }
            }
        }, iLJJJ, strLJIIJ.length() + iLJJJ, 33);
        TuxTextView tuxTextView = (TuxTextView) c1733606qc.findViewById(R.id.wgz);
        tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
        tuxTextView.setText(spannableString, TextView.BufferType.SPANNABLE);
        c1733606qc.findViewById(R.id.su_).getBackground().setAlpha(30);
        c1733606qc.findViewById(R.id.a64).getBackground().setAlpha(30);
        C1733806qe c1733806qe2 = c1733606qc.LLILLJJLI;
        if (c1733806qe2 != null) {
            C21411818qq c21411818qq2 = (C21411818qq) c1733606qc.findViewById(R.id.suc);
            c21411818qq2.setChecked(c1733806qe2.LIZ);
            C786410Ut5.C7(c21411818qq2, new C1767606w6(c1733806qe2, 5));
        }
        C1733806qe c1733806qe3 = c1733606qc.LLILLJJLI;
        if (c1733806qe3 != null && (c21411818qq = (C21411818qq) c1733606qc.findViewById(R.id.a6b)) != null) {
            c21411818qq.setChecked(c1733806qe3.LIZIZ);
            C786410Ut5.C7(c21411818qq, new C1767606w6(c1733806qe3, 4));
        }
        C786410Ut5.I7(new AbS686S0100000_2(c1733606qc, 22), c1733606qc.findViewById(R.id.pk8));
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS546S0100000_2(c1733606qc, 1125));
        c0om1.LIZIZ(c1251150ifB);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIII = c1733606qc;
        c1390920mIc.LJIIIIZZ(0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJIL = c0om1;
        tuxSheet.LLJJJ = null;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zp, c1733606qc.getContext());
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLJI = numLIZJ;
        tuxSheet2.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.06qd
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                Object obj;
                C1231704rr c1231704rr = C1734106qh.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("AgeGraduationSheet onDismiss state = ");
                sbLIZ2.append(c1734006qg.LIZIZ);
                C2188811AlT.LIZIZ(sbLIZ2);
                c1231704rr.getClass();
                c1733606qc.LIZIZ();
                C1734006qg c1734006qg2 = c1734006qg;
                C1733806qe c1733806qe4 = c1734006qg2.LIZIZ;
                c1734006qg2.getClass();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("AgeGraduationSheet reportCloseEvent, state = ");
                sbLIZ3.append(c1733806qe4);
                C2188811AlT.LIZIZ(sbLIZ3);
                c1231704rr.getClass();
                boolean z = c1733806qe4.LIZ;
                C0I0B c0i0b = C0I0B.LJFF;
                InterfaceC1493505sz interfaceC1493505szLIZIZ = c0i0b.LIZIZ();
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("AgeGraduationAnalytics read_receipt_pop_up_close statusIsOn = ");
                sbLIZ4.append(z);
                C2188811AlT.LIZIZ(sbLIZ4);
                Pair[] pairArr = new Pair[2];
                pairArr[0] = new Pair("enter_method", "graduation_notification");
                String str = "on";
                if (z) {
                    obj = "on";
                } else {
                    obj = "off";
                }
                pairArr[1] = new Pair("to_status", obj);
                interfaceC1493505szLIZIZ.sendEvent("read_receipt_pop_up_close", C2097608Jq.LJIIJ(pairArr));
                boolean z2 = c1733806qe4.LIZIZ;
                InterfaceC1493505sz interfaceC1493505szLIZIZ2 = c0i0b.LIZIZ();
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("AgeGraduationAnalytics activity_status_pop_up_close statusIsOn = ");
                sbLIZ5.append(z2);
                C2188811AlT.LIZIZ(sbLIZ5);
                Pair[] pairArr2 = new Pair[2];
                pairArr2[0] = new Pair("enter_method", "graduation_notification");
                if (!z2) {
                    str = "off";
                }
                pairArr2[1] = new Pair("to_status", str);
                interfaceC1493505szLIZIZ2.sendEvent("activity_status_pop_up_close", C2097608Jq.LJIIJ(pairArr2));
            }
        };
        tuxSheet2.show(fragmentManager, "AgeGraduation");
        C0I0B c0i0b = C0I0B.LJFF;
        c0i0b.LIZIZ();
        C20684815ws.LJIILLIIL("read_receipt_pop_up_show", C2097608Jq.LJIIJ(new Pair("enter_method", "graduation_notification")));
        c0i0b.LIZIZ();
        C20684815ws.LJIILLIIL("activity_status_pop_up_show", C2097608Jq.LJIIJ(new Pair("enter_method", "graduation_notification")));
        return tuxSheet2;
    }

    public C1733906qf(Context context, FragmentManager fragmentManager, InterfaceC20660615sy interfaceC20660615sy) {
        super(interfaceC20660615sy);
        this.LL = context;
        this.LLILLJJLI = fragmentManager;
        this.LLILLL = 1;
    }
}
