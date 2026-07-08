package X;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;

/* JADX INFO: renamed from: X.0WIo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C821000WIo {
    public final Bundle LIZ;

    public final MediaMetadataCompat LIZ() {
        return new MediaMetadataCompat(this.LIZ);
    }

    public C821000WIo() {
        this.LIZ = new Bundle();
    }

    public C821000WIo(MediaMetadataCompat mediaMetadataCompat) {
        Bundle bundle = new Bundle(mediaMetadataCompat.LL);
        this.LIZ = bundle;
        MediaSessionCompat.LIZ(bundle);
    }

    public final void LIZJ(long j) {
        C830490Whz<String, Integer> c830490Whz = MediaMetadataCompat.LLILLJJLI;
        if (c830490Whz.containsKey("android.media.metadata.DURATION") && c830490Whz.get("android.media.metadata.DURATION").intValue() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("The ");
            sbLIZ.append("android.media.metadata.DURATION");
            sbLIZ.append(" key cannot be used to put a long");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LIZ.putLong("android.media.metadata.DURATION", j);
    }

    public final void LIZIZ(Bitmap bitmap, String str) {
        C830490Whz<String, Integer> c830490Whz = MediaMetadataCompat.LLILLJJLI;
        if (c830490Whz.containsKey(str) && c830490Whz.get(str).intValue() != 2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("The ");
            sbLIZ.append(str);
            sbLIZ.append(" key cannot be used to put a Bitmap");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        C786410Ut5.LJJIJL(this.LIZ, str, bitmap);
    }

    public final void LIZLLL(String str, String str2) {
        C830490Whz<String, Integer> c830490Whz = MediaMetadataCompat.LLILLJJLI;
        if (c830490Whz.containsKey(str) && c830490Whz.get(str).intValue() != 1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("The ");
            sbLIZ.append(str);
            sbLIZ.append(" key cannot be used to put a String");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        C786410Ut5.LJJIJIIJI(this.LIZ, str, str2);
    }
}
