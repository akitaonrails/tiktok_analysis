package X;

import X.AnonymousClass0054;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftLockInfo;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.List;

/* JADX INFO: renamed from: X.0fQI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1126600fQI<T extends AnonymousClass0054> {
    public static final /* synthetic */ int LJJ = 0;
    public final int LIZ;
    public T LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public ImageModel LJ;
    public ImageModel LJFF;
    public boolean LJIIIIZZ;
    public transient boolean LJIIIZ;
    public boolean LJIIJ;
    public long LJIIJJI;
    public long LJIIL;
    public boolean LJIILIIL;
    public long LJIILJJIL;
    public boolean LJIILL;
    public ImageModel LJIILLIIL;
    public InterfaceC1126420fQ0 LJIIZILJ;
    public boolean LJIJI;
    public C01AS LJIJJ;
    public boolean LJIJJLI;
    public boolean LJI = true;
    public String LJII = "";
    public long LJIJ = -1;
    public String LJIL = "";

    public abstract String LIZJ();

    public abstract long LJI();

    public abstract ImageModel LJII();

    public ImageModel LJIIIIZZ() {
        return null;
    }

    public abstract String LJIIIZ();

    public String LJIIJ() {
        return "";
    }

    public boolean LJJIIJ() {
        return this instanceof C293101Bp;
    }

    public boolean LIZ() {
        Gift gift;
        Gift.BatchGiftInfo batchGiftInfo;
        T t = this.LIZIZ;
        if (!(t instanceof Gift) || (gift = (Gift) t) == null || (batchGiftInfo = gift.batchGiftInfo) == null) {
            return false;
        }
        return batchGiftInfo.canBatchSend;
    }

    public final String LIZIZ() {
        Gift gift;
        GiftLockInfo giftLockInfo;
        String str;
        GiftLockInfo giftLockInfo2;
        String str2;
        T t = this.LIZIZ;
        return (!(t instanceof Gift) || (gift = (Gift) t) == null || (giftLockInfo = gift.giftSubInfo) == null || (str = giftLockInfo.unlockButtonText) == null || str.length() <= 0 || (giftLockInfo2 = gift.giftSubInfo) == null || (str2 = giftLockInfo2.unlockButtonText) == null) ? C497740JfY.LJIJI(2131855988) : str2;
    }

    public final int LIZLLL() {
        Gift gift;
        T t = this.LIZIZ;
        if (!(t instanceof Gift) || (gift = (Gift) t) == null) {
            return 0;
        }
        return gift.diamondCount;
    }

    public final long LJ() {
        Gift gift;
        T t = this.LIZIZ;
        if (!(t instanceof Gift) || (gift = (Gift) t) == null) {
            return 0L;
        }
        return gift.expirationTimestamp;
    }

    public final long LJFF() {
        Gift gift;
        T t = this.LIZIZ;
        if (!(t instanceof Gift) || (gift = (Gift) t) == null) {
            return 0L;
        }
        return gift.id;
    }

    public final int LJIIJJI() {
        Gift gift;
        Gift.GiftSeriesInfo giftSeriesInfo;
        List<Long> list;
        T t = this.LIZIZ;
        if (!(t instanceof Gift) || (gift = (Gift) t) == null || (giftSeriesInfo = gift.seriesInfo) == null || (list = giftSeriesInfo.giftIds) == null) {
            return 0;
        }
        return list.size();
    }

    public final String LJIIL() {
        Gift gift;
        GiftLockInfo giftLockInfo;
        String str;
        T t = this.LIZIZ;
        return (!(t instanceof Gift) || (gift = (Gift) t) == null || (giftLockInfo = gift.giftSubInfo) == null || (str = giftLockInfo.unlockSchema) == null) ? "" : str;
    }

    public boolean LJIILJJIL() {
        ImageModel imageModel;
        List<String> listLIZ;
        T t = this.LIZIZ;
        Gift gift = t instanceof Gift ? (Gift) t : null;
        return (gift == null || (imageModel = gift.previewImage) == null || (listLIZ = C842240X2g.LIZ(imageModel)) == null || !(listLIZ.isEmpty() ^ true)) ? false : true;
    }

    public final boolean LJIILL() {
        GiftLockInfo giftLockInfo;
        T t = this.LIZIZ;
        Gift gift = t instanceof Gift ? (Gift) t : null;
        return gift != null && (giftLockInfo = gift.giftSubInfo) != null && giftLockInfo.mLock && giftLockInfo.mLockType == 10;
    }

    public final boolean LJIILLIIL() {
        Gift gift;
        GiftLockInfo giftLockInfo;
        T t = this.LIZIZ;
        if (!(t instanceof Gift) || (gift = (Gift) t) == null || (giftLockInfo = gift.giftSubInfo) == null) {
            return false;
        }
        return giftLockInfo.highlightEnabled;
    }

    public final boolean LJIIZILJ() {
        GiftLockInfo giftLockInfo;
        T t = this.LIZIZ;
        Gift gift = t instanceof Gift ? (Gift) t : null;
        return gift != null && (giftLockInfo = gift.giftSubInfo) != null && giftLockInfo.mLock && giftLockInfo.mLockType == 11;
    }

    public final boolean LJIJ() {
        GiftLockInfo giftLockInfo;
        T t = this.LIZIZ;
        Gift gift = t instanceof Gift ? (Gift) t : null;
        if (gift == null || (giftLockInfo = gift.giftSubInfo) == null) {
            return false;
        }
        return (giftLockInfo.mLockType == 3 || giftLockInfo.mLockType == 4) && giftLockInfo.mLock;
    }

    public final boolean LJIJI() {
        GiftLockInfo giftLockInfo;
        T t = this.LIZIZ;
        Gift gift = t instanceof Gift ? (Gift) t : null;
        return gift != null && (giftLockInfo = gift.giftSubInfo) != null && giftLockInfo.mLockType == 8 && giftLockInfo.mLock;
    }

    public final boolean LJIJJ() {
        GiftLockInfo giftLockInfo;
        T t = this.LIZIZ;
        Gift gift = t instanceof Gift ? (Gift) t : null;
        return (gift == null || (giftLockInfo = gift.giftSubInfo) == null || !giftLockInfo.mLock) ? false : true;
    }

    public final boolean LJIJJLI() {
        Gift.MusicGiftInfo musicGiftInfo;
        T t = this.LIZIZ;
        Gift gift = t instanceof Gift ? (Gift) t : null;
        return (gift == null || (musicGiftInfo = gift.musicInfo) == null || musicGiftInfo.resource == null) ? false : true;
    }

    public final boolean LJIL() {
        GiftLockInfo giftLockInfo;
        T t = this.LIZIZ;
        Gift gift = t instanceof Gift ? (Gift) t : null;
        return gift != null && (giftLockInfo = gift.giftSubInfo) != null && giftLockInfo.mLockType == 6 && giftLockInfo.mLock;
    }

    public final boolean LJJI() {
        Gift.GiftSeriesInfo giftSeriesInfo;
        T t = this.LIZIZ;
        Gift gift = t instanceof Gift ? (Gift) t : null;
        return gift != null && (giftSeriesInfo = gift.seriesInfo) != null && giftSeriesInfo.enabled && (giftSeriesInfo.giftIds.isEmpty() ^ true);
    }

    public final boolean LJJIFFI() {
        GiftLockInfo giftLockInfo;
        T t = this.LIZIZ;
        Gift gift = t instanceof Gift ? (Gift) t : null;
        return gift != null && (giftLockInfo = gift.giftSubInfo) != null && giftLockInfo.mLockType == 1 && giftLockInfo.mLock;
    }

    public final boolean LJJII() {
        GiftLockInfo giftLockInfo;
        T t = this.LIZIZ;
        Gift gift = t instanceof Gift ? (Gift) t : null;
        return gift != null && (giftLockInfo = gift.giftSubInfo) != null && giftLockInfo.mLockType == 3 && giftLockInfo.mLock;
    }

    public final boolean LJJIII() {
        GiftLockInfo giftLockInfo;
        T t = this.LIZIZ;
        Gift gift = t instanceof Gift ? (Gift) t : null;
        return (gift == null || (giftLockInfo = gift.giftSubInfo) == null || giftLockInfo.mLockType != 3 || giftLockInfo.mLock) ? false : true;
    }

    public String LJIILIIL() {
        return String.valueOf(LJI());
    }

    public final boolean LJJ() {
        long jLIZ = C158B.LIZ() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        return jLIZ >= this.LJIIJJI && jLIZ < this.LJIIL;
    }

    public AbstractC1126600fQI(int i, T t) {
        this.LIZ = i;
        this.LIZIZ = t;
    }
}
