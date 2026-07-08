package X;

import android.os.Bundle;
import java.io.Serializable;

/* JADX INFO: renamed from: X.0Q5N, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q5N implements Serializable {
    public static final int $stable = 0;
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final int LLIZ;
    public final int LLIZLLLIL;

    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt("left", this.LL);
        bundle.putInt("top", this.LLILLJJLI);
        bundle.putInt("container_width", this.LLILLL);
        bundle.putInt("container_height", this.LLILZ);
        bundle.putInt("view_width", this.LLILZIL);
        bundle.putInt("view_height", this.LLILZLL);
        bundle.putInt("source_width", this.LLIZ);
        bundle.putInt("source_height", this.LLIZLLLIL);
        return bundle;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoLocationInfo(left:");
        sbLIZ.append(this.LL);
        sbLIZ.append(", top:");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", container W*H:");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append('*');
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", view W*H:");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append('*');
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", source W*H:");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append('*');
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int getContainerHeight() {
        return this.LLILZ;
    }

    public final int getContainerWidth() {
        return this.LLILLL;
    }

    public final int getLeft() {
        return this.LL;
    }

    public final int getTop() {
        return this.LLILLJJLI;
    }

    public final int getVideoHeight() {
        return this.LLIZLLLIL;
    }

    public final int getVideoWidth() {
        return this.LLIZ;
    }

    public final int getViewHeight() {
        return this.LLILZLL;
    }

    public final int getViewWidth() {
        return this.LLILZIL;
    }

    public C0Q5N(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
        this.LLILZ = i4;
        this.LLILZIL = i5;
        this.LLILZLL = i6;
        this.LLIZ = i7;
        this.LLIZLLLIL = i8;
    }
}
