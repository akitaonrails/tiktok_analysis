package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0zmh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public abstract class AbstractC1909290zmh {
    public final Activity LIZ;
    public final EnumC1909250zmd LIZIZ;
    public final InterfaceC1875070ytV LIZJ;
    public final C1909300zmi LIZLLL;
    public C1909380zmq LJ;

    public abstract void LIZJ();

    public abstract C1909380zmq LIZLLL();

    public final void LJFF() {
        this.LJ = LIZLLL();
        LJ(0, "rating_show");
        C1909300zmi c1909300zmi = this.LIZLLL;
        long jCurrentTimeMillis = System.currentTimeMillis();
        c1909300zmi.LIZJ = jCurrentTimeMillis;
        Keva keva = c1909300zmi.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c1909300zmi.LIZIZ);
        sbLIZ.append("key_last_dialog_show_time");
        keva.storeLong(C2188811AlT.LIZIZ(sbLIZ), jCurrentTimeMillis);
        C1909300zmi c1909300zmi2 = this.LIZLLL;
        C844470XAv.LIZ.getClass();
        String strValueOf = String.valueOf(C844470XAv.LIZIZ());
        c1909300zmi2.LJFF = strValueOf;
        Keva keva2 = c1909300zmi2.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(c1909300zmi2.LIZIZ);
        sbLIZ2.append("key_last_show_version");
        keva2.storeString(C2188811AlT.LIZIZ(sbLIZ2), strValueOf);
        C1909300zmi c1909300zmi3 = this.LIZLLL;
        int i = c1909300zmi3.LJIIJ + 1;
        c1909300zmi3.LJIIJ = i;
        c1909300zmi3.LIZ.storeInt("key_popup_show_times", i);
    }

    public final void LIZIZ(Integer num) {
        String str;
        String str2;
        LJ(num, "rating_submit");
        C1909300zmi c1909300zmi = this.LIZLLL;
        c1909300zmi.LJ = true;
        Keva keva = c1909300zmi.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c1909300zmi.LIZIZ);
        sbLIZ.append("key_is_clicked_submit");
        keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
        this.LIZLLL.LIZ.storeBoolean("key_is_clicked_submit", true);
        C1909300zmi c1909300zmi2 = this.LIZLLL;
        C844470XAv.LIZ.getClass();
        String strValueOf = String.valueOf(C844470XAv.LIZIZ());
        c1909300zmi2.LJI = strValueOf;
        c1909300zmi2.LIZ.storeString("key_last_click_version", strValueOf);
        Intent intent = new Intent("android.intent.action.VIEW");
        String str3 = null;
        try {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("market://details?id=");
            C1909380zmq c1909380zmq = this.LJ;
            if (c1909380zmq != null) {
                str = c1909380zmq.LJFF;
            } else {
                str = null;
            }
            sbLIZ2.append(str);
            intent.setData(UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ2)));
            if (intent.resolveActivity(this.LIZ.getPackageManager()) != null) {
                C2429209fW.LIZ().appendDataFlowId(intent, 1207965953);
                LIZ(this.LIZ, intent);
                return;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("https://play.google.com/store/apps/details?id=");
            C1909380zmq c1909380zmq2 = this.LJ;
            if (c1909380zmq2 != null) {
                str2 = c1909380zmq2.LJFF;
            } else {
                str2 = null;
            }
            sbLIZ3.append(str2);
            intent.setData(UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ3)));
            if (intent.resolveActivity(this.LIZ.getPackageManager()) != null) {
                C2429209fW.LIZ().appendDataFlowId(intent, 1207965953);
                LIZ(this.LIZ, intent);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("https://play.google.com/store/apps/details?id=");
            C1909380zmq c1909380zmq3 = this.LJ;
            if (c1909380zmq3 != null) {
                str3 = c1909380zmq3.LJFF;
            }
            sbLIZ4.append(str3);
            intent.setData(UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ4)));
            if (intent.resolveActivity(this.LIZ.getPackageManager()) != null) {
                C2429209fW.LIZ().appendDataFlowId(intent, 1207965953);
                LIZ(this.LIZ, intent);
            }
        }
    }

    public static void LIZ(Activity activity, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, activity);
        C2204961BRm.LJIILLIIL(activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+vLY/c3TshpwJF38qBdEatHTM7HrvCDPpKgEsddgcvsD26Uw==", null));
    }

    public final void LJ(Integer num, String str) {
        String value;
        C2344009Gk c2344009Gk = new C2344009Gk();
        EnumC1909250zmd enumC1909250zmd = this.LIZIZ;
        if (enumC1909250zmd == EnumC1909250zmd.INCENTIVE) {
            InterfaceC1875070ytV interfaceC1875070ytV = this.LIZJ;
            if (interfaceC1875070ytV == null || (value = interfaceC1875070ytV.getType()) == null) {
                value = "";
            }
        } else {
            value = enumC1909250zmd.getValue();
        }
        c2344009Gk.LJIIIIZZ("rating_window_type", value);
        Map<String, String> map = c2344009Gk.LIZ;
        if (num != null) {
            num.intValue();
            if (num.intValue() > 0) {
                ((HashMap) map).put("star", num.toString());
            }
        }
        C20684815ws.LJIILLIIL(str, map);
    }

    public AbstractC1909290zmh(Activity activity, EnumC1909250zmd enumC1909250zmd, InterfaceC1875070ytV interfaceC1875070ytV) {
        this.LIZ = activity;
        this.LIZIZ = enumC1909250zmd;
        this.LIZJ = interfaceC1875070ytV;
        this.LIZLLL = new C1909300zmi(enumC1909250zmd);
    }
}
