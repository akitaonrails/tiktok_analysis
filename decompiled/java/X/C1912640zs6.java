package X;

import com.bytedance.keva.Keva;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0zs6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1912640zs6 implements InterfaceC1255480imA {
    public static final C1912640zs6 LIZ;
    public static final C01GW LIZIZ;
    public static volatile boolean LIZJ;
    public static volatile boolean LIZLLL;
    public static volatile boolean LJ;
    public static int LJFF;
    public static String LJI;
    public static String LJII;
    public static String LJIIIIZZ;
    public static String LJIIIZ;
    public static Boolean LJIIJ;
    public static Boolean LJIIJJI;
    public static volatile boolean LJIIL;

    static {
        C1912640zs6 c1912640zs6 = new C1912640zs6();
        LIZ = c1912640zs6;
        LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(625));
        LJFF = C1904220zeW.LL.LJIIZILJ();
        LJIIL = true;
        EventBus.LIZLLL().LJIJJ(c1912640zs6);
        ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIILL(new C19334210kW(c1912640zs6, 2));
    }

    public static Keva LIZLLL() {
        return (Keva) LIZIZ.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0177  */
    @Override // X.InterfaceC1255480imA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ(X.EnumC1905360zgM r13) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1912640zs6.LIZIZ(X.0zgM):boolean");
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onNoticeCountChange(C1619080sEc c1619080sEc) {
        int iIntValue;
        Integer num = (Integer) ((LinkedHashMap) c1619080sEc.LIZ).get(29999);
        boolean z = false;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        if (LJFF == iIntValue) {
            return;
        }
        String str = LJI;
        if (str != null && Intrinsics.LJFF(str, "NOTIFICATION")) {
            if (iIntValue < LJFF) {
                z = true;
            }
            LJ = z;
        } else {
            LJ = false;
        }
        LJFF = iIntValue;
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onTabChangeEvent(C0R6M c0r6m) {
        boolean z;
        if (Intrinsics.LJFF(c0r6m.LIZ, c0r6m.LIZIZ)) {
            return;
        }
        if (LIZJ && Intrinsics.LJFF(c0r6m.LIZ, "HOME") && Intrinsics.LJFF(c0r6m.LIZIZ, "NOTIFICATION")) {
            z = true;
        } else {
            z = false;
        }
        LIZLLL = z;
        if (!LIZLLL) {
            LIZJ = false;
            LJII = null;
            LJIIIIZZ = null;
            LJIIIZ = null;
            LJIIJ = null;
            LJIIJJI = null;
        }
        if (!Intrinsics.LJFF(c0r6m.LIZIZ, "NOTIFICATION")) {
            LJ = false;
        }
        LJI = c0r6m.LIZIZ;
    }

    @Override // X.InterfaceC1255480imA
    public final void LIZ(C19EG c19eg, EnumC1905360zgM enumC1905360zgM) {
        String nickname;
        String secUid;
        if (C1905370zgN.LIZ[enumC1905360zgM.ordinal()] == 2) {
            nickname = LJII;
            secUid = LJIIIIZZ;
        } else {
            User curUser = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUser();
            nickname = curUser.getNickname();
            secUid = curUser.getSecUid();
        }
        PopupManager.LJI();
        PopupManager.LJ();
        PopupManager.LJIJI(new C1912660zs8(c19eg, enumC1905360zgM, nickname, secUid, new AwS572S0100000_28(c19eg, 842)), true);
    }

    @Override // X.InterfaceC1255480imA
    public final void LIZJ(String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        if (z) {
            LIZJ = true;
            LJII = str;
            LJIIIIZZ = str2;
            LJIIIZ = str3;
            LJIIJ = Boolean.valueOf(z2);
            LJIIJJI = Boolean.valueOf(z3);
            return;
        }
        Keva kevaLIZLLL = LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(System.currentTimeMillis())));
        sbLIZ.append("_switch_success_in_non_push_scene");
        kevaLIZLLL.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
        LJII = null;
        LJIIIIZZ = null;
        LJIIIZ = null;
        LJIIJ = null;
        LJIIJJI = null;
    }
}
