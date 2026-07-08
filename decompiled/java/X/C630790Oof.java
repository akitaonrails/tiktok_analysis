package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.0Oof, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C630790Oof implements Serializable {
    public static final C630780Ooe Companion = new C630780Ooe();
    public static final C630790Oof NONE = new C630790Oof(false, 0, false);
    public final boolean disableCollect;
    public final boolean isPgc;
    public final int originSoundExp;

    public final boolean isPgc() {
        return this.isPgc;
    }

    public C630790Oof(boolean z, int i, boolean z2) {
        this.isPgc = z;
        this.originSoundExp = i;
        this.disableCollect = z2;
    }
}
