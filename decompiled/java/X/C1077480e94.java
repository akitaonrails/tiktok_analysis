package X;

import com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility;
import com.ss.android.ugc.aweme.api.component.photomode.CommercePhotoModeAssem;
import com.ss.android.ugc.aweme.commercialize.profile.AdNewFakeUserProfileDetailFragmentWidget;
import com.ss.android.ugc.aweme.model.SlidesImageLoadParams;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS417S0200000_16;

/* JADX INFO: renamed from: X.0e94, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1077480e94 implements InterfaceC469360Ias {
    public final int $t;
    public Object l0;

    public static final void onPageScrollStateChanged$1(C1077480e94 c1077480e94, int i) {
    }

    public static final void onPageScrolled$1(C1077480e94 c1077480e94, int i, float f, int i2) {
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
        switch (this.$t) {
            case 0:
                onPageScrollStateChanged$0(this, i);
                break;
            case 1:
                onPageScrollStateChanged$1(this, i);
                break;
        }
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
        switch (this.$t) {
            case 0:
                onPageScrolled$0(this, i, f, i2);
                break;
            case 1:
                onPageScrolled$1(this, i, f, i2);
                break;
        }
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        switch (this.$t) {
            case 0:
                onPageSelected$0(this, i);
                break;
            case 1:
                onPageSelected$1(this, i);
                break;
        }
    }

    public C1077480e94(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onPageScrollStateChanged$0(C1077480e94 c1077480e94, int i) {
        int iXt0;
        CopyOnWriteArrayList<SlidesImageLoadParams> copyOnWriteArrayListLJIIJ;
        InterfaceC719460SKa interfaceC719460SKaLJLIL;
        if (i != 0) {
            if (i == 1) {
                ((CommercePhotoModeAssem) c1077480e94.l0).LLJJJJLIIL.LIZIZ = true;
                return;
            }
            return;
        }
        IPhotoSlidesAbility iPhotoSlidesAbilityBo = ((CommercePhotoModeAssem) c1077480e94.l0).Bo();
        if (iPhotoSlidesAbilityBo == null || (iXt0 = iPhotoSlidesAbilityBo.xt0()) == ((CommercePhotoModeAssem) c1077480e94.l0).LLJJJJLIIL.LIZ) {
            return;
        }
        int i2 = CommercePhotoModeAssem.LLLFFI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("time onScrollStateIDLE: position is ");
        sbLIZ.append(iXt0);
        sbLIZ.append(", time is ");
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append(", ");
        IPhotoSlidesAbility iPhotoSlidesAbilityBo2 = ((CommercePhotoModeAssem) c1077480e94.l0).Bo();
        if (iPhotoSlidesAbilityBo2 != null && (interfaceC719460SKaLJLIL = iPhotoSlidesAbilityBo2.LJLIL()) != null) {
            copyOnWriteArrayListLJIIJ = interfaceC719460SKaLJLIL.LJIIJ();
        } else {
            copyOnWriteArrayListLJIIJ = null;
        }
        sbLIZ.append(copyOnWriteArrayListLJIIJ);
        C719510SKf.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        ((CommercePhotoModeAssem) c1077480e94.l0).Eo(iXt0);
    }

    public static final void onPageSelected$0(C1077480e94 c1077480e94, int i) {
        int i2 = CommercePhotoModeAssem.LLLFFI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("time onPageSelected: position is ");
        sbLIZ.append(i);
        sbLIZ.append(", time is ");
        sbLIZ.append(System.currentTimeMillis());
        C719510SKf.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        ((CommercePhotoModeAssem) c1077480e94.l0).Co(i, false);
    }

    public static final void onPageSelected$1(C1077480e94 c1077480e94, int i) {
        ((AdNewFakeUserProfileDetailFragmentWidget) c1077480e94.l0).LJIJI(i);
    }

    public static final void onPageScrolled$0(C1077480e94 c1077480e94, int i, float f, int i2) {
        C1001940cBE c1001940cBE = (C1001940cBE) ((CommercePhotoModeAssem) c1077480e94.l0).LLJLIL.getValue();
        if (c1001940cBE != null && c1001940cBE.LIZLLL && i >= 0 && i < c1001940cBE.LJIILIIL.size() - 1) {
            float f2 = i;
            float fAbs = Math.abs((c1001940cBE.LJ - f2) - f);
            float f3 = c1001940cBE.LJIIIIZZ;
            if (fAbs > f3) {
                c1001940cBE.LJ = f2 + f;
                int i3 = (c1001940cBE.LJII * i) + ((int) (f / f3));
                C1001980cBI c1001980cBILIZ = c1001940cBE.LJIILL.get(Integer.valueOf(i3));
                if (c1001980cBILIZ == null) {
                    c1001980cBILIZ = c1001940cBE.LIZ(f, i);
                    c1001940cBE.LJIILL.put(Integer.valueOf(i3), c1001980cBILIZ);
                }
                C1524805y2.LIZIZ(0L, new AwS417S0200000_16(c1001940cBE, c1001980cBILIZ, 47));
            }
        }
    }
}
