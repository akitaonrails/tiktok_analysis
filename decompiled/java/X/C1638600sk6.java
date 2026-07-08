package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.shortvideo.model.GreenScreenMaterial;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.ugc.effectplatform.model.net.GifProviderEffectListResponse;
import java.util.ArrayList;
import java.util.List;
import v7.o;

/* JADX INFO: renamed from: X.0sk6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1638600sk6 implements InterfaceC1643780ssS {
    public final /* synthetic */ ProgressDialogC1397800mTi LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ o LIZJ;
    public final /* synthetic */ ArrayList LIZLLL;

    @Override // X.InterfaceC1643780ssS
    public final void LIZ(List<? extends ProviderEffect> list) {
        C786410Ut5.LJIILIIL(this.LIZ);
        C1688680u2s.LJIIL(false, 1501);
        Bundle bundle = new Bundle();
        for (ProviderEffect providerEffect : list) {
            this.LIZLLL.add(new GreenScreenMaterial(0, 0L, 0L, providerEffect.getId(), providerEffect.getUser_name(), "", providerEffect.getPath(), "prop_reuse"));
        }
        C786410Ut5.LJJIL(bundle, "green_screen_material_list", this.LIZLLL);
        this.LIZJ.LJ(bundle);
    }

    @Override // X.InterfaceC1643780ssS
    public final void LIZIZ(C1662010tLr c1662010tLr) {
        C786410Ut5.LJIILIIL(this.LIZ);
        C1688680u2s.LJIIL(false, 1501);
        if (this.LIZIZ) {
            this.LIZJ.LIZLLL(c1662010tLr.LIZLLL);
        } else {
            this.LIZJ.LJ(new Bundle());
        }
    }

    @Override // X.C13MA
    public final /* bridge */ /* synthetic */ void onSuccess(GifProviderEffectListResponse gifProviderEffectListResponse) {
    }

    @Override // X.C13MA
    public final /* bridge */ /* synthetic */ void preProcess(GifProviderEffectListResponse gifProviderEffectListResponse) {
    }

    @Override // X.C13MA
    public final void onFail(GifProviderEffectListResponse gifProviderEffectListResponse, C1662010tLr c1662010tLr) {
        C786410Ut5.LJIILIIL(this.LIZ);
        C1688680u2s.LJIIL(false, 1501);
        if (this.LIZIZ) {
            this.LIZJ.LIZLLL(c1662010tLr.LIZLLL);
        } else {
            this.LIZJ.LJ(new Bundle());
        }
    }

    public C1638600sk6(ProgressDialogC1397800mTi progressDialogC1397800mTi, boolean z, o oVar, ArrayList arrayList) {
        this.LIZ = progressDialogC1397800mTi;
        this.LIZIZ = z;
        this.LIZJ = oVar;
        this.LIZLLL = arrayList;
    }
}
