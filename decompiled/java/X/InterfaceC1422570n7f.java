package X;

import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData;
import com.ss.android.ugc.aweme.tools.mvtemplate.search.datasource.TemplateSearchNetApi;
import com.ss.android.ugc.effectmanager.effect.model.FilteredAsset;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0n7f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public interface InterfaceC1422570n7f extends C05YF {
    public static final C1422660n7o LJLJL = new Object() { // from class: X.0n7o
    };

    C1422960n8I AB1();

    LiveEvent<Integer> CX0();

    void ES1(C1419590n2r c1419590n2r, int i, InterfaceC1422310n7F interfaceC1422310n7F, TemplateCategoryData templateCategoryData, Function1<? super Boolean, Unit> function1);

    void Ff1(int i);

    void GO2(boolean z);

    C385670FAf<TemplateCategoryData> Hv();

    C385670FAf<Map<TemplateCategoryData, Pair<C1422890n8B, List<C1419590n2r>>>> Jb2();

    boolean NJ2(C1422430n7R c1422430n7R);

    List<C1419590n2r> PE(TemplateCategoryData templateCategoryData);

    C1419590n2r RN();

    TemplateCategoryData Y8();

    void bA0(CutsameDataItem cutsameDataItem);

    boolean dy2();

    void fR0(C1419590n2r c1419590n2r);

    void fo2();

    void iE0(C1419590n2r c1419590n2r);

    Pair<EnumC1423670n9R, EnumC1423670n9R> ix2();

    FilteredAsset kQ0(C1419590n2r c1419590n2r);

    C385670FAf<AbstractC788620Uwe> mO2(InterfaceC816210W0d<TemplateSearchNetApi> interfaceC816210W0d);

    void pG1(TemplateCategoryData templateCategoryData);

    Set<C1422430n7R> pf0();

    Object rG(String str, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn);

    boolean s92(TemplateCategoryData templateCategoryData, boolean z, boolean z2, boolean z3, int i, int i2);

    List<TemplateCategoryData> t();

    C385670FAf<C1419590n2r> vO1();

    boolean wO1();

    LiveEvent<C1422880n8A> wo();

    C385670FAf<List<TemplateCategoryData>> xe();

    boolean yG1();

    void zp1(boolean z, String str, int i, boolean z2, InterfaceC1422520n7a interfaceC1422520n7a);
}
