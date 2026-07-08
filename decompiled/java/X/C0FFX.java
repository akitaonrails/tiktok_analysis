package X;

import android.content.Context;
import android.graphics.Point;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0FFX, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FFX extends C09AY implements Function1<TextStickerTextWrap, Unit> {
    public final /* synthetic */ TextStickerData LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ TextStickerModel LLILLL;
    public final /* synthetic */ ArrayList<StickerItemModel> LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ SingleImageData LLILZLL;
    public final /* synthetic */ SingleImageData LLIZ;
    public final /* synthetic */ Function0<Unit> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0FFX(TextStickerData textStickerData, Context context, TextStickerModel textStickerModel, ArrayList arrayList, int i, SingleImageData singleImageData, SingleImageData singleImageData2, AwS566S0100000_22 awS566S0100000_22) {
        super(1);
        this.LL = textStickerData;
        this.LLILLJJLI = context;
        this.LLILLL = textStickerModel;
        this.LLILZ = arrayList;
        this.LLILZIL = i;
        this.LLILZLL = singleImageData;
        this.LLIZ = singleImageData2;
        this.LLIZLLLIL = awS566S0100000_22;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(TextStickerTextWrap textStickerTextWrap) {
        this.LL.setEditCenterPoint(new Point(C497820Jfg.LIZIZ(this.LLILLJJLI) / 2, C497820Jfg.LIZ(this.LLILLJJLI) / 2));
        this.LL.setTextWrapList(C1697810uHb.LJ(textStickerTextWrap));
        this.LLILZ.add(C0F7U.LIZ(this.LLILLL.getId(), this.LL));
        if (this.LLILZ.size() == this.LLILZIL) {
            this.LLILZLL.getStickerInfo().getStickers().addAll(this.LLILZ);
            if (this.LLILZLL.getStickerInfo().getStickers() != this.LLIZ.getStickerInfo().getStickers()) {
                this.LLIZ.getStickerInfo().getStickers().addAll(this.LLILZ);
            }
            Function0<Unit> function0 = this.LLIZLLLIL;
            if (function0 != null) {
                function0.invoke();
            }
        }
        return Unit.LIZ;
    }
}
