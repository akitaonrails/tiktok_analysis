package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.search.api.service.IIMSearchAnalyticsUtils;
import com.ss.android.ugc.aweme.im.utils.IMSearchAnalyticsUtilsImpl;
import java.util.Map;

/* JADX INFO: renamed from: X.0iOA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1240600iOA implements IIMSearchAnalyticsUtils {
    public static final C1240600iOA LIZIZ = new C1240600iOA();
    public final /* synthetic */ IIMSearchAnalyticsUtils LIZ = IMSearchAnalyticsUtilsImpl.LJI();

    @Override // com.ss.android.ugc.aweme.im.search.api.service.IIMSearchAnalyticsUtils
    public final void LIZ(int i, int i2, int i3, int i4, String str, String str2, String str3, String str4) {
        this.LIZ.LIZ(i, i2, i3, i4, str, str2, str3, str4);
    }

    @Override // com.ss.android.ugc.aweme.im.search.api.service.IIMSearchAnalyticsUtils
    public final void LIZIZ(EnumC1240630iOD enumC1240630iOD, Map<String, String> map, InterfaceC1493105sv interfaceC1493105sv) {
        this.LIZ.LIZIZ(enumC1240630iOD, map, interfaceC1493105sv);
    }

    @Override // com.ss.android.ugc.aweme.im.search.api.service.IIMSearchAnalyticsUtils
    public final Map<String, String> LIZJ(EnumC1240630iOD enumC1240630iOD, Map<String, String> map) {
        return this.LIZ.LIZJ(enumC1240630iOD, map);
    }

    @Override // com.ss.android.ugc.aweme.im.search.api.service.IIMSearchAnalyticsUtils
    public final Map<String, String> LIZLLL(EnumC1240610iOB enumC1240610iOB, EnumC1240620iOC enumC1240620iOC, IMUser iMUser, C0Y8T c0y8t, int i, int i2, boolean z, Integer num) {
        return this.LIZ.LIZLLL(enumC1240610iOB, enumC1240620iOC, iMUser, c0y8t, i, i2, z, num);
    }

    @Override // com.ss.android.ugc.aweme.im.search.api.service.IIMSearchAnalyticsUtils
    public final Map<String, String> LJ(EnumC1240610iOB enumC1240610iOB, EnumC1240620iOC enumC1240620iOC, C0Y8T c0y8t, int i, int i2, boolean z) {
        return this.LIZ.LJ(enumC1240610iOB, enumC1240620iOC, c0y8t, i, i2, z);
    }

    @Override // com.ss.android.ugc.aweme.im.search.api.service.IIMSearchAnalyticsUtils
    public final void LJFF(String str, String str2, String str3, String str4, Boolean bool, String str5, int i, InterfaceC1493105sv interfaceC1493105sv) {
        this.LIZ.LJFF(str, str2, str3, str4, bool, str5, i, interfaceC1493105sv);
    }
}
