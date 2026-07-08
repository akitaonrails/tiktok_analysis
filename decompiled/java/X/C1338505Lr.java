package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Lr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.offline.store.OfflineCommentKevaStore$saveSnapshot$2", f = "OfflineCommentKevaStore.kt", l = {}, m = "invokeSuspend")
public final class C1338505Lr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1338705Lt LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C05M6 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1338505Lr(C1338705Lt c1338705Lt, String str, C05M6 c05m6, InterfaceC1364105Vn<? super C1338505Lr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1338705Lt;
        this.LLILLJJLI = str;
        this.LLILLL = c05m6;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1338505Lr(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OfflineCommentKevaStore@1c73.saveSnapshot$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Keva kevaLJIILIIL = this.LL.LJIILIIL();
        C1338705Lt c1338705Lt = this.LL;
        String str = this.LLILLJJLI;
        c1338705Lt.getClass();
        String strLJIILJJIL = C1338705Lt.LJIILJJIL(str);
        Gson gson = C1338705Lt.LJ;
        kevaLJIILIIL.storeString(strLJIILJJIL, GsonProtectorUtils.toJson(gson, this.LLILLL));
        C1338705Lt c1338705Lt2 = this.LL;
        String str2 = this.LLILLJJLI;
        c1338705Lt2.getClass();
        Set setLLIIIZ = C13LP.LLIIIZ(C1338705Lt.LJIIJJI(kevaLJIILIIL));
        if (setLLIIIZ.add(str2)) {
            kevaLJIILIIL.storeString("aid_index", GsonProtectorUtils.toJson(gson, C13LP.LLIIII(setLLIIIZ)));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OfflineCommentKevaStore@1c73.saveSnapshot$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
