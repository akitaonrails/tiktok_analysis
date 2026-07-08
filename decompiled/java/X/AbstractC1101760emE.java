package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0emE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1101760emE implements InterfaceC1141530foN {
    public final Map<String, String> LL;
    public final InterfaceC1631620sYq<EnumC1101860emO, String, String, Unit> LLILLJJLI;
    public EnumC1101800emI LLILLL;
    public EnumC1101800emI LLILZ;
    public InterfaceC1085330eLj LLILZIL;
    public InterfaceC1101890emR LLILZLL;

    public abstract InterfaceC1101940emW LIZ(ViewGroup viewGroup, boolean z);

    public abstract String LIZIZ();

    public abstract String LIZJ();

    public abstract boolean LIZLLL();

    public abstract long LJ();

    public abstract View LJFF();

    public int LJIIIIZZ() {
        return 0;
    }

    public abstract void LJIIIZ();

    public void LJIIJJI() {
    }

    public int LJIIL() {
        return 0;
    }

    public void LJIILJJIL() {
    }

    public abstract String LJIILL();

    public String LJIILLIIL() {
        return "";
    }

    public final View LJI() {
        InterfaceC1085330eLj interfaceC1085330eLj = this.LLILZIL;
        if (interfaceC1085330eLj != null) {
            return interfaceC1085330eLj.LLLILZJ();
        }
        return null;
    }

    public void LJIIJ() {
        InterfaceC1085330eLj interfaceC1085330eLj = this.LLILZIL;
        if (interfaceC1085330eLj != null) {
            interfaceC1085330eLj.Pl();
        }
        InterfaceC1085330eLj interfaceC1085330eLj2 = this.LLILZIL;
        if (interfaceC1085330eLj2 != null) {
            interfaceC1085330eLj2.LJLJL();
        }
    }

    public void LJIILIIL() {
        InterfaceC1085330eLj interfaceC1085330eLj = this.LLILZIL;
        if (interfaceC1085330eLj != null) {
            interfaceC1085330eLj.LJLJL();
        }
        this.LLILZLL = null;
        this.LLILZIL = null;
        C1548820qPI.LJIIIIZZ("lynx_short_touch_change_state", this);
        C1548820qPI.LJIIIIZZ("shorttouch_lynx_container_client_event", this);
    }

    public String LJII() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("short_touch");
        sbLIZ.append(hashCode());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LJIIZILJ(EnumC1101800emI enumC1101800emI) {
        EnumC1101800emI enumC1101800emI2 = this.LLILLL;
        if (enumC1101800emI2 == enumC1101800emI || enumC1101800emI2 == null) {
            return;
        }
        switch (C1101870emP.LIZ[enumC1101800emI2.ordinal()]) {
            case 1:
                if (enumC1101800emI != EnumC1101800emI.CREATE) {
                    return;
                }
                break;
            case 2:
                if (enumC1101800emI != EnumC1101800emI.START) {
                    return;
                }
                break;
            case 3:
                if (enumC1101800emI != EnumC1101800emI.NORMAL) {
                    return;
                }
                break;
            case 4:
                if (enumC1101800emI != EnumC1101800emI.TEMP && enumC1101800emI != EnumC1101800emI.STOP) {
                    return;
                }
                break;
            case 5:
                if (enumC1101800emI != EnumC1101800emI.NORMAL && enumC1101800emI != EnumC1101800emI.STOP) {
                    return;
                }
                break;
            case 6:
                if (enumC1101800emI != EnumC1101800emI.DESTROY && enumC1101800emI != EnumC1101800emI.START) {
                    return;
                }
                break;
            default:
                return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("change state: newState: ");
        sbLIZ.append(enumC1101800emI);
        sbLIZ.append(", lastState: ");
        sbLIZ.append(this.LLILZ);
        C20441214yg.LIZIZ("ShortTouchModel", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILZ = this.LLILLL;
        this.LLILLL = enumC1101800emI;
        int i = C1101870emP.LIZ[enumC1101800emI.ordinal()];
        if (i != 2) {
            if (i != 3) {
                if (i != 7) {
                    return;
                }
                InterfaceC1101890emR interfaceC1101890emR = this.LLILZLL;
                if (interfaceC1101890emR != null) {
                    interfaceC1101890emR.LLJJIII(this);
                }
                LJIIJ();
                LJIILIIL();
                return;
            }
            LJIIJJI();
            return;
        }
        InterfaceC1085330eLj interfaceC1085330eLj = this.LLILZIL;
        if (interfaceC1085330eLj != null) {
            interfaceC1085330eLj.Ec2();
        }
        InterfaceC1101890emR interfaceC1101890emR2 = this.LLILZLL;
        if (interfaceC1101890emR2 == null) {
            return;
        }
        interfaceC1101890emR2.LLIL(this);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        InterfaceC1107590evd interfaceC1107590evd;
        long j;
        String string;
        Integer numValueOf;
        String str = c262100zr.LIZ;
        int i = 1;
        Integer numValueOf2 = null;
        if (Intrinsics.LJFF(str, "lynx_short_touch_change_state")) {
            InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
            if (interfaceC1107590evd2 != null) {
                string = interfaceC1107590evd2.getString("short_touch_name");
            } else {
                string = null;
            }
            if (Intrinsics.LJFF(string, LJIILL())) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("receive js event: state: ");
                InterfaceC1107590evd interfaceC1107590evd3 = c262100zr.LIZIZ;
                if (interfaceC1107590evd3 != null) {
                    numValueOf2 = Integer.valueOf(interfaceC1107590evd3.getInt("state"));
                }
                sbLIZ.append(numValueOf2);
                C20441214yg.LIZIZ("ShortTouchModel", C2188811AlT.LIZIZ(sbLIZ));
                InterfaceC1107590evd interfaceC1107590evd4 = c262100zr.LIZIZ;
                if (interfaceC1107590evd4 != null && (numValueOf = Integer.valueOf(interfaceC1107590evd4.getInt("state"))) != null) {
                    if (numValueOf.intValue() == 0) {
                        LJIIZILJ(EnumC1101800emI.NORMAL);
                        return;
                    }
                    if (numValueOf.intValue() == 1) {
                        LJIIZILJ(EnumC1101800emI.TEMP);
                        return;
                    } else if (numValueOf.intValue() == 2) {
                        LJIIZILJ(EnumC1101800emI.STOP);
                        return;
                    } else {
                        if (numValueOf.intValue() != 3) {
                            return;
                        }
                        this.LLILLJJLI.invoke(EnumC1101860emO.ID, LIZJ(), "js event");
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (!Intrinsics.LJFF(str, "shorttouch_lynx_container_client_event") || (interfaceC1107590evd = c262100zr.LIZIZ) == null) {
            return;
        }
        String string2 = interfaceC1107590evd.getString("container_id");
        if (string2.length() == 0 || !Intrinsics.LJFF(string2, LIZJ())) {
            return;
        }
        String string3 = interfaceC1107590evd.getString("action");
        if (string3.length() <= 0) {
            return;
        }
        String string4 = interfaceC1107590evd.getString(FollowStatusChangeMethod.PARAM_UID);
        int i2 = interfaceC1107590evd.getInt(Scene.SCENE_SERVICE);
        int i3 = interfaceC1107590evd.getInt("biz");
        int i4 = interfaceC1107590evd.getInt("target_width");
        long j2 = interfaceC1107590evd.getLong("animate_duration");
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("handleContainerClientEvent: action=");
        sbLIZ2.append(string3);
        sbLIZ2.append(", id=");
        sbLIZ2.append(string4);
        sbLIZ2.append(", targetWidth=");
        sbLIZ2.append(i4);
        C20441214yg.LIZIZ("ShortTouchModel", C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("handleContainerClientEvent: action=");
        sbLIZ3.append(string3);
        sbLIZ3.append(", id=");
        sbLIZ3.append(string4);
        sbLIZ3.append(", containerId=");
        sbLIZ3.append(string2);
        sbLIZ3.append(", targetWidth=");
        sbLIZ3.append(i4);
        sbLIZ3.append(", biz=");
        sbLIZ3.append(i3);
        sbLIZ3.append(", scene=");
        sbLIZ3.append(i2);
        C20441214yg.LJ("matao-short", C2188811AlT.LIZIZ(sbLIZ3));
        switch (string3.hashCode()) {
            case -1939100487:
                if (!string3.equals("expanded")) {
                    return;
                }
                C1101780emG c1101780emG = new C1101780emG(string4, CastIntegerProtector.parseInt(interfaceC1107590evd.getString("component")), i3, i2, LIZJ(), i4, j2);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("realExpandShortTouch: id=");
                sbLIZ4.append(string4);
                sbLIZ4.append(", targetWidthDp=");
                sbLIZ4.append(i4);
                sbLIZ4.append(", animateDuration=");
                sbLIZ4.append(j2);
                C20441214yg.LJ("matao-short", C2188811AlT.LIZIZ(sbLIZ4));
                InterfaceC1101890emR interfaceC1101890emR = this.LLILZLL;
                if (interfaceC1101890emR == null) {
                    return;
                }
                View viewLJI = LJI();
                LJIILL();
                interfaceC1101890emR.LJLILLLLZI(viewLJI, c1101780emG);
                return;
            case -1289167206:
                if (!string3.equals("expand")) {
                    return;
                }
                break;
            case -903068151:
                if (!string3.equals("shrink")) {
                    return;
                }
                try {
                    i = interfaceC1107590evd.getInt("consume_method");
                    break;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                C20441214yg.LJ("matao-short", "shrinkShortTouch: id=" + string4 + ", animateDuration=" + j2);
                InterfaceC1101890emR interfaceC1101890emR2 = this.LLILZLL;
                if (interfaceC1101890emR2 == null) {
                    return;
                }
                interfaceC1101890emR2.LJLLLLLL(i, j2, LJI(), string4);
                return;
            case 260850286:
                if (!string3.equals("force_expand")) {
                    return;
                }
                break;
            default:
                return;
        }
        int i5 = CastIntegerProtector.parseInt(interfaceC1107590evd.getString("component"));
        String strLIZJ = LIZJ();
        try {
            j = interfaceC1107590evd.getLong("show_duration");
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            j = 0;
        }
        boolean zLJFF = Intrinsics.LJFF(string3, "force_expand");
        C1101780emG c1101780emG2 = new C1101780emG(string4, i5, i3, i2, j, strLIZJ, i4, j2, zLJFF);
        C20441214yg.LJ("matao-short", "requestExpandShortTouch: id=" + string4 + ", forceExpand=" + zLJFF + ", targetWidthDp=" + i4);
        InterfaceC1101890emR interfaceC1101890emR3 = this.LLILZLL;
        if (interfaceC1101890emR3 == null) {
            return;
        }
        interfaceC1101890emR3.LJLJJI(c1101780emG2, new AwS596S0100000_17(this, 589), new AwS596S0100000_17(this, 590));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC1101760emE(Map<String, String> map, InterfaceC1631620sYq<? super EnumC1101860emO, ? super String, ? super String, Unit> interfaceC1631620sYq) {
        this.LL = map;
        this.LLILLJJLI = interfaceC1631620sYq;
        EnumC1101800emI enumC1101800emI = EnumC1101800emI.INIT;
        this.LLILLL = enumC1101800emI;
        this.LLILZ = enumC1101800emI;
        C1548820qPI.LIZLLL("lynx_short_touch_change_state", this);
        C1548820qPI.LIZLLL("shorttouch_lynx_container_client_event", this);
    }
}
