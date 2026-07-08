package Y;

import X.C347650Dk3;
import X.C347950DkX;
import X.C348100Dkm;
import X.C348440DlK;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import java.io.FileDescriptor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes6.dex */
public class AObjectS349S0100000_5 implements Function1 {
    public final int $t;
    public Object l0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public AObjectS349S0100000_5(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object invoke$0(AObjectS349S0100000_5 aObjectS349S0100000_5, Object obj) {
        BitmapFactory.decodeFileDescriptor((FileDescriptor) obj, null, (BitmapFactory.Options) aObjectS349S0100000_5.l0);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS349S0100000_5 aObjectS349S0100000_5, Object obj) {
        return a0.LJJLIIIJLJLI((CharSequence) aObjectS349S0100000_5.l0, (IntRange) obj);
    }

    public static final Object invoke$2(AObjectS349S0100000_5 aObjectS349S0100000_5, Object obj) {
        C347650Dk3 c347650Dk3;
        TextStickerData textStickerData = (TextStickerData) aObjectS349S0100000_5.l0;
        C348100Dkm c348100Dkm = (C348100Dkm) obj;
        if (!TextUtils.isEmpty(textStickerData.getNleUuid()) && (c347650Dk3 = c348100Dkm.LJFF().get(textStickerData.getNleUuid())) != null) {
            c347650Dk3.LIZLLL = 0L;
            c347650Dk3.LJ = textStickerData.getAudioTrackDuration();
            c347650Dk3.LJFF = textStickerData.getStartTime();
            c347650Dk3.LJI = textStickerData.getStartTime() + textStickerData.getAudioTrackDuration();
            c348100Dkm.LJFF().LJIJI(c347650Dk3);
            return null;
        }
        return null;
    }

    public static final Object invoke$3(AObjectS349S0100000_5 aObjectS349S0100000_5, Object obj) {
        C348100Dkm c348100Dkm = (C348100Dkm) obj;
        C348440DlK c348440DlKLJJIIJZLJL = c348100Dkm.LJIIIZ().LJJIIJZLJL(((TextStickerData) aObjectS349S0100000_5.l0).getPlaceholderSlotId());
        if (c348440DlKLJJIIJZLJL instanceof C347950DkX) {
            c348440DlKLJJIIJZLJL.LIZLLL = r3.getUiStartTime();
            c348440DlKLJJIIJZLJL.LJ = r3.getUiEndTime();
            c348100Dkm.LJIIIZ().LIZLLL(c348440DlKLJJIIJZLJL);
            return null;
        }
        return null;
    }
}
