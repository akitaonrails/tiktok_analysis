package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.utils.TimeUtils;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0j7R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1268670j7R implements C0UHL {
    public final /* synthetic */ C0UHL LL;
    public final /* synthetic */ C1268630j7N LLILLJJLI;

    @Override // X.InterfaceC1266820j4S
    public final void LIZJ(Map map) {
        C0UHL c0uhl = this.LL;
        if (c0uhl != null) {
            c0uhl.LIZJ(map);
        }
    }

    public C1268670j7R(C1268630j7N c1268630j7N, C0UHL c0uhl) {
        this.LLILLJJLI = c1268630j7N;
        this.LL = c0uhl;
    }

    @Override // X.InterfaceC1266820j4S
    public final void LIZLLL(int i, int i2, int i3) {
        InterfaceC1269030j81 interfaceC1269030j81 = this.LLILLJJLI.LLLFFI;
        if (interfaceC1269030j81 != null) {
            ((C1274850jHP) interfaceC1269030j81).LJIILIIL(i, i2, new Object[0]);
        }
        C0UHL c0uhl = this.LL;
        if (c0uhl != null) {
            c0uhl.LIZLLL(i, i2, i3);
        }
        if (i != 5) {
            if (i != 6) {
                if (i != 32) {
                    if (i == 44) {
                        C1268630j7N c1268630j7N = this.LLILLJJLI;
                        c1268630j7N.getClass();
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("capture_ntp_ts", TimeUtils.getServerTimeMSec());
                            c1268630j7N.LLZLLIL(jSONObject, "video_e2e_delay");
                            return;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            return;
                        }
                    }
                    return;
                }
            } else {
                C1268630j7N c1268630j7N2 = this.LLILLJJLI;
                c1268630j7N2.LLLII = i2;
                if (i2 != 1 && i2 != 2) {
                    if (i2 == 5) {
                        this.LLILLJJLI.getClass();
                    }
                } else {
                    c1268630j7N2.getClass();
                }
            }
            this.LLILLJJLI.getClass();
            return;
        }
        C1268630j7N c1268630j7N3 = this.LLILLJJLI;
        c1268630j7N3.LLLII = i2;
        if (i2 != 1 && i2 != 2) {
            if (i2 == 5) {
                this.LLILLJJLI.getClass();
                return;
            }
            return;
        }
        c1268630j7N3.getClass();
    }

    @Override // X.InterfaceC1266820j4S
    public final void onInfo(int i, int i2, String str) {
        C0UHL c0uhl = this.LL;
        if (c0uhl != null) {
            c0uhl.onInfo(i, i2, str);
        }
    }

    @Override // X.C0UHL
    public final void LLLZ(String str, String str2, Map<String, Object> map, C0U8C c0u8c) {
        C0UHL c0uhl = this.LL;
        if (c0uhl != null) {
            c0uhl.LLLZ(str, str2, map, c0u8c);
        }
    }
}
