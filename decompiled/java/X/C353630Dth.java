package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.tools.sticker.core.aisticker.SingleAIStickerItem;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dth, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.phototemplate.StickerDownloadHelper$downloadStickerIconForTemplate$1$1$1", f = "StickerDownloadHelper.kt", l = {57}, m = "invokeSuspend")
public final class C353630Dth extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ShortVideoContext LLILLJJLI;
    public final /* synthetic */ SingleAIStickerItem LLILLL;
    public final /* synthetic */ Pair<String, String> LLILZ;
    public final /* synthetic */ Effect LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C353630Dth(ShortVideoContext shortVideoContext, SingleAIStickerItem singleAIStickerItem, Pair<String, String> pair, Effect effect, InterfaceC1364105Vn<? super C353630Dth> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = shortVideoContext;
        this.LLILLL = singleAIStickerItem;
        this.LLILZ = pair;
        this.LLILZIL = effect;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C353630Dth(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String first;
        C1C7U.LIZ("StickerDownloadHelper@f9e8.downloadStickerIconForTemplate$1$1$1");
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
            C0I2N c0i2n = new C0I2N(this.LLILLJJLI.creativeInfo);
            SingleAIStickerItem singleAIStickerItem = this.LLILLL;
            this.LL = 1;
            obj = c0i2n.LIZ(singleAIStickerItem, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("StickerDownloadHelper@f9e8.downloadStickerIconForTemplate$1$1$1");
                return objLJFF;
            }
        }
        String str = (String) obj;
        C0LE8.LIZ.getClass();
        C389400FOo c389400FOo = C0LE8.LJFF;
        Pair<String, String> pair = this.LLILZ;
        String second = null;
        if (pair != null) {
            first = pair.getFirst();
        } else {
            first = null;
        }
        Pair<String, String> pair2 = this.LLILZ;
        if (pair2 != null) {
            second = pair2.getSecond();
        }
        Map<String, String> map = c389400FOo.LJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(first);
        sbLIZ.append('-');
        sbLIZ.append(second);
        map.put(C2188811AlT.LIZIZ(sbLIZ), str);
        C1632480saE c1632480saE = C1632480saE.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("downloadStickerIconForTemplate: ");
        sbLIZ2.append(this.LLILZIL.getResource_id());
        sbLIZ2.append(' ');
        sbLIZ2.append(str);
        C201955140j.LIZJ(c1632480saE, C2188811AlT.LIZIZ(sbLIZ2));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StickerDownloadHelper@f9e8.downloadStickerIconForTemplate$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
