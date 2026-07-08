package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0DmP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC349110DmP {
    void LIZ();

    NLETrackType LIZIZ();

    void LIZJ(VideoPublishEditModel videoPublishEditModel, int i);

    void LIZLLL(VideoPublishEditModel videoPublishEditModel);

    boolean LJ();

    boolean LJFF();

    void LJI(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel, List<TextStickerData> list, int i);

    void LJII(NLEEditor nLEEditor);

    boolean LJIIIIZZ();

    void LJIIIZ(Function1<? super StickerItemModel, Unit> function1);

    void LJIIJ(Function1<? super List<? extends EffectPointModel>, Unit> function1);

    void LJIIJJI(Function1<? super TextStickerData, Unit> function1);

    void LJIIL(NLETrack nLETrack, VideoPublishEditModel videoPublishEditModel);

    List<TextStickerData> LLLLLLZZ();
}
