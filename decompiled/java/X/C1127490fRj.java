package X;

import Y.ARunnableS117S0100000_17;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.GiftGalleryBannerUpdateChannel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.widgets.giftwidget.viewmodel.GiftLeafRootViewModel;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS418S0200000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: renamed from: X.0fRj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1127490fRj implements InterfaceC1127800fSE {
    public final View LL;
    public final Context LLILLJJLI;
    public final DataChannel LLILLL;
    public final LifecycleOwner LLILZ;
    public final GiftLeafRootViewModel LLILZIL;
    public AwS418S0200000_17 LLJ;
    public AbstractC1126600fQI<? extends AnonymousClass0054> LLJI;
    public final EnumC1127500fRk LLILZLL = EnumC1127500fRk.GALLERY;
    public final C01GW LLIZ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS561S0100000_17(this, 542));
    public final BPEAHandler LLIZLLLIL = new BPEAHandler(Looper.getMainLooper());
    public final ARunnableS117S0100000_17 LLJIJIL = new ARunnableS117S0100000_17(this, 248);

    @Override // X.InterfaceC1127800fSE
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1127800fSE
    public final boolean LIZJ() {
        return false;
    }

    @Override // X.InterfaceC1127800fSE
    public final void LJII() {
        this.LLJ = null;
        this.LLIZLLLIL.removeCallbacks(this.LLJIJIL);
    }

    @Override // X.InterfaceC1127800fSE
    public final void LJIIIZ() {
        this.LLJ = null;
        this.LLIZLLLIL.removeCallbacks(this.LLJIJIL);
    }

    @Override // X.InterfaceC1127800fSE
    /* JADX INFO: renamed from: LIZLLL, reason: merged with bridge method [inline-methods] */
    public final C1118180fCi LJ() {
        return (C1118180fCi) this.LLIZ.getValue();
    }

    @Override // X.InterfaceC1127800fSE
    public final void LJIIIIZZ() {
        C0T89 c0t89;
        View view = this.LL;
        if ((view instanceof C0T89) && (c0t89 = (C0T89) view) != null) {
            c0t89.setOnGalleryClickListener$livegift_impl_release(new AwS596S0100000_17(this, 582));
        }
        DataChannel dataChannel = this.LLILLL;
        if (dataChannel != null) {
            dataChannel.BQ2(this.LLILZ, GiftGalleryBannerUpdateChannel.class, new AwS596S0100000_17(this, 583));
        }
    }

    @Override // X.InterfaceC1127800fSE
    public final EnumC1127500fRk getBannerType() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1127800fSE
    public final boolean LJFF(C1124680fNC c1124680fNC) {
        Object obj;
        Long lValueOf;
        Gift gift;
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI = c1124680fNC.LIZIZ;
        if (C1130100fVw.LIZ.LJIJJ) {
            return false;
        }
        Long lValueOf2 = null;
        if (abstractC1126600fQI != null) {
            obj = abstractC1126600fQI.LIZIZ;
        } else {
            obj = null;
        }
        if ((obj instanceof Gift) && (gift = (Gift) obj) != null) {
            lValueOf = Long.valueOf(gift.id);
        } else {
            lValueOf = null;
        }
        if (!C1127480fRi.LJIIIIZZ(lValueOf)) {
            return false;
        }
        if ((abstractC1126600fQI == null || abstractC1126600fQI.LJIILIIL) && c1124680fNC.LJIIIZ != EnumC1127640fRy.GIFT_GALLERY_UPDATE) {
            return false;
        }
        InterfaceC1128210fSt interfaceC1128210fStInst = GiftManager.inst();
        if (abstractC1126600fQI != null) {
            lValueOf2 = Long.valueOf(abstractC1126600fQI.LJI());
        }
        if (interfaceC1128210fStInst.isDisableGalleryBannerForGift(lValueOf2)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1127800fSE
    public final void LIZIZ(InterfaceC1127800fSE interfaceC1127800fSE, View view, C1124680fNC c1124680fNC) {
        C0T89 c0t89;
        View view2 = this.LL;
        C0T8B c0t8b = null;
        if ((view2 instanceof C0T89) && (c0t89 = (C0T89) view2) != null) {
            Long lValueOf = Long.valueOf(c1124680fNC.LJFF);
            C1127920fSQ c1127920fSQ = c1124680fNC.LJIIL;
            if (view instanceof C0T8B) {
                c0t8b = (C0T8B) view;
            }
            C0T89.LIZLLL(c0t89, lValueOf, c1127920fSQ, c0t8b, null, 24);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
    @Override // X.InterfaceC1127800fSE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View LJI(X.C1124680fNC r7, X.InterfaceC1124700fNE r8, X.InterfaceC1123410fL9 r9) {
        /*
            r6 = this;
            X.0fQI<? extends X.0054> r4 = r7.LIZIZ
            X.0fCi r1 = r6.LJ()
            r3 = 0
            if (r4 == 0) goto L9c
            com.bytedance.android.live.base.model.ImageModel r0 = r4.LJFF
            if (r0 != 0) goto L11
            com.bytedance.android.live.base.model.ImageModel r0 = r4.LJII()
        L11:
            r1.setup(r0)
            X.0fSt r0 = com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager.inst()
            boolean r2 = r0.isEoy()
            if (r2 == 0) goto L87
            if (r4 == 0) goto L85
            long r0 = r4.LJFF()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L28:
            boolean r0 = X.C1127480fRi.LJFF(r0)
            if (r0 == 0) goto L87
        L2e:
            r0 = 0
        L30:
            if (r4 == 0) goto L34
            r4.LJIILJJIL = r0
        L34:
            X.0fCi r5 = r6.LJ()
            if (r4 == 0) goto L83
            long r0 = r4.LJIILJJIL
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L40:
            boolean r0 = X.C1127480fRi.LJI()
            r5.LIZ(r1, r0)
            X.0fCi r5 = r6.LJ()
            Y.ACListenerS43S0210000_17 r1 = new Y.ACListenerS43S0210000_17
            r0 = 1
            r1.<init>(r6, r4, r2, r0)
            X.C786410Ut5.E8(r5, r1)
            r6.LLJ = r3
            com.bytedance.bpea.transmit.delegate.BPEAHandler r1 = r6.LLIZLLLIL
            Y.ARunnableS117S0100000_17 r0 = r6.LLJIJIL
            r1.removeCallbacks(r0)
            X.0fCi r0 = r6.LJ()
            boolean r0 = r0.LLILZ
            if (r0 == 0) goto L80
            r1 = 12000(0x2ee0, double:5.929E-320)
        L67:
            kotlin.jvm.internal.AwS418S0200000_17 r3 = new kotlin.jvm.internal.AwS418S0200000_17
            r0 = 93
            r3.<init>(r7, r8, r0)
            r6.LLJ = r3
            X.0fQI<? extends X.0054> r0 = r7.LIZIZ
            r6.LLJI = r0
            com.bytedance.bpea.transmit.delegate.BPEAHandler r3 = r6.LLIZLLLIL
            Y.ARunnableS117S0100000_17 r0 = r6.LLJIJIL
            X.C786410Ut5.LJLIIL(r1, r3, r0)
            X.0fCi r0 = r6.LJ()
            return r0
        L80:
            r1 = 8000(0x1f40, double:3.9525E-320)
            goto L67
        L83:
            r1 = r3
            goto L40
        L85:
            r0 = r3
            goto L28
        L87:
            if (r4 == 0) goto L9a
            long r0 = r4.LJFF()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L91:
            com.bytedance.android.livesdk.model.Gift$GiftSponsorInfo r0 = X.C1127480fRi.LIZJ(r0, r3)
            if (r0 == 0) goto L2e
            long r0 = r0.leftCountToSponsor
            goto L30
        L9a:
            r0 = r3
            goto L91
        L9c:
            r0 = r3
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1127490fRj.LJI(X.0fNC, X.0fNE, X.0fL9):android.view.View");
    }

    public C1127490fRj(View view, Context context, DataChannel dataChannel, LifecycleOwner lifecycleOwner, GiftLeafRootViewModel giftLeafRootViewModel) {
        this.LL = view;
        this.LLILLJJLI = context;
        this.LLILLL = dataChannel;
        this.LLILZ = lifecycleOwner;
        this.LLILZIL = giftLeafRootViewModel;
    }
}
