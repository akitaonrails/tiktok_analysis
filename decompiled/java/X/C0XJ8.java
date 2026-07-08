package X;

import android.content.SharedPreferences;
import com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.AwS578S0100000_34;

/* JADX INFO: renamed from: X.0XJ8, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XJ8 implements IAdTrackDepend {
    public static final C0XJ8 LIZIZ = new C0XJ8();
    public final /* synthetic */ IAdTrackDepend LIZ = (IAdTrackDepend) ServiceManager.get().getService(IAdTrackDepend.class);

    @Override // com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    public final int LIZ(Exception exc) {
        return this.LIZ.LIZ(exc);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    public final String LIZIZ(String str, String str2) {
        return this.LIZ.LIZIZ(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    public final String LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    public final String LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    public final boolean LJ() {
        return this.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    public final SharedPreferences LJFF() {
        return this.LIZ.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    public final void LJI(AwS578S0100000_34 awS578S0100000_34) {
        this.LIZ.LJI(awS578S0100000_34);
    }
}
