package X;

import com.google.android.gms.auth.blockstore.StoreBytesData;

/* JADX INFO: renamed from: X.0Wpa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C835200Wpa {
    public byte[] LIZ;
    public boolean LIZIZ;
    public String LIZJ = "com.google.android.gms.auth.blockstore.DEFAULT_BYTES_DATA_KEY";

    public final StoreBytesData LIZ() {
        return new StoreBytesData(this.LIZJ, this.LIZ, this.LIZIZ);
    }
}
