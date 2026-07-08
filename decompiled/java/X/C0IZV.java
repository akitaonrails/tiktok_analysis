package X;

import android.content.Context;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestFeSchemaConfigSetting;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0IZV, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IZV implements C0ILL {
    public static final /* synthetic */ int LJ = 0;
    public final Context LIZ;
    public final DataChannel LIZIZ;
    public SparkContext LIZJ;
    public C0ILQ LIZLLL;

    public static String LIZLLL() {
        MultiGuestFeSchemaConfigSetting multiGuestFeSchemaConfigSetting = MultiGuestFeSchemaConfigSetting.INSTANCE;
        String str = multiGuestFeSchemaConfigSetting.getValue().guestReviewPanel;
        if (str == null) {
            str = "";
        }
        return str.length() == 0 ? multiGuestFeSchemaConfigSetting.getValue().guestOverview : str;
    }

    @Override // X.C0ILL
    public final void LIZIZ() {
        InterfaceC1059280dfi interfaceC1059280dfiLJJIJLIJ;
        InterfaceC1059280dfi interfaceC1059280dfiLJJIJLIJ2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C0IZV.class.getSimpleName());
        sbLIZ.append("_dismissConclusionDialog context:");
        Context context = this.LIZ;
        int iHashCode = 0;
        sbLIZ.append(context != null ? context.hashCode() : 0);
        sbLIZ.append(" sparkContainer:");
        SparkContext sparkContext = this.LIZJ;
        if (sparkContext != null && (interfaceC1059280dfiLJJIJLIJ2 = sparkContext.LJJIJLIJ()) != null) {
            iHashCode = interfaceC1059280dfiLJJIJLIJ2.hashCode();
        }
        sbLIZ.append(iHashCode);
        C20441214yg.LJIIIZ("leave_mic_opt", C2188811AlT.LIZIZ(sbLIZ));
        SparkContext sparkContext2 = this.LIZJ;
        if (sparkContext2 != null && (interfaceC1059280dfiLJJIJLIJ = sparkContext2.LJJIJLIJ()) != null) {
            interfaceC1059280dfiLJJIJLIJ.close();
        }
        this.LIZJ = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0175  */
    @Override // X.C0ILL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C464920ILa r10) {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0IZV.LIZ(X.0ILa):void");
    }

    @Override // X.C0ILL
    public final void LIZJ(C0ILM c0ilm) {
        this.LIZLLL = c0ilm;
    }

    public C0IZV(Context context, DataChannel dataChannel) {
        this.LIZ = context;
        this.LIZIZ = dataChannel;
    }
}
