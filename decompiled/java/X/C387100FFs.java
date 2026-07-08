package X;

import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0FFs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.avatar.ChangAvatarActionStage$loadResourceAndPublish$1$2", f = "ChangAvatarActionStage.kt", l = {}, m = "invokeSuspend")
public final class C387100FFs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<TextStickerData.Pair<C348460DlM, StickerItemModel>> LL;
    public final /* synthetic */ C1463670oBx LLILLJJLI;
    public final /* synthetic */ C1443550nfV LLILLL;
    public final /* synthetic */ VideoPublishEditModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C387100FFs(List<? extends TextStickerData.Pair<C348460DlM, ? extends StickerItemModel>> list, C1463670oBx c1463670oBx, C1443550nfV c1443550nfV, VideoPublishEditModel videoPublishEditModel, InterfaceC1364105Vn<? super C387100FFs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = c1463670oBx;
        this.LLILLL = c1443550nfV;
        this.LLILZ = videoPublishEditModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C387100FFs(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<StickerItemModel> list;
        C1C7U.LIZ("ChangAvatarActionStage@89ff.loadResourceAndPublish$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<TextStickerData.Pair<C348460DlM, StickerItemModel>> list2 = this.LL;
        C1463670oBx c1463670oBx = this.LLILLJJLI;
        VideoPublishEditModel videoPublishEditModel = this.LLILZ;
        for (TextStickerData.Pair<C348460DlM, StickerItemModel> pair : list2) {
            c1463670oBx.LIZLLL().LJIIIZ().LJIIL(pair.first);
            pair.second.uuid = pair.first.LIZIZ;
            InfoStickerModel infoStickerModel = videoPublishEditModel.getInfoStickerModel();
            if (infoStickerModel != null && (list = infoStickerModel.stickers) != null) {
                Boolean.valueOf(list.add(pair.second));
            }
        }
        C1463670oBx c1463670oBx2 = this.LLILLJJLI;
        VideoPublishEditModel videoPublishEditModel2 = this.LLILZ;
        videoPublishEditModel2.getPreviewInfo().setPreviewVideoLength(c1463670oBx2.getDuration());
        videoPublishEditModel2.setNleData(c1463670oBx2.Zf());
        this.LLILLL.LIZ(this.LLILZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChangAvatarActionStage@89ff.loadResourceAndPublish$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
