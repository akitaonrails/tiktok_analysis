package X;

import androidx.lifecycle.LiveData;

/* JADX INFO: renamed from: X.0EB5, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EB5 {
    public static final LiveData<C0E2C> LIZ(C0E48 c0e48, C0EB6 c0eb6) {
        if (c0eb6 != null) {
            return c0eb6.LJFF();
        }
        return c0e48.S7().LIZ("panel_bounce_event");
    }

    public static final C0E2C LIZIZ(C0E48 c0e48, C0EB6 c0eb6) {
        if (c0eb6 != null) {
            LiveData<C0E2C> liveDataLJFF = c0eb6.LJFF();
            if (liveDataLJFF == null) {
                return null;
            }
            return liveDataLJFF.getValue();
        }
        return (C0E2C) c0e48.S7().LIZJ("panel_bounce_event", null);
    }

    public static final Boolean LIZJ(C0E48 c0e48, C0EB6 c0eb6) {
        if (c0eb6 != null) {
            LiveData<Boolean> liveDataLJI = c0eb6.LJI();
            if (liveDataLJI == null) {
                return null;
            }
            return liveDataLJI.getValue();
        }
        return (Boolean) c0e48.S7().LIZJ("is_bottom_panel_showing", null);
    }
}
