package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0pq3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1526970pq3 extends AbstractC1526980pq4 {
    public final C1526570ppP LLILLJJLI;
    public final InterfaceC1527570pr1 LLILLL;
    public final InterfaceC1527530pqx LLILZ;

    @Override // X.InterfaceC1527530pqx
    public final boolean LJIIIIZZ() {
        return false;
    }

    @Override // X.AbstractC1526980pq4
    public final int LJLIL() {
        return 2;
    }

    @Override // X.InterfaceC1527530pqx
    public final void LJJLIIIJL(C1527500pqu c1527500pqu) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[SendMsgV4] send msg with https : ");
        sbLIZ.append(C1526990pq5.LJI(c1527500pqu.LIZ));
        sbLIZ.append(", can fallback: ");
        sbLIZ.append(c1527500pqu.LIZIZ);
        C1527890prX.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (c1527500pqu.LIZ != null) {
            Uri.Builder builderAppendQueryParameter = UriProtector.parse(this.LLILLJJLI.LJI).buildUpon().appendPath("v2/bytesync/api/pipeline").appendQueryParameter("device_id", ((InterfaceC1526260pou) C808470VnZ.LIZ(InterfaceC1526260pou.class)).LIZIZ().LIZ).appendQueryParameter("platform", CardStruct.IStatusCode.DEFAULT);
            if (builderAppendQueryParameter != null) {
                builderAppendQueryParameter.appendQueryParameter("aid", this.LLILLJJLI.LIZ);
                int iIntValue = C1527180pqO.LIZ(c1527500pqu.LIZ).intValue();
                C1527060pqC c1527060pqCLJJ = ((InterfaceC1526860pps) C808470VnZ.LIZ(InterfaceC1526860pps.class)).LJJ(c1527500pqu.LIZ);
                int i = 1;
                if (c1527060pqCLJJ != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("[SendMsgV4] send payload success with https ");
                    sbLIZ2.append(C1526990pq5.LJI(c1527500pqu.LIZ));
                    C1527890prX.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                    this.LLILLL.LIZ(1, c1527060pqCLJJ);
                } else {
                    if (c1527500pqu.LIZIZ && this.LLILZ != null) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("[SendMsgV4] send payload failed with https ");
                        sbLIZ3.append(C1526990pq5.LJI(c1527500pqu.LIZ));
                        sbLIZ3.append(",do fallback");
                        C1527890prX.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
                        c1527500pqu.LIZIZ = false;
                        this.LLILZ.LJJLIIIJL(c1527500pqu);
                    } else {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("[SendMsgV4] send payload failed with https ");
                        sbLIZ4.append(C1526990pq5.LJI(c1527500pqu.LIZ));
                        sbLIZ4.append(", throw it");
                        C1527890prX.LIZIZ(C2188811AlT.LIZIZ(sbLIZ4));
                    }
                    if (c1527500pqu.LIZIZ && this.LLILZ != null) {
                        return;
                    } else {
                        i = 2;
                    }
                }
                LJLJI(c1527500pqu, i, iIntValue, this.LLILLJJLI.LIZJ.LJII());
                LJLILLLLZI(c1527500pqu);
                return;
            }
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("[SendMsgV4] mismatch url with payload:");
        sbLIZ5.append(C1526990pq5.LJI(c1527500pqu.LIZ));
        C1527890prX.LIZIZ(C2188811AlT.LIZIZ(sbLIZ5));
    }

    public C1526970pq3(Context context, InterfaceC1527570pr1 interfaceC1527570pr1, C1527520pqw c1527520pqw) {
        super(context);
        this.LLILLJJLI = ((InterfaceC1525760po6) C808470VnZ.LIZ(InterfaceC1525760po6.class)).config();
        this.LLILLL = interfaceC1527570pr1;
        this.LLILZ = c1527520pqw;
    }
}
