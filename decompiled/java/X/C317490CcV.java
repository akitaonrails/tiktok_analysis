package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CcV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.reedit.EditPostMusicHelper$onEditMusic$1$result$1", f = "EditPostMusicHelper.kt", l = {46}, m = "invokeSuspend")
public final class C317490CcV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends String>>, Object> {
    public int LL;
    public final /* synthetic */ List<String> LLILLJJLI;
    public final /* synthetic */ Context LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C317490CcV(Context context, List list, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C317490CcV(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List list;
        C1C7U.LIZ("EditPostMusicHelper@5949.onEditMusic$1$result$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C1321600kUo c1321600kUo = C317840Cd4.LIZIZ;
                List<String> listSingletonList = this.LLILLJJLI;
                if (listSingletonList == null) {
                    listSingletonList = Collections.singletonList("");
                }
                this.LL = 1;
                obj = c1321600kUo.LIZ(listSingletonList, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("EditPostMusicHelper@5949.onEditMusic$1$result$1");
                    return objLJFF;
                }
            }
            list = (List) obj;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1389890mGx c1389890mGx = new C1389890mGx(C317500CcW.LIZ(this.LLILLL));
            c1389890mGx.LJIIIZ(R.string.m25);
            c1389890mGx.LJIIJJI();
            list = null;
        }
        C1C7U.LIZIZ("EditPostMusicHelper@5949.onEditMusic$1$result$1");
        return list;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends String>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
