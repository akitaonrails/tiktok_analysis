package X;

import com.bytedance.android.livesdk.chatroom.api.LiveSubOnlyConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JaT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C494590JaT implements InterfaceC0148002o {
    public final C291001Au<Boolean> LL;
    public final C291001Au<Boolean> LLILLJJLI;
    public final LiveSubOnlyConfig LLILLL;

    public C494590JaT() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C494590JaT)) {
            return false;
        }
        C494590JaT c494590JaT = (C494590JaT) obj;
        return Intrinsics.LJFF(this.LL, c494590JaT.LL) && Intrinsics.LJFF(this.LLILLJJLI, c494590JaT.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c494590JaT.LLILLL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        LiveSubOnlyConfig liveSubOnlyConfig = this.LLILLL;
        return iHashCode + (liveSubOnlyConfig == null ? 0 : liveSubOnlyConfig.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubOnlyLivePreviewSettingDialogState(previewLiveSwitcherStatus=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", previewLiveIsEnable=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", config=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C494590JaT(int i) {
        this(new C291001Au(Boolean.TRUE), new C291001Au(Boolean.FALSE), null);
    }

    public C494590JaT(C291001Au<Boolean> c291001Au, C291001Au<Boolean> c291001Au2, LiveSubOnlyConfig liveSubOnlyConfig) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
        this.LLILLL = liveSubOnlyConfig;
    }

    public static C494590JaT LIZ(C494590JaT c494590JaT, C291001Au c291001Au, C291001Au c291001Au2, int i) {
        LiveSubOnlyConfig liveSubOnlyConfig;
        if ((i & 1) != 0) {
            c291001Au = c494590JaT.LL;
        }
        if ((i & 2) != 0) {
            c291001Au2 = c494590JaT.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            liveSubOnlyConfig = c494590JaT.LLILLL;
        } else {
            liveSubOnlyConfig = null;
        }
        c494590JaT.getClass();
        return new C494590JaT(c291001Au, c291001Au2, liveSubOnlyConfig);
    }
}
