package X;

import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.creative.model.music.MemeSoundMusicParam;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.11b1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public interface InterfaceC19530111b1 extends C05YF {
    void Bk();

    void Cu0(List<String> list, List<TTSModel> list2, MemeSoundMusicParam memeSoundMusicParam);

    void Km1();

    void Ma1(Function1<? super StickerModel, Unit> function1);

    void PX(List<String> list, List<TTSModel> list2, MemeSoundMusicParam memeSoundMusicParam);

    TextStickerData Vf();

    void aL2();

    LiveEvent<Integer> eF2();

    void hp2(C0FWT c0fwt);

    String j11();

    void j7(TextStickerModel textStickerModel);

    void kI(TextStickerModel textStickerModel);

    void mt1(boolean z, boolean z2, boolean z3, String str, boolean z4);

    boolean oh();
}
