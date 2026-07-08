package X;

import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: renamed from: X.15EY, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15EY {
    public final String LIZ;
    public final Text LIZIZ;
    public final boolean LIZJ;
    public final EnumC994550bzJ LIZLLL;

    public C15EY() {
        this(null, null, false, null, 15);
    }

    public C15EY(String str, Text text, boolean z, EnumC994550bzJ enumC994550bzJ, int i) {
        str = (i & 1) != 0 ? "" : str;
        text = (i & 2) != 0 ? null : text;
        z = (i & 4) != 0 ? false : z;
        enumC994550bzJ = (i & 8) != 0 ? EnumC994550bzJ.NORMAL : enumC994550bzJ;
        this.LIZ = str;
        this.LIZIZ = text;
        this.LIZJ = z;
        this.LIZLLL = enumC994550bzJ;
    }
}
