package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ZAu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C895420ZAu extends AbstractC895380ZAq implements InterfaceC887660Ys0<C895420ZAu> {
    public final int LLILLJJLI;
    public EnumC1903600zdW LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;
    public final boolean LLILZLL;
    public final int LLIZ;

    public C895420ZAu() {
        this(0, 31);
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
        return "contact_permission";
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ContactPermissionPod(iconResId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", displayLocation=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", displayInMultiSelectMode=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isInMultiSelectMode=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", isSwitchingMode=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC895380ZAq
    public final C890610Ywl convertToInboxEntranceWrapper$awemenotice_release() {
        return new C890610Ywl(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, 0L, this.type, false, this, null, 96);
    }

    @Override // X.AbstractC895380ZAq
    public final int hashCode() {
        return super.hashCode() + this.LLILLJJLI;
    }

    @Override // X.InterfaceC1890700zIi
    public final C0ZB9 biz() {
        return C895430ZAv.LIZIZ;
    }

    @Override // X.InterfaceC887660Ys0
    public final boolean getDisplayInMultiSelectMode() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC887560Yrq
    public final int getPriorityInInbox() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC887660Ys0
    public final boolean isInMultiSelectMode() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC887660Ys0
    public final boolean isSwitchingMode() {
        return this.LLILZLL;
    }

    @Override // X.AbstractC895380ZAq
    public final boolean equals(Object obj) {
        if (super.equals(obj) && (obj instanceof C895420ZAu)) {
            C895420ZAu c895420ZAu = (C895420ZAu) obj;
            if (this.LLILLJJLI == c895420ZAu.LLILLJJLI && this.LLILZIL == c895420ZAu.LLILZIL) {
                return true;
            }
            return false;
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

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C895420ZAu(int i, int i2) {
        EnumC1903600zdW enumC1903600zdW;
        boolean z;
        int i3 = (i2 & 1) != 0 ? -1 : i;
        if ((i2 & 2) != 0) {
            enumC1903600zdW = EnumC1903600zdW.TOP;
        } else {
            enumC1903600zdW = null;
        }
        if ((i2 & 4) != 0) {
            z = !C889930Yvf.LIZ.LJIIL();
        } else {
            z = false;
        }
        this(i3, enumC1903600zdW, z, false, false);
    }

    public C895420ZAu(int i, EnumC1903600zdW enumC1903600zdW, boolean z, boolean z2, boolean z3) {
        super(1);
        this.LLILLJJLI = i;
        this.LLILLL = enumC1903600zdW;
        this.LLILZ = z;
        this.LLILZIL = z2;
        this.LLILZLL = z3;
        this.LLIZ = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
    }

    @Override // X.InterfaceC887660Ys0
    public final C895420ZAu copyData(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Function1 function1) {
        return new C895420ZAu(this.LLILLJJLI, this.LLILLL, z5, z, z4);
    }
}
