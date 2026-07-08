package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0o9p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1462350o9p extends C09AY implements Function1<TextStickerTextWrap, Unit> {
    public final /* synthetic */ C1465420oEm LL;
    public final /* synthetic */ StickerItemModel LLILLJJLI;
    public final /* synthetic */ TextStickerData LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1462350o9p(C1465420oEm c1465420oEm, StickerItemModel stickerItemModel, TextStickerData textStickerData, int i, int i2) {
        super(1);
        this.LL = c1465420oEm;
        this.LLILLJJLI = stickerItemModel;
        this.LLILLL = textStickerData;
        this.LLILZ = i;
        this.LLILZIL = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(TextStickerTextWrap textStickerTextWrap) {
        List<StickerItemModel> list;
        List<StickerItemModel> list2;
        C0FVT c0fvtKR;
        List<StickerItemModel> list3;
        if (C1416310mxZ.LJJLIIIJJIZ(this.LL.LJJJLIIL())) {
            this.LLILLJJLI.extra = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), this.LLILLL);
            InfoStickerModel infoStickerModel = this.LL.LJJJLIIL().getInfoStickerModel();
            if (infoStickerModel != null && (list3 = infoStickerModel.stickers) != null) {
                list3.add(this.LLILLJJLI);
            }
            InterfaceC1461660o8i interfaceC1461660o8iLIZJ = this.LL.Z1().AT().LIZJ();
            if (interfaceC1461660o8iLIZJ != null && (c0fvtKR = interfaceC1461660o8iLIZJ.kR()) != null) {
                c0fvtKR.Pj(this.LLILLL, true, AFwS234S0000000_5.get$arr$(71));
            }
            if (this.LLILZ == this.LLILZIL - 1) {
                InfoStickerModel infoStickerModel2 = this.LL.LJJJLIIL().getInfoStickerModel();
                if (infoStickerModel2 != null && (list2 = infoStickerModel2.stickers) != null) {
                    C1466090oFr.LJIILJJIL(list2, AFwS261S0000000_22.get$arr$(169));
                }
                this.LL.o2().Tx0(AFwS261S0000000_22.get$arr$(170));
            }
        } else {
            this.LLILLL.setFontSize(28);
            this.LLILLJJLI.extra = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), this.LLILLL);
            InfoStickerModel infoStickerModel3 = this.LL.LJJJLIIL().getInfoStickerModel();
            if (infoStickerModel3 != null && (list = infoStickerModel3.stickers) != null) {
                list.add(this.LLILLJJLI);
            }
            if (this.LLILZ == this.LLILZIL - 1) {
                this.LL.o2().Tx0(new AwS601S0100000_22(this.LL, 299));
            }
        }
        return Unit.LIZ;
    }
}
