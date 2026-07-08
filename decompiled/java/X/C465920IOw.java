package X;

import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.android.livesdk.gift.model.GiftStrategyData;
import com.bytedance.android.livesdk.gift.model.GiftsInfo;
import com.bytedance.android.livesdk.model.Gift;
import java.util.List;

/* JADX INFO: renamed from: X.0IOw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C465920IOw extends AbstractC1132980faa {
    public final /* synthetic */ AbsAudienceInteractionFragment LIZ;

    @Override // X.AbstractC1132980faa
    public final void LIZIZ(List<Gift> list) {
    }

    public C465920IOw(AbsAudienceInteractionFragment absAudienceInteractionFragment) {
        this.LIZ = absAudienceInteractionFragment;
    }

    @Override // X.AbstractC1132980faa
    public final void LIZJ(List list, GiftsInfo giftsInfo, GiftStrategyData giftStrategyData, long j, int i) {
        this.LIZ.LLLIIIL = (C11JF) C11NZ.LJIJJLI(new C521990KdZ(this, list, 2)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJ();
    }
}
