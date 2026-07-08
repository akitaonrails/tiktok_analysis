package X;

import com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumBottomActionBarConfig;
import com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumEventTrackingConfig;
import com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumMediaConfig;
import com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumOutputConfig;
import com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumPluginAdaptConfig;
import com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumSelectionConfig;
import com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumSelectionMode;
import com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumUIConfig;
import com.ss.android.ugc.aweme.shortvideo.album.api.config.builtin.AlbumDefaultBottomActionBarConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS239S0000000_8;

/* JADX INFO: renamed from: X.0Kgl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C523970Kgl implements InterfaceC523980Kgm {
    public AlbumDefaultBottomActionBarConfig LIZIZ;
    public InterfaceC523990Kgn<?> LIZ = C524040Kgs.LIZIZ;
    public final AlbumMediaConfig LIZJ = new AlbumMediaConfig(0);
    public final AlbumSelectionConfig LIZLLL = new AlbumSelectionConfig(0);
    public final AlbumEventTrackingConfig LJ = new AlbumEventTrackingConfig(0);
    public final AlbumUIConfig LJFF = new AlbumUIConfig(0);
    public final AlbumOutputConfig LJI = new AlbumOutputConfig(0);
    public final AlbumPluginAdaptConfig LJII = new AlbumPluginAdaptConfig(true);

    @Override // X.InterfaceC523980Kgm
    public final void LIZIZ(Function1<? super AlbumEventTrackingConfig, Unit> function1) {
        function1.invoke(this.LJ);
    }

    @Override // X.InterfaceC523980Kgm
    public final void LIZLLL(Function1<? super AlbumSelectionConfig, Unit> function1) {
        function1.invoke(this.LIZLLL);
        if (this.LIZLLL.mode instanceof AlbumSelectionMode.Single) {
            LIZJ(C524040Kgs.LIZIZ, AFwS239S0000000_8.get$arr$(0));
        } else {
            if (!(this.LIZ instanceof C524040Kgs)) {
                return;
            }
            LIZJ(C523950Kgj.LIZIZ, AFwS239S0000000_8.get$arr$(0));
        }
    }

    @Override // X.InterfaceC523980Kgm
    public final void LJ(Function1<? super AlbumMediaConfig, Unit> function1) {
        function1.invoke(this.LIZJ);
    }

    @Override // X.InterfaceC523980Kgm
    public final void LJFF(Function1<? super AlbumUIConfig, Unit> function1) {
        function1.invoke(this.LJFF);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC523980Kgm
    public final <T extends AlbumBottomActionBarConfig> void LIZJ(InterfaceC523990Kgn<T> interfaceC523990Kgn, Function1<? super T, Unit> function1) {
        this.LIZ = interfaceC523990Kgn;
        if ((interfaceC523990Kgn instanceof C523960Kgk) || (interfaceC523990Kgn instanceof C523950Kgj)) {
            AlbumDefaultBottomActionBarConfig albumDefaultBottomActionBarConfig = new AlbumDefaultBottomActionBarConfig(0);
            function1.invoke(albumDefaultBottomActionBarConfig);
            this.LIZIZ = albumDefaultBottomActionBarConfig;
        }
    }
}
