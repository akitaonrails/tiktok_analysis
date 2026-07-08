package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: X.0nVg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1437460nVg {
    public final String LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public boolean LIZLLL;
    public final InterfaceC1437480nVi LJ;
    public C11JF LJII;
    public String LJIIIZ;
    public String LJIIJ;
    public String LJIIJJI;
    public volatile boolean LJIIL;
    public final ConcurrentLinkedQueue<String> LJFF = new ConcurrentLinkedQueue<>();
    public final int LJI = C0C64.LJIILLIIL().LJIJ(31744, -1, "upload_status_report_gap_s", true);
    public long LJIIIIZZ = -1;

    public final void LIZ(EnumC1288180jcu enumC1288180jcu) {
        if (this.LJI <= 0) {
            return;
        }
        this.LJIIL = true;
        C11JF c11jf = this.LJII;
        if (c11jf != null && !c11jf.isDisposed()) {
            this.LJII.dispose();
        }
        LIZIZ(enumC1288180jcu);
    }

    public final void LIZIZ(EnumC1288180jcu enumC1288180jcu) {
        String str;
        String str2;
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(1, "mob_lost_assist");
        c0lab.LJ("shoot_way", this.LIZIZ);
        c0lab.LJ("content_type", this.LJIIJ);
        c0lab.LJ("content_source", this.LJIIJJI);
        c0lab.LIZIZ(SystemClock.uptimeMillis() - this.LJIIIIZZ, "mob_lost_gap");
        c0lab.LIZ(20001, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LIZLLL(enumC1288180jcu, "upload_is_success");
        String str3 = "1";
        if (this.LIZJ) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("retry_publish", str);
        this.LJ.LIZIZ();
        c0lab.LJ("is_synthetic_success", CardStruct.IStatusCode.DEFAULT);
        this.LJ.LIZ();
        c0lab.LIZ(-1, "synthetic_error_code");
        c0lab.LIZ(32, "publish_step");
        if (this.LIZLLL) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("is_click_publish", str2);
        if (!C790050Uyx.LIZ(C0CHQ.LIZ)) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("network_available", str3);
        ArrayList<String> arrayList = new ArrayList(this.LJFF);
        this.LJFF.clear();
        String str4 = "";
        String strLIZIZ = "";
        for (String str5 : arrayList) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZIZ);
            sbLIZ.append(" | ");
            sbLIZ.append(str5);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        c0lab.LJ("upload_error_msg", strLIZIZ);
        String str6 = this.LJIIIZ;
        if (str6 != null) {
            str4 = str6;
        }
        c0lab.LJ("creation_id", str4);
        c0lab.LJ("publish_id", this.LIZ);
        C20684815ws.LJIILLIIL("parallel_publish_result", c0lab.LIZ);
    }

    public C1437460nVg(String str, String str2, boolean z, boolean z2, C1437470nVh c1437470nVh) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = c1437470nVh;
    }
}
