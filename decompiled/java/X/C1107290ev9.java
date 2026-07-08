package X;

import android.text.Spannable;
import android.text.SpannableString;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LivePcsPinCardActiveTimeSecondsSetting;

/* JADX INFO: renamed from: X.0ev9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1107290ev9 {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LJIIIZ;
    public ImageModel LJIIJ;
    public String LIZLLL = "";
    public String LJ = "";
    public String LJFF = "";
    public String LJI = "";
    public final long LJII = LivePcsPinCardActiveTimeSecondsSetting.INSTANCE.getValue();
    public String LJIIIIZZ = "";
    public String LJIIJJI = "";

    public final Spannable LIZ() {
        if (this.LJIIIZ == 0) {
            return null;
        }
        int i = this.LIZ;
        if (i == 3) {
            int i2 = this.LJIIIZ;
            return new SpannableString(C497740JfY.LJIIL(2131755970, i2, Integer.valueOf(i2)));
        }
        if (i == 4) {
            int i3 = this.LJIIIZ;
            return new SpannableString(C497740JfY.LJIIL(2131755971, i3, Integer.valueOf(i3)));
        }
        if (i == 6) {
            int i4 = this.LJIIIZ;
            return new SpannableString(C497740JfY.LJIIL(2131755969, i4, Integer.valueOf(i4)));
        }
        if (i == 7) {
            int i5 = this.LJIIIZ;
            return new SpannableString(C497740JfY.LJIIL(2131755968, i5, Integer.valueOf(i5)));
        }
        if (i != 8) {
            int i6 = this.LJIIIZ;
            return new SpannableString(C497740JfY.LJIIL(2131755968, i6, Integer.valueOf(i6)));
        }
        int i7 = this.LJIIIZ;
        return new SpannableString(C497740JfY.LJIIL(2131755972, i7, Integer.valueOf(i7)));
    }
}
