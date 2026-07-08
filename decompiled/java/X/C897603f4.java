package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentBindHelper;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03f4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentBindHelper$handleVenmoBind$1$1$1", f = "PaymentBindHelper.kt", l = {602, 617}, m = "invokeSuspend")
public final class C897603f4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ PaymentBindHelper LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ PaymentMethod LLILZIL;
    public final /* synthetic */ List<PaymentElement> LLILZLL;
    public final /* synthetic */ EnterParams LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ InterfaceC877803bs LLJ;
    public final /* synthetic */ Context LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ CommuteType LLJILJIL;
    public final /* synthetic */ String LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C897603f4(PaymentBindHelper paymentBindHelper, String str, PaymentMethod paymentMethod, List<PaymentElement> list, EnterParams enterParams, String str2, InterfaceC877803bs interfaceC877803bs, Context context, String str3, CommuteType commuteType, String str4, InterfaceC1364105Vn<? super C897603f4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = paymentBindHelper;
        this.LLILZ = str;
        this.LLILZIL = paymentMethod;
        this.LLILZLL = list;
        this.LLIZ = enterParams;
        this.LLIZLLLIL = str2;
        this.LLJ = interfaceC877803bs;
        this.LLJI = context;
        this.LLJIJIL = str3;
        this.LLJILJIL = commuteType;
        this.LLJILJILJ = str4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C897603f4(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x025e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r49) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 908
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C897603f4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
