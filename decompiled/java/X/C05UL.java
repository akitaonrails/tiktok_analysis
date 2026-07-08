package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05UL, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewAssemKt$TakoMultiImagePreviewImageContent$3$1$1", f = "TakoContentPreviewAssem.kt", l = {842, 848}, m = "invokeSuspend")
public final class C05UL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C05UN LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05UL(C05UN c05un, InterfaceC1364105Vn<? super C05UL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c05un;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05UL(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strIc;
        boolean z;
        C1683130ttv c1683130ttvAa;
        C05UQ c05uqY8;
        C1C7U.LIZ("TakoContentPreviewAssemKt@2e97.TakoMultiImagePreviewImageContent$3$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C155000ia.LIZIZ(obj);
                    ((C13FE) this.LLILLJJLI.LJI).setValue(Boolean.TRUE);
                    ((C13FE) this.LLILLJJLI.LJIIJ).setValue(Boolean.FALSE);
                    ((C13FE) this.LLILLJJLI.LJJI).setValue(null);
                    ((C13FE) this.LLILLJJLI.LJJIFFI).setValue(null);
                    ((C13FE) this.LLILLJJLI.LJJII).setValue(null);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TakoContentPreviewAssemKt@2e97.TakoMultiImagePreviewImageContent$3$1$1");
                    return unit;
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                TakoContentPreviewItem takoContentPreviewItem = (TakoContentPreviewItem) C13LP.LJJJLZIJ(this.LLILLJJLI.LIZIZ(), this.LLILLJJLI.LIZLLL().LL);
                if (takoContentPreviewItem != null) {
                    strIc = takoContentPreviewItem.Ic();
                } else {
                    strIc = null;
                }
                if (strIc != null) {
                    ((C13FE) this.LLILLJJLI.LJJI).setValue(strIc);
                    C05UN c05un = this.LLILLJJLI;
                    InterfaceC1361305Ul interfaceC1361305Ul = c05un.LIZ;
                    if (interfaceC1361305Ul != null) {
                        c1683130ttvAa = interfaceC1361305Ul.aa(strIc);
                    } else {
                        c1683130ttvAa = null;
                    }
                    ((C13FE) c05un.LJJIFFI).setValue(c1683130ttvAa);
                    C05UN c05un2 = this.LLILLJJLI;
                    InterfaceC1361305Ul interfaceC1361305Ul2 = c05un2.LIZ;
                    if (interfaceC1361305Ul2 != null) {
                        c05uqY8 = interfaceC1361305Ul2.Y8(strIc);
                    } else {
                        c05uqY8 = null;
                    }
                    ((C13FE) c05un2.LJJII).setValue(c05uqY8);
                }
                ((C13FE) this.LLILLJJLI.LJII).setValue(Long.valueOf(SystemClock.uptimeMillis()));
                if (this.LLILLJJLI.LJ.LIZLLL().floatValue() == 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    C1677480tko<Float, C1677280tkU> c1677480tko = this.LLILLJJLI.LJ;
                    Float fLIZLLL = C2286608xc.LIZLLL(0.01f);
                    this.LL = 1;
                    if (c1677480tko.LJFF(fLIZLLL, this) == objLJFF) {
                        C1C7U.LIZIZ("TakoContentPreviewAssemKt@2e97.TakoMultiImagePreviewImageContent$3$1$1");
                        return objLJFF;
                    }
                }
            }
            ((C13FE) this.LLILLJJLI.LJIIJ).setValue(Boolean.TRUE);
            C1677480tko<Float, C1677280tkU> c1677480tko2 = this.LLILLJJLI.LJ;
            Float fLIZLLL2 = C2286608xc.LIZLLL(1.0f);
            C1677050tk7 c1677050tk7LIZLLL = C1671550tbF.LIZLLL(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, 0, null, 6);
            this.LL = 2;
            if (C1677480tko.LIZJ(c1677480tko2, fLIZLLL2, c1677050tk7LIZLLL, null, null, this, 12) == objLJFF) {
                C1C7U.LIZIZ("TakoContentPreviewAssemKt@2e97.TakoMultiImagePreviewImageContent$3$1$1");
                return objLJFF;
            }
            ((C13FE) this.LLILLJJLI.LJI).setValue(Boolean.TRUE);
            ((C13FE) this.LLILLJJLI.LJIIJ).setValue(Boolean.FALSE);
            ((C13FE) this.LLILLJJLI.LJJI).setValue(null);
            ((C13FE) this.LLILLJJLI.LJJIFFI).setValue(null);
            ((C13FE) this.LLILLJJLI.LJJII).setValue(null);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("TakoContentPreviewAssemKt@2e97.TakoMultiImagePreviewImageContent$3$1$1");
            return unit2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((C13FE) this.LLILLJJLI.LJIIJ).setValue(Boolean.FALSE);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
