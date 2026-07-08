package X;

import com.ss.android.ugc.aweme.template.datamodel.TemplateDetailListModel;
import com.ss.android.ugc.aweme.template.datamodel.TemplateDetailModel;

/* JADX INFO: renamed from: X.0OkO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC628140OkO {
    public static final C628100OkK LIZ = C628100OkK.LIZ;

    @InterfaceC1501200pAU("/aweme/v1/mv/detail/")
    Object LIZ(@InterfaceC1501120pAM("mv_id") String str, @InterfaceC1501120pAM("mv_template_type") Integer num, @InterfaceC1501120pAM("source_id") Integer num2, @InterfaceC1501120pAM("app_version") String str2, @InterfaceC1501120pAM("featurebits") String str3, InterfaceC1364105Vn<? super TemplateDetailModel> interfaceC1364105Vn);

    @InterfaceC1501200pAU("/aweme/v1/mv/aweme/")
    Object LIZIZ(@InterfaceC1501120pAM("mv_id") String str, @InterfaceC1501120pAM("cursor") long j, @InterfaceC1501120pAM("mv_template_type") Integer num, @InterfaceC1501120pAM("page_extra") String str2, @InterfaceC1501120pAM("app_version") String str3, @InterfaceC1501120pAM("use_lazy_loading") int i, InterfaceC1364105Vn<? super TemplateDetailListModel> interfaceC1364105Vn);
}
