package X;

import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.model.PageFinder;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.18BS, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public interface C18BS extends C18HZ {
    void appendPageParams(PageFinder pageFinder, String str, BcmParams bcmParams);

    void appendUnitParams(PageFinder pageFinder, String str, BcmParams bcmParams);

    void clearBcmPageParams(PageFinder pageFinder, List<String> list);

    void configBusiness(String str, C21242718Bd c21242718Bd);

    C18C6 getBcmChainByBtmModel(C21244318Bt c21244318Bt, List<String> list, int i, boolean z);

    C18C6 getBcmChainByFinder(PageFinder pageFinder, List<String> list, int i, boolean z);

    C18C6 getBcmChainByToken(String str, List<String> list, int i, boolean z);

    List<C677080Qh8> getBcmParamsWithBtm(PageFinder pageFinder, List<String> list, int i, boolean z);

    Map<String, Object> getBcmParamsWithKey(PageFinder pageFinder, List<String> list, EnumC21242418Ba enumC21242418Ba, C18BZ c18bz, int i, boolean z);

    Map<String, Object> getFullBcmParams(PageFinder pageFinder, EnumC21242418Ba enumC21242418Ba, C18BZ c18bz, int i, boolean z);

    Map<String, Object> getPageParams(PageFinder pageFinder);

    void init();

    void setBcmPageParams(PageFinder pageFinder, BcmParams bcmParams, Boolean bool);

    C21242818Be<Unit> setBcmParamsJSB(PageFinder pageFinder, Map<String, ? extends Object> map);

    void setPageParams(PageFinder pageFinder, String str, BcmParams bcmParams);

    void setUnitParams(PageFinder pageFinder, String str, BcmParams bcmParams);
}
