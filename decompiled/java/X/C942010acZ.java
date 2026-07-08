package X;

import android.content.Context;
import android.graphics.Rect;
import android.widget.FrameLayout;
import com.bytedance.android.live.liveinteract.multiguestv3.AudienceVideoViewParams;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.guest.MultiGuestSharedBgGuestViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS21S0600000_15;
import kotlin.jvm.internal.AwS2S0420000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS76S0500000_15;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.MultiGuestLayoutExtra;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0acZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C942010acZ implements InterfaceC2181591AZp {
    public final Map<String, EnumC942070acf> LIZ = new LinkedHashMap();
    public final Map<String, EnumC943640afC> LIZIZ = new LinkedHashMap();
    public final /* synthetic */ C940020aZM LIZJ;

    @Override // X.InterfaceC2181591AZp
    public final void LIZJ(int i, String str, C955230axt c955230axt) {
    }

    @Override // X.InterfaceC2181591AZp
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC2181591AZp
    public final void LJIIJ() {
    }

    @Override // X.InterfaceC2181591AZp
    public final boolean LJIJJLI() {
        return true;
    }

    @Override // X.InterfaceC2181591AZp
    public final void LJIL(EnumC965730bEp enumC965730bEp, C1283230jUv c1283230jUv, EnumC1286590jaL enumC1286590jaL, EnumC1286590jaL enumC1286590jaL2) {
    }

    public C942010acZ(C940020aZM c940020aZM) {
        this.LIZJ = c940020aZM;
    }

    public final void LJJII(String str) {
        boolean z;
        C938230aWT c938230aWTLIZJ;
        C11PQ<Boolean> c11pq;
        if (((LinkedHashMap) this.LIZIZ).get(str) != EnumC943640afC.DISCONNECT && ((LinkedHashMap) this.LIZ).get(str) != EnumC942070acf.PAUSE_STATE) {
            z = false;
        } else {
            z = true;
        }
        C938220aWS c938220aWSLJIJJLI = this.LIZJ.LJIJJLI();
        if (c938220aWSLJIJJLI != null && (c938230aWTLIZJ = c938220aWSLJIJJLI.LIZJ(str, true, false)) != null && (c11pq = c938230aWTLIZJ.LIZJ) != null) {
            c11pq.onNext(Boolean.valueOf(!z));
        }
    }

    public final void LJJIII(Rect rect) {
        boolean z;
        C940020aZM c940020aZM = this.LIZJ;
        FrameLayout frameLayout = c940020aZM.LLJJLIIIJLLLLLLLZ;
        if (frameLayout != null) {
            if (frameLayout.getWidth() == rect.width() && frameLayout.getHeight() == rect.height()) {
                z = true;
            } else {
                z = false;
            }
            int width = frameLayout.getWidth() - rect.right;
            C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
            C307001Gy.LIZ().getClass();
            C0IEU c0ieu = new C0IEU(rect.width(), rect.height(), rect.top, rect.left, width, z, C927600aFK.LJIIJ(), (String) null, (InterfaceC463550IFt) null, "MultiGuestLayoutRender_updateSizeAfterFilter", false, 2944);
            DataChannel dataChannelLJII = c940020aZM.LJII();
            if (dataChannelLJII != null) {
                dataChannelLJII.zW(AudienceVideoViewParams.class, c0ieu);
            }
        }
    }

    public static void LJJIFFI(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("layoutDelegate#");
        sbLIZ.append(str);
        sbLIZ.append(' ');
        sbLIZ.append(str2);
        C937310aUz.LJII("feed_new_layout", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC2181591AZp
    public final void LIZ(String str, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isSingleView=");
        sbLIZ.append(z);
        sbLIZ.append(" source=");
        sbLIZ.append(str);
        LJJIFFI("onSingleViewModeChange", C2188811AlT.LIZIZ(sbLIZ));
        for (InterfaceC942030acb interfaceC942030acb : (ArrayList) this.LIZJ.LLJJIJIIJIL) {
            if (interfaceC942030acb != null) {
                interfaceC942030acb.LIZ(str, z);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c6 A[EDGE_INSN: B:101:0x01c6->B:99:0x01c6 BREAK  A[LOOP:0: B:7:0x002d->B:103:?]] */
    @Override // X.InterfaceC2181591AZp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C955310ay1 LJI(X.C955310ay1 r23, X.C955230axt r24) {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C942010acZ.LJI(X.0ay1, X.0axt):X.0ay1");
    }

    @Override // X.InterfaceC2181591AZp
    public final void LJIIIIZZ(List<C957020b0m> list, C955230axt c955230axt) {
        for (InterfaceC942030acb interfaceC942030acb : (ArrayList) this.LIZJ.LLJJIJIIJIL) {
            if (interfaceC942030acb != null) {
                interfaceC942030acb.LJIIIZ();
            }
        }
    }

    @Override // X.InterfaceC2181591AZp
    public final void LJIIL(C942080acg c942080acg, C955230axt c955230axt) {
        int size;
        int size2;
        Integer numValueOf;
        Boolean boolValueOf;
        String str;
        C935650aSJ state;
        Rect rectLJJIIJZLJL;
        List<C942090ach> list;
        List<C957020b0m> list2;
        ConcurrentHashMap<String, C938230aWT> concurrentHashMap;
        Iterator<Map.Entry<String, C938230aWT>> it2;
        String str2;
        Boolean boolValueOf2;
        Long lValueOf;
        List<C942090ach> list3;
        List<C957020b0m> list4;
        C947460alM c947460alM = c942080acg.LIZIZ;
        if (c947460alM != null && (list4 = c947460alM.LIZJ) != null) {
            size = list4.size();
        } else {
            size = 0;
        }
        C947460alM c947460alM2 = c942080acg.LIZIZ;
        if (c947460alM2 != null && (list3 = c947460alM2.LIZLLL) != null) {
            size2 = list3.size();
        } else {
            size2 = 0;
        }
        if (size > 0 || size2 > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("source=");
            sbLIZ.append(c955230axt);
            sbLIZ.append(" newWindows=");
            sbLIZ.append(size);
            sbLIZ.append(" updatedWindows=");
            sbLIZ.append(size2);
            LJJIFFI("onLayoutPipelineEndSuccess", C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onLayoutPipelineEndSuccess interface:");
        InterfaceC940060aZQ interfaceC940060aZQ = this.LIZJ.LLJJJJJIL;
        Long lValueOf2 = null;
        if (interfaceC940060aZQ != null) {
            numValueOf = Integer.valueOf(interfaceC940060aZQ.hashCode());
        } else {
            numValueOf = null;
        }
        sbLIZ2.append(numValueOf);
        sbLIZ2.append(" renderResult=");
        sbLIZ2.append(C937310aUz.LJIIIIZZ(c942080acg.LIZ));
        sbLIZ2.append(", new=");
        sbLIZ2.append(c942080acg.LIZIZ.LIZJ.size());
        sbLIZ2.append(", update=");
        sbLIZ2.append(c942080acg.LIZIZ.LIZLLL.size());
        C937310aUz.LJII("feed_new_layout", C2188811AlT.LIZIZ(sbLIZ2));
        try {
            if (C943630afB.LIZ().addShowLog) {
                C940020aZM c940020aZM = this.LIZJ;
                if (!Intrinsics.LJFF(c940020aZM.LLJL, c940020aZM.LLJJLIIIJLLLLLLLZ)) {
                    C940490aa7 c940490aa7 = this.LIZJ.LLILLJJLI;
                    if (c940490aa7 != null) {
                        boolValueOf2 = Boolean.valueOf(C933980aPc.LJIIIZ(c940490aa7.LJIILJJIL));
                    } else {
                        boolValueOf2 = null;
                    }
                    if (C500260Jjc.LJJIJIIJIL(boolValueOf2)) {
                        C940020aZM c940020aZM2 = this.LIZJ;
                        c940020aZM2.LLJL = c940020aZM2.LLJJLIIIJLLLLLLLZ;
                        DataChannel dataChannelLJII = c940020aZM2.LJII();
                        if (dataChannelLJII != null) {
                            C940020aZM c940020aZM3 = this.LIZJ;
                            C940170aZb c940170aZb = (C940170aZb) dataChannelLJII.gg0(C956980b0i.class);
                            if (c940170aZb == null) {
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("updateFirstLayoutTs return as logInfo is null roomId:");
                                C940490aa7 c940490aa72 = c940020aZM3.LLILLJJLI;
                                if (c940490aa72 != null) {
                                    lValueOf = Long.valueOf(c940490aa72.LIZ);
                                } else {
                                    lValueOf = null;
                                }
                                sbLIZ3.append(lValueOf);
                                C937310aUz.LIZLLL("feed_new_layout", C2188811AlT.LIZIZ(sbLIZ3));
                            } else {
                                if (c940170aZb.LIZJ <= 0) {
                                    c940170aZb.LIZJ = System.currentTimeMillis();
                                }
                                InterfaceC940230aZh interfaceC940230aZh = c940020aZM3.LLJLL;
                                if (interfaceC940230aZh != null) {
                                    interfaceC940230aZh.LIZIZ();
                                }
                            }
                        }
                    }
                }
            }
            C938220aWS c938220aWSLJIJJLI = this.LIZJ.LJIJJLI();
            if (c938220aWSLJIJJLI != null) {
                c938220aWSLJIJJLI.LJIILJJIL(c942080acg);
            }
            C938220aWS c938220aWSLJIJJLI2 = this.LIZJ.LJIJJLI();
            if (c938220aWSLJIJJLI2 != null && (concurrentHashMap = c938220aWSLJIJJLI2.LLJJ) != null && (it2 = concurrentHashMap.entrySet().iterator()) != null) {
                while (C500260Jjc.LJJJI(Boolean.valueOf(it2.hasNext()))) {
                    String key = it2.next().getKey();
                    List<C957020b0m> list5 = c942080acg.LIZ.LIZLLL;
                    if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                        Iterator<C957020b0m> it3 = list5.iterator();
                        while (it3.hasNext()) {
                            PosIdentity posIdentity = it3.next().getPosIdentity();
                            if (posIdentity != null && posIdentity.type == 1) {
                                str2 = posIdentity.value;
                            } else {
                                str2 = null;
                            }
                            if (Intrinsics.LJFF(str2, key)) {
                                break;
                            }
                        }
                    }
                    it2.remove();
                }
            }
            C947460alM c947460alM3 = c942080acg.LIZIZ;
            if (c947460alM3 != null && (list2 = c947460alM3.LIZJ) != null) {
                C940020aZM c940020aZM4 = this.LIZJ;
                Iterator<C957020b0m> it4 = list2.iterator();
                while (it4.hasNext()) {
                    c940020aZM4.LJIIJ(it4.next());
                }
            }
            C947460alM c947460alM4 = c942080acg.LIZIZ;
            if (c947460alM4 != null && (list = c947460alM4.LIZLLL) != null) {
                C940020aZM c940020aZM5 = this.LIZJ;
                Iterator<C942090ach> it5 = list.iterator();
                while (it5.hasNext()) {
                    C957020b0m c957020b0m = it5.next().LIZ;
                    if (c957020b0m != null) {
                        c940020aZM5.LJIIJ(c957020b0m);
                    }
                }
            }
            C940750aaX c940750aaXLJIJJ = this.LIZJ.LJIJJ();
            if ((c940750aaXLJIJJ instanceof InterfaceC940760aaY) && c940750aaXLJIJJ != null) {
                c940750aaXLJIJJ.LJJIIJZLJL(c942080acg);
            }
            InterfaceC940060aZQ interfaceC940060aZQ2 = this.LIZJ.LLJJJJJIL;
            if (interfaceC940060aZQ2 != null && (rectLJJIIJZLJL = interfaceC940060aZQ2.LJJIIJZLJL()) != null) {
                LJJIII(rectLJJIIJZLJL);
            }
            C940020aZM c940020aZM6 = this.LIZJ;
            MultiGuestSharedBgGuestViewModel multiGuestSharedBgGuestViewModel = c940020aZM6.LLIZ;
            if (multiGuestSharedBgGuestViewModel != null && (state = multiGuestSharedBgGuestViewModel.getState()) != null) {
                str = state.LLILZ;
            } else {
                str = null;
            }
            c940020aZM6.LJJIIZ(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("onLayoutPipelineEndSuccess exception=");
            sbLIZ4.append(e.getMessage());
            C937310aUz.LJFF("feed_new_layout", C2188811AlT.LIZIZ(sbLIZ4));
        }
        this.LIZJ.LJJIJ(c942080acg);
        C940490aa7 c940490aa73 = this.LIZJ.LLILLJJLI;
        if (c940490aa73 != null) {
            boolValueOf = Boolean.valueOf(C933980aPc.LJIIIZ(c940490aa73.LJIILJJIL));
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJIFFI(boolValueOf) && (!this.LIZJ.LLJILJILJ)) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("triggerFetchHostTagInfo roomId:");
            C940490aa7 c940490aa74 = this.LIZJ.LLILLJJLI;
            if (c940490aa74 != null) {
                lValueOf2 = Long.valueOf(c940490aa74.LIZ);
            }
            sbLIZ5.append(lValueOf2);
            C937310aUz.LJII("feed_new_layout", C2188811AlT.LIZIZ(sbLIZ5));
            C923450a8d.LIZJ(this.LIZJ.LJII());
            C940020aZM c940020aZM7 = this.LIZJ;
            C940490aa7 c940490aa75 = c940020aZM7.LLILLJJLI;
            if (c940490aa75 != null) {
                long j = c940490aa75.LIZ;
                Context context = c940490aa75.LIZJ;
                if (context != null) {
                    C922550a7B.LIZIZ(j, context, c940020aZM7.LJII(), new AwS559S0100000_15(this.LIZJ, 1083));
                    this.LIZJ.LLJILJILJ = true;
                }
            }
        }
        for (InterfaceC942030acb interfaceC942030acb : (ArrayList) this.LIZJ.LLJJIJIIJIL) {
            if (interfaceC942030acb != null) {
                interfaceC942030acb.LJIL(c942080acg);
            }
        }
    }

    @Override // X.InterfaceC2181591AZp
    public final void LJIILJJIL(String str, C955230axt c955230axt) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("layoutKey=");
        sbLIZ.append(str);
        sbLIZ.append(" source=");
        sbLIZ.append(c955230axt);
        LJJIFFI("onLayoutWillBegin", C2188811AlT.LIZIZ(sbLIZ));
        for (InterfaceC942030acb interfaceC942030acb : (ArrayList) this.LIZJ.LLJJIJIIJIL) {
            if (interfaceC942030acb != null) {
                interfaceC942030acb.LIZLLL();
            }
        }
    }

    @Override // X.InterfaceC2181591AZp
    public final void LJIILL(String str, C955230axt c955230axt) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("layoutKey=");
        sbLIZ.append(str);
        sbLIZ.append(" source=");
        sbLIZ.append(c955230axt);
        LJJIFFI("onLayoutDidBegin", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC940230aZh interfaceC940230aZh = this.LIZJ.LLJLL;
        if (interfaceC940230aZh != null) {
            interfaceC940230aZh.LJ(str);
        }
        for (InterfaceC942030acb interfaceC942030acb : (ArrayList) this.LIZJ.LLJJIJIIJIL) {
            if (interfaceC942030acb != null) {
                interfaceC942030acb.LIZJ();
            }
        }
    }

    @Override // X.InterfaceC2181591AZp
    public final void LJIILLIIL(C942080acg c942080acg, C955230axt c955230axt) {
        for (InterfaceC942030acb interfaceC942030acb : (ArrayList) this.LIZJ.LLJJIJIIJIL) {
            if (interfaceC942030acb != null) {
                interfaceC942030acb.LJIILJJIL();
            }
        }
        this.LIZJ.LJJIJ(c942080acg);
    }

    @Override // X.InterfaceC2181591AZp
    public final void LJIIZILJ(String str, C955230axt c955230axt) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("layoutKey=");
        sbLIZ.append(str);
        sbLIZ.append(" source=");
        sbLIZ.append(c955230axt);
        LJJIFFI("onLayoutWillEnd", C2188811AlT.LIZIZ(sbLIZ));
        for (InterfaceC942030acb interfaceC942030acb : (ArrayList) this.LIZJ.LLJJIJIIJIL) {
            if (interfaceC942030acb != null) {
                interfaceC942030acb.LJ();
            }
        }
    }

    @Override // X.InterfaceC2181591AZp
    public final void LJIJ(String str, C955230axt c955230axt) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("layoutKey=");
        sbLIZ.append(str);
        sbLIZ.append(" source=");
        sbLIZ.append(c955230axt);
        LJJIFFI("onLayoutDidEnd", C2188811AlT.LIZIZ(sbLIZ));
        for (InterfaceC942030acb interfaceC942030acb : (ArrayList) this.LIZJ.LLJJIJIIJIL) {
            if (interfaceC942030acb != null) {
                interfaceC942030acb.LJI();
            }
        }
    }

    @Override // X.InterfaceC2181591AZp
    public final void LJ(int i, String str, C955230axt c955230axt) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("errorCode=");
        sbLIZ.append(i);
        sbLIZ.append(" msg=");
        sbLIZ.append(str);
        sbLIZ.append(" source=");
        sbLIZ.append(c955230axt);
        LJJIFFI("onLayoutError", C2188811AlT.LIZIZ(sbLIZ));
        for (InterfaceC942030acb interfaceC942030acb : (ArrayList) this.LIZJ.LLJJIJIIJIL) {
            if (interfaceC942030acb != null) {
                interfaceC942030acb.LJIILIIL();
            }
        }
    }

    @Override // X.InterfaceC2181591AZp
    public final void LJIIJJI(MultiGuestLayoutExtra multiGuestLayoutExtra, String str, C955230axt c955230axt) {
        for (InterfaceC942030acb interfaceC942030acb : (ArrayList) this.LIZJ.LLJJIJIIJIL) {
            if (interfaceC942030acb != null) {
                interfaceC942030acb.LJIIZILJ();
            }
        }
    }

    @Override // X.InterfaceC2181591AZp
    public final void LJIILIIL(EnumC965730bEp enumC965730bEp, EnumC965730bEp enumC965730bEp2, C955230axt c955230axt) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("old=");
        sbLIZ.append(enumC965730bEp);
        sbLIZ.append(" new=");
        sbLIZ.append(enumC965730bEp2);
        sbLIZ.append(" source=");
        sbLIZ.append(c955230axt);
        LJJIFFI("onLayoutArchDidChanged", C2188811AlT.LIZIZ(sbLIZ));
        for (InterfaceC942030acb interfaceC942030acb : (ArrayList) this.LIZJ.LLJJIJIIJIL) {
            if (interfaceC942030acb != null) {
                interfaceC942030acb.LJIIJ();
            }
        }
    }

    @Override // X.InterfaceC2181591AZp
    public final Rect LJIJI(C957020b0m c957020b0m, Rect rect, C955230axt c955230axt) {
        Object next;
        InterfaceC942100aci interfaceC942100aci;
        Rect rectLJIILL;
        Iterator it2 = ((ArrayList) this.LIZJ.LLJJIJIIJIL).iterator();
        do {
            next = null;
            if (!it2.hasNext()) {
                break;
            }
            next = it2.next();
        } while (!(next instanceof InterfaceC942100aci));
        if ((next instanceof InterfaceC942100aci) && (interfaceC942100aci = (InterfaceC942100aci) next) != null && (rectLJIILL = interfaceC942100aci.LJIILL(c957020b0m, rect)) != null) {
            return rectLJIILL;
        }
        return rect;
    }

    @Override // X.InterfaceC2181591AZp
    public final void LJIJJ(EnumC965730bEp enumC965730bEp, EnumC965730bEp enumC965730bEp2, C955230axt c955230axt) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("old=");
        sbLIZ.append(enumC965730bEp);
        sbLIZ.append(" new=");
        sbLIZ.append(enumC965730bEp2);
        sbLIZ.append(" source=");
        sbLIZ.append(c955230axt);
        LJJIFFI("onLayoutArchWillChange", C2188811AlT.LIZIZ(sbLIZ));
        for (InterfaceC942030acb interfaceC942030acb : (ArrayList) this.LIZJ.LLJJIJIIJIL) {
            if (interfaceC942030acb != null) {
                interfaceC942030acb.LJIIJJI(enumC965730bEp2);
            }
        }
    }

    @Override // X.InterfaceC2181591AZp
    public final void LIZIZ(EnumC965730bEp enumC965730bEp, C1283230jUv c1283230jUv, boolean z, boolean z2) {
        C0C27.LIZ(new AwS2S0420000_15(this, this.LIZJ, enumC965730bEp, c1283230jUv, z, z2, 3));
    }

    @Override // X.InterfaceC2181591AZp
    public final void LJFF(EnumC965730bEp enumC965730bEp, C1283230jUv c1283230jUv, EnumC942070acf enumC942070acf, EnumC942070acf enumC942070acf2) {
        C0C27.LIZ(new AwS21S0600000_15(c1283230jUv, this, enumC965730bEp, enumC942070acf, enumC942070acf2, this.LIZJ, 4));
    }

    @Override // X.InterfaceC2181591AZp
    public final void LJII(C955320ay2 c955320ay2, List<C957030b0n> list, MultiGuestLayoutExtra multiGuestLayoutExtra, C955230axt c955230axt) {
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("source=");
        sbLIZ.append(c955230axt);
        sbLIZ.append(" state=");
        sbLIZ.append(c955320ay2);
        sbLIZ.append(" spotCount=");
        sbLIZ.append(((ArrayList) list).size());
        sbLIZ.append(" hasExtra=");
        if (multiGuestLayoutExtra != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        LJJIFFI("onLayoutInfoUpdated", C2188811AlT.LIZIZ(sbLIZ));
        for (InterfaceC942030acb interfaceC942030acb : (ArrayList) this.LIZJ.LLJJIJIIJIL) {
            if (interfaceC942030acb != null) {
                interfaceC942030acb.LJIJI();
            }
        }
    }

    @Override // X.InterfaceC2181591AZp
    public final void LJIIIZ(EnumC965730bEp enumC965730bEp, C1283230jUv c1283230jUv, boolean z, boolean z2) {
        C0C27.LIZ(new AwS2S0420000_15(this, this.LIZJ, enumC965730bEp, c1283230jUv, z, z2, 1));
    }

    @Override // X.InterfaceC2181591AZp
    public final void LJJ(EnumC965730bEp enumC965730bEp, C1283230jUv c1283230jUv, boolean z, boolean z2) {
        C0C27.LIZ(new AwS2S0420000_15(this, this.LIZJ, enumC965730bEp, c1283230jUv, z, z2, 2));
    }

    @Override // X.InterfaceC2181591AZp
    public final void LJJI(EnumC965730bEp enumC965730bEp, C1283230jUv c1283230jUv, EnumC943640afC enumC943640afC, EnumC943640afC enumC943640afC2) {
        C0C27.LIZ(new AwS76S0500000_15(c1283230jUv, this, enumC965730bEp, enumC943640afC, enumC943640afC2, 7));
    }
}
