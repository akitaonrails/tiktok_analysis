package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.gift.model.TransitionConfig;
import java.util.List;

/* JADX INFO: renamed from: X.0fDl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1118830fDl {
    public final long LIZ;
    public final int LIZIZ;
    public final C1138030fij LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final boolean LJFF;
    public final int LJI;
    public final long LJII;
    public final String LJIIIIZZ;
    public boolean LJIIIZ = false;
    public final ImageModel LJIIJ;
    public final ImageModel LJIIJJI;
    public final Long LJIIL;
    public final int LJIILIIL;
    public final ImageModel LJIILJJIL;
    public final List<TransitionConfig> LJIILL;

    public final String toString() {
        return "GiftTrayShowInfo(giftId=" + this.LIZ + ", giftType=" + this.LIZIZ + ", giftIcon=" + this.LIZJ + ", senderUid=" + this.LIZLLL + ", receiverUid=" + this.LJ + ", isCombo=" + this.LJFF + ", abFromSender=" + this.LJI + ", showDuration=" + this.LJII + ", uniqueId=" + this.LJIIIIZZ + ", isFromFly=" + this.LJIIIZ + ", pathImage=" + this.LJIIJ + ", receiverImage=" + this.LJIIJJI + ", timeDelay=" + this.LJIIL + ", downGradeLevel=" + this.LJIILIIL + ", receiverImageV2=" + this.LJIILJJIL + ", transitionConfigs=" + this.LJIILL + ')';
    }

    public C1118830fDl(long j, int i, C1138030fij c1138030fij, long j2, long j3, boolean z, int i2, long j4, String str, ImageModel imageModel, ImageModel imageModel2, Long l, int i3, ImageModel imageModel3, List list) {
        this.LIZ = j;
        this.LIZIZ = i;
        this.LIZJ = c1138030fij;
        this.LIZLLL = j2;
        this.LJ = j3;
        this.LJFF = z;
        this.LJI = i2;
        this.LJII = j4;
        this.LJIIIIZZ = str;
        this.LJIIJ = imageModel;
        this.LJIIJJI = imageModel2;
        this.LJIIL = l;
        this.LJIILIIL = i3;
        this.LJIILJJIL = imageModel3;
        this.LJIILL = list;
    }
}
