package Y;

import X.C1282610jTv;
import X.C1282620jTw;
import X.C1318830kQL;
import X.C1318890kQR;
import android.graphics.Rect;
import android.media.MediaCodecInfo;
import com.ss.android.ttvecamera.TEFrameSizei;
import java.util.Comparator;

/* JADX INFO: loaded from: classes21.dex */
public class AComparatorS517S0100000_20 implements Comparator {
    public final int $t;
    public Object l0;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return compare$0(this, obj, obj2);
            case 1:
                return compare$1(this, obj, obj2);
            case 2:
                return compare$2(this, obj, obj2);
            case 3:
                return compare$3(this, obj, obj2);
            default:
                return 0;
        }
    }

    public AComparatorS517S0100000_20(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final int compare$0(AComparatorS517S0100000_20 aComparatorS517S0100000_20, Object obj, Object obj2) {
        int i;
        Rect rect = ((C1318890kQR) obj).LIZJ;
        Rect rect2 = ((C1318890kQR) obj2).LIZJ;
        int i2 = ((C1318830kQL) aComparatorS517S0100000_20.l0).LIZ;
        if (i2 == 0) {
            i = rect.top - rect2.top;
        } else {
            i = (rect.top / i2) - (rect2.top / i2);
        }
        int i3 = rect.left - rect2.left;
        if (i == 0) {
            return i3;
        }
        return i;
    }

    public static final int compare$1(AComparatorS517S0100000_20 aComparatorS517S0100000_20, Object obj, Object obj2) {
        ((C1282610jTv) aComparatorS517S0100000_20.l0).getClass();
        return C1282610jTv.LIZ((MediaCodecInfo) obj2) - C1282610jTv.LIZ((MediaCodecInfo) obj);
    }

    public static final int compare$2(AComparatorS517S0100000_20 aComparatorS517S0100000_20, Object obj, Object obj2) {
        ((C1282620jTw) aComparatorS517S0100000_20.l0).getClass();
        return C1282620jTw.LIZ((MediaCodecInfo) obj2) - C1282620jTw.LIZ((MediaCodecInfo) obj);
    }

    public static final int compare$3(AComparatorS517S0100000_20 aComparatorS517S0100000_20, Object obj, Object obj2) {
        TEFrameSizei tEFrameSizei = (TEFrameSizei) obj;
        TEFrameSizei tEFrameSizei2 = (TEFrameSizei) obj2;
        return Integer.compare(tEFrameSizei2.width * tEFrameSizei2.height, tEFrameSizei.width * tEFrameSizei.height);
    }
}
