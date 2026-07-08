package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.im.common.model.SetSticker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HuA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.upvote.detail.interaction.RepostDMStickerRepository$persistStickerRecords$1", f = "RepostDMStickerRepository.kt", l = {}, m = "invokeSuspend")
public final class C455840HuA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<SetSticker> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C455840HuA(List<SetSticker> list, InterfaceC1364105Vn<? super C455840HuA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C455840HuA(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RepostDMStickerRepository@38f1.persistStickerRecords$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C455830Hu9.LIZ.getClass();
        String json = GsonProtectorUtils.toJson((Gson) C455830Hu9.LIZJ.getValue(), this.LL);
        C01GW c01gw = C455830Hu9.LIZIZ;
        ((Keva) c01gw.getValue()).storeString(C455830Hu9.LIZJ("sticker_records"), json);
        ((Keva) c01gw.getValue()).storeLong(C455830Hu9.LIZJ("last_update_time"), C455830Hu9.LIZIZ());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RepostDMStickerRepository@38f1.persistStickerRecords$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
