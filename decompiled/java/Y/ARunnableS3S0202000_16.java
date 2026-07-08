package Y;

import X.C196868120s;
import X.C1C7U;
import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.photo.FriendV3PhotoAssem;

/* JADX INFO: loaded from: classes17.dex */
public class ARunnableS3S0202000_16 implements Runnable {
    public final int $t;
    public int i2;
    public int i3;
    public Object l0;
    public Object l1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS3S0202000_16 aRunnableS3S0202000_16) {
        boolean zLIZ;
        C1C7U.LIZ("FriendV3PhotoAssem@8bb7.scrollToPositionWithRightMargin$1");
        try {
            ((FriendV3PhotoAssem) aRunnableS3S0202000_16.l0).Gp((RecyclerView) aRunnableS3S0202000_16.l1, aRunnableS3S0202000_16.i2, aRunnableS3S0202000_16.i3);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FriendV3PhotoAssem@8bb7.scrollToPositionWithRightMargin$1");
    }

    public static final void run$1(ARunnableS3S0202000_16 aRunnableS3S0202000_16) {
        C196868120s c196868120s = (C196868120s) aRunnableS3S0202000_16.l0;
        int i = aRunnableS3S0202000_16.i2;
        int i2 = aRunnableS3S0202000_16.i3;
        int[] iArr = (int[]) aRunnableS3S0202000_16.l1;
        c196868120s.getClass();
        C1C7U.LIZ("InfoStickerHelper@8ef8.updateDataOnLayoutChanged$1L");
        if (i != 0 && i2 != 0 && iArr != null) {
            int i3 = iArr[1];
            c196868120s.LLJZ = new Rect(0, i3, i, i2 + i3);
            C1C7U.LIZIZ("InfoStickerHelper@8ef8.updateDataOnLayoutChanged$1L");
            return;
        }
        C1C7U.LIZIZ("InfoStickerHelper@8ef8.updateDataOnLayoutChanged$1L");
    }

    public ARunnableS3S0202000_16(Object obj, Object obj2, int i, int i2, int i3) {
        this.$t = i3;
        this.l0 = obj;
        this.l1 = obj2;
        this.i2 = i;
        this.i3 = i2;
    }
}
