package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.17zm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.popcard.click.BasePopCardClickListener$goToPage$3", f = "BasePopCardClickListener.kt", l = {}, m = "invokeSuspend")
public final class C21212417zm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1743900vTw LL;
    public final /* synthetic */ C21212317zl LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ PopupCardVO LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21212417zm(C1743900vTw c1743900vTw, C21212317zl c21212317zl, Context context, PopupCardVO popupCardVO, String str, String str2, InterfaceC1364105Vn<? super C21212417zm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1743900vTw;
        this.LLILLJJLI = c21212317zl;
        this.LLILLL = context;
        this.LLILZ = popupCardVO;
        this.LLILZIL = str;
        this.LLILZLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21212417zm(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0190  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r61) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21212417zm.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
