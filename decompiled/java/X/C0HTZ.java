package X;

import com.ss.android.ugc.aweme.im.common.model.StickerBase;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HTZ, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.util.StickerUtils$embedC2PAMetadataForSticker$1$1", f = "StickerUtils.kt", l = {177}, m = "invokeSuspend")
public final class C0HTZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ StickerItem LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HTZ(String str, StickerItem stickerItem, String str2, InterfaceC1364105Vn<? super C0HTZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = stickerItem;
        this.LLILZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HTZ(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Long l;
        C1C7U.LIZ("StickerUtils@5e46.embedC2PAMetadataForSticker$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C140D c140d = C140D.LIZ;
            String str = this.LLILLJJLI;
            this.LL = 1;
            if (c140d.LJJIL(str, this) == objLJFF) {
                C1C7U.LIZIZ("StickerUtils@5e46.embedC2PAMetadataForSticker$1$1");
                return objLJFF;
            }
        }
        C0HQV.LIZ.getClass();
        C1910890zpH c1910890zpHLIZIZ = C0HQV.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("C2PA metadata embedding completed for sticker: ");
        StickerBase stickerBase = this.LLILLL.stickerBase;
        if (stickerBase != null) {
            l = stickerBase.id;
        } else {
            l = null;
        }
        sbLIZ.append(l);
        sbLIZ.append(", path: ");
        sbLIZ.append(this.LLILZ);
        c1910890zpHLIZIZ.LIZ("MixStudioShareViewModel", C2188811AlT.LIZIZ(sbLIZ));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StickerUtils@5e46.embedC2PAMetadataForSticker$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
