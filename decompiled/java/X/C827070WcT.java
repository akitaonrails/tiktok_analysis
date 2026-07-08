package X;

import com.ss.android.common.applog.AppLog;

/* JADX INFO: renamed from: X.0WcT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C827070WcT {
    public static final C827070WcT LIZ = new C827070WcT();
    public static final C11PR<String> LIZIZ = new C11PQ().LJLLLL();
    public static final C11PR<String> LIZJ = new C11PQ().LJLLLL();
    public static final C11PR<Boolean> LIZLLL = new C11RK().LJLLLL();
    public static final C11PR<Boolean> LJ = new C11RK().LJLLLL();
    public static final C11PR<EnumC2028907x9> LJFF = new C11RK().LJLLLL();
    public static final String LJI = "-2147483648";
    public static final C827080WcU LJII = new InterfaceC2210981Bg8() { // from class: X.0WcU
        @Override // X.InterfaceC2210981Bg8
        public final void LIZ(boolean z) {
            C827070WcT.LIZLLL.onNext(Boolean.valueOf(z));
        }

        @Override // X.InterfaceC2210981Bg8
        public final void LIZJ(boolean z) {
            C827070WcT.LJ.onNext(Boolean.valueOf(z));
        }

        @Override // X.InterfaceC2210981Bg8
        public final void LIZIZ(String str, String str2) {
            C827070WcT.LIZ.getClass();
            C827070WcT.LIZ();
            C827070WcT.LJFF.onNext(EnumC2028907x9.INSTANCE);
        }
    };

    public static String LIZJ() {
        String strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId();
        return strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId == null ? "" : strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId;
    }

    public static void LIZIZ() {
        C11PR<String> c11pr = LIZIZ;
        String str = LJI;
        c11pr.onNext(str);
        c11pr.onNext(LIZJ());
        C11PR<String> c11pr2 = LIZJ;
        c11pr2.onNext(str);
        String strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId();
        if (strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId != null) {
            c11pr2.onNext(strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId);
        }
    }

    public static void LIZ() {
        LIZIZ.onNext(LIZJ());
        String strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId();
        if (strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId != null) {
            LIZJ.onNext(strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId);
        }
    }
}
