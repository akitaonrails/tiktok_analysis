package X;

import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.theater.creation.generation.scene.AITheaterGenerationRootScene;
import com.ss.android.ugc.aweme.theater.creation.scene.AITheaterCreationRootScene;
import com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher;
import com.ss.android.ugc.aweme.theater.service.IAITheaterFeatureService;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Lhi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C550040Lhi extends AbstractC2255721DQs<InterfaceC548440Lf8> implements InterfaceC548440Lf8, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final C19A3 LL;
    public final C1DRG LLILLJJLI;
    public final InterfaceC548440Lf8 LLILLL = this;
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), IAITheaterCreationLauncher.EnterParams.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C550040Lhi.class, "enterParams", "getEnterParams()Lcom/ss/android/ugc/aweme/theater/service/IAITheaterCreationLauncher$EnterParams;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    private final IAITheaterCreationLauncher.EnterParams o2() {
        return (IAITheaterCreationLauncher.EnterParams) this.LLILZ.getValue(this, LLILZIL[0]);
    }

    private final <T> T w2() {
        List<Scene> sceneList;
        NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this.LL);
        if (navigationSceneLIZ == null || (sceneList = navigationSceneLIZ.getSceneList()) == null) {
            return null;
        }
        ListIterator<Scene> listIterator = sceneList.listIterator(sceneList.size());
        if (!listIterator.hasPrevious()) {
            Intrinsics.LJIILIIL();
            throw null;
        }
        listIterator.previous();
        Intrinsics.LJIILIIL();
        throw null;
    }

    @Override // X.InterfaceC548440Lf8
    public void TO2() {
        Scene scenePrevious;
        List<Scene> sceneList;
        Scene scenePrevious2;
        List<Scene> sceneList2;
        Scene scenePrevious3;
        AbstractC214814194y abstractC214814194y;
        NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this.LL);
        if (navigationSceneLIZ == null) {
            return;
        }
        List<Scene> sceneList3 = navigationSceneLIZ.getSceneList();
        ListIterator<Scene> listIterator = sceneList3.listIterator(sceneList3.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                scenePrevious = null;
                break;
            } else {
                scenePrevious = listIterator.previous();
                if (Intrinsics.LJFF(scenePrevious.getClass().getName(), C0CHQ.LIZ().LJIJJ().LJIIZILJ("VideoEditContainerScene").getName())) {
                    break;
                }
            }
        }
        if ((scenePrevious instanceof AbstractC214814194y) && (abstractC214814194y = (AbstractC214814194y) scenePrevious) != null) {
            abstractC214814194y.finish();
        }
        NavigationScene navigationSceneLIZ2 = C1447800nmM.LIZ(this.LL);
        if (navigationSceneLIZ2 != null && (sceneList2 = navigationSceneLIZ2.getSceneList()) != null) {
            ListIterator<Scene> listIterator2 = sceneList2.listIterator(sceneList2.size());
            while (true) {
                if (!listIterator2.hasPrevious()) {
                    scenePrevious3 = null;
                    break;
                } else {
                    scenePrevious3 = listIterator2.previous();
                    if (scenePrevious3 instanceof AITheaterCreationRootScene) {
                        break;
                    }
                }
            }
            if (!(scenePrevious3 instanceof AITheaterCreationRootScene)) {
                scenePrevious3 = null;
            }
            C19A3 c19a3 = (C19A3) scenePrevious3;
            if (c19a3 != null) {
                W1(c19a3, null);
            }
        }
        NavigationScene navigationSceneLIZ3 = C1447800nmM.LIZ(this.LL);
        if (navigationSceneLIZ3 == null || (sceneList = navigationSceneLIZ3.getSceneList()) == null) {
            return;
        }
        ListIterator<Scene> listIterator3 = sceneList.listIterator(sceneList.size());
        while (true) {
            if (!listIterator3.hasPrevious()) {
                scenePrevious2 = null;
                break;
            } else {
                scenePrevious2 = listIterator3.previous();
                if (scenePrevious2 instanceof AITheaterGenerationRootScene) {
                    break;
                }
            }
        }
        if (!(scenePrevious2 instanceof AITheaterGenerationRootScene)) {
            scenePrevious2 = null;
        }
        C19A3 c19a32 = (C19A3) scenePrevious2;
        if (c19a32 != null) {
            W1(c19a32, null);
        }
    }

    @Override // X.InterfaceC548440Lf8
    public void Un0() {
        C19A3 c19a3;
        C19A3 c19a32;
        AIGCEntranceInfo aIGCEntranceInfoLIZ;
        IAITheaterCreationLauncher iAITheaterCreationLauncherLIZ;
        Object objPrevious;
        Object objPrevious2;
        NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this.LL);
        if (navigationSceneLIZ != null) {
            ArrayList arrayList = (ArrayList) navigationSceneLIZ.getSceneList();
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious2 = null;
                    break;
                } else {
                    objPrevious2 = listIterator.previous();
                    if (objPrevious2 instanceof AITheaterGenerationRootScene) {
                        break;
                    }
                }
            }
            if (!(objPrevious2 instanceof AITheaterGenerationRootScene)) {
                objPrevious2 = null;
            }
            c19a3 = (C19A3) objPrevious2;
        } else {
            c19a3 = null;
        }
        NavigationScene navigationSceneLIZ2 = C1447800nmM.LIZ(this.LL);
        if (navigationSceneLIZ2 != null) {
            ArrayList arrayList2 = (ArrayList) navigationSceneLIZ2.getSceneList();
            ListIterator listIterator2 = arrayList2.listIterator(arrayList2.size());
            while (true) {
                if (!listIterator2.hasPrevious()) {
                    objPrevious = null;
                    break;
                } else {
                    objPrevious = listIterator2.previous();
                    if (objPrevious instanceof AITheaterCreationRootScene) {
                        break;
                    }
                }
            }
            if (!(objPrevious instanceof AITheaterCreationRootScene)) {
                objPrevious = null;
            }
            c19a32 = (C19A3) objPrevious;
        } else {
            c19a32 = null;
        }
        IAITheaterCreationLauncher.EnterParams enterParamsO2 = o2();
        CreativeInfo creativeInfo = new CreativeInfo(null, 0, null, 7, null);
        AIGCEntranceInfo aIGCEntranceInfo = o2().entranceInfo;
        if (aIGCEntranceInfo != null) {
            AIGC.AICreationSceneName.SAVE_DRAFT_CAST_AGAIN save_draft_cast_again = AIGC.AICreationSceneName.SAVE_DRAFT_CAST_AGAIN.INSTANCE;
            AIGC.RefPageName.GenerationPage generationPage = AIGC.RefPageName.GenerationPage.INSTANCE;
            aIGCEntranceInfoLIZ = AIGCEntranceInfo.LIZ(aIGCEntranceInfo, null, save_draft_cast_again.getValue(), 0, null, null, false, false, false, save_draft_cast_again, generationPage, generationPage.value, null, null, null, false, false, 1044989);
        } else {
            aIGCEntranceInfoLIZ = null;
        }
        IAITheaterCreationLauncher.EnterParams enterParamsLIZ = IAITheaterCreationLauncher.EnterParams.LIZ(enterParamsO2, creativeInfo, null, aIGCEntranceInfoLIZ, 4);
        C548880Lfq c548880Lfq = C548880Lfq.LIZ;
        C1E3C c1e3c = C1E3C.LJIIIIZZ;
        InterfaceC548750Lfd interfaceC548750LfdLIZ = C548910Lft.LIZ(enterParamsLIZ);
        AFwS239S0000000_8 aFwS239S0000000_8 = AFwS239S0000000_8.get$arr$(260);
        c548880Lfq.getClass();
        C548880Lfq.LIZLLL(c1e3c, interfaceC548750LfdLIZ, aFwS239S0000000_8);
        IAITheaterFeatureService.LIZ.getClass();
        IAITheaterFeatureService iAITheaterFeatureServiceLIZ = C549720LhC.LIZ();
        if (iAITheaterFeatureServiceLIZ != null && (iAITheaterCreationLauncherLIZ = iAITheaterFeatureServiceLIZ.LIZ()) != null) {
            iAITheaterCreationLauncherLIZ.LJFF(enterParamsLIZ, C1664590tQ1.LJIIIZ(this), false);
        }
        if (c19a3 != null) {
            W1(c19a3, null);
        }
        if (c19a32 != null) {
            W1(c19a32, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    @Override // X.InterfaceC548440Lf8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void zG2() {
        /*
            r24 = this;
            r3 = r24
            X.19A3 r0 = r3.LL
            com.bytedance.scene.navigation.NavigationScene r0 = X.C1447800nmM.LIZ(r0)
            r4 = 0
            if (r0 == 0) goto L2d
            java.util.List r1 = r0.getSceneList()
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r0 = r1.size()
            java.util.ListIterator r2 = r1.listIterator(r0)
        L19:
            boolean r0 = r2.hasPrevious()
            if (r0 == 0) goto Lab
            java.lang.Object r1 = r2.previous()
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.theater.creation.scene.AITheaterCreationRootScene
            if (r0 == 0) goto L19
        L27:
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.theater.creation.scene.AITheaterCreationRootScene
            if (r0 == 0) goto L2d
            if (r1 != 0) goto L77
        L2d:
            com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher$EnterParams r5 = r3.o2()
            com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC$AICreationSceneName$GENERATION_FAIL r2 = com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC.AICreationSceneName.GENERATION_FAIL.INSTANCE
            com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC$RefPageName$PersonalHomepage r1 = com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC.RefPageName.PersonalHomepage.INSTANCE
            java.lang.String r0 = "draft_failed"
            r9 = 0
            com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo r6 = X.C550740Liq.LIZ(r0, r2, r1, r9)
            r7 = 0
            java.lang.String r17 = "personal_homepage"
            r23 = 1046527(0xff7ff, float:1.466497E-39)
            r8 = r7
            r10 = r7
            r11 = r7
            r12 = r9
            r13 = r9
            r14 = r9
            r15 = r7
            r16 = r7
            r18 = r7
            r19 = r7
            r20 = r7
            r21 = r9
            r22 = r9
            com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo r1 = com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo.LIZ(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r0 = 15
            com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher$EnterParams r2 = com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher.EnterParams.LIZ(r5, r4, r4, r1, r0)
            X.0LhC r0 = com.ss.android.ugc.aweme.theater.service.IAITheaterFeatureService.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.theater.service.IAITheaterFeatureService r0 = X.C549720LhC.LIZ()
            if (r0 == 0) goto L77
            com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher r1 = r0.LIZ()
            if (r1 == 0) goto L77
            android.content.Context r0 = X.C1664590tQ1.LJIIIZ(r3)
            r1.LJFF(r2, r0, r9)
        L77:
            X.19A3 r0 = r3.LL
            com.bytedance.scene.navigation.NavigationScene r0 = X.C1447800nmM.LIZ(r0)
            if (r0 == 0) goto La8
            java.util.List r1 = r0.getSceneList()
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r0 = r1.size()
            java.util.ListIterator r2 = r1.listIterator(r0)
        L8d:
            boolean r0 = r2.hasPrevious()
            if (r0 == 0) goto La9
            java.lang.Object r1 = r2.previous()
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.theater.creation.generation.scene.AITheaterGenerationRootScene
            if (r0 == 0) goto L8d
        L9b:
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.theater.creation.generation.scene.AITheaterGenerationRootScene
            if (r0 != 0) goto La0
            r1 = r4
        La0:
            X.19A3 r1 = (X.C19A3) r1
            if (r1 == 0) goto La8
            r0 = 0
            r3.W1(r1, r0)
        La8:
            return
        La9:
            r1 = r4
            goto L9b
        Lab:
            r1 = r4
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C550040Lhi.zG2():void");
    }

    public InterfaceC548440Lf8 Z1() {
        return this.LLILLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC548440Lf8
    public void Sn(boolean z) {
        NavigationScene navigationSceneLIZ;
        List<Scene> sceneList;
        Scene scenePrevious;
        List<Scene> sceneList2;
        Scene scenePrevious2;
        NavigationScene navigationSceneLIZ2 = C1447800nmM.LIZ(this.LL);
        Scene scene = null;
        if (navigationSceneLIZ2 != null && (sceneList2 = navigationSceneLIZ2.getSceneList()) != null) {
            ListIterator<Scene> listIterator = sceneList2.listIterator(sceneList2.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    scenePrevious2 = listIterator.previous();
                    if (scenePrevious2 instanceof AITheaterGenerationRootScene) {
                        break;
                    }
                } else {
                    scenePrevious2 = null;
                    break;
                }
            }
            if (!(scenePrevious2 instanceof AITheaterGenerationRootScene)) {
                scenePrevious2 = null;
            }
            C19A3 c19a3 = (C19A3) scenePrevious2;
            if (c19a3 != null) {
                W1(c19a3, null);
            }
        }
        if (z && (navigationSceneLIZ = C1447800nmM.LIZ(this.LL)) != null && (sceneList = navigationSceneLIZ.getSceneList()) != null) {
            ListIterator<Scene> listIterator2 = sceneList.listIterator(sceneList.size());
            while (true) {
                if (listIterator2.hasPrevious()) {
                    scenePrevious = listIterator2.previous();
                    if (scenePrevious instanceof AITheaterCreationRootScene) {
                        break;
                    }
                } else {
                    scenePrevious = null;
                    break;
                }
            }
            if (scenePrevious instanceof AITheaterCreationRootScene) {
                scene = scenePrevious;
            }
            C19A3 c19a32 = (C19A3) scene;
            if (c19a32 != null) {
                W1(c19a32, -1);
            }
        }
    }

    public C550040Lhi(C19A3 c19a3, C1DRG c1drg) {
        this.LL = c19a3;
        this.LLILLJJLI = c1drg;
    }

    private final void W1(C19A3 c19a3, Integer num) {
        if (c19a3 instanceof AbstractC214814194y) {
            if (num != null) {
                ((AbstractC214814194y) c19a3).setResult(num.intValue());
            }
            ((AbstractC214814194y) c19a3).finish();
            return;
        }
        if (num != null) {
            int iIntValue = num.intValue();
            NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(c19a3);
            if (navigationSceneLIZ != null) {
                navigationSceneLIZ.LLLLLLZZ(c19a3, new C0MFN(iIntValue, null));
            }
        }
        NavigationScene navigationSceneLIZ2 = C1447800nmM.LIZ(c19a3);
        if (navigationSceneLIZ2 == null) {
            return;
        }
        navigationSceneLIZ2.LLLLLL();
    }
}
