package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0TMG, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public interface C0TMG {
    public static final C0TMH LIZ = C0TMH.LIZ;

    @InterfaceC1501240pAY("/tiktok/v1/ad/dark/post/update/")
    C0X9S<String> LIZ(@InterfaceC1501120pAM("item_id") String str, @InterfaceC1501120pAM(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS) int i);

    @InterfaceC1501200pAU("/aweme/v1/ad/settings/")
    C0X9S<String> LIZIZ(@InterfaceC1501120pAM("item_id") String str);

    @InterfaceC1501240pAY("/aweme/v1/ad/settings/promote/update/")
    C0X9S<String> LIZJ(@InterfaceC1501120pAM("item_id") String str, @InterfaceC1501120pAM("promotable") boolean z);

    @InterfaceC1501240pAY("/tiktok/v1/ad/auth/extend/")
    C0X9S<String> LIZLLL(@InterfaceC1501120pAM("item_id") String str, @InterfaceC1501120pAM("extend_time") long j);

    @InterfaceC1501240pAY("/aweme/v1/ad/settings/code/delete/")
    C0X9S<String> LJ(@InterfaceC1501120pAM("item_id") String str, @InterfaceC1501120pAM("confirm") boolean z);

    @InterfaceC1501240pAY("/aweme/v1/ad/settings/code/generate/")
    C0X9S<String> LJFF(@InterfaceC1501120pAM("item_id") String str, @InterfaceC1501120pAM("start_time") long j, @InterfaceC1501120pAM("end_time") long j2);
}
