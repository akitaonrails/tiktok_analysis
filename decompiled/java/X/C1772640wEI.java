package X;

import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.ecommerce.mixmall.container.ECMMKViewModel;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0wEI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1772640wEI implements InterfaceC1773090wF1 {
    public final /* synthetic */ ECMMKViewModel LIZ;

    public C1772640wEI(ECMMKViewModel eCMMKViewModel) {
        this.LIZ = eCMMKViewModel;
    }

    @Override // X.InterfaceC1773090wF1
    public final void LIZ(C1772730wER c1772730wER) {
        boolean z;
        C1772620wEG c1772620wEG;
        AbstractC1772290wDj abstractC1772290wDj = (AbstractC1772290wDj) this.LIZ.LLJJIII.getValue();
        C599820Nfo.LIZ.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ECMMKViewModel onLoadRequiredOver, type=");
        sbLIZ.append(c1772730wER.LIZ);
        sbLIZ.append(", pageState ");
        sbLIZ.append(abstractC1772290wDj.LIZ);
        sbLIZ.append(", strategy=");
        sbLIZ.append(this.LIZ.LLJILJILJ.getValue());
        C599820Nfo.LIZ("ec_mmk_online_render_opt", C2188811AlT.LIZIZ(sbLIZ));
        if (c1772730wER.LIZ == EnumC1772960wEo.OTHER) {
            this.LIZ.vQ2(C1772400wDu.LIZIZ);
            return;
        }
        if (abstractC1772290wDj.LIZ()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(c1772730wER.LIZ);
            sbLIZ2.append(" ignore this onLoadRequiredOver because pageState is ");
            sbLIZ2.append(abstractC1772290wDj.LIZ);
            C599820Nfo.LIZ("ec_mmk_online_render_opt", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        EnumC1772960wEo enumC1772960wEo = c1772730wER.LIZ;
        EnumC1772960wEo enumC1772960wEo2 = EnumC1772960wEo.CACHE;
        if (enumC1772960wEo == enumC1772960wEo2) {
            this.LIZ.vQ2(C1772440wDy.LIZIZ);
            Integer num = (Integer) this.LIZ.LLJILJILJ.getValue();
            if (num != null && num.intValue() == 2) {
                z = true;
            } else {
                z = false;
            }
            LJ(z);
            ECMMKViewModel eCMMKViewModel = this.LIZ;
            C1772030wDJ c1772030wDJ = eCMMKViewModel.LL;
            if (c1772030wDJ != null && c1772030wDJ.LJII && (c1772620wEG = eCMMKViewModel.LLILLJJLI) != null) {
                c1772620wEG.LJFF(enumC1772960wEo2);
                return;
            }
            return;
        }
        this.LIZ.vQ2(C1772450wDz.LIZIZ);
        C1772620wEG c1772620wEG2 = this.LIZ.LLILLJJLI;
        if (c1772620wEG2 == null) {
            return;
        }
        c1772620wEG2.LJFF(EnumC1772960wEo.FETCH);
    }

    @Override // X.InterfaceC1773090wF1
    public final void LIZIZ(C1772730wER c1772730wER) {
        AbstractC1772290wDj abstractC1772290wDj = (AbstractC1772290wDj) this.LIZ.LLJJIII.getValue();
        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c1772730wER.LIZ);
        sbLIZ.append(" onLoadRequiredError: pageState ");
        sbLIZ.append(abstractC1772290wDj.LIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c599820Nfo.getClass();
        C599820Nfo.LIZ("wyxxxxxxx", strLIZIZ);
        if (c1772730wER.LIZ == EnumC1772960wEo.OTHER) {
            this.LIZ.vQ2(new C1772300wDk(EnumC863080XtS.CARD_RENDER_ERROR));
            return;
        }
        if (abstractC1772290wDj.LIZ()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(c1772730wER.LIZ);
            sbLIZ2.append(" ignore this onLoadRequiredError because pageState is ");
            sbLIZ2.append(abstractC1772290wDj.LIZ);
            C599820Nfo.LIZ("wyxxxxxxx", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        if (c1772730wER.LIZ == EnumC1772960wEo.CACHE) {
            ECMMKViewModel eCMMKViewModel = this.LIZ;
            C1772030wDJ c1772030wDJ = eCMMKViewModel.LL;
            boolean z = true;
            if (c1772030wDJ != null && c1772030wDJ.LJII) {
                eCMMKViewModel.vQ2(new C1772300wDk(EnumC863080XtS.CARD_RENDER_ERROR));
                return;
            }
            C599820Nfo.LIZ("wyxxxxxxx", "Cache ignored, waiting for network result");
            Integer num = (Integer) this.LIZ.LLJILJILJ.getValue();
            if (num == null || num.intValue() != 2) {
                z = false;
            }
            LJ(z);
            return;
        }
        this.LIZ.vQ2(new C1772300wDk(EnumC863080XtS.CARD_RENDER_ERROR));
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this.LIZ), null, null, new C862980XtI(this.LIZ, null), 3);
    }

    @Override // X.InterfaceC1773090wF1
    public final void LIZJ(EnumC1772960wEo enumC1772960wEo) {
        if (enumC1772960wEo == EnumC1772960wEo.FETCH) {
            C599820Nfo.LIZ.getClass();
            C599820Nfo.LIZ("requestChunk", "notifyPageRenderOver");
            C1772030wDJ c1772030wDJ = this.LIZ.LL;
            if (c1772030wDJ != null) {
                c1772030wDJ.LIZ.LJII.LIZLLL();
            }
        }
    }

    public final void LJ(boolean z) {
        C1772750wET c1772750wET;
        if (z) {
            C1772140wDU c1772140wDU = this.LIZ.LLJILLL;
            if (c1772140wDU != null) {
                ECMMKViewModel eCMMKViewModel = this.LIZ;
                C599820Nfo.LIZ.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("handleMergeRender, strategy => ");
                sbLIZ.append(eCMMKViewModel.LLJILJILJ.getValue());
                C2188811AlT.LIZIZ(sbLIZ);
                C599820Nfo.LIZLLL();
                C1772740wES c1772740wES = (C1772740wES) ((LinkedHashMap) eCMMKViewModel.LLIZLLLIL).get("CACHE");
                if (c1772740wES != null && (c1772750wET = c1772740wES.LIZIZ) != null) {
                    c1772750wET.LJZL = true;
                }
                eCMMKViewModel.Qb2(c1772140wDU);
            }
            this.LIZ.LLJILLL = null;
        }
    }

    public final void LJFF(C1772730wER c1772730wER) {
        C1772740wES c1772740wES;
        EnumC1772960wEo enumC1772960wEo;
        List<InterfaceC1774020wGW> listLJI;
        if (c1772730wER.LIZ == EnumC1772960wEo.FETCH && (c1772740wES = (C1772740wES) ((LinkedHashMap) this.LIZ.LLIZLLLIL).get("CACHE")) != null) {
            C599820Nfo c599820Nfo = C599820Nfo.LIZ;
            c599820Nfo.getClass();
            C599820Nfo.LIZ("ECMMKPageTrace", "cancel");
            c599820Nfo.getClass();
            C599820Nfo.LIZ("ECMMKPageTrace", "unregister");
            InterfaceC1773310wFN interfaceC1773310wFN = c1772740wES.LIZ;
            if (interfaceC1773310wFN != null && (listLJI = interfaceC1773310wFN.LJI()) != null) {
                listLJI.remove(c1772740wES);
            }
            c1772740wES.LJIIJJI.removeCallbacks(c1772740wES.LJIILIIL);
            C1772730wER c1772730wER2 = c1772740wES.LIZLLL;
            if (c1772730wER2 != null) {
                enumC1772960wEo = c1772730wER2.LIZ;
            } else {
                enumC1772960wEo = null;
            }
            if (enumC1772960wEo == EnumC1772960wEo.CACHE && c1772740wES.LIZIZ.LJIILIIL < 0) {
                c1772740wES.LIZIZ.LJIJ = true;
                c1772740wES.LJIIIIZZ(false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    @Override // X.InterfaceC1773090wF1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(X.EnumC1772960wEo r3, boolean r4) {
        /*
            r2 = this;
            X.0Nfo r0 = X.C599820Nfo.LIZ
            r0.getClass()
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "ECMMKViewModel onPageRenderOver, type="
            r1.append(r0)
            r1.append(r3)
            X.C2188811AlT.LIZIZ(r1)
            X.C599820Nfo.LIZLLL()
            X.0wEo r0 = X.EnumC1772960wEo.FETCH
            if (r3 != r0) goto L39
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.sparklite.card.IMMKSparkPluginService> r0 = com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.sparklite.card.IMMKSparkPluginService.class
            java.util.Set r0 = r1.getServices(r0)
            java.util.Iterator r1 = r0.iterator()
        L29:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L55
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.sparklite.card.IMMKSparkPluginService r0 = (com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.sparklite.card.IMMKSparkPluginService) r0
            r0.LIZ()
            goto L29
        L39:
            X.0wEo r0 = X.EnumC1772960wEo.CACHE
            if (r3 != r0) goto L55
            if (r4 == 0) goto L55
            com.ss.android.ugc.aweme.ecommerce.mixmall.container.ECMMKViewModel r0 = r2.LIZ
            X.01GW r0 = r0.LLJILJILJ
            java.lang.Object r0 = r0.getValue()
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L56
            int r0 = r0.intValue()
            r1 = 1
            if (r0 != r1) goto L56
        L52:
            r2.LJ(r1)
        L55:
            return
        L56:
            r1 = 0
            goto L52
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1772640wEI.LIZLLL(X.0wEo, boolean):void");
    }
}
