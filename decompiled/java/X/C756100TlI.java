package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* JADX INFO: renamed from: X.0TlI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C756100TlI {
    public String LIZ;
    public String LIZIZ;
    public Room LIZJ;
    public final String LIZLLL;

    public final String LIZ() {
        Room room = this.LIZJ;
        return room != null ? String.valueOf(room.getId()) : "";
    }

    public C756100TlI(EnumC756810TmR enumC756810TmR) {
        String str;
        if (enumC756810TmR == EnumC756810TmR.SLOT_BROADCAST_PREVIEW_TOOLBAR) {
            str = "before_live";
        } else if (enumC756810TmR == EnumC756810TmR.SLOT_LIVE_ANCHOR_TOOLBAR) {
            str = "during_live";
        } else {
            str = "";
        }
        this.LIZLLL = str;
    }
}
