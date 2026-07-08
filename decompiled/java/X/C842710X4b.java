package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedList;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0X4b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C842710X4b implements InterfaceC859170Xn9 {
    public final boolean LIZ;
    public final Function0<Long> LIZIZ;
    public final InterfaceC1493105sv LIZJ;
    public final Function0<C792720V7u> LIZLLL;
    public final C842720X4c LJ;
    public long LJFF;
    public long LJI;
    public long LJII;
    public long LJIIIIZZ;

    @Override // X.InterfaceC859170Xn9
    public final void LIZ() {
        if (this.LIZ) {
            C792720V7u c792720V7uInvoke = this.LIZLLL.invoke();
            C842720X4c c842720X4c = this.LJ;
            if (!c792720V7uInvoke.LLJJJJJIL.isEmpty() && c842720X4c != null) {
                ((LinkedList) c792720V7uInvoke.LLJJJJJIL).remove(c842720X4c);
            }
            if (this.LJIIIIZZ > 0) {
                this.LIZJ.sendEvent("im_chat_room_net_traffic", C2097608Jq.LJIIIIZZ(new Pair("total_stay_time", String.valueOf(this.LIZIZ.invoke().longValue() - this.LJIIIIZZ)), new Pair("total_send_bytes", String.valueOf(this.LJFF)), new Pair("total_receive_bytes", String.valueOf(this.LJI)), new Pair("total_request_count", String.valueOf(this.LJII))));
            }
            this.LJFF = 0L;
            this.LJI = 0L;
            this.LJII = 0L;
            this.LJIIIIZZ = 0L;
        }
    }

    @Override // X.InterfaceC859170Xn9
    public final void start() {
        if (this.LIZ) {
            this.LIZLLL.invoke().LJIIIZ(this.LJ);
            if (this.LJIIIIZZ == 0) {
                this.LJIIIIZZ = this.LIZIZ.invoke().longValue();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0X4c] */
    public C842710X4b(int i) {
        boolean z = C0C64.LJIILLIIL().LJIJ(31744, 0, "tt_im_chat_room_traffic_analytics", true) == 1;
        C0N36 c0n36 = new C0N36();
        InterfaceC1493505sz interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        C842730X4d c842730X4d = new C842730X4d();
        this.LIZ = z;
        this.LIZIZ = c0n36;
        this.LIZJ = interfaceC1493505szLIZIZ;
        this.LIZLLL = c842730X4d;
        this.LJ = new InterfaceC792740V7w() { // from class: X.0X4c
            @Override // X.InterfaceC792740V7w
            public final void LIZ(String str, JSONObject jSONObject) {
                try {
                    this.LIZ.LIZIZ(str, jSONObject);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(java.lang.String r10, org.json.JSONObject r11) {
        /*
            r9 = this;
            if (r10 == 0) goto L64
            int r0 = r10.length()
            if (r0 == 0) goto L64
            if (r11 == 0) goto L64
            int r0 = r11.length()
            if (r0 == 0) goto L64
            long r2 = r9.LJII
            r0 = 1
            long r2 = r2 + r0
            r9.LJII = r2
            java.lang.String r0 = "timing_totalSendBytes"
            r3 = 0
            long r7 = r11.optLong(r0, r3)
            java.lang.String r0 = "timing_totalReceivedBytes"
            long r5 = r11.optLong(r0, r3)
            long r1 = r7 + r5
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L5a
            java.lang.String r0 = "request_log"
            org.json.JSONObject r1 = r11.optJSONObject(r0)
            if (r1 != 0) goto L46
            java.lang.String r2 = r11.optString(r0)
            if (r2 == 0) goto L5a
            int r0 = r2.length()
            if (r0 == 0) goto L5a
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>(r2)
        L46:
            java.lang.String r0 = "response"
            org.json.JSONObject r1 = r1.optJSONObject(r0)
            if (r1 == 0) goto L5a
            java.lang.String r0 = "received_bytes"
            long r7 = r1.optLong(r0)
            java.lang.String r0 = "sent_bytes"
            long r5 = r1.optLong(r0)
        L5a:
            long r0 = r9.LJFF
            long r0 = r0 + r7
            r9.LJFF = r0
            long r0 = r9.LJI
            long r0 = r0 + r5
            r9.LJI = r0
        L64:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C842710X4b.LIZIZ(java.lang.String, org.json.JSONObject):void");
    }
}
