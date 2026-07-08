package X;

import Y.AObjectS247S0100000_29;
import android.content.Context;
import android.view.SurfaceView;
import androidx.lifecycle.LiveData;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.creative.model.story.StoryStreakStickerState;
import com.ss.android.ugc.aweme.creative.model.story.StreaksData;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.VESize;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.11zI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19680611zI extends AbstractC2255721DQs<InterfaceC1452410ntn> implements InterfaceC1452410ntn, InterfaceC379610EuV {
    public static final C19680711zJ LLIZLLLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public static final int LLJI;
    public final C1DRG LL;
    public final Function2<VideoPublishEditModel, InterfaceC1452170ntP, Unit> LLILLJJLI;
    public InterfaceC1452170ntP LLILZ;
    public boolean LLIZ;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public VESize LLILZIL = new VESize(720, 1080);
    public long LLILZLL = -2;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.11zJ] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19680611zI.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLIZLLLIL = new Object() { // from class: X.11zJ
        };
        LLJI = 8;
    }

    private final float v3(boolean z, boolean z2, int i) {
        if (z) {
            return (z2 || i > 10) ? 1.0f : 1.18f;
        }
        return 0.95f;
    }

    public InterfaceC1452410ntn G2() {
        return this;
    }

    private final Pair<Float, Float> W2() {
        Pair<Float, Float> pairLIZJ = C1663300tNw.LIZJ(false, 646.0f, 58.0f, 116.0f, 45.0f, this.LLILZIL, true);
        return new Pair<>(Float.valueOf(1 - pairLIZJ.getFirst().floatValue()), pairLIZJ.getSecond());
    }

    private final Pair<Float, Float> c3() {
        return C1663300tNw.LIZJ(true, 188.0f, 0.0f, 305.0f, 182.0f, this.LLILZIL, false);
    }

    private final Pair<Float, Float> m3() {
        return C1663300tNw.LIZJ(false, 646.0f, 58.0f, 116.0f, 45.0f, this.LLILZIL, true);
    }

    private final Pair<Float, Float> q3() {
        boolean z = this.LLIZ;
        return C1663300tNw.LIZJ(true, z ? 474.0f : 516.0f, 0.0f, 306.0f, z ? 127.0f : 145.0f, this.LLILZIL, true);
    }

    public final VideoPublishEditModel LJJJLIIL() {
        return (VideoPublishEditModel) this.LLILLL.getValue(this, LLJ[0]);
    }

    private final Context H2() {
        return C1664590tQ1.LJIIIZ(this);
    }

    @Override // X.InterfaceC1452410ntn
    public void dJ2() {
        LiveData<Void> liveDataWw2;
        InterfaceC1455860nzM interfaceC1455860nzM = (InterfaceC1455860nzM) getDiContainer().LJIIL(null, InterfaceC1455860nzM.class);
        if (C1428470nHB.LJJJZ(LJJJLIIL())) {
            C201955140j.LIZLLL(C1632480saE.LIZIZ, "StreakNLE", "is draft, return");
        } else {
            if (interfaceC1455860nzM == null || (liveDataWw2 = interfaceC1455860nzM.ww2()) == null) {
                return;
            }
            liveDataWw2.observe(this, new AObjectS247S0100000_29(this, 61));
        }
    }

    public final Function2<VideoPublishEditModel, InterfaceC1452170ntP, Unit> T2() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        G2();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    private final boolean B3(StreaksData streaksData) {
        StoryStreakStickerState storyStreakStickerState = streaksData.stickerAddState;
        if (!storyStreakStickerState.isMessageSentStickerAdded() && !storyStreakStickerState.isFriendshipDaysStickerAdded()) {
            return C1663300tNw.LIZ(streaksData.mufDaysCount, streaksData.messageSentCount, streaksData.streaksLevel);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.Map<java.lang.String, java.lang.String> i3(com.ss.android.ugc.aweme.creative.model.story.StreaksData r10) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19680611zI.i3(com.ss.android.ugc.aweme.creative.model.story.StreaksData):java.util.Map");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C19680611zI(C1DRG c1drg, Function2<? super VideoPublishEditModel, ? super InterfaceC1452170ntP, Unit> function2) {
        this.LL = c1drg;
        this.LLILLJJLI = function2;
    }

    private final void E3(String str, Pair<Float, Float> pair) {
        C348100Dkm c348100DkmLIZIZ;
        C0FW6 c0fw6LJIIIZ;
        C348440DlK c348440DlKLJJIIJZLJL;
        C348100Dkm c348100DkmLIZIZ2;
        C0FW6 c0fw6LJIIIZ2;
        InterfaceC1452170ntP interfaceC1452170ntP = this.LLILZ;
        if (interfaceC1452170ntP != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntP)) != null && (c0fw6LJIIIZ = c348100DkmLIZIZ.LJIIIZ()) != null && (c348440DlKLJJIIJZLJL = c0fw6LJIIIZ.LJJIIJZLJL(str)) != null) {
            c348440DlKLJJIIJZLJL.LJFF = pair.getFirst().floatValue();
            c348440DlKLJJIIJZLJL.LJI = pair.getSecond().floatValue();
            InterfaceC1452170ntP interfaceC1452170ntP2 = this.LLILZ;
            if (interfaceC1452170ntP2 != null && (c348100DkmLIZIZ2 = C352130DrH.LIZIZ(interfaceC1452170ntP2)) != null && (c0fw6LJIIIZ2 = c348100DkmLIZIZ2.LJIIIZ()) != null) {
                c0fw6LJIIIZ2.LIZLLL(c348440DlKLJJIIJZLJL);
            }
        }
    }

    private final void w2(StreaksData streaksData, InterfaceC1452170ntP interfaceC1452170ntP) {
        Effect effect;
        String strLJIIL;
        C0FW6 c0fw6LJIIIZ;
        if (streaksData.stickerAddState.isStreakGifStickerAdded() || (effect = C06NT.LIZIZ.LIZJ().get(C126X.LIZIZ().fireAnimInfoStickerResId)) == null) {
            return;
        }
        C348460DlM c348460DlM = new C348460DlM(0);
        c348460DlM.LJIILLIIL = "social";
        c348460DlM.LJIIZILJ = effect.getResourceId();
        c348460DlM.LJIIL = effect.getUnzipPath();
        c348460DlM.LJIILL = effect.getId();
        Pair<Float, Float> pairC3 = c3();
        c348460DlM.LJFF = pairC3.getFirst().floatValue();
        c348460DlM.LJI = pairC3.getSecond().floatValue();
        c348460DlM.LJIILJJIL = new String[]{streaksData.streakGifPath, "", "", "", ""};
        c348460DlM.LJ = this.LLILZLL;
        c348460DlM.LJIIJ = 1.2f;
        C1632480saE c1632480saE = C1632480saE.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreakNLE, streak fire emoji: ");
        sbLIZ.append(c348460DlM);
        C201955140j.LJIILJJIL(c1632480saE, C2188811AlT.LIZIZ(sbLIZ));
        StoryStreakStickerState storyStreakStickerState = streaksData.stickerAddState;
        C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntP);
        if (c348100DkmLIZIZ != null && (c0fw6LJIIIZ = c348100DkmLIZIZ.LJIIIZ()) != null) {
            strLJIIL = c0fw6LJIIIZ.LJIIL(c348460DlM);
        } else {
            strLJIIL = null;
        }
        storyStreakStickerState.setStreakGifStickerUUID(strLJIIL);
    }

    @Override // X.InterfaceC1452410ntn
    public void wx(int i, int i2) {
        VESize vESize = this.LLILZIL;
        if (i == vESize.width && i2 == vESize.height) {
            C201955140j.LIZLLL(C1632480saE.LIZIZ, "StreakNLE", "update ve size, return because size unchanged");
            return;
        }
        if (i2 >= 0 && i >= 0) {
            this.LLILZIL = new VESize(i, i2);
            C1632480saE c1632480saE = C1632480saE.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("update ve size, new size = ");
            sbLIZ.append(this.LLILZIL);
            C201955140j.LIZLLL(c1632480saE, "StreakNLE", C2188811AlT.LIZIZ(sbLIZ));
            StreaksData streaksData = LJJJLIIL().creativeModel.streaksData;
            this.LLIZ = B3(streaksData);
            String str = streaksData.stickerAddState.streakGifStickerUUID;
            if (str != null) {
                E3(str, c3());
            }
            String str2 = streaksData.stickerAddState.ongoingDaysStickerUUID;
            if (str2 != null) {
                E3(str2, q3());
            }
            String str3 = streaksData.stickerAddState.friendshipDaysStickerUUID;
            if (str3 != null) {
                E3(str3, W2());
            }
            String str4 = streaksData.stickerAddState.messageSentStickerUUID;
            if (str4 != null) {
                E3(str4, m3());
                return;
            }
            return;
        }
        C201955140j.LIZLLL(C1632480saE.LIZIZ, "StreakNLE", "update ve size, return because new size invalid");
    }

    @Override // X.InterfaceC1452410ntn
    public void AN1(InterfaceC1452170ntP interfaceC1452170ntP, VESize vESize, SurfaceView surfaceView) {
        String str;
        C1463670oBx c1463670oBx;
        NLETrack mainTrack;
        VecNLETrackSlotSPtr slots;
        NLETimeSpaceNode nLETimeSpaceNode;
        if (interfaceC1452170ntP == null) {
            return;
        }
        this.LLILZIL = vESize;
        boolean z = interfaceC1452170ntP instanceof C1463670oBx;
        InterfaceC1452170ntP interfaceC1452170ntP2 = null;
        if (z) {
            interfaceC1452170ntP2 = interfaceC1452170ntP;
        }
        this.LLILZ = interfaceC1452170ntP2;
        if (surfaceView != null) {
            surfaceView.addOnLayoutChangeListener(new C12YB(surfaceView, this, 1));
        }
        if (z && (c1463670oBx = (C1463670oBx) interfaceC1452170ntP) != null && (mainTrack = c1463670oBx.LIZJ().getMainTrack()) != null && (slots = mainTrack.getSlots()) != null && (nLETimeSpaceNode = (NLETimeSpaceNode) C13LP.LJJJLZIJ(0, slots)) != null) {
            this.LLILZLL = nLETimeSpaceNode.getEndTime() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        }
        C1632480saE c1632480saE = C1632480saE.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreakNLE, Streak NLE build sticker, veSize = ");
        sbLIZ.append(vESize);
        C201955140j.LJIILJJIL(c1632480saE, C2188811AlT.LIZIZ(sbLIZ));
        StreaksData streaksData = LJJJLIIL().creativeModel.streaksData;
        w2(streaksData, interfaceC1452170ntP);
        if (streaksData.isNumUseEffectFont()) {
            str = streaksData.infoNumberFontPath;
        } else {
            str = streaksData.infoNumberFontCreativePath;
        }
        o2(streaksData, streaksData.infoDescFontPath, str, interfaceC1452170ntP);
        interfaceC1452170ntP.jg();
    }

    private final void o2(StreaksData streaksData, String str, String str2, InterfaceC1452170ntP interfaceC1452170ntP) {
        Effect effect = C06NT.LIZIZ.LIZJ().get(C126X.LIZIZ().bottomTextInfoStickerResId);
        if (effect == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        StreaksData streaksData2 = streaksData;
        boolean zLIZ = C1663300tNw.LIZ(streaksData2.mufDaysCount, streaksData2.messageSentCount, streaksData2.streaksLevel);
        C19680611zI c19680611zI = this;
        c19680611zI.LLIZ = zLIZ;
        String str3 = str2;
        String str4 = str;
        if (!streaksData2.stickerAddState.isOngoingDaysStickerAdded()) {
            c19680611zI.Z1(effect, streaksData2, str4, str3, zLIZ, interfaceC1452170ntP);
            streaksData2.stickerAddState.setOngoingDaysStickerAdded(true);
        }
        if (zLIZ) {
            if (!streaksData2.stickerAddState.isMessageSentStickerAdded()) {
                c19680611zI = c19680611zI;
                effect = effect;
                streaksData2 = streaksData2;
                str4 = str4;
                str3 = str3;
                c19680611zI.X1(effect, streaksData2, str4, str3, interfaceC1452170ntP);
                streaksData2.stickerAddState.setMessageSentStickerAdded(true);
            }
            if (!streaksData2.stickerAddState.isFriendshipDaysStickerAdded()) {
                StreaksData streaksData3 = streaksData2;
                c19680611zI.W1(effect, streaksData3, str4, str3, interfaceC1452170ntP);
                streaksData3.stickerAddState.setFriendshipDaysStickerAdded(true);
            }
        }
        C352001Yg.LIZLLL = System.currentTimeMillis() - jCurrentTimeMillis;
    }

    private final void W1(Effect effect, StreaksData streaksData, String str, String str2, InterfaceC1452170ntP interfaceC1452170ntP) {
        String strLJIIL;
        C0FW6 c0fw6LJIIIZ;
        Map<String, String> mapI3 = i3(streaksData);
        C348460DlM c348460DlM = new C348460DlM(0);
        c348460DlM.LJIILLIIL = "social";
        c348460DlM.LJIIZILJ = effect.getResourceId();
        c348460DlM.LJIIL = effect.getUnzipPath();
        c348460DlM.LJIILL = effect.getId();
        Pair<Float, Float> pairW2 = W2();
        c348460DlM.LJFF = pairW2.getFirst().floatValue();
        c348460DlM.LJI = pairW2.getSecond().floatValue();
        c348460DlM.LJIILJJIL = new String[]{GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), mapI3), C1664590tQ1.LJIIIZ(this).getString(2131849182), C1663300tNw.LIZIZ(Integer.valueOf(streaksData.mufDaysCount)), str2, str, String.valueOf(C426750GoL.LIZLLL(C1664590tQ1.LJIIIZ(this))), "false"};
        c348460DlM.LJ = this.LLILZLL;
        c348460DlM.LJIIJ = v3(false, false, streaksData.mufDaysCount);
        C1632480saE c1632480saE = C1632480saE.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreakNLE, streak friend days: ");
        sbLIZ.append(c348460DlM);
        C201955140j.LJIILJJIL(c1632480saE, C2188811AlT.LIZIZ(sbLIZ));
        StoryStreakStickerState storyStreakStickerState = streaksData.stickerAddState;
        C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntP);
        if (c348100DkmLIZIZ != null && (c0fw6LJIIIZ = c348100DkmLIZIZ.LJIIIZ()) != null) {
            strLJIIL = c0fw6LJIIIZ.LJIIL(c348460DlM);
        } else {
            strLJIIL = null;
        }
        storyStreakStickerState.setFriendshipDaysStickerUUID(strLJIIL);
    }

    private final void X1(Effect effect, StreaksData streaksData, String str, String str2, InterfaceC1452170ntP interfaceC1452170ntP) {
        String strLJIIL;
        C0FW6 c0fw6LJIIIZ;
        Map<String, String> mapI3 = i3(streaksData);
        C348460DlM c348460DlM = new C348460DlM(0);
        c348460DlM.LJIILLIIL = "social";
        c348460DlM.LJIIZILJ = effect.getResourceId();
        c348460DlM.LJIIL = effect.getUnzipPath();
        c348460DlM.LJIILL = effect.getId();
        Pair<Float, Float> pairM3 = m3();
        c348460DlM.LJFF = pairM3.getFirst().floatValue();
        c348460DlM.LJI = pairM3.getSecond().floatValue();
        c348460DlM.LJIILJJIL = new String[]{GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), mapI3), C1664590tQ1.LJIIIZ(this).getString(2131849181), C1663300tNw.LIZIZ(Integer.valueOf(streaksData.messageSentCount)), str2, str, String.valueOf(C426750GoL.LIZLLL(C1664590tQ1.LJIIIZ(this))), "false"};
        c348460DlM.LJ = this.LLILZLL;
        c348460DlM.LJIIJ = v3(false, false, streaksData.messageSentCount);
        C1632480saE c1632480saE = C1632480saE.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreakNLE, streak msg sent: ");
        sbLIZ.append(c348460DlM);
        C201955140j.LJIILJJIL(c1632480saE, C2188811AlT.LIZIZ(sbLIZ));
        StoryStreakStickerState storyStreakStickerState = streaksData.stickerAddState;
        C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntP);
        if (c348100DkmLIZIZ != null && (c0fw6LJIIIZ = c348100DkmLIZIZ.LJIIIZ()) != null) {
            strLJIIL = c0fw6LJIIIZ.LJIIL(c348460DlM);
        } else {
            strLJIIL = null;
        }
        storyStreakStickerState.setMessageSentStickerUUID(strLJIIL);
    }

    private final void Z1(Effect effect, StreaksData streaksData, String str, String str2, boolean z, InterfaceC1452170ntP interfaceC1452170ntP) {
        String strLJIIL;
        C0FW6 c0fw6LJIIIZ;
        Map<String, String> mapI3 = i3(streaksData);
        C348460DlM c348460DlM = new C348460DlM(0);
        c348460DlM.LJIILLIIL = "social";
        c348460DlM.LJIIZILJ = effect.getResourceId();
        c348460DlM.LJIIL = effect.getUnzipPath();
        c348460DlM.LJIILL = effect.getId();
        Pair<Float, Float> pairQ3 = q3();
        c348460DlM.LJFF = pairQ3.getFirst().floatValue();
        c348460DlM.LJI = pairQ3.getSecond().floatValue();
        c348460DlM.LJIILJJIL = new String[]{GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), mapI3), C1664590tQ1.LJIIIZ(this).getString(2131849180), String.valueOf(streaksData.streaksLevel), str2, str, String.valueOf(C426750GoL.LIZLLL(C1664590tQ1.LJIIIZ(this))), "true", String.valueOf(z)};
        c348460DlM.LJ = this.LLILZLL;
        c348460DlM.LJIIJ = v3(true, z, streaksData.streaksLevel);
        C1632480saE c1632480saE = C1632480saE.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreakNLE, streak chat days: ");
        sbLIZ.append(c348460DlM);
        C201955140j.LJIILJJIL(c1632480saE, C2188811AlT.LIZIZ(sbLIZ));
        StoryStreakStickerState storyStreakStickerState = streaksData.stickerAddState;
        C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntP);
        if (c348100DkmLIZIZ != null && (c0fw6LJIIIZ = c348100DkmLIZIZ.LJIIIZ()) != null) {
            strLJIIL = c0fw6LJIIIZ.LJIIL(c348460DlM);
        } else {
            strLJIIL = null;
        }
        storyStreakStickerState.setOngoingDaysStickerUUID(strLJIIL);
    }
}
