package X;

import com.ss.android.ugc.aweme.im.message.template.card.VoiceMessageTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseFooterComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.FallbackInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VoiceMessageAudioWaveComponent;

/* JADX INFO: renamed from: X.1CnE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2240861CnE {
    public static final VoiceMessageTemplate LIZ(C2240871CnF c2240871CnF, C2242321Cpa c2242321Cpa, C2242801CqM c2242801CqM, C2242771CqJ c2242771CqJ) {
        VoiceMessageAudioWaveComponent voiceMessageAudioWaveComponent;
        FallbackInfoComponent fallbackInfoComponent;
        PreviewHintComponent previewHintComponentLIZ;
        BaseRequestComponent baseRequestComponent;
        BaseResponseComponent baseResponseComponent;
        AttachmentComponent attachmentComponentLIZ;
        BaseHeaderComponent baseHeaderComponentLIZIZ;
        C2227651CGt c2227651CGt = c2240871CnF.audio_wave;
        if (c2227651CGt != null) {
            voiceMessageAudioWaveComponent = new VoiceMessageAudioWaveComponent(c2227651CGt.volume_levels, c2227651CGt.sample_rate.floatValue());
        } else {
            VoiceMessageAudioWaveComponent.Companion.getClass();
            voiceMessageAudioWaveComponent = VoiceMessageAudioWaveComponent.DEFAULT;
        }
        C2242211CpP c2242211CpP = c2240871CnF.fallback_info;
        if (c2242211CpP != null) {
            fallbackInfoComponent = C2242131CpH.LIZ(c2242211CpP);
        } else {
            fallbackInfoComponent = new FallbackInfoComponent(2);
        }
        C2243941CsC c2243941CsC = c2240871CnF.preview_hint;
        if (c2243941CsC != null) {
            previewHintComponentLIZ = C2243921CsA.LIZ(c2243941CsC);
        } else {
            PreviewHintComponent.Companion.getClass();
            previewHintComponentLIZ = C18Y9.LIZ();
        }
        C1CH0 c1ch0 = c2240871CnF.req_base;
        if (c1ch0 != null) {
            baseRequestComponent = C1CH2.LIZ(c1ch0);
        } else {
            baseRequestComponent = new BaseRequestComponent(0);
        }
        C2241571CoN c2241571CoN = c2240871CnF.resp_base;
        if (c2241571CoN != null) {
            baseResponseComponent = C2241581CoO.LIZIZ(c2241571CoN);
        } else {
            baseResponseComponent = new BaseResponseComponent(0L, 15);
        }
        BaseFooterComponent baseFooterComponentLIZ = null;
        if (c2242771CqJ != null) {
            attachmentComponentLIZ = C2242791CqL.LIZ(c2242771CqJ);
        } else {
            attachmentComponentLIZ = null;
        }
        if (c2242321Cpa != null) {
            baseHeaderComponentLIZIZ = C2242351Cpd.LIZIZ(c2242321Cpa);
        } else {
            baseHeaderComponentLIZIZ = null;
        }
        if (c2242801CqM != null) {
            baseFooterComponentLIZ = C2242841CqQ.LIZ(c2242801CqM);
        }
        return new VoiceMessageTemplate(voiceMessageAudioWaveComponent, fallbackInfoComponent, previewHintComponentLIZ, baseRequestComponent, baseResponseComponent, attachmentComponentLIZ, baseHeaderComponentLIZIZ, baseFooterComponentLIZ);
    }
}
