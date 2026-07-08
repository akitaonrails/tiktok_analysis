package X;

import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData;
import java.util.List;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AFwS261S0000000_22;

/* JADX INFO: renamed from: X.0n8p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1423290n8p implements InterfaceC1423360n8w<Object, Object, Object, Object, Object> {
    public final /* synthetic */ C1423340n8u<Object, Object, Object, Object, Object, Object, Object, Object, Object, Object> LIZ;
    public final /* synthetic */ InterfaceC1423360n8w<Object, Object, Object, Object, Object> LIZIZ;

    @Override // X.InterfaceC1423360n8w
    public final void onCancel() {
        InterfaceC1423360n8w<Object, Object, Object, Object, Object> interfaceC1423360n8w = this.LIZIZ;
        if (interfaceC1423360n8w != null) {
            interfaceC1423360n8w.onCancel();
        }
    }

    @Override // X.InterfaceC1423360n8w
    public final void LIZ(Object obj) {
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseDataManager fetchCategoryList onFailure: ");
        sbLIZ.append(obj);
        C201955140j.LJII(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
        this.LIZ.LIZ.Qv(obj);
        InterfaceC1423360n8w<Object, Object, Object, Object, Object> interfaceC1423360n8w = this.LIZIZ;
        if (interfaceC1423360n8w != null) {
            interfaceC1423360n8w.LIZ(obj);
        }
    }

    public C1423290n8p(C1423340n8u<Object, Object, Object, Object, Object, Object, Object, Object, Object, Object> c1423340n8u, InterfaceC1423360n8w<Object, Object, Object, Object, Object> interfaceC1423360n8w) {
        this.LIZ = c1423340n8u;
        this.LIZIZ = interfaceC1423360n8w;
    }

    @Override // X.InterfaceC1423360n8w
    public final void LIZIZ(List<? extends Object> list, Object obj, C1423320n8s<Object, Object, Object, Object> c1423320n8s) {
        Object obj2;
        Integer numValueOf;
        List<Object> list2;
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseDataManager fetchCategoryList onSuccess: categoryList = ");
        Object obj3 = null;
        sbLIZ.append(C13LP.LJJLIIIJ(list, null, null, null, 0, null, AFwS261S0000000_22.get$arr$(283), 31));
        sbLIZ.append("\ndefaultCategoryInfo = (category = ");
        Object obj4 = null;
        if (c1423320n8s != null) {
            obj2 = c1423320n8s.LIZ;
        } else {
            obj2 = null;
        }
        sbLIZ.append(obj2);
        sbLIZ.append(", dataList.size = ");
        if (c1423320n8s != null && (list2 = c1423320n8s.LIZIZ) != null) {
            numValueOf = Integer.valueOf(list2.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", errorInfo = ");
        if (c1423320n8s != null) {
            obj3 = c1423320n8s.LJ;
        }
        sbLIZ.append(obj3);
        sbLIZ.append(", extra = ");
        if (c1423320n8s != null) {
            obj4 = c1423320n8s.LIZLLL;
        }
        sbLIZ.append(obj4);
        sbLIZ.append(')');
        C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
        boolean z = !this.LIZ.LIZ.t().isEmpty();
        this.LIZ.LIZ.Lv(list);
        if (c1423320n8s != null) {
            C1423340n8u<Object, Object, Object, Object, Object, Object, Object, Object, Object, Object> c1423340n8u = this.LIZ;
            InterfaceC1423360n8w<Object, Object, Object, Object, Object> interfaceC1423360n8w = this.LIZIZ;
            Object obj5 = c1423320n8s.LIZLLL;
            if (obj5 != null && c1423320n8s.LIZIZ != null) {
                InterfaceC1423430n93<Object, Object, Object, Object, Object, Object> interfaceC1423430n93 = c1423340n8u.LIZJ;
                if (interfaceC1423430n93 != null) {
                    interfaceC1423430n93.LIZ(c1423320n8s.LIZJ, c1423320n8s.LIZ, obj5);
                }
                c1423340n8u.LIZ.Nv(c1423320n8s.LIZ, c1423320n8s.LIZLLL, c1423320n8s.LIZIZ);
            } else {
                Object obj6 = c1423320n8s.LJ;
                if (obj6 != null) {
                    c1423340n8u.LIZ.Qv(obj6);
                    if (interfaceC1423360n8w != null) {
                        interfaceC1423360n8w.LIZ(c1423320n8s.LJ);
                    }
                }
            }
            if (!z) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("setCurCategory: BaseDataManager-onSuccess ");
                sbLIZ2.append(c1423320n8s.LIZ);
                C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ2));
                c1423340n8u.LIZ.Pv(c1423320n8s.LIZ, list);
            }
        }
        InterfaceC1423360n8w<Object, Object, Object, Object, Object> interfaceC1423360n8w2 = this.LIZIZ;
        if (interfaceC1423360n8w2 != null) {
            interfaceC1423360n8w2.LIZIZ(list, obj, c1423320n8s);
        }
    }

    @Override // X.InterfaceC1423360n8w
    public final void LIZJ(List list, C1423470n97 c1423470n97, TemplateCategoryData templateCategoryData, List list2, C1422890n8B c1422890n8B) {
        Integer numValueOf;
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseDataManager fetchCategoryList onCategorySuccess: categoryList = ");
        sbLIZ.append(C13LP.LJJLIIIJ(list, null, null, null, 0, null, AFwS257S0000000_19.get$arr$(673), 31));
        sbLIZ.append("\ndataList.size = ");
        if (list2 != null) {
            numValueOf = Integer.valueOf(list2.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append("\nfetchDataExtraData = ");
        sbLIZ.append(c1422890n8B);
        C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
        this.LIZ.LIZ.Lv(list);
        if (c1422890n8B != null && list2 != null) {
            this.LIZ.LIZ.Nv(templateCategoryData, c1422890n8B, list2);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("setCurCategory: BaseDataManager-onCategorySuccess ");
        sbLIZ2.append(templateCategoryData);
        C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ2));
        this.LIZ.LIZ.Pv(templateCategoryData, list);
        InterfaceC1423360n8w<Object, Object, Object, Object, Object> interfaceC1423360n8w = this.LIZIZ;
        if (interfaceC1423360n8w != null) {
            interfaceC1423360n8w.LIZJ(list, c1423470n97, templateCategoryData, list2, c1422890n8B);
        }
    }
}
