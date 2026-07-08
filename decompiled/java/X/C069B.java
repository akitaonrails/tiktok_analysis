package X;

import com.ss.android.ugc.aweme.im.common.model.ImChatNoticeModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.069B, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C069B implements InterfaceC0148002o {
    public final boolean LL;
    public final C291001Au<EnumC1596306Mv> LLILLJJLI;
    public final C291001Au<C06NH> LLILLL;
    public final ImChatNoticeModel LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C069B)) {
            return false;
        }
        C069B c069b = (C069B) obj;
        return this.LL == c069b.LL && Intrinsics.LJFF(this.LLILLJJLI, c069b.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c069b.LLILLL) && Intrinsics.LJFF(this.LLILZ, c069b.LLILZ);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LL) * 31;
        C291001Au<EnumC1596306Mv> c291001Au = this.LLILLJJLI;
        int iHashCode = (iZ2 + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C291001Au<C06NH> c291001Au2 = this.LLILLL;
        int iHashCode2 = (iHashCode + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        ImChatNoticeModel imChatNoticeModel = this.LLILZ;
        return iHashCode2 + (imChatNoticeModel != null ? imChatNoticeModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommonChatNoticeVmState(isLightThemeOn=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", templatePrepareEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", sceneEndEvent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", imChatNotice=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C069B(boolean z, C291001Au<? extends EnumC1596306Mv> c291001Au, C291001Au<? extends C06NH> c291001Au2, ImChatNoticeModel imChatNoticeModel) {
        this.LL = z;
        this.LLILLJJLI = c291001Au;
        this.LLILLL = c291001Au2;
        this.LLILZ = imChatNoticeModel;
    }

    public static C069B LIZ(C069B c069b, boolean z, C291001Au c291001Au, C291001Au c291001Au2, ImChatNoticeModel imChatNoticeModel, int i) {
        if ((i & 1) != 0) {
            z = c069b.LL;
        }
        if ((i & 2) != 0) {
            c291001Au = c069b.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au2 = c069b.LLILLL;
        }
        if ((i & 8) != 0) {
            imChatNoticeModel = c069b.LLILZ;
        }
        c069b.getClass();
        return new C069B(z, c291001Au, c291001Au2, imChatNoticeModel);
    }
}
