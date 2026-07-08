package X;

import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0n6u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class C1422100n6u extends C2217421BqW implements InterfaceC1631630sYr<Integer, C1419590n2r, TemplateCategoryData, Long, Unit> {
    public C1422100n6u(C1422180n72 c1422180n72) {
        super(4, c1422180n72, C1422180n72.class, "notifyPlayTime", "notifyPlayTime(ILcom/ss/android/ugc/aweme/tools/mvtemplate/core/MixAsset;Lcom/ss/android/ugc/aweme/tools/mvtemplate/core/TemplateCategoryData;J)V", 0);
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(Integer num, C1419590n2r c1419590n2r, TemplateCategoryData templateCategoryData, Long l) {
        long jLongValue = l.longValue();
        C1422180n72 c1422180n72 = (C1422180n72) this.receiver;
        c1422180n72.getClass();
        c1422180n72.LJFF(new C1422090n6t(num.intValue(), c1419590n2r, templateCategoryData, jLongValue, c1422180n72));
        return Unit.LIZ;
    }
}
