package X;

import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.ecommerce.base.osp.assem.module.address.identity.CpfAssem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.assem.module.address.identity.CpfEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.assem.module.address.identity.CpfViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CheckIdentityResponse;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CheckIdentityResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfoOption;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfoPanel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS235S0300000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import njp.a;

/* JADX INFO: renamed from: X.0vcE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.assem.module.address.identity.CpfAssem$initBottomArea$2$1", f = "CpfAssem.kt", l = {265}, m = "invokeSuspend")
public final class C1749040vcE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CpfAssem LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ View LLILZ;
    public final /* synthetic */ C1749190vcT LLILZIL;
    public final /* synthetic */ IdentityInfoPanel LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1749040vcE(CpfAssem cpfAssem, String str, View view, C1749190vcT c1749190vcT, IdentityInfoPanel identityInfoPanel, InterfaceC1364105Vn<? super C1749040vcE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = cpfAssem;
        this.LLILLL = str;
        this.LLILZ = view;
        this.LLILZIL = c1749190vcT;
        this.LLILZLL = identityInfoPanel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1749040vcE(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        IdentityInfoOption identityInfoOptionCopy;
        String str;
        CheckIdentityResponseData checkIdentityResponseData;
        String str2;
        Object objVQ2 = obj;
        C1C7U.LIZ("CpfAssem@38ec.initBottomArea$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        IdentityInfoOption identityInfoOptionCopy2 = null;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objVQ2);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objVQ2);
            CpfAssem cpfAssem = this.LLILLJJLI;
            IdentityInfoOption identityInfoOption = cpfAssem.LLJILJIL;
            if (identityInfoOption != null) {
                identityInfoOptionCopy = identityInfoOption.copy(identityInfoOption.type, identityInfoOption.name, this.LLILLL, identityInfoOption.hint, identityInfoOption.encryptCpfInfo);
            } else {
                identityInfoOptionCopy = null;
            }
            cpfAssem.LLJILJIL = identityInfoOptionCopy;
            AssemVMLazy assemVMLazy = this.LLILLJJLI.LLIZLLLIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = CpfAssem.LLJJIII;
            CpfViewModel cpfViewModel = (CpfViewModel) assemVMLazy.getValue();
            IdentityInfoOption identityInfoOption2 = this.LLILLJJLI.LLJILJIL;
            this.LL = 1;
            objVQ2 = cpfViewModel.vQ2(identityInfoOption2, this);
            if (objVQ2 == objLJFF) {
                C1C7U.LIZIZ("CpfAssem@38ec.initBottomArea$2$1");
                return objLJFF;
            }
        }
        Pair pair = (Pair) objVQ2;
        EnumC1749060vcG enumC1749060vcG = (EnumC1749060vcG) pair.getFirst();
        CheckIdentityResponse checkIdentityResponse = (CheckIdentityResponse) pair.getSecond();
        if (checkIdentityResponse != null && (checkIdentityResponseData = checkIdentityResponse.data) != null && (str2 = checkIdentityResponseData.encryptCpfInfo) != null) {
            CpfAssem cpfAssem2 = this.LLILLJJLI;
            IdentityInfoOption identityInfoOption3 = cpfAssem2.LLJILJIL;
            if (identityInfoOption3 != null) {
                identityInfoOptionCopy2 = identityInfoOption3.copy(identityInfoOption3.type, identityInfoOption3.name, identityInfoOption3.value, identityInfoOption3.hint, str2);
            }
            cpfAssem2.LLJILJIL = identityInfoOptionCopy2;
        }
        C1748720vbi.LIZLLL(this.LLILZ, new C049Y(), new AwS605S0100000_26(this.LLILLJJLI, 27));
        C1748720vbi.LIZLLL(this.LLILZ, new C10514049g(), new AwS235S0300000_26(this.LLILLJJLI, enumC1749060vcG, this.LLILZLL, 1));
        if (enumC1749060vcG == EnumC1749060vcG.SUCCESS) {
            InterfaceC20236714Gf<IdentityInfoOption> interfaceC20236714Gf = ((C883103cj) this.LLILLJJLI.LLJ.getValue()).LLILLJJLI;
            if (interfaceC20236714Gf != null) {
                IdentityInfoOption identityInfoOption4 = this.LLILLJJLI.LLJILJIL;
                C189200o6.m2constructorimpl(identityInfoOption4);
                interfaceC20236714Gf.resumeWith(identityInfoOption4);
            }
            C1748440vbG c1748440vbG = this.LLILLJJLI.LLJIJIL;
            if (c1748440vbG != null) {
                c1748440vbG.setValidationStatus(0);
            }
            CpfEditFragment cpfEditFragmentHo = this.LLILLJJLI.Ho();
            if (cpfEditFragmentHo != null) {
                cpfEditFragmentHo.dismissAllowingStateLoss();
            }
        } else {
            int i2 = C1749050vcF.LIZ[enumC1749060vcG.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        str = this.LLILLJJLI.Go().networkErrHint;
                    } else if (checkIdentityResponse == null || (str = checkIdentityResponse.message) == null) {
                        str = this.LLILLJJLI.Go().vendorCheckFailHint;
                    }
                } else {
                    str = this.LLILLJJLI.Go().vendorCheckFailHint;
                }
            } else {
                str = this.LLILLJJLI.Go().formatInvalidHint;
            }
            C1749190vcT c1749190vcT = this.LLILZIL;
            if (c1749190vcT != null) {
                c1749190vcT.LIZJ(str);
                c1749190vcT.LJFF(true);
            }
            C1748440vbG c1748440vbG2 = this.LLILLJJLI.LLJIJIL;
            if (c1748440vbG2 != null) {
                c1748440vbG2.setValidationStatus(3);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CpfAssem@38ec.initBottomArea$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
