package X;

import com.bytedance.android.livesdk.chatroom.model.GetLiveChainResponse;
import com.bytedance.android.livesdk.programmedlive.api.ProgrammedLiveApi;
import com.bytedance.android.livesdk.programmedlive.ui.CastersWidget;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0IlX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.programmedlive.ui.CastersWidget$updateCastersList$res$1", f = "CastersWidget.kt", l = {246}, m = "invokeSuspend")
public final class C475970IlX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super GetLiveChainResponse>, Object> {
    public int LL;
    public final /* synthetic */ CastersWidget LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C475970IlX(CastersWidget castersWidget, InterfaceC1364105Vn<? super C475970IlX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = castersWidget;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C475970IlX(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String string;
        C1C7U.LIZ("CastersWidget@cbe4.updateCastersList$res$1");
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
            C480460Ism.LIZ().getClass();
            ProgrammedLiveApi programmedLiveApi = (ProgrammedLiveApi) C480460Ism.LIZLLL(ProgrammedLiveApi.class);
            Room room = this.LLILLJJLI.LL;
            if (room == null || (string = C2286608xc.LJFF(room.getId()).toString()) == null) {
                string = "";
            }
            this.LL = 1;
            obj = programmedLiveApi.getLiveChain(string, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CastersWidget@cbe4.updateCastersList$res$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("CastersWidget@cbe4.updateCastersList$res$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super GetLiveChainResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
