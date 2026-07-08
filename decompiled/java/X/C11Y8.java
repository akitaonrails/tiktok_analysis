package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import com.ss.android.ugc.gamora.editor.sticker.read.SpeakerCenter;
import java.io.File;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.11Y8, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.read.panel.TTSPanelUIComponent$processTtsWithOutUISucResult$1", f = "TTSPanelUIComponent.kt", l = {1381}, m = "invokeSuspend")
public final class C11Y8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C11Y7 LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ File LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;
    public final /* synthetic */ TextStickerData LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ SpeakerCenter.KevaSpeakerBean LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ int LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11Y8(C11Y7 c11y7, long j, File file, Function0<Unit> function0, TextStickerData textStickerData, String str, String str2, SpeakerCenter.KevaSpeakerBean kevaSpeakerBean, String str3, int i, InterfaceC1364105Vn<? super C11Y8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c11y7;
        this.LLILLL = j;
        this.LLILZ = file;
        this.LLILZIL = function0;
        this.LLILZLL = textStickerData;
        this.LLIZ = str;
        this.LLIZLLLIL = str2;
        this.LLJ = kevaSpeakerBean;
        this.LLJI = str3;
        this.LLJIJIL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C11Y8(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v113, types: [T, com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData] */
    /* JADX WARN: Type inference failed for: r0v25, types: [T, com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        TextStickerModel textStickerModel;
        TTSModel ttsModel;
        String speakerID;
        boolean z;
        ReadTextEffectBean next;
        C0FWP c0fwpRi;
        InterfaceC391240FVq interfaceC391240FVq;
        C0FWO c0fwo;
        C122Q c122qK7;
        C0FWP c0fwpRi2;
        Object objLJI = obj;
        C1C7U.LIZ("TTSPanelUIComponent@ceaf.processTtsWithOutUISucResult$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJI);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJI);
            this.LLILLJJLI.LLLJ.LIZ.put("apply_duration", System.currentTimeMillis() - this.LLILLL);
            File file = this.LLILZ;
            if (file != null && file.exists()) {
                C1DFB c1dfb = C0PEM.LIZJ;
                C2167008eK c2167008eK = new C2167008eK(this.LLILZ, null);
                this.LL = 1;
                objLJI = C23250099c.LJI(this, c1dfb, c2167008eK);
                if (objLJI == objLJFF) {
                    C1C7U.LIZIZ("TTSPanelUIComponent@ceaf.processTtsWithOutUISucResult$1");
                    return objLJFF;
                }
            } else {
                this.LLILLJJLI.LLLJ.LIZIZ("file not found");
                this.LLILLJJLI.LLLJ.LIZ(100);
                this.LLILLJJLI.LLLJ.LIZJ(C11YJ.CLIENT.getValue());
                this.LLILLJJLI.LLLJ.LIZLLL();
                this.LLILLJJLI.U9("");
                C11Y7.LLLLLZL.getClass();
                C201955140j.LIZIZ(C11Y7.LLLLZI, "processTtsWithOutUISucResult end. file error");
                Function0<Unit> function0 = this.LLILZIL;
                if (function0 != null) {
                    function0.invoke();
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("TTSPanelUIComponent@ceaf.processTtsWithOutUISucResult$1");
                return unit;
            }
        }
        int iIntValue = ((Number) objLJI).intValue();
        this.LLILLJJLI.LLLJ.LIZLLL();
        if (this.LLILLJJLI.LLLLLLZZ) {
            C11Y7.LLLLLZL.getClass();
            C201955140j.LIZIZ(C11Y7.LLLLZI, "processTtsWithOutUISucResult end.cancelThisTask");
            Function0<Unit> function02 = this.LLILZIL;
            if (function02 != null) {
                function02.invoke();
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("TTSPanelUIComponent@ceaf.processTtsWithOutUISucResult$1");
            return unit2;
        }
        C259800zU c259800zU = new C259800zU();
        ?? r0 = this.LLILZLL;
        c259800zU.element = r0;
        if (r0 == 0) {
            c259800zU.element = new TextStickerData(null, 0, 0, 0, null, null, 0, 0, 0, 0, null, null, false, null, 0L, 0L, 0.0f, 0.0f, 0L, false, false, false, null, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -1, -1, -1, 4095, null);
        }
        TextStickerData textStickerData = (TextStickerData) c259800zU.element;
        if (textStickerData != null) {
            C11Y7 c11y7 = this.LLILLJJLI;
            File file2 = this.LLILZ;
            String str = this.LLIZ;
            String str2 = this.LLIZLLLIL;
            SpeakerCenter.KevaSpeakerBean kevaSpeakerBean = this.LLJ;
            String str3 = this.LLJI;
            int i2 = this.LLJIJIL;
            TextStickerData textStickerData2 = this.LLILZLL;
            C122Q c122qK72 = c11y7.k7();
            if (c122qK72 != null) {
                c122qK72.ja(false);
            }
            C0FVT c0fvtN7 = c11y7.n7();
            if (c0fvtN7 != null && (c0fwpRi2 = c0fvtN7.Ri()) != null) {
                c0fwpRi2.LJIILL = false;
            }
            textStickerData.setAudioTrackDuration(iIntValue);
            textStickerData.setAudioTrackFilePath(file2.getAbsolutePath());
            textStickerData.getAudioPathList().add(file2.getAbsolutePath());
            textStickerData.setAudioText(str);
            String speakerID2 = textStickerData.getSpeakerID();
            if (speakerID2 != null) {
                if (!Intrinsics.LJFF(speakerID2, str2)) {
                    c11y7.KJ(speakerID2, textStickerData);
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = true;
            }
            textStickerData.setSpeakerID(str2);
            textStickerData.setSpeakerName(textStickerData.getSpeakerName());
            textStickerData.setVoiceEffectId(kevaSpeakerBean.voiceEffectId);
            textStickerData.setVoiceAnchorName(kevaSpeakerBean.voiceAnchorName);
            textStickerData.setVoiceEffectIconUrl(kevaSpeakerBean.voiceEffectIconUrl);
            textStickerData.setVoiceEffectResourceId(kevaSpeakerBean.voiceEffectResourceId);
            textStickerData.setVoiceCreatorUserId(kevaSpeakerBean.voiceCreatorUserId);
            textStickerData.setVoiceCreatorUserName(kevaSpeakerBean.voiceCreatorUserName);
            textStickerData.setCreatorVoice(kevaSpeakerBean.isCreatorVoice());
            textStickerData.setTtsAnchorReleaseDate(kevaSpeakerBean.ttsAnchorReleaseDate);
            textStickerData.setTtsReleaseDate(kevaSpeakerBean.ttsReleaseDate);
            Keva keva = SpeakerCenter.LIZ;
            keva.storeString("setLastVoice", str2);
            SpeakerCenter.LJIIIIZZ(str2, str3);
            keva.storeString("last_voice_effect_bean", GsonProtectorUtils.toJson(C2219091BtD.LIZJ(), kevaSpeakerBean));
            c11y7.H4(textStickerData, file2, iIntValue);
            c11y7.n9(i2, str2, str3, str, new C11YM(textStickerData), iIntValue);
            C09TF c09tf = c11y7.LLLLIILLL;
            if (c09tf != null) {
                c09tf.LJI = C09TL.SUC;
            }
            if (textStickerData2 == null && (c122qK7 = c11y7.k7()) != null) {
                c122qK7.cK1(textStickerData);
            }
            C122Q c122qK73 = c11y7.k7();
            if (c122qK73 != null) {
                c122qK73.Fb2(true);
            }
            C0FVT c0fvtN72 = c11y7.n7();
            if (c0fvtN72 != null && (c0fwpRi = c0fvtN72.Ri()) != null && (interfaceC391240FVq = c0fwpRi.LJI) != null && (c0fwo = (C0FWO) interfaceC391240FVq.LLIIIZ(EnumC1466150oFx.TEXT)) != null) {
                c0fwo.s0(true);
            }
            c11y7.J6().mw0(false);
            if (z) {
                Iterator<ReadTextEffectBean> it2 = c11y7.LLJLILLLLZIIL.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(next.mSpeaker.speakreID, str2)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                ReadTextEffectBean readTextEffectBean = next;
                if (readTextEffectBean != null) {
                    C386350FCv.LIZ(C372650EjH.LIZIZ(c11y7.LLJILJILJ), c11y7.LJJJLIIL(), readTextEffectBean.effect);
                }
            }
            C345410DgR.LIZ(c11y7.W6());
            c11y7.K4();
        }
        this.LLILLJJLI.LLLLLLZ = (TextStickerData) c259800zU.element;
        if (C11YF.LIZJ()) {
            C11Y7 c11y72 = this.LLILLJJLI;
            TextStickerData textStickerData3 = (TextStickerData) c259800zU.element;
            if (textStickerData3 != null) {
                speakerID = textStickerData3.getSpeakerID();
            } else {
                speakerID = null;
            }
            c11y72.oc2(speakerID);
        }
        if (c259800zU.element != 0 && (textStickerModel = this.LLILLJJLI.LLLLJI) != null && (ttsModel = textStickerModel.getTtsModel()) != null) {
            ttsModel.hasReadTextAudio = true;
            ttsModel.audioText = ((TextStickerData) c259800zU.element).getAudioText();
            ttsModel.nleUuid = ((TextStickerData) c259800zU.element).getNleUuid();
            ttsModel.audioTrackIndex = ((TextStickerData) c259800zU.element).getAudioTrackIndex();
            ttsModel.audioTrackFilePath = ((TextStickerData) c259800zU.element).getAudioTrackFilePath();
            ttsModel.speakerID = ((TextStickerData) c259800zU.element).getSpeakerID();
            ttsModel.speakerName = ((TextStickerData) c259800zU.element).getSpeakerName();
            ttsModel.voiceAnchorName = ((TextStickerData) c259800zU.element).getVoiceAnchorName();
            ttsModel.voiceEffectId = ((TextStickerData) c259800zU.element).getVoiceEffectId();
            ttsModel.audioPathList = ((TextStickerData) c259800zU.element).getAudioPathList();
            ttsModel.ttsAnchorReleaseDate = ((TextStickerData) c259800zU.element).getTtsAnchorReleaseDate();
            ttsModel.ttsHashTagIds = ((TextStickerData) c259800zU.element).getTtsHashTagIds();
        }
        C11Y7.LLLLLZL.getClass();
        C201955140j.LIZIZ(C11Y7.LLLLZI, "processTtsWithOutUISucResult end.");
        Function0<Unit> function03 = this.LLILZIL;
        if (function03 != null) {
            function03.invoke();
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("TTSPanelUIComponent@ceaf.processTtsWithOutUISucResult$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
