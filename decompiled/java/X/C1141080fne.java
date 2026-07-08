package X;

import kotlin.jvm.internal.AwS418S0200000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fne, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1141080fne implements InterfaceC1140400fmY {
    public final C1140370fmV LL;
    public final InterfaceC2247071CxF LLILLJJLI;
    public final C1141160fnm LLILLL;
    public C1141310fo1 LLILZ;

    @Override // X.InterfaceC1140400fmY
    public final void LIZIZ(JSONObject jSONObject) {
    }

    @Override // X.InterfaceC1140400fmY
    public final void LIZJ() {
    }

    @Override // X.InterfaceC1140400fmY
    public final void start() {
        C1140370fmV c1140370fmV = this.LL;
        InterfaceC1140970fnT interfaceC1140970fnT = c1140370fmV.LJIIIIZZ.LIZ;
        if (interfaceC1140970fnT == null) {
            c1140370fmV.LIZ.LJI(EnumC1138990fkH.LYNX, new C1141050fnb(-18, "renderView is null", null));
        } else {
            C1141290fnz.LJFF(new AwS418S0200000_17(this, interfaceC1140970fnT, 62));
        }
    }

    @Override // X.InterfaceC1140400fmY
    public final void stop() {
        C1141290fnz.LJFF(new AwS561S0100000_17(this, 380));
    }

    @Override // X.InterfaceC1140400fmY
    public final EnumC1138990fkH LIZ() {
        return EnumC1138990fkH.ALPHA_PLAYER;
    }

    public C1141080fne(C1140370fmV c1140370fmV, InterfaceC2247071CxF interfaceC2247071CxF, C1141160fnm c1141160fnm) {
        this.LL = c1140370fmV;
        this.LLILLJJLI = interfaceC2247071CxF;
        this.LLILLL = c1141160fnm;
    }
}
