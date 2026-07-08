package X;

import com.bytedance.android.livesdk.chatroom.api.LiveSubOnlyConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01ig, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C410401ig implements InterfaceC0148002o {
    public final boolean LL;
    public final boolean LLILLJJLI;
    public final C291001Au<Boolean> LLILLL;
    public final LiveSubOnlyConfig LLILZ;

    public C410401ig() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C410401ig)) {
            return false;
        }
        C410401ig c410401ig = (C410401ig) obj;
        return this.LL == c410401ig.LL && this.LLILLJJLI == c410401ig.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c410401ig.LLILLL) && Intrinsics.LJFF(this.LLILZ, c410401ig.LLILZ);
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.LL) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31;
        C291001Au<Boolean> c291001Au = this.LLILLL;
        int iHashCode = (iZ2 + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        LiveSubOnlyConfig liveSubOnlyConfig = this.LLILZ;
        return iHashCode + (liveSubOnlyConfig != null ? liveSubOnlyConfig.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubOnlyLiveSettingDialogState(enableSubOnlyLive=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", enableMusicLive=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isMusicChecked=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", config=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C410401ig(int i) {
        this(true, true, null, null);
    }

    public C410401ig(boolean z, boolean z2, C291001Au<Boolean> c291001Au, LiveSubOnlyConfig liveSubOnlyConfig) {
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = c291001Au;
        this.LLILZ = liveSubOnlyConfig;
    }

    public static C410401ig LIZ(C410401ig c410401ig, boolean z, boolean z2, C291001Au c291001Au, LiveSubOnlyConfig liveSubOnlyConfig, int i) {
        if ((i & 1) != 0) {
            z = c410401ig.LL;
        }
        if ((i & 2) != 0) {
            z2 = c410401ig.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au = c410401ig.LLILLL;
        }
        if ((i & 8) != 0) {
            liveSubOnlyConfig = c410401ig.LLILZ;
        }
        c410401ig.getClass();
        return new C410401ig(z, z2, c291001Au, liveSubOnlyConfig);
    }
}
