package X;

import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03Vn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C854503Vn extends C09AY implements InterfaceC1631620sYq<Boolean, Integer, String, Unit> {
    public final /* synthetic */ C854403Vm LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ JSONObject LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C854503Vn(C854403Vm c854403Vm, String str, long j, JSONObject jSONObject) {
        super(3);
        this.LL = c854403Vm;
        this.LLILLJJLI = str;
        this.LLILLL = j;
        this.LLILZ = jSONObject;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Boolean bool, Integer num, String str) {
        boolean zBooleanValue = bool.booleanValue();
        final int iIntValue = num.intValue();
        final String str2 = str;
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[OspPrivacyPopup] updatePNSConsentStatus, isSuccess=");
        sbLIZ.append(zBooleanValue);
        sbLIZ.append(", code=");
        sbLIZ.append(iIntValue);
        sbLIZ.append(", msg=");
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        if (zBooleanValue) {
            ((InterfaceC854803Vq) this.LL.LIZJ.getValue()).LIZ(Long.valueOf(System.currentTimeMillis() - this.LLILLL), this.LLILLJJLI, this.LLILZ);
        } else {
            ((InterfaceC854803Vq) this.LL.LIZJ.getValue()).LIZJ(this.LLILLJJLI, new InterfaceC855403Vw(iIntValue, str2) { // from class: X.03Vs
                public final int LL;
                public final String LLILLJJLI;

                @Override // X.InterfaceC855403Vw
                public final int getErrorCode() {
                    return this.LL;
                }

                @Override // X.InterfaceC855403Vw
                public final String getMessage() {
                    return this.LLILLJJLI;
                }

                {
                    this.LL = iIntValue;
                    this.LLILLJJLI = str2;
                }
            }, this.LLILZ);
        }
        return Unit.LIZ;
    }
}
