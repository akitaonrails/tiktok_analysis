package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.platform.ComposeView;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitConsumptionModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitContextModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitGeneratingModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitInputInfo;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitMobParams;
import com.ss.android.ugc.aweme.portrait.model.GenerateStatus;
import com.ss.android.ugc.aweme.portrait.model.OpenGenerationPageParams;
import com.ss.android.ugc.aweme.portrait.model.PortraitAuthor;
import com.ss.android.ugc.aweme.portrait.model.PortraitStyleItem;
import com.ss.android.ugc.aweme.portrait.model.PortraitUrlModel;
import com.ss.android.ugc.aweme.portrait.model.RefImageType;
import com.ss.android.ugc.aweme.portrait.model.RefType;
import com.ss.android.ugc.aweme.portrait.preview.AIPortraitStylePreviewViewModel;
import com.ss.android.ugc.aweme.theater.common.AITheaterProfileEventModel;
import com.ss.android.ugc.aweme.theater.common.ContinueConfig;
import com.ss.android.ugc.aweme.theater.common.ProfileCustomConfig;
import com.ss.android.ugc.aweme.theater.common.SkipConfig;
import com.ss.android.ugc.aweme.theater.service.AITheaterProfileService;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS124S0201000_25;
import kotlin.jvm.internal.AwS181S0101000_25;
import kotlin.jvm.internal.AwS4S1111000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS639S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0u09, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1686990u09 extends C19A3 {
    public static final long LLJJIJIIJIL = C1685850tyJ.LIZIZ(1776411);
    public static final long LLJJIJIL = C1685850tyJ.LIZIZ(605756187);
    public final C0JEX LLJILLL = C0JEY.LIZ(this, C13LE.LIZ(AIPortraitStylePreviewViewModel.class), new AwS569S0100000_25(new AwS569S0100000_25((Scene) this, 878), (Function0<Unit>) 879), null);
    public PortraitStyleItem LLJJ;
    public String LLJJI;
    public AIGCEntranceInfo LLJJIII;
    public AIPortraitConsumptionModel LLJJIJI;

    public final AIPortraitStylePreviewViewModel LLLLLL() {
        return (AIPortraitStylePreviewViewModel) this.LLJILLL.getValue();
    }

    public final C1687160u0Q LLLLLILLIL(PortraitStyleItem portraitStyleItem) {
        EnumC1686900u00 enumC1686900u00;
        Integer numValueOf;
        AIGCEntranceInfo aIGCEntranceInfo = this.LLJJIII;
        String str = this.LLJJI;
        String str2 = portraitStyleItem.styleId;
        EnumC1419230n2H enumC1419230n2H = portraitStyleItem.styleType;
        EnumC570120MXq enumC570120MXq = portraitStyleItem.resPos;
        boolean zLIZ = C123100dR.LIZ(portraitStyleItem.prompt);
        boolean zLJFF = Intrinsics.LJFF(portraitStyleItem.hasReferenceImage, Boolean.TRUE);
        if (!zLIZ) {
            if (!zLJFF) {
                enumC1686900u00 = EnumC1686900u00.NO_IMAGE_AND_TEXT;
            } else {
                enumC1686900u00 = EnumC1686900u00.HAVE_IMAGE_NO_TEXT;
            }
        } else if (!zLJFF) {
            enumC1686900u00 = EnumC1686900u00.NO_IMAGE_HAVE_TEXT;
        } else {
            enumC1686900u00 = EnumC1686900u00.HAVE_IMAGE_AND_TEXT;
        }
        String value = enumC1686900u00.getValue();
        RefImageType refImageType = RefImageType.PRESET;
        EnumC550430LiL enumC550430LiL = EnumC550430LiL.PRESET;
        String str3 = portraitStyleItem.prompt;
        if (str3 != null) {
            numValueOf = Integer.valueOf(str3.length());
        } else {
            numValueOf = null;
        }
        return new C1687160u0Q(aIGCEntranceInfo, str, str2, enumC1419230n2H, enumC570120MXq, value, refImageType, enumC550430LiL, numValueOf, null, null, null, null, null, 130560);
    }

    public final boolean LLLLLJLJLL(ContinueConfig continueConfig) {
        Activity activityLIZ;
        String str;
        String string;
        String str2;
        AIGC.RecallWay recallWay;
        InterfaceC550750Lir interfaceC550750Lir;
        String strLJIIIIZZ;
        if (LLLLLL().vQ2() != null) {
            return true;
        }
        Context sceneContext = getSceneContext();
        if (sceneContext != null && (activityLIZ = C06MM.LIZ(sceneContext)) != null) {
            AIPortraitStylePreviewViewModel aIPortraitStylePreviewViewModelLLLLLL = LLLLLL();
            if ((aIPortraitStylePreviewViewModelLLLLLL.LLILLL.getValue() instanceof C316340Cae) && (interfaceC550750Lir = aIPortraitStylePreviewViewModelLLLLLL.LL.LIZ) != null && (strLJIIIIZZ = interfaceC550750Lir.LJIIIIZZ()) != null && strLJIIIIZZ.length() != 0) {
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                c1389890mGx.LJIIIZ(2131825806);
                c1389890mGx.LJIIJJI();
                return false;
            }
            String strLIZ = C528840Koc.LIZ();
            C1687150u0P c1687150u0P = C1687150u0P.LIZ;
            AIGCEntranceInfo aIGCEntranceInfo = this.LLJJIII;
            C1687170u0R c1687170u0R = new C1687170u0R(aIGCEntranceInfo, this.LLJJI, "passive_create_cameo", C569830MWn.LIZIZ((InterfaceC549230LgP) LLLLLL().LLILLL.getValue()), "template_preview_page", strLIZ);
            c1687150u0P.getClass();
            C548880Lfq c548880Lfq = C548880Lfq.LIZ;
            C1E3A c1e3a = C1E3A.LJIIIIZZ;
            AwS587S0100000_8 awS587S0100000_8 = new AwS587S0100000_8(c1687170u0R, 573);
            c548880Lfq.getClass();
            C548880Lfq.LIZLLL(c1e3a, aIGCEntranceInfo, awS587S0100000_8);
            AITheaterProfileService.LIZ.getClass();
            AITheaterProfileService aITheaterProfileServiceLIZ = C563290M7j.LIZ();
            if (aITheaterProfileServiceLIZ != null) {
                C0LQY c0lqy = C0LQY.AI_PORTRAIT;
                AIGCEntranceInfo aIGCEntranceInfo2 = this.LLJJIII;
                if (aIGCEntranceInfo2 != null) {
                    str = aIGCEntranceInfo2.enterFrom;
                } else {
                    str = null;
                }
                String str3 = "";
                if (str == null) {
                    str = "";
                }
                if (aIGCEntranceInfo2 != null && (recallWay = aIGCEntranceInfo2.recallWay) != null) {
                    string = recallWay.toString();
                } else {
                    string = null;
                }
                AIGCEntranceInfo aIGCEntranceInfo3 = this.LLJJIII;
                if (aIGCEntranceInfo3 != null && (str2 = aIGCEntranceInfo3.shootWay) != null) {
                    str3 = str2;
                }
                aITheaterProfileServiceLIZ.Y8(activityLIZ, new C531080KsE(true, "ai_theater_profile_intro", null, null, null, new AITheaterProfileEventModel(c0lqy, strLIZ, str, "ai_portrait_proactive_crt_create", string, str3, null, "ai_portrait", null, null, null, false, 3904), false, false, true, new ProfileCustomConfig((SkipConfig) null, continueConfig, 3), 220), null);
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011a  */
    @Override // X.C19A3, com.bytedance.scene.Scene
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r13) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1686990u09.onCreate(android.os.Bundle):void");
    }

    public final void LLLLILI(InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1067046721);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(this)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            PortraitStyleItem portraitStyleItem = this.LLJJ;
            if (portraitStyleItem == null) {
                C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
                if (c20030013YsLJJJJZI != null) {
                    c20030013YsLJJJJZI.LIZLLL = new AwS181S0101000_25(this, i, 60);
                    return;
                }
                return;
            }
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = C1675980tiO.LIZIZ(c.LIZLLL(c1685760tyA), C1670400tZO.LIZIZ(c13zcLJIIJ).F2(), C1669430tXp.LIZ);
            C1680030tov c1680030tov = C1679930tol.LIZJ;
            InterfaceC1668050tVb.LIZ.getClass();
            C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(c1680030tov, C1668040tVa.LJIILIIL, c13zcLJIIJ, 0);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZIZ);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                c13zcLJIIJ.LJJIII();
                if (c13zcLJIIJ.LJJJI) {
                    c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                } else {
                    c13zcLJIIJ.LJIILJJIL();
                }
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJI;
                C1665930tSB.LIZ(c13zcLJIIJ, c1688130u1zLIZ, aFwS311S0000000_25);
                AFwS311S0000000_25 aFwS311S0000000_252 = g.a.LJFF;
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, aFwS311S0000000_252);
                AFwS311S0000000_25 aFwS311S0000000_253 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_253);
                }
                AFwS311S0000000_25 aFwS311S0000000_254 = g.a.LIZLLL;
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, aFwS311S0000000_254);
                InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C1687990u1l.LIZ.LIZ(c1685760tyA, 1.0f, true);
                C1296870jqv c1296870jqv = C1668040tVa.LIZIZ;
                InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(c1296870jqv, false);
                int iLIZ2 = C0MXE.LIZ(c13zcLJIIJ);
                C13D2 c13d2LJJJIL2 = c13zcLJIIJ.LJJJIL();
                InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL2 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZ);
                if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                    c13zcLJIIJ.LJJIII();
                    if (c13zcLJIIJ.LJJJI) {
                        c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                    } else {
                        c13zcLJIIJ.LJIILJJIL();
                    }
                    C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL, aFwS311S0000000_25);
                    C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL2, aFwS311S0000000_252);
                    if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ2))) {
                        c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ2));
                        c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ2), aFwS311S0000000_253);
                    }
                    C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL2, aFwS311S0000000_254);
                    C1672220tcK c1672220tcK = C1672220tcK.LIZ;
                    int i4 = (i2 << 3) & 112;
                    LLLLIL(portraitStyleItem, c13zcLJIIJ, i4);
                    LLLLL(c13zcLJIIJ, i2 & 14);
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ2 = c1672220tcK.LIZIZ(c.LJ(c.LJIJI(C1682520tsw.LJIIL(C1675980tiO.LIZ(c1685760tyA, C1668200tVq.LJII(C1697810uHb.LJIIJJI(new C1685910tyP(LLJJIJIIJIL), new C1685910tyP(LLJJIJIL)), 0.0f, 0.0f, 14), null, 6), 0.0f, 24, 0.0f, 0.0f, 13), null, 3), 1.0f), C1668040tVa.LJII);
                    InterfaceC20053113dB interfaceC20053113dBLIZLLL2 = k.LIZLLL(c1296870jqv, false);
                    int iLIZ3 = C0MXE.LIZ(c13zcLJIIJ);
                    C13D2 c13d2LJJJIL3 = c13zcLJIIJ.LJJJIL();
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL3 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZIZ2);
                    if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                        c13zcLJIIJ.LJJIII();
                        if (c13zcLJIIJ.LJJJI) {
                            c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                        } else {
                            c13zcLJIIJ.LJIILJJIL();
                        }
                        C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL2, aFwS311S0000000_25);
                        C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL3, aFwS311S0000000_252);
                        if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ3))) {
                            c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ3));
                            c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ3), aFwS311S0000000_253);
                        }
                        C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL3, aFwS311S0000000_254);
                        LLLLJI(portraitStyleItem, c13zcLJIIJ, i4);
                        c13zcLJIIJ.LJJJJL(true);
                        c13zcLJIIJ.LJJJJL(true);
                        LLLLLIL(portraitStyleItem, c13zcLJIIJ, i4);
                        c13zcLJIIJ.LJJJJL(true);
                    } else {
                        C0MXE.LIZIZ();
                        throw null;
                    }
                } else {
                    C0MXE.LIZIZ();
                    throw null;
                }
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI2 = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI2 != null) {
            c20030013YsLJJJJZI2.LIZLLL = new AwS181S0101000_25(this, i, 59);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLL(X.InterfaceC1680500tpg r19, int r20) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1686990u09.LLLLL(X.0tpg, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.ss.android.ugc.aweme.creative.model.CreativeInfo, com.ss.android.ugc.aweme.creative.model.CreativeModel] */
    /* JADX WARN: Type inference failed for: r9v2 */
    public final OpenGenerationPageParams LLLLLJIL(PortraitStyleItem portraitStyleItem, C1687160u0Q c1687160u0Q) {
        AIGCEntranceInfo aIGCEntranceInfo;
        String strLIZ;
        String str = 0;
        AIGCEntranceInfo aIGCEntranceInfo2 = this.LLJJIII;
        if (aIGCEntranceInfo2 != null) {
            str = 0;
            aIGCEntranceInfo = AIGCEntranceInfo.LIZ(aIGCEntranceInfo2, null, null, 0, null, null, false, false, false, null, AIGC.RefPageName.TemplatePreviewPage.INSTANCE, null, null, null, null, false, false, 1047551);
        } else {
            aIGCEntranceInfo = new AIGCEntranceInfo(C0LQY.AI_PORTRAIT, null, 0, null, null, null, false, false, false, AIGC.AICreationSceneName.PROACTIVE_CRT_POST.INSTANCE, AIGC.RefPageName.NoNeed.INSTANCE, null, null, null, null, false, false, null, null, null);
        }
        String[] strArr = new String[1];
        String strVQ2 = LLLLLL().vQ2();
        String str2 = "";
        if (strVQ2 == null) {
            strVQ2 = "";
        }
        int iIntValue = 0;
        strArr[0] = strVQ2;
        ArrayList arrayListLJ = C1697810uHb.LJ(strArr);
        String[] strArr2 = new String[1];
        String strWQ2 = LLLLLL().wQ2();
        if (strWQ2 == null) {
            strWQ2 = "";
        }
        strArr2[0] = strWQ2;
        ArrayList arrayListLJ2 = C1697810uHb.LJ(strArr2);
        PortraitUrlModel portraitUrlModel = portraitStyleItem.coverUrl;
        if (portraitUrlModel != null) {
            strLIZ = C0MXA.LIZ(portraitUrlModel);
        } else {
            strLIZ = null;
        }
        AIPortraitInputInfo aIPortraitInputInfo = new AIPortraitInputInfo(arrayListLJ, arrayListLJ2, strLIZ, str, str, portraitStyleItem.prompt, portraitStyleItem.styleId, RefType.REUSE_ALL);
        String str3 = c1687160u0Q.LIZJ;
        if (str3 != null) {
            str2 = str3;
        }
        EnumC1419230n2H enumC1419230n2H = c1687160u0Q.LIZLLL;
        EnumC570120MXq enumC570120MXq = c1687160u0Q.LJ;
        String str4 = c1687160u0Q.LJFF;
        RefImageType refImageType = c1687160u0Q.LJI;
        EnumC550430LiL enumC550430LiL = c1687160u0Q.LJII;
        Integer num = c1687160u0Q.LJIIIIZZ;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return new OpenGenerationPageParams(str, str, new AIPortraitContextModel(aIGCEntranceInfo, aIPortraitInputInfo, new AIPortraitGeneratingModel(str, str, 0, GenerateStatus.NOT_START, str, 0L, false), new AIPortraitMobParams(str2, enumC1419230n2H, enumC570120MXq, str4, refImageType, enumC550430LiL, iIntValue, "implicit", false, str, str)), this.LLJJIJI);
    }

    public final void LLLLIILL(PortraitStyleItem portraitStyleItem, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        boolean z;
        String str;
        String strLIZ;
        PortraitUrlModel portraitUrlModel;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1008713961);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(portraitStyleItem)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(this)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            EnumC1419230n2H enumC1419230n2H = portraitStyleItem.styleType;
            if (enumC1419230n2H != null && enumC1419230n2H.equals(EnumC1419230n2H.OFFICIAL)) {
                z = true;
            } else {
                z = false;
            }
            PortraitAuthor portraitAuthor = portraitStyleItem.author;
            if (portraitAuthor == null || (str = portraitAuthor.name) == null || !(!a0.LJJJIL(str))) {
                str = "";
            }
            PortraitAuthor portraitAuthor2 = portraitStyleItem.author;
            if (portraitAuthor2 != null && (portraitUrlModel = portraitAuthor2.avatar) != null) {
                strLIZ = C0MXA.LIZ(portraitUrlModel);
            } else {
                strLIZ = null;
            }
            Long l = portraitStyleItem.postCount;
            if (l == null || l.longValue() < ((Number) C280260Aye.LIZ.getValue()).intValue()) {
                l = null;
            }
            InterfaceC1668050tVb.LIZ.getClass();
            C1296880jqw c1296880jqw = C1668040tVa.LJIIJJI;
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            C1688120u1y c1688120u1yLIZ = C1665750tRt.LIZ(C1679930tol.LIZ, c1296880jqw, c13zcLJIIJ, 48);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, c1685760tyA);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                c13zcLJIIJ.LJJIII();
                if (c13zcLJIIJ.LJJJI) {
                    c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                } else {
                    c13zcLJIIJ.LJIILJJIL();
                }
                C1665930tSB.LIZ(c13zcLJIIJ, c1688120u1yLIZ, g.a.LJI);
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                LLLLIIIILLL(strLIZ, z, c13zcLJIIJ, (i2 << 3) & 896);
                C1665790tRx.LIZ(c.LJIILLIIL(c1685760tyA, 6), c13zcLJIIJ);
                C1685190txF.LIZ(str, null, C1670400tZO.LIZIZ(c13zcLJIIJ).K3(), C1670400tZO.LJ(c13zcLJIIJ).LJIILIIL, 0L, 0, 0, false, 0, null, null, c13zcLJIIJ, 0, 0, 2034);
                c13zcLJIIJ.LJJIIJZLJL(-437553059);
                if (l != null) {
                    k.LIZ(C1675980tiO.LIZIZ(c.LJIILJJIL(C1682520tsw.LJIIJ(c1685760tyA, 8, 0.0f, 2), 1, 14), C1685910tyP.LIZJ(0.5f, C1685910tyP.LJ), C1669430tXp.LIZ), c13zcLJIIJ, 6);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(C1675970tiN.LIZIZ(l.longValue()));
                    sbLIZ.append(' ');
                    sbLIZ.append(C0MBB.LIZIZ(2131825815, c13zcLJIIJ));
                    C1685190txF.LIZ(C2188811AlT.LIZIZ(sbLIZ), null, C1670400tZO.LIZIZ(c13zcLJIIJ).K3(), C1670400tZO.LJ(c13zcLJIIJ).LJIILIIL, 0L, 0, 0, false, 0, null, null, c13zcLJIIJ, 0, 0, 2034);
                }
                c13zcLJIIJ.LJJJJL(false);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS124S0201000_25(this, portraitStyleItem, i, 88);
        }
    }

    public final void LLLLIL(PortraitStyleItem portraitStyleItem, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        String strLIZ;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(321892504);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(portraitStyleItem)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            PortraitUrlModel portraitUrlModel = portraitStyleItem.coverUrl;
            if (portraitUrlModel == null || (strLIZ = C0MXA.LIZ(portraitUrlModel)) == null) {
                strLIZ = "";
            }
            C1175204ik c1175204ik = new C1175204ik(strLIZ);
            InterfaceC1671600tbK.LIZ.getClass();
            C1670600tZi.LIZ(c1175204ik, "", c.LIZLLL(InterfaceC1685750ty9.LIZ), null, C1671610tbL.LJFF, null, null, null, null, null, c13zcLJIIJ, 25008, LSPassThroughRecordSizeConfig.DEFAULT);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS124S0201000_25(this, portraitStyleItem, i, 89);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLJI(com.ss.android.ugc.aweme.portrait.model.PortraitStyleItem r19, X.InterfaceC1680500tpg r20, int r21) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1686990u09.LLLLJI(com.ss.android.ugc.aweme.portrait.model.PortraitStyleItem, X.0tpg, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLLIL(com.ss.android.ugc.aweme.portrait.model.PortraitStyleItem r15, X.InterfaceC1680500tpg r16, int r17) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1686990u09.LLLLLIL(com.ss.android.ugc.aweme.portrait.model.PortraitStyleItem, X.0tpg, int):void");
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView = new ComposeView(requireSceneContext(), null, 6);
        composeView.setFitsSystemWindows(true);
        composeView.setViewCompositionStrategy(C20088213iq.LIZIZ);
        C1669670tYD.LJ(composeView, EnumC1427810nG7.Dark, new C19719212De(422527409, new AwS639S0100000_25(this, 113), true));
        return composeView;
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }

    public final void LLLLIIIILLL(String str, boolean z, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1252015592);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = C1675980tiO.LIZIZ(C1667200tUE.LIZ(c.LJIILIIL(InterfaceC1685750ty9.LIZ, 24), C1669050tXD.LIZ), C1670400tZO.LIZIZ(c13zcLJIIJ).T2(), C1669430tXp.LIZ);
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LJFF, false);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZIZ);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                c13zcLJIIJ.LJJIII();
                if (c13zcLJIIJ.LJJJI) {
                    c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                } else {
                    c13zcLJIIJ.LJIILJJIL();
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL, g.a.LJI);
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                if (z) {
                    c13zcLJIIJ.LJJIIJZLJL(1065273143);
                    C1668930tX1.LIZIZ(C1669660tYC.I, null, c.LIZJ, C1670400tZO.LIZIZ(c13zcLJIIJ).B2(), 0.0f, 0.0f, false, c13zcLJIIJ, 432, 112);
                    c13zcLJIIJ.LJJJJL(false);
                } else if (str != null && !a0.LJJJIL(str)) {
                    c13zcLJIIJ.LJJIIJZLJL(-1335981610);
                    C1175204ik c1175204ik = new C1175204ik(str);
                    InterfaceC1671600tbK.LIZ.getClass();
                    C1670600tZi.LIZ(c1175204ik, null, c.LIZJ, null, C1671610tbL.LIZIZ, null, null, null, null, null, c13zcLJIIJ, 25008, LSPassThroughRecordSizeConfig.DEFAULT);
                    c13zcLJIIJ.LJJJJL(false);
                } else {
                    c13zcLJIIJ.LJJIIJZLJL(1065290761);
                    C1668930tX1.LIZIZ(C1669660tYC.LJLJLJ, null, c.LIZJ, C1670400tZO.LIZIZ(c13zcLJIIJ).M3(), 0.0f, 0.0f, false, c13zcLJIIJ, 432, 112);
                    c13zcLJIIJ.LJJJJL(false);
                }
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS4S1111000_25(this, str, z, i, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLJ(java.lang.String r16, kotlin.jvm.functions.Function0<kotlin.Unit> r17, X.InterfaceC1680500tpg r18, int r19) {
        /*
            r15 = this;
            r0 = 1570461583(0x5d9b578f, float:1.3991966E18)
            r1 = r18
            X.13ZC r7 = r1.LJIIJ(r0)
            r13 = r19
            r0 = r13 & 6
            r8 = 4
            r11 = r16
            if (r0 != 0) goto Lb1
            boolean r0 = r7.LJJIIJ(r11)
            if (r0 == 0) goto Lae
            r10 = 4
        L19:
            r10 = r10 | r13
        L1a:
            r0 = r13 & 48
            r2 = 16
            r12 = r17
            if (r0 != 0) goto L2b
            boolean r0 = r7.LJII(r12)
            if (r0 == 0) goto Laa
            r0 = 32
        L2a:
            r10 = r10 | r0
        L2b:
            r1 = r10 & 19
            r0 = 18
            if (r1 != r0) goto L4a
            boolean r0 = r7.LIZ()
            if (r0 == 0) goto L4a
            r7.LIZJ()
        L3a:
            X.13Ys r0 = r7.LJJJJZI()
            if (r0 == 0) goto L49
            kotlin.jvm.internal.AwS33S1201000_25 r9 = new kotlin.jvm.internal.AwS33S1201000_25
            r14 = 2
            r10 = r15
            r9.<init>(r10, r11, r12, r13, r14)
            r0.LIZLLL = r9
        L49:
            return
        L4a:
            int r0 = r10 >> 3
            r0 = r0 & 14
            kotlin.jvm.functions.Function0 r9 = X.C0MXD.LIZ(r0, r7, r12)
            float r6 = (float) r2
            float r1 = (float) r8
            X.13DR r0 = X.C20055113dV.LJII
            java.lang.Object r0 = r7.LJJIL(r0)
            X.0u5o r0 = (X.InterfaceC1690500u5o) r0
            int r5 = r0.LJLLJ(r6)
            int r4 = r0.LJLLJ(r1)
            X.0tyA r1 = X.InterfaceC1685750ty9.LIZ
            r0 = 1065353216(0x3f800000, float:1.0)
            X.0ty9 r2 = androidx.compose.foundation.layout.c.LJ(r1, r0)
            r1 = 0
            r0 = 7
            r3 = 0
            X.0ty9 r2 = X.C634380OuS.LIZJ(r2, r3, r1, r9, r0)
            r0 = -1224400529(0xffffffffb705216f, float:-7.935202E-6)
            r7.LJJIIJZLJL(r0)
            boolean r1 = r7.LJIJI(r5)
            boolean r0 = r7.LJIJI(r4)
            r1 = r1 | r0
            r0 = r10 & 14
            if (r0 != r8) goto La8
            r0 = 1
        L87:
            r0 = r0 | r1
            java.lang.Object r1 = r7.LJJ()
            if (r0 != 0) goto L97
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r1 != r0) goto L9f
        L97:
            X.0tcv r1 = new X.0tcv
            r1.<init>(r5, r4, r6, r11)
            r7.LJJIJIIJI(r1)
        L9f:
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            r7.LJJJJL(r3)
            X.C1683060tto.LIZ(r2, r1, r7, r3, r3)
            goto L3a
        La8:
            r0 = 0
            goto L87
        Laa:
            r0 = 16
            goto L2a
        Lae:
            r10 = 2
            goto L19
        Lb1:
            r10 = r13
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1686990u09.LLLLJ(java.lang.String, kotlin.jvm.functions.Function0, X.0tpg, int):void");
    }
}
