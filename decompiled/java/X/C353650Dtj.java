package X;

import com.ss.android.ugc.aweme.tools.sticker.core.aisticker.SingleAIStickerItem;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dtj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.sticker.ImageEditStickerScene$onStickerChoose$3", f = "ImageEditStickerScene.kt", l = {308}, m = "invokeSuspend")
public final class C353650Dtj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Effect LLILLJJLI;
    public final /* synthetic */ C1462080o9O LLILLL;
    public final /* synthetic */ Map<String, String> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C353650Dtj(Effect effect, C1462080o9O c1462080o9O, Map<String, String> map, InterfaceC1364105Vn<? super C353650Dtj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = effect;
        this.LLILLL = c1462080o9O;
        this.LLILZ = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C353650Dtj(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImageEditStickerScene@ba4c.onStickerChoose$3");
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
            C585350MxZ c585350MxZ = SingleAIStickerItem.Companion;
            String effectId = this.LLILLJJLI.getEffectId();
            String str = (String) C13LP.LJJJLL(this.LLILLJJLI.getIconUrl().getUrlList());
            if (str == null) {
                str = "";
            }
            c585350MxZ.getClass();
            SingleAIStickerItem singleAIStickerItemLIZ = C585350MxZ.LIZ(effectId, str);
            C0I2N c0i2n = new C0I2N(this.LLILLL.LLLLLLL().getCreativeInfo());
            this.LL = 1;
            obj = c0i2n.LIZ(singleAIStickerItemLIZ, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ImageEditStickerScene@ba4c.onStickerChoose$3");
                return objLJFF;
            }
        }
        this.LLILLJJLI.setUnzipPath((String) obj);
        C196864120o c196864120o = (C196864120o) this.LLILLL.LLLLZIL.getValue();
        if (c196864120o != null) {
            c196864120o.LLLIIIIL(this.LLILLJJLI, this.LLILZ);
        }
        C1632480saE c1632480saE = C1632480saE.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("select sticker_d->s this sitcker: ");
        sbLIZ.append(this.LLILLJJLI.getResource_id());
        sbLIZ.append(" render by icon");
        C201955140j.LIZJ(c1632480saE, C2188811AlT.LIZIZ(sbLIZ));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImageEditStickerScene@ba4c.onStickerChoose$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
