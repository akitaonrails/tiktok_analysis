package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.text.TextWatcher;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSVoiceModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS18S0300100_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0FVU, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FVU extends AbstractC2255721DQs<InterfaceC1461660o8i> implements InterfaceC1461660o8i, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZIZ(getDiContainer(), C122Q.class, null);
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 125));
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC391240FVq.class, null);
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 126));
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), C0FVY.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0FVU.class, "textStickerApi", "getTextStickerApi()Lcom/ss/android/ugc/aweme/editSticker/text/als/EditTextStickerApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0FVU.class, "infiniStickerApi", "getInfiniStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/newengine/EditorInfiniStickerApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C0FVU.class, "itemStickerNewEngineApiInMultiPhotoMode", "getItemStickerNewEngineApiInMultiPhotoMode()Lcom/ss/android/ugc/aweme/image/sticker/newengine/ItemEditStickerNewEngineApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C0FVU.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    public InterfaceC1461660o8i W1() {
        return this;
    }

    private final C0FVT G2() {
        return (C0FVT) this.LLILZIL.getValue();
    }

    private final InterfaceC391240FVq X1() {
        return (InterfaceC391240FVq) this.LLILZ.getValue(this, LLIZLLLIL[1]);
    }

    private final C0FVY Z1() {
        return (C0FVY) this.LLILZLL.getValue(this, LLIZLLLIL[2]);
    }

    private final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLIZ.getValue(this, LLIZLLLIL[3]);
    }

    private final C122Q o2() {
        return (C122Q) this.LLILLJJLI.getValue(this, LLIZLLLIL[0]);
    }

    private final C0FVT w2() {
        return (C0FVT) this.LLILLL.getValue();
    }

    @Override // X.InterfaceC1461660o8i
    public C122Q B02() {
        return o2();
    }

    @Override // X.InterfaceC1461660o8i
    public List<TextStickerData> Et0() {
        List<TextStickerData> listOn;
        List<TextStickerModel> listSb;
        List<TextStickerModel> listSb2;
        if (!C1416310mxZ.LJJLIIIJJIZ(getEditModel())) {
            C122Q c122qO2 = o2();
            if (c122qO2 != null && (listOn = c122qO2.on()) != null) {
                return listOn;
            }
        } else if (C1428470nHB.LJLIIL(getEditModel())) {
            C0FVT c0fvtG2 = G2();
            if (c0fvtG2 != null && (listSb2 = c0fvtG2.Sb()) != null) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listSb2, 10));
                Iterator<TextStickerModel> it2 = listSb2.iterator();
                while (it2.hasNext()) {
                    TextStickerData textStickerDataLIZJ = C0F7U.LIZJ(it2.next());
                    textStickerDataLIZJ.setEditCenterPoint(LLFZ());
                    arrayList.add(textStickerDataLIZJ);
                }
                return arrayList;
            }
        } else {
            C0FVT c0fvtW2 = w2();
            if (c0fvtW2 != null && (listSb = c0fvtW2.Sb()) != null) {
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listSb, 10));
                Iterator<TextStickerModel> it3 = listSb.iterator();
                while (it3.hasNext()) {
                    TextStickerData textStickerDataLIZJ2 = C0F7U.LIZJ(it3.next());
                    textStickerDataLIZJ2.setEditCenterPoint(LLFZ());
                    arrayList2.add(textStickerDataLIZJ2);
                }
                return arrayList2;
            }
        }
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC1461660o8i
    public InterfaceC1444160ngU LJJIFFI() {
        if (!C1416310mxZ.LJJLIIIJJIZ(getEditModel())) {
            C122Q c122qO2 = o2();
            if (c122qO2 != null) {
                return c122qO2.LJJIFFI();
            }
            return null;
        }
        if (C1428470nHB.LJLIIL(getEditModel())) {
            C0FVY c0fvyZ1 = Z1();
            if (c0fvyZ1 != null) {
                return c0fvyZ1.LJJIFFI();
            }
            return null;
        }
        InterfaceC391240FVq interfaceC391240FVqX1 = X1();
        if (interfaceC391240FVqX1 != null) {
            return interfaceC391240FVqX1.LJJIFFI();
        }
        return null;
    }

    @Override // X.InterfaceC1461660o8i
    public boolean LJJJLZIJ() {
        if (!C1416310mxZ.LJJLIIIJJIZ(getEditModel())) {
            C122Q c122qO2 = o2();
            if (c122qO2 != null) {
                return c122qO2.LJJJLZIJ();
            }
            return false;
        }
        if (C1428470nHB.LJLIIL(getEditModel())) {
            C0FVY c0fvyZ1 = Z1();
            if (c0fvyZ1 != null) {
                return c0fvyZ1.ck();
            }
            return false;
        }
        InterfaceC391240FVq interfaceC391240FVqX1 = X1();
        if (interfaceC391240FVqX1 != null) {
            return interfaceC391240FVqX1.ck();
        }
        return false;
    }

    @Override // X.InterfaceC1461660o8i
    public boolean LJLL() {
        if (C1428470nHB.LJLIIL(getEditModel())) {
            C0FVT c0fvtW2 = w2();
            if (c0fvtW2 != null && c0fvtW2.LJLL()) {
                return true;
            }
            C0FVT c0fvtG2 = G2();
            return c0fvtG2 != null && c0fvtG2.LJLL();
        }
        C0FVT c0fvtW22 = w2();
        if (c0fvtW22 != null && c0fvtW22.LJLL()) {
            return true;
        }
        C122Q c122qO2 = o2();
        return c122qO2 != null && c122qO2.LJLL();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC1461660o8i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Point LLFZ() {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r3.getEditModel()
            boolean r0 = X.C1416310mxZ.LJJLIIIJJIZ(r0)
            if (r0 == 0) goto L4d
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r3.getEditModel()
            boolean r0 = X.C1428470nHB.LJLIIL(r0)
            if (r0 == 0) goto L38
            X.0FVY r1 = r3.Z1()
            if (r1 == 0) goto L2a
            X.0oFx r0 = X.EnumC1466150oFx.TEXT
            java.lang.Object r0 = r1.LLIIIZ(r0)
            X.0FWO r0 = (X.C0FWO) r0
            if (r0 == 0) goto L2a
            android.graphics.Point r2 = r0.LLFZ()
        L28:
            if (r2 != 0) goto L37
        L2a:
            android.graphics.Point r2 = new android.graphics.Point
            int r1 = X.C1415610mwR.LIZIZ()
            int r0 = X.C1415610mwR.LIZ()
            r2.<init>(r1, r0)
        L37:
            return r2
        L38:
            X.0FVq r1 = r3.X1()
            if (r1 == 0) goto L2a
            X.0oFx r0 = X.EnumC1466150oFx.TEXT
            java.lang.Object r0 = r1.LLIIIZ(r0)
            X.0FWO r0 = (X.C0FWO) r0
            if (r0 == 0) goto L2a
            android.graphics.Point r2 = r0.LLFZ()
            goto L28
        L4d:
            X.122Q r0 = r3.o2()
            if (r0 == 0) goto L2a
            android.graphics.Point r2 = r0.LLFZ()
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0FVU.LLFZ():android.graphics.Point");
    }

    @Override // X.InterfaceC1461660o8i
    public void LLJJIJIL() {
        C0FVI c0fviLj;
        C122Q c122qO2 = o2();
        if (c122qO2 != null) {
            c122qO2.LLJJIJIL();
        }
        C0FVT c0fvtKR = kR();
        if (c0fvtKR == null || (c0fviLj = c0fvtKR.lj()) == null) {
            return;
        }
        c0fviLj.LIZLLL();
    }

    @Override // X.InterfaceC1461660o8i
    public void LLLLJ() {
        if (C1428470nHB.LJLIIL(getEditModel())) {
            return;
        }
        C122Q c122qO2 = o2();
        if (c122qO2 != null) {
            c122qO2.LLLLJ();
        }
        InterfaceC391240FVq interfaceC391240FVqX1 = X1();
        if (interfaceC391240FVqX1 != null) {
            interfaceC391240FVqX1.KN2();
        }
    }

    @Override // X.InterfaceC1461660o8i
    public void T1() {
        C0FVI c0fviLj;
        InterfaceC1452170ntP value;
        if (LJLL() || C1428470nHB.LLIIIJ(getEditModel()) || C1428470nHB.LJLIIL(getEditModel())) {
            return;
        }
        if (!C1416310mxZ.LJJLIIIJJIZ(getEditModel())) {
            C122Q c122qO2 = o2();
            if (c122qO2 != null) {
                c122qO2.T1();
                return;
            }
            return;
        }
        C0FVT c0fvtW2 = w2();
        if (c0fvtW2 == null || (c0fviLj = c0fvtW2.lj()) == null || (value = c0fviLj.LIZLLL.g().getValue()) == null) {
            return;
        }
        C0FVR c0fvrLJJIFFI = u4.LJJIFFI(c0fviLj.LIZJ, Integer.valueOf(value.getDuration()));
        value.getDuration();
        if (u4.LJLIIL(c0fvrLJJIFFI)) {
            InterfaceC391240FVq interfaceC391240FVq = c0fviLj.LJ;
            Pair<Integer, Integer> pairAl = interfaceC391240FVq != null ? interfaceC391240FVq.al() : null;
            Activity activity = c0fviLj.LIZ;
            VideoPublishEditModel videoPublishEditModel = c0fviLj.LIZJ;
            Point point = pairAl != null ? new Point(pairAl.getFirst().intValue() / 2, pairAl.getSecond().intValue() / 2) : new Point(C0JAI.LIZJ(c0fviLj.LIZ) / 2, C0JAI.LIZIZ(c0fviLj.LIZ) / 2);
            TextStickerData textStickerData = new TextStickerData("", 2, -1, 2, "Proxima-Nova-Semibold.otf", null, 0, 0, 0, 0, null, null, false, null, 0L, 0L, 0.0f, 0.0f, 0L, false, false, false, null, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -32, -1, -1, 4095, null);
            textStickerData.setEditCenterPoint(point);
            int i = C0FVS.LIZ[c0fvrLJJIFFI.ordinal()];
            textStickerData.setTextWrapList(Collections.singletonList(C123P.LIZIZ(i != 1 ? i != 2 ? activity.getString(2131825180) : videoPublishEditModel.creativeModel.initialModel.highLightVideoParametersModel.stickerText : activity.getString(2131822396), false)));
            textStickerData.setX(textStickerData.getEditCenterPoint().x);
            textStickerData.setY(C0JAI.LIZ(154.0f, activity));
            textStickerData.setGuidanceSticker(true);
            if (c0fvrLJJIFFI == C0FVR.LIVE_HIGHLIGHT) {
                textStickerData.setGuidanceWithDefaultText(true);
            }
            if (c0fvrLJJIFFI == C0FVR.LANDSCAPE_VIDEO) {
                textStickerData.setBgMode(1);
                textStickerData.setColor(-1);
            }
            textStickerData.setFontSize(20);
            if (c0fvrLJJIFFI == C0FVR.TTS_VOICE) {
                TTSVoiceModel ttsVoiceModel = c0fviLj.LIZJ.getTtsVoiceModel();
                textStickerData.setVoiceEffectId(ttsVoiceModel != null ? ttsVoiceModel.getEffectId() : null);
                TTSVoiceModel ttsVoiceModel2 = c0fviLj.LIZJ.getTtsVoiceModel();
                textStickerData.setSpeakerName(ttsVoiceModel2 != null ? ttsVoiceModel2.getSpeakerName() : null);
                TTSVoiceModel ttsVoiceModel3 = c0fviLj.LIZJ.getTtsVoiceModel();
                String effectId = ttsVoiceModel3 != null ? ttsVoiceModel3.getEffectId() : null;
                TTSVoiceModel ttsVoiceModel4 = c0fviLj.LIZJ.getTtsVoiceModel();
                textStickerData.setTtsVoiceModel(new TTSVoiceModel(effectId, ttsVoiceModel4 != null ? ttsVoiceModel4.getSpeakerName() : null));
            }
            C0FI2.LJIJJ().LIZLLL(textStickerData.getFontType(), new C0FVV(new AwS18S0300100_5(c0fviLj, System.currentTimeMillis(), textStickerData, c0fvrLJJIFFI, 0), null), Boolean.valueOf(!C298130BmN.LIZ()));
        }
    }

    @Override // X.InterfaceC1461660o8i
    public void U4() {
        C0FWP c0fwpRi;
        InterfaceC391240FVq interfaceC391240FVq;
        List<StickerModel> listLLLILZLLLI;
        C122Q c122qO2 = o2();
        if (c122qO2 != null) {
            Iterator<C196925122x> it2 = c122qO2.LLLLLLZZ().iterator();
            while (it2.hasNext()) {
                TextStickerData data = it2.next().getData();
                if (data != null) {
                    data.setSpeakerID(null);
                }
            }
            c122qO2.U4();
        }
        C0FVT c0fvtKR = kR();
        if (c0fvtKR == null || (c0fwpRi = c0fvtKR.Ri()) == null || (interfaceC391240FVq = c0fwpRi.LJI) == null || (listLLLILZLLLI = interfaceC391240FVq.LLLILZLLLI(EnumC1466150oFx.TEXT)) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLLLILZLLLI, 10));
        for (StickerModel stickerModel : listLLLILZLLLI) {
            if (!(stickerModel instanceof TextStickerModel)) {
                stickerModel = null;
            }
            arrayList.add(stickerModel);
        }
        Iterator it3 = C13LP.LJJJJLI(arrayList).iterator();
        while (it3.hasNext()) {
            c0fwpRi.LJIILIIL((TextStickerModel) it3.next());
        }
    }

    @Override // X.InterfaceC1461660o8i
    public void Wf() {
        C0F9P c0f9pMj;
        C122Q c122qO2 = o2();
        if (c122qO2 != null) {
            c122qO2.i();
        }
        C0FVT c0fvtW2 = w2();
        if (c0fvtW2 == null || (c0f9pMj = c0fvtW2.mj()) == null) {
            return;
        }
        c0f9pMj.LJ();
        c0f9pMj.LJI(false);
    }

    @Override // X.InterfaceC1461660o8i
    public void Yr() {
        if (C1428470nHB.LJLIIL(getEditModel())) {
            C122Q c122qO2 = o2();
            if (c122qO2 != null) {
                c122qO2.i();
            }
            C0FVT c0fvtG2 = G2();
            if (c0fvtG2 != null) {
                c0fvtG2.kj();
                return;
            }
            return;
        }
        C122Q c122qO22 = o2();
        if (c122qO22 != null) {
            c122qO22.i();
        }
        C0FVT c0fvtW2 = w2();
        if (c0fvtW2 != null) {
            c0fvtW2.kj();
        }
    }

    @Override // X.InterfaceC1461660o8i
    public boolean c0() {
        C0FWP c0fwpRi;
        InterfaceC391240FVq interfaceC391240FVq;
        List<StickerModel> listLLLILZLLLI;
        TextStickerModel textStickerModel;
        C0FVT c0fvtKR = kR();
        if (c0fvtKR != null && (c0fwpRi = c0fvtKR.Ri()) != null && (interfaceC391240FVq = c0fwpRi.LJI) != null && (listLLLILZLLLI = interfaceC391240FVq.LLLILZLLLI(EnumC1466150oFx.TEXT)) != null && !listLLLILZLLLI.isEmpty()) {
            for (StickerModel stickerModel : listLLLILZLLLI) {
                if ((stickerModel instanceof TextStickerModel) && (textStickerModel = (TextStickerModel) stickerModel) != null && C0F8Y.LJI(textStickerModel)) {
                    return true;
                }
            }
        }
        C122Q c122qO2 = o2();
        return c122qO2 != null && c122qO2.c0();
    }

    @Override // X.InterfaceC1461660o8i
    public C0FVT kR() {
        return C1428470nHB.LJLIIL(getEditModel()) ? G2() : w2();
    }

    @Override // X.InterfaceC1461660o8i
    public boolean lK1() {
        return C1428470nHB.LJLIIL(getEditModel()) ? o2() == null && G2() == null : o2() == null && w2() == null;
    }

    @Override // X.InterfaceC1461660o8i
    public List<TextStickerData> lr0() {
        List<C196925122x> listLLLLLLZZ;
        List<TextStickerModel> listSb;
        List<TextStickerModel> listSb2;
        if (!C1416310mxZ.LJJLIIIJJIZ(getEditModel())) {
            C122Q c122qO2 = o2();
            if (c122qO2 != null && (listLLLLLLZZ = c122qO2.LLLLLLZZ()) != null) {
                ArrayList arrayList = new ArrayList();
                for (C196925122x c196925122x : listLLLLLLZZ) {
                    if (C0FVW.LIZIZ(c196925122x)) {
                        arrayList.add(c196925122x);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((C196925122x) it2.next()).LJIIJ());
                }
                return arrayList2;
            }
        } else if (C1428470nHB.LJLIIL(getEditModel())) {
            C0FVT c0fvtG2 = G2();
            if (c0fvtG2 != null && (listSb2 = c0fvtG2.Sb()) != null) {
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listSb2, 10));
                Iterator<TextStickerModel> it3 = listSb2.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(C0F7U.LIZJ(it3.next()));
                }
                return arrayList3;
            }
        } else {
            C0FVT c0fvtW2 = w2();
            if (c0fvtW2 != null && (listSb = c0fvtW2.Sb()) != null) {
                ArrayList arrayList4 = new ArrayList();
                for (TextStickerModel textStickerModel : listSb) {
                    TextStickerModel textStickerModel2 = textStickerModel;
                    if (!C0F8Y.LJIIJ(textStickerModel2) && textStickerModel2.getCaptionModel() == null) {
                        arrayList4.add(textStickerModel);
                    }
                }
                ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(arrayList4, 10));
                Iterator it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    arrayList5.add(C0F7U.LIZJ((TextStickerModel) it4.next()));
                }
                return arrayList5;
            }
        }
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC1461660o8i
    public ArrayList<TextStickerData> qT1() {
        C0F9P c0f9pMj;
        if (C1428470nHB.LJLIIL(getEditModel())) {
            return null;
        }
        if (!C1416310mxZ.LJJLIIIJJIZ(getEditModel())) {
            C122Q c122qO2 = o2();
            if (c122qO2 != null) {
                return c122qO2.Yn2();
            }
            return null;
        }
        C0FVT c0fvtW2 = w2();
        if (c0fvtW2 == null || (c0f9pMj = c0fvtW2.mj()) == null) {
            return null;
        }
        return c0f9pMj.LIZIZ();
    }

    @Override // X.InterfaceC1461660o8i
    public C385670FAf<Boolean> s8() {
        if (!C1416310mxZ.LJJLIIIJJIZ(getEditModel())) {
            C122Q c122qO2 = o2();
            if (c122qO2 != null) {
                return c122qO2.mo();
            }
            return null;
        }
        if (C1428470nHB.LJLIIL(getEditModel())) {
            C0FVT c0fvtG2 = G2();
            if (c0fvtG2 != null) {
                return c0fvtG2.s8();
            }
            return null;
        }
        C0FVT c0fvtW2 = w2();
        if (c0fvtW2 != null) {
            return c0fvtW2.s8();
        }
        return null;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C0FVU(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.InterfaceC1461660o8i
    public Pair<Float, Float> Cc(Context context) {
        Pair<Float, Float> pairCc;
        Pair<Integer, Integer> pairAl;
        Pair<Float, Float> pair = new Pair<>(Float.valueOf(C1415610mwR.LIZIZ()), Float.valueOf(C1415610mwR.LIZ()));
        if (C1416310mxZ.LJJLIIIJJIZ(getEditModel())) {
            if (C1428470nHB.LJLIIL(getEditModel())) {
                C0FVY c0fvyZ1 = Z1();
                if (c0fvyZ1 == null || (pairAl = c0fvyZ1.al()) == null) {
                    return pair;
                }
            } else {
                InterfaceC391240FVq interfaceC391240FVqX1 = X1();
                if (interfaceC391240FVqX1 == null || (pairAl = interfaceC391240FVqX1.al()) == null) {
                    return pair;
                }
            }
            return new Pair<>(Float.valueOf(pairAl.getFirst().intValue()), Float.valueOf(pairAl.getSecond().intValue()));
        }
        C122Q c122qO2 = o2();
        if (c122qO2 != null && (pairCc = c122qO2.Cc(context)) != null) {
            return pairCc;
        }
        return pair;
    }

    @Override // X.InterfaceC1461660o8i
    public void Dv1(boolean z) {
        C0FWP c0fwpRi;
        MutableLiveData<Boolean> mutableLiveData;
        if (C1428470nHB.LJLIIL(getEditModel())) {
            return;
        }
        C122Q c122qO2 = o2();
        if (c122qO2 != null) {
            c122qO2.yr(z);
        }
        C0FVT c0fvtW2 = w2();
        if (c0fvtW2 != null && (c0fwpRi = c0fvtW2.Ri()) != null && (mutableLiveData = c0fwpRi.LJIILLIIL) != null) {
            mutableLiveData.setValue(Boolean.valueOf(z));
        }
    }

    @Override // X.InterfaceC1461660o8i
    public void LJJJJJ(int i) {
        C122Q c122qO2 = o2();
        if (c122qO2 != null) {
            c122qO2.LJJJJJ(i);
        }
        C0FVT c0fvtKR = kR();
        if (c0fvtKR != null) {
            c0fvtKR.LJJJJJ(i);
        }
    }

    @Override // X.InterfaceC1461660o8i
    public void OJ2(boolean z) {
        C122Q c122qO2 = o2();
        if (c122qO2 != null) {
            c122qO2.setEnable(z);
        }
    }

    @Override // X.InterfaceC1461660o8i
    public void R3(boolean z) {
        C0FWP c0fwpRi;
        InterfaceC1452170ntP value;
        InterfaceC391240FVq interfaceC391240FVq;
        List<StickerModel> listLLLILZLLLI;
        TextStickerModel textStickerModel;
        TTSModel ttsModel;
        int i;
        if (C1428470nHB.LJLIIL(getEditModel())) {
            return;
        }
        C122Q c122qO2 = o2();
        if (c122qO2 != null) {
            c122qO2.R3(z);
        }
        C0FVT c0fvtW2 = w2();
        if (c0fvtW2 != null && (c0fwpRi = c0fvtW2.Ri()) != null && (value = c0fwpRi.LIZLLL.g().getValue()) != null && (interfaceC391240FVq = c0fwpRi.LJI) != null && (listLLLILZLLLI = interfaceC391240FVq.LLLILZLLLI(EnumC1466150oFx.TEXT)) != null) {
            for (StickerModel stickerModel : listLLLILZLLLI) {
                if ((stickerModel instanceof TextStickerModel) && (textStickerModel = (TextStickerModel) stickerModel) != null && (ttsModel = textStickerModel.getTtsModel()) != null && (i = ttsModel.audioTrackIndex) != -1) {
                    if (z) {
                        value.og(0.0f, i, 1);
                    } else {
                        value.og(1.0f, i, 1);
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC1461660o8i
    public void X3(TextWatcher textWatcher) {
        if (C1428470nHB.LJLIIL(getEditModel())) {
            C122Q c122qO2 = o2();
            if (c122qO2 != null) {
                c122qO2.X3(textWatcher);
            }
            C0FVT c0fvtG2 = G2();
            if (c0fvtG2 != null) {
                c0fvtG2.X3(textWatcher);
                return;
            }
            return;
        }
        C122Q c122qO22 = o2();
        if (c122qO22 != null) {
            c122qO22.X3(textWatcher);
        }
        C0FVT c0fvtW2 = w2();
        if (c0fvtW2 != null) {
            c0fvtW2.X3(textWatcher);
        }
    }

    @Override // X.InterfaceC1461660o8i
    public void ad(List<Integer> list) {
        C0FVT c0fvtW2 = w2();
        if (c0fvtW2 != null) {
            c0fvtW2.ad(list);
        }
    }

    @Override // X.InterfaceC1461660o8i
    public void i7(InfoStickerModel infoStickerModel) {
        C122Q c122qO2 = o2();
        if (c122qO2 != null) {
            c122qO2.i7(infoStickerModel);
        }
    }

    @Override // X.InterfaceC1461660o8i
    public void Ct(TextStickerData textStickerData, boolean z) {
        if (C1428470nHB.LJLIIL(getEditModel())) {
            C122Q c122qO2 = o2();
            if (c122qO2 != null) {
                c122qO2.Ct(textStickerData, z);
            }
            C0FVT c0fvtG2 = G2();
            if (c0fvtG2 != null) {
                c0fvtG2.Pj(textStickerData, true, AFwS234S0000000_5.get$arr$(71));
                return;
            }
            return;
        }
        C122Q c122qO22 = o2();
        if (c122qO22 != null) {
            c122qO22.Ct(textStickerData, z);
        }
        C0FVT c0fvtW2 = w2();
        if (c0fvtW2 != null) {
            c0fvtW2.Pj(textStickerData, true, AFwS234S0000000_5.get$arr$(71));
        }
    }

    @Override // X.InterfaceC1461660o8i
    public void D6(EnumC390580FTc enumC390580FTc, Function1<? super StickerModel, Boolean> function1) {
        if (C1428470nHB.LJLIIL(getEditModel())) {
            C122Q c122qO2 = o2();
            if (c122qO2 != null) {
                c122qO2.ha1(enumC390580FTc);
            }
            C0FVT c0fvtG2 = G2();
            if (c0fvtG2 != null) {
                c0fvtG2.D6(enumC390580FTc, function1);
                return;
            }
            return;
        }
        C122Q c122qO22 = o2();
        if (c122qO22 != null) {
            c122qO22.ha1(enumC390580FTc);
        }
        C0FVT c0fvtW2 = w2();
        if (c0fvtW2 != null) {
            c0fvtW2.D6(enumC390580FTc, null);
        }
    }

    @Override // X.InterfaceC1461660o8i
    public void yH1(float f, boolean z) {
        List<TextStickerModel> listSb;
        InterfaceC391240FVq interfaceC391240FVqX1;
        TextStickerModel textStickerModelCopy$default;
        List<TextStickerModel> listSb2;
        TextStickerModel textStickerModelCopy$default2;
        int i = 1;
        if (C1428470nHB.LJLIIL(getEditModel())) {
            C122Q c122qO2 = o2();
            if (c122qO2 != null) {
                c122qO2.Eu(z);
            }
            C0FVT c0fvtG2 = G2();
            if (c0fvtG2 != null && (listSb2 = c0fvtG2.Sb()) != null) {
                ArrayList<TextStickerModel> arrayList = new ArrayList();
                for (TextStickerModel textStickerModel : listSb2) {
                    if (!C0F8Y.LJIIIIZZ(textStickerModel)) {
                        arrayList.add(textStickerModel);
                    }
                }
                for (TextStickerModel textStickerModel2 : arrayList) {
                    InterfaceC391240FVq interfaceC391240FVqX12 = X1();
                    if (interfaceC391240FVqX12 != null) {
                        if (textStickerModel2.getTextMotionModel().motionEnabled == i) {
                            boolean z2 = false;
                            BaseStickerModel baseStickerModelCopy$default = BaseStickerModel.copy$default(textStickerModel2.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 1.0f, null, null, null, false, Integer.MAX_VALUE, 15, null);
                            if (f == 1.0f) {
                                z2 = true;
                            }
                            textStickerModelCopy$default2 = TextStickerModel.copy$default(textStickerModel2, baseStickerModelCopy$default, null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, z2, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -16386, 65535, null);
                        } else {
                            textStickerModelCopy$default2 = TextStickerModel.copy$default(textStickerModel2, BaseStickerModel.copy$default(textStickerModel2.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, f, null, null, null, false, Integer.MAX_VALUE, 15, null), null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -2, 65535, null);
                        }
                        interfaceC391240FVqX12.k3(textStickerModelCopy$default2, EnumC356070Dxd.COMMIT);
                    }
                    i = 1;
                }
                return;
            }
            return;
        }
        C122Q c122qO22 = o2();
        if (c122qO22 != null) {
            c122qO22.Eu(z);
        }
        C0FVT c0fvtW2 = w2();
        if (c0fvtW2 != null && (listSb = c0fvtW2.Sb()) != null) {
            ArrayList<TextStickerModel> arrayList2 = new ArrayList();
            for (TextStickerModel textStickerModel3 : listSb) {
                if (!C0F8Y.LJIIIIZZ(textStickerModel3)) {
                    arrayList2.add(textStickerModel3);
                }
            }
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
            for (TextStickerModel textStickerModel4 : arrayList2) {
                if (textStickerModel4.isVERenderSticker()) {
                    boolean z3 = false;
                    BaseStickerModel baseStickerModelCopy$default2 = BaseStickerModel.copy$default(textStickerModel4.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 1.0f, null, null, null, false, Integer.MAX_VALUE, 15, null);
                    if (f == 1.0f) {
                        z3 = true;
                    }
                    textStickerModelCopy$default = TextStickerModel.copy$default(textStickerModel4, baseStickerModelCopy$default2, null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, z3, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -16386, 65535, null);
                } else {
                    textStickerModelCopy$default = TextStickerModel.copy$default(textStickerModel4, BaseStickerModel.copy$default(textStickerModel4.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, f, null, null, null, false, Integer.MAX_VALUE, 15, null), null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -2, 65535, null);
                }
                arrayList3.add(textStickerModelCopy$default);
            }
            if (!arrayList3.isEmpty() && (interfaceC391240FVqX1 = X1()) != null) {
                interfaceC391240FVqX1.T(arrayList3, EnumC356070Dxd.COMMIT);
            }
        }
    }

    @Override // X.InterfaceC1461660o8i
    public void W62(float f, boolean z, Function1<? super StickerModel, Boolean> function1) {
        if (C1428470nHB.LJLIIL(getEditModel())) {
            C122Q c122qO2 = o2();
            if (c122qO2 != null) {
                c122qO2.CU1(f, z);
            }
            C0FVT c0fvtG2 = G2();
            if (c0fvtG2 != null) {
                if (z) {
                    f = 1.0f;
                }
                c0fvtG2.cj(f, function1);
                return;
            }
            return;
        }
        C122Q c122qO22 = o2();
        if (c122qO22 != null) {
            c122qO22.CU1(f, z);
        }
        C0FVT c0fvtW2 = w2();
        if (c0fvtW2 != null) {
            if (z) {
                f = 1.0f;
            }
            c0fvtW2.cj(f, function1);
        }
    }

    @Override // X.InterfaceC1461660o8i
    public void xr(String str, C388340FKm c388340FKm, Function1<? super StickerModel, Unit> function1) {
        C0FVT c0fvtKR = kR();
        if (c0fvtKR != null) {
            c0fvtKR.xr(str, c388340FKm, function1);
        }
    }
}
