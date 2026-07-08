package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.ecommerce.search.sug.ISearchSugContextAbility;
import com.ss.android.ugc.aweme.ecommerce.search.sug.ui.EcSearchSugAssem;
import com.ss.android.ugc.aweme.ecommerce.search.sug.vm.EcSearchSugAssemVM;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0QT7, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QT7 implements C0QU6 {
    public final ISearchSugContextAbility LIZ;
    public final /* synthetic */ EcSearchSugAssem LIZIZ;

    @Override // X.C0QU6
    public final ISearchSugContextAbility LIZJ() {
        return this.LIZ;
    }

    public C0QT7(EcSearchSugAssem ecSearchSugAssem) {
        this.LIZIZ = ecSearchSugAssem;
        this.LIZ = ecSearchSugAssem.kp().LLILLL;
    }

    @Override // X.C0QU6
    public final boolean LIZLLL(int i, SearchSugEntity searchSugEntity) throws JSONException {
        if (((Number) C0A5J.LIZ.getValue()).intValue() != 1 || i > 2) {
            return false;
        }
        this.LIZIZ.kp().vQ2(C1558520qew.LJIIL(this.LIZIZ), searchSugEntity, true, true);
        return true;
    }

    @Override // X.C0QU6
    public final void LJ(int i, SearchSugEntity searchSugEntity) {
        InterfaceC736910SvR<C0QTB> interfaceC736910SvR;
        C0QTB c0qtb;
        if (i >= 0 && i < this.LIZIZ.hp().getItemCount()) {
            ListProtector.remove(this.LIZIZ.hp().LLIZ, i);
            this.LIZIZ.hp().notifyItemRemoved(i);
        }
        EcSearchSugAssemVM ecSearchSugAssemVMKp = this.LIZIZ.kp();
        if (searchSugEntity != null && (interfaceC736910SvR = ecSearchSugAssemVMKp.LLJILJIL) != null && (c0qtb = (C0QTB) interfaceC736910SvR.getOperator()) != null) {
            c0qtb.LLZZ(searchSugEntity);
        }
    }

    @Override // X.C0QU6
    public final void LIZ(String str, Integer num, String str2, SearchSugEntity searchSugEntity) {
        String strJs1;
        int iLJ;
        String strAQ2 = this.LIZIZ.kp().AQ2();
        Integer numValueOf = Integer.valueOf(this.LIZIZ.kp().CQ2());
        ISearchSugContextAbility iSearchSugContextAbility = this.LIZIZ.kp().LLILLL;
        String id = null;
        if (iSearchSugContextAbility != null) {
            strJs1 = iSearchSugContextAbility.Js1();
        } else {
            strJs1 = null;
        }
        C0QTF c0qtf = new C0QTF();
        c0qtf.LIZLLL = strAQ2;
        c0qtf.LJIILLIIL("enter_from", strAQ2);
        c0qtf.LJIILLIIL("enter_method", "sug");
        if (numValueOf != null) {
            iLJ = numValueOf.intValue();
        } else {
            iLJ = C669740QOu.LJ();
        }
        c0qtf.LJIILLIIL("search_type", C0QTA.LIZ(iLJ));
        c0qtf.LJIILLIIL("words_type", str);
        c0qtf.LJIILLIIL("action_type", str2);
        c0qtf.LJIILLIIL("input_keyword", strJs1);
        c0qtf.LJIILLIIL("search_keyword", searchSugEntity.content);
        Word word = searchSugEntity.mWord;
        if (word != null) {
            id = word.getId();
        }
        c0qtf.LJIILLIIL("group_id", id);
        c0qtf.LJIILLIIL("order", String.valueOf(num));
        c0qtf.LJIILJJIL();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    @Override // X.C0QU6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(com.ss.android.ugc.aweme.search.model.SearchSugEntity r19, java.lang.String r20, int r21, boolean r22) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0QT7.LIZIZ(com.ss.android.ugc.aweme.search.model.SearchSugEntity, java.lang.String, int, boolean):void");
    }
}
