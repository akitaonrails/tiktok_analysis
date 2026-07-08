package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.pipo.hybrid.retention.PipoRetentionButtonConfig;
import com.ss.android.ugc.aweme.pipo.hybrid.retention.PipoRetentionPopupConfig;
import com.ss.android.ugc.aweme.pipo.hybrid.settings.PipoContainerRetentionPopupConfig;
import com.ss.android.ugc.aweme.pipo.hybrid.settings.PipoRetentionFreqControl;
import java.net.URLDecoder;
import java.util.Map;
import kotlin.jvm.internal.AwS235S0300000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0v0K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1725540v0K {
    public C1725490v0F LIZ;

    public static boolean LIZ(PipoRetentionFreqControl pipoRetentionFreqControl) {
        int iIntValue;
        Integer num;
        int iIntValue2;
        Integer num2 = pipoRetentionFreqControl.within;
        if (num2 == null || (iIntValue = num2.intValue()) <= 0 || (num = pipoRetentionFreqControl.timesLimit) == null || (iIntValue2 = num.intValue()) <= 0) {
            return false;
        }
        long j = C1725430v09.LIZIZ;
        int i = C1725430v09.LIZ;
        if (j == 0) {
            C1725430v09.LIZIZ = System.currentTimeMillis();
            C1725430v09.LIZ = 1;
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - j <= iIntValue * LSPassThroughRecordSizeConfig.DEFAULT) {
            if (i >= iIntValue2) {
                return true;
            }
            C1725430v09.LIZIZ = jCurrentTimeMillis;
            C1725430v09.LIZ++;
            return false;
        }
        C1725430v09.LIZIZ = jCurrentTimeMillis;
        C1725430v09.LIZ = 1;
        return false;
    }

    public static String LIZIZ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return str;
        }
        try {
            return C20642515q3.LJFF().getString(C786410Ut5.n3(C20642515q3.LJFF(), str, "string", C792400V6o.LIZLLL()));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            C1725270uzt.LJI("214", th);
            return null;
        }
    }

    public final PipoRetentionPopupConfig LIZJ(SparkContext sparkContext) {
        Uri uriLIZLLL;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
        Map<String, PipoRetentionPopupConfig> map;
        PipoRetentionPopupConfig pipoRetentionPopupConfig;
        PipoRetentionButtonConfig pipoRetentionButtonConfig;
        PipoRetentionButtonConfig pipoRetentionButtonConfig2;
        String strLJIJI;
        try {
            PipoContainerRetentionPopupConfig pipoContainerRetentionPopupConfigLIZ = C1725580v0O.LIZ();
            if (!pipoContainerRetentionPopupConfigLIZ.enable) {
                return null;
            }
            if (sparkContext == null || (strLJIJI = sparkContext.LJIJI()) == null) {
                uriLIZLLL = null;
            } else {
                uriLIZLLL = C759510Tqn.LIZLLL(strLJIJI, "parsePipoRetentionPopup");
            }
            this.LIZ = new C1725490v0F(uriLIZLLL);
            if (uriLIZLLL == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
            } else {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLIZLLL, "pipo_retention_popup");
            }
            if (C1948507kB.LIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter) && (map = pipoContainerRetentionPopupConfigLIZ.configs) != null && (pipoRetentionPopupConfig = map.get(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) != null) {
                String strLIZIZ = LIZIZ(pipoRetentionPopupConfig.titleText);
                String strLIZIZ2 = LIZIZ(pipoRetentionPopupConfig.contentText);
                PipoRetentionButtonConfig pipoRetentionButtonConfig3 = pipoRetentionPopupConfig.primaryButton;
                if (pipoRetentionButtonConfig3 == null) {
                    pipoRetentionButtonConfig = null;
                } else {
                    pipoRetentionButtonConfig = new PipoRetentionButtonConfig(LIZIZ(pipoRetentionButtonConfig3.btnText), pipoRetentionButtonConfig3.actionType);
                }
                PipoRetentionButtonConfig pipoRetentionButtonConfig4 = pipoRetentionPopupConfig.secondaryButton;
                if (pipoRetentionButtonConfig4 == null) {
                    pipoRetentionButtonConfig2 = null;
                } else {
                    pipoRetentionButtonConfig2 = new PipoRetentionButtonConfig(LIZIZ(pipoRetentionButtonConfig4.btnText), pipoRetentionButtonConfig4.actionType);
                }
                return new PipoRetentionPopupConfig(strLIZIZ, strLIZIZ2, pipoRetentionButtonConfig, pipoRetentionButtonConfig2);
            }
            if (uriLIZLLL == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLIZLLL, "pipo_retention_popup_json")) == null || strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2.length() == 0) {
                return null;
            }
            String strDecode = URLDecoder.decode(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, "UTF-8");
            C1227904rF.LIZ.getClass();
            return (PipoRetentionPopupConfig) C1227904rF.LIZIZ(strDecode, PipoRetentionPopupConfig.class);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            C1725270uzt.LJI("214", th);
            return null;
        }
    }

    public final void LIZLLL(PipoRetentionButtonConfig pipoRetentionButtonConfig, C1397510mTF c1397510mTF, InterfaceC1059280dfi interfaceC1059280dfi) {
        String str = pipoRetentionButtonConfig.actionType;
        if (!Intrinsics.LJFF(str, EnumC626580Ohs.CONTINUE.getValue()) && Intrinsics.LJFF(str, EnumC626580Ohs.FINISH.getValue())) {
            c1397510mTF.LIZIZ(null);
            interfaceC1059280dfi.close();
        } else {
            c1397510mTF.LIZIZ(null);
        }
        C1725490v0F c1725490v0F = this.LIZ;
        if (c1725490v0F != null) {
            C1725490v0F.LIZ(c1725490v0F, "button_tap", pipoRetentionButtonConfig.actionType, null, 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LJ(InterfaceC1059280dfi interfaceC1059280dfi, PipoRetentionPopupConfig pipoRetentionPopupConfig, String str) {
        Context context;
        try {
            PipoContainerRetentionPopupConfig pipoContainerRetentionPopupConfigLIZ = C1725580v0O.LIZ();
            if (!pipoContainerRetentionPopupConfigLIZ.enable) {
                return false;
            }
            PipoRetentionFreqControl pipoRetentionFreqControl = pipoContainerRetentionPopupConfigLIZ.freqControl;
            if (pipoRetentionFreqControl != null && LIZ(pipoRetentionFreqControl)) {
                return false;
            }
            if (interfaceC1059280dfi instanceof SparkPopup) {
                context = ((SparkPopup) interfaceC1059280dfi).getContext();
            } else {
                if (interfaceC1059280dfi instanceof SparkActivity) {
                    context = (Context) interfaceC1059280dfi;
                }
                return false;
            }
            if (context != null) {
                LJFF(context, interfaceC1059280dfi, pipoRetentionPopupConfig, str);
                return true;
            }
            return false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            C1725270uzt.LJI("215", th);
            return false;
        }
    }

    public final void LJFF(Context context, InterfaceC1059280dfi interfaceC1059280dfi, PipoRetentionPopupConfig pipoRetentionPopupConfig, String str) {
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LJI(pipoRetentionPopupConfig.titleText);
        c1397580mTM.LIZIZ(pipoRetentionPopupConfig.contentText);
        c1397580mTM.LJII = false;
        C985403tE.LIZ(c1397580mTM, new AwS235S0300000_26(pipoRetentionPopupConfig, this, interfaceC1059280dfi, 15));
        new C1397510mTF(c1397580mTM).LIZLLL();
        C1725490v0F c1725490v0F = this.LIZ;
        if (c1725490v0F != null) {
            C1725490v0F.LIZ(c1725490v0F, "shown", null, str, 2);
        }
    }
}
