package X;

import com.ss.android.ugc.aweme.minis.model.MinisMeta;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import java.util.List;

/* JADX INFO: renamed from: X.1Ayc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2196961Ayc {
    public static final MinisMetaResp LIZ(MinisMeta minisMeta) {
        String str = minisMeta.clientKey;
        Integer num = minisMeta.minisType;
        Integer num2 = minisMeta.minisTechType;
        Integer num3 = minisMeta.minisStatus;
        Integer num4 = minisMeta.clientKeyType;
        String str2 = minisMeta.name;
        String str3 = minisMeta.description;
        String str4 = minisMeta.iconUrl;
        String str5 = minisMeta.iconBigUrl;
        String str6 = minisMeta.appVersion;
        String str7 = minisMeta.minisUrl;
        String str8 = minisMeta.privacyUrl;
        List<String> list = minisMeta.allowedDomains;
        String str9 = minisMeta.config;
        String str10 = minisMeta.updateTime;
        String str11 = minisMeta.tosUrl;
        List<String> list2 = minisMeta.scopes;
        String str12 = minisMeta.entity;
        int iOrdinal = EnumC2192711Arl.MINIS_STAGE_PROD.ordinal();
        String str13 = minisMeta.minisCategory;
        String str14 = minisMeta.merchantId;
        return new MinisMetaResp(str, num4, num, num2, num3, str2, str3, str4, str5, str6, str7, str8, list, str9, minisMeta.packageConfig, str10, str11, list2, str12, Integer.valueOf(iOrdinal), str13, 0, null, str14, null, minisMeta.registeredRewardTasks, 16777216, null);
    }
}
