package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.HashMap;
import java.util.List;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: renamed from: X.0bnZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C987270bnZ extends AbstractC1542200qEc {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractC1537870q7d
    public final void LJJZ(InterfaceC1541990qEH interfaceC1541990qEH) {
        if (1 - this.$t != 0) {
            super.LJJZ(interfaceC1541990qEH);
        } else {
            C20441214yg.LIZIZ("CombinedMatchInviterLynxPlugin", "lynx rematch button destroy");
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJJZZIII(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        if (this.$t != 0) {
            super.LJJZZIII(interfaceC1541990qEH, str);
        } else {
            LJJZZIII$0(this, interfaceC1541990qEH, str);
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
        switch (this.$t) {
            case 0:
                LJL$0(this, interfaceC1541990qEH, str, c1542120qEU);
                break;
            case 1:
                LJL$1(this, interfaceC1541990qEH, str, c1542120qEU);
                break;
            default:
                super.LJL(interfaceC1541990qEH, str, c1542120qEU);
                break;
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLI(InterfaceC1541990qEH interfaceC1541990qEH, String str, String str2) {
        if (this.$t != 0) {
            super.LJLI(interfaceC1541990qEH, str, str2);
        } else {
            LJLI$0(this, interfaceC1541990qEH, str, str2);
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
        switch (this.$t) {
            case 0:
                LJLIIIL$0(this, interfaceC1541990qEH);
                break;
            case 1:
                LJLIIIL$1(this, interfaceC1541990qEH);
                break;
            default:
                super.LJLIIIL(interfaceC1541990qEH);
                break;
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        switch (this.$t) {
            case 0:
                LJLIIL$0(this, interfaceC1541990qEH, str);
                break;
            case 1:
                C20441214yg.LIZIZ("CombinedMatchInviterLynxPlugin", "lynx rematch button load start");
                break;
            default:
                super.LJLIIL(interfaceC1541990qEH, str);
                break;
        }
    }

    public C987270bnZ(C963330bAx c963330bAx, int i) {
        this.$t = i;
        this.l1 = c963330bAx;
    }

    public static final void LJLIIIL$0(C987270bnZ c987270bnZ, InterfaceC1541990qEH interfaceC1541990qEH) {
        String strLJJIL;
        String str;
        C955440ayE c955440ayE = (C955440ayE) c987270bnZ.l0;
        if (c955440ayE != null) {
            SparkContext sparkContext = ((C963330bAx) c987270bnZ.l1).LLIZLLLIL;
            String str2 = "";
            if (sparkContext == null || (strLJJIL = sparkContext.LJJIL()) == null) {
                strLJJIL = "";
            }
            C963150bAf c963150bAf = ((C963330bAx) c987270bnZ.l1).LLILZLL;
            if (c963150bAf != null && (str = c963150bAf.LJ) != null) {
                str2 = str;
            }
            c955440ayE.LJIILIIL();
            c955440ayE.LJIIL(strLJJIL, "url", true);
            c955440ayE.LJIIL(str2, "section_type", true);
            c955440ayE.LJIJJLI("invitee_list_dynamic_section_load_success");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJLIIIL$1(C987270bnZ c987270bnZ, InterfaceC1541990qEH interfaceC1541990qEH) {
        C977630bY1 c977630bY1;
        boolean z;
        C979690bbL c979690bbL;
        boolean z2;
        boolean z3;
        List<Playbook> listLJ;
        List<Playbook> listLJ2;
        C978120bYo c978120bYo;
        C20441214yg.LIZIZ("CombinedMatchInviterLynxPlugin", "lynx rematch button load finish");
        if (!((C013C) c987270bnZ.l0).element && (c977630bY1 = ((C978090bYl) c987270bnZ.l1).LLILLJJLI) != null) {
            EnumC919170a1j value = c977630bY1.LJIILIIL.getValue();
            if (value == null) {
                value = EnumC919170a1j.UNKNOWN;
            }
            String str = c977630bY1.LJJJJZI;
            HashMap map = new HashMap();
            map.put("match_type", String.valueOf(value.getType()));
            map.put("sub_match_type", str);
            C975060bTs.LIZ("livesdk_match_inviter_lynx_render_success", map);
            InterfaceC975870bVB interfaceC975870bVBLJFF = C915980Zwa.LJI().LJFF();
            int size = 0;
            if (interfaceC975870bVBLJFF == null || (listLJ2 = interfaceC975870bVBLJFF.LJ()) == null || !C500260Jjc.LJJIJIIJI(listLJ2) || (((c978120bYo = (C978120bYo) c977630bY1.LJIL.getValue()) != null && c978120bYo.LIZJ) || c977630bY1.LJIJJ.getValue() == EnumC977690bY7.INVITED)) {
                z = false;
            } else {
                z = true;
            }
            DataChannel dataChannel = c977630bY1.LIZ;
            if (dataChannel != null) {
                c979690bbL = (C979690bbL) dataChannel.gg0(C962520b9e.class);
            } else {
                c979690bbL = null;
            }
            if (z) {
                DataChannel dataChannel2 = c977630bY1.LIZ;
                if (c979690bbL != null && c979690bbL.LIZJ) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C978350bZB.LIZJ(System.currentTimeMillis() - c977630bY1.LJJJLIIL, dataChannel2, "entrance", z2);
                if (c979690bbL != null && c979690bbL.LIZJ) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                InterfaceC975870bVB interfaceC975870bVBLJFF2 = C915980Zwa.LJI().LJFF();
                if (interfaceC975870bVBLJFF2 != null && (listLJ = interfaceC975870bVBLJFF2.LJ()) != null) {
                    size = listLJ.size();
                }
                C978350bZB.LIZIZ(z3, "", false, size, "show", LSPassThroughRecordSizeConfig.DEFAULT, c977630bY1.LIZ, "entrance", 64);
            }
        }
    }

    public C987270bnZ(C013C c013c, C978090bYl c978090bYl, int i) {
        this.$t = i;
        this.l0 = c013c;
        this.l1 = c978090bYl;
    }

    public static final void LJJZZIII$0(C987270bnZ c987270bnZ, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        String strLJJIL;
        String str2;
        C955440ayE c955440ayE = (C955440ayE) c987270bnZ.l0;
        if (c955440ayE != null) {
            SparkContext sparkContext = ((C963330bAx) c987270bnZ.l1).LLIZLLLIL;
            String str3 = "";
            if (sparkContext == null || (strLJJIL = sparkContext.LJJIL()) == null) {
                strLJJIL = "";
            }
            C963150bAf c963150bAf = ((C963330bAx) c987270bnZ.l1).LLILZLL;
            if (c963150bAf != null && (str2 = c963150bAf.LJ) != null) {
                str3 = str2;
            }
            c955440ayE.LJJIZ(strLJJIL, str3, "-2024");
        }
    }

    public static final void LJLIIL$0(C987270bnZ c987270bnZ, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        String strLJJIL;
        String str2;
        C955440ayE c955440ayE = new C955440ayE();
        SparkContext sparkContext = ((C963330bAx) c987270bnZ.l1).LLIZLLLIL;
        String str3 = "";
        if (sparkContext == null || (strLJJIL = sparkContext.LJJIL()) == null) {
            strLJJIL = "";
        }
        C963150bAf c963150bAf = ((C963330bAx) c987270bnZ.l1).LLILZLL;
        if (c963150bAf != null && (str2 = c963150bAf.LJ) != null) {
            str3 = str2;
        }
        c955440ayE.LJIILIIL();
        c955440ayE.LJIIL(strLJJIL, "url", true);
        c955440ayE.LJIIL(str3, "section_type", true);
        c955440ayE.LJIJJLI("invitee_list_dynamic_section_load");
        c987270bnZ.l0 = new C955440ayE();
    }

    public static final void LJL$0(C987270bnZ c987270bnZ, InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
        String strLJJIL;
        String str2;
        c987270bnZ.LJLI(interfaceC1541990qEH, str, c1542120qEU.LIZIZ);
        C955440ayE c955440ayE = (C955440ayE) c987270bnZ.l0;
        if (c955440ayE != null) {
            SparkContext sparkContext = ((C963330bAx) c987270bnZ.l1).LLIZLLLIL;
            String str3 = "";
            if (sparkContext == null || (strLJJIL = sparkContext.LJJIL()) == null) {
                strLJJIL = "";
            }
            C963150bAf c963150bAf = ((C963330bAx) c987270bnZ.l1).LLILZLL;
            if (c963150bAf != null && (str2 = c963150bAf.LJ) != null) {
                str3 = str2;
            }
            c955440ayE.LJJIZ(strLJJIL, str3, String.valueOf(c1542120qEU.LIZ));
        }
    }

    public static final void LJL$1(C987270bnZ c987270bnZ, InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
        int iIntValue;
        ((C013C) c987270bnZ.l0).element = true;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("lynx rematch button load failed, error = ");
        sbLIZ.append(c1542120qEU.LIZ());
        C20441214yg.LJ("CombinedMatchInviterLynxPlugin", C2188811AlT.LIZIZ(sbLIZ));
        C977630bY1 c977630bY1 = ((C978090bYl) c987270bnZ.l1).LLILLJJLI;
        if (c977630bY1 != null) {
            Integer num = c1542120qEU.LIZ;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            c977630bY1.LJIL(iIntValue, c1542120qEU.LIZIZ, "render_error");
        }
    }

    public static final void LJLI$0(C987270bnZ c987270bnZ, InterfaceC1541990qEH interfaceC1541990qEH, String str, String str2) {
        String strLJJIL;
        String str3;
        c987270bnZ.LJJZZIII(interfaceC1541990qEH, str);
        C955440ayE c955440ayE = (C955440ayE) c987270bnZ.l0;
        if (c955440ayE != null) {
            SparkContext sparkContext = ((C963330bAx) c987270bnZ.l1).LLIZLLLIL;
            String str4 = "";
            if (sparkContext == null || (strLJJIL = sparkContext.LJJIL()) == null) {
                strLJJIL = "";
            }
            C963150bAf c963150bAf = ((C963330bAx) c987270bnZ.l1).LLILZLL;
            if (c963150bAf != null && (str3 = c963150bAf.LJ) != null) {
                str4 = str3;
            }
            if (str2 == null) {
                str2 = "-2024";
            }
            c955440ayE.LJJIZ(strLJJIL, str4, str2);
        }
    }
}
