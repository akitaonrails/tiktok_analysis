package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.0Dbc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.tools.chat.common.component.AiChatSaveComponent$saveForPost$job$1$2", f = "AiChatSaveComponent.kt", l = {140}, m = "invokeSuspend")
public final class C342420Dbc extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super InterfaceC1157570gEF<? extends String>>, Throwable, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ InterfaceC346701Wf LLILLJJLI;
    public /* synthetic */ Object LLILLL;

    public C342420Dbc(InterfaceC1364105Vn<? super C342420Dbc> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AiChatSaveComponent@8e0a.saveForPost$job$1$2");
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
            InterfaceC346701Wf interfaceC346701Wf = this.LLILLJJLI;
            Throwable th = (Throwable) this.LLILLL;
            C21290818Tq.LIZIZ("AiChatSaveComponent", "Flow failed", th);
            C1155990gBh c1155990gBh = new C1155990gBh(th, 2);
            this.LLILLJJLI = null;
            this.LL = 1;
            if (interfaceC346701Wf.emit(c1155990gBh, this) == objLJFF) {
                C1C7U.LIZIZ("AiChatSaveComponent@8e0a.saveForPost$job$1$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AiChatSaveComponent@8e0a.saveForPost$job$1$2");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super InterfaceC1157570gEF<? extends String>> interfaceC346701Wf, Throwable th, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C342420Dbc c342420Dbc = new C342420Dbc(interfaceC1364105Vn);
        c342420Dbc.LLILLJJLI = interfaceC346701Wf;
        c342420Dbc.LLILLL = th;
        return c342420Dbc.invokeSuspend(Unit.LIZ);
    }
}
