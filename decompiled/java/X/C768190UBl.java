package X;

import com.bytedance.android.live.effect.music.entity.Accompaniment;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UBl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C768190UBl implements Serializable {
    public final Accompaniment accompaniment;
    public final DownloadInfo downloadInfo;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C768190UBl)) {
            return false;
        }
        C768190UBl c768190UBl = (C768190UBl) obj;
        return Intrinsics.LJFF(this.downloadInfo, c768190UBl.downloadInfo) && Intrinsics.LJFF(this.accompaniment, c768190UBl.accompaniment);
    }

    public C768190UBl(DownloadInfo downloadInfo, Accompaniment accompaniment) {
        this.downloadInfo = downloadInfo;
        this.accompaniment = accompaniment;
    }
}
