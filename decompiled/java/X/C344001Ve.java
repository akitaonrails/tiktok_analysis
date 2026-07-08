package X;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.01Ve, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.tts.pigeon.paas.detailpage.component.impl.message.PigeonMessageListComponent$messageListFlow$1", f = "PigeonMessageListComponent.kt", l = {}, m = "invokeSuspend")
public final class C344001Ve extends C09AX implements InterfaceC1631620sYq<List<? extends C869590Y9l>, Integer, InterfaceC1364105Vn<? super List<? extends C869590Y9l>>, Object> {
    public /* synthetic */ Object LL;

    public C344001Ve(InterfaceC1364105Vn<? super C344001Ve> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PigeonMessageListComponent@9fc5.messageListFlow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List listLLIIII = C13LP.LLIIII((Iterable) this.LL);
        C1C7U.LIZIZ("PigeonMessageListComponent@9fc5.messageListFlow$1");
        return listLLIIII;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(List<? extends C869590Y9l> list, Integer num, InterfaceC1364105Vn<? super List<? extends C869590Y9l>> interfaceC1364105Vn) {
        num.intValue();
        C344001Ve c344001Ve = new C344001Ve(interfaceC1364105Vn);
        c344001Ve.LL = list;
        return c344001Ve.invokeSuspend(Unit.LIZ);
    }
}
