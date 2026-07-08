package X;

import com.bytedance.android.live.base.model.ImageModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bg0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C982580bg0 extends AbstractC982800bgM {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final long LJFF;
    public final ImageModel LJI;
    public final long LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C982580bg0)) {
            return false;
        }
        C982580bg0 c982580bg0 = (C982580bg0) obj;
        return this.LJFF == c982580bg0.LJFF && Intrinsics.LJFF(this.LJI, c982580bg0.LJI) && this.LJII == c982580bg0.LJII;
    }

    public final int hashCode() {
        return (((C786410Ut5.Y2(this.LJFF) * 31) + this.LJI.hashCode()) * 31) + C786410Ut5.Y2(this.LJII);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CatchBeansAvatarMessage(giftId=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", imageModel=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", incrementalAvatarCount=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C982580bg0(C983550bhZ c983550bhZ) {
        long j = c983550bhZ.LJFF;
        ImageModel imageModel = c983550bhZ.LJI;
        long j2 = c983550bhZ.LJII;
        this.LJFF = j;
        this.LJI = imageModel;
        this.LJII = j2;
    }
}
