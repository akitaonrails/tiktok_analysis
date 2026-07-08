package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.api.model.ToastContent;
import com.ss.android.ugc.aweme.ecommerce.core.services.cartservice.CartService;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.AddToCartRequestParam;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.AddToCartUiConfig;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.EnterCartParam;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0437, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.core.services.cartservice.CartService$handleAddToCartException$1", f = "CartService.kt", l = {188}, m = "invokeSuspend")
public final class AnonymousClass0437 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C043Y LL;
    public CartService LLILLJJLI;
    public Object LLILLL;
    public ExceptionUX LLILZ;
    public EnterCartParam LLILZIL;
    public AddToCartUiConfig LLILZLL;
    public boolean LLIZ;
    public int LLIZLLLIL;
    public final /* synthetic */ AddToCartUiConfig LLJ;
    public final /* synthetic */ C043Y LLJI;
    public final /* synthetic */ CartService LLJIJIL;
    public final /* synthetic */ View LLJILJIL;
    public final /* synthetic */ ExceptionUX LLJILJILJ;
    public final /* synthetic */ boolean LLJILLL;
    public final /* synthetic */ EnterCartParam LLJJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0437(AddToCartUiConfig addToCartUiConfig, C043Y c043y, CartService cartService, View view, ExceptionUX exceptionUX, boolean z, EnterCartParam enterCartParam, InterfaceC1364105Vn<? super AnonymousClass0437> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJ = addToCartUiConfig;
        this.LLJI = c043y;
        this.LLJIJIL = cartService;
        this.LLJILJIL = view;
        this.LLJILJILJ = exceptionUX;
        this.LLJILLL = z;
        this.LLJJ = enterCartParam;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass0437(this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AddToCartUiConfig addToCartUiConfig;
        C043Y c043y;
        CartService cartService;
        View view;
        ExceptionUX exceptionUX;
        boolean z;
        EnterCartParam enterCartParam;
        View view2;
        int i;
        int iIntValue;
        String str;
        String str2;
        String str3;
        AddToCartRequestParam addToCartRequestParam;
        String str4;
        C1C7U.LIZ("CartService@8ce4.handleAddToCartException$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LLIZLLLIL;
        if (i2 != 0) {
            if (i2 == 1) {
                z = this.LLIZ;
                addToCartUiConfig = this.LLILZLL;
                enterCartParam = this.LLILZIL;
                exceptionUX = this.LLILZ;
                view = (View) this.LLILLL;
                cartService = this.LLILLJJLI;
                c043y = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            addToCartUiConfig = this.LLJ;
            Long l = addToCartUiConfig.toastDelayMs;
            if (l != null) {
                c043y = this.LLJI;
                cartService = this.LLJIJIL;
                view = this.LLJILJIL;
                exceptionUX = this.LLJILJILJ;
                z = this.LLJILLL;
                enterCartParam = this.LLJJ;
                long jLongValue = l.longValue();
                this.LL = c043y;
                this.LLILLJJLI = cartService;
                this.LLILLL = view;
                this.LLILZ = exceptionUX;
                this.LLILZIL = enterCartParam;
                this.LLILZLL = addToCartUiConfig;
                this.LLIZ = z;
                this.LLIZLLLIL = 1;
                if (AnonymousClass0958.LIZIZ(jLongValue, this) == objLJFF) {
                    C1C7U.LIZIZ("CartService@8ce4.handleAddToCartException$1");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("CartService@8ce4.handleAddToCartException$1");
            return unit;
        }
        Map<String, Object> map = null;
        if (c043y != null && c043y.LJFF != null && Intrinsics.LJFF(cartService.LL, true)) {
            view2 = c043y.LJFF;
        } else {
            view2 = view;
        }
        if (view2 != null) {
            view = view2;
        }
        Integer num = exceptionUX.exceptionUXType;
        if (num != null && num.intValue() == 0) {
            C1750820vf6 c1750820vf6 = C1750820vf6.LIZ;
            ToastContent toastContent = exceptionUX.toastContent;
            if (toastContent != null) {
                str4 = toastContent.message;
            } else {
                str4 = null;
            }
            if (enterCartParam != null) {
                map = enterCartParam.trackParams;
            }
            c1750820vf6.getClass();
            C1750820vf6.LJ(view, z, str4, map);
        } else {
            if (c043y != null && (addToCartRequestParam = c043y.LIZ) != null && addToCartRequestParam.addItemSourcePage == 7) {
                i = 1;
            } else {
                i = 0;
            }
            C1750820vf6 c1750820vf62 = C1750820vf6.LIZ;
            Integer num2 = addToCartUiConfig.bottomToastDistance;
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                iIntValue = 0;
            }
            ToastContent toastContent2 = exceptionUX.toastContent;
            if (toastContent2 != null) {
                str = toastContent2.message;
                str2 = toastContent2.disclosureText;
                str3 = toastContent2.schema;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            if (enterCartParam != null) {
                map = enterCartParam.trackParams;
            }
            c1750820vf62.getClass();
            C1750820vf6.LIZ(view, z, iIntValue, str, str2, str3, map, i, 0, null, null);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("CartService@8ce4.handleAddToCartException$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
