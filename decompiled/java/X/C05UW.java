package X;

import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05UW, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.ui.preview.FullscreenMediaPreviewPageKt$FullyTransformableMedia$4$3$1", f = "FullscreenMediaPreviewPage.kt", l = {476}, m = "invokeSuspend")
public final class C05UW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1362605Uy LLILLJJLI;
    public final /* synthetic */ SocMediaResource LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ C259800zU<C1677480tko<C1378605aS, C1677270tkT>> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05UW(C1362605Uy c1362605Uy, SocMediaResource socMediaResource, boolean z, C259800zU<C1677480tko<C1378605aS, C1677270tkT>> c259800zU, InterfaceC1364105Vn<? super C05UW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1362605Uy;
        this.LLILLL = socMediaResource;
        this.LLILZ = z;
        this.LLILZIL = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05UW(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FullscreenMediaPreviewPageKt@a504.FullyTransformableMedia$4$3$1");
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
            C1362605Uy c1362605Uy = this.LLILLJJLI;
            C1683130ttv c1683130ttv = c1362605Uy.LIZ;
            C1683130ttv c1683130ttv2 = c1362605Uy.LIZLLL;
            long jLIZ = C1671590tbJ.LIZ(C1671590tbJ.LIZIZ(this.LLILLL.LIZIZ(), c1683130ttv, this.LLILZ), c1683130ttv2);
            C05V6 c05v6 = C1671460tb6.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("zoom end fix: ");
            sbLIZ.append((Object) C1378605aS.LJIIIIZZ(jLIZ));
            sbLIZ.append(", input: ");
            sbLIZ.append(C1671590tbJ.LIZIZ(this.LLILLL.LIZIZ(), c1683130ttv, this.LLILZ));
            sbLIZ.append(' ');
            sbLIZ.append(c1683130ttv2);
            c05v6.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            C1677480tko<C1378605aS, C1677270tkT> c1677480tko = this.LLILZIL.element;
            C1378605aS c1378605aS = new C1378605aS(C1378605aS.LJI(c1677480tko.LIZLLL().LIZ, jLIZ));
            C1677050tk7 c1677050tk7LIZLLL = C1671550tbF.LIZLLL(250, 0, C05Y0.LIZ, 2);
            this.LL = 1;
            if (C1677480tko.LIZJ(c1677480tko, c1378605aS, c1677050tk7LIZLLL, null, null, this, 12) == objLJFF) {
                C1C7U.LIZIZ("FullscreenMediaPreviewPageKt@a504.FullyTransformableMedia$4$3$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FullscreenMediaPreviewPageKt@a504.FullyTransformableMedia$4$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
