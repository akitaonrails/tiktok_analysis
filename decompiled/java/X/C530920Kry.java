package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Size;
import android.widget.ImageView;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0Kry, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C530920Kry implements InterfaceC529880KqI {
    public final Context LIZ;
    public final C01GW LIZIZ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS552S0100000_8(this, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));

    public C530920Kry(Context context) {
        this.LIZ = context;
    }

    @Override // X.InterfaceC529880KqI
    public final void LIZ(C529750Kq5 c529750Kq5, Size size, TikTokMediaModel tikTokMediaModel, InterfaceC529900KqK interfaceC529900KqK, boolean z) {
        ImageView.ScaleType scaleType;
        if (C23214097s.LIZ()) {
            size = new Size((int) (size.getWidth() * C274430ApF.LIZ()), (int) (size.getHeight() * C274430ApF.LIZ()));
        }
        c529750Kq5.LL.setImageDrawable((Drawable) this.LIZIZ.getValue());
        C433800Gzi c433800Gzi = c529750Kq5.LL;
        if (C529990KqT.LIZ(tikTokMediaModel, z)) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        } else {
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        c433800Gzi.setScaleType(scaleType);
        interfaceC529900KqK.LIZIZ();
        c529750Kq5.LLJLILLLLZIIL = C23215097t.LIZLLL(c529750Kq5.LL, tikTokMediaModel, size, new C530930Krz(c529750Kq5, interfaceC529900KqK, z, tikTokMediaModel, this));
    }
}
