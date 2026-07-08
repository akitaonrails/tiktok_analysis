package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JHK, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JHK implements InterfaceC0148002o {
    public final Bitmap LL;
    public final PublishModel LLILLJJLI;
    public final String LLILLL;

    public C0JHK() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0JHK)) {
            return false;
        }
        C0JHK c0jhk = (C0JHK) obj;
        return Intrinsics.LJFF(this.LL, c0jhk.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0jhk.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0jhk.LLILLL);
    }

    public final int hashCode() {
        Bitmap bitmap = this.LL;
        int iHashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
        PublishModel publishModel = this.LLILLJJLI;
        return ((iHashCode + (publishModel != null ? publishModel.hashCode() : 0)) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoPublishVMState(coverBitmap=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", publishModel=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", titleText=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0JHK(int i) {
        this(null, null, "");
    }

    public C0JHK(Bitmap bitmap, PublishModel publishModel, String str) {
        this.LL = bitmap;
        this.LLILLJJLI = publishModel;
        this.LLILLL = str;
    }

    public static C0JHK LIZ(C0JHK c0jhk, Bitmap bitmap, PublishModel publishModel, String str, int i) {
        if ((i & 1) != 0) {
            bitmap = c0jhk.LL;
        }
        if ((i & 2) != 0) {
            publishModel = c0jhk.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            str = c0jhk.LLILLL;
        }
        c0jhk.getClass();
        return new C0JHK(bitmap, publishModel, str);
    }
}
