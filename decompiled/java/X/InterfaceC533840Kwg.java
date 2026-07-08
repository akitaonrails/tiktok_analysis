package X;

import android.content.Context;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.List;

/* JADX INFO: renamed from: X.0Kwg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC533840Kwg {
    C443120HZe<Boolean, Integer, Long> checkMediaDurationValid(Context context, List<? extends MediaModel> list, long j, long j2);

    void tryPreloadMediaAfterAlbumPermissionGranted(C19EG c19eg);
}
