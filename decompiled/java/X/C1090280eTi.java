package X;

import com.bytedance.android.starship.solaria.profile.repository.ProfileGroupConfig;
import com.bytedance.android.starship.solaria.profile.repository.SolariaProfileModel;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0eTi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1090280eTi extends C09AY implements Function0<Map<String, HashSet<String>>> {
    public final /* synthetic */ SolariaProfileModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1090280eTi(SolariaProfileModel solariaProfileModel) {
        super(0);
        this.LL = solariaProfileModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, HashSet<String>> invoke() {
        HashSet<String> hashSet;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<ProfileGroupConfig> list = this.LL.groupList;
        if (list != null) {
            for (ProfileGroupConfig profileGroupConfig : list) {
                String str = profileGroupConfig.groupName;
                if (str != null && (hashSet = profileGroupConfig.profileKeys) != null) {
                    linkedHashMap.put(str, hashSet);
                }
            }
        }
        return linkedHashMap;
    }
}
