package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08zi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerScene$onActivityCreated$5", f = "EditInfoStickerScene.kt", l = {DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, 301}, m = "invokeSuspend")
public final class C2299608zi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C196864120o LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2299608zi(C196864120o c196864120o, InterfaceC1364105Vn<? super C2299608zi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c196864120o;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2299608zi c2299608zi = new C2299608zi(this.LLILLL, interfaceC1364105Vn);
        c2299608zi.LLILLJJLI = obj;
        return c2299608zi;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditInfoStickerScene@1c43.onActivityCreated$5");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("EditInfoStickerScene@1c43.onActivityCreated$5");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            this.LL = 1;
            obj = C2279408wS.LIZ(interfaceC497601wk, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EditInfoStickerScene@1c43.onActivityCreated$5");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C2299708zj c2299708zj = new C2299708zj(this.LLILLL, (List) obj, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c2299708zj) == objLJFF) {
            C1C7U.LIZIZ("EditInfoStickerScene@1c43.onActivityCreated$5");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EditInfoStickerScene@1c43.onActivityCreated$5");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
