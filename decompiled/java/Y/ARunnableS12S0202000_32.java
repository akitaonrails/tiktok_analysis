package Y;

import X.C1324840ka2;
import X.C13LP;
import X.C18W7;
import X.C1C7U;
import android.view.View;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.adapter.widget.CoverViewVideoAboveWidget;
import com.ss.android.ugc.aweme.feed.model.live.LiveImageModel;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public class ARunnableS12S0202000_32 implements Runnable {
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
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS12S0202000_32 aRunnableS12S0202000_32) {
        boolean zLIZ;
        String str;
        C1C7U.LIZ("CoverViewVideoAboveWidget@1ea7.bindBackground$1");
        try {
            RemoteImageView remoteImageView = ((CoverViewVideoAboveWidget) aRunnableS12S0202000_32.l0).LLJILJIL;
            List<String> urlList = ((LiveImageModel) aRunnableS12S0202000_32.l1).getUrlList();
            if (urlList == null || (str = (String) C13LP.LJJJLZIJ(0, urlList)) == null) {
                str = "";
            }
            C1324840ka2.LJIIJ(remoteImageView, str, aRunnableS12S0202000_32.i2, aRunnableS12S0202000_32.i3);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CoverViewVideoAboveWidget@1ea7.bindBackground$1");
    }

    public static final void run$1(ARunnableS12S0202000_32 aRunnableS12S0202000_32) {
        boolean zLIZ;
        C1C7U.LIZ("KeyboardHelper@a1f.showKeyboard$1$onWindowFocusChanged$1");
        try {
            if (aRunnableS12S0202000_32.i2 == ((C18W7) aRunnableS12S0202000_32.l0).LJFF && ((View) aRunnableS12S0202000_32.l1).isAttachedToWindow()) {
                ((C18W7) aRunnableS12S0202000_32.l0).LIZJ(aRunnableS12S0202000_32.i3, (View) aRunnableS12S0202000_32.l1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("KeyboardHelper@a1f.showKeyboard$1$onWindowFocusChanged$1");
    }

    public static final void run$2(ARunnableS12S0202000_32 aRunnableS12S0202000_32) {
        boolean zLIZ;
        C1C7U.LIZ("KeyboardHelper@a1f.showKeyboard$2");
        try {
            if (aRunnableS12S0202000_32.i2 == ((C18W7) aRunnableS12S0202000_32.l0).LJFF && ((View) aRunnableS12S0202000_32.l1).isAttachedToWindow()) {
                ((C18W7) aRunnableS12S0202000_32.l0).LIZJ(aRunnableS12S0202000_32.i3, (View) aRunnableS12S0202000_32.l1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("KeyboardHelper@a1f.showKeyboard$2");
    }

    public ARunnableS12S0202000_32(int i, int i2, Object obj, Object obj2, int i3) {
        this.$t = i3;
        this.i2 = i;
        this.l0 = obj2;
        this.l1 = obj;
        this.i3 = i2;
    }
}
