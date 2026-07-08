package X;

import com.bytedance.android.livesdk.model.message.PunishEventInfo;

/* JADX INFO: renamed from: X.0UgK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C778500UgK {
    public final CharSequence LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;
    public final PunishEventInfo LIZLLL;
    public final Object LJ;

    public /* synthetic */ C778500UgK(CharSequence charSequence, int i, Object obj, int i2) {
        this(i, null, charSequence, (i2 & 16) != 0 ? null : obj, true);
    }

    public C778500UgK(int i, PunishEventInfo punishEventInfo, CharSequence charSequence, Object obj, boolean z) {
        this.LIZ = charSequence;
        this.LIZIZ = z;
        this.LIZJ = i;
        this.LIZLLL = punishEventInfo;
        this.LJ = obj;
    }
}
