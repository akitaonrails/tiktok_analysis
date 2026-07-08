package X;

import android.text.TextWatcher;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0FVT, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public interface C0FVT {
    C0FVY Aj();

    void Ca(int i, Function1<? super StickerModel, Unit> function1);

    void D6(EnumC390580FTc enumC390580FTc, Function1<? super StickerModel, Boolean> function1);

    void Dj();

    void Fj(int i);

    C0FVL Hj();

    C0FF8 LJIIJ();

    void LJJJJJ(int i);

    boolean LJLL();

    Function1<StickerModel, Unit> Pi();

    TextStickerModel Pj(TextStickerData textStickerData, boolean z, Function1<? super TextStickerModel, Unit> function1);

    void Qi(StickerModel stickerModel);

    C0FWP Ri();

    List<TextStickerModel> Sb();

    void X3(TextWatcher textWatcher);

    void ad(List<Integer> list);

    void cj(float f, Function1<? super StickerModel, Boolean> function1);

    void hj(VideoPublishEditModel videoPublishEditModel);

    void kj();

    C0FVI lj();

    TextStickerModel ll(TextStickerModel textStickerModel);

    C0F9P mj();

    C0FVQ nj();

    InterfaceC391240FVq qj();

    C385670FAf<Boolean> s8();

    void xr(String str, C388340FKm c388340FKm, Function1<? super StickerModel, Unit> function1);
}
