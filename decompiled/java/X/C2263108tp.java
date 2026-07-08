package X;

import android.graphics.BitmapFactory;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08tp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.aiplayground.panel.component.AIPlaygroundUploadComponent$validateImagePath$2", f = "AIPlaygroundUploadComponent.kt", l = {255}, m = "invokeSuspend")
public final class C2263108tp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Integer, ? extends Integer>>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2263108tp(String str, InterfaceC1364105Vn<? super C2263108tp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2263108tp(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIPlaygroundUploadComponent@75e7.validateImagePath$2");
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
            String str = this.LLILLJJLI;
            this.LL = 1;
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(str, options);
                obj = new Pair(C2286608xc.LJ(options.outWidth), C2286608xc.LJ(options.outHeight));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                obj = new Pair(C2286608xc.LJ(-1), C2286608xc.LJ(-1));
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AIPlaygroundUploadComponent@75e7.validateImagePath$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("AIPlaygroundUploadComponent@75e7.validateImagePath$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Integer, ? extends Integer>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
