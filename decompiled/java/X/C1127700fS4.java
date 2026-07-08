package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.gift.model.GiftListResult;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0fS4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1127700fS4 {
    public final InterfaceC1127730fS7 LIZ;
    public final LifecycleOwner LIZIZ;
    public final C1127830fSH LIZJ = new InterfaceC1133110fan() { // from class: X.0fSH
        @Override // X.InterfaceC1133110fan
        public final void LIZLLL(GiftListResult giftListResult, int i) {
            this.LL.LIZ.LIZ(giftListResult);
            if (this.LL.LIZ() != null) {
                C1127700fS4 c1127700fS4 = this.LL;
                c1127700fS4.LIZ.LJ(c1127700fS4.LIZ(), EnumC1127640fRy.GIFT_LIST);
            }
        }
    };
    public final C1127710fS5 LIZLLL;
    public final C11NJ LJ;

    public final AbstractC1126600fQI<? extends AnonymousClass0054> LIZ() {
        return this.LIZ.LJIIIIZZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.0fSH] */
    public C1127700fS4(InterfaceC1127730fS7 interfaceC1127730fS7, DataChannel dataChannel, LifecycleOwner lifecycleOwner) {
        C1127710fS5 c1127710fS5;
        this.LIZ = interfaceC1127730fS7;
        this.LIZIZ = lifecycleOwner;
        if (C1125810fP1.LIZ()) {
            c1127710fS5 = 0;
        } else {
            c1127710fS5 = new InterfaceC1128230fSv() { // from class: X.0fS5
                @Override // X.InterfaceC1128230fSv
                public final void LIZ(C1127820fSG c1127820fSG) {
                    Long lValueOf;
                    AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQILIZ = this.LIZ.LIZ();
                    if (abstractC1126600fQILIZ != null) {
                        lValueOf = Long.valueOf(abstractC1126600fQILIZ.LJFF());
                    } else {
                        lValueOf = null;
                    }
                    if (C1127480fRi.LJIIIIZZ(lValueOf) && this.LIZ.LIZ.P1() != 16) {
                        C1127700fS4 c1127700fS4 = this.LIZ;
                        c1127700fS4.LIZ.LIZJ(c1127700fS4.LIZ(), EnumC1127500fRk.GALLERY, EnumC1127640fRy.GIFT_GALLERY_UPDATE, null);
                    }
                }
            };
        }
        this.LIZLLL = c1127710fS5;
        this.LJ = new C11NJ();
    }
}
