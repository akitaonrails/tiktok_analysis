package X;

import com.bytedance.android.livesdk.broadcast.RestartLiveChannel;
import com.bytedance.android.livesdk.broadcast.preview.widget.startlive.PreviewStartLiveWidget;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TiS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.preview.modecontainer.GameModeContainer$onSelect$1", f = "GameModeContainer.kt", l = {320}, m = "invokeSuspend")
public final class C754340TiS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0UL4 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C754340TiS(C0UL4 c0ul4, InterfaceC1364105Vn<? super C754340TiS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0ul4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C754340TiS(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GameModeContainer@a90a.onSelect$1");
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
            Boolean bool = (Boolean) DataChannelGlobal.LLILZ.gg0(RestartLiveChannel.class);
            if (bool == null || bool.booleanValue()) {
                long millis = TimeUnit.SECONDS.toMillis(1L) / ((long) 2);
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(millis, this) == objLJFF) {
                    C1C7U.LIZIZ("GameModeContainer@a90a.onSelect$1");
                    return objLJFF;
                }
            }
        }
        C0UKC.LIZ(C13LE.LIZ(PreviewStartLiveWidget.class), this.LLILLJJLI.getStartLiveContainerFromXml(), new C13IQ[0], true);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GameModeContainer@a90a.onSelect$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
