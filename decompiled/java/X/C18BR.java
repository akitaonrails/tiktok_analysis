package X;

import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.model.PageFinder;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.18BR, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18BR implements C18BS {
    public static final C18BR LIZ = new C18BR();
    public static int LIZIZ;

    @Override // X.C18BS
    public final void appendPageParams(PageFinder pageFinder, String str, BcmParams bcmParams) {
    }

    @Override // X.C18BS
    public final void appendUnitParams(PageFinder pageFinder, String str, BcmParams bcmParams) {
    }

    @Override // X.C18BS
    public final void clearBcmPageParams(PageFinder pageFinder, List<String> list) {
    }

    @Override // X.C18BS
    public final void configBusiness(String str, C21242718Bd c21242718Bd) {
    }

    @Override // X.C18BS
    public final Map<String, Object> getBcmParamsWithKey(PageFinder pageFinder, List<String> list, EnumC21242418Ba enumC21242418Ba, C18BZ c18bz, int i, boolean z) {
        return null;
    }

    @Override // X.C18HZ
    public final int getInitStatus() {
        return 0;
    }

    @Override // X.C18BS
    public final void init() {
    }

    @Override // X.C18BS
    public final void setBcmPageParams(PageFinder pageFinder, BcmParams bcmParams, Boolean bool) {
    }

    @Override // X.C18BS
    public final void setPageParams(PageFinder pageFinder, String str, BcmParams bcmParams) {
    }

    @Override // X.C18BS
    public final void setUnitParams(PageFinder pageFinder, String str, BcmParams bcmParams) {
    }

    @Override // X.C18HZ
    public final int getInitPrerequisites() {
        return LIZIZ;
    }

    @Override // X.C18BS
    public final Map<String, Object> getPageParams(PageFinder pageFinder) {
        return C2097608Jq.LJ();
    }

    @Override // X.C18HZ
    public final void setInitPrerequisites(int i) {
        LIZIZ = 1;
    }

    @Override // X.C18BS
    public final C21242818Be<Unit> setBcmParamsJSB(PageFinder pageFinder, Map<String, ? extends Object> map) {
        return new C21242818Be<>(4, "EmptyImpl", false);
    }

    @Override // X.C18BS
    public final C18C6 getBcmChainByBtmModel(C21244318Bt c21244318Bt, List<String> list, int i, boolean z) {
        return new C18C6();
    }

    @Override // X.C18BS
    public final C18C6 getBcmChainByFinder(PageFinder pageFinder, List<String> list, int i, boolean z) {
        return new C18C6();
    }

    @Override // X.C18BS
    public final C18C6 getBcmChainByToken(String str, List<String> list, int i, boolean z) {
        return new C18C6();
    }

    @Override // X.C18BS
    public final List<C677080Qh8> getBcmParamsWithBtm(PageFinder pageFinder, List<String> list, int i, boolean z) {
        return C13BV.INSTANCE;
    }

    @Override // X.C18BS
    public final Map<String, Object> getFullBcmParams(PageFinder pageFinder, EnumC21242418Ba enumC21242418Ba, C18BZ c18bz, int i, boolean z) {
        return C2097608Jq.LJ();
    }
}
