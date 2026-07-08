package X;

import com.bytedance.android.livesdk.model.KaraokeSong;
import com.bytedance.android.livesdk.model.message.KaraokeQueueListMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0U0f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeQueueMessageActionHandler$handleQueueListIM$1", f = "KaraokeQueueMessageActionHandler.kt", l = {102, 123, 160, 171, 179, 188, 190}, m = "invokeSuspend")
public final class C765270U0f extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public C765260U0e LLILLJJLI;
    public KaraokeQueueListMessage LLILLL;
    public Object LLILZ;
    public KaraokeSong LLILZIL;
    public int LLILZLL;
    public final /* synthetic */ C765260U0e LLIZ;
    public final /* synthetic */ KaraokeQueueListMessage LLIZLLLIL;
    public final /* synthetic */ long LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C765270U0f(C765260U0e c765260U0e, KaraokeQueueListMessage karaokeQueueListMessage, long j, InterfaceC1364105Vn<? super C765270U0f> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = c765260U0e;
        this.LLIZLLLIL = karaokeQueueListMessage;
        this.LLJ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C765270U0f(this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x0199 -> B:37:0x00e4). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 1030
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C765270U0f.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
