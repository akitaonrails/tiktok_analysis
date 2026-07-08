package X;

import Y.ACallableS177S0300000_9;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: renamed from: X.0OD4, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OD4 extends C1398630mV3 {
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;

    public C0OD4(View view, String str, InterfaceC1260110itd interfaceC1260110itd) {
        super(view, str, interfaceC1260110itd);
        TuxIconView tuxIconView = (TuxIconView) this.LLJ.findViewById(R.id.qcw);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tuxIconView.getLayoutParams();
        C426750GoL.LJIIJ(marginLayoutParams, this.LLIZ, 0, 0, 0, 0, 32);
        marginLayoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
        marginLayoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
        tuxIconView.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        tuxIconView.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        C12P5 c12p5 = new C12P5();
        c12p5.LIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
        c12p5.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
        c12p5.LIZLLL = Integer.valueOf(R.attr.e1);
        c12p5.LJ = Float.valueOf(0.2f);
        c12p5.LJFF = Float.valueOf(0.0f);
        c12p5.LJII = EnumC197015126j.LINEAR;
        c12p5.LJI = C12KQ.RADIAL;
        tuxIconView.setBackground(c12p5.LIZ(this.LLIZ));
        h6();
        this.LLJLLL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1702));
        this.LLJZ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1699));
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1701));
        this.LLL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1700));
    }

    @Override // X.C1398630mV3
    public final void b6(Aweme aweme, int i, boolean z, Bundle bundle) {
        Object obj;
        AddYoursTopic addYoursTopic;
        Aweme aweme2;
        super.b6(aweme, i, z, bundle);
        if (AwemeExtKt.getFollowStatus(aweme) == 2) {
            C339190DRl.LIZLLL(this.LLJILJIL);
            this.LLJILJIL.setText(this.itemView.getContext().getResources().getText(2131834932));
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ej, this.itemView.getContext());
            if (numLIZJ != null) {
                this.LLJILJIL.setTextColor(numLIZJ.intValue());
            }
            this.LLJILJIL.setBackgroundResource(R.drawable.bh4);
        }
        C730000SkI.LIZIZ.LIZLLL(249372161, true);
        Object obj2 = null;
        InterfaceC665370Q7z interfaceC665370Q7zLJ = C1558360qeg.LJ(this.itemView, null);
        C1554960qZC.LIZ(interfaceC665370Q7zLJ, aweme, Aweme.class, "source_default_key");
        C1554960qZC.LIZ(interfaceC665370Q7zLJ, new C0OB6("add_yours_detail_page", null, null, 14), C0OB6.class, "source_default_key");
        try {
            obj = bundle.get("from_aweme");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            obj = null;
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            obj = null;
        }
        if ((obj instanceof Aweme) && (aweme2 = (Aweme) obj) != null) {
            C1554960qZC.LIZ(interfaceC665370Q7zLJ, aweme2, Aweme.class, "from_aweme");
        }
        try {
            obj2 = bundle.get("topic");
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
        } catch (OutOfMemoryError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        if ((obj2 instanceof AddYoursTopic) && (addYoursTopic = (AddYoursTopic) obj2) != null) {
            C1554960qZC.LIZ(interfaceC665370Q7zLJ, addYoursTopic, AddYoursTopic.class, "topic");
        }
        C15O7.LIZJ(new ACallableS177S0300000_9(this, bundle, aweme, 1));
    }
}
