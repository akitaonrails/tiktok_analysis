package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import java.util.List;

/* JADX INFO: renamed from: X.0mne, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1410160mne {
    public final int LIZ;
    public final List<AwemeDraft> LIZIZ;

    public C1410160mne() {
        this(0);
    }

    public C1410160mne(int i) {
        this(0, C13BV.INSTANCE);
    }

    public C1410160mne(int i, List<AwemeDraft> list) {
        this.LIZ = i;
        this.LIZIZ = list;
    }

    public static C1410160mne LIZ(C1410160mne c1410160mne, int i, List list, int i2) {
        if ((i2 & 1) != 0) {
            i = c1410160mne.LIZ;
        }
        if ((i2 & 2) != 0) {
            list = c1410160mne.LIZIZ;
        }
        c1410160mne.getClass();
        return new C1410160mne(i, list);
    }
}
