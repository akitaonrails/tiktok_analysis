package X;

import com.bytedance.android.live.liveinteract.multilive.model.GuestApplyStillInLineResponse;
import java.util.List;

/* JADX INFO: renamed from: X.0aTz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C936690aTz {
    public final EnumC937180aUm LIZ;
    public final GuestApplyStillInLineResponse.GuestApplyItem LIZIZ;
    public final GuestApplyStillInLineResponse.GuestInvitedItem LIZJ;
    public final List<GuestApplyStillInLineResponse.GuestApplyItem> LIZLLL;
    public final List<GuestApplyStillInLineResponse.GuestInvitedItem> LJ;
    public final int LJFF;
    public final boolean LJI;

    public C936690aTz() {
        throw null;
    }

    public C936690aTz(EnumC937180aUm enumC937180aUm, GuestApplyStillInLineResponse.GuestApplyItem guestApplyItem, GuestApplyStillInLineResponse.GuestInvitedItem guestInvitedItem, List list, List list2, int i, boolean z, int i2) {
        guestApplyItem = (i2 & 2) != 0 ? null : guestApplyItem;
        guestInvitedItem = (i2 & 4) != 0 ? null : guestInvitedItem;
        list = (i2 & 8) != 0 ? null : list;
        list2 = (i2 & 16) != 0 ? null : list2;
        i = (i2 & 32) != 0 ? 0 : i;
        z = (i2 & 64) != 0 ? false : z;
        this.LIZ = enumC937180aUm;
        this.LIZIZ = guestApplyItem;
        this.LIZJ = guestInvitedItem;
        this.LIZLLL = list;
        this.LJ = list2;
        this.LJFF = i;
        this.LJI = z;
    }
}
