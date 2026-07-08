package X;

import com.bytedance.touchpoint.api.model.CoinBottomTab;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.spi.IActivityTabService;
import com.ss.android.ugc.aweme.spi.IFcpAppDiffProtocol;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rNA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1585940rNA {
    public static final EnumC1585940rNA CAN_NOT_SHOW_RESTRICTED_MODE;
    public static final EnumC1585940rNA CAN_NOT_SHOW_UPDATE_SESSION;
    public static final EnumC1585940rNA CAN_SHOW_CHILD_MODE;
    public static final EnumC1585940rNA CAN_SHOW_IN_CORNER_LIVE_SPECIAL;
    public static final EnumC1585940rNA CAN_SHOW_IN_CORNER_TAKO_SPECIAL;
    public static final EnumC1585940rNA CAN_SHOW_IN_STEM_SPECIAL;
    public static final EnumC1585940rNA CAN_SHOW_IN_TOP_LIVE_SPECIAL;
    public static final EnumC1585940rNA CAN_SHOW_LOG_IN;
    public static final EnumC1585940rNA CAN_SHOW_NOT_LOG_IN;
    public static final EnumC1585940rNA CAN_SHOW_OVER_18_YEARS_OLD;
    public static final /* synthetic */ EnumC1585940rNA[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1585940rNA OPEKY_CAN_NOT_SHOW_NOT_IN_FIRST_LAUNCH;
    public static final EnumC1585940rNA OPEKY_CAN_SHOW_CHECK_NEARBY_CONFIG_CACHE;
    public static final EnumC1585940rNA OPEKY_CAN_SHOW_FYP_IN_DRAMA;
    public static final EnumC1585940rNA OPEKY_CAN_SHOW_IN_PAD_TOPIC;
    public static final EnumC1585940rNA OPEKY_CAN_SHOW_IN_PAD_TOPIC_1;
    public static final EnumC1585940rNA OPEKY_CAN_SHOW_NOT_IN_PAD;
    public static final EnumC1585940rNA OPKEY_CAN_NOT_SHOW_OUT_OF_EC_LIST_REGION;
    public static final EnumC1585940rNA OPKEY_CAN_SHOW_ACTIVITY;
    public static final EnumC1585940rNA OPKEY_CAN_SHOW_FRIENDS_WHEN_USE_DEFAULT;
    public static final EnumC1585940rNA OPKEY_CAN_SHOW_IN_COIN_SPECIAL;

    public EnumC1585940rNA() {
        throw null;
    }

    public static InterfaceC2044707zh<EnumC1585940rNA> getEntries() {
        return LLILLJJLI;
    }

    public abstract /* synthetic */ boolean operatorInvoke();

    static {
        EnumC1585940rNA enumC1585940rNA = new EnumC1585940rNA() { // from class: X.0rNE
            @Override // X.EnumC1585940rNA
            public final boolean operatorInvoke() {
                return C0XQ7.LJFF().isLogin();
            }
        };
        CAN_SHOW_LOG_IN = enumC1585940rNA;
        EnumC1585940rNA enumC1585940rNA2 = new EnumC1585940rNA() { // from class: X.0rNF
            @Override // X.EnumC1585940rNA
            public final boolean operatorInvoke() {
                return !C0XQ7.LJFF().isLogin();
            }
        };
        CAN_SHOW_NOT_LOG_IN = enumC1585940rNA2;
        EnumC1585940rNA enumC1585940rNA3 = new EnumC1585940rNA() { // from class: X.0rN3
            @Override // X.EnumC1585940rNA
            public final boolean operatorInvoke() {
                C1565380qq0.LIZ.getClass();
                return ((IECommerceMallService) ServiceManager.get().getService(IECommerceMallService.class)).LIZLLL();
            }
        };
        CAN_SHOW_OVER_18_YEARS_OLD = enumC1585940rNA3;
        EnumC1585940rNA enumC1585940rNA4 = new EnumC1585940rNA() { // from class: X.0rN2
            @Override // X.EnumC1585940rNA
            public final boolean operatorInvoke() {
                if (C307020C1s.LIZ()) {
                    return true;
                }
                C1565380qq0.LIZ.getClass();
                return !C1565380qq0.LIZIZ;
            }
        };
        CAN_NOT_SHOW_UPDATE_SESSION = enumC1585940rNA4;
        EnumC1585940rNA enumC1585940rNA5 = new EnumC1585940rNA() { // from class: X.0CXV
            @Override // X.EnumC1585940rNA
            public final boolean operatorInvoke() {
                return ComplianceServiceProvider.LJIL().LJJJJZI();
            }
        };
        CAN_NOT_SHOW_RESTRICTED_MODE = enumC1585940rNA5;
        EnumC1585940rNA enumC1585940rNA6 = new EnumC1585940rNA() { // from class: X.0rNH
            @Override // X.EnumC1585940rNA
            public final boolean operatorInvoke() {
                return !C10EU.LJIILIIL();
            }
        };
        CAN_SHOW_CHILD_MODE = enumC1585940rNA6;
        EnumC1585940rNA enumC1585940rNA7 = new EnumC1585940rNA() { // from class: X.0rNC
            @Override // X.EnumC1585940rNA
            public final boolean operatorInvoke() {
                InterfaceC486620J6m interfaceC486620J6mI4;
                ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
                String strI0 = (iLiveOuterService == null || (interfaceC486620J6mI4 = iLiveOuterService.i4()) == null) ? null : interfaceC486620J6mI4.i0();
                return Intrinsics.LJFF(strI0, "live_tab_single") || Intrinsics.LJFF(strI0, "live_tab_double");
            }
        };
        CAN_SHOW_IN_TOP_LIVE_SPECIAL = enumC1585940rNA7;
        EnumC1585940rNA enumC1585940rNA8 = new EnumC1585940rNA() { // from class: X.0rND
            @Override // X.EnumC1585940rNA
            public final boolean operatorInvoke() {
                InterfaceC486620J6m interfaceC486620J6mI4;
                ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
                if (iLiveOuterService == null || (interfaceC486620J6mI4 = iLiveOuterService.i4()) == null) {
                    return false;
                }
                return interfaceC486620J6mI4.LJIIJJI();
            }
        };
        CAN_SHOW_IN_CORNER_LIVE_SPECIAL = enumC1585940rNA8;
        EnumC1585940rNA enumC1585940rNA9 = new EnumC1585940rNA() { // from class: X.0rN5
            @Override // X.EnumC1585940rNA
            public final boolean operatorInvoke() {
                return ComplianceServiceProvider.LJJI().LJJIJ().isOn();
            }
        };
        CAN_SHOW_IN_STEM_SPECIAL = enumC1585940rNA9;
        EnumC1585940rNA enumC1585940rNA10 = new EnumC1585940rNA() { // from class: X.0rNY
            @Override // X.EnumC1585940rNA
            public final boolean operatorInvoke() {
                return C1874850yt9.LIZ(29, CoinBottomTab.class) != null;
            }
        };
        OPKEY_CAN_SHOW_IN_COIN_SPECIAL = enumC1585940rNA10;
        EnumC1585940rNA enumC1585940rNA11 = new EnumC1585940rNA() { // from class: X.0CRw
            @Override // X.EnumC1585940rNA
            public final boolean operatorInvoke() {
                return !C13LQ.LJIILLIIL(C2222691Bz1.LIZ(), (Object[]) C1243304tj.LIZIZ.getValue());
            }
        };
        OPKEY_CAN_NOT_SHOW_OUT_OF_EC_LIST_REGION = enumC1585940rNA11;
        EnumC1585940rNA enumC1585940rNA12 = new EnumC1585940rNA() { // from class: X.0rN7
            @Override // X.EnumC1585940rNA
            public final boolean operatorInvoke() {
                return C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLI().LJIJI(0);
            }
        };
        OPEKY_CAN_SHOW_IN_PAD_TOPIC = enumC1585940rNA12;
        EnumC1585940rNA enumC1585940rNA13 = new EnumC1585940rNA() { // from class: X.0rN8
            @Override // X.EnumC1585940rNA
            public final boolean operatorInvoke() {
                return C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLI().LJIJI(1);
            }
        };
        OPEKY_CAN_SHOW_IN_PAD_TOPIC_1 = enumC1585940rNA13;
        EnumC1585940rNA enumC1585940rNA14 = new EnumC1585940rNA() { // from class: X.0rNI
            @Override // X.EnumC1585940rNA
            public final boolean operatorInvoke() {
                return C1606660rua.LIZIZ.LJIIJJI();
            }
        };
        OPEKY_CAN_SHOW_CHECK_NEARBY_CONFIG_CACHE = enumC1585940rNA14;
        EnumC1585940rNA enumC1585940rNA15 = new EnumC1585940rNA() { // from class: X.0rMw
            @Override // X.EnumC1585940rNA
            public final boolean operatorInvoke() {
                if (!C1564470qoX.LIZ()) {
                    return C1585070rLl.LIZLLL(C1585070rLl.LIZ, EnumC1584360rKc.FRIENDS);
                }
                C1585070rLl c1585070rLl = C1585070rLl.LIZ;
                EnumC1584360rKc enumC1584360rKc = EnumC1584360rKc.FRIENDS;
                return C1585070rLl.LIZLLL(c1585070rLl, enumC1584360rKc) || C1585070rLl.LJFF(enumC1584360rKc, null);
            }
        };
        OPKEY_CAN_SHOW_FRIENDS_WHEN_USE_DEFAULT = enumC1585940rNA15;
        EnumC1585940rNA enumC1585940rNA16 = new EnumC1585940rNA() { // from class: X.0rNB
            @Override // X.EnumC1585940rNA
            public final boolean operatorInvoke() {
                C0CXN c0cxn = C0CXN.LIZ;
                EnumC1584360rKc enumC1584360rKc = EnumC1584360rKc.ACTIVITY;
                c0cxn.getClass();
                return ((IActivityTabService) ServiceManager.get().getService(IActivityTabService.class)).LIZJ(C0CXN.LIZLLL(enumC1584360rKc));
            }
        };
        OPKEY_CAN_SHOW_ACTIVITY = enumC1585940rNA16;
        EnumC1585940rNA enumC1585940rNA17 = new EnumC1585940rNA() { // from class: X.0DOV
            @Override // X.EnumC1585940rNA
            public final boolean operatorInvoke() {
                return C19252910Tv.LIZIZ.LIZLLL().LJIIJ().isPad() == 0;
            }
        };
        OPEKY_CAN_SHOW_NOT_IN_PAD = enumC1585940rNA17;
        EnumC1585940rNA enumC1585940rNA18 = new EnumC1585940rNA() { // from class: X.0rNG
            @Override // X.EnumC1585940rNA
            public final boolean operatorInvoke() {
                return !C1514430pVp.LIZLLL().booleanValue();
            }
        };
        OPEKY_CAN_NOT_SHOW_NOT_IN_FIRST_LAUNCH = enumC1585940rNA18;
        EnumC1585940rNA enumC1585940rNA19 = new EnumC1585940rNA() { // from class: X.0rMV
            @Override // X.EnumC1585940rNA
            public final boolean operatorInvoke() {
                IFcpAppDiffProtocol.LIZ.getClass();
                C1585540rMW.LIZIZ.getValue().LIZ();
                return true;
            }
        };
        OPEKY_CAN_SHOW_FYP_IN_DRAMA = enumC1585940rNA19;
        EnumC1585940rNA enumC1585940rNA20 = new EnumC1585940rNA() { // from class: X.0rNU
            @Override // X.EnumC1585940rNA
            public final boolean operatorInvoke() {
                return C14TF.LIZIZ.LJIILL().LJIIJJI();
            }
        };
        CAN_SHOW_IN_CORNER_TAKO_SPECIAL = enumC1585940rNA20;
        EnumC1585940rNA[] enumC1585940rNAArr = {enumC1585940rNA, enumC1585940rNA2, enumC1585940rNA3, enumC1585940rNA4, enumC1585940rNA5, enumC1585940rNA6, enumC1585940rNA7, enumC1585940rNA8, enumC1585940rNA9, enumC1585940rNA10, enumC1585940rNA11, enumC1585940rNA12, enumC1585940rNA13, enumC1585940rNA14, enumC1585940rNA15, enumC1585940rNA16, enumC1585940rNA17, enumC1585940rNA18, enumC1585940rNA19, enumC1585940rNA20};
        LL = enumC1585940rNAArr;
        LLILLJJLI = new C2254308sP(enumC1585940rNAArr);
    }

    public static EnumC1585940rNA[] values() {
        return (EnumC1585940rNA[]) LL.clone();
    }

    public static EnumC1585940rNA valueOf(String str) {
        return (EnumC1585940rNA) C08FF.LIZ(EnumC1585940rNA.class, str);
    }

    public EnumC1585940rNA(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
    }
}
