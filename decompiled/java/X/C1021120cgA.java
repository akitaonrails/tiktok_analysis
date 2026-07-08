package X;

import Y.ACListenerS151S0100000_16;
import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.model.HintsConfig;
import com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselInfoStruct;
import com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselProductStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.aweme.feed.model.BotConfig;
import com.ss.android.ugc.aweme.model.AnoleAiAgentData;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cgA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1021120cgA extends AbstractC1014240cV4 {
    public final AnoleAiAgentData LLJLIL;
    public AbstractC1021230cgL LLJLILLLLZIIL;
    public int LLJLL;

    @Override // X.AbstractC1014240cV4
    public final boolean LJIILIIL() {
        return false;
    }

    public final PhotoCarouselProductStruct LJJ() {
        PhotoCarouselInfoStruct photoCarouselInfoStruct;
        List<PhotoCarouselProductStruct> productList;
        AnoleAiAgentData anoleAiAgentData = this.LLJLIL;
        if (anoleAiAgentData == null || (photoCarouselInfoStruct = anoleAiAgentData.photoCarouselInfo) == null || (productList = photoCarouselInfoStruct.getProductList()) == null) {
            return null;
        }
        return (PhotoCarouselProductStruct) C13LP.LJJJLZIJ(this.LLJLL, productList);
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final C1014500cVU isReady() {
        return new C1014500cVU(true, "");
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void LJ() {
        super.LJ();
        this.LLJLILLLLZIIL = null;
    }

    @Override // X.AbstractC1014240cV4
    public final void LJIJI() {
        InterfaceC1021180cgG interfaceC1021180cgG;
        PhotoCarouselInfoStruct photoCarouselInfoStruct;
        Integer dynamicCarouselFirstIndex;
        super.LJIJI();
        AnoleAiAgentData anoleAiAgentData = this.LLJLIL;
        if (anoleAiAgentData != null) {
            int iIntValue = 0;
            if (anoleAiAgentData.photoCarouselInfo != null) {
                if (anoleAiAgentData != null && (photoCarouselInfoStruct = anoleAiAgentData.photoCarouselInfo) != null && (dynamicCarouselFirstIndex = photoCarouselInfoStruct.getDynamicCarouselFirstIndex()) != null) {
                    iIntValue = dynamicCarouselFirstIndex.intValue();
                }
                this.LLJLL = iIntValue;
                KeyEvent.Callback callback = this.LLJJIJIL;
                if (!(callback instanceof InterfaceC1021180cgG) || (interfaceC1021180cgG = (InterfaceC1021180cgG) callback) == null) {
                    return;
                }
                PhotoCarouselProductStruct photoCarouselProductStructLJJ = LJJ();
                interfaceC1021180cgG.LIZ(photoCarouselProductStructLJJ != null ? photoCarouselProductStructLJJ.getHintsConfig() : null);
            }
        }
    }

    @Override // X.AbstractC1014240cV4
    public final void LJII(AnoleComponentAppearModel anoleComponentAppearModel) {
        InterfaceC1021180cgG interfaceC1021180cgG;
        super.LJII(anoleComponentAppearModel);
        LJIIJ().logAd(C2273801DzG.LIZ);
        KeyEvent.Callback callback = this.LLJJIJIL;
        if ((callback instanceof InterfaceC1021180cgG) && (interfaceC1021180cgG = (InterfaceC1021180cgG) callback) != null) {
            interfaceC1021180cgG.LIZIZ(LJIIJ(), new AwS595S0100000_16(this, 471));
        }
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Mk(AbstractC1003980cEW abstractC1003980cEW) {
        int iOptInt;
        AnoleAiAgentData anoleAiAgentData;
        PhotoCarouselInfoStruct photoCarouselInfoStruct;
        List<PhotoCarouselProductStruct> productList;
        PhotoCarouselProductStruct photoCarouselProductStruct;
        InterfaceC1021180cgG interfaceC1021180cgG;
        if (abstractC1003980cEW instanceof C991240bty) {
            JSONObject jSONObject = ((C991240bty) abstractC1003980cEW).LIZ;
            AnoleAiAgentData anoleAiAgentData2 = this.LLJLIL;
            if (anoleAiAgentData2 != null && anoleAiAgentData2.photoCarouselInfo != null && Intrinsics.LJFF(jSONObject.optString("event"), "productSelected") && (iOptInt = jSONObject.optInt("productIndex", -1)) != this.LLJLL && (anoleAiAgentData = this.LLJLIL) != null && (photoCarouselInfoStruct = anoleAiAgentData.photoCarouselInfo) != null && (productList = photoCarouselInfoStruct.getProductList()) != null && (photoCarouselProductStruct = (PhotoCarouselProductStruct) C13LP.LJJJLZIJ(iOptInt, productList)) != null) {
                this.LLJLL = iOptInt;
                AbstractC1021230cgL abstractC1021230cgL = this.LLJLILLLLZIIL;
                if (abstractC1021230cgL != null) {
                    abstractC1021230cgL.jJ2(iOptInt);
                }
                KeyEvent.Callback callback = this.LLJJIJIL;
                if ((callback instanceof InterfaceC1021180cgG) && (interfaceC1021180cgG = (InterfaceC1021180cgG) callback) != null) {
                    interfaceC1021180cgG.LIZ(photoCarouselProductStruct.getHintsConfig());
                    if (this.LLILZIL) {
                        interfaceC1021180cgG.LIZIZ(LJIIJ(), new AwS595S0100000_16(this, 472));
                    }
                }
            }
        }
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Fk(ViewGroup viewGroup, InterfaceC1014340cVE interfaceC1014340cVE) {
        AbstractC1021230cgL c1021070cg5;
        String labelName;
        final PhotoCarouselInfoStruct photoCarouselInfoStruct;
        super.Fk(viewGroup, interfaceC1014340cVE);
        final Context context = viewGroup.getContext();
        if (context != null) {
            AnoleAiAgentData anoleAiAgentData = this.LLJLIL;
            HintsConfig hintsConfig = null;
            if (anoleAiAgentData != null && (photoCarouselInfoStruct = anoleAiAgentData.photoCarouselInfo) != null) {
                c1021070cg5 = new C1021080cg6(new InterfaceC1021100cg8(photoCarouselInfoStruct, context, this) { // from class: X.0cgF
                    public final PhotoCarouselInfoStruct LIZ;
                    public final Context LIZIZ;
                    public final Aweme LIZJ;
                    public final String LIZLLL;
                    public final /* synthetic */ C1021120cgA LJ;

                    @Override // X.InterfaceC1021290cgR
                    public final C1014660cVk getLogger() {
                        return this.LJ.LJIIJ();
                    }

                    @Override // X.InterfaceC1021290cgR
                    public final String LIZIZ() {
                        return this.LIZLLL;
                    }

                    @Override // X.InterfaceC1021100cg8
                    public final PhotoCarouselInfoStruct LIZJ() {
                        return this.LIZ;
                    }

                    @Override // X.InterfaceC1021290cgR
                    public final Aweme getAweme() {
                        return this.LIZJ;
                    }

                    @Override // X.InterfaceC1021290cgR
                    public final Context getContext() {
                        return this.LIZIZ;
                    }

                    {
                        Aweme aweme;
                        this.LJ = this;
                        this.LIZ = photoCarouselInfoStruct;
                        this.LIZIZ = context;
                        Object obj = this.LLILLJJLI.LIZJ;
                        if (obj instanceof Aweme) {
                            aweme = (Aweme) obj;
                        } else {
                            aweme = null;
                        }
                        this.LIZJ = aweme;
                        AnoleAiAgentData anoleAiAgentData2 = this.LLJLIL;
                        this.LIZLLL = anoleAiAgentData2 != null ? anoleAiAgentData2.ecAgentSchema : null;
                    }
                });
            } else {
                c1021070cg5 = new C1021070cg5(new InterfaceC1021090cg7(context) { // from class: X.0cgD
                    public final BotConfig LIZ;
                    public final Context LIZIZ;
                    public final Aweme LIZJ;
                    public final String LIZLLL;

                    @Override // X.InterfaceC1021290cgR
                    public final C1014660cVk getLogger() {
                        return this.LJ.LJIIJ();
                    }

                    @Override // X.InterfaceC1021090cg7
                    public final BotConfig LIZ() {
                        return this.LIZ;
                    }

                    @Override // X.InterfaceC1021290cgR
                    public final String LIZIZ() {
                        return this.LIZLLL;
                    }

                    @Override // X.InterfaceC1021290cgR
                    public final Aweme getAweme() {
                        return this.LIZJ;
                    }

                    @Override // X.InterfaceC1021290cgR
                    public final Context getContext() {
                        return this.LIZIZ;
                    }

                    {
                        Aweme aweme;
                        this.LIZ = this.LJ.LLILLJJLI.LIZLLL.getBotConfig();
                        this.LIZIZ = context;
                        Object obj = this.LJ.LLILLJJLI.LIZJ;
                        if (obj instanceof Aweme) {
                            aweme = (Aweme) obj;
                        } else {
                            aweme = null;
                        }
                        this.LIZJ = aweme;
                        AnoleAiAgentData anoleAiAgentData2 = this.LJ.LLJLIL;
                        this.LIZLLL = anoleAiAgentData2 != null ? anoleAiAgentData2.ecAgentSchema : null;
                    }
                });
            }
            this.LLJLILLLLZIIL = c1021070cg5;
            ViewOnClickListenerC1021220cgK viewOnClickListenerC1021220cgK = new ViewOnClickListenerC1021220cgK(context);
            viewOnClickListenerC1021220cgK.LIZJ(this.LLJLIL, this.LLJLILLLLZIIL);
            TuxTextView sponsorTvFromXml = viewOnClickListenerC1021220cgK.getSponsorTvFromXml();
            if (sponsorTvFromXml != null) {
                AwemeTextLabelModel label = this.LLILLJJLI.LIZLLL.getLabel();
                if (label != null) {
                    labelName = label.getLabelName();
                } else {
                    labelName = null;
                }
                sponsorTvFromXml.setText(labelName);
            }
            TuxIconView closeIconFromXml = viewOnClickListenerC1021220cgK.getCloseIconFromXml();
            if (closeIconFromXml != null) {
                C786410Ut5.a9(closeIconFromXml, new ACListenerS151S0100000_16(this, 171));
            }
            C2271391DvN.LIZ(viewOnClickListenerC1021220cgK.getCloseIconFromXml(), (C1A5L) C2271381DvM.w.getValue());
            AnoleAiAgentData anoleAiAgentData2 = this.LLJLIL;
            if (anoleAiAgentData2 != null && anoleAiAgentData2.photoCarouselInfo != null) {
                PhotoCarouselProductStruct photoCarouselProductStructLJJ = LJJ();
                if (photoCarouselProductStructLJJ != null) {
                    hintsConfig = photoCarouselProductStructLJJ.getHintsConfig();
                }
                viewOnClickListenerC1021220cgK.LIZ(hintsConfig);
            }
            this.LLJJIJIL = viewOnClickListenerC1021220cgK;
        }
    }

    public C1021120cgA(AnoleComponentModel anoleComponentModel, C1009340cNA c1009340cNA, InterfaceC1014270cV7 interfaceC1014270cV7, Context context) {
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
