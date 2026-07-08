package X;

import android.graphics.drawable.Drawable;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0U9i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C767640U9i {
    public static final C767670U9l LJII = C767670U9l.LL;
    public final LiveEffect LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final Drawable LIZLLL = null;
    public final EnumC767650U9j LJ;
    public final boolean LJFF;
    public boolean LJI;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InsertSticker(effect=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", fromUserId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", startTime=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", localDrawable=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", insertStickerType=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", isBackground=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C767640U9i)) {
            return false;
        }
        C767640U9i c767640U9i = (C767640U9i) obj;
        if (!Intrinsics.LJFF(this.LIZ, c767640U9i.LIZ) || this.LIZIZ != c767640U9i.LIZIZ || this.LIZJ != c767640U9i.LIZJ || this.LJFF != c767640U9i.LJFF) {
            return false;
        }
        return true;
    }

    public C767640U9i(LiveEffect liveEffect, long j, long j2, EnumC767650U9j enumC767650U9j, boolean z) {
        this.LIZ = liveEffect;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LJ = enumC767650U9j;
        this.LJFF = z;
    }
}
