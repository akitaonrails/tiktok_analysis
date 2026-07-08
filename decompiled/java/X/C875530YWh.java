package X;

import android.os.SystemClock;
import com.bytedance.tts.pigeon.GECPigeon;
import com.bytedance.tts.pigeon.paas.components.api.PigeonIMLoginStateComponentApi;
import com.bytedance.tts.pigeon.paas.detailpage.component.impl.message.PigeonMessageSenderComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YWh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.tts.pigeon.paas.detailpage.component.impl.message.PigeonMessageSenderComponent$sendMessage$2", f = "PigeonMessageSenderComponent.kt", l = {}, m = "invokeSuspend")
public final class C875530YWh extends C09AX implements Function2<C0Y8T, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PigeonMessageSenderComponent LL;
    public final /* synthetic */ C869590Y9l LLILLJJLI;
    public final /* synthetic */ InterfaceC875640YWs LLILLL;
    public final /* synthetic */ Function2<C869590Y9l, InterfaceC1364105Vn<? super C875650YWt>, Object> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C875530YWh(PigeonMessageSenderComponent pigeonMessageSenderComponent, C869590Y9l c869590Y9l, InterfaceC875640YWs interfaceC875640YWs, Function2<? super C869590Y9l, ? super InterfaceC1364105Vn<? super C875650YWt>, ? extends Object> function2, InterfaceC1364105Vn<? super C875530YWh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = pigeonMessageSenderComponent;
        this.LLILLJJLI = c869590Y9l;
        this.LLILLL = interfaceC875640YWs;
        this.LLILZ = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C875530YWh(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jCurrentTimeMillis;
        C1C7U.LIZ("PigeonMessageSenderComponent@7b6b.sendMessage$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        final PigeonMessageSenderComponent pigeonMessageSenderComponent = this.LL;
        final C869590Y9l c869590Y9l = this.LLILLJJLI;
        final InterfaceC875640YWs interfaceC875640YWs = this.LLILLL;
        final Function2<C869590Y9l, InterfaceC1364105Vn<? super C875650YWt>, Object> function2 = this.LLILZ;
        final C875550YWj c875550YWj = new C875550YWj(pigeonMessageSenderComponent, c869590Y9l, null);
        pigeonMessageSenderComponent.getClass();
        long j = C875470YWb.LIZ;
        if (j > 0 && C875470YWb.LIZIZ > 0) {
            jCurrentTimeMillis = j + (SystemClock.elapsedRealtime() - C875470YWb.LIZIZ);
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        if (jCurrentTimeMillis > 0) {
            c869590Y9l.addExt("monitor_send_message_start_time", String.valueOf(jCurrentTimeMillis));
            c869590Y9l.addExt("monitor_send_message_platform", "android");
        }
        pigeonMessageSenderComponent.LLILZLL.LIZJ(c869590Y9l);
        if (interfaceC875640YWs != null) {
            interfaceC875640YWs.LIZJ(c869590Y9l);
        }
        c869590Y9l.setMsgStatus(1);
        ((InterfaceC875580YWm) pigeonMessageSenderComponent.LLILZ.getValue()).LIZJ(c869590Y9l, new InterfaceC863600XuI<C869590Y9l>() { // from class: X.0YWk
            @Override // X.InterfaceC863600XuI
            public final void LIZIZ(C0YMW c0ymw) {
                pigeonMessageSenderComponent.LLILZLL.LIZIZ(c869590Y9l, c0ymw);
                InterfaceC875640YWs interfaceC875640YWs2 = interfaceC875640YWs;
                if (interfaceC875640YWs2 != null) {
                    interfaceC875640YWs2.LIZIZ(c869590Y9l, c0ymw);
                }
            }

            @Override // X.InterfaceC863600XuI
            public final void onSuccess(C869590Y9l c869590Y9l2) {
                InterfaceC497601wk interfaceC497601wkLJJJJJ = ((PigeonIMLoginStateComponentApi) pigeonMessageSenderComponent.LLIZLLLIL.getValue()).LJJJJJ();
                GECPigeon.Companion.getClass();
                C23250099c.LIZLLL(interfaceC497601wkLJJJJJ, C872060YIy.LIZ().LIZJ().LIZIZ, null, new C875540YWi(c875550YWj, c869590Y9l2, c869590Y9l, function2, pigeonMessageSenderComponent, interfaceC875640YWs, null), 2);
            }
        });
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PigeonMessageSenderComponent@7b6b.sendMessage$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C0Y8T c0y8t, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c0y8t, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
