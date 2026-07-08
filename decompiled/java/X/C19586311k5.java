package X;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.donation.DonationStickerModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.11k5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19586311k5 extends AbstractC388880FMo<DonationStickerModel> {
    public final C0FTH LJII;

    @Override // X.AbstractC388880FMo
    public final EnumC1466150oFx LIZLLL() {
        return EnumC1466150oFx.DONATION;
    }

    @Override // X.AbstractC388880FMo
    public final StickerModel LIZJ(StickerModel stickerModel, int i) {
        DonationStickerModel donationStickerModel = (DonationStickerModel) stickerModel;
        return donationStickerModel.copy(BaseStickerModel.copy$default(donationStickerModel.getBaseStickerModel(), i, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -2, 15, null), donationStickerModel.visible, donationStickerModel.clickable, donationStickerModel.name, donationStickerModel.iconUri, donationStickerModel.donateLink, donationStickerModel.addTime, donationStickerModel.orgId, donationStickerModel.orgType, donationStickerModel.fundraiserId, donationStickerModel.fundraiserOwnerId, donationStickerModel.fundraiserGoalDesc, donationStickerModel.displayStyle, donationStickerModel.initialTransformScale, donationStickerModel.legacyDonationNoDisplayStyleAttr, donationStickerModel.isDynamicRender);
    }

    @Override // X.AbstractC388880FMo
    public final C0FFE<StickerModel> LIZ(StickerModel stickerModel, C0FFO c0ffo, LifecycleOwner lifecycleOwner) {
        return new C19585811k0(this.LIZ, (DonationStickerModel) stickerModel, this.LIZIZ, c0ffo, lifecycleOwner, this.LJFF);
    }

    public C19586311k5(Context context, FrameLayout frameLayout, FrameLayout frameLayout2, LifecycleOwner lifecycleOwner, C390420FSm c390420FSm) {
        super(context, frameLayout, frameLayout2, lifecycleOwner, C390410FSl.LIZIZ(c390420FSm), c390420FSm);
        C0FTH c0fth = (C0FTH) c390420FSm.LIZIZ(C13LE.LIZ(C0FTH.class));
        this.LJII = c0fth;
        C390790FTx c390790FTxLIZIZ = c0fth.LIZIZ();
        ((ArrayList) c390790FTxLIZIZ.LLJJI).add(new C0FU7() { // from class: X.0FWI
            @Override // X.C0FU7
            public final boolean LIZ(int i, EnumC1466150oFx enumC1466150oFx, int i2) {
                return false;
            }

            @Override // X.C0FU7
            public final EnumC1466150oFx getStickerType() {
                return EnumC1466150oFx.DONATION;
            }

            @Override // X.C0FU7
            public final List<C0FU6> LIZIZ(int i) {
                C19586311k5 c19586311k5 = this.LIZ;
                c19586311k5.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(c19586311k5.LJII.LIZIZ().LJJJ(3, null, null, null));
                if (C0FWJ.LIZIZ()) {
                    arrayList.add(c19586311k5.LJII.LIZIZ().LJJJ(11, null, null, null));
                }
                return arrayList;
            }
        });
    }
}
