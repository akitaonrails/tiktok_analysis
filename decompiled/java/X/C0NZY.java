package X;

import Y.AgS290S0100000_9;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.ReadUserListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NZY, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.ReadUserListViewModel$onPrepared$1", f = "ReadUserListViewModel.kt", l = {58}, m = "invokeSuspend")
public final class C0NZY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ReadUserListViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NZY(ReadUserListViewModel readUserListViewModel, InterfaceC1364105Vn<? super C0NZY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = readUserListViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NZY(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ReadUserListViewModel@b583.onPrepared$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            ReadUserListViewModel readUserListViewModel = this.LLILLJJLI;
            C2252321DDq c2252321DDq = readUserListViewModel.LLILLL;
            AgS290S0100000_9 agS290S0100000_9 = new AgS290S0100000_9(readUserListViewModel, 10);
            this.LL = 1;
            if (c2252321DDq.collect(agS290S0100000_9, this) == objLJFF) {
                C1C7U.LIZIZ("ReadUserListViewModel@b583.onPrepared$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
