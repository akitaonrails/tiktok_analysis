package X;

import com.ss.android.ugc.aweme.inbox.widget.multi.RedPoint;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZAc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C895240ZAc extends AbstractC895380ZAq implements InterfaceC887660Ys0<C895240ZAc>, InterfaceC1903450zdH {
    public final int LLILLJJLI;
    public final int LLILLL;
    public final String LLILZ;
    public final RedPoint LLILZIL;
    public final long LLILZLL;
    public final boolean LLIZ;
    public final Map<String, String> LLIZLLLIL;
    public final int LLJ;
    public final boolean LLJI;
    public final boolean LLJIJIL;
    public final boolean LLJILJIL;
    public final boolean LLJILJILJ;
    public final int LLJILLL;
    public final long LLJJ;

    @Override // X.AbstractC895380ZAq
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C895240ZAc)) {
            return false;
        }
        C895240ZAc c895240ZAc = (C895240ZAc) obj;
        return this.LLILLJJLI == c895240ZAc.LLILLJJLI && this.LLILLL == c895240ZAc.LLILLL && Intrinsics.LJFF(this.LLILZ, c895240ZAc.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c895240ZAc.LLILZIL) && this.LLILZLL == c895240ZAc.LLILZLL && this.LLIZ == c895240ZAc.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c895240ZAc.LLIZLLLIL) && this.LLJ == c895240ZAc.LLJ && this.LLJI == c895240ZAc.LLJI && this.LLJIJIL == c895240ZAc.LLJIJIL && this.LLJILJIL == c895240ZAc.LLJILJIL;
    }

    @Override // X.InterfaceC887660Ys0
    public final boolean getEnableSelect() {
        return false;
    }

    @Override // X.InterfaceC887660Ys0
    public final Function1<InterfaceC887660Ys0<?>, Unit> getOnSelect() {
        return null;
    }

    @Override // X.AbstractC895380ZAq
    public final int hashCode() {
        return (((((((((((((((((((this.LLILLJJLI * 31) + this.LLILLL) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + C786410Ut5.Y2(this.LLILZLL)) * 31) + C786410Ut5.Z2(this.LLIZ)) * 31) + this.LLIZLLLIL.hashCode()) * 31) + this.LLJ) * 31) + C786410Ut5.Z2(this.LLJI)) * 31) + C786410Ut5.Z2(this.LLJIJIL)) * 31) + C786410Ut5.Z2(this.LLJILJIL);
    }

    @Override // X.InterfaceC887660Ys0
    public final boolean isSelected() {
        return false;
    }

    @Override // X.InterfaceC1890700zIi
    public final String itemUniqueId() {
        return "archive_entrance";
    }

    public final String toString() {
        return "ArchiveEntrancePod(titleRes=" + this.LLILLJJLI + ", iconRes=" + this.LLILLL + ", newNoticeContent=" + this.LLILZ + ", readPoint=" + this.LLILZIL + ", createTime=" + this.LLILZLL + ", isPreviewHighValueUnreadItems=" + this.LLIZ + ", eventTrackingExtra=" + this.LLIZLLLIL + ", priority=" + this.LLJ + ", displayInMultiSelectMode=" + this.LLJI + ", isInMultiSelectMode=" + this.LLJIJIL + ", isSwitchingMode=" + this.LLJILJIL + ')';
    }

    @Override // X.InterfaceC1903450zdH
    public final String uniqueItemIdForFirstScreen() {
        return "archive_entrance";
    }

    @Override // X.AbstractC895380ZAq
    public final C890610Ywl convertToInboxEntranceWrapper$awemenotice_release() {
        long j = this.LLILZLL;
        int i = this.type;
        boolean z = this.LLJILJILJ;
        RedPoint redPoint = this.LLILZIL;
        int i2 = redPoint.unreadCount;
        int i3 = C895260ZAe.LIZ[redPoint.type.ordinal()];
        int i4 = 1;
        if (i3 != 1) {
            i4 = 2;
            if (i3 != 2) {
                i4 = 0;
            }
        }
        return new C890610Ywl(0, j, i, z, this, new C0ZA7(i2, i4, -1), 64);
    }

    @Override // X.InterfaceC1890700zIi
    public final C0ZB9 biz() {
        return new C0ZB9() { // from class: X.0ZAf
        };
    }

    @Override // X.InterfaceC887660Ys0
    public final boolean getDisplayInMultiSelectMode() {
        return this.LLJI;
    }

    @Override // X.InterfaceC887560Yrq
    public final int getPriorityInInbox() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC887560Yrq
    public final long getTimestampInInbox() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC887660Ys0
    public final boolean isInMultiSelectMode() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC887660Ys0
    public final boolean isSwitchingMode() {
        return this.LLJILJIL;
    }

    @Override // X.AbstractC895380ZAq
    public final boolean isUnread() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC1890700zIi
    public final C1600120rk2 isItemChanged(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C895240ZAc)) {
            return C1600110rk1.LIZ("unknown");
        }
        return C1600110rk1.LIZJ();
    }

    public static C895240ZAc LIZ(C895240ZAc c895240ZAc, int i, boolean z, boolean z2, boolean z3, int i2) {
        int i3;
        int i4;
        String str;
        RedPoint redPoint;
        long j;
        boolean z4 = z3;
        boolean z5 = z2;
        boolean z6 = z;
        int i5 = i;
        boolean z7 = false;
        if ((i2 & 1) != 0) {
            i3 = c895240ZAc.LLILLJJLI;
        } else {
            i3 = 0;
        }
        if ((i2 & 2) != 0) {
            i4 = c895240ZAc.LLILLL;
        } else {
            i4 = 0;
        }
        Map<String, String> map = null;
        if ((i2 & 4) != 0) {
            str = c895240ZAc.LLILZ;
        } else {
            str = null;
        }
        if ((i2 & 8) != 0) {
            redPoint = c895240ZAc.LLILZIL;
        } else {
            redPoint = null;
        }
        if ((i2 & 16) != 0) {
            j = c895240ZAc.LLILZLL;
        } else {
            j = 0;
        }
        if ((i2 & 32) != 0) {
            z7 = c895240ZAc.LLIZ;
        }
        if ((i2 & 64) != 0) {
            map = c895240ZAc.LLIZLLLIL;
        }
        if ((i2 & 128) != 0) {
            i5 = c895240ZAc.LLJ;
        }
        if ((i2 & 256) != 0) {
            z6 = c895240ZAc.LLJI;
        }
        if ((i2 & 512) != 0) {
            z5 = c895240ZAc.LLJIJIL;
        }
        if ((i2 & 1024) != 0) {
            z4 = c895240ZAc.LLJILJIL;
        }
        c895240ZAc.getClass();
        return new C895240ZAc(i3, i4, str, redPoint, j, z7, map, i5, z6, z5, z4);
    }

    @Override // X.InterfaceC887660Ys0
    public final C895240ZAc copyData(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Function1 function1) {
        return LIZ(this, 0, z5, z, z4, 255);
    }

    public C895240ZAc(int i, int i2, String str, RedPoint redPoint, long j, boolean z, Map<String, String> map, int i3, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        super(204);
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = str;
        this.LLILZIL = redPoint;
        this.LLILZLL = j;
        this.LLIZ = z;
        this.LLIZLLLIL = map;
        this.LLJ = i3;
        this.LLJI = z2;
        this.LLJIJIL = z3;
        this.LLJILJIL = z4;
        if (redPoint.unreadCount > 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.LLJILJILJ = z5;
        this.LLJILLL = i3;
        this.LLJJ = j;
    }
}
