package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iwS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1261860iwS extends User implements InterfaceC1262230ix3, InterfaceC1891350zJl, InterfaceC887660Ys0<C1261860iwS>, InterfaceC1890700zIi {
    public int LL;
    public AbstractC1261010iv5 LLILLJJLI;
    public Integer LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public int LLIZ;

    public C1261860iwS() {
        this(-1);
    }

    @Override // X.InterfaceC1891350zJl
    public Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.InterfaceC887660Ys0
    public boolean getEnableSelect() {
        return false;
    }

    @Override // X.InterfaceC887660Ys0
    public Function1<InterfaceC887660Ys0<?>, Unit> getOnSelect() {
        return null;
    }

    @Override // X.InterfaceC887660Ys0
    public boolean isSelected() {
        return false;
    }

    @Override // X.InterfaceC887660Ys0
    public boolean getDisplayInMultiSelectMode() {
        return !C1910990zpR.LIZIZ.LIZLLL();
    }

    public final boolean isRelatedRec() {
        return this.LLILLJJLI instanceof C1261000iv4;
    }

    @Override // X.InterfaceC1262230ix3
    public String getElementId() {
        return C1260990iv3.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.profile.model.User
    public int hashCode() {
        int iHashCode = getUid().hashCode() + C786410Ut5.Z2(isRemoved());
        Object obj = this.LLILLJJLI;
        if (obj == null) {
            obj = C1261020iv6.INSTANCE;
        }
        return iHashCode + obj.hashCode();
    }

    @Override // X.InterfaceC1890700zIi
    public String itemUniqueId() {
        return C1260990iv3.LIZ(this);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[RecUser(");
        sbLIZ.append(getNickname());
        sbLIZ.append(", uid: ");
        sbLIZ.append(getUid());
        sbLIZ.append(")]");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1890700zIi
    public C0ZB9 biz() {
        return C890710Ywv.LIZIZ;
    }

    public final Integer getAliasPermission() {
        return this.LLILLL;
    }

    public final AbstractC1261010iv5 getFrom() {
        return this.LLILLJJLI;
    }

    public final int getImprOrder() {
        return this.LL;
    }

    public int getStoryStatusForInbox() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC887660Ys0
    public boolean isInMultiSelectMode() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1262230ix3
    public boolean isRemoved() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC887660Ys0
    public boolean isSwitchingMode() {
        return this.LLILZIL;
    }

    public C1261860iwS(int i) {
        this.LL = i;
        this.LLIZ = -1;
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1261860iwS)) {
            return false;
        }
        C1261860iwS c1261860iwS = (C1261860iwS) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(getUid(), c1261860iwS.getUid()) || isInMultiSelectMode() != c1261860iwS.isInMultiSelectMode() || !Intrinsics.LJFF(this.LLILLJJLI, c1261860iwS.LLILLJJLI)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(this, interfaceC1891350zJl);
    }

    @Override // com.ss.android.ugc.aweme.profile.model.User
    public boolean equals(Object obj) {
        if (!(obj instanceof C1261860iwS)) {
            return false;
        }
        C1261860iwS c1261860iwS = (C1261860iwS) obj;
        if (!Intrinsics.LJFF(c1261860iwS.getUid(), getUid()) || c1261860iwS.isRemoved() != isRemoved() || !Intrinsics.LJFF(c1261860iwS.LLILLJJLI, this.LLILLJJLI)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1890700zIi
    public C1600120rk2 isItemChanged(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1261860iwS)) {
            return C1600110rk1.LIZ("unknown");
        }
        return C1600110rk1.LIZJ();
    }

    public final void setAliasPermission(Integer num) {
        this.LLILLL = num;
    }

    public final void setFrom(AbstractC1261010iv5 abstractC1261010iv5) {
        this.LLILLJJLI = abstractC1261010iv5;
    }

    public final void setImprOrder(int i) {
        this.LL = i;
    }

    @Override // X.InterfaceC1262230ix3
    public void setRemoved(boolean z) {
        this.LLILZLL = z;
    }

    public void setStoryStatusForInbox(int i) {
        this.LLIZ = i;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC887660Ys0
    public C1261860iwS copyData(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Function1<? super InterfaceC887660Ys0<?>, Unit> function1) {
        C1261860iwS c1261860iwS = (C1261860iwS) m307clone();
        c1261860iwS.LL = this.LL;
        c1261860iwS.LLILLJJLI = this.LLILLJJLI;
        c1261860iwS.setRemoved(isRemoved());
        c1261860iwS.LLILZ = z;
        c1261860iwS.LLILZIL = z4;
        return c1261860iwS;
    }

    @Override // X.InterfaceC887660Ys0
    public /* bridge */ /* synthetic */ C1261860iwS copyData(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Function1 function1) {
        return copyData(z, z2, z3, z4, z5, (Function1<? super InterfaceC887660Ys0<?>, Unit>) function1);
    }
}
