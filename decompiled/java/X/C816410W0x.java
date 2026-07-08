package X;

import android.os.Parcel;

/* JADX INFO: renamed from: X.0W0x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C816410W0x extends RuntimeException {
    public C816410W0x(String str, Parcel parcel) {
        super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
    }
}
