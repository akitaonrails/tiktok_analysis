package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.info.InfoStickerModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0EOe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC363820EOe extends C05YF {
    List<NLETrack> Gd1();

    InfoStickerModel HS(String str);

    void L51(VideoPublishEditModel videoPublishEditModel);

    C0FEQ LJIIJ();

    void N(boolean z);

    void N52(NLETrackSlot nLETrackSlot);

    void Pz1(String str, String str2, int i, int i2, boolean z, Map<String, String> map);

    void aP0(Effect effect, String str);

    void dY(InfoStickerModel infoStickerModel);

    void eN2(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel);

    void hZ(Effect effect, String str);

    List<InfoStickerModel> iF0();

    void k1();

    void m9(String str, String str2, int i, int i2, boolean z, Map<String, String> map);

    StickerItemModel rQ(NLETrackSlot nLETrackSlot, int i);

    void wx1(String str, boolean z);

    void xi0();
}
