package X;

import Y.AComparatorS500S0100000_1;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.address.identity.AddressIdentityEditFragment;
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

/* JADX INFO: renamed from: X.03KU, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.address.OspAddressViewModel$openMxIdentityEditPage$1$1$1", f = "OspAddressViewModel.kt", l = {239}, m = "invokeSuspend")
public final class C03KU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ FragmentManager LLILLJJLI;
    public final /* synthetic */ View LLILLL;
    public final /* synthetic */ C259800zU<IdentityInfo> LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ Boolean LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ OspAddressViewModel LLJI;
    public final /* synthetic */ Function1<IdentityInfo, Unit> LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C03KU(FragmentManager fragmentManager, View view, C259800zU<IdentityInfo> c259800zU, String str, String str2, String str3, Boolean bool, String str4, OspAddressViewModel ospAddressViewModel, Function1<? super IdentityInfo, Unit> function1, InterfaceC1364105Vn<? super C03KU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = fragmentManager;
        this.LLILLL = view;
        this.LLILZ = c259800zU;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = str3;
        this.LLIZLLLIL = bool;
        this.LLJ = str4;
        this.LLJI = ospAddressViewModel;
        this.LLJIJIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C03KU(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfo] */
    /* JADX WARN: Type inference failed for: r5v15 */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        IdentityInfoPanel identityInfoPanel;
        IdentityInfoPanel identityInfoPanel2;
        List<IdentityInfoOption> identityInfoOptions;
        Object objLJIJ = obj;
        C1C7U.LIZ("OspAddressViewModel@f5ca.openMxIdentityEditPage$1$1$1");
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
            C259800zU<IdentityInfo> c259800zU = this.LLILZ;
            String str = this.LLILZIL;
            String str2 = this.LLILZLL;
            String str3 = this.LLIZ;
            Boolean bool = this.LLIZLLLIL;
            String str4 = this.LLJ;
            InterfaceC1748810vbr interfaceC1748810vbrLIZ = C1748730vbj.LIZ(view);
            if (interfaceC1748810vbrLIZ != null) {
                C960603pE.LJI(bundle, interfaceC1748810vbrLIZ, null);
            }
            IdentityInfo identityInfo = c259800zU.element;
            if (identityInfo != null) {
                identityInfoPanel = identityInfo.getIdentityInfoPanel();
            } else {
                identityInfoPanel = null;
            }
            C786410Ut5.LJJIJL(bundle, "rfc_curp_panel_data", identityInfoPanel);
            C786410Ut5.LJJJI("rfc_curp_panel_invalid_hint", str, bundle);
            C786410Ut5.LJJJI("rfc_curp_panel_fill_type", str2, bundle);
            C786410Ut5.LJJJI("trigger_event", str3, bundle);
            C786410Ut5.LJJJI("has_address", String.valueOf(bool), bundle);
            C786410Ut5.LJJJI("trackParams", str4, bundle);
            this.LL = 1;
            C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            AddressIdentityEditFragment.LLIZ = c2252611DEt;
            AddressIdentityEditFragment addressIdentityEditFragment = new AddressIdentityEditFragment();
            addressIdentityEditFragment.setArguments(bundle);
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJIJIIJIL = true;
            tuxSheet.LLJJIJI = addressIdentityEditFragment;
            c1390920mIc.LJIIIIZZ(2);
            TuxSheet tuxSheet2 = c1390920mIc.LIZ;
            tuxSheet2.LLILZIL = true;
            tuxSheet2.LLJLILLLLZIIL = false;
            c1390920mIc.LJI(16);
            c1390920mIc.LIZ.show(fragmentManager, "AddressIdentityEditFragment");
            objLJIJ = c2252611DEt.LJIJ();
            if (objLJIJ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLJIJ == objLJFF) {
                C1C7U.LIZIZ("OspAddressViewModel@f5ca.openMxIdentityEditPage$1$1$1");
                return objLJFF;
            }
        }
        IdentityInfoOption identityInfoOption = (IdentityInfoOption) objLJIJ;
        if (identityInfoOption != null) {
            OspAddressViewModel ospAddressViewModel = this.LLJI;
            C259800zU<IdentityInfo> c259800zU2 = this.LLILZ;
            Function1<IdentityInfo, Unit> function1 = this.LLJIJIL;
            ospAddressViewModel.setState(new AwS580S0100000_1(identityInfoOption, 25));
            IdentityInfo identityInfo2 = c259800zU2.element;
            if (identityInfo2 != null) {
                IdentityInfoPanel identityInfoPanel3 = identityInfo2.getIdentityInfoPanel();
                if (identityInfoPanel3 != null) {
                    IdentityInfo identityInfo3 = c259800zU2.element;
                    if (identityInfo3 != null && (identityInfoPanel2 = identityInfo3.getIdentityInfoPanel()) != null && (identityInfoOptions = identityInfoPanel2.getIdentityInfoOptions()) != null) {
                        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(identityInfoOptions, 10));
                        for (IdentityInfoOption identityInfoOptionCopy : identityInfoOptions) {
                            if (Intrinsics.LJFF(identityInfoOptionCopy.getType(), identityInfoOption.getType())) {
                                identityInfoOptionCopy = identityInfoOptionCopy.copy(identityInfoOptionCopy.type, identityInfoOptionCopy.name, identityInfoOption.getValue(), identityInfoOptionCopy.hint, identityInfoOptionCopy.encryptCpfInfo);
                            }
                            arrayList.add(identityInfoOptionCopy);
                        }
                        listLJLLLL = C13LP.LJLLLL(new AComparatorS500S0100000_1(identityInfoOption, 1), arrayList);
                    }
                    identityInfoPanelCopy = identityInfoPanel3.copy(identityInfoPanel3.title, identityInfoPanel3.description, identityInfoPanel3.invalidHint, listLJLLLL, identityInfoPanel3.taxSubmitButton, identityInfoPanel3.placeholderText);
                }
                Copy = identityInfo2.copy(identityInfo2.hintText, identityInfo2.identityRequired, identityInfoOption, identityInfoPanelCopy, identityInfo2.identityInfoCollectionStyle, identityInfo2.recipientIdentityInfo, identityInfo2.enableAddressIdentity, identityInfo2.title);
            }
            c259800zU2.element = Copy;
            ospAddressViewModel.setStateImmediate(new AwS580S0100000_1((IdentityInfo) Copy, 26));
            if (function1 != null) {
                function1.invoke(c259800zU2.element);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OspAddressViewModel@f5ca.openMxIdentityEditPage$1$1$1");
        return unit;
    }
}
