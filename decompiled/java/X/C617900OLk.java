package X;

import Y.ACListenerS113S0200000_9;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import avg.f;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.FypAutoScrollService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import mf.a;

/* JADX INFO: renamed from: X.0OLk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C617900OLk {
    public final Context LIZ;
    public final Aweme LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final TuxSheet LJ;
    public final C01GW LJFF;
    public final List<C0OGQ> LJI;

    public final void LIZ() {
        FragmentManager supportFragmentManager;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LIZ);
        if (c19egLIZIZ == null || (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) == null) {
            return;
        }
        TuxSheet tuxSheet = this.LJ;
        if (tuxSheet == null) {
            tuxSheet = null;
        }
        C1391850mK7.LIZIZ(tuxSheet, "longpresspanel_playback_speed_nscreen");
        C1440005kM.LIZ(new C453940Hr6(true, false, 6));
        TuxSheet tuxSheet2 = this.LJ;
        (tuxSheet2 != null ? tuxSheet2 : null).show(supportFragmentManager, "speed_select");
        FypAutoScrollService fypAutoScrollServiceLIZJ = C1386360mBG.LIZJ();
        if (fypAutoScrollServiceLIZJ != null) {
            fypAutoScrollServiceLIZJ.LJIJI(true);
        }
    }

    public C617900OLk(Context context, Aweme aweme, String str, String str2) {
        CharSequence charSequenceLIZIZ;
        this.LIZ = context;
        this.LIZIZ = aweme;
        this.LIZJ = str;
        this.LIZLLL = str2;
        C0OM1 c0om1 = new C0OM1();
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(567));
        this.LJFF = c01gwLIZIZ;
        this.LJI = new ArrayList();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS553S0100000_9(this, 1820));
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = context.getResources().getString(2131840511);
        c0om1.LIZJ = c1250250idj;
        c0om1.LIZIZ(c1251150ifB);
        c0om1.LIZLLL = true;
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        boolean zLJ = c19252910Tv.LIZLLL().LIZIZ().LJ(context);
        if (zLJ) {
            c19252910Tv.LIZLLL().LIZIZ().LIZIZ("", "FeedSpeedSelectSheet", str);
        }
        C1390920mIc c1390920mIc = new C1390920mIc(zLJ, C1389340mG4.LIZJ(context, null).LIZIZ);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJIL = c0om1;
        tuxSheet.LLJJJ = null;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        LinearLayout linearLayout = new LinearLayout(context);
        C786410Ut5.d6(linearLayout, layoutParams);
        linearLayout.setOrientation(1);
        if (c19252910Tv.LIZLLL().LJIJI().LJJIJL()) {
            linearLayout.addView(new C617940OLo(context, aweme, str));
        }
        Iterator it2 = ((List) c01gwLIZIZ.getValue()).iterator();
        while (it2.hasNext()) {
            float fFloatValue = ((Number) it2.next()).floatValue();
            if (!C426750GoL.LIZLLL(this.LIZ)) {
                if (fFloatValue == 1.0f) {
                    charSequenceLIZIZ = this.LIZ.getText(2131821882);
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    C1386110mAr.LIZ.getClass();
                    sbLIZ.append(C1386110mAr.LIZ(fFloatValue));
                    sbLIZ.append((char) 215);
                    charSequenceLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
            } else if (fFloatValue == 1.0f) {
                charSequenceLIZIZ = this.LIZ.getText(2131821882);
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append((char) 215);
                C1386110mAr.LIZ.getClass();
                sbLIZ2.append(C1386110mAr.LIZ(fFloatValue));
                charSequenceLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            C0OGQ c0ogq = new C0OGQ(this.LIZ);
            if (fFloatValue == 1.0f) {
                c0ogq.LLILLL.setChecked(true);
            }
            c0ogq.setSpeedValue(fFloatValue);
            c0ogq.setSpeedText(charSequenceLIZIZ.toString());
            View.OnClickListener aCListenerS113S0200000_9 = new ACListenerS113S0200000_9(c0ogq, this, 50);
            a aVar = new a(C1848410yCV.LIZ ? new f(aCListenerS113S0200000_9) : aCListenerS113S0200000_9);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(c0ogq);
            }
            c0ogq.setOnClickListener(aVar);
            linearLayout.addView(c0ogq);
            ((ArrayList) this.LJI).add(c0ogq);
        }
        C589960NBy c589960NBy = C589960NBy.LIZ;
        Aweme aweme2 = this.LIZIZ;
        c589960NBy.getClass();
        float fLIZIZ = C589960NBy.LIZIZ(aweme2);
        Iterator<View> it3 = new C09RD(linearLayout).iterator();
        while (true) {
            C09RE c09re = (C09RE) it3;
            if (c09re.hasNext()) {
                View view = (View) c09re.next();
                if ((view instanceof C0OGQ) && view != null) {
                    C0OGQ c0ogq2 = (C0OGQ) view;
                    if (c0ogq2.getSpeedValue() == fLIZIZ) {
                        c0ogq2.LLILLL.setChecked(true);
                    } else {
                        c0ogq2.LLILLL.setChecked(false);
                    }
                }
            } else {
                TuxSheet tuxSheet2 = c1390920mIc.LIZ;
                tuxSheet2.LLJJIII = linearLayout;
                tuxSheet2.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.0OFW
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        FypAutoScrollService fypAutoScrollServiceLIZJ = C1386360mBG.LIZJ();
                        if (fypAutoScrollServiceLIZJ != null) {
                            fypAutoScrollServiceLIZJ.LJIJI(false);
                        }
                        C1440005kM.LIZ(new C453940Hr6(false, false, 6));
                    }
                };
                this.LJ = tuxSheet2;
                return;
            }
        }
    }
}
