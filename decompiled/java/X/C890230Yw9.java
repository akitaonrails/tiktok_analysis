package X;

import com.ss.android.ugc.aweme.im.chatlist.impl.feature.maf.ui.MafChatListWidgetV2;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Yw9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.maf.ui.MafChatListWidgetV2$onRefresh$1", f = "MafChatListWidgetV2.kt", l = {}, m = "invokeSuspend")
public final class C890230Yw9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MafChatListWidgetV2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C890230Yw9(MafChatListWidgetV2 mafChatListWidgetV2, InterfaceC1364105Vn<? super C890230Yw9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = mafChatListWidgetV2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C890230Yw9(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MafChatListWidgetV2@1caf.onRefresh$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (((ConcurrentHashMap) this.LL.LLIZLLLIL).size() > 0) {
            this.LL.Co(C1889360zGY.LIZ);
        } else {
            this.LL.Co(C1889340zGW.LIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MafChatListWidgetV2@1caf.onRefresh$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
