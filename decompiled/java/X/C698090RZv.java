package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.translation.service.IAutoDubbingService;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: renamed from: X.0RZv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C698090RZv implements InterfaceC698070RZt {
    public final String LIZ;
    public final Context LIZIZ;
    public final C19EG LIZJ;
    public final Function1<Integer, Unit> LIZLLL;
    public final boolean LJ;

    @Override // X.InterfaceC698070RZt
    public final Integer LIZIZ() {
        return Integer.valueOf(R.raw.icon_info_circle);
    }

    @Override // X.InterfaceC698070RZt
    public final String LLLII() {
        return this.LIZ;
    }

    @Override // X.InterfaceC698070RZt
    public final View.OnClickListener LIZ(VideoItemParams videoItemParams) {
        boolean z;
        boolean z2;
        IAutoDubbingService iAutoDubbingServiceLIZ = C0RT5.LIZ();
        boolean z3 = true;
        if (iAutoDubbingServiceLIZ != null && iAutoDubbingServiceLIZ.LIZ(videoItemParams.getAweme()) && !C746760TRa.LIZ().LJJLL()) {
            z = true;
        } else {
            z = false;
        }
        if (C299180Bo4.LIZ() && !C299170Bo3.LIZIZ() && C289630BWv.LIZ() == 3) {
            z2 = true;
        } else {
            z2 = false;
            if (!C299170Bo3.LIZIZ()) {
                z3 = false;
            }
        }
        if (!z && !z3) {
            return null;
        }
        return new C698100RZw(this, videoItemParams, z3, z2);
    }

    @Override // X.InterfaceC698070RZt
    public final String LIZJ(VideoItemParams videoItemParams) {
        String string = this.LIZIZ.getString(2131828762);
        if (string == null) {
            return "";
        }
        return string;
    }

    public C698090RZv(Context context, C19EG c19eg, String str, AwS590S0100000_11 awS590S0100000_11, boolean z) {
        this.LIZ = str;
        this.LIZIZ = context;
        this.LIZJ = c19eg;
        this.LIZLLL = awS590S0100000_11;
        this.LJ = z;
    }
}
