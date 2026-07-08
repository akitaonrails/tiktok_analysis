package X;

import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData;
import java.util.List;

/* JADX INFO: renamed from: X.0n8s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1423320n8s<CATEGORY, DATA, FETCH_DATA_RESULT_EXTRA_DATA, ERROR_DATA> {
    public final CATEGORY LIZ;
    public final List<DATA> LIZIZ;
    public final int LIZJ;
    public final FETCH_DATA_RESULT_EXTRA_DATA LIZLLL;
    public final ERROR_DATA LJ;
    public final boolean LJFF;
    public final String LJI;

    public /* synthetic */ C1423320n8s(TemplateCategoryData templateCategoryData, List list, int i, C1422890n8B c1422890n8B, C1422880n8A c1422880n8A) {
        this(templateCategoryData, list, i, c1422890n8B, c1422880n8A, false, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1423320n8s(CATEGORY category, List<? extends DATA> list, int i, FETCH_DATA_RESULT_EXTRA_DATA fetch_data_result_extra_data, ERROR_DATA error_data, boolean z, String str) {
        this.LIZ = category;
        this.LIZIZ = list;
        this.LIZJ = i;
        this.LIZLLL = fetch_data_result_extra_data;
        this.LJ = error_data;
        this.LJFF = z;
        this.LJI = str;
    }
}
