package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0EKG, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EKG {
    public final Keva LIZ = Keva.getRepo("caption_sticker");

    public final boolean LIZ() {
        return this.LIZ.getBoolean("last_selected_apply_to_all", true);
    }

    public final void LIZIZ(boolean z) {
        this.LIZ.storeBoolean("last_selected_apply_to_all", z);
    }
}
