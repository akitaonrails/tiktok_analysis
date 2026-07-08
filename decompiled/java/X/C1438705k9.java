package X;

import android.content.Context;
import com.ss.android.ugc.aweme.im.common.model.StickerVariant;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05k9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.v2.view.AliveButtonView$1$2", f = "AliveButtonView.kt", l = {366, 370}, m = "invokeSuspend")
public final class C1438705k9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public boolean LL;
    public int LLILLJJLI;
    public final /* synthetic */ C440750HQb LLILLL;
    public final /* synthetic */ Context LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1438705k9(C440750HQb c440750HQb, Context context, InterfaceC1364105Vn<? super C1438705k9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c440750HQb;
        this.LLILZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1438705k9(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean zBooleanValue;
        C1C7U.LIZ("AliveButtonView@476a.<init>$1$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    zBooleanValue = this.LL;
                    C155000ia.LIZIZ(obj);
                    this.LLILLL.LIZIZ(zBooleanValue, EnumC440870HQn.STATIC, EnumC440870HQn.ANIMATED);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("AliveButtonView@476a.<init>$1$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C440750HQb c440750HQb = this.LLILLL;
            StickerVariant.Companion.getClass();
            this.LLILLJJLI = 1;
            obj = c440750HQb.LJFF(2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AliveButtonView@476a.<init>$1$2");
                return objLJFF;
            }
        }
        zBooleanValue = ((Boolean) obj).booleanValue();
        if (!zBooleanValue) {
            C440750HQb c440750HQb2 = this.LLILLL;
            StickerVariant.Companion.getClass();
            c440750HQb2.LJ(1);
            if (this.LLILLL.isAttachedToWindow()) {
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                C1438505k7 c1438505k7 = new C1438505k7(this.LLILLL, this.LLILZ, null);
                this.LL = zBooleanValue;
                this.LLILLJJLI = 2;
                if (C23250099c.LJI(this, abstractC2238408pq, c1438505k7) == objLJFF) {
                    C1C7U.LIZIZ("AliveButtonView@476a.<init>$1$2");
                    return objLJFF;
                }
                zBooleanValue = false;
            }
        }
        this.LLILLL.LIZIZ(zBooleanValue, EnumC440870HQn.STATIC, EnumC440870HQn.ANIMATED);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AliveButtonView@476a.<init>$1$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
