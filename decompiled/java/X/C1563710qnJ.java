package X;

import Y.ARunnableS93S0200000_24;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.IHomeTabService;
import com.ss.android.ugc.aweme.ab.TopGifterColdStartConfig;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import com.ss.android.ugc.aweme.ecommerce.mall.MallServiceManager;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IMallServiceManager;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IShopIconService;
import com.ss.android.ugc.aweme.ecommerce.ug.backbutton.NodeTagAssem;
import com.ss.android.ugc.aweme.ecommerce.ug.backbutton.service.IEcUgBackButtonServiceOfficial;
import com.ss.android.ugc.aweme.ecommerce.ug.coldbootdowngrade.service.IEcUgColdBootDowngradeService;
import com.ss.android.ugc.aweme.ecommerce.ug.common.service.IEcUgCommonService;
import com.ss.android.ugc.aweme.experiment.ColdBootDegradeAssem;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.assems.tabs.TabAbilityAssem;
import com.ss.android.ugc.aweme.main.preload.ShopDotAssemPreloader;
import com.ss.android.ugc.aweme.services.IExternalService;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS246S0300000_2;
import kotlin.jvm.internal.AwS268S0300000_24;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: renamed from: X.0qnJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1563710qnJ {
    public static final AbstractC738140SxQ LJ(C19EG c19eg) {
        C1563740qnM c1563740qnM = new C1563740qnM();
        Object objLIZJ = C1492110ovp.LIZJ("getFriendChildTabAssem_preload", c1563740qnM, new C1559120qfu(c1563740qnM), ((Boolean) C2219251BtT.LIZIZ.getValue()).booleanValue());
        if (objLIZJ != null) {
            if (((Boolean) objLIZJ).booleanValue()) {
                C1559110qft.LIZ = false;
                return C1595430rcT.LIZIZ.LIZJ().initSocial2TabV1Assem(c19eg, C08TU.LIZ());
            }
            return null;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final void LIZ(final Assembler assembler, final LifecycleOwner lifecycleOwner) {
        IEcUgCommonService iEcUgCommonService;
        C19719912Dl c19719912DlLIZJ;
        IECommerceMallService iECommerceMallService;
        C13IQ<? extends AbstractC738140SxQ> c13iqLJIIIZ;
        IShopIconService iShopIconServiceLIZ;
        AbstractC738140SxQ abstractC738140SxQLIZ;
        Object obj;
        IShopIconService iShopIconServiceLIZ2;
        AbstractC738140SxQ abstractC738140SxQLIZ2;
        NodeTagAssem nodeTagAssemLIZJ;
        C0K77 c0k77C3;
        C13IQ<? extends AbstractC738140SxQ> c13iqLIZJ;
        assembler.vQ2(lifecycleOwner, new C1132804bu());
        assembler.vQ2(lifecycleOwner, new C1132904bv());
        assembler.vQ2(lifecycleOwner, new C1132704bt());
        if (((TopGifterColdStartConfig) C0J8K.LIZIZ.getValue()).mainEnable) {
            assembler.vQ2(lifecycleOwner, new C1132304bp());
        }
        if (!ColdBootDegradeAssem.LIZIZ()) {
            assembler.vQ2(lifecycleOwner, AFwS264S0000000_24.get$arr$(211));
        }
        IEcUgColdBootDowngradeService iEcUgColdBootDowngradeService = (IEcUgColdBootDowngradeService) PluggableExtentionKt.pluggableSpi$default(IEcUgColdBootDowngradeService.class, false, false, false, 14, null);
        if ((iEcUgColdBootDowngradeService == null || !iEcUgColdBootDowngradeService.LIZIZ() || C1514430pVp.LIZLLL().booleanValue()) && (iEcUgCommonService = (IEcUgCommonService) PluggableExtentionKt.pluggableSpi$default(IEcUgCommonService.class, false, false, false, 14, null)) != null && (c19719912DlLIZJ = iEcUgCommonService.LIZJ()) != null) {
            assembler.vQ2(lifecycleOwner, new AwS581S0100000_2((C13IQ) c19719912DlLIZJ, (C13IQ<? extends UISlotAssem>) 263));
        }
        IEcUgColdBootDowngradeService iEcUgColdBootDowngradeService2 = (IEcUgColdBootDowngradeService) PluggableExtentionKt.pluggableSpi$default(IEcUgColdBootDowngradeService.class, false, false, false, 14, null);
        if ((iEcUgColdBootDowngradeService2 == null || !iEcUgColdBootDowngradeService2.LIZLLL()) && (iECommerceMallService = (IECommerceMallService) ServiceManager.get().getService(IECommerceMallService.class)) != null && (c13iqLJIIIZ = iECommerceMallService.LJIIIZ()) != null) {
            assembler.vQ2(lifecycleOwner, new C1147204eE(c13iqLJIIIZ));
        }
        ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
        if (iLiveOuterService != null && (c0k77C3 = iLiveOuterService.C3()) != null && (c13iqLIZJ = c0k77C3.LIZJ()) != null) {
            assembler.vQ2(lifecycleOwner, new AwS581S0100000_2((C13IQ) c13iqLIZJ, (C13IQ<? extends UISlotAssem>) 264));
        }
        long j = C0BFW.LIZ;
        if (j != -1) {
            C0CN5.LIZIZ(Long.valueOf(j), new Runnable() { // from class: X.0qeV
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("MainActivityAssemKt@195a.assembleAssem$3$1$9");
                    try {
                        assembler.vQ2(lifecycleOwner, AFwS264S0000000_24.get$arr$(212));
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("MainActivityAssemKt@195a.assembleAssem$3$1$9");
                }
            });
        } else {
            assembler.vQ2(lifecycleOwner, new C1558260qeW());
        }
        assembler.vQ2(lifecycleOwner, new C1133204by());
        if (!C285090BFj.LJI()) {
            assembler.vQ2(lifecycleOwner, new C710880RuY());
        }
        assembler.vQ2(lifecycleOwner, new C1558200qeQ());
        if (!((Boolean) C285090BFj.LJLJJI.getValue()).booleanValue()) {
            assembler.vQ2(lifecycleOwner, AFwS243S0000000_11.get$arr$(297));
        }
        assembler.vQ2(lifecycleOwner, AFwS229S0000000_2.get$arr$(404));
        C13IQ<? extends AbstractC738140SxQ> c13iqLJJIIZ = ((IComplianceBusinessService) ServiceManager.get().getService(IComplianceBusinessService.class)).LJJIIZ();
        if (c13iqLJJIIZ != null) {
            assembler.vQ2(lifecycleOwner, new AwS581S0100000_2((C13IQ) c13iqLJJIIZ, (C13IQ<? extends UISlotAssem>) 262));
        }
        C13IQ<? extends AbstractC738140SxQ> c13iqLJIILL = ComplianceServiceProvider.LJI().LJIILL();
        if (c13iqLJIILL != null) {
            C0S78.LIZJ(new AwS246S0300000_2(assembler, (Assembler) lifecycleOwner, (LifecycleOwner) c13iqLJIILL, (C13IQ<? extends AbstractC738140SxQ>) 9), true);
        }
        assembler.vQ2(lifecycleOwner, AFwS229S0000000_2.get$arr$(405));
        assembler.vQ2(lifecycleOwner, new C1133104bx());
        if (!((Boolean) C1EKN.LJIIIIZZ.getValue()).booleanValue()) {
            assembler.vQ2(lifecycleOwner, new C1563450qmt());
        }
        assembler.vQ2(lifecycleOwner, new C1563760qnO());
        assembler.vQ2(lifecycleOwner, new C1133304bz());
        assembler.vQ2(lifecycleOwner, AFwS229S0000000_2.get$arr$(407));
        if (!ColdBootDegradeAssem.LIZJ() || C1514430pVp.LIZLLL().booleanValue()) {
            assembler.vQ2(lifecycleOwner, AFwS229S0000000_2.get$arr$(408));
        }
        IEcUgBackButtonServiceOfficial iEcUgBackButtonServiceOfficial = (IEcUgBackButtonServiceOfficial) PluggableExtentionKt.pluggableSpi$default(IEcUgBackButtonServiceOfficial.class, false, false, false, 14, null);
        if (iEcUgBackButtonServiceOfficial != null && (nodeTagAssemLIZJ = iEcUgBackButtonServiceOfficial.LIZJ()) != null) {
            assembler.vQ2(lifecycleOwner, new AwS581S0100000_2(nodeTagAssemLIZJ, 265));
        }
        if (C297740Blk.LIZ()) {
            C2238881Ck2<?> c2238881Ck2LIZ = C2238831Cjx.LIZ(ShopDotAssemPreloader.class);
            if (c2238881Ck2LIZ == null || c2238881Ck2LIZ.LJ != EnumC725160ScU.SUCCESS || (obj = c2238881Ck2LIZ.LIZLLL) == null) {
                obj = null;
            }
            AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
            if (abstractC738140SxQ != null) {
                assembler.vQ2(lifecycleOwner, new AwS581S0100000_2(abstractC738140SxQ, 266));
            } else {
                IMallServiceManager iMallServiceManagerLIZIZ = MallServiceManager.LIZIZ();
                if (iMallServiceManagerLIZIZ != null && (iShopIconServiceLIZ2 = iMallServiceManagerLIZIZ.LIZ()) != null && (abstractC738140SxQLIZ2 = iShopIconServiceLIZ2.LIZ()) != null) {
                    assembler.vQ2(lifecycleOwner, new AwS581S0100000_2(abstractC738140SxQLIZ2, 267));
                }
            }
        } else {
            IMallServiceManager iMallServiceManagerLIZIZ2 = MallServiceManager.LIZIZ();
            if (iMallServiceManagerLIZIZ2 != null && (iShopIconServiceLIZ = iMallServiceManagerLIZIZ2.LIZ()) != null && (abstractC738140SxQLIZ = iShopIconServiceLIZ.LIZ()) != null) {
                assembler.vQ2(lifecycleOwner, new AwS581S0100000_2(abstractC738140SxQLIZ, 268));
            }
        }
        if (C1583440rJ8.LIZ() || C1583440rJ8.LIZIZ()) {
            assembler.vQ2(lifecycleOwner, new C1563770qnP());
        }
        assembler.vQ2(lifecycleOwner, new C1563780qnQ());
        assembler.vQ2(lifecycleOwner, new C1131904bl());
        assembler.vQ2(lifecycleOwner, AFwS229S0000000_2.get$arr$(411));
        assembler.vQ2(lifecycleOwner, AFwS229S0000000_2.get$arr$(412));
        if (2 == ((Number) C278780AwG.LIZ.getValue()).intValue()) {
            assembler.vQ2(lifecycleOwner, AFwS229S0000000_2.get$arr$(402));
        }
        if (!C1157604fu.LIZ()) {
            assembler.vQ2(lifecycleOwner, new C710870RuX());
        }
        if (!C1157804fw.LIZ()) {
            assembler.vQ2(lifecycleOwner, AFwS229S0000000_2.get$arr$(403));
        }
        if (C0BHA.LIZ == -1) {
            assembler.vQ2(lifecycleOwner, AFwS264S0000000_24.get$arr$(210));
        }
        assembler.vQ2(lifecycleOwner, new C1131804bk());
    }

    public static final void LIZJ(final Assembler assembler, final LifecycleOwner lifecycleOwner) {
        boolean z;
        IHomeTabService iHomeTabService;
        C19719912Dl c19719912DlLIZJ;
        IHomeTabService iHomeTabService2;
        C19719912Dl c19719912DlLJI;
        long jLIZ;
        IEcUgColdBootDowngradeService iEcUgColdBootDowngradeService = (IEcUgColdBootDowngradeService) PluggableExtentionKt.pluggableSpi$default(IEcUgColdBootDowngradeService.class, false, false, false, 14, null);
        if (iEcUgColdBootDowngradeService != null && iEcUgColdBootDowngradeService.LIZIZ()) {
            z = true;
        } else {
            z = false;
        }
        long jLIZ2 = 0;
        if (z && !C1514430pVp.LIZLLL().booleanValue()) {
            IEcUgColdBootDowngradeService iEcUgColdBootDowngradeService2 = (IEcUgColdBootDowngradeService) PluggableExtentionKt.pluggableSpi$default(IEcUgColdBootDowngradeService.class, false, false, false, 14, null);
            if (iEcUgColdBootDowngradeService2 != null) {
                jLIZ = iEcUgColdBootDowngradeService2.LIZ();
            } else {
                jLIZ = 0;
            }
            C0CN5.LIZIZ(Long.valueOf(jLIZ), new Runnable() { // from class: X.057J
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C19719912Dl c19719912DlLIZJ2;
                    C1C7U.LIZ("MainActivityAssemKt@195a.assembleLazyAssem$1$1$1");
                    try {
                        IEcUgCommonService iEcUgCommonService = (IEcUgCommonService) PluggableExtentionKt.pluggableSpi$default(IEcUgCommonService.class, false, false, false, 14, null);
                        if (iEcUgCommonService != null && (c19719912DlLIZJ2 = iEcUgCommonService.LIZJ()) != null) {
                            assembler.vQ2(lifecycleOwner, new C057K(c19719912DlLIZJ2));
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("MainActivityAssemKt@195a.assembleLazyAssem$1$1$1");
                }
            });
        }
        IEcUgColdBootDowngradeService iEcUgColdBootDowngradeService3 = (IEcUgColdBootDowngradeService) PluggableExtentionKt.pluggableSpi$default(IEcUgColdBootDowngradeService.class, false, false, false, 14, null);
        if (iEcUgColdBootDowngradeService3 != null && iEcUgColdBootDowngradeService3.LIZLLL()) {
            IEcUgColdBootDowngradeService iEcUgColdBootDowngradeService4 = (IEcUgColdBootDowngradeService) PluggableExtentionKt.pluggableSpi$default(IEcUgColdBootDowngradeService.class, false, false, false, 14, null);
            if (iEcUgColdBootDowngradeService4 != null) {
                jLIZ2 = iEcUgColdBootDowngradeService4.LIZ();
            }
            C0CN5.LIZIZ(Long.valueOf(jLIZ2), new Runnable() { // from class: X.0qee
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C13IQ<? extends AbstractC738140SxQ> c13iqLJIIIZ;
                    C1C7U.LIZ("MainActivityAssemKt@195a.assembleLazyAssem$1$1$2");
                    try {
                        IECommerceMallService iECommerceMallService = (IECommerceMallService) ServiceManager.get().getService(IECommerceMallService.class);
                        if (iECommerceMallService != null && (c13iqLJIIIZ = iECommerceMallService.LJIIIZ()) != null) {
                            assembler.vQ2(lifecycleOwner, new C1558350qef(c13iqLJIIIZ));
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("MainActivityAssemKt@195a.assembleLazyAssem$1$1$2");
                }
            });
        }
        if (C1157804fw.LIZ()) {
            C0RUC.LIZ(lifecycleOwner, assembler, AFwS229S0000000_2.get$arr$(410));
        }
        if (C285090BFj.LJI()) {
            C0CN5.LIZIZ(Long.valueOf(((Number) C285090BFj.LJLIL.getValue()).longValue()), new ARunnableS93S0200000_24(assembler, lifecycleOwner, 21));
            C1563720qnK.LIZ();
            C799900VZk.LIZ.getClass();
            C0CPH c0cph = new C0CPH();
            C0CCZ c0cczInitTask = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).initService().initTask(13);
            if (c0cczInitTask != null) {
                c0cph.LIZ(c0cczInitTask);
                c0cph.LIZIZ();
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        if (((Boolean) C285090BFj.LJLJJI.getValue()).booleanValue()) {
            C0CN5.LIZIZ(Long.valueOf(((Number) C285090BFj.LJLJI.getValue()).longValue()), new ARunnableS93S0200000_24(assembler, lifecycleOwner, 22));
        }
        if (C1157604fu.LIZ()) {
            C0RUC.LIZ(lifecycleOwner, assembler, new C710860RuW());
        }
        C0RUC.LIZ(lifecycleOwner, assembler, new C1563420qmq());
        C0RUC.LIZ(lifecycleOwner, assembler, new C1563440qms());
        C0S78.LIZJ(new C1563750qnN(assembler, lifecycleOwner), true);
        C0RUC.LIZ(lifecycleOwner, assembler, new C0RZU());
        C0RUC.LIZ(lifecycleOwner, assembler, AFwS229S0000000_2.get$arr$(406));
        if (ColdBootDegradeAssem.LIZIZ()) {
            C0RUC.LIZ(lifecycleOwner, assembler, AFwS264S0000000_24.get$arr$(213));
        }
        if (ColdBootDegradeAssem.LIZJ() && !C1514430pVp.LIZLLL().booleanValue()) {
            C0RUC.LIZ(lifecycleOwner, assembler, AFwS229S0000000_2.get$arr$(409));
        }
        long j = C0BHA.LIZ;
        if (j != -1) {
            C0CN5.LIZIZ(Long.valueOf(j), new ARunnableS93S0200000_24(assembler, lifecycleOwner, 20));
        }
        if (C1591220rVg.LIZJ().enableAssem && (iHomeTabService2 = (IHomeTabService) PluggableExtentionKt.pluggableSpi$default(IHomeTabService.class, false, false, false, 14, null)) != null && (c19719912DlLJI = iHomeTabService2.LJI()) != null) {
            C0S78.LIZJ(new AwS268S0300000_24(assembler, (Assembler) lifecycleOwner, (LifecycleOwner) c19719912DlLJI, (C13IQ<? extends BaseMainContainerAssem>) 5), true);
        }
        if (C1571680r0A.LIZIZ && (iHomeTabService = (IHomeTabService) PluggableExtentionKt.pluggableSpi$default(IHomeTabService.class, false, false, false, 14, null)) != null && (c19719912DlLIZJ = iHomeTabService.LIZJ()) != null) {
            C0S78.LIZJ(new AwS268S0300000_24(assembler, (Assembler) lifecycleOwner, (LifecycleOwner) c19719912DlLIZJ, (C13IQ<? extends BaseMainContainerAssem>) 6), true);
        }
    }

    public static final void LIZLLL(Assembler assembler, LifecycleOwner lifecycleOwner) {
        AssemSupervisor assemSupervisor;
        C723800SaI c723800SaI;
        if (C297740Blk.LIZ() && (assemSupervisor = (AssemSupervisor) ((ConcurrentHashMap) assembler.LL.LIZ).get(lifecycleOwner)) != null && (c723800SaI = assemSupervisor.LLILZ) != null) {
            int i = c723800SaI.LIZIZ;
            int i2 = c723800SaI.LIZJ;
            if (i != 0 || i2 != 0) {
                C725430Scv.LIZIZ(C725470Scz.LIZ, new C724940Sc8(i, i2, c723800SaI));
            }
            c723800SaI.LIZIZ = 0;
            c723800SaI.LIZJ = 0;
        }
    }

    public static final void LJFF(String str, Assembler assembler, LifecycleOwner lifecycleOwner) {
        AssemSupervisor assemSupervisor;
        if (C297740Blk.LIZ() && (assemSupervisor = (AssemSupervisor) ((ConcurrentHashMap) assembler.LL.LIZ).get(lifecycleOwner)) != null) {
            assemSupervisor.LLILZ = new C723800SaI(str);
        }
    }

    public static final void LIZIZ(Assembler assembler, LifecycleOwner lifecycleOwner, AbstractC738140SxQ abstractC738140SxQ, TabAbilityAssem tabAbilityAssem, MainActivity mainActivity) {
        C08TN.LIZ().LJ("main_act_assemble", false);
        assembler.vQ2(lifecycleOwner, new C1563430qmr(tabAbilityAssem));
        assembler.vQ2(lifecycleOwner, new C1558050qeB());
        if (!C1564470qoX.LIZ() && abstractC738140SxQ != null) {
            assembler.vQ2(lifecycleOwner, new AwS603S0100000_24(abstractC738140SxQ, 135));
        }
        if (C0BVA.LIZ() >= 1) {
            assembler.vQ2(lifecycleOwner, AFwS264S0000000_24.get$arr$(208));
        }
        if (C1564470qoX.LIZ()) {
            C1563400qmo c1563400qmo = new C1563400qmo(abstractC738140SxQ, mainActivity, assembler, lifecycleOwner);
            if (!((Boolean) c1563400qmo.invoke()).booleanValue()) {
                ((ArrayList) C1563800qnS.LIZ).add(new C1563810qnT(c1563400qmo));
            }
        }
        if (C297740Blk.LIZ()) {
            LJFF("MainActivity-Preload-Assem-V2", assembler, lifecycleOwner);
            LIZ(assembler, lifecycleOwner);
            LIZLLL(assembler, lifecycleOwner);
            LIZJ(assembler, lifecycleOwner);
        } else {
            C1563730qnL c1563730qnL = C1563730qnL.LLJ;
            if (c1563730qnL == null) {
                c1563730qnL = new C1563730qnL();
            }
            C1563730qnL.LLJ = c1563730qnL;
            AssemSupervisor assemSupervisorCQ2 = assembler.CQ2(lifecycleOwner);
            if (assemSupervisorCQ2 != null) {
                c1563730qnL.LIZLLL(lifecycleOwner, assembler, assemSupervisorCQ2, null);
                LIZJ(assembler, lifecycleOwner);
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Can not find supervisor of ");
                sbLIZ.append(lifecycleOwner);
                sbLIZ.append(", have you call assemble {} before attach?");
                throw new C738130SxP(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        C08TN.LIZ().LJI("main_act_assemble");
    }
}
