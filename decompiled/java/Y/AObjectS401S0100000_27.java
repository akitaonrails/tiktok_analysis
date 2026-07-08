package Y;

import X.C1161920gLG;
import X.C1192870h9B;
import X.C1193630hAP;
import X.C1323690kYB;
import X.C1524970pmp;
import X.C1796830wrJ;
import X.C1803570x2B;
import X.C1804220x3E;
import X.C1804310x3N;
import X.C1804320x3O;
import X.C1804330x3P;
import X.C1804340x3Q;
import X.C1804400x3W;
import X.C1804410x3X;
import X.C1804430x3Z;
import X.C1804590x3p;
import X.C1804610x3r;
import X.C1804620x3s;
import X.C1804910x4L;
import X.C1805070x4b;
import X.C1807670x8n;
import X.C1807840x94;
import X.C1807890x99;
import X.C1848940yDM;
import X.C1849040yDW;
import X.C19282410cA;
import X.C2188811AlT;
import X.C497740JfY;
import X.C786410Ut5;
import X.InterfaceC1804490x3f;
import X.InterfaceC1805750x5h;
import X.InterfaceC2217461Bqa;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.walletclean.presentation.assem.body.view.WalletPanelBodyAssem;
import com.bytedance.android.live.walletclean.presentation.assem.body.viewmodel.RechargePanelBodyViewModel;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeKycAnnualCapSetting;
import com.ss.android.ugc.aweme.account.reactive.ReactiveAccountActivity;
import com.ss.android.ugc.aweme.iab.TtopIABActivity;
import com.ss.android.ugc.aweme.iab.TtopIABRouterParams;
import com.ss.android.ugc.aweme.iab.TtopIABVM;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import webcast.api.profit.IapListResult;

/* JADX INFO: loaded from: classes28.dex */
public class AObjectS401S0100000_27 implements Function0 {
    public final int $t;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS401S0100000_27 aObjectS401S0100000_27) {
        return ((C1807840x94) aObjectS401S0100000_27.l0).LIZLLL();
    }

    public static final Object invoke$1(AObjectS401S0100000_27 aObjectS401S0100000_27) {
        C1848940yDM c1848940yDM = (C1848940yDM) aObjectS401S0100000_27.l0;
        C1524970pmp c1524970pmp = c1848940yDM.LIZ;
        return new C1849040yDW(c1524970pmp.LIZ, c1524970pmp.LIZIZ, c1848940yDM.LIZJ);
    }

    public static final Object invoke$2(AObjectS401S0100000_27 aObjectS401S0100000_27) {
        return ((Iterable) aObjectS401S0100000_27.l0).iterator();
    }

    public static final Object invoke$3(AObjectS401S0100000_27 aObjectS401S0100000_27) {
        C1193630hAP c1193630hAP = (C1193630hAP) aObjectS401S0100000_27.l0;
        String str = ReactiveAccountActivity._pnsPageId;
        c1193630hAP.getClass();
        return C1192870h9B.LIZJ;
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [X.0x4l] */
    public static final Object invoke$4(AObjectS401S0100000_27 aObjectS401S0100000_27) {
        WalletPanelBodyAssem walletPanelBodyAssem = (WalletPanelBodyAssem) aObjectS401S0100000_27.l0;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = WalletPanelBodyAssem.LLJJJ;
        C1804310x3N c1804310x3NLJJIFFI = C1807670x8n.LJJIFFI(new C1804410x3X((C1804610x3r) C1807670x8n.LJJIII(new C1805070x4b(new C1804400x3W()), C1807670x8n.LJIL(), C1807670x8n.LJIJJLI(), walletPanelBodyAssem.Oo(), C1807670x8n.LJJ())), new C1804340x3Q((C1804610x3r) C1807670x8n.LJJIII(new C1805070x4b(new C1804400x3W()), C1807670x8n.LJIL(), C1807670x8n.LJIJJLI(), walletPanelBodyAssem.Oo(), C1807670x8n.LJJ())), new C1804330x3P(), new C1796830wrJ(), new C1804220x3E(new C1796830wrJ(), (C1804610x3r) C1807670x8n.LJJIII(new C1805070x4b(new C1804400x3W()), C1807670x8n.LJIL(), C1807670x8n.LJIJJLI(), walletPanelBodyAssem.Oo(), C1807670x8n.LJJ()), walletPanelBodyAssem.Oo()), new C1804590x3p((C1804610x3r) C1807670x8n.LJJIII(new C1805070x4b(new C1804400x3W()), C1807670x8n.LJIL(), C1807670x8n.LJIJJLI(), walletPanelBodyAssem.Oo(), C1807670x8n.LJJ())), new C1807890x99(), new C1803570x2B());
        InterfaceC1804490x3f interfaceC1804490x3fLJJII = C1807670x8n.LJJII(new C1804410x3X((C1804610x3r) C1807670x8n.LJJIII(new C1805070x4b(new C1804400x3W()), C1807670x8n.LJIL(), C1807670x8n.LJIJJLI(), walletPanelBodyAssem.Oo(), C1807670x8n.LJJ())), new C1804430x3Z((C1804610x3r) C1807670x8n.LJJIII(new C1805070x4b(new C1804400x3W()), C1807670x8n.LJIL(), C1807670x8n.LJIJJLI(), walletPanelBodyAssem.Oo(), C1807670x8n.LJJ())), new C1804320x3O(), new C1796830wrJ(), new C1804220x3E(new C1796830wrJ(), (C1804610x3r) C1807670x8n.LJJIII(new C1805070x4b(new C1804400x3W()), C1807670x8n.LJIL(), C1807670x8n.LJIJJLI(), walletPanelBodyAssem.Oo(), C1807670x8n.LJJ()), walletPanelBodyAssem.Oo()), new C1804590x3p((C1804610x3r) C1807670x8n.LJJIII(new C1805070x4b(new C1804400x3W()), C1807670x8n.LJIL(), C1807670x8n.LJIJJLI(), walletPanelBodyAssem.Oo(), C1807670x8n.LJJ())), new C1807890x99(), new C1803570x2B());
        if (!((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).canRedirectRechargeV3()) {
            interfaceC1804490x3fLJJII = c1804310x3NLJJIFFI;
        }
        C1804620x3s c1804620x3s = new C1804620x3s((C1804610x3r) C1807670x8n.LJJIII(new C1805070x4b(new C1804400x3W()), C1807670x8n.LJIL(), C1807670x8n.LJIJJLI(), walletPanelBodyAssem.Oo(), C1807670x8n.LJJ()));
        C1804910x4L c1804910x4L = new C1804910x4L(C1323690kYB.LIZ(C786410Ut5.N3(C497740JfY.LJII())), new C1804220x3E(new C1796830wrJ(), (C1804610x3r) C1807670x8n.LJJIII(new C1805070x4b(new C1804400x3W()), C1807670x8n.LJIL(), C1807670x8n.LJIJJLI(), walletPanelBodyAssem.Oo(), C1807670x8n.LJJ()), walletPanelBodyAssem.Oo()));
        final IWalletService iWalletServiceOo = walletPanelBodyAssem.Oo();
        return new RechargePanelBodyViewModel(interfaceC1804490x3fLJJII, c1804620x3s, c1804910x4L, new InterfaceC1805750x5h(iWalletServiceOo) { // from class: X.0x4l
            public final IWalletService LIZ;

            {
                this.LIZ = iWalletServiceOo;
            }

            /* JADX WARN: Code restructure failed: missing block: B:153:0x0250, code lost:
            
                r1 = r20.LIZ.walletCenter();
                r14 = r1.No0();
                r7 = r1.TF1();
             */
            /* JADX WARN: Code restructure failed: missing block: B:154:0x025e, code lost:
            
                if (r7 == null) goto L103;
             */
            /* JADX WARN: Code restructure failed: missing block: B:156:0x0264, code lost:
            
                if (r14 < 0) goto L171;
             */
            /* JADX WARN: Code restructure failed: missing block: B:158:0x026a, code lost:
            
                if (r7.frozenDiamond > 0) goto L171;
             */
            /* JADX WARN: Code restructure failed: missing block: B:159:0x026c, code lost:
            
                r17 = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:160:0x026e, code lost:
            
                r19 = X.C1805190x4n.LIZLLL(r21.LJII, r21.LJFF, r20.LIZ, LJ(r21));
                r11 = r21.LJII;
                r1 = r11.LJII;
             */
            /* JADX WARN: Code restructure failed: missing block: B:161:0x0282, code lost:
            
                if (r1 <= 0) goto L170;
             */
            /* JADX WARN: Code restructure failed: missing block: B:163:0x0290, code lost:
            
                if (X.C1805190x4n.LIZLLL(r11, r21.LJFF, r20.LIZ, LJ(r21)) != false) goto L170;
             */
            /* JADX WARN: Code restructure failed: missing block: B:164:0x0292, code lost:
            
                r16 = kotlin.text.u.LJJIFFI(X.C497740JfY.LJIIJJI(2131755507, (int) r1), "{number}", java.lang.String.valueOf(r1), false);
             */
            /* JADX WARN: Code restructure failed: missing block: B:165:0x02a4, code lost:
            
                r15 = java.lang.String.valueOf(r14);
             */
            /* JADX WARN: Code restructure failed: missing block: B:166:0x02ae, code lost:
            
                if (r7.frozenDiamond <= 0) goto L169;
             */
            /* JADX WARN: Code restructure failed: missing block: B:167:0x02b0, code lost:
            
                r18 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:168:0x02b2, code lost:
            
                r5.add(new X.C1805590x5R(r15, r16, r17, r18, r19));
             */
            /* JADX WARN: Code restructure failed: missing block: B:169:0x02bb, code lost:
            
                r18 = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:170:0x02be, code lost:
            
                r16 = null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:171:0x02c1, code lost:
            
                r17 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:44:0x00b5, code lost:
            
                if (r21.LIZJ != null) goto L48;
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x00b9, code lost:
            
                if (r21.LJIIIIZZ == false) goto L48;
             */
            /* JADX WARN: Code restructure failed: missing block: B:47:0x00bb, code lost:
            
                r5.add(new X.C1806650x79(r21.LJ));
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:193:0x0333  */
            /* JADX WARN: Removed duplicated region for block: B:197:0x034a A[LOOP:10: B:195:0x0344->B:197:0x034a, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:200:0x0362  */
            /* JADX WARN: Removed duplicated region for block: B:203:0x036f  */
            /* JADX WARN: Removed duplicated region for block: B:206:0x0380  */
            /* JADX WARN: Removed duplicated region for block: B:210:0x038f  */
            /* JADX WARN: Removed duplicated region for block: B:221:0x03c2  */
            /* JADX WARN: Removed duplicated region for block: B:237:0x03f5  */
            /* JADX WARN: Removed duplicated region for block: B:238:0x03f7  */
            /* JADX WARN: Removed duplicated region for block: B:283:0x03a8 A[EDGE_INSN: B:283:0x03a8->B:218:0x03a8 BREAK  A[LOOP:11: B:208:0x0389->B:236:0x03f2], SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r4v0, types: [X.13BV] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Collection] */
            /* JADX WARN: Type inference failed for: r4v11, types: [java.util.ArrayList] */
            @Override // X.InterfaceC1806250x6V
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C1556660qbw LIZLLL(X.C1805220x4q r21) {
                /*
                    Method dump skipped, instruction units count: 1059
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1805170x4l.LIZLLL(X.0x4q):X.0qbw");
            }

            public final int LJ(C1805220x4q c1805220x4q) {
                IapListResult.ActivityInfo activityInfo;
                InterfaceC1806200x6Q interfaceC1806200x6QAo2 = this.LIZ.walletCenter().ao2(c1805220x4q.LJII.LJ);
                IapListResult.ListResultExtra listResultExtra = c1805220x4q.LIZLLL;
                IapListResult.ActivityInfo activityInfo2 = null;
                if (listResultExtra != null) {
                    activityInfo = listResultExtra.activityInfo;
                } else {
                    activityInfo = null;
                }
                if (!C500260Jjc.LJJIFFI(Boolean.valueOf(C1805400x58.LIZJ(interfaceC1806200x6QAo2, activityInfo))) && !c1805220x4q.LJFF) {
                    IapListResult.ListResultExtra listResultExtra2 = c1805220x4q.LIZLLL;
                    if (listResultExtra2 != null) {
                        activityInfo2 = listResultExtra2.activityInfo;
                    }
                    if (C1805670x5Z.LIZ(activityInfo2)) {
                        return 3;
                    }
                    return c1805220x4q.LJII.LJIIZILJ;
                }
                return 0;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static X.C1805380x56 LJI(X.C1805370x55 r15, java.lang.Integer r16) {
                /*
                    X.0x6f r0 = X.C1804050x2x.LIZ()
                    boolean r5 = r0.LIZJ()
                    java.lang.Long r0 = r15.LJIIJJI
                    if (r0 == 0) goto L38
                    long r3 = r0.longValue()
                    if (r16 == 0) goto L38
                    int r0 = r16.intValue()
                    long r1 = (long) r0
                    int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                    if (r0 <= 0) goto L38
                    r16 = 0
                L1d:
                    X.0x56 r1 = new X.0x56
                    java.lang.String r2 = r15.LIZ
                    java.lang.String r3 = r15.LIZJ
                    java.lang.String r6 = r15.LIZLLL
                    java.lang.String r8 = r15.LIZIZ
                    int r10 = r15.LJI
                    double r11 = r15.LJFF
                    java.lang.String r13 = r15.LJII
                    boolean r14 = r15.LJIIIIZZ
                    java.lang.Long r15 = r15.LJIIJJI
                    r4 = 0
                    r9 = 0
                    r7 = r4
                    r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r15, r16)
                    return r1
                L38:
                    r16 = 1
                    goto L1d
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1805170x4l.LJI(X.0x55, java.lang.Integer):X.0x56");
            }

            /* JADX WARN: Code restructure failed: missing block: B:37:0x0099, code lost:
            
                if (r4 == null) goto L38;
             */
            @Override // X.InterfaceC1805750x5h
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.InterfaceC1806820x7Q LIZIZ(webcast.api.profit.IapListResult.ListResultExtra r16, X.C1805370x55 r17) {
                /*
                    Method dump skipped, instruction units count: 331
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1805170x4l.LIZIZ(webcast.api.profit.IapListResult$ListResultExtra, X.0x55):X.0x7Q");
            }

            public static int LJFF(List list, int i, C1805220x4q c1805220x4q) {
                C1805380x56 c1805380x56;
                if (LiveRechargeKycAnnualCapSetting.INSTANCE.getValue() && c1805220x4q.LJIILLIIL != null) {
                    Object objLJJJLZIJ = C13LP.LJJJLZIJ(i, list);
                    if ((objLJJJLZIJ instanceof C1805380x56) && (c1805380x56 = (C1805380x56) objLJJJLZIJ) != null && c1805380x56.LJIILIIL) {
                        return i;
                    }
                    int i2 = 0;
                    for (InterfaceC1806790x7N interfaceC1806790x7N : (ArrayList) list) {
                        if ((interfaceC1806790x7N instanceof C1805380x56) && ((C1805380x56) interfaceC1806790x7N).LJIILIIL) {
                            return i2;
                        }
                        i2++;
                    }
                    return -1;
                }
                return i;
            }

            /* JADX WARN: Removed duplicated region for block: B:41:0x006f A[PHI: r7
              0x006f: PHI (r7v1 X.0x8N) = (r7v0 X.0x8N), (r7v4 X.0x8N), (r7v4 X.0x8N), (r7v4 X.0x8N) binds: [B:39:0x006c, B:23:0x0036, B:25:0x003a, B:27:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.InterfaceC1805750x5h
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.InterfaceC1806810x7P LIZJ(java.lang.Throwable r11, webcast.api.profit.IapListResult.ListResultExtra r12, X.C1803830x2b r13) {
                /*
                    r10 = this;
                    r4 = 0
                    if (r11 == 0) goto L6a
                    X.0wru r6 = X.C1803530x27.LIZIZ(r11)
                    if (r12 == 0) goto L73
                    webcast.api.profit.PackageUnavailableConfig r2 = r12.packageUnavailableConfig
                Lb:
                    r3 = 0
                    if (r12 == 0) goto L75
                    webcast.api.profit.IapListResult$IapCustomData r0 = r12.iapCustomData
                    if (r0 == 0) goto L75
                    boolean r1 = r0.enableFailureCustomEntranceGuide
                    r0 = 1
                    if (r1 != r0) goto L75
                    if (r2 == 0) goto L75
                    if (r12 == 0) goto L6b
                    webcast.api.profit.PackageUnavailableConfig r0 = r12.packageUnavailableConfig
                    if (r0 == 0) goto L6b
                    java.util.List<webcast.api.profit.TemplateText> r0 = r0.titles
                    if (r0 == 0) goto L6b
                    java.lang.Object r1 = X.C13LP.LJJJLL(r0)
                    webcast.api.profit.TemplateText r1 = (webcast.api.profit.TemplateText) r1
                    if (r1 == 0) goto L6b
                    X.0x8L r0 = X.C1806560x70.LIZ
                    r0.getClass()
                    X.0x8N r7 = X.C1807390x8L.LJ(r1, r4, r4)
                L34:
                    webcast.api.profit.PackageUnavailableConfig r0 = r12.packageUnavailableConfig
                    if (r0 == 0) goto L6f
                    java.util.List<webcast.api.profit.TemplateText> r0 = r0.subTitles
                    if (r0 == 0) goto L6f
                    java.lang.Object r1 = X.C13LP.LJJJLL(r0)
                    webcast.api.profit.TemplateText r1 = (webcast.api.profit.TemplateText) r1
                    if (r1 == 0) goto L6f
                    X.0x8L r0 = X.C1806560x70.LIZ
                    r0.getClass()
                    X.0x8N r8 = X.C1807390x8L.LJ(r1, r4, r4)
                L4d:
                    webcast.api.profit.PackageUnavailableConfig r0 = r12.packageUnavailableConfig
                    if (r0 == 0) goto L63
                    java.util.List<webcast.api.profit.TemplateButton> r0 = r0.buttons
                    if (r0 == 0) goto L63
                    java.lang.Object r1 = X.C13LP.LJJJLL(r0)
                    webcast.api.profit.TemplateButton r1 = (webcast.api.profit.TemplateButton) r1
                    if (r1 == 0) goto L63
                    X.0x8L r0 = X.C1806560x70.LIZ
                    X.0x8G r4 = r0.LIZLLL(r1)
                L63:
                    r9 = r4
                    X.0x69 r4 = new X.0x69
                    r5 = r13
                    r4.<init>(r5, r6, r7, r8, r9)
                L6a:
                    return r4
                L6b:
                    r7 = r4
                    if (r12 == 0) goto L6f
                    goto L34
                L6f:
                    r8 = r4
                    if (r12 == 0) goto L63
                    goto L4d
                L73:
                    r2 = r4
                    goto Lb
                L75:
                    com.bytedance.android.live.wallet.IWalletService r0 = r10.LIZ
                    boolean r0 = r0.isV3Phase2(r3)
                    if (r0 == 0) goto L9b
                    r1 = 2131851003(0x7f1176fb, float:1.9335584E38)
                L80:
                    X.0x5T r4 = new X.0x5T
                    X.0x2m r2 = new X.0x2m
                    java.lang.Object[] r0 = new java.lang.Object[r3]
                    r2.<init>(r1, r0)
                    X.0x5Q r1 = X.C1805580x5Q.LIZ
                    int r0 = r6.getInternalCode()
                    int r0 = r1.LIZIZ(r0)
                    java.lang.String r0 = X.C497740JfY.LJIJI(r0)
                    r4.<init>(r2, r0)
                    return r4
                L9b:
                    r1 = 2131844613(0x7f115e05, float:1.9322624E38)
                    goto L80
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1805170x4l.LIZJ(java.lang.Throwable, webcast.api.profit.IapListResult$ListResultExtra, X.0x2b):X.0x7P");
            }

            /* JADX WARN: Removed duplicated region for block: B:143:0x0298  */
            @Override // X.InterfaceC1805750x5h
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.AbstractC1806300x6a LIZ(final int r26, final int r27, X.C1803830x2b r28, boolean r29) {
                /*
                    Method dump skipped, instruction units count: 740
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1805170x4l.LIZ(int, int, X.0x2b, boolean):X.0x6a");
            }
        }, walletPanelBodyAssem.Lo(), walletPanelBodyAssem.Oo());
    }

    public static final Object invoke$5(AObjectS401S0100000_27 aObjectS401S0100000_27) {
        TtopIABActivity ttopIABActivity = (TtopIABActivity) aObjectS401S0100000_27.l0;
        String str = TtopIABActivity._pnsPageId;
        return new TtopIABVM((TtopIABRouterParams) ttopIABActivity.LLIZ.getValue());
    }

    public static final Object invoke$6(AObjectS401S0100000_27 aObjectS401S0100000_27) {
        C19282410cA c19282410cA = (C19282410cA) aObjectS401S0100000_27.l0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("first day, info: ");
        sbLIZ.append(c19282410cA);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$7(AObjectS401S0100000_27 aObjectS401S0100000_27) {
        C19282410cA c19282410cA = (C19282410cA) aObjectS401S0100000_27.l0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("save new day, info");
        sbLIZ.append(c19282410cA);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AObjectS401S0100000_27(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
