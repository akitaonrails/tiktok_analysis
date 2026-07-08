package X;

import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.livesetting.gift.LynxUrlStorage;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.model.LocalPackageModel;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.mt.protector.impl.UriProtector;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0fhq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1137480fhq {
    public static final C1137480fhq LIZ = new C1137480fhq();
    public static InterfaceC1137720fiE LIZIZ;
    public static WeakReference<InterfaceC1137720fiE> LIZJ;

    public static boolean LIZ(AssetsModel assetsModel) {
        if (assetsModel == null || assetsModel.resourceType != AssetsModel.RESOURCE_TYPE_LYNX) {
            return false;
        }
        String str = assetsModel.lynxUrlSettingsKey;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = LynxUrlStorage.INSTANCE.getValue().get(str);
        if (str3 == null) {
            str3 = "";
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str3), "channel");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
            str2 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        }
        File fileLJII = C1143780fs0.LJII(str2, "/");
        if (fileLJII == null) {
            return false;
        }
        return fileLJII.exists();
    }

    public static Object LJ(final String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        String strDp;
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        IHostResource iHostResource = (IHostResource) C1161920gLG.LIZJ(IHostResource.class);
        if (iHostResource == null || (strDp = iHostResource.dp()) == null) {
            strDp = "";
        }
        C1537050q6J.LIZ.getClass();
        C1551950qUL c1551950qULLIZ = C1537050q6J.LIZ(strDp);
        final C013C c013c = new C013C();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" channel is ");
        sbLIZ.append(str);
        sbLIZ.append(", access key is ");
        sbLIZ.append(strDp);
        C20441214yg.LJIIIZ("LynxGiftChannelPreload", C2188811AlT.LIZIZ(sbLIZ));
        OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
        optionCheckUpdateParams.setChannelUpdatePriority(3);
        optionCheckUpdateParams.setEnableThrottle(false);
        optionCheckUpdateParams.setListener(new AbstractC1552040qUU() { // from class: X.0fhr
            @Override // X.AbstractC1552040qUU
            public final void LJIILLIIL(LocalPackageModel localPackageModel) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onLocalNewestVersion is ");
                sbLIZ2.append(Long.valueOf(localPackageModel.getLatestVersion()));
                sbLIZ2.append(" is already resume ");
                sbLIZ2.append(c013c.element);
                C20441214yg.LJIIIZ("LynxGiftChannelPreload", C2188811AlT.LIZIZ(sbLIZ2));
                if (!c013c.element) {
                    InterfaceC20236714Gf<Boolean> interfaceC20236714Gf = c2252611DEt;
                    Boolean bool = Boolean.TRUE;
                    C189200o6.m2constructorimpl(bool);
                    interfaceC20236714Gf.resumeWith(bool);
                    c013c.element = true;
                }
            }

            @Override // X.AbstractC1552040qUU
            public final void LJII(Throwable th, Map map) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onCheckServerVersionFail ");
                sbLIZ2.append(th);
                sbLIZ2.append(" already resume ");
                sbLIZ2.append(c013c.element);
                C20441214yg.LJIIIZ("LynxGiftChannelPreload", C2188811AlT.LIZIZ(sbLIZ2));
                C1AF0.LJFF(th, "LynxGiftChannelPreload");
                if (!c013c.element) {
                    InterfaceC20236714Gf<Boolean> interfaceC20236714Gf = c2252611DEt;
                    Boolean bool = Boolean.FALSE;
                    C189200o6.m2constructorimpl(bool);
                    interfaceC20236714Gf.resumeWith(bool);
                    c013c.element = true;
                }
            }

            @Override // X.AbstractC1552040qUU
            public final void LJIJ(UpdatePackage updatePackage, Throwable th) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(" update gecko fail ");
                sbLIZ2.append(th);
                sbLIZ2.append(" already resume ");
                sbLIZ2.append(c013c.element);
                C20441214yg.LJIIIZ("LynxGiftChannelPreload", C2188811AlT.LIZIZ(sbLIZ2));
                C1AF0.LJFF(th, "LynxGiftChannelPreload");
                if (!c013c.element) {
                    InterfaceC20236714Gf<Boolean> interfaceC20236714Gf = c2252611DEt;
                    Boolean bool = Boolean.FALSE;
                    C189200o6.m2constructorimpl(bool);
                    interfaceC20236714Gf.resumeWith(bool);
                    c013c.element = true;
                }
            }

            @Override // X.AbstractC1552040qUU
            public final void LJIL(long j, UpdatePackage updatePackage) {
                Boolean boolValueOf;
                File fileLJII = C1143780fs0.LJII(str, "/");
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(" update gecko success ");
                if (fileLJII != null) {
                    boolValueOf = Boolean.valueOf(fileLJII.exists());
                } else {
                    boolValueOf = null;
                }
                sbLIZ2.append(boolValueOf);
                sbLIZ2.append(", update package is ");
                sbLIZ2.append(updatePackage);
                sbLIZ2.append(" version is ");
                sbLIZ2.append(j);
                sbLIZ2.append(" already resume ");
                sbLIZ2.append(c013c.element);
                C20441214yg.LJIIIZ("LynxGiftChannelPreload", C2188811AlT.LIZIZ(sbLIZ2));
                if (!c013c.element) {
                    InterfaceC20236714Gf<Boolean> interfaceC20236714Gf = c2252611DEt;
                    Boolean bool = Boolean.TRUE;
                    C189200o6.m2constructorimpl(bool);
                    interfaceC20236714Gf.resumeWith(bool);
                    c013c.element = true;
                }
            }

            @Override // X.AbstractC1552040qUU
            public final void LJI(int i, Throwable th, Map map) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onCheckRequestIntercept ");
                sbLIZ2.append(th);
                sbLIZ2.append(", error code is ");
                sbLIZ2.append(i);
                sbLIZ2.append(" is already resume ");
                sbLIZ2.append(c013c.element);
                C20441214yg.LJIIIZ("LynxGiftChannelPreload", C2188811AlT.LIZIZ(sbLIZ2));
                C1AF0.LJFF(new Throwable("load gecko resource intercept"), "LynxGiftChannelPreload");
                if (!c013c.element) {
                    InterfaceC20236714Gf<Boolean> interfaceC20236714Gf = c2252611DEt;
                    Boolean bool = Boolean.FALSE;
                    C189200o6.m2constructorimpl(bool);
                    interfaceC20236714Gf.resumeWith(bool);
                    c013c.element = true;
                }
            }
        });
        if (c1551950qULLIZ != null) {
            c1551950qULLIZ.LIZ(null, C2097608Jq.LJIIJ(new Pair(strDp, C1697810uHb.LJIILJJIL(new CheckRequestBodyModel.TargetChannel(str)))), optionCheckUpdateParams);
        }
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    public static void LIZLLL(AssetsModel assetsModel, C1135810ff9 c1135810ff9, GiftMessage giftMessage, C1135280feI c1135280feI, Function2 function2) {
        String str = "";
        if (assetsModel.resourceType != AssetsModel.RESOURCE_TYPE_LYNX) {
            function2.invoke(Boolean.TRUE, "");
            return;
        }
        String str2 = assetsModel.lynxUrlSettingsKey;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = LynxUrlStorage.INSTANCE.getValue().get(str2);
        if (str3 != null) {
            str = str3;
        }
        LIZIZ(str, assetsModel, c1135810ff9, giftMessage, c1135280feI, function2);
    }

    public static void LIZIZ(String str, AssetsModel assetsModel, C1135810ff9 c1135810ff9, GiftMessage giftMessage, C1135280feI c1135280feI, Function2 function2) {
        GiftMessage giftMessage2;
        GiftMessage giftMessage3;
        C1136140ffg c1136140ffg = C1136940fgy.LIZ;
        if (c1135810ff9 == null || (giftMessage2 = c1135810ff9.LIZ) == null) {
            giftMessage2 = giftMessage;
        }
        c1136140ffg.getClass();
        C1136140ffg.LIZLLL(giftMessage2, c1135280feI, 2, 2);
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "channel");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
        }
        if (!a0.LJJJIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1136490fgF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, assetsModel, c1135810ff9, giftMessage, c1135280feI, 0, function2, 1, null), 3);
            return;
        }
        if (c1135810ff9 == null || (giftMessage3 = c1135810ff9.LIZ) == null) {
            giftMessage3 = giftMessage;
        }
        C1136140ffg.LIZLLL(giftMessage3, c1135280feI, 3, 1);
        function2.invoke(Boolean.FALSE, "channel is empty");
    }
}
