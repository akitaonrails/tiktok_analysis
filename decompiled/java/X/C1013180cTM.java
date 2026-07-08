package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.model.AnoleAdCardModel;
import com.ss.android.ugc.aweme.model.AnoleProductModel;
import com.ss.android.ugc.aweme.model.AnoleVideoDataModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS382S0200000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS639S0100000_25;

/* JADX INFO: renamed from: X.0cTM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1013180cTM extends AbstractC1014240cV4 {
    public final AnoleAdCardModel LLJLIL;
    public final ConcurrentHashMap<Integer, Bitmap> LLJLILLLLZIIL;
    public Pair<Integer, Integer> LLJLL;
    public final C1012860cSq LLJLLIL;
    public final C1012920cSw LLJLLL;
    public final AwS382S0200000_16 LLJZ;

    @Override // X.AbstractC1014240cV4
    public final boolean LJIILIIL() {
        return false;
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void LIZ() {
        C1012920cSw c1012920cSw = this.LLJLLL;
        C369801c8 c369801c8 = c1012920cSw.LLILZIL;
        AnonymousClass0956 anonymousClass0956 = c369801c8.LIZIZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        c369801c8.LIZIZ = null;
        c1012920cSw.LLLFZ(c1012920cSw.LLIZLLLIL, C1013210cTP.LIZ);
        c1012920cSw.LLLFZ((c1012920cSw.LLIZLLLIL + 1) % c1012920cSw.LLJ, C1013250cTT.LIZ);
        c1012920cSw.LLIZLLLIL = 0;
        c1012920cSw.clearData();
        super.LIZ();
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void LIZJ() {
        AnoleAdCardModel anoleAdCardModel = this.LLJLIL;
        if (anoleAdCardModel != null) {
            C1012920cSw c1012920cSw = this.LLJLLL;
            c1012920cSw.setShowFooter(false);
            List<AnoleProductModel> productList = anoleAdCardModel.getProductList();
            c1012920cSw.setData(productList != null ? new ArrayList(productList) : null);
        }
        super.LIZJ();
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final C1014500cVU isReady() {
        return new C1014500cVU(true, "");
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Ck(Function1<? super Boolean, Unit> function1) {
        List<AnoleProductModel> productList;
        AnoleProductModel anoleProductModel;
        String videoUrl;
        AnoleAdCardModel anoleAdCardModel = this.LLJLIL;
        if (anoleAdCardModel != null && (productList = anoleAdCardModel.getProductList()) != null && (anoleProductModel = (AnoleProductModel) C13LP.LJJJLZIJ(0, productList)) != null) {
            String itemId = anoleProductModel.getItemId();
            AnoleVideoDataModel videoData = anoleProductModel.getVideoData();
            if (videoData != null) {
                videoUrl = videoData.getVideoUrl();
            } else {
                videoUrl = null;
            }
            if (itemId != null && videoUrl != null) {
                C1482560ogQ c1482560ogQLIZ = C1018200cbS.LIZ(itemId, Collections.singletonList(videoUrl));
                C582130MsN.LIZ().LJ().getClass();
                C1014030cUj.LIZ.LJIILLIIL(512, Collections.singletonList(c1482560ogQLIZ));
            }
            List<AnoleProductModel> productList2 = this.LLJLIL.getProductList();
            if (productList2 != null) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1007590cKL(productList2, this, null), 3);
            }
            LJJ(true);
        }
    }

    @Override // X.AbstractC1014240cV4
    public final void LJII(AnoleComponentAppearModel anoleComponentAppearModel) {
        super.LJII(anoleComponentAppearModel);
        C1012920cSw c1012920cSw = this.LLJLLL;
        c1012920cSw.LLILZIL.LIZ(new AwS560S0100000_16(c1012920cSw, 969));
    }

    public final void LJJ(boolean z) {
        if (this.LLJJIJIL != null) {
            return;
        }
        if (z && this.LLJLILLLLZIIL.get(0) == null) {
            return;
        }
        ComposeView composeView = new ComposeView(this.LLILZ, null, 6);
        composeView.setId(R.id.eki);
        composeView.setContent(new C19719212De(696712638, new AwS639S0100000_25(this, 150), true));
        this.LLJJIJIL = composeView;
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Mk(AbstractC1003980cEW abstractC1003980cEW) {
        if (abstractC1003980cEW instanceof C991730bul) {
            if (((C991730bul) abstractC1003980cEW).LIZ) {
                C1012920cSw c1012920cSw = this.LLJLLL;
                c1012920cSw.LLLFZ(c1012920cSw.LLIZLLLIL, C1013260cTU.LIZ);
            } else {
                C1012920cSw c1012920cSw2 = this.LLJLLL;
                c1012920cSw2.LLLFZ(c1012920cSw2.LLIZLLLIL, C1013230cTR.LIZ);
            }
        }
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Fk(ViewGroup viewGroup, InterfaceC1014340cVE interfaceC1014340cVE) {
        super.Fk(viewGroup, interfaceC1014340cVE);
        LJJ(false);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [X.0cSq] */
    public C1013180cTM(AnoleComponentModel anoleComponentModel, C1009340cNA c1009340cNA, InterfaceC1014270cV7 interfaceC1014270cV7, Context context) {
        Object c098200Yq;
        super(anoleComponentModel, c1009340cNA, interfaceC1014270cV7, context);
        try {
            Gson gson = C7740030o.LIZ().getGson();
            if (gson != null) {
                c098200Yq = (AnoleAdCardModel) gson.LJII(gson.LJIILL(anoleComponentModel.data), AnoleAdCardModel.class);
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m8isSuccessimpl(c098200Yq);
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("multiVideoCardData parse failed, reason = ");
            sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
        }
        AnoleAdCardModel anoleAdCardModel = (AnoleAdCardModel) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
        this.LLJLIL = anoleAdCardModel;
        this.LLJLILLLLZIIL = new ConcurrentHashMap<>();
        this.LLJLLIL = new AbstractC1023470cjx(c1009340cNA.LIZLLL, anoleAdCardModel) { // from class: X.0cSq
            public final C1023630ckD<?>[] LIZ;

            @Override // X.AbstractC1023380cjo, X.C1023640ckE
            public final C1023630ckD<?>[] getInternalLogics() {
                return this.LIZ;
            }

            {
                super(Arrays.copyOf(objArr, objArr.length));
                this.LIZ = new C1023630ckD[0];
                withContext(new C1012850cSp(0, 1));
            }
        };
        this.LLJLLL = new C1012920cSw(new C1012380cS4(this));
        this.LLJZ = new AwS382S0200000_16(c1009340cNA, this, 107);
    }
}
