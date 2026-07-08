package X;

import com.ss.android.ugc.aweme.shortvideo.album.EPAICreateSelectMaterialScene;
import java.io.ByteArrayInputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08og, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.album.EPAICreateSelectMaterialScene$initView$3$1", f = "EPAICreateSelectMaterialScene.kt", l = {}, m = "invokeSuspend")
public final class C2231208og extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ EPAICreateSelectMaterialScene LL;
    public final /* synthetic */ InterfaceC1292040jj8<Throwable> LLILLJJLI;
    public final /* synthetic */ byte[] LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2231208og(EPAICreateSelectMaterialScene ePAICreateSelectMaterialScene, InterfaceC1292040jj8<Throwable> interfaceC1292040jj8, byte[] bArr, String str, InterfaceC1364105Vn<? super C2231208og> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = ePAICreateSelectMaterialScene;
        this.LLILLJJLI = interfaceC1292040jj8;
        this.LLILLL = bArr;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2231208og(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EPAICreateSelectMaterialScene@65c4.initView$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        final C1295960jpS c1295960jpS = (C1295960jpS) this.LL.P0.getValue();
        if (c1295960jpS != null) {
            InterfaceC1292040jj8<Throwable> interfaceC1292040jj8 = this.LLILLJJLI;
            byte[] bArr = this.LLILLL;
            String str = this.LLILZ;
            c1295960jpS.setFailureListener(interfaceC1292040jj8);
            c1295960jpS.setAnimation(new ByteArrayInputStream(bArr), str);
            c1295960jpS.setRepeatCount(0);
            c1295960jpS.addLottieOnCompositionLoadedListener(new InterfaceC1296230jpt() { // from class: X.08oh
                @Override // X.InterfaceC1296230jpt
                public final void LIZ(C1294720jnS c1294720jnS) {
                    c1295960jpS.setMaxFrame((int) (c1294720jnS.LJIIJJI - 1));
                }
            });
            c1295960jpS.playAnimation();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EPAICreateSelectMaterialScene@65c4.initView$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
