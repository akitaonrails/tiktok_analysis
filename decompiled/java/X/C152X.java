package X;

import com.bytedance.android.livesdk.model.message.PreviewGameMomentData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.152X, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.bytedance.android.livesdk.game.moment.preview.PreviewGameMomentPresenter$onIMMessage$1$1", f = "PreviewGameMomentPresenter.kt", l = {}, m = "invokeSuspend")
public final class C152X extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C152W LL;
    public final /* synthetic */ PreviewGameMomentData LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C152X(C152W c152w, PreviewGameMomentData previewGameMomentData, InterfaceC1364105Vn<? super C152X> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c152w;
        this.LLILLJJLI = previewGameMomentData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C152X(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PreviewGameMomentPresenter@53d.onIMMessage$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C152W c152w = this.LL;
        PreviewGameMomentData previewGameMomentData = this.LLILLJJLI;
        c152w.LIZJ = previewGameMomentData;
        long j = c152w.LJFF;
        long j2 = previewGameMomentData.eventTime;
        if (j < j2 * 1000) {
            c152w.LIZ.LLLLLZIL("create_time_incorrect", "", String.valueOf(j2), String.valueOf(c152w.LJFF), "");
        } else {
            long j3 = previewGameMomentData.maxTime;
            if (j > 1000 * j3) {
                c152w.LIZ.LLLLLZIL("max_time_incorrect", "", String.valueOf(j3), String.valueOf(c152w.LJFF), "");
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PreviewGameMomentPresenter@53d.onIMMessage$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
