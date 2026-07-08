package X;

import com.ss.android.ugc.aweme.aiportrait.detail.model.AIPortraitDetailAwemeListModel;
import com.ss.android.ugc.aweme.aiportrait.detail.model.AIPortraitDetailHeaderModel;

/* JADX INFO: renamed from: X.0OCT, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public interface C0OCT {
    public static final C0OCU LIZ = C0OCU.LIZ;

    @InterfaceC1501200pAU("/api/portrait/post/detail")
    Object LIZ(@InterfaceC1501120pAM("template_id") String str, @InterfaceC1501120pAM("orig_prompt_id") String str2, @InterfaceC1501120pAM("root_prompt_id") String str3, InterfaceC1364105Vn<? super AIPortraitDetailHeaderModel> interfaceC1364105Vn);

    @InterfaceC1501200pAU("/api/portrait/post/list")
    Object LIZIZ(@InterfaceC1501120pAM("template_id") String str, @InterfaceC1501120pAM("orig_prompt_id") String str2, @InterfaceC1501120pAM("root_prompt_id") String str3, @InterfaceC1501120pAM("cursor") long j, @InterfaceC1501120pAM("count") long j2, InterfaceC1364105Vn<? super AIPortraitDetailAwemeListModel> interfaceC1364105Vn);
}
