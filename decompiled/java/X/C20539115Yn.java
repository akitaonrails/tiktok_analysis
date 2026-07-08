package X;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.15Yn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20539115Yn implements Serializable {
    public final int downTimeStatus;
    public final int skipDownTimeStatus;
    public final List<C15ZD> weekSettings;

    public C20539115Yn() {
        this(0, 0, new ArrayList());
    }

    public C20539115Yn(int i, int i2, List<C15ZD> list) {
        this.downTimeStatus = i;
        this.skipDownTimeStatus = i2;
        this.weekSettings = list;
    }
}
