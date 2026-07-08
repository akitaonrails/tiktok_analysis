package X;

import com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0VkW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C806580VkW extends C09AY implements Function1<FriendsV3FeedModel, Boolean> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C806580VkW(String str, String str2) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean invoke(com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedModel r4) {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedModel r4 = (com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedModel) r4
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.aweme
            r2 = 0
            if (r0 == 0) goto L5d
            java.lang.String r1 = r0.getAid()
        Lb:
            java.lang.String r0 = r3.LL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L29
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.aweme
            if (r0 == 0) goto L5b
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            if (r0 == 0) goto L5b
            java.lang.String r1 = r0.getUid()
        L21:
            java.lang.String r0 = r3.LLILLJJLI
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L51
        L29:
            com.ss.android.ugc.aweme.friendstab.repo.FriendsV3RepostModel r0 = r4.repostItem
            if (r0 == 0) goto L59
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.repostedAweme
            if (r0 == 0) goto L59
            java.lang.String r1 = r0.getAid()
        L35:
            java.lang.String r0 = r3.LL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L57
            com.ss.android.ugc.aweme.friendstab.repo.FriendsV3RepostModel r0 = r4.repostItem
            if (r0 == 0) goto L49
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.reposter
            if (r0 == 0) goto L49
            java.lang.String r2 = r0.getUid()
        L49:
            java.lang.String r0 = r3.LLILLJJLI
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 == 0) goto L57
        L51:
            r0 = 1
        L52:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L57:
            r0 = 0
            goto L52
        L59:
            r1 = r2
            goto L35
        L5b:
            r1 = r2
            goto L21
        L5d:
            r1 = r2
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C806580VkW.invoke(java.lang.Object):java.lang.Object");
    }
}
