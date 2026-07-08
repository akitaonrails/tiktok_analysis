package X;

import com.bytedance.android.livesdkapi.host.IHostHybrid;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.1EAP, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1EAP extends C1EAO {
    @Override // X.AbstractC1549150qPp
    public final boolean shouldUseOriginalData(InterfaceC634840OvC interfaceC634840OvC) {
        EnumC1063300dmC enumC1063300dmC;
        C1543410qGZ c1543410qGZLIZJ;
        C1543190qGD c1543190qGD;
        if (interfaceC634840OvC != null && (c1543410qGZLIZJ = interfaceC634840OvC.LIZJ()) != null && (c1543190qGD = c1543410qGZLIZJ.LIZ.LIZ) != null) {
            enumC1063300dmC = c1543190qGD.LJIILJJIL;
        } else {
            enumC1063300dmC = null;
        }
        if (enumC1063300dmC == EnumC1063300dmC.WEB) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        int iLJIIJJI;
        int iLJIIJJI2;
        int iLJIIJJI3;
        C1515210pX5.LIZLLL().getClass();
        Map mapLIZIZ = C1515210pX5.LIZIZ();
        C1EAQ c1eaq = (C1EAQ) C1909107dp.LIZJ(C1EAQ.class, null);
        c1eaq.setCode(1);
        String str = (String) mapLIZIZ.get("ac");
        if (str == null) {
            str = "";
        }
        c1eaq.setAc(str);
        String str2 = (String) mapLIZIZ.get("aid");
        if (str2 == null) {
            str2 = "";
        }
        c1eaq.setAid(str2);
        String str3 = (String) mapLIZIZ.get("app_name");
        if (str3 == null) {
            str3 = "";
        }
        c1eaq.setAppName(str3);
        String str4 = (String) mapLIZIZ.get("channel");
        if (str4 == null) {
            str4 = "";
        }
        c1eaq.setChannel(str4);
        String str5 = (String) mapLIZIZ.get("device_band");
        if (str5 == null) {
            str5 = "";
        }
        c1eaq.setDeviceBand(str5);
        String str6 = (String) mapLIZIZ.get("device_id");
        if (str6 == null) {
            str6 = "";
        }
        c1eaq.setDeviceId(str6);
        String str7 = (String) mapLIZIZ.get("device_platform");
        if (str7 == null) {
            str7 = "";
        }
        c1eaq.setDevicePlatform(str7);
        String str8 = (String) mapLIZIZ.get("device_type");
        if (str8 == null) {
            str8 = "";
        }
        c1eaq.setDeviceType(str8);
        String str9 = (String) mapLIZIZ.get("version_code");
        if (str9 == null) {
            str9 = "";
        }
        c1eaq.setVersionCode(str9);
        String str10 = (String) mapLIZIZ.get("webcast_language");
        if (str10 == null) {
            str10 = "";
        }
        c1eaq.setWebcastLanguage(str10);
        String str11 = (String) mapLIZIZ.get("webcast_locale");
        if (str11 == null) {
            str11 = "";
        }
        c1eaq.setWebcastLocale(str11);
        String str12 = (String) mapLIZIZ.get("webcast_sdk_version");
        if (str12 == null) {
            str12 = "";
        }
        c1eaq.setWebcastSdkVersion(str12);
        String str13 = (String) mapLIZIZ.get("os_version");
        if (str13 == null) {
            str13 = "";
        }
        c1eaq.setOsVersion(str13);
        String str14 = (String) mapLIZIZ.get("is_notch");
        if (str14 == null || (iLJIIJJI = C2095008Iq.LJIIJJI(str14)) == null) {
            iLJIIJJI = 0;
        }
        c1eaq.setNotch(iLJIIJJI);
        String str15 = (String) mapLIZIZ.get("residence");
        if (str15 == null) {
            str15 = "";
        }
        c1eaq.setResidence(str15);
        String str16 = (String) mapLIZIZ.get("iid");
        if (str16 == null) {
            str16 = "";
        }
        c1eaq.setIid(str16);
        String str17 = (String) mapLIZIZ.get("locale");
        if (str17 == null) {
            str17 = "";
        }
        c1eaq.setLocale(str17);
        String str18 = (String) mapLIZIZ.get("sys_region");
        if (str18 == null) {
            str18 = "";
        }
        c1eaq.setSysRegion(str18);
        String str19 = (String) mapLIZIZ.get("op_region");
        if (str19 == null) {
            str19 = "";
        }
        c1eaq.setOpRegion(str19);
        String str20 = (String) mapLIZIZ.get("os_api");
        if (str20 == null) {
            str20 = "";
        }
        c1eaq.setOsApi(str20);
        String str21 = (String) mapLIZIZ.get("idfa");
        if (str21 == null) {
            str21 = "";
        }
        c1eaq.setIdfa(str21);
        String str22 = (String) mapLIZIZ.get("idfv");
        if (str22 == null) {
            str22 = "";
        }
        c1eaq.setIdfv(str22);
        String str23 = (String) mapLIZIZ.get("carrier_region1");
        if (str23 == null) {
            str23 = "";
        }
        c1eaq.setCarrierRegion1(str23);
        String str24 = (String) mapLIZIZ.get("openudid");
        if (str24 == null) {
            str24 = "";
        }
        c1eaq.setOpenudid(str24);
        String str25 = (String) mapLIZIZ.get("account_region");
        if (str25 == null) {
            str25 = "";
        }
        c1eaq.setAccountRegion(str25);
        String str26 = (String) mapLIZIZ.get("tz_name");
        if (str26 == null) {
            str26 = "";
        }
        c1eaq.setTzName(str26);
        String str27 = (String) mapLIZIZ.get("tz_offset");
        if (str27 == null || (iLJIIJJI2 = C2095008Iq.LJIIJJI(str27)) == null) {
            iLJIIJJI2 = 0;
        }
        c1eaq.setTzOffset(iLJIIJJI2);
        String str28 = (String) mapLIZIZ.get("app_language");
        if (str28 == null) {
            str28 = "";
        }
        c1eaq.setAppLanguage(str28);
        String str29 = (String) mapLIZIZ.get("carrier_region");
        if (str29 == null) {
            str29 = "";
        }
        c1eaq.setCarrierRegion(str29);
        String str30 = (String) mapLIZIZ.get("build_number");
        if (str30 == null) {
            str30 = "";
        }
        c1eaq.setBuildNumber(str30);
        String str31 = (String) mapLIZIZ.get("mcc_mnc");
        if (str31 == null) {
            str31 = "";
        }
        c1eaq.setMccMnc(str31);
        String str32 = (String) mapLIZIZ.get("screen_width");
        if (str32 == null || (iLJIIJJI3 = C2095008Iq.LJIIJJI(str32)) == null) {
            iLJIIJJI3 = 0;
        }
        c1eaq.setScreenWidth(iLJIIJJI3);
        String str33 = (String) mapLIZIZ.get("uoo");
        if (str33 == null) {
            str33 = "";
        }
        c1eaq.setUoo(str33);
        String str34 = (String) mapLIZIZ.get("content_language");
        if (str34 == null) {
            str34 = "";
        }
        c1eaq.setContentLanguage(str34);
        String str35 = (String) mapLIZIZ.get("language");
        if (str35 == null) {
            str35 = "";
        }
        c1eaq.setLanguage(str35);
        String str36 = (String) mapLIZIZ.get("cdid");
        if (str36 == null) {
            str36 = "";
        }
        c1eaq.setCdid(str36);
        String str37 = (String) mapLIZIZ.get("current_region");
        if (str37 == null) {
            str37 = "";
        }
        c1eaq.setCurrentRegion(str37);
        String str38 = (String) mapLIZIZ.get("app_version");
        if (str38 == null) {
            str38 = "";
        }
        c1eaq.setAppVersion(str38);
        c1eaq.setTtToken(((IHostHybrid) C1161920gLG.LIZJ(IHostHybrid.class)).Wx2(""));
        completionBlock.onSuccess(c1eaq, "");
    }
}
