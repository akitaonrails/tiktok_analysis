package Y;

import X.AbstractC1608130rwx;
import X.C1593260rYy;
import X.C1C7U;
import X.C737030Svd;
import X.EnumC1605470rsf;
import X.EnumC1607270rvZ;
import X.InterfaceC1565710qqX;
import X.ViewOnClickListenerC1605710rt3;
import com.ss.android.ugc.aweme.avatar.ui.AvatarDelegate;
import com.ss.android.ugc.aweme.avatar.vm.AvatarControllerVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.tab.metrics.TabSwitchMetricServiceImpl;

/* JADX INFO: loaded from: classes25.dex */
public class ARunnableS13S0310000_24 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS13S0310000_24 aRunnableS13S0310000_24) {
        boolean zLIZ;
        C1C7U.LIZ("AvatarDelegate@92fb.setData$1");
        try {
            AvatarControllerVM avatarControllerVMLJIJJLI = ((AvatarDelegate) aRunnableS13S0310000_24.l0).LJIJJLI();
            Object obj = aRunnableS13S0310000_24.l1;
            boolean z = aRunnableS13S0310000_24.z3;
            EnumC1607270rvZ enumC1607270rvZ = (EnumC1607270rvZ) aRunnableS13S0310000_24.l2;
            if (obj == null) {
                avatarControllerVMLJIJJLI.getClass();
            } else {
                AvatarControllerVM.wQ2(avatarControllerVMLJIJJLI, avatarControllerVMLJIJJLI.LL, obj, z, enumC1607270rvZ, false, 48);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AvatarDelegate@92fb.setData$1");
    }

    public static final void run$1(ARunnableS13S0310000_24 aRunnableS13S0310000_24) {
        boolean zLIZ;
        C1C7U.LIZ("TabSwitchMetricServiceImpl@ff23.waitNextFrameAndMaybeFlush$$inlined$doOnPreDraw$1");
        try {
            ((TabSwitchMetricServiceImpl) aRunnableS13S0310000_24.l1).LJIILJJIL((C1593260rYy) aRunnableS13S0310000_24.l2, aRunnableS13S0310000_24.z3);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TabSwitchMetricServiceImpl@ff23.waitNextFrameAndMaybeFlush$$inlined$doOnPreDraw$1");
    }

    public static final void run$2(ARunnableS13S0310000_24 aRunnableS13S0310000_24) {
        boolean zLIZ;
        C1C7U.LIZ("SocialAvatarEntry@9232.operateAvatarView$1");
        try {
            ViewOnClickListenerC1605710rt3 viewOnClickListenerC1605710rt3 = (ViewOnClickListenerC1605710rt3) aRunnableS13S0310000_24.l0;
            if (viewOnClickListenerC1605710rt3.LLJILLL == null || !aRunnableS13S0310000_24.z3) {
                ViewOnClickListenerC1605710rt3.LJJII(viewOnClickListenerC1605710rt3, (EnumC1605470rsf) aRunnableS13S0310000_24.l1, false, false, (Integer) aRunnableS13S0310000_24.l2, false, null, false, 118);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SocialAvatarEntry@9232.operateAvatarView$1");
    }

    public static final void run$3(ARunnableS13S0310000_24 aRunnableS13S0310000_24) {
        boolean zLIZ;
        C1C7U.LIZ("ImmersiveBarManager@db99.handleImmersiveMode$2");
        try {
            ((AbstractC1608130rwx) aRunnableS13S0310000_24.l0).LJFF((C737030Svd) aRunnableS13S0310000_24.l1, (InterfaceC1565710qqX) aRunnableS13S0310000_24.l2, aRunnableS13S0310000_24.z3);
            Aweme awemeLIZIZ = ((AbstractC1608130rwx) aRunnableS13S0310000_24.l0).LIZIZ();
            if (awemeLIZIZ != null) {
                ((InterfaceC1565710qqX) aRunnableS13S0310000_24.l2).LIZIZ((C737030Svd) aRunnableS13S0310000_24.l1, awemeLIZIZ, aRunnableS13S0310000_24.z3, null);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ImmersiveBarManager@db99.handleImmersiveMode$2");
    }

    public ARunnableS13S0310000_24(AvatarDelegate avatarDelegate, Object obj, EnumC1607270rvZ enumC1607270rvZ, int i) {
        this.$t = i;
        this.l0 = avatarDelegate;
        this.l1 = obj;
        this.z3 = false;
        this.l2 = enumC1607270rvZ;
    }

    public ARunnableS13S0310000_24(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.z3 = z;
    }
}
