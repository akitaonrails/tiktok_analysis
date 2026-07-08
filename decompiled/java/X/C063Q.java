package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.tako.share.panel.TakoSharePackage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.063Q, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.TakoServiceImpl$shareLocalMediaToDM$2", f = "TakoServiceImpl.kt", l = {1447, 1464, 1468, 1470, 1475, 1495, 1521}, m = "invokeSuspend")
public final class C063Q extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ TakoSharePackage LLILZ;
    public final /* synthetic */ C259800zU<DialogC1389620mGW> LLILZIL;
    public final /* synthetic */ Activity LLILZLL;
    public final /* synthetic */ Function1<Boolean, Unit> LLIZ;
    public final /* synthetic */ SharePackage LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C063Q(TakoSharePackage takoSharePackage, C259800zU<DialogC1389620mGW> c259800zU, Activity activity, Function1<? super Boolean, Unit> function1, SharePackage sharePackage, String str, String str2, InterfaceC1364105Vn<? super C063Q> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = takoSharePackage;
        this.LLILZIL = c259800zU;
        this.LLILZLL = activity;
        this.LLIZ = function1;
        this.LLIZLLLIL = sharePackage;
        this.LLJ = str;
        this.LLJI = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C063Q c063q = new C063Q(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
        c063q.LLILLL = obj;
        return c063q;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c1  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C063Q.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
