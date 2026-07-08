package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.feed.model.live.StreamUrlStruct;
import java.lang.reflect.Type;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Qo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mixmall.player.MMKLynxLiveView$startPlay$2$streamUrlStruct$1", f = "MMKLynxLiveView.kt", l = {}, m = "invokeSuspend")
public final class C2370409Qo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super StreamUrlStruct>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2370409Qo(String str, InterfaceC1364105Vn<? super C2370409Qo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2370409Qo c2370409Qo = new C2370409Qo(this.LLILLJJLI, interfaceC1364105Vn);
        c2370409Qo.LL = obj;
        return c2370409Qo;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        Type type;
        C1C7U.LIZ("MMKLynxLiveView@8b4d.startPlay$2$streamUrlStruct$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = this.LLILLJJLI;
        Object obj2 = null;
        try {
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                    type = C2371409Qy.LIZJ(C13LE.LJII(StreamUrlStruct.class));
                } else {
                    type = new TypeToken<StreamUrlStruct>() { // from class: X.09Qp
                    }.getType();
                }
                Object objLJIIIIZZ = gsonLJFF.LJIIIIZZ(str, type);
                if (!(objLJIIIIZZ instanceof StreamUrlStruct)) {
                    objLJIIIIZZ = null;
                }
                c098200Yq = (StreamUrlStruct) objLJIIIIZZ;
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj2 = c098200Yq;
        }
        C1C7U.LIZIZ("MMKLynxLiveView@8b4d.startPlay$2$streamUrlStruct$1");
        return obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super StreamUrlStruct> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
