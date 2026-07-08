package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinGeckoResourceModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.09nm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.view.widget.BulletinLottieImageWidget$showLottieImage$2", f = "BulletinLottieImageWidget.kt", l = {115, 116, 144}, m = "invokeSuspend")
public final class C2480409nm extends C09AX implements InterfaceC1631620sYq<Boolean, String, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ boolean LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C2481009ns LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;
    public final /* synthetic */ BulletinGeckoResourceModel LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2480409nm(C2481009ns c2481009ns, Function0<Unit> function0, BulletinGeckoResourceModel bulletinGeckoResourceModel, Function0<Unit> function02, InterfaceC1364105Vn<? super C2480409nm> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILZ = c2481009ns;
        this.LLILZIL = function0;
        this.LLILZLL = bulletinGeckoResourceModel;
        this.LLIZ = function02;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x014f  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2480409nm.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Boolean bool, String str, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        boolean zBooleanValue = bool.booleanValue();
        C2480409nm c2480409nm = new C2480409nm(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c2480409nm.LLILLJJLI = zBooleanValue;
        c2480409nm.LLILLL = str;
        return c2480409nm.invokeSuspend(Unit.LIZ);
    }
}
