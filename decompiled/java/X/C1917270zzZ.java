package X;

import android.content.Context;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.CustomizedFreqCtrlCheck;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0zzZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1917270zzZ implements InterfaceC1917300zzc {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public boolean LJ;
    public long LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;

    @Override // X.C10DX
    public final String LIZ() {
        if (!(!this.LJ)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("filter() called on a recordOnly() instance (name=");
            sbLIZ.append(this.LIZ);
            sbLIZ.append("); recordOnly instances carry default interval params and must not be used for judgement.");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            strLIZIZ.toString();
            throw new IllegalStateException(strLIZIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("filter(");
        sbLIZ2.append(this.LIZ);
        sbLIZ2.append(", ");
        sbLIZ2.append(this.LIZIZ);
        sbLIZ2.append(", ");
        sbLIZ2.append(this.LIZJ);
        sbLIZ2.append(", ");
        sbLIZ2.append(this.LIZLLL);
        sbLIZ2.append(")...");
        C2188811AlT.LIZIZ(sbLIZ2);
        C211000rc.LIZ("CustomizedFreqCtrlFilter");
        if (CustomizedFreqCtrlCheck.INSTANCE.disable()) {
            C211000rc.LIZ("CustomizedFreqCtrlFilter");
            return "";
        }
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        long jLIZJ = C813020Vuu.LJIIL().LIZJ(contextLIZ, LIZLLL());
        long jLIZ = C1917280zza.LIZ(this, contextLIZ);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("now: ");
        sbLIZ3.append(System.currentTimeMillis());
        sbLIZ3.append(", last_ts: ");
        sbLIZ3.append(jLIZJ);
        sbLIZ3.append(", show_times: ");
        sbLIZ3.append(jLIZ);
        C2188811AlT.LIZIZ(sbLIZ3);
        C211000rc.LIZ("CustomizedFreqCtrlFilter");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jLIZ >= this.LIZJ) {
            this.LJFF = TimeUnit.DAYS.toMinutes(this.LIZLLL);
            if (jCurrentTimeMillis - jLIZJ > ((long) this.LIZLLL) * 86400000) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("should show dialog because >= ");
                sbLIZ4.append(this.LIZJ);
                sbLIZ4.append(" times and interval > ");
                sbLIZ4.append(this.LIZLLL);
                sbLIZ4.append(" days");
                C2188811AlT.LIZIZ(sbLIZ4);
                C211000rc.LIZ("CustomizedFreqCtrlFilter");
                return "";
            }
        } else if (jCurrentTimeMillis - jLIZJ > ((long) this.LIZIZ) * 86400000) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("should show dialog because < ");
            sbLIZ5.append(this.LIZJ);
            sbLIZ5.append(" times and interval > ");
            sbLIZ5.append(this.LIZIZ);
            sbLIZ5.append(" days");
            C2188811AlT.LIZIZ(sbLIZ5);
            C211000rc.LIZ("CustomizedFreqCtrlFilter");
            return "";
        }
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("Popup filtered(now: ");
        sbLIZ6.append(jCurrentTimeMillis);
        sbLIZ6.append(", stamp: ");
        sbLIZ6.append(jLIZJ);
        sbLIZ6.append(", showUpInterval:");
        sbLIZ6.append(this.LIZIZ);
        sbLIZ6.append(", showUpIntervalAfterExiting: ");
        sbLIZ6.append(this.LIZLLL);
        sbLIZ6.append(", times: ");
        sbLIZ6.append(jLIZ);
        sbLIZ6.append(')');
        C2188811AlT.LIZIZ(sbLIZ6);
        C211000rc.LIZ("CustomizedFreqCtrlFilter");
        return this.LJI;
    }

    @Override // X.InterfaceC1917300zzc
    public final String LIZLLL() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC1917300zzc
    public final String LJFF() {
        return this.LJII;
    }

    @Override // X.InterfaceC1917300zzc
    public final long LJI() {
        return this.LJFF;
    }

    @Override // X.InterfaceC1917300zzc
    public final long LIZJ(Context context) {
        return C1917280zza.LIZ(this, context);
    }

    @Override // X.InterfaceC1917300zzc
    public final void LIZIZ(long j, Context context) {
        C1917280zza.LIZJ(this, context, j);
    }

    @Override // X.InterfaceC1917300zzc
    public final void LJ(long j, Context context) {
        C1917280zza.LIZIZ(this, context, j);
    }

    public C1917270zzZ(String str, int i, int i2, int i3) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
        this.LJFF = TimeUnit.DAYS.toMinutes(i);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("frequency_control_");
        sbLIZ.append(str);
        this.LJI = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("key_times_");
        sbLIZ2.append(str);
        this.LJII = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("key_cross_");
        sbLIZ3.append(str);
        this.LJIIIIZZ = C2188811AlT.LIZIZ(sbLIZ3);
    }
}
