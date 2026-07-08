package X;

import Y.ARunnableS85S0200000_16;
import android.content.Context;
import android.view.KeyEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.model.HintsConfig;
import com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselInfoStruct;
import com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselProductStruct;
import com.ss.android.ugc.aweme.feed.model.BotConfig;
import com.ss.android.ugc.aweme.model.AnoleAiAgentData;
import com.ss.android.ugc.aweme.model.ProgressHint;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cgB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1021130cgB extends AbstractC1014240cV4 {
    public final AnoleAiAgentData LLJLIL;
    public AbstractC1021230cgL LLJLILLLLZIIL;
    public int LLJLL;

    @Override // X.AbstractC1014240cV4
    public final boolean LJIILIIL() {
        return false;
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void LJFF() {
        AbstractC1021230cgL abstractC1021230cgL = this.LLJLILLLLZIIL;
        if (abstractC1021230cgL != null) {
            C622680Oba.LIZLLL(abstractC1021230cgL.LL);
            abstractC1021230cgL.LL = null;
        }
    }

    public final PhotoCarouselProductStruct LJJI() {
        PhotoCarouselInfoStruct photoCarouselInfoStruct;
        List<PhotoCarouselProductStruct> productList;
        AnoleAiAgentData anoleAiAgentData = this.LLJLIL;
        if (anoleAiAgentData == null || (photoCarouselInfoStruct = anoleAiAgentData.photoCarouselInfo) == null || (productList = photoCarouselInfoStruct.getProductList()) == null) {
            return null;
        }
        return (PhotoCarouselProductStruct) C13LP.LJJJLZIJ(this.LLJLL, productList);
    }

    public final ProgressHint LJJIFFI() {
        List<ProgressHint> list;
        AnoleAiAgentData anoleAiAgentData = this.LLJLIL;
        if (anoleAiAgentData == null || (list = anoleAiAgentData.dynamicHints) == null) {
            return null;
        }
        return (ProgressHint) C13LP.LJJJLZIJ(0, list);
    }

    public final boolean LJJII() {
        AnoleAiAgentData anoleAiAgentData = this.LLJLIL;
        return (anoleAiAgentData == null || anoleAiAgentData.photoCarouselInfo == null) ? false : true;
    }

    @Override // X.AbstractC1014240cV4
    public final void LJIJI() {
        InterfaceC1021180cgG interfaceC1021180cgG;
        InterfaceC1021180cgG interfaceC1021180cgG2;
        PhotoCarouselInfoStruct photoCarouselInfoStruct;
        Integer dynamicCarouselFirstIndex;
        super.LJIJI();
        AbstractC1021230cgL abstractC1021230cgL = this.LLJLILLLLZIIL;
        if (abstractC1021230cgL != null) {
            C622680Oba.LIZLLL(abstractC1021230cgL.LL);
            abstractC1021230cgL.LL = null;
        }
        if (LJJII()) {
            AnoleAiAgentData anoleAiAgentData = this.LLJLIL;
            this.LLJLL = (anoleAiAgentData == null || (photoCarouselInfoStruct = anoleAiAgentData.photoCarouselInfo) == null || (dynamicCarouselFirstIndex = photoCarouselInfoStruct.getDynamicCarouselFirstIndex()) == null) ? 0 : dynamicCarouselFirstIndex.intValue();
            KeyEvent.Callback callback = this.LLJJIJIL;
            if ((callback instanceof InterfaceC1021180cgG) && (interfaceC1021180cgG2 = (InterfaceC1021180cgG) callback) != null) {
                PhotoCarouselProductStruct photoCarouselProductStructLJJI = LJJI();
                interfaceC1021180cgG2.LIZ(photoCarouselProductStructLJJI != null ? photoCarouselProductStructLJJI.getHintsConfig() : null);
            }
        }
        ProgressHint progressHintLJJIFFI = LJJIFFI();
        if (progressHintLJJIFFI != null) {
            KeyEvent.Callback callback2 = this.LLJJIJIL;
            if (!(callback2 instanceof InterfaceC1021180cgG) || (interfaceC1021180cgG = (InterfaceC1021180cgG) callback2) == null) {
                return;
            }
            interfaceC1021180cgG.LIZ(new HintsConfig(progressHintLJJIFFI.title, progressHintLJJIFFI.longHint, progressHintLJJIFFI.shortHints));
        }
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final C1014500cVU isReady() {
        BotConfig botConfig;
        PhotoCarouselProductStruct photoCarouselProductStructLJJI = LJJI();
        if (!LJJII() || C1020940cfs.LIZ(photoCarouselProductStructLJJI)) {
            return new C1014500cVU(true, "");
        }
        return new C1014500cVU(false, (photoCarouselProductStructLJJI != null ? photoCarouselProductStructLJJI.getHintsConfig() : null) == null ? "hints are missing." : (photoCarouselProductStructLJJI == null || (botConfig = photoCarouselProductStructLJJI.getBotConfig()) == null || !Intrinsics.LJFF(botConfig.aiBotEnable, Boolean.TRUE)) ? "disable aibot" : "unknown reason");
    }

    @Override // X.AbstractC1014240cV4
    public final void LJII(AnoleComponentAppearModel anoleComponentAppearModel) {
        InterfaceC1021180cgG interfaceC1021180cgG;
        super.LJII(anoleComponentAppearModel);
        LJIIJ().logAd(C2273801DzG.LIZ, new AwS595S0100000_16(this, 454));
        KeyEvent.Callback callback = this.LLJJIJIL;
        if ((callback instanceof InterfaceC1021180cgG) && (interfaceC1021180cgG = (InterfaceC1021180cgG) callback) != null) {
            interfaceC1021180cgG.LIZIZ(LJIIJ(), new AwS595S0100000_16(this, 455));
        }
    }

    public final void LJJ(ProgressHint progressHint) {
        InterfaceC1021180cgG interfaceC1021180cgG;
        if (C691740RBk.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("changeAgentHints: startSecond -> ");
            sbLIZ.append(progressHint.startMillisecond);
            sbLIZ.append(", title -> ");
            sbLIZ.append(progressHint.title);
            sbLIZ.append(", shortHints -> ");
            sbLIZ.append(progressHint.shortHints);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        KeyEvent.Callback callback = this.LLJJIJIL;
        if ((callback instanceof InterfaceC1021180cgG) && (interfaceC1021180cgG = (InterfaceC1021180cgG) callback) != null) {
            interfaceC1021180cgG.LIZ(new HintsConfig(progressHint.title, progressHint.longHint, progressHint.shortHints));
            interfaceC1021180cgG.LIZIZ(LJIIJ(), new AwS595S0100000_16(progressHint, 453));
        }
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Mk(AbstractC1003980cEW abstractC1003980cEW) {
        ProgressHint progressHintLJJIFFI;
        List<ProgressHint> list;
        int iOptInt;
        PhotoCarouselProductStruct photoCarouselProductStruct;
        InterfaceC1021180cgG interfaceC1021180cgG;
        InterfaceC1021180cgG interfaceC1021180cgG2;
        PhotoCarouselInfoStruct photoCarouselInfoStruct;
        List<PhotoCarouselProductStruct> productList;
        if (abstractC1003980cEW instanceof C991240bty) {
            JSONObject jSONObject = ((C991240bty) abstractC1003980cEW).LIZ;
            if (LJJII() && Intrinsics.LJFF(jSONObject.optString("event"), "productSelected") && (iOptInt = jSONObject.optInt("productIndex", -1)) != this.LLJLL) {
                this.LLJLL = iOptInt;
                AnoleAiAgentData anoleAiAgentData = this.LLJLIL;
                HintsConfig hintsConfig = null;
                if (anoleAiAgentData != null && (photoCarouselInfoStruct = anoleAiAgentData.photoCarouselInfo) != null && (productList = photoCarouselInfoStruct.getProductList()) != null) {
                    photoCarouselProductStruct = (PhotoCarouselProductStruct) C13LP.LJJJLZIJ(iOptInt, productList);
                } else {
                    photoCarouselProductStruct = null;
                }
                if (C1020940cfs.LIZ(photoCarouselProductStruct)) {
                    AbstractC1021230cgL abstractC1021230cgL = this.LLJLILLLLZIIL;
                    if (abstractC1021230cgL != null) {
                        abstractC1021230cgL.jJ2(iOptInt);
                    }
                    KeyEvent.Callback callback = this.LLJJIJIL;
                    if ((callback instanceof InterfaceC1021180cgG) && (interfaceC1021180cgG2 = (InterfaceC1021180cgG) callback) != null) {
                        if (photoCarouselProductStruct != null) {
                            hintsConfig = photoCarouselProductStruct.getHintsConfig();
                        }
                        interfaceC1021180cgG2.LIZ(hintsConfig);
                        if (this.LLILZIL) {
                            interfaceC1021180cgG2.LIZIZ(LJIIJ(), new AwS595S0100000_16(this, 456));
                            return;
                        } else {
                            this.LLILLL.LJIJ(new C989780brc(this.LL.type), this);
                            return;
                        }
                    }
                    return;
                }
                KeyEvent.Callback callback2 = this.LLJJIJIL;
                if (!(callback2 instanceof InterfaceC1021180cgG) || (interfaceC1021180cgG = (InterfaceC1021180cgG) callback2) == null) {
                    return;
                }
                if (photoCarouselProductStruct != null) {
                    hintsConfig = photoCarouselProductStruct.getHintsConfig();
                }
                interfaceC1021180cgG.LIZ(hintsConfig);
                if (!this.LLILZIL) {
                    return;
                }
                this.LLILLL.LJIJ(new C991660bue(this.LL.type), this);
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(abstractC1003980cEW, C1005130cGN.LIZ)) {
            AnoleAiAgentData anoleAiAgentData2 = this.LLJLIL;
            if (anoleAiAgentData2 == null || (list = anoleAiAgentData2.dynamicHints) == null) {
                return;
            }
            for (ProgressHint progressHint : list) {
                int i = progressHint.startMillisecond;
                if (i > 0) {
                    InterfaceC1014270cV7 interfaceC1014270cV7 = this.LLILLL;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(this.LL.type);
                    sbLIZ.append('-');
                    sbLIZ.append(progressHint.startMillisecond);
                    sbLIZ.append("-hints-change");
                    interfaceC1014270cV7.a3(C2188811AlT.LIZIZ(sbLIZ), new ARunnableS85S0200000_16(this, progressHint, 77), i);
                }
            }
            return;
        }
        if (!Intrinsics.LJFF(abstractC1003980cEW, C1003230cDJ.LIZ) || (progressHintLJJIFFI = LJJIFFI()) == null) {
            return;
        }
        LJJ(progressHintLJJIFFI);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d3  */
    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Fk(android.view.ViewGroup r15, X.InterfaceC1014340cVE r16) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1021130cgB.Fk(android.view.ViewGroup, X.0cVE):void");
    }

    public C1021130cgB(AnoleComponentModel anoleComponentModel, C1009340cNA c1009340cNA, InterfaceC1014270cV7 interfaceC1014270cV7, Context context) {
        Object c098200Yq;
        int iIntValue;
        PhotoCarouselInfoStruct photoCarouselInfoStruct;
        Integer dynamicCarouselLastIndex;
        super(anoleComponentModel, c1009340cNA, interfaceC1014270cV7, context);
        try {
            C1227904rF c1227904rF = C1227904rF.LIZ;
            Map<String, ? extends Object> map = anoleComponentModel.data;
            c1227904rF.getClass();
            c098200Yq = (AnoleAiAgentData) C1227904rF.LIZIZ(C1227904rF.LJI(map), AnoleAiAgentData.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(anoleComponentModel.type);
            sbLIZ.append(": parse success");
            C2188811AlT.LIZIZ(sbLIZ);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(anoleComponentModel.type);
            sbLIZ2.append(": parse failed, reason = ");
            sbLIZ2.append(thM5exceptionOrNullimpl.getMessage());
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        AnoleAiAgentData anoleAiAgentData = (AnoleAiAgentData) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
        this.LLJLIL = anoleAiAgentData;
        if (anoleAiAgentData != null && (photoCarouselInfoStruct = anoleAiAgentData.photoCarouselInfo) != null && (dynamicCarouselLastIndex = photoCarouselInfoStruct.getDynamicCarouselLastIndex()) != null) {
            iIntValue = dynamicCarouselLastIndex.intValue();
        } else {
            iIntValue = 0;
        }
        this.LLJLL = iIntValue;
    }
}
