package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowPageData;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowRequestData;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zZd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1901190zZd {
    public static final EnumC1901190zZd CREATE_TIME;
    public static final EnumC1901190zZd FOLLOW_STATE;
    public static final EnumC1901190zZd HAS_READ;
    public static final /* synthetic */ EnumC1901190zZd[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public EnumC1901190zZd() {
        throw null;
    }

    public static InterfaceC2044707zh<EnumC1901190zZd> getEntries() {
        return LLILLJJLI;
    }

    public abstract int weight(FollowPageData... followPageDataArr);

    static {
        EnumC1901190zZd enumC1901190zZd = new EnumC1901190zZd() { // from class: X.0zZf
            @Override // X.EnumC1901190zZd
            public final int weight(FollowPageData... followPageDataArr) {
                FollowRequestData followRequestData;
                FollowPageData followPageData = followPageDataArr[0];
                MusNotice musNotice = followPageData.notice;
                if ((musNotice == null || !musNotice.hasRead) && ((followRequestData = followPageData.followRequest) == null || !followRequestData.hasRead)) {
                    return 0;
                }
                return 1;
            }
        };
        HAS_READ = enumC1901190zZd;
        EnumC1901190zZd enumC1901190zZd2 = new EnumC1901190zZd() { // from class: X.0zZe
            /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x0064 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
            @Override // X.EnumC1901190zZd
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final int weight(com.ss.android.ugc.aweme.notice.repo.list.bean.FollowPageData... r7) {
                /*
                    r6 = this;
                    r5 = 0
                    r0 = r7[r5]
                    com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r4 = r0.notice
                    if (r4 == 0) goto L67
                    com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice r0 = r4.templateNotice
                    r3 = 1
                    if (r0 == 0) goto L3f
                    java.lang.Integer r0 = r0.type
                    if (r0 == 0) goto L3f
                    int r1 = r0.intValue()
                    r0 = 33
                    if (r1 != r0) goto L3f
                    com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice r0 = r4.templateNotice
                    if (r0 == 0) goto L48
                    com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplate r0 = r0.uiTemplate
                    if (r0 == 0) goto L48
                    com.ss.android.ugc.aweme.notice.repo.list.uitemplate.TitleTemplate r0 = r0.titleTemplate
                    if (r0 == 0) goto L48
                    java.util.List<com.ss.android.ugc.aweme.profile.model.User> r0 = r0.fromUsers
                    if (r0 == 0) goto L48
                    java.lang.Object r0 = X.C13LP.LJJJLL(r0)
                    com.ss.android.ugc.aweme.profile.model.User r0 = (com.ss.android.ugc.aweme.profile.model.User) r0
                L2e:
                    if (r0 == 0) goto L48
                    int r2 = r0.getFollowStatus()
                    r1 = 2
                    if (r2 == r1) goto L3e
                    int r1 = r0.getFollowStatus()
                    r0 = 4
                    if (r1 != r0) goto L48
                L3e:
                    return r3
                L3f:
                    com.ss.android.ugc.aweme.notice.repo.list.bean.FollowNotice r0 = r4.followNotice
                    if (r0 == 0) goto L48
                    com.ss.android.ugc.aweme.profile.model.User r0 = r0.getUser()
                    goto L2e
                L48:
                    com.ss.android.ugc.aweme.notification.utils.FollowSortDataCache r0 = com.ss.android.ugc.aweme.notification.utils.FollowSortDataCache.LIZ
                    java.lang.String r1 = r4.nid
                    r0.getClass()
                    com.ss.android.ugc.aweme.notification.utils.FollowSortDataCache.LIZ()
                    java.util.LinkedHashMap<java.lang.String, java.lang.Integer> r0 = com.ss.android.ugc.aweme.notification.utils.FollowSortDataCache.LIZIZ
                    java.lang.Object r0 = r0.get(r1)
                    java.lang.Integer r0 = (java.lang.Integer) r0
                    if (r0 == 0) goto L65
                    int r1 = r0.intValue()
                L60:
                    int r0 = com.ss.android.ugc.aweme.notification.utils.FollowSortDataCache.LIZJ
                    if (r1 < r0) goto L67
                    return r3
                L65:
                    r1 = 0
                    goto L60
                L67:
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1901200zZe.weight(com.ss.android.ugc.aweme.notice.repo.list.bean.FollowPageData[]):int");
            }
        };
        FOLLOW_STATE = enumC1901190zZd2;
        EnumC1901190zZd enumC1901190zZd3 = new EnumC1901190zZd() { // from class: X.0zZi
            @Override // X.EnumC1901190zZd
            public final int weight(FollowPageData... followPageDataArr) {
                long j = followPageDataArr[0].createTime;
                long j2 = followPageDataArr[1].createTime;
                if (j < j2) {
                    return 1;
                }
                if (j <= j2) {
                    return 0;
                }
                return -1;
            }
        };
        CREATE_TIME = enumC1901190zZd3;
        EnumC1901190zZd[] enumC1901190zZdArr = {enumC1901190zZd, enumC1901190zZd2, enumC1901190zZd3};
        LL = enumC1901190zZdArr;
        LLILLJJLI = new C2254308sP(enumC1901190zZdArr);
    }

    public static EnumC1901190zZd[] values() {
        return (EnumC1901190zZd[]) LL.clone();
    }

    public static EnumC1901190zZd valueOf(String str) {
        return (EnumC1901190zZd) C08FF.LIZ(EnumC1901190zZd.class, str);
    }

    public EnumC1901190zZd(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
    }
}
