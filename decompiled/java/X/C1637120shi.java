package X;

import Y.AObserverS186S0200000_25;
import Y.AObserverS227S0100000_25;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.framework.services.StickerTagChangeData;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.HorizontalEffectsModel;
import com.ss.android.ugc.gamora.recorder.sticker.l0;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0shi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1637120shi {
    public final InterfaceC1625000sOA LIZ;
    public boolean LIZIZ;
    public String LIZJ = "";
    public final C01GW<C1629670sVh> LIZLLL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 1119));

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZIZ() {
        MutableLiveData mutableLiveDataAG;
        String str;
        if (this.LIZIZ) {
            return;
        }
        this.LIZIZ = true;
        AObserverS227S0100000_25 aObserverS227S0100000_25 = new AObserverS227S0100000_25(this, 131);
        InterfaceC1623190sLF interfaceC1623190sLFU = this.LIZ.U();
        if (interfaceC1623190sLFU == null || (mutableLiveDataAG = interfaceC1623190sLFU.AG()) == null) {
            return;
        }
        StickerTagChangeData stickerTagChangeData = (StickerTagChangeData) mutableLiveDataAG.getValue();
        if (stickerTagChangeData == null || (str = stickerTagChangeData.tabKey) == null) {
            str = "";
        }
        this.LIZJ = str;
        mutableLiveDataAG.observe(this.LIZ.getLifecycleOwner(), new AObserverS186S0200000_25((Object) this, (LiveData<C1641640sp0<HorizontalEffectsModel>>) aObserverS227S0100000_25, (l0) 11));
    }

    public final boolean LIZJ() {
        return Intrinsics.LJFF(this.LIZ.dN1().LJI(), Boolean.TRUE);
    }

    public C1637120shi(InterfaceC1625000sOA interfaceC1625000sOA) {
        this.LIZ = interfaceC1625000sOA;
    }

    public final LiveData<C1641640sp0<CategoryEffectModel>> LIZ(String str, boolean z) {
        return this.LIZ.C0().getStickerRepository().LJFF().LJIJJLI(str, null, z, false);
    }
}
