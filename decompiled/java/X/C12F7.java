package X;

import android.graphics.Bitmap;
import java.io.Serializable;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.12F7, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12F7 implements Serializable {
    public static final int $stable = 8;
    public final List<Pair<Boolean, Bitmap>> bitmaps;
    public final C12F8 listener;
    public final InterfaceC665370Q7z scope;

    public C12F7(List<Pair<Boolean, Bitmap>> list, InterfaceC665370Q7z interfaceC665370Q7z, C12F8 c12f8) {
        this.bitmaps = list;
        this.scope = interfaceC665370Q7z;
        this.listener = c12f8;
    }
}
