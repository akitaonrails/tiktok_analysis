package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0H9S, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H9S extends FrameLayout {
    public final C417240GXq LL;

    private final int getCenterPinImg() {
        return C960203pA.LIZIZ(getContext()) ? R.drawable.cuz : R.drawable.cv0;
    }

    public C0H9S(Context context) {
        super(context, null);
        C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.e3d, this, true);
        SmartImageView smartImageView = (SmartImageView) findViewById(R.id.r55);
        this.LL = (C417240GXq) findViewById(R.id.r57);
        setBackground(null);
        C1180600gpO c1180600gpO = new C1180600gpO("poi_detail", "poi_detail_nearby_v2", null);
        int centerPinImg = getCenterPinImg();
        c1180600gpO.LJFF = Integer.valueOf(centerPinImg);
        C1189360h3W c1189360h3WLIZJ = c1180600gpO.LIZJ(C1331660kl2.LJFF(centerPinImg));
        c1189360h3WLIZJ.LIZ.LJJIJL(getContext());
        c1189360h3WLIZJ.LJI((int) C339190DRl.LIZ(40), (int) C339190DRl.LIZ(49));
        c1189360h3WLIZJ.LIZ.LJJIII = EnumC1334360kpO.HIGH;
        c1189360h3WLIZJ.LIZLLL(smartImageView);
        c1189360h3WLIZJ.LIZIZ();
    }
}
