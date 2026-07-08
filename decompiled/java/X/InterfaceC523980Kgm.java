package X;

import com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumBottomActionBarConfig;
import com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumEventTrackingConfig;
import com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumMediaConfig;
import com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumSelectionConfig;
import com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumUIConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Kgm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC523980Kgm {
    void LIZIZ(Function1<? super AlbumEventTrackingConfig, Unit> function1);

    <T extends AlbumBottomActionBarConfig> void LIZJ(InterfaceC523990Kgn<T> interfaceC523990Kgn, Function1<? super T, Unit> function1);

    void LIZLLL(Function1<? super AlbumSelectionConfig, Unit> function1);

    void LJ(Function1<? super AlbumMediaConfig, Unit> function1);

    void LJFF(Function1<? super AlbumUIConfig, Unit> function1);
}
