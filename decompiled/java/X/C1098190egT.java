package X;

import Y.AfS153S0200000_17;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.combine.exp.LiveCombineRequestExp;
import com.bytedance.android.livesdk.chatroom.network.MiddleTouchApi;
import com.bytedance.android.livesdk.chatroom.viewmodule.MiddleTouchWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.room.UnifyBaseBusinessResponse;

/* JADX INFO: renamed from: X.0egT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.chatroom.viewmodule.MiddleTouchWidget$onLoad$7", f = "MiddleTouchWidget.kt", l = {337, 339}, m = "invokeSuspend")
public final class C1098190egT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MiddleTouchWidget LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1098190egT(MiddleTouchWidget middleTouchWidget, InterfaceC1364105Vn<? super C1098190egT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = middleTouchWidget;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1098190egT(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long id;
        C11NZ<C470590Icr<UnifyBaseBusinessResponse.Data>> middleTouchDataV2;
        C1C7U.LIZ("MiddleTouchWidget@3b6f.onLoad$7");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            LiveCombineRequestExp liveCombineRequestExp = LiveCombineRequestExp.INSTANCE;
            if (liveCombineRequestExp.enableForRequest("/webcast/room/unify_base/get_middle_touch/")) {
                MiddleTouchWidget middleTouchWidget = this.LLILLJJLI;
                this.LL = 1;
                middleTouchWidget.getClass();
                C1098020egC c1098020egCLIZIZ = C1098060egG.LIZIZ();
                c1098020egCLIZIZ.LJFF = System.currentTimeMillis();
                C11JF c11jf = middleTouchWidget.LLJI;
                if (c11jf != null) {
                    c11jf.dispose();
                }
                C1098440egs c1098440egs = MiddleTouchApi.LIZ;
                long jLJJLIIIJ = C500260Jjc.LJJLIIIJ(middleTouchWidget.dataChannel);
                User userLJIIIIZZ = C500260Jjc.LJIIIIZZ(middleTouchWidget.dataChannel);
                if (userLJIIIIZZ != null) {
                    id = userLJIIIIZZ.getId();
                } else {
                    id = 0;
                }
                c1098440egs.getClass();
                if (liveCombineRequestExp.enableForRequest("/webcast/room/unify_base/get_middle_touch/")) {
                    middleTouchDataV2 = C497120JeY.LJIIZILJ.LIZIZ("/webcast/room/unify_base/get_middle_touch/", new C1098220egW(jLJJLIIIJ, id));
                } else {
                    C480460Ism.LIZ().getClass();
                    middleTouchDataV2 = ((MiddleTouchApi) C480460Ism.LIZLLL(MiddleTouchApi.class)).getMiddleTouchDataV2(jLJJLIIIJ, id, 3);
                }
                middleTouchWidget.LLJI = (C11JF) middleTouchDataV2.LJJLL(new AfS153S0200000_17(c1098020egCLIZIZ, middleTouchWidget, 11), new C09JN() { // from class: X.00LZ
                    @Override // X.C09JN
                    public final /* bridge */ /* synthetic */ void accept(Object obj2) {
                        C1C7U.LIZ("MiddleTouchWidget@3b6f.createSparkViewOnDemandV2$3");
                        C1C7U.LIZIZ("MiddleTouchWidget@3b6f.createSparkViewOnDemandV2$3");
                    }
                });
                if (Unit.LIZ == objLJFF) {
                    C1C7U.LIZIZ("MiddleTouchWidget@3b6f.onLoad$7");
                    return objLJFF;
                }
            } else {
                MiddleTouchWidget middleTouchWidget2 = this.LLILLJJLI;
                this.LL = 2;
                if (middleTouchWidget2.C1(this) == objLJFF) {
                    C1C7U.LIZIZ("MiddleTouchWidget@3b6f.onLoad$7");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MiddleTouchWidget@3b6f.onLoad$7");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
