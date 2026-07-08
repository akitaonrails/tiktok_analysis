package X;

import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData;
import java.util.List;

/* JADX INFO: renamed from: X.0n8w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public interface InterfaceC1423360n8w<CATEGORY, DATA, ERROR_DATA, FETCH_CATEGORY_RESULT_EXTRA, FETCH_DATA_RESULT_EXTRA_DATA> {
    void LIZ(ERROR_DATA error_data);

    void LIZIZ(List<? extends CATEGORY> list, FETCH_CATEGORY_RESULT_EXTRA fetch_category_result_extra, C1423320n8s<CATEGORY, DATA, FETCH_DATA_RESULT_EXTRA_DATA, ERROR_DATA> c1423320n8s);

    void LIZJ(List list, C1423470n97 c1423470n97, TemplateCategoryData templateCategoryData, List list2, C1422890n8B c1422890n8B);

    void onCancel();
}
