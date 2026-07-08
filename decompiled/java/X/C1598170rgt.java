package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rgt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1598170rgt implements InterfaceC1890700zIi, InterfaceC1595240rcA, InterfaceC1597720rgA, InterfaceC1598460rhM {
    public final boolean LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final String LLILZ;
    public final int LLILZIL;

    @Override // X.InterfaceC1595240rcA
    public final String getCellType() {
        return "widget";
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.InterfaceC1598460rhM
    public final String getItemFilterUid(String str) {
        return "ignore";
    }

    @Override // X.InterfaceC1595240rcA
    public final int getReRankSequence() {
        return -1;
    }

    @Override // X.InterfaceC1595240rcA
    public final Integer getReRankType() {
        return -1;
    }

    @Override // X.InterfaceC1595240rcA
    public final User getUser() {
        return null;
    }

    public final int hashCode() {
        return (((((((C786410Ut5.Z2(this.LL) * 31) + this.LLILLJJLI) * 31) + this.LLILLL) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL;
    }

    @Override // X.InterfaceC1595240rcA
    public final boolean isSingleUser() {
        return false;
    }

    @Override // X.InterfaceC1890700zIi
    public final String itemUniqueId() {
        return "skylight_story_guide";
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryWidgetGuideItem(firstTimeGuide=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", iconRes=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", descRes=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", widgetType=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", priority=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1595240rcA
    public final String getUid() {
        return C1595950rdJ.LIZ(this);
    }

    @Override // X.InterfaceC1595240rcA
    public final boolean isUnfollow() {
        return C1595950rdJ.LIZIZ(this);
    }

    @Override // X.InterfaceC1890700zIi
    public final C0ZB9 biz() {
        return C1598110rgn.LIZIZ;
    }

    public /* synthetic */ C1598170rgt(boolean z) {
        this(R.raw.icon_widget_filled, 2131849162, Integer.MAX_VALUE, "story", z);
    }

    @Override // X.InterfaceC1597720rgA
    public final C1598170rgt LLILL(int i) {
        return new C1598170rgt(this.LLILLJJLI, this.LLILLL, i, this.LLILZ, this.LL);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.LJFF(C1598170rgt.class, cls)) {
            return false;
        }
        C1598170rgt c1598170rgt = (C1598170rgt) obj;
        if (this.LL == c1598170rgt.LL && this.LLILLJJLI == c1598170rgt.LLILLJJLI && this.LLILLL == c1598170rgt.LLILLL && Intrinsics.LJFF(this.LLILZ, c1598170rgt.LLILZ) && this.LLILZIL == c1598170rgt.LLILZIL) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1598460rhM
    public final int getItemPriority(int i) {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1890700zIi
    public final C1600120rk2 isItemChanged(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1598170rgt)) {
            return C1600110rk1.LIZ("unknown");
        }
        return C1600110rk1.LIZJ();
    }

    public C1598170rgt(int i, int i2, int i3, String str, boolean z) {
        this.LL = z;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = str;
        this.LLILZIL = i3;
    }
}
