package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.services.external.UIServiceCallback;
import com.ss.android.ugc.aweme.services.external.ui.ChangeBanMusicConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MfI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.external.ui.RecordServiceBaseImpl$startChangeBanMusic$1", f = "RecordServiceBaseImpl.kt", l = {756, 777, 886}, m = "invokeSuspend")
public final class C574020MfI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ChangeBanMusicConfig LLILLJJLI;
    public final /* synthetic */ AbstractC20598115it LLILLL;
    public final /* synthetic */ Activity LLILZ;
    public final /* synthetic */ Aweme LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ UIServiceCallback LLIZ;
    public final /* synthetic */ String LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C574020MfI(ChangeBanMusicConfig changeBanMusicConfig, AbstractC20598115it abstractC20598115it, Activity activity, Aweme aweme, String str, UIServiceCallback uIServiceCallback, String str2, InterfaceC1364105Vn<? super C574020MfI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = changeBanMusicConfig;
        this.LLILLL = abstractC20598115it;
        this.LLILZ = activity;
        this.LLILZIL = aweme;
        this.LLILZLL = str;
        this.LLIZ = uIServiceCallback;
        this.LLIZLLLIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C574020MfI(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0045 A[Catch: Exception -> 0x00ba, TryCatch #0 {Exception -> 0x00ba, blocks: (B:10:0x0023, B:23:0x0080, B:24:0x0083, B:15:0x003f, B:17:0x0045, B:19:0x004d, B:25:0x008c, B:28:0x00b2, B:29:0x00b9, B:12:0x002a, B:14:0x0039, B:20:0x0054), top: B:42:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b2 A[Catch: Exception -> 0x00ba, TryCatch #0 {Exception -> 0x00ba, blocks: (B:10:0x0023, B:23:0x0080, B:24:0x0083, B:15:0x003f, B:17:0x0045, B:19:0x004d, B:25:0x008c, B:28:0x00b2, B:29:0x00b9, B:12:0x002a, B:14:0x0039, B:20:0x0054), top: B:42:0x0012 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C574020MfI.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
