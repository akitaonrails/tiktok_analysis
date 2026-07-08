package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.ViewGroup;
import com.bytedance.android.live.liveinteract.multiguestv3.AudienceVideoViewParams;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestV3ShowEmptyViewEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.render.MultiGuestLayoutRenderV2;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestSharedBgFixForLRSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS0S0320000_15;
import kotlin.jvm.internal.AwS21S0600000_15;
import kotlin.jvm.internal.AwS76S0500000_15;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.MultiGuestLayoutExtra;
import tikcast.linkmic.common.MultiGuestSpotExtra;
import tikcast.linkmic.common.PosIdentity;
import tikcast.linkmic.common.SpotInfo;

/* JADX INFO: renamed from: X.0acY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C942000acY implements InterfaceC2181591AZp {
    public final Map<String, EnumC942070acf> LIZ = new LinkedHashMap();
    public final Map<String, EnumC943640afC> LIZIZ = new LinkedHashMap();
    public final /* synthetic */ MultiGuestLayoutRenderV2 LIZJ;

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
    public final void LJIIJJI(MultiGuestLayoutExtra multiGuestLayoutExtra, String str, C955230axt c955230axt) {
    }

    @Override // X.InterfaceC2181591AZp
    public final void LJIILLIIL(C942080acg c942080acg, C955230axt c955230axt) {
    }

    @Override // X.InterfaceC2181591AZp
    public final boolean LJIJJLI() {
        return false;
    }

    @Override // X.InterfaceC2181591AZp
    public final void LJJ(EnumC965730bEp enumC965730bEp, C1283230jUv c1283230jUv, boolean z, boolean z2) {
    }

    public C942000acY(MultiGuestLayoutRenderV2 multiGuestLayoutRenderV2) {
        this.LIZJ = multiGuestLayoutRenderV2;
    }

    public final void LJJIFFI(String str) {
        boolean z;
        C938230aWT c938230aWTLIZJ;
        C11PQ<Boolean> c11pq;
        if (((LinkedHashMap) this.LIZIZ).get(str) != EnumC943640afC.DISCONNECT && ((LinkedHashMap) this.LIZ).get(str) != EnumC942070acf.PAUSE_STATE) {
            z = false;
        } else {
            z = true;
        }
        C938220aWS c938220aWS = this.LIZJ.LLJ;
        if (c938220aWS != null && (c938230aWTLIZJ = c938220aWS.LIZJ(str, true, false)) != null && (c11pq = c938230aWTLIZJ.LIZJ) != null) {
            c11pq.onNext(Boolean.valueOf(!z));
        }
    }

    public final void LJJII(C942080acg c942080acg) {
        Object objLJJJLL;
        C957020b0m c957020b0m;
        MultiGuestSpotExtra multiGuestExtra;
        Boolean boolValueOf;
        List list = (List) this.LIZJ.LLILZIL.gg0(MultiGuestLayoutRenderV2.RoleChannel.class);
        C942090ach c942090ach = null;
        if (list != null) {
            objLJJJLL = C13LP.LJJJLL(list);
        } else {
            objLJJJLL = null;
        }
        if (objLJJJLL == EnumC934000aPe.GUEST && C932490aND.LIZ(false)) {
            Iterator<C942090ach> it2 = c942080acg.LIZIZ.LIZLLL.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C942090ach next = it2.next();
                C957020b0m c957020b0m2 = next.LIZ;
                if (c957020b0m2 != null) {
                    boolValueOf = Boolean.valueOf(c957020b0m2.LLJILJIL);
                } else {
                    boolValueOf = null;
                }
                if (C500260Jjc.LJJJI(boolValueOf)) {
                    c942090ach = next;
                    break;
                }
            }
            C942090ach c942090ach2 = c942090ach;
            if (c942090ach2 != null && (c957020b0m = c942090ach2.LIZ) != null && (multiGuestExtra = c957020b0m.getMultiGuestExtra()) != null) {
                C924640aAY.LIZIZ = Integer.valueOf(multiGuestExtra.spotRank);
            }
        }
    }

    public final void LJJIII(Rect rect) {
        boolean z;
        C931800aM6.LIZ.getClass();
        if (!C931800aM6.LIZIZ()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateSizeAfterFilter rect=");
        sbLIZ.append(rect);
        C937310aUz.LJII("MultiGuestLayoutRenderV2_externalLinkMicLayoutDelegate", C2188811AlT.LIZIZ(sbLIZ));
        MultiGuestLayoutRenderV2 multiGuestLayoutRenderV2 = this.LIZJ;
        ViewGroup viewGroup = multiGuestLayoutRenderV2.LLILZ;
        if (viewGroup.getWidth() == rect.width() && viewGroup.getHeight() == rect.height()) {
            z = true;
        } else {
            z = false;
        }
        int width = viewGroup.getWidth() - rect.right;
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        multiGuestLayoutRenderV2.LLILZIL.zW(AudienceVideoViewParams.class, new C0IEU(rect.width(), rect.height(), rect.top, rect.left, width, z, C927600aFK.LJIIJ(), (String) null, (InterfaceC463550IFt) null, "MultiGuestLayoutRender_updateSizeAfterFilter", false, 2944));
    }

    @Override // X.InterfaceC2181591AZp
    public final void LIZ(String str, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSingleViewModeChange isSingleView=");
        sbLIZ.append(z);
        sbLIZ.append(" source=");
        sbLIZ.append(str);
        C937310aUz.LJII("MultiGuestLayoutRenderV2_externalLinkMicLayoutDelegate", C2188811AlT.LIZIZ(sbLIZ));
        for (InterfaceC942030acb interfaceC942030acb : C13LP.LLIIII(this.LIZJ.LLILZLL.values())) {
            if (interfaceC942030acb != null) {
                interfaceC942030acb.LIZ(str, z);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009b, code lost:
    
        r20 = r12.size();
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a2, code lost:
    
        if (r11 >= r20) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a4, code lost:
    
        r19 = r11 + 1;
        r15 = r12.size();
        r10 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ac, code lost:
    
        if (r10 >= r15) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ae, code lost:
    
        r9 = (X.C957780b20) com.bytedance.mt.protector.impl.collections.ListProtector.get(r12, r11);
        r8 = (X.C957780b20) com.bytedance.mt.protector.impl.collections.ListProtector.get(r12, r10);
        r6 = r9.LIZLLL;
        r4 = r8.LIZLLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c0, code lost:
    
        if (r6 != r4) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c2, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c8, code lost:
    
        if (r0 == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ca, code lost:
    
        r2 = r8.LIZJ;
        r0 = r9.LJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d0, code lost:
    
        if (r2 <= r0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d5, code lost:
    
        if ((r2 - r0) >= 0.01d) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d7, code lost:
    
        r1 = new X.C443120HZe(r9, r8, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00dc, code lost:
    
        r2 = (X.C957780b20) r1.getFirst();
        r3 = (X.C957780b20) r1.getSecond();
        r1 = ((java.lang.Number) r1.getThird()).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f4, code lost:
    
        if (r1 == 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f7, code lost:
    
        if (r1 != 1) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f9, code lost:
    
        r4 = r3.LIZLLL;
        r2 = r2.LJFF;
        r16 = (r4 - r2) / 2.0d;
        r8 = r12.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0109, code lost:
    
        if (r8.hasNext() == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x010b, code lost:
    
        r7 = (X.C957780b20) r8.next();
        r0 = r7.LJFF;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0115, code lost:
    
        if (r0 != r2) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0117, code lost:
    
        r7.LJFF = r0 + r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x011c, code lost:
    
        r0 = r7.LIZLLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0120, code lost:
    
        if (r0 != r4) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0122, code lost:
    
        r7.LIZLLL = r0 - r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0127, code lost:
    
        r4 = r3.LIZJ;
        r2 = r2.LJ;
        r16 = (r4 - r2) / 2.0d;
        r8 = r12.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0137, code lost:
    
        if (r8.hasNext() == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0139, code lost:
    
        r7 = (X.C957780b20) r8.next();
        r0 = r7.LJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0143, code lost:
    
        if (r0 != r2) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0145, code lost:
    
        r7.LJ = r0 + r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x014a, code lost:
    
        r0 = r7.LIZJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x014e, code lost:
    
        if (r0 != r4) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0150, code lost:
    
        r7.LIZJ = r0 - r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0155, code lost:
    
        r2 = r9.LIZJ;
        r0 = r8.LJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x015b, code lost:
    
        if (r2 <= r0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0160, code lost:
    
        if ((r2 - r0) >= 0.01d) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0162, code lost:
    
        r1 = new X.C443120HZe(r8, r9, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x016f, code lost:
    
        if (r9.LIZJ != r8.LIZJ) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0171, code lost:
    
        r0 = r9.LJFF;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0175, code lost:
    
        if (r4 <= r0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x017a, code lost:
    
        if ((r4 - r0) >= 0.01d) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x017c, code lost:
    
        r1 = new X.C443120HZe(r9, r8, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0185, code lost:
    
        r0 = r8.LJFF;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0189, code lost:
    
        if (r6 <= r0) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x018e, code lost:
    
        if ((r6 - r0) >= 0.01d) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0190, code lost:
    
        r1 = new X.C443120HZe(r8, r9, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0199, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x019d, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a0, code lost:
    
        r11 = r19;
     */
    @Override // X.InterfaceC2181591AZp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C955310ay1 LJI(X.C955310ay1 r23, X.C955230axt r24) {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C942000acY.LJI(X.0ay1, X.0axt):X.0ay1");
    }

    @Override // X.InterfaceC2181591AZp
    public final void LJIIIIZZ(List<C957020b0m> list, C955230axt c955230axt) {
        InterfaceC940760aaY interfaceC940760aaY;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onOnlyWindowExtraChanged linkMicWindowView=");
        sbLIZ.append(list);
        C937310aUz.LJII("MultiGuestLayoutRenderV2_externalLinkMicLayoutDelegate", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC923120a86 interfaceC923120a86LIZ = C940770aaZ.LIZ();
        if ((interfaceC923120a86LIZ instanceof InterfaceC940760aaY) && (interfaceC940760aaY = (InterfaceC940760aaY) interfaceC923120a86LIZ) != null) {
            interfaceC940760aaY.LJJIII(list);
        }
    }

    @Override // X.InterfaceC2181591AZp
    public final void LJIIL(C942080acg c942080acg, C955230axt c955230axt) {
        List<C942090ach> list;
        C942090ach c942090ach;
        C957020b0m c957020b0m;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        int i;
        InterfaceC940760aaY interfaceC940760aaY;
        String str;
        InterfaceC940060aZQ interfaceC940060aZQ;
        Rect rectLJJIIJZLJL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLayoutPipelineEndSuccess renderResult=");
        sbLIZ.append(C937310aUz.LJIIIIZZ(c942080acg.LIZ));
        sbLIZ.append(", new=");
        sbLIZ.append(c942080acg.LIZIZ.LIZJ.size());
        sbLIZ.append(", update=");
        sbLIZ.append(c942080acg.LIZIZ.LIZLLL.size());
        C937310aUz.LJII("MultiGuestLayoutRenderV2_externalLinkMicLayoutDelegate", C2188811AlT.LIZIZ(sbLIZ));
        Context context = null;
        try {
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL != null) {
                interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL();
            } else {
                interfaceC937900aVwLLIIJLIL = null;
            }
            if ((interfaceC937900aVwLLIIJLIL instanceof InterfaceC940060aZQ) && (interfaceC940060aZQ = (InterfaceC940060aZQ) interfaceC937900aVwLLIIJLIL) != null && (rectLJJIIJZLJL = interfaceC940060aZQ.LJJIIJZLJL()) != null) {
                LJJIII(rectLJJIIJZLJL);
            }
            this.LIZJ.LLJ.LJIILJJIL(c942080acg);
            C415901jZ c415901jZ = this.LIZJ.LLJILLL;
            if (c415901jZ != null) {
                c415901jZ.LIZJ = System.currentTimeMillis();
            }
            Iterator<Map.Entry<String, C938230aWT>> it2 = this.LIZJ.LLJ.LLJJ.entrySet().iterator();
            while (true) {
                i = 0;
                if (!it2.hasNext()) {
                    break;
                }
                String key = it2.next().getKey();
                List<C957020b0m> list2 = c942080acg.LIZ.LIZLLL;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<C957020b0m> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        PosIdentity posIdentity = it3.next().getPosIdentity();
                        if (posIdentity != null && posIdentity.type == 1) {
                            str = posIdentity.value;
                        } else {
                            str = null;
                        }
                        if (Intrinsics.LJFF(str, key)) {
                            break;
                        }
                    }
                }
                it2.remove();
            }
            int size = c942080acg.LIZIZ.LIZJ.size() + c942080acg.LIZIZ.LIZLLL.size();
            List<C957020b0m> list3 = c942080acg.LIZIZ.LIZJ;
            MultiGuestLayoutRenderV2 multiGuestLayoutRenderV2 = this.LIZJ;
            Iterator<C957020b0m> it4 = list3.iterator();
            while (it4.hasNext()) {
                multiGuestLayoutRenderV2.LJIIJ(it4.next());
                i++;
                multiGuestLayoutRenderV2.LJIJI(i, size);
            }
            List<C942090ach> list4 = c942080acg.LIZIZ.LIZLLL;
            MultiGuestLayoutRenderV2 multiGuestLayoutRenderV22 = this.LIZJ;
            Iterator<C942090ach> it5 = list4.iterator();
            while (it5.hasNext()) {
                C957020b0m c957020b0m2 = it5.next().LIZ;
                if (c957020b0m2 != null) {
                    multiGuestLayoutRenderV22.LJIIJ(c957020b0m2);
                    i++;
                    multiGuestLayoutRenderV22.LJIJI(i, size);
                }
            }
            this.LIZJ.LLILZIL.LC0(MultiGuestLayoutRenderV2.SwitchLayoutEvent.class, Unit.LIZ);
            LJJII(c942080acg);
            InterfaceC923120a86 interfaceC923120a86LIZ = C940770aaZ.LIZ();
            if ((interfaceC923120a86LIZ instanceof InterfaceC940760aaY) && (interfaceC940760aaY = (InterfaceC940760aaY) interfaceC923120a86LIZ) != null) {
                interfaceC940760aaY.LJJIIJZLJL(c942080acg);
            }
            C415901jZ c415901jZ2 = this.LIZJ.LLJILLL;
            if (c415901jZ2 != null) {
                String strLIZ = C940770aaZ.LIZ().getDataSource().LIZ();
                if (c415901jZ2.LIZ != 0) {
                    c415901jZ2.LJ = System.currentTimeMillis() - c415901jZ2.LIZJ;
                    if (c415901jZ2.LIZLLL != 0) {
                        c415901jZ2.LIZLLL(strLIZ);
                    }
                }
            }
            for (InterfaceC942030acb interfaceC942030acb : C13LP.LLIIII(this.LIZJ.LLILZLL.values())) {
                if (interfaceC942030acb != null) {
                    interfaceC942030acb.LJIL(c942080acg);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onLayoutPipelineEndSuccess exception=");
            sbLIZ2.append(e.getMessage());
            sbLIZ2.append(" context:");
            C947460alM c947460alM = c942080acg.LIZIZ;
            if (c947460alM != null && (list = c947460alM.LIZLLL) != null && (c942090ach = (C942090ach) C13LP.LJJJLL(list)) != null && (c957020b0m = c942090ach.LIZ) != null) {
                context = c957020b0m.getContext();
            }
            sbLIZ2.append(context);
            C937310aUz.LJFF("MultiGuestLayoutRenderV2_externalLinkMicLayoutDelegate", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    @Override // X.InterfaceC2181591AZp
    public final void LJIILJJIL(String str, C955230axt c955230axt) {
        InterfaceC940760aaY interfaceC940760aaY;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLayoutWillBegin layoutKey=");
        sbLIZ.append(str);
        C937310aUz.LJII("MultiGuestLayoutRenderV2_externalLinkMicLayoutDelegate", C2188811AlT.LIZIZ(sbLIZ));
        if (MultiGuestSharedBgFixForLRSetting.INSTANCE.isEnable()) {
            this.LIZJ.LLILZIL.FQ2(MultiGuestV3ShowEmptyViewEvent.class);
        }
        InterfaceC923120a86 interfaceC923120a86LIZ = C940770aaZ.LIZ();
        if ((interfaceC923120a86LIZ instanceof InterfaceC940760aaY) && (interfaceC940760aaY = (InterfaceC940760aaY) interfaceC923120a86LIZ) != null) {
            interfaceC940760aaY.LJJII(str);
        }
    }

    @Override // X.InterfaceC2181591AZp
    public final void LJIILL(String str, C955230axt c955230axt) {
        InterfaceC940760aaY interfaceC940760aaY;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLayoutDidBegin layoutKey=");
        sbLIZ.append(str);
        C937310aUz.LJII("MultiGuestLayoutRenderV2_externalLinkMicLayoutDelegate", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC923120a86 interfaceC923120a86LIZ = C940770aaZ.LIZ();
        if ((interfaceC923120a86LIZ instanceof InterfaceC940760aaY) && (interfaceC940760aaY = (InterfaceC940760aaY) interfaceC923120a86LIZ) != null) {
            interfaceC940760aaY.LJJIJIIJIL(str);
        }
    }

    @Override // X.InterfaceC2181591AZp
    public final void LJIIZILJ(String str, C955230axt c955230axt) {
        InterfaceC940760aaY interfaceC940760aaY;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLayoutWillEnd layoutKey=");
        sbLIZ.append(str);
        C937310aUz.LJII("MultiGuestLayoutRenderV2_externalLinkMicLayoutDelegate", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC923120a86 interfaceC923120a86LIZ = C940770aaZ.LIZ();
        if ((interfaceC923120a86LIZ instanceof InterfaceC940760aaY) && (interfaceC940760aaY = (InterfaceC940760aaY) interfaceC923120a86LIZ) != null) {
            interfaceC940760aaY.LJJI(str);
        }
    }

    @Override // X.InterfaceC2181591AZp
    public final void LJIJ(String str, C955230axt c955230axt) {
        InterfaceC940760aaY interfaceC940760aaY;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLayoutDidEnd layoutKey=");
        sbLIZ.append(str);
        C937310aUz.LJII("MultiGuestLayoutRenderV2_externalLinkMicLayoutDelegate", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZJ.LLILZIL.FQ2(MultiGuestLayoutRenderV2.LayoutEndEvent.class);
        InterfaceC923120a86 interfaceC923120a86LIZ = C940770aaZ.LIZ();
        if ((interfaceC923120a86LIZ instanceof InterfaceC940760aaY) && (interfaceC940760aaY = (InterfaceC940760aaY) interfaceC923120a86LIZ) != null) {
            interfaceC940760aaY.LJJIJ(str);
        }
        for (InterfaceC942030acb interfaceC942030acb : C13LP.LLIIII(this.LIZJ.LLILZLL.values())) {
            if (interfaceC942030acb != null) {
                interfaceC942030acb.LJI();
            }
        }
    }

    @Override // X.InterfaceC2181591AZp
    public final void LJ(int i, String str, C955230axt c955230axt) {
        InterfaceC940760aaY interfaceC940760aaY;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLayoutError errorCode=");
        sbLIZ.append(i);
        sbLIZ.append(" msg=");
        sbLIZ.append(str);
        C937310aUz.LJFF("MultiGuestLayoutRenderV2_externalLinkMicLayoutDelegate", C2188811AlT.LIZIZ(sbLIZ));
        C1304660k3U c1304660k3U = C1304660k3U.LIZ;
        int iLIZ = C942130acl.LIZ(i);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onLayoutError errorCode: ");
        sbLIZ2.append(i);
        sbLIZ2.append(", errMsg: ");
        sbLIZ2.append(str);
        c1304660k3U.LIZIZ(iLIZ, str, new Throwable(C2188811AlT.LIZIZ(sbLIZ2)), null);
        InterfaceC923120a86 interfaceC923120a86LIZ = C940770aaZ.LIZ();
        if ((interfaceC923120a86LIZ instanceof InterfaceC940760aaY) && (interfaceC940760aaY = (InterfaceC940760aaY) interfaceC923120a86LIZ) != null) {
            interfaceC940760aaY.LJFF(i, str);
        }
    }

    @Override // X.InterfaceC2181591AZp
    public final void LJIILIIL(EnumC965730bEp enumC965730bEp, EnumC965730bEp enumC965730bEp2, C955230axt c955230axt) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLayoutArchDidChanged new=");
        sbLIZ.append(enumC965730bEp2);
        sbLIZ.append(" old=");
        sbLIZ.append(enumC965730bEp);
        sbLIZ.append(" source=");
        sbLIZ.append(c955230axt);
        C20441214yg.LIZIZ("MultiGuestLayoutRenderV2_externalLinkMicLayoutDelegate", C2188811AlT.LIZIZ(sbLIZ));
        MultiGuestLayoutRenderV2 multiGuestLayoutRenderV2 = this.LIZJ;
        InterfaceC941510abl interfaceC941510abl = multiGuestLayoutRenderV2.LLIZ;
        if (interfaceC941510abl != null) {
            if (enumC965730bEp2 == EnumC965730bEp.INNER) {
                interfaceC941510abl.LIZ(multiGuestLayoutRenderV2.LLILZLL);
            } else {
                if (enumC965730bEp2 != EnumC965730bEp.CROSS) {
                    return;
                }
                interfaceC941510abl.LIZIZ(multiGuestLayoutRenderV2.LLILZLL);
            }
        }
    }

    @Override // X.InterfaceC2181591AZp
    public final Rect LJIJI(C957020b0m c957020b0m, Rect rect, C955230axt c955230axt) {
        Rect rectLJIILL;
        InterfaceC942100aci interfaceC942100aci = this.LIZJ.LLJIJIL;
        if (interfaceC942100aci != null && (rectLJIILL = interfaceC942100aci.LJIILL(c957020b0m, rect)) != null) {
            return rectLJIILL;
        }
        return rect;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00e1  */
    @Override // X.InterfaceC2181591AZp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ(X.EnumC965730bEp r11, X.EnumC965730bEp r12, X.C955230axt r13) {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C942000acY.LJIJJ(X.0bEp, X.0bEp, X.0axt):void");
    }

    @Override // X.InterfaceC2181591AZp
    public final void LIZIZ(EnumC965730bEp enumC965730bEp, C1283230jUv c1283230jUv, boolean z, boolean z2) {
        C0C27.LIZ(new AwS0S0320000_15(c1283230jUv, enumC965730bEp, z, z2, this.LIZJ, 1));
    }

    @Override // X.InterfaceC2181591AZp
    public final void LJFF(EnumC965730bEp enumC965730bEp, C1283230jUv c1283230jUv, EnumC942070acf enumC942070acf, EnumC942070acf enumC942070acf2) {
        C0C27.LIZ(new AwS21S0600000_15(c1283230jUv, enumC965730bEp, enumC942070acf, enumC942070acf2, this, this.LIZJ, 0));
    }

    @Override // X.InterfaceC2181591AZp
    public final void LJII(C955320ay2 c955320ay2, List<C957030b0n> list, MultiGuestLayoutExtra multiGuestLayoutExtra, C955230axt c955230axt) {
        InterfaceC940760aaY interfaceC940760aaY;
        LayoutState layoutState = new LayoutState();
        layoutState.layoutId = c955320ay2.LIZ;
        layoutState.layoutKey = c955320ay2.LIZIZ;
        layoutState.multiGuestLayoutExtra = c955320ay2.LIZJ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C957030b0n c957030b0n : (ArrayList) list) {
            SpotInfo spotInfo = new SpotInfo();
            spotInfo.spotId = (int) c957030b0n.LIZ;
            spotInfo.posIdentity = c957030b0n.LIZIZ;
            spotInfo.multiGuestSpotExtra = c957030b0n.LIZJ;
            arrayList.add(spotInfo);
        }
        InterfaceC923120a86 interfaceC923120a86LIZ = C940770aaZ.LIZ();
        if ((interfaceC923120a86LIZ instanceof InterfaceC940760aaY) && (interfaceC940760aaY = (InterfaceC940760aaY) interfaceC923120a86LIZ) != null) {
            interfaceC940760aaY.LJIJI(layoutState, arrayList, multiGuestLayoutExtra);
        }
    }

    @Override // X.InterfaceC2181591AZp
    public final void LJIIIZ(EnumC965730bEp enumC965730bEp, C1283230jUv c1283230jUv, boolean z, boolean z2) {
        C0C27.LIZ(new AwS0S0320000_15(this, enumC965730bEp, c1283230jUv, z, z2, this.LIZJ, 0));
    }

    @Override // X.InterfaceC2181591AZp
    public final void LJIL(EnumC965730bEp enumC965730bEp, C1283230jUv c1283230jUv, EnumC1286590jaL enumC1286590jaL, EnumC1286590jaL enumC1286590jaL2) {
        C0C27.LIZ(new AwS76S0500000_15(this, enumC965730bEp, c1283230jUv, enumC1286590jaL, enumC1286590jaL2, this.LIZJ, 1));
    }

    @Override // X.InterfaceC2181591AZp
    public final void LJJI(EnumC965730bEp enumC965730bEp, C1283230jUv c1283230jUv, EnumC943640afC enumC943640afC, EnumC943640afC enumC943640afC2) {
        C0C27.LIZ(new AwS21S0600000_15(this, enumC965730bEp, c1283230jUv, enumC943640afC, enumC943640afC2, this.LIZJ, 1));
    }
}
