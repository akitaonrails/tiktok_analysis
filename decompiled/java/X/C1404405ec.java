package X;

import android.content.Context;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05ec, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.album.selection.SelectMediaInterceptorChainKt$interceptList$1", f = "SelectMediaInterceptorChain.kt", l = {135, 145}, m = "invokeSuspend")
public final class C1404405ec extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C118300cf LL;
    public Object LLILLJJLI;
    public C529330KpP LLILLL;
    public Object LLILZ;
    public C0L90 LLILZIL;
    public Function1 LLILZLL;
    public Object LLIZ;
    public TikTokMediaModel LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public /* synthetic */ Object LLJIJIL;
    public final /* synthetic */ List<TikTokMediaModel> LLJILJIL;
    public final /* synthetic */ Function0<Unit> LLJILJILJ;
    public final /* synthetic */ C529330KpP LLJILLL;
    public final /* synthetic */ Context LLJJ;
    public final /* synthetic */ C0L90 LLJJI;
    public final /* synthetic */ Function1<TikTokMediaModel, Unit> LLJJIII;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1404405ec(List<? extends TikTokMediaModel> list, Function0<Unit> function0, C529330KpP c529330KpP, Context context, C0L90 c0l90, Function1<? super TikTokMediaModel, Unit> function1, InterfaceC1364105Vn<? super C1404405ec> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJILJIL = list;
        this.LLJILJILJ = function0;
        this.LLJILLL = c529330KpP;
        this.LLJJ = context;
        this.LLJJI = c0l90;
        this.LLJJIII = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1404405ec c1404405ec = new C1404405ec(this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII, interfaceC1364105Vn);
        c1404405ec.LLJIJIL = obj;
        return c1404405ec;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0066 -> B:10:0x004f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x009c -> B:7:0x0037). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1404405ec.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
