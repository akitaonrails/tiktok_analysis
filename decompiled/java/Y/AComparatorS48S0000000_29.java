package Y;

import X.C12O8;
import X.C20085613iQ;
import X.InterfaceC19362510p5;
import X.InterfaceC19526611aS;
import com.ss.android.ugc.aweme.creative.model.AnchorTransData;
import com.ss.android.ugc.aweme.editSticker.text.bean.InteractTextStructWrap;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.tts.oecverify.BdTuring;
import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes30.dex */
public class AComparatorS48S0000000_29 implements Comparator {
    public final int $t;

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        switch (this.$t) {
            case 0:
                return compare$0(this, t, t2);
            case 1:
                return compare$1(this, t, t2);
            case 2:
                return compare$2(this, t, t2);
            case 3:
                return compare$3(this, t, t2);
            case 4:
                return compare$4(this, t, t2);
            case 5:
                return compare$5(this, t, t2);
            case 6:
                return compare$6(this, t, t2);
            case 7:
                return compare$7(this, t, t2);
            case 8:
                return compare$8(this, t, t2);
            case BdTuring.TYPE_ECAF /* 9 */:
                return compare$9(this, t, t2);
            default:
                return 0;
        }
    }

    public AComparatorS48S0000000_29(int i) {
        this.$t = i;
    }

    public static final int compare$0(AComparatorS48S0000000_29 aComparatorS48S0000000_29, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(((AnchorTransData) obj).addTime, ((AnchorTransData) obj2).addTime);
    }

    public static final int compare$1(AComparatorS48S0000000_29 aComparatorS48S0000000_29, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((InteractTextStructWrap) obj).getRange().getStart()), Integer.valueOf(((InteractTextStructWrap) obj2).getRange().getStart()));
    }

    public static final int compare$2(AComparatorS48S0000000_29 aComparatorS48S0000000_29, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((StickerModel) obj).getBaseModel().getZIndex()), Integer.valueOf(((StickerModel) obj2).getBaseModel().getZIndex()));
    }

    public static final int compare$3(AComparatorS48S0000000_29 aComparatorS48S0000000_29, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(((InterfaceC19526611aS) obj).LJJ(), ((InterfaceC19526611aS) obj2).LJJ());
    }

    public static final int compare$4(AComparatorS48S0000000_29 aComparatorS48S0000000_29, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(((InterfaceC19526611aS) obj).LJJ(), ((InterfaceC19526611aS) obj2).LJJ());
    }

    public static final int compare$5(AComparatorS48S0000000_29 aComparatorS48S0000000_29, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C12O8) obj2).LIZIZ), Integer.valueOf(((C12O8) obj).LIZIZ));
    }

    public static final int compare$6(AComparatorS48S0000000_29 aComparatorS48S0000000_29, Object obj, Object obj2) {
        return ((Comparable) obj).compareTo(obj2);
    }

    public static final int compare$7(AComparatorS48S0000000_29 aComparatorS48S0000000_29, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((InterfaceC19362510p5) ((Map.Entry) obj).getValue()).LIZ()), Long.valueOf(((InterfaceC19362510p5) ((Map.Entry) obj2).getValue()).LIZ()));
    }

    public static final int compare$8(AComparatorS48S0000000_29 aComparatorS48S0000000_29, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((InterfaceC19362510p5) ((Map.Entry) obj2).getValue()).LIZ()), Long.valueOf(((InterfaceC19362510p5) ((Map.Entry) obj).getValue()).LIZ()));
    }

    public static final int compare$9(AComparatorS48S0000000_29 aComparatorS48S0000000_29, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.InteractTextStructWrap) obj).getRange().getStart()), Integer.valueOf(((com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.InteractTextStructWrap) obj2).getRange().getStart()));
    }
}
