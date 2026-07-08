package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L1Z, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ExtractMusicChosenResultImpl$onChosenResult$extractTask$1", f = "ExtractMusicChosenResultImpl.kt", l = {}, m = "invokeSuspend")
public final class C0L1Z extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C536160L1a LLILLJJLI;
    public final /* synthetic */ MediaModel LLILLL;
    public final /* synthetic */ Intent LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0L1Z(C536160L1a c536160L1a, MediaModel mediaModel, Intent intent, InterfaceC1364105Vn<? super C0L1Z> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c536160L1a;
        this.LLILLL = mediaModel;
        this.LLILZ = intent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0L1Z c0l1z = new C0L1Z(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c0l1z.LL = obj;
        return c0l1z;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ExtractMusicChosenResultImpl@a0f0.onChosenResult$extractTask$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C23250099c.LIZIZ((InterfaceC497601wk) this.LL, null, null, new C536180L1c(this.LLILLJJLI, this.LLILLL, this.LLILZ, null), 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ExtractMusicChosenResultImpl@a0f0.onChosenResult$extractTask$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
