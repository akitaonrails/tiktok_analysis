package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS191S0000000_5;

/* JADX INFO: renamed from: X.0I7S, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I7S extends FrameLayout {
    public final SmartImageView LL;
    public final TuxTextView LLILLJJLI;
    public final C01GW LLILLL;

    private final C1331730kl9 getDisplayOption() {
        return (C1331730kl9) this.LLILLL.getValue();
    }

    public C0I7S(Context context) {
        super(context, null, 0);
        this.LLILLL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(294));
        C954703oH.LIZ(context, R.layout.atm, this, true);
        this.LL = (SmartImageView) findViewById(R.id.kfa);
        this.LLILLJJLI = (TuxTextView) findViewById(R.id.xuy);
    }

    public final void LIZ(Image image) {
        if (this.LL != null && image != null) {
            C1326790kdB c1326790kdB = C1326790kdB.LIZ;
            C03IT thumbFirstImageUrlModel = image.toThumbFirstImageUrlModel();
            c1326790kdB.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(thumbFirstImageUrlModel);
            c1331670kl3LIZLLL.LJJI = getDisplayOption();
            c1331670kl3LIZLLL.LJJ(this.LL);
            C786410Ut5.h3(c1331670kl3LIZLLL);
        }
    }
}
