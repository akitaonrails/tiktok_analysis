package X;

import Y.AfS7S0000100_24;
import Y.AfS9S0100100_24;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.model.DramaContentType;
import com.ss.android.ugc.aweme.model.DramaDNUFeedCardConfig;
import com.ss.android.ugc.aweme.model.MiniDramaFeedCardResponse;
import com.ss.android.ugc.aweme.model.MiniDramaTabConfigResponse;
import com.ss.android.ugc.aweme.service.ISeriesCommonETService;
import com.ss.android.ugc.aweme.service.MiniDramaETInjectService;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0r9M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1577380r9M {
    public final C1577390r9N LIZ;
    public MiniDramaFeedCardResponse LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public long LJFF;
    public EnumC2006807ta LJI = EnumC2006807ta.NONE;
    public final C1577420r9Q LJII = new InterfaceC1577470r9V() { // from class: X.0r9Q
        @Override // X.InterfaceC1577470r9V
        public final void LIZIZ(DramaDNUFeedCardConfig dramaDNUFeedCardConfig) {
        }

        @Override // X.InterfaceC1577470r9V
        public final void LIZ(MiniDramaFeedCardResponse miniDramaFeedCardResponse) {
            if (miniDramaFeedCardResponse.getContentType() == DramaContentType.DRAMA_CONTENT_TYPE_VIDEO) {
                this.LIZ.LIZIZ = miniDramaFeedCardResponse;
            }
        }
    };

    public final void LIZIZ() {
        if (this.LIZ.LJII) {
            return;
        }
        C1577320r9G c1577320r9G = C1577320r9G.LIZ;
        long j = this.LJFF;
        long jCurrentTimeMillis = System.currentTimeMillis();
        c1577320r9G.getClass();
        C1577320r9G.LIZIZ(c1577320r9G, EnumC1577400r9O.QUALIFIED_DATA_REQUEST, null, null, null, null, Long.valueOf(j), Long.valueOf(jCurrentTimeMillis - C1577320r9G.LIZIZ), null, null, null, null, null, null, null, null, null, null, null, 524094);
        this.LIZ.LIZIZ();
    }

    public final void LIZJ() {
        C1577390r9N c1577390r9N = this.LIZ;
        if (c1577390r9N.LJII || c1577390r9N.LIZLLL != null) {
            return;
        }
        Boolean boolLIZLLL = C1514430pVp.LIZLLL();
        boolean zLJJIL = C104100aN.LIZ().LJJIL();
        String strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
        if (boolLIZLLL.booleanValue()) {
            if (!zLJJIL) {
                if (C123100dR.LIZ(strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId)) {
                    LIZIZ();
                }
            } else if (C123100dR.LIZ(strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId) && LIZ()) {
                LIZIZ();
            }
        }
    }

    public static boolean LIZ() {
        return ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() && !Intrinsics.LJFF(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), CardStruct.IStatusCode.DEFAULT);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0r9Q] */
    public C1577380r9M(C1577390r9N c1577390r9N) {
        this.LIZ = c1577390r9N;
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onLoginSuccess(C486550J6f c486550J6f) {
        DramaContentType contentType;
        C11NZ<MiniDramaTabConfigResponse> c11nzLIZIZ;
        C11JF c11jf;
        Pair<String, String> dramaDNUVideoLoginContext;
        ISeriesCommonETService.LIZ.getClass();
        ISeriesCommonETService iSeriesCommonETServiceLIZ = C718550SGn.LIZ();
        if (iSeriesCommonETServiceLIZ != null && (dramaDNUVideoLoginContext = iSeriesCommonETServiceLIZ.getDramaDNUVideoLoginContext()) != null) {
            C1612490s3z c1612490s3z = C1612490s3z.LJI;
            String first = dramaDNUVideoLoginContext.getFirst();
            String second = dramaDNUVideoLoginContext.getSecond();
            c1612490s3z.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJFF("enter_from", first);
            c2344009Gk.LJFF("is_from_series_dnu_insertion", second);
            MiniDramaETInjectService.LIZ.getClass();
            MiniDramaETInjectService miniDramaETInjectServiceLIZ = C1611550s2T.LIZ();
            if (miniDramaETInjectServiceLIZ != null) {
                miniDramaETInjectServiceLIZ.onEventV3("series_dnu_insertion_login_success", c2344009Gk.LIZ);
            }
        }
        LIZJ();
        if (!C104100aN.LIZ().LJJIL() && LIZ()) {
            MiniDramaFeedCardResponse miniDramaFeedCardResponse = this.LIZ.LIZLLL;
            InterfaceC420801kM interfaceC420801kMLJJLL = null;
            if (miniDramaFeedCardResponse != null) {
                contentType = miniDramaFeedCardResponse.getContentType();
            } else {
                contentType = null;
            }
            if (contentType == DramaContentType.DRAMA_CONTENT_TYPE_VIDEO) {
                C1577390r9N c1577390r9N = this.LIZ;
                C11JF c11jf2 = c1577390r9N.LJ;
                if (c11jf2 != null && !c11jf2.isDisposed() && (c11jf = c1577390r9N.LJ) != null) {
                    c11jf.dispose();
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                C1577320r9G.LIZIZ(C1577320r9G.LIZ, EnumC1577400r9O.TAB_CONFIG_REQUEST, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524286);
                C1578500rBA.LIZ.getClass();
                InterfaceC1577430r9R interfaceC1577430r9RLIZ = C1578500rBA.LIZ();
                if (interfaceC1577430r9RLIZ != null && (c11nzLIZIZ = interfaceC1577430r9RLIZ.LIZIZ()) != null) {
                    interfaceC420801kMLJJLL = c11nzLIZIZ.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS9S0100100_24(jCurrentTimeMillis, c1577390r9N, 8), new AfS7S0000100_24(jCurrentTimeMillis, 1));
                }
                c1577390r9N.LJ = (C11JF) interfaceC420801kMLJJLL;
            }
        }
    }
}
