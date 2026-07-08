package X;

import Y.AComparatorS500S0100000_1;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.assem.module.address.identity.CpfEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.assem.module.address.identity.CpfEnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.address.OspAddressViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfoOption;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfoPanel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.03KT, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.address.OspAddressViewModel$openCpfEditPage$1$1$1", f = "OspAddressViewModel.kt", l = {301}, m = "invokeSuspend")
public final class C03KT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ FragmentManager LLILLJJLI;
    public final /* synthetic */ View LLILLL;
    public final /* synthetic */ CpfEnterParams LLILZ;
    public final /* synthetic */ OspAddressViewModel LLILZIL;
    public final /* synthetic */ C259800zU<IdentityInfo> LLILZLL;
    public final /* synthetic */ Function1<IdentityInfo, Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C03KT(FragmentManager fragmentManager, View view, CpfEnterParams cpfEnterParams, OspAddressViewModel ospAddressViewModel, C259800zU<IdentityInfo> c259800zU, Function1<? super IdentityInfo, Unit> function1, InterfaceC1364105Vn<? super C03KT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = fragmentManager;
        this.LLILLL = view;
        this.LLILZ = cpfEnterParams;
        this.LLILZIL = ospAddressViewModel;
        this.LLILZLL = c259800zU;
        this.LLIZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C03KT(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfo] */
    /* JADX WARN: Type inference failed for: r4v12 */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        IdentityInfoPanel identityInfoPanel;
        List<IdentityInfoOption> identityInfoOptions;
        Object objLJIJ = obj;
        C1C7U.LIZ("OspAddressViewModel@f5ca.openCpfEditPage$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        ?? Copy = 0;
        listLJLLLL = null;
        listLJLLLL = null;
        List<IdentityInfoOption> listLJLLLL = null;
        IdentityInfoPanel identityInfoPanelCopy = null;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJIJ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJIJ);
            FragmentManager fragmentManager = this.LLILLJJLI;
            Bundle bundle = new Bundle();
            View view = this.LLILLL;
            CpfEnterParams cpfEnterParams = this.LLILZ;
            InterfaceC1748810vbr interfaceC1748810vbrLIZ = C1748730vbj.LIZ(view);
            if (interfaceC1748810vbrLIZ != null) {
                C960603pE.LJI(bundle, interfaceC1748810vbrLIZ, null);
            }
            C786410Ut5.LJJIJL(bundle, "cpf_enter_params", cpfEnterParams);
            bundle.putInt("height", C0H9H.LIZIZ(250));
            this.LL = 1;
            C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            CpfEditFragment.LLJILJIL = c2252611DEt;
            CpfEditFragment cpfEditFragment = new CpfEditFragment();
            cpfEditFragment.setArguments(bundle);
            cpfEditFragment.show(fragmentManager, "CpfEditFragment");
            objLJIJ = c2252611DEt.LJIJ();
            if (objLJIJ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLJIJ == objLJFF) {
                C1C7U.LIZIZ("OspAddressViewModel@f5ca.openCpfEditPage$1$1$1");
                return objLJFF;
            }
        }
        IdentityInfoOption identityInfoOption = (IdentityInfoOption) objLJIJ;
        if (identityInfoOption != null) {
            OspAddressViewModel ospAddressViewModel = this.LLILZIL;
            C259800zU<IdentityInfo> c259800zU = this.LLILZLL;
            Function1<IdentityInfo, Unit> function1 = this.LLIZ;
            ospAddressViewModel.setState(new AwS580S0100000_1(identityInfoOption, 23));
            IdentityInfo identityInfo = c259800zU.element;
            if (identityInfo != null) {
                IdentityInfoPanel identityInfoPanel2 = identityInfo.getIdentityInfoPanel();
                if (identityInfoPanel2 != null) {
                    IdentityInfo identityInfo2 = c259800zU.element;
                    if (identityInfo2 != null && (identityInfoPanel = identityInfo2.getIdentityInfoPanel()) != null && (identityInfoOptions = identityInfoPanel.getIdentityInfoOptions()) != null) {
                        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(identityInfoOptions, 10));
                        for (IdentityInfoOption identityInfoOptionCopy : identityInfoOptions) {
                            if (Intrinsics.LJFF(identityInfoOptionCopy.getType(), identityInfoOption.getType())) {
                                identityInfoOptionCopy = identityInfoOptionCopy.copy(identityInfoOptionCopy.type, identityInfoOptionCopy.name, identityInfoOption.getValue(), identityInfoOptionCopy.hint, identityInfoOptionCopy.encryptCpfInfo);
                            }
                            arrayList.add(identityInfoOptionCopy);
                        }
                        listLJLLLL = C13LP.LJLLLL(new AComparatorS500S0100000_1(identityInfoOption, 0), arrayList);
                    }
                    identityInfoPanelCopy = identityInfoPanel2.copy(identityInfoPanel2.title, identityInfoPanel2.description, identityInfoPanel2.invalidHint, listLJLLLL, identityInfoPanel2.taxSubmitButton, identityInfoPanel2.placeholderText);
                }
                Copy = identityInfo.copy(identityInfo.hintText, identityInfo.identityRequired, identityInfoOption, identityInfoPanelCopy, identityInfo.identityInfoCollectionStyle, identityInfo.recipientIdentityInfo, identityInfo.enableAddressIdentity, identityInfo.title);
            }
            c259800zU.element = Copy;
            ospAddressViewModel.setStateImmediate(new AwS580S0100000_1((IdentityInfo) Copy, 26));
            if (function1 != null) {
                function1.invoke(c259800zU.element);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OspAddressViewModel@f5ca.openCpfEditPage$1$1$1");
        return unit;
    }
}
