package X;

import com.ss.android.ugc.gamora.editorpro.capabilities.text.tts.ui.TTSFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.09Sx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.text.tts.ui.TTSFragment$processTtsFailResult$1", f = "TTSFragment.kt", l = {}, m = "invokeSuspend")
public final class C2376509Sx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ TTSFragment LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2376509Sx(TTSFragment tTSFragment, int i, int i2, String str, String str2, String str3, InterfaceC1364105Vn<? super C2376509Sx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = tTSFragment;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2376509Sx(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TTSFragment@b180.processTtsFailResult$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.mT(this.LLILLJJLI, this.LLILLL, this.LLILZ);
        C09TF c09tf = this.LL.LLLILZLLLI;
        if (c09tf != null && Intrinsics.LJFF(c09tf.LJFF, true)) {
            C345410DgR.LIZ((C345410DgR) this.LL.LLLJ.getValue());
        }
        TTSFragment tTSFragment = this.LL;
        C09TF c09tf2 = tTSFragment.LLLILZLLLI;
        if (c09tf2 != null) {
            c09tf2.LJI = C09TL.FAIL;
        }
        String str = this.LLILZIL;
        String str2 = this.LLILZLL;
        C09TL c09tl = C09TL.FAIL;
        C09TF c09tfLIZ = tTSFragment.uT().LIZ(str, str2);
        if (c09tfLIZ != null) {
            c09tfLIZ.LJI = c09tl;
        }
        tTSFragment.uT().LIZIZ(str, str2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TTSFragment@b180.processTtsFailResult$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
