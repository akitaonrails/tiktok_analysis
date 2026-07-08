package X;

import kotlin.jvm.internal.AwS220S0300000_11;
import kotlin.jvm.internal.AwS255S0300000_11;

/* JADX INFO: renamed from: X.0SdE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC725620SdE extends C10GR {
    public final String LL;
    public long LLILLJJLI;
    public AwS220S0300000_11 LLILLL;
    public AwS255S0300000_11 LLILZ;

    public abstract void LJIIL();

    @Override // X.InterfaceC20660415sw
    public final /* bridge */ /* synthetic */ C688120Qyw i2() {
        return null;
    }

    @Override // X.AbstractC20656215sG
    public final void onConflict() {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("show ");
        sbLIZ.append(this.LL);
        sbLIZ.append(" conflicted");
        C1720106oR.LJI("StoryGestureEducation", C2188811AlT.LIZIZ(sbLIZ));
    }

    public AbstractC725620SdE(String str) {
        this.LL = str;
    }

    @Override // X.AbstractC20656215sG
    public final void onPopupStateChanged(EnumC20657015sO enumC20657015sO, EnumC20657015sO enumC20657015sO2) {
        int i = C20657315sR.LIZ[enumC20657015sO2.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3 && i != 4) {
                return;
            }
            LJIIL();
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILLJJLI;
            AwS220S0300000_11 awS220S0300000_11 = this.LLILLL;
            if (awS220S0300000_11 == null) {
                return;
            }
            awS220S0300000_11.invoke(Long.valueOf(jCurrentTimeMillis));
            return;
        }
        this.LLILLJJLI = System.currentTimeMillis();
        AwS255S0300000_11 awS255S0300000_11 = this.LLILZ;
        if (awS255S0300000_11 == null) {
            return;
        }
        awS255S0300000_11.invoke();
    }

    @Override // X.AbstractC20656215sG
    public final void showPopupFailed(int i, String str) {
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("show ");
        sbLIZ.append(this.LL);
        sbLIZ.append(" failed for errCode: ");
        sbLIZ.append(i);
        sbLIZ.append(": ");
        sbLIZ.append(str);
        C1720106oR.LJI("StoryGestureEducation", C2188811AlT.LIZIZ(sbLIZ));
    }
}
