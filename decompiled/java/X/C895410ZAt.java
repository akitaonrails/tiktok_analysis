package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ZAt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C895410ZAt extends AbstractC895380ZAq implements InterfaceC887660Ys0<C895410ZAt> {
    public final EnumC1903600zdW LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;
    public final int LLILZLL;

    public C895410ZAt() {
        this(0);
    }

    @Override // X.InterfaceC887660Ys0
    public final boolean getEnableSelect() {
        return false;
    }

    @Override // X.InterfaceC887660Ys0
    public final Function1<InterfaceC887660Ys0<?>, Unit> getOnSelect() {
        return null;
    }

    @Override // X.InterfaceC887560Yrq
    public final long getTimestampInInbox() {
        return 0L;
    }

    @Override // X.InterfaceC887660Ys0
    public final boolean isSelected() {
        return false;
    }

    @Override // X.AbstractC895380ZAq
    public final boolean isUnread() {
        return false;
    }

    @Override // X.InterfaceC1890700zIi
    public final String itemUniqueId() {
        return "sys_push_permission";
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SystemPushPermissionPod(displayLocation=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", displayInMultiSelectMode=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isInMultiSelectMode=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isSwitchingMode=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC895380ZAq
    public final C890610Ywl convertToInboxEntranceWrapper$awemenotice_release() {
        return new C890610Ywl(LSPassThroughRecordSizeConfig.DEFAULT, 0L, this.type, false, this, null, 96);
    }

    @Override // X.AbstractC895380ZAq
    public final int hashCode() {
        return super.hashCode();
    }

    @Override // X.InterfaceC1890700zIi
    public final C0ZB9 biz() {
        return C895430ZAv.LIZIZ;
    }

    @Override // X.InterfaceC887660Ys0
    public final boolean getDisplayInMultiSelectMode() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC887560Yrq
    public final int getPriorityInInbox() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC887660Ys0
    public final boolean isInMultiSelectMode() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC887660Ys0
    public final boolean isSwitchingMode() {
        return this.LLILZIL;
    }

    public /* synthetic */ C895410ZAt(int i) {
        this(EnumC1903600zdW.TOP, !C889930Yvf.LIZ.LJIIL(), false, false);
    }

    @Override // X.AbstractC895380ZAq
    public final boolean equals(Object obj) {
        if (super.equals(obj) && (obj instanceof C895410ZAt)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1890700zIi
    public final C1600120rk2 isItemChanged(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C895420ZAu)) {
            return C1600110rk1.LIZ("unknown");
        }
        return C1600110rk1.LIZJ();
    }

    public C895410ZAt(EnumC1903600zdW enumC1903600zdW, boolean z, boolean z2, boolean z3) {
        super(207);
        this.LLILLJJLI = enumC1903600zdW;
        this.LLILLL = z;
        this.LLILZ = z2;
        this.LLILZIL = z3;
        this.LLILZLL = LSPassThroughRecordSizeConfig.DEFAULT;
    }

    @Override // X.InterfaceC887660Ys0
    public final C895410ZAt copyData(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Function1 function1) {
        return new C895410ZAt(this.LLILLJJLI, z5, z, z4);
    }
}
