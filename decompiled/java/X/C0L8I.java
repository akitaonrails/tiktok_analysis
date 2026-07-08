package X;

import com.ss.android.ugc.cut_ui.CutSource;
import com.ss.android.ugc.cut_ui.MediaItem;
import com.ss.android.ugc.cut_ui.TextItem;
import com.ss.android.ugc.cut_ui_impl.process.NLECutCompressActivity;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L8I, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.cut_ui_impl.process.NLECutCompressActivity$startCompressAndWait$1$2", f = "NLECutCompressActivity.kt", l = {157, 158}, m = "invokeSuspend")
public final class C0L8I extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ C537930L7v LLILLL;
    public final /* synthetic */ NLECutCompressActivity LLILZ;
    public final /* synthetic */ Pair<ArrayList<MediaItem>, ArrayList<TextItem>> LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ CutSource LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0L8I(C537930L7v c537930L7v, NLECutCompressActivity nLECutCompressActivity, Pair<? extends ArrayList<MediaItem>, ? extends ArrayList<TextItem>> pair, long j, CutSource cutSource, InterfaceC1364105Vn<? super C0L8I> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c537930L7v;
        this.LLILZ = nLECutCompressActivity;
        this.LLILZIL = pair;
        this.LLILZLL = j;
        this.LLIZ = cutSource;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0L8I(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v1, types: [X.0L8J, X.0L8M, java.lang.Object] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r42) {
        /*
            Method dump skipped, instruction units count: 631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0L8I.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
