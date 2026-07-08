package X;

import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;

/* JADX INFO: renamed from: X.0rUX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1590510rUX implements InterfaceC469360Ias {
    public final ScrollSwitchStateManager LL;
    public int LLILLJJLI;
    public int LLILLL;
    public boolean LLILZ;
    public int LLILZIL;

    public final void LIZ(int i) {
        Integer value = this.LL.LLJIJIL.getValue();
        if (value == null || i != value.intValue()) {
            this.LL.LLJIJIL.setValue(Integer.valueOf(i));
        }
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
        this.LLILZIL = i;
        if (i == 0) {
            this.LLILLL = 0;
        }
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        this.LLILLJJLI = i;
        LIZ(i);
    }

    public C1590510rUX(int i, ScrollSwitchStateManager scrollSwitchStateManager) {
        this.LL = scrollSwitchStateManager;
        this.LLILLJJLI = i;
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
        if (this.LLILZIL != 0) {
            int i3 = this.LLILLL;
            boolean z = false;
            if (i3 == 0 && i2 > 0) {
                if (i != this.LLILLJJLI) {
                    z = true;
                }
                this.LLILZ = z;
            } else if (i2 < i3) {
                this.LLILZ = true;
            } else if (i2 > i3) {
                this.LLILZ = false;
            }
            if (this.LLILZ) {
                LIZ(i);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("direction: left, targetPosition: ");
                sbLIZ.append(i);
                C2188811AlT.LIZIZ(sbLIZ);
            } else {
                int i4 = i + 1;
                LIZ(i4);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("direction: right, targetPosition: ");
                sbLIZ2.append(i4);
                C2188811AlT.LIZIZ(sbLIZ2);
            }
        }
        this.LLILLL = i2;
    }
}
