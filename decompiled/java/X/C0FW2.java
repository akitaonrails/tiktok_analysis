package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.sticker.lyric.LyricStickerPanelTagController;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0FW2, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.lyric.LyricStickerPanelTagController$showNewTagIfNeed$1", f = "LyricStickerPanelTagController.kt", l = {}, m = "invokeSuspend")
public final class C0FW2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ LyricStickerPanelTagController LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0FW2(LyricStickerPanelTagController lyricStickerPanelTagController, InterfaceC1364105Vn<? super C0FW2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = lyricStickerPanelTagController;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0FW2 c0fw2 = new C0FW2(this.LLILLJJLI, interfaceC1364105Vn);
        c0fw2.LL = obj;
        return c0fw2;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        VideoPublishEditModel videoPublishEditModelInvoke;
        C1C7U.LIZ("LyricStickerPanelTagController@dcae.showNewTagIfNeed$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        Function0<VideoPublishEditModel> function0 = this.LLILLJJLI.LIZIZ;
        if (function0 != null && (videoPublishEditModelInvoke = function0.invoke()) != null) {
            CreativeModel creativeModel = videoPublishEditModelInvoke.creativeModel;
            boolean z = false;
            if (!creativeModel.draftInfoModel.isDraft && !C1466090oFr.LJIIIZ(creativeModel.stickerModel)) {
                C0E12 c0e12 = C391320FVy.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("has_show_lyric_guide_in_sticker_panel_");
                sbLIZ.append(C391320FVy.LIZ());
                if (!c0e12.LIZ(C2188811AlT.LIZIZ(sbLIZ), false)) {
                    z = true;
                }
            }
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C0FW1(z, this.LLILLJJLI, null), 2);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("LyricStickerPanelTagController@dcae.showNewTagIfNeed$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("LyricStickerPanelTagController@dcae.showNewTagIfNeed$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
