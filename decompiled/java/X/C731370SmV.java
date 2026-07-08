package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SmV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C731370SmV extends C09AY implements Function0<Drawable> {
    public final /* synthetic */ C731340SmS LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C731370SmV(C731340SmS c731340SmS) {
        super(0);
        this.LL = c731340SmS;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Drawable invoke() {
        int i = ((Boolean) C277430Au5.LIZ.getValue()).booleanValue() ? R.raw.icon_color_bookmark_yellow_shadow_alt_1 : R.drawable.bwr;
        if (C296090Bj5.LIZ()) {
            this.LL.getClass();
            int iLIZIZ = C296090Bj5.LIZIZ();
            if (iLIZIZ == 1) {
                i = R.raw.icon_media_favoriate_active;
            } else if (iLIZIZ == 2) {
                i = R.raw.icon_exp_exp_01_icon_media_favoriate_active;
            } else if (iLIZIZ == 3) {
                i = R.raw.icon_exp_exp_02_icon_media_favoriate_active;
            }
        }
        C731340SmS c731340SmS = this.LL;
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        c731340SmS.getClass();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = i;
        c419910GdJ.LIZIZ = c731340SmS.LJFF();
        c419910GdJ.LIZJ = c731340SmS.LJFF();
        return c419910GdJ.LIZ(contextLIZ);
    }
}
