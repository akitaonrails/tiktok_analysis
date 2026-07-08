package X;

import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.RecallMessageReusedUISlotAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0I3E, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.RecallMessageReusedUISlotAssem$restoreReplyStateIfNeeded$1$refMsg$1", f = "RecalledMessageViewHolder.kt", l = {}, m = "invokeSuspend")
public final class C0I3E extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C869590Y9l>, Object> {
    public final /* synthetic */ RecallMessageReusedUISlotAssem LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0I3E(RecallMessageReusedUISlotAssem recallMessageReusedUISlotAssem, long j, InterfaceC1364105Vn<? super C0I3E> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = recallMessageReusedUISlotAssem;
        this.LLILLJJLI = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0I3E(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C869590Y9l c869590Y9lLJJJ;
        C1C7U.LIZ("RecallMessageReusedUISlotAssem@77c2.restoreReplyStateIfNeeded$1$refMsg$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.up();
        long j = this.LLILLJJLI;
        InterfaceC874680YTa interfaceC874680YTaLIZ = C0YNY.LIZ(InterfaceC874680YTa.LIZ);
        if (interfaceC874680YTaLIZ != null) {
            c869590Y9lLJJJ = interfaceC874680YTaLIZ.LJJJ(j);
        } else {
            c869590Y9lLJJJ = null;
        }
        C1C7U.LIZIZ("RecallMessageReusedUISlotAssem@77c2.restoreReplyStateIfNeeded$1$refMsg$1");
        return c869590Y9lLJJJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C869590Y9l> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
