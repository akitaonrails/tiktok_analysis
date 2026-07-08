package X;

import android.os.Handler;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkMicStatus;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RustStateType;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicAnchorStateFix;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicCompensatePermitSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LinkMicPreForwardStreamConfig;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.AvatarState;
import tikcast.linkmic.common.LinkUserState;

/* JADX INFO: renamed from: X.0bI9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C967790bI9 extends C967800bIA {
    public final /* synthetic */ C966020bFI LLILZ;

    @Override // X.InterfaceC2231121CUc
    public final boolean LJLZ() {
        C966020bFI c966020bFI = this.LLILZ;
        if (c966020bFI.LIZJ == 4) {
            return true;
        }
        InterfaceC965990bFF interfaceC965990bFF = c966020bFI.LJIIZILJ;
        return C500260Jjc.LJJJI(interfaceC965990bFF != null ? Boolean.valueOf(interfaceC965990bFF.LLIIIL()) : null) && LinkMicPreForwardStreamConfig.INSTANCE.isEnablePreForward();
    }

    @Override // X.InterfaceC2231121CUc
    public final void LLIIIZ() {
        InterfaceC965990bFF interfaceC965990bFF = this.LLILZ.LJIIZILJ;
        if (interfaceC965990bFF != null) {
            C966020bFI.LIZIZ(interfaceC965990bFF, true, new C968040bIY());
        }
    }

    public static boolean LJ(C2231741CWm c2231741CWm) {
        int i = C2231431CVh.LIZ[c2231741CWm.LIZIZ.ordinal()];
        EnumC2231911CXd enumC2231911CXd = null;
        if (i != 1) {
            if (i == 2) {
                C968090bId c968090bId = c2231741CWm.LJJ;
                if (c968090bId != null) {
                    enumC2231911CXd = c968090bId.LIZJ;
                }
                if (enumC2231911CXd == EnumC2231911CXd.Recharge) {
                    return true;
                }
                return false;
            }
            return false;
        }
        C966220bFc c966220bFc = c2231741CWm.LJIJJ;
        if (c966220bFc != null) {
            enumC2231911CXd = c966220bFc.LJFF;
        }
        if (enumC2231911CXd == EnumC2231911CXd.Recharge) {
            return true;
        }
        return false;
    }

    public final void LIZIZ(C2231741CWm c2231741CWm) {
        C966020bFI c966020bFI = this.LLILZ;
        C965350bED c965350bED = c966020bFI.LJJ;
        String str = c966020bFI.LJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("try compensate permitApply msg: ");
        sbLIZ.append(c2231741CWm);
        C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        C967670bHx c967670bHx = c2231741CWm.LJIIL;
        if (c967670bHx != null) {
            C500260Jjc.LJJLIIIJILLIZJL(new C966010bFH(this.LLILZ, c967670bHx, c2231741CWm));
        }
    }

    public final void LIZJ(C2231741CWm c2231741CWm) {
        int i = C2231431CVh.LIZ[c2231741CWm.LIZIZ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                C966020bFI c966020bFI = this.LLILZ;
                C965350bED c965350bED = c966020bFI.LJJ;
                String str = c966020bFI.LJ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("try compensate permit apply group msg: ");
                sbLIZ.append(c2231741CWm);
                C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
                C968090bId c968090bId = c2231741CWm.LJJ;
                if (c968090bId != null) {
                    C966020bFI c966020bFI2 = this.LLILZ;
                    if (c968090bId.LIZJ != EnumC2231911CXd.Recharge) {
                        return;
                    }
                    C965350bED c965350bED2 = c966020bFI2.LJJ;
                    String str2 = c966020bFI2.LJ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("try compensate permit apply group imModel.toLinkLayerMessage(): ");
                    sbLIZ2.append(C966020bFI.LJIILJJIL(c2231741CWm));
                    C1AZW.LIZIZ(c965350bED2, str2, C2188811AlT.LIZIZ(sbLIZ2), null, null);
                    LinkLayerMessage linkLayerMessageLJIILJJIL = C966020bFI.LJIILJJIL(c2231741CWm);
                    if (linkLayerMessageLJIILJJIL != null) {
                        C500260Jjc.LJJLIIIJILLIZJL(new C966180bFY(c966020bFI2, linkLayerMessageLJIILJJIL, c968090bId));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        C966020bFI c966020bFI3 = this.LLILZ;
        C965350bED c965350bED3 = c966020bFI3.LJJ;
        String str3 = c966020bFI3.LJ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("try compensate reply invite group msg: ");
        sbLIZ3.append(c2231741CWm);
        C1AZW.LIZIZ(c965350bED3, str3, C2188811AlT.LIZIZ(sbLIZ3), null, null);
        C966220bFc c966220bFc = c2231741CWm.LJIJJ;
        if (c966220bFc != null) {
            C966020bFI c966020bFI4 = this.LLILZ;
            if (c966220bFc.LJFF != EnumC2231911CXd.Recharge) {
                return;
            }
            C965350bED c965350bED4 = c966020bFI4.LJJ;
            String str4 = c966020bFI4.LJ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("try compensate reply invite group imModel.toLinkLayerMessage(): ");
            sbLIZ4.append(C966020bFI.LJIILJJIL(c2231741CWm));
            C1AZW.LIZIZ(c965350bED4, str4, C2188811AlT.LIZIZ(sbLIZ4), null, null);
            LinkLayerMessage linkLayerMessageLJIILJJIL2 = C966020bFI.LJIILJJIL(c2231741CWm);
            if (linkLayerMessageLJIILJJIL2 != null) {
                C500260Jjc.LJJLIIIJILLIZJL(new C966170bFX(c966020bFI4, linkLayerMessageLJIILJJIL2, c966220bFc));
            }
        }
    }

    @Override // X.InterfaceC2231121CUc
    public final void LJFF(C954780axA c954780axA) {
        C1AZW.LIZIZ(this.LL, this.LLILLL, "on onAllLinkStateChanged.", null, null);
        this.LLILZ.LJIJJ(c954780axA.LIZ, "onAllLinkStateChanged");
        C966020bFI c966020bFI = this.LLILZ;
        InterfaceC965990bFF interfaceC965990bFF = c966020bFI.LJIIZILJ;
        if (interfaceC965990bFF != null) {
            C966020bFI.LIZIZ(interfaceC965990bFF, false, new C967960bIQ(c966020bFI, c954780axA));
        }
    }

    @Override // X.InterfaceC2231121CUc
    public final void LJJJJZI(C954780axA c954780axA) {
        C1AZW.LIZIZ(this.LL, this.LLILLL, "on onCrossArchLinkStateChanged.", null, null);
        this.LLILZ.LJIIZILJ(c954780axA.LIZ, "onCrossArchLinkStateChanged");
        C966020bFI c966020bFI = this.LLILZ;
        InterfaceC965990bFF interfaceC965990bFF = c966020bFI.LJIIZILJ;
        if (interfaceC965990bFF != null) {
            C966020bFI.LIZIZ(interfaceC965990bFF, false, new C967970bIR(c966020bFI, c954780axA));
        }
    }

    @Override // X.InterfaceC2231121CUc
    public final void LJJJLL(C954780axA c954780axA) {
        C1AZW.LIZIZ(this.LL, this.LLILLL, "on onInnerArchLinkStateChanged.", null, null);
        this.LLILZ.LJIJ(c954780axA.LIZ, "onInnerArchLinkStateChanged");
        C966020bFI c966020bFI = this.LLILZ;
        InterfaceC965990bFF interfaceC965990bFF = c966020bFI.LJIIZILJ;
        if (interfaceC965990bFF != null) {
            C966020bFI.LIZIZ(interfaceC965990bFF, false, new C967980bIS(c966020bFI, c954780axA));
        }
    }

    @Override // X.InterfaceC2231121CUc
    public final void LJJZZI(C965210bDz c965210bDz) {
        C1AZW.LIZIZ(this.LL, this.LLILLL, "on onLinkRtcStateChanged.", null, null);
        this.LLILZ.LJIJJ(c965210bDz.LIZ, "onLinkRtcStateChanged");
        this.LLILZ.LJIJ(c965210bDz.LIZIZ, "onLinkRtcStateChanged");
        this.LLILZ.LJIIZILJ(c965210bDz.LIZJ, "onLinkRtcStateChanged");
        C966020bFI c966020bFI = this.LLILZ;
        InterfaceC965990bFF interfaceC965990bFF = c966020bFI.LJIIZILJ;
        if (interfaceC965990bFF != null) {
            C966020bFI.LIZIZ(interfaceC965990bFF, false, new C967990bIT(c966020bFI, c965210bDz));
        }
    }

    @Override // X.InterfaceC2231121CUc
    public final void LJLJJI(C968640bJW c968640bJW) {
        C965980bFE c965980bFE = this.LLILZ.LJIL;
        if (c965980bFE != null) {
            ((ConcurrentHashMap) c965980bFE.LLILZ).remove(Long.valueOf(c968640bJW.LIZ));
        }
    }

    @Override // X.InterfaceC2231121CUc
    public final void LJLJJL(List<C968980bK4> list) {
        C967370bHT c967370bHT = this.LLILZ.LJJII;
        if (c967370bHT != null) {
            c967370bHT.LJII.LIZ(true);
        }
        InterfaceC965990bFF interfaceC965990bFF = this.LLILZ.LJIIZILJ;
        if (interfaceC965990bFF != null) {
            C966020bFI.LIZIZ(interfaceC965990bFF, true, new C968050bIZ());
        }
    }

    @Override // X.InterfaceC2231121CUc
    public final void LJLL(String str) {
        InterfaceC965990bFF interfaceC965990bFF = this.LLILZ.LJIIZILJ;
        if (interfaceC965990bFF != null) {
            C966020bFI.LIZIZ(interfaceC965990bFF, false, new C967870bIH(str));
        }
    }

    @Override // X.InterfaceC2231121CUc
    public final void LJLLILLLL(C967880bII c967880bII) {
        InterfaceC2181441AZa interfaceC2181441AZa = this.LL;
        String str = this.LLILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("on layoutContextChange... ");
        sbLIZ.append(c967880bII);
        C1AZW.LIZIZ(interfaceC2181441AZa, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        C966020bFI c966020bFI = this.LLILZ;
        InterfaceC965990bFF interfaceC965990bFF = c966020bFI.LJIIZILJ;
        if (interfaceC965990bFF != null) {
            C966020bFI.LIZIZ(interfaceC965990bFF, true, new C967820bIC(c966020bFI, c967880bII));
        }
    }

    @Override // X.InterfaceC2231121CUc
    public final void LJLLL(List<C968340bJ2> list) {
        C967370bHT c967370bHT;
        C966020bFI c966020bFI = this.LLILZ;
        int i = c966020bFI.LIZJ;
        if ((i == 2 || i == 0) && (c967370bHT = c966020bFI.LJJII) != null) {
            c967370bHT.LJII.LIZ(true);
        }
        C967370bHT c967370bHT2 = this.LLILZ.LJJII;
        if (c967370bHT2 != null) {
            c967370bHT2.LJI.LIZ(true);
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C968340bJ2 c968340bJ2 : (ArrayList) list) {
            arrayList.add(new Pair(c968340bJ2.LIZ, Integer.valueOf((int) c968340bJ2.LIZIZ)));
        }
        InterfaceC965990bFF interfaceC965990bFF = this.LLILZ.LJIIZILJ;
        if (interfaceC965990bFF != null) {
            C966020bFI.LIZIZ(interfaceC965990bFF, true, new C967920bIM(arrayList));
        }
    }

    @Override // X.InterfaceC2231121CUc
    public final void LLD(C967910bIL c967910bIL) {
        int i;
        int i2;
        EnumC967850bIF enumC967850bIF;
        int i3;
        C966020bFI c966020bFI = this.LLILZ;
        long j = c967910bIL.LIZ;
        if (j > 0 && c966020bFI.LIZLLL != j) {
            c966020bFI.LIZLLL = j;
            InterfaceC965990bFF interfaceC965990bFF = c966020bFI.LJIIZILJ;
            if (interfaceC965990bFF != null) {
                interfaceC965990bFF.LJLJJLL(j);
            }
        } else {
            c966020bFI.getClass();
        }
        this.LLILZ.LJI = c967910bIL.LIZJ;
        long j2 = c967910bIL.LIZIZ;
        if (this.LLILZ.LJFF != j2) {
            this.LLILZ.LJFF = j2;
            InterfaceC965990bFF interfaceC965990bFF2 = this.LLILZ.LJIIZILJ;
            if (interfaceC965990bFF2 != null) {
                interfaceC965990bFF2.LJJZZIII(j2);
            }
        }
        if (!Intrinsics.LJFF(this.LLILZ.LJIILJJIL, c967910bIL.LIZLLL)) {
            this.LLILZ.LJIILJJIL = c967910bIL.LIZLLL;
        }
        int i4 = this.LLILZ.LJIILL;
        int i5 = C1CX3.LJFF[c967910bIL.LJI.ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 3) {
                    i = 0;
                } else {
                    i = 3;
                }
            } else {
                i = 1;
            }
        } else {
            i = 2;
        }
        if (i4 != i) {
            C966020bFI c966020bFI2 = this.LLILZ;
            String str = c966020bFI2.LJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateLinkerMode: current:");
            sbLIZ.append(i4);
            sbLIZ.append(", new:");
            sbLIZ.append(i);
            C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
            c966020bFI2.LJIILL = i;
            InterfaceC965990bFF interfaceC965990bFF3 = this.LLILZ.LJIIZILJ;
            if (interfaceC965990bFF3 != null) {
                C966020bFI.LIZIZ(interfaceC965990bFF3, false, new C967630bHt(i4, i));
            }
        }
        if (this.LLILZ.LJIILIIL()) {
            C20441214yg.LIZIZ("RustLinker", "onLinkMicCorePropertiesChanged return for union session");
            return;
        }
        if (c967910bIL.LJ.isEmpty()) {
            return;
        }
        List<Long> list = c967910bIL.LJ;
        C966020bFI c966020bFI3 = this.LLILZ;
        boolean z = c966020bFI3.LIZIZ;
        int i6 = c966020bFI3.LIZJ;
        Iterator<Long> it2 = list.iterator();
        int i7 = 1;
        while (it2.hasNext()) {
            int iLongValue = (int) it2.next().longValue();
            EnumC967850bIF.Companion.getClass();
            switch (iLongValue) {
                case 0:
                    enumC967850bIF = EnumC967850bIF.Idel;
                    break;
                case 1:
                    enumC967850bIF = EnumC967850bIF.WaitingForInviteReply;
                    break;
                case 2:
                    enumC967850bIF = EnumC967850bIF.WaitingForApplyReply;
                    break;
                case 3:
                    enumC967850bIF = EnumC967850bIF.ReceiveApply;
                    break;
                case 4:
                    enumC967850bIF = EnumC967850bIF.ReceiveInvitation;
                    break;
                case 5:
                    enumC967850bIF = EnumC967850bIF.Linked;
                    break;
                case 6:
                    enumC967850bIF = EnumC967850bIF.JoiningChannel;
                    break;
                case 7:
                    enumC967850bIF = EnumC967850bIF.JoinedChannel;
                    break;
                case 8:
                    enumC967850bIF = EnumC967850bIF.Finish;
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    enumC967850bIF = EnumC967850bIF.WaitJoinChannel;
                    break;
                default:
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Unmatched primitive enum value: LinkMicLinkState with ");
                    sbLIZ2.append(iLongValue);
                    throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            switch (C967860bIG.LIZ[enumC967850bIF.ordinal()]) {
                case 1:
                    if (i6 == 2 && z) {
                        i3 = 256;
                    }
                    i7 |= i3;
                    break;
                case 2:
                    i3 = 32;
                    continue;
                    i7 |= i3;
                    break;
                case 3:
                    i3 = 128;
                    continue;
                    i7 |= i3;
                    break;
                case 4:
                    i3 = 64;
                    continue;
                    i7 |= i3;
                    break;
                case 5:
                    i3 = 512;
                    continue;
                    i7 |= i3;
                    break;
                case 6:
                    i3 = 4;
                    continue;
                    i7 |= i3;
                    break;
                case 7:
                    i3 = 2;
                    continue;
                    i7 |= i3;
                    break;
                case 8:
                    i3 = 8;
                    continue;
                    i7 |= i3;
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    i3 = 16;
                    continue;
                    i7 |= i3;
                    break;
            }
            i3 = 1;
            i7 |= i3;
        }
        if (C968680bJa.LIZIZ(i7, 256)) {
            i2 = 6;
        } else if (C968680bJa.LIZIZ(i7, 32) || (LinkMicAnchorStateFix.INSTANCE.enable() && C968680bJa.LIZIZ(i7, 128) && z)) {
            i2 = 5;
        } else if (C968680bJa.LIZIZ(i7, 128)) {
            i2 = 4;
        } else if (C968680bJa.LIZIZ(i7, 64)) {
            i2 = 3;
        } else if (!C968680bJa.LIZIZ(i7, 512) && !C968680bJa.LIZIZ(i7, 8) && !C968680bJa.LIZIZ(i7, 16) && !C968680bJa.LIZIZ(i7, 4) && !C968680bJa.LIZIZ(i7, 2)) {
            if (C968680bJa.LIZIZ(i7, 1)) {
                i2 = 0;
            } else {
                i2 = 1;
            }
        } else {
            i2 = 2;
        }
        if (this.LLILZ.LJIIIIZZ == i2) {
            return;
        }
        C966020bFI c966020bFI4 = this.LLILZ;
        C965350bED c965350bED = c966020bFI4.LJJ;
        String str2 = c966020bFI4.LJ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("call on LinkState changed: ");
        sbLIZ3.append(i2);
        C1AZW.LJIIIZ(c965350bED, str2, C2188811AlT.LIZIZ(sbLIZ3), null, null);
        C966020bFI c966020bFI5 = this.LLILZ;
        c966020bFI5.LJII = i2;
        c966020bFI5.LJIIIIZZ = i2;
        C966020bFI c966020bFI6 = this.LLILZ;
        InterfaceC965990bFF interfaceC965990bFF4 = c966020bFI6.LJIIZILJ;
        if (interfaceC965990bFF4 == null) {
            return;
        }
        C966020bFI.LIZIZ(interfaceC965990bFF4, true, new C966200bFa(i2, c966020bFI6, c967910bIL));
    }

    @Override // X.InterfaceC2231121CUc
    public final void LLF(C968810bJn c968810bJn) {
        InterfaceC2181441AZa interfaceC2181441AZa = this.LL;
        String str = this.LLILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("on LinkMicFlagsChanged ");
        sbLIZ.append(c968810bJn);
        sbLIZ.append(' ');
        C1AZW.LIZIZ(interfaceC2181441AZa, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onLinkMicFlagsChanged ");
        sbLIZ2.append(c968810bJn);
        C20441214yg.LIZIZ("RustLinker", C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // X.InterfaceC2231121CUc
    public final boolean LLI(C2231741CWm c2231741CWm) {
        C965980bFE c965980bFE;
        String str = this.LLILZ.LJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLinkMicImCompletion: msgId = ");
        sbLIZ.append(c2231741CWm.LIZ);
        sbLIZ.append(", imType = ");
        sbLIZ.append(c2231741CWm.LIZIZ);
        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        int i = this.LLILZ.LIZJ;
        if (i == 0) {
            if (LJ(c2231741CWm)) {
                LIZJ(c2231741CWm);
            } else if (c2231741CWm.LIZLLL == EnumC2231911CXd.Recharge) {
                if (LinkMicCompensatePermitSetting.getValue() && c2231741CWm.LIZIZ == EnumC2231761CWo.Permit) {
                    LIZIZ(c2231741CWm);
                    return true;
                }
            } else if (!LJ(c2231741CWm) && (c965980bFE = this.LLILZ.LJIL) != null) {
                c965980bFE.LJFF(c2231741CWm);
                return true;
            }
            return true;
        }
        if (i == 4) {
            if (c2231741CWm.LIZLLL == EnumC2231911CXd.Recharge && LinkMicCompensatePermitSetting.getValue() && c2231741CWm.LIZIZ == EnumC2231761CWo.Permit) {
                LIZIZ(c2231741CWm);
            }
            return true;
        }
        if (!LJ(c2231741CWm)) {
            C965980bFE c965980bFE2 = this.LLILZ.LJIL;
            if (c965980bFE2 != null) {
                c965980bFE2.LJFF(c2231741CWm);
            }
            return true;
        }
        LIZJ(c2231741CWm);
        return true;
    }

    @Override // X.InterfaceC2231121CUc
    public final void LIZ(long j, C1AZU c1azu) {
        C1AZW.LIZIZ(this.LL, this.LLILLL, "on onUserLinkStateDeleted.", null, null);
        C966020bFI c966020bFI = this.LLILZ;
        InterfaceC965990bFF interfaceC965990bFF = c966020bFI.LJIIZILJ;
        if (interfaceC965990bFF != null) {
            C966020bFI.LIZIZ(interfaceC965990bFF, false, new C968010bIV(c966020bFI, j, c1azu));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0091  */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, webcast.im.P2PGroupChangeContent] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZLLL(X.EnumC2231411CVf r23, X.C968490bJH r24) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C967790bI9.LIZLLL(X.1CVf, X.0bJH):boolean");
    }

    @Override // X.InterfaceC2231121CUc
    public final void LJJI(long j, C1AZU c1azu) {
        C1AZW.LIZIZ(this.LL, this.LLILLL, "on onUserLinkStateCreated.", null, null);
        C966020bFI c966020bFI = this.LLILZ;
        InterfaceC965990bFF interfaceC965990bFF = c966020bFI.LJIIZILJ;
        if (interfaceC965990bFF != null) {
            C966020bFI.LIZIZ(interfaceC965990bFF, false, new C968000bIU(c966020bFI, j, c1azu));
        }
    }

    @Override // X.InterfaceC2231121CUc
    public final void LJJZZIII(long j, C967830bID c967830bID) {
        long j2;
        this.LLILZ.getClass();
        int linkMicSateType = RustStateType.Companion.toLinkMicSateType((int) j);
        InterfaceC2181441AZa interfaceC2181441AZa = this.LL;
        String str = this.LLILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStateDidChanged type[");
        sbLIZ.append(linkMicSateType);
        sbLIZ.append("], detail: \t ");
        sbLIZ.append(c967830bID);
        C1AZW.LIZIZ(interfaceC2181441AZa, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        List<InterfaceC968220bIq> list = this.LLILLJJLI;
        if (list != null) {
            for (InterfaceC968220bIq interfaceC968220bIq : list) {
                Object[] objArr = new Object[1];
                long j3 = c967830bID.LIZIZ;
                String str2 = c967830bID.LIZJ;
                List<C967810bIB> list2 = c967830bID.LJ;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                for (C967810bIB c967810bIB : list2) {
                    LinkUserState linkUserState = new LinkUserState();
                    linkUserState.user = new Player(c967810bIB.LIZ, c967810bIB.LIZIZ);
                    linkUserState.linkmicId = c967810bIB.LIZJ;
                    linkUserState.linkedTimeNano = c967810bIB.LJI;
                    linkUserState.onlineUserState = c967810bIB.LJII.intoInt();
                    linkUserState.audioMuted = (int) c967810bIB.LJIIIIZZ;
                    linkUserState.videoMuted = (int) c967810bIB.LJIIIZ;
                    linkUserState.rtcConnection = c967810bIB.LJIIJ.intoInt();
                    linkUserState.networkState = c967810bIB.LJIIJJI.intoInt();
                    AvatarState avatarState = new AvatarState();
                    C968630bJV c968630bJV = c967810bIB.LJIIL;
                    if (c968630bJV != null) {
                        j2 = c968630bJV.LIZ;
                    } else {
                        j2 = 0;
                    }
                    avatarState.avatarId = j2;
                    linkUserState.avatar = avatarState;
                    arrayList.add(linkUserState);
                }
                String str3 = c967830bID.LJFF;
                String str4 = c967830bID.LJII;
                List<C1283230jUv> list3 = c967830bID.LIZLLL;
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list3, 10));
                Iterator<C1283230jUv> it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(C1282000jSw.LJI(it2.next()));
                }
                objArr[0] = new LinkMicStatus(j3, str2, arrayList, str3, str4, arrayList2);
                interfaceC968220bIq.LIZ(linkMicSateType, objArr);
            }
        }
    }

    @Override // X.InterfaceC2231121CUc
    public final void LJLIL(String str, boolean z) {
        InterfaceC2181441AZa interfaceC2181441AZa = this.LL;
        String str2 = this.LLILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("on onAudioOccupiedChanged...\n [");
        sbLIZ.append(str);
        sbLIZ.append("], audioOccupied: \n ");
        sbLIZ.append(z);
        C1AZW.LIZIZ(interfaceC2181441AZa, str2, C2188811AlT.LIZIZ(sbLIZ), null, null);
        InterfaceC965990bFF interfaceC965990bFF = this.LLILZ.LJIIZILJ;
        if (interfaceC965990bFF != null) {
            C966020bFI.LIZIZ(interfaceC965990bFF, false, new C968070bIb(str, z));
        }
    }

    @Override // X.InterfaceC2231121CUc
    public final void LJLLI(C1CXJ c1cxj, String str) {
        InterfaceC2181441AZa interfaceC2181441AZa = this.LL;
        String str2 = this.LLILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("on onOnlineUserStateChanged...\n [");
        sbLIZ.append(str);
        sbLIZ.append("], state: \n ");
        sbLIZ.append(c1cxj);
        C1AZW.LIZIZ(interfaceC2181441AZa, str2, C2188811AlT.LIZIZ(sbLIZ), null, null);
        InterfaceC965990bFF interfaceC965990bFF = this.LLILZ.LJIIZILJ;
        if (interfaceC965990bFF != null) {
            C966020bFI.LIZIZ(interfaceC965990bFF, false, new C967930bIN(c1cxj, str));
        }
    }

    @Override // X.InterfaceC2231121CUc
    public final void LLFZ(long j, String str) {
        InterfaceC2181441AZa interfaceC2181441AZa = this.LL;
        String str2 = this.LLILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUserWillJoinChannel uid[");
        sbLIZ.append(j);
        sbLIZ.append("], linkMicId[");
        sbLIZ.append(str);
        sbLIZ.append(']');
        C1AZW.LIZIZ(interfaceC2181441AZa, str2, C2188811AlT.LIZIZ(sbLIZ), null, null);
        LinkUser linkUserLJIIJ = LJIIJ(str);
        InterfaceC965990bFF interfaceC965990bFF = this.LLILZ.LJIIZILJ;
        if (interfaceC965990bFF != null) {
            C966020bFI.LIZIZ(interfaceC965990bFF, false, new C968030bIX(j, str, linkUserLJIIJ));
        }
    }

    @Override // X.InterfaceC2231121CUc
    public final void LLIIII(String str, boolean z) {
        InterfaceC2181441AZa interfaceC2181441AZa = this.LL;
        String str2 = this.LLILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onVideoMuteStateChanged isVideoMute[");
        sbLIZ.append(z);
        sbLIZ.append("], linkMicId[");
        sbLIZ.append(str);
        sbLIZ.append(']');
        C1AZW.LIZIZ(interfaceC2181441AZa, str2, C2188811AlT.LIZIZ(sbLIZ), null, null);
        LinkUser linkUserLJJIFFI = LJJIFFI(str);
        if (linkUserLJJIFFI != null) {
            linkUserLJJIFFI.setVideoSwitchOn(!z);
        }
        InterfaceC965990bFF interfaceC965990bFF = this.LLILZ.LJIIZILJ;
        if (interfaceC965990bFF != null) {
            C966020bFI.LIZIZ(interfaceC965990bFF, false, new C968080bIc(str, z));
        }
    }

    @Override // X.InterfaceC2231121CUc
    public final void LLIIIILZ(C2231151CUf c2231151CUf, long j) {
        InterfaceC965990bFF interfaceC965990bFF = this.LLILZ.LJIIZILJ;
        if (interfaceC965990bFF != null) {
            C966020bFI.LIZIZ(interfaceC965990bFF, true, new C968020bIW());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C967790bI9(C966020bFI c966020bFI, C965350bED c965350bED, CopyOnWriteArrayList copyOnWriteArrayList) {
        super(c965350bED, copyOnWriteArrayList);
        this.LLILZ = c966020bFI;
    }

    @Override // X.InterfaceC2231121CUc
    public final void LJII(long j, C1AZU c1azu, C969700bLE c969700bLE) {
        C1AZW.LIZIZ(this.LL, this.LLILLL, "on onUserLinkStateChanged.", null, null);
        C966020bFI c966020bFI = this.LLILZ;
        InterfaceC965990bFF interfaceC965990bFF = c966020bFI.LJIIZILJ;
        if (interfaceC965990bFF != null) {
            C966020bFI.LIZIZ(interfaceC965990bFF, false, new C967950bIP(c966020bFI, j, c1azu, c969700bLE));
        }
    }

    @Override // X.InterfaceC2231121CUc
    public final void LJIIJ(String str, C1AZU c1azu, C2231141CUe c2231141CUe) {
        C1AZW.LIZIZ(this.LL, this.LLILLL, "on onUserLinkRtcStateChanged.", null, null);
        C966020bFI c966020bFI = this.LLILZ;
        InterfaceC965990bFF interfaceC965990bFF = c966020bFI.LJIIZILJ;
        if (interfaceC965990bFF != null) {
            C966020bFI.LIZIZ(interfaceC965990bFF, false, new C967940bIO(c966020bFI, str, c1azu, c2231141CUe));
        }
    }

    @Override // X.InterfaceC2231121CUc
    public final void LJLLJ(String str, boolean z, boolean z2) {
        InterfaceC2181441AZa interfaceC2181441AZa = this.LL;
        String str2 = this.LLILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("on onAudioMuteStateChanged...\n [");
        sbLIZ.append(str);
        sbLIZ.append("], isAudioMuted: \n ");
        sbLIZ.append(z);
        sbLIZ.append(" \n, audioMutedByChannel: ");
        sbLIZ.append(z2);
        C1AZW.LIZIZ(interfaceC2181441AZa, str2, C2188811AlT.LIZIZ(sbLIZ), null, null);
        LinkUser linkUserLJJIFFI = LJJIFFI(str);
        if (linkUserLJJIFFI != null) {
            linkUserLJJIFFI.setAudioSwitchOn(!z);
            linkUserLJJIFFI.setAudioMutedByChannel(z2);
        }
        InterfaceC965990bFF interfaceC965990bFF = this.LLILZ.LJIIZILJ;
        if (interfaceC965990bFF != null) {
            C966020bFI.LIZIZ(interfaceC965990bFF, false, new C968060bIa(str, z, z2));
        }
    }

    @Override // X.InterfaceC2231121CUc
    public final void LJZ(List<Long> list, EnumC2231411CVf enumC2231411CVf, C968490bJH c968490bJH) {
        C1AZW.LIZIZ(this.LL, this.LLILLL, "on onCrossListChange.", null, null);
        int iLIZJ = C968680bJa.LIZJ(list);
        if (!LIZLLL(enumC2231411CVf, c968490bJH)) {
            C967770bI7 c967770bI7 = this.LLILZ.LJJIFFI;
            c967770bI7.getClass();
            C965900bF6.LIZ(new C967150bH7(iLIZJ, enumC2231411CVf, c967770bI7));
        }
    }

    @Override // X.InterfaceC2231121CUc
    public final void LLFFF(List<Long> list, final EnumC2231411CVf enumC2231411CVf, C968490bJH c968490bJH) {
        C1AZW.LIZIZ(this.LL, this.LLILLL, "on onInnerListChange.", null, null);
        final int iLIZJ = C968680bJa.LIZJ(list);
        Handler handlerLIZ = C473410IhP.LIZ();
        final C966020bFI c966020bFI = this.LLILZ;
        C786410Ut5.LJJZZIII(handlerLIZ, new Runnable() { // from class: X.0bHK
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("RustLinker@e1b8.newEventListener$1$onInnerListChange$1");
                try {
                    C967770bI7 c967770bI7 = c966020bFI.LJJIFFI;
                    int i = iLIZJ;
                    EnumC2231411CVf enumC2231411CVf2 = enumC2231411CVf;
                    c967770bI7.getClass();
                    C965900bF6.LIZ(new C967200bHC(i, enumC2231411CVf2, c967770bI7));
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("RustLinker@e1b8.newEventListener$1$onInnerListChange$1");
            }
        });
    }

    @Override // X.InterfaceC2231121CUc
    public final void LLIIIL(List<Long> list, final EnumC2231411CVf enumC2231411CVf, C968490bJH c968490bJH) {
        final int iLIZJ = C968680bJa.LIZJ(list);
        if (this.LLILZ.LIZJ == 2) {
            if (!LIZLLL(enumC2231411CVf, c968490bJH)) {
                C967770bI7 c967770bI7 = this.LLILZ.LJJIFFI;
                c967770bI7.getClass();
                C965900bF6.LIZ(new C967160bH8(iLIZJ, enumC2231411CVf, c967770bI7, true));
                return;
            }
            return;
        }
        Handler handlerLIZ = C473410IhP.LIZ();
        final C966020bFI c966020bFI = this.LLILZ;
        C786410Ut5.LJJZZIII(handlerLIZ, new Runnable() { // from class: X.0bI8
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("RustLinker@e1b8.newEventListener$1$onListChange$1");
                try {
                    C967770bI7 c967770bI72 = c966020bFI.LJJIFFI;
                    int i = iLIZJ;
                    EnumC2231411CVf enumC2231411CVf2 = enumC2231411CVf;
                    c967770bI72.getClass();
                    C965900bF6.LIZ(new C967160bH8(i, enumC2231411CVf2, c967770bI72, false));
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("RustLinker@e1b8.newEventListener$1$onListChange$1");
            }
        });
    }
}
