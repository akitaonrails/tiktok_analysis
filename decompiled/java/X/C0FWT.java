package X;

import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import com.ss.android.ugc.gamora.editor.sticker.read.SpeakerCenter;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0FWT, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public interface C0FWT extends C05YF {
    void Bt2(boolean z, boolean z2, TextStickerData textStickerData, String str, Function0<Unit> function0, Function0<Unit> function02);

    void GM2(TextStickerModel textStickerModel);

    void I10(ExceptionResult exceptionResult);

    LiveEvent<Unit> Iv1();

    void KJ(String str, TextStickerData textStickerData);

    void LR0(List<? extends ReadTextEffectBean> list);

    boolean Lo2();

    void Mu2();

    void QG1();

    void RC0(TextStickerData textStickerData, boolean z, Function0<Unit> function0);

    void Rh2(boolean z);

    void Va0(String str, String str2, SpeakerCenter.KevaSpeakerBean kevaSpeakerBean, TextStickerData textStickerData, boolean z);

    void at(TextStickerData textStickerData);

    void ay(List<? extends ReadTextEffectBean> list, Map<String, String> map);

    C09TF ko1();

    void mq0(List<List<ReadTextEffectBean>> list);

    void oc2(String str);

    void px0();

    void t81(TTSModel tTSModel, TextStickerData textStickerData, boolean z, Function1<? super Boolean, Unit> function1);

    void vl2(boolean z, boolean z2, C196925122x c196925122x, String str, Function0<Unit> function0);
}
