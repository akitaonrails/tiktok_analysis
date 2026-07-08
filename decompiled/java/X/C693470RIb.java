package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.feed.platform.ab.AnnotationContainerPerfConfig;
import com.ss.android.ugc.feed.platform.cell.BaseCellPlaceHolderComponent;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.cell.interact.info.InteractInfoAreaComponent;
import com.ss.android.ugc.feed.platform.cell.interact.info.annotation.FcpAnnotationContainer;
import com.ss.android.ugc.feed.platform.cell.interact.info.bottomlabel.FcpBottomTagContainerAssem;
import com.ss.android.ugc.feed.platform.container.core.BaseContainer;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS14S0401000_11;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS3S0501000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: renamed from: X.0RIb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C693470RIb extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ ReusedUIAssem<? extends C03H5> LL;

    /* JADX INFO: Incorrect field signature: TASSEM; */
    public final /* synthetic */ BaseContainer LLILLJJLI;
    public final /* synthetic */ C0RPZ LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ ViewGroup LLILZIL;
    public final /* synthetic */ RootCellCommonAbility LLILZLL;
    public final /* synthetic */ InteractAreaCommonAbility LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Lcom/bytedance/assem/arch/reused/ReusedUIAssem<+LX/03H5;>;TASSEM;LX/0RPZ;ILandroid/view/ViewGroup;Lcom/ss/android/ugc/feed/platform/cell/RootCellCommonAbility;Lcom/ss/android/ugc/feed/platform/cell/interact/InteractAreaCommonAbility;)V */
    public C693470RIb(ReusedUIAssem reusedUIAssem, BaseContainer baseContainer, C0RPZ c0rpz, int i, ViewGroup viewGroup, RootCellCommonAbility rootCellCommonAbility, InteractAreaCommonAbility interactAreaCommonAbility) {
        super(1);
        this.LL = reusedUIAssem;
        this.LLILLJJLI = baseContainer;
        this.LLILLL = c0rpz;
        this.LLILZ = i;
        this.LLILZIL = viewGroup;
        this.LLILZLL = rootCellCommonAbility;
        this.LLIZ = interactAreaCommonAbility;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        C698920RbG c698920RbGRy0;
        Assembler assembler2 = assembler;
        ReusedUIAssem<? extends C03H5> reusedUIAssem = this.LL;
        if (reusedUIAssem instanceof FcpBottomTagContainerAssem) {
            assembler2.LQ2(this.LLILLJJLI, new C0RBH(this.LLILZIL, reusedUIAssem));
        } else if (reusedUIAssem instanceof BaseCellTriggerComponent) {
            C0RJE.LIZJ(assembler2, this.LLILLJJLI, new C693520RIg(this.LLILLL, this.LLILZ, this.LLILZIL, reusedUIAssem, this.LLILZLL));
        } else if (reusedUIAssem instanceof FcpAnnotationContainer) {
            AnnotationContainerPerfConfig annotationContainerPerfConfig = (AnnotationContainerPerfConfig) C693530RIh.LIZIZ.getValue();
            if (annotationContainerPerfConfig != null && annotationContainerPerfConfig.downgradeContainer) {
                BaseContainer baseContainer = this.LLILLJJLI;
                C0RI6.LIZ(assembler2, baseContainer, new AwS3S0501000_11(baseContainer, this.LLILLL, this.LLILZ, this.LLILZIL, this.LL, this.LLILZLL, 11));
            } else {
                assembler2.LQ2(this.LLILLJJLI, new AwS14S0401000_11(this.LLILLL, (C0RPZ) this.LLILZ, (int) this.LLILZIL, (ViewGroup) this.LL, (ReusedUIAssem<? extends C03H5>) this.LLILZLL, (RootCellCommonAbility) 1));
            }
        } else if (reusedUIAssem instanceof BaseCellSlotComponent) {
            assembler2.MQ2(this.LLILLJJLI, new AwS14S0401000_11(this.LLILLL, (C0RPZ) this.LLILZ, (int) this.LLILZIL, (ViewGroup) reusedUIAssem, (ReusedUIAssem<? extends C03H5>) this.LLILZLL, (RootCellCommonAbility) 2));
        } else if (reusedUIAssem instanceof BaseCellPlaceHolderComponent) {
            View viewLIZIZ = this.LLILLL.LIZIZ(this.LLILZ, this.LLILZIL, this.LL, this.LLILZLL);
            ReusedUIAssem<? extends C03H5> reusedUIAssem2 = this.LL;
            BaseContainer baseContainer2 = this.LLILLJJLI;
            ViewGroup viewGroup = this.LLILZIL;
            InteractAreaCommonAbility interactAreaCommonAbility = this.LLIZ;
            BaseCellPlaceHolderComponent baseCellPlaceHolderComponent = (BaseCellPlaceHolderComponent) reusedUIAssem2;
            if (baseCellPlaceHolderComponent.ep()) {
                assembler2.LQ2(baseContainer2, new AwS377S0200000_11(viewLIZIZ, (View) reusedUIAssem2, (ReusedUIAssem<? extends C03H5>) 87));
            } else {
                if (C1866840ygE.LIZ()) {
                    C0RCN.LIZJ(viewLIZIZ, baseCellPlaceHolderComponent.LLJJJJLIIL, viewGroup, new AwS555S0100000_11((ReusedUIAssem) reusedUIAssem2, (ReusedUIAssem<? extends C03H5>) 1355));
                }
                if (baseContainer2 instanceof InteractInfoAreaComponent) {
                    if (interactAreaCommonAbility != null && (c698920RbGRy0 = interactAreaCommonAbility.Ry0()) != null) {
                        c698920RbGRy0.LIZ(viewLIZIZ);
                    }
                    viewLIZIZ.setTag(R.id.el6, Boolean.TRUE);
                }
                if (interactAreaCommonAbility != null) {
                    interactAreaCommonAbility.j52(viewLIZIZ, baseCellPlaceHolderComponent.LLJJJJLIIL);
                }
            }
        } else {
            throw new IllegalStateException("The type implementing InteractAreaIndexProtocol is not supported!");
        }
        return Unit.LIZ;
    }
}
