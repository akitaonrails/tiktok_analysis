package X;

import android.content.SharedPreferences;
import com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0or7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1489190or7 extends C09AY implements Function0<SharedPreferences> {
    public C1489190or7() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final SharedPreferences invoke() {
        C1489200or8.LIZ.getClass();
        IAdTrackDepend iAdTrackDepend = C1489200or8.LIZIZ;
        if (iAdTrackDepend != null) {
            return iAdTrackDepend.LJFF();
        }
        return null;
    }
}
