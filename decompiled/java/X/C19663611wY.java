package X;

import com.bytedance.android.livesdk.model.Sticker;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.EventUserInfo;

/* JADX INFO: renamed from: X.11wY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19663611wY extends Sticker {
    public static final /* synthetic */ int LJIILJJIL = 0;
    public final long LIZLLL;
    public String LJ;
    public long LJFF;
    public long LJI;
    public final List<EventUserInfo> LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public int LJIIL;
    public final long LJIILIIL = System.currentTimeMillis();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19663611wY)) {
            return false;
        }
        C19663611wY c19663611wY = (C19663611wY) obj;
        return this.LIZLLL == c19663611wY.LIZLLL && Intrinsics.LJFF(this.LJ, c19663611wY.LJ) && this.LJFF == c19663611wY.LJFF && this.LJI == c19663611wY.LJI && Intrinsics.LJFF(this.LJII, c19663611wY.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c19663611wY.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c19663611wY.LJIIIZ);
    }

    public final int hashCode() {
        return (((((((((((C786410Ut5.Y2(this.LIZLLL) * 31) + this.LJ.hashCode()) * 31) + C786410Ut5.Y2(this.LJFF)) * 31) + C786410Ut5.Y2(this.LJI)) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode()) * 31) + this.LJIIIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveEventSticker(liveEventId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", startTime=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", subscribeCount=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", eventUserInfo=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", posX=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", posY=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int LIZ() {
        return (int) ((this.xPosition / C497740JfY.LJIIZILJ()) * 100);
    }

    public C19663611wY(long j, String str, long j2, long j3, List<EventUserInfo> list, String str2, String str3) {
        this.LIZLLL = j;
        this.LJ = str;
        this.LJFF = j2;
        this.LJI = j3;
        this.LJII = list;
        this.LJIIIIZZ = str2;
        this.LJIIIZ = str3;
        this.type = 7;
    }
}
