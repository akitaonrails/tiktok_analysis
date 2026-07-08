package X;

import android.content.Context;
import com.ss.android.ugc.aweme.services.external.ui.EditConfig;
import com.ss.android.ugc.aweme.services.external.ui.MediaInfo;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MTk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.external.ui.EditServiceImpl$startEdit$1$1", f = "EditServiceImpl.kt", l = {198, 206, 245}, m = "invokeSuspend")
public final class C569020MTk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public EditConfig LL;
    public C580340MpU LLILLJJLI;
    public Object LLILLL;
    public MediaInfo LLILZ;
    public ShortVideoContext LLILZIL;
    public int LLILZLL;
    public final /* synthetic */ C580340MpU LLIZ;
    public final /* synthetic */ EditConfig LLIZLLLIL;
    public final /* synthetic */ Context LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C569020MTk(C580340MpU c580340MpU, EditConfig editConfig, Context context, InterfaceC1364105Vn<? super C569020MTk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = c580340MpU;
        this.LLIZLLLIL = editConfig;
        this.LLJ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C569020MTk(this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f9  */
    /* JADX WARN: Type inference failed for: r0v25, types: [T, java.lang.String] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 799
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C569020MTk.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
