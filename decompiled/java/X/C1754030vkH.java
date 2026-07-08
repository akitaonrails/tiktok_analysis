package X;

import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitContentInfo;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitInfo;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitItem;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitStyleType;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CountDownItem;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.TextArgs;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import g1c.AjS44S0200000_26;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vkH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.CartBenefitManager$innerShow$2", f = "CartBenefitManager.kt", l = {263}, m = "invokeSuspend")
public final class C1754030vkH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1754020vkG LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ List<CartBenefitInfo> LLILZ;
    public final /* synthetic */ C1754020vkG LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1754030vkH(List<CartBenefitInfo> list, C1754020vkG c1754020vkG, InterfaceC1364105Vn<? super C1754030vkH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = list;
        this.LLILZIL = c1754020vkG;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1754030vkH(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1754020vkG c1754020vkG;
        Iterator<CartBenefitInfo> it2;
        boolean z;
        CartBenefitContentInfo cartBenefitContentInfo;
        TextArgs textArgs;
        CountDownItem countDownItem;
        Long l;
        CartBenefitContentInfo cartBenefitContentInfo2;
        Integer num;
        C1C7U.LIZ("CartBenefitManager@e516.innerShow$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i == 1) {
                it2 = (Iterator) this.LLILLJJLI;
                c1754020vkG = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            List<CartBenefitInfo> list = this.LLILZ;
            c1754020vkG = this.LLILZIL;
            it2 = list.iterator();
        }
        while (it2.hasNext()) {
            CartBenefitInfo next = it2.next();
            int i2 = C992530bw3.LIZ[c1754020vkG.LIZJ.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    CartBenefitStyleType cartBenefitStyleType = next.cartBenefitStyleType;
                    if (cartBenefitStyleType != null) {
                        int i3 = C1753960vkA.LIZ[cartBenefitStyleType.ordinal()];
                        if (i3 != 1) {
                            int iIntValue = 0;
                            if (i3 != 2) {
                                if (i3 != 3) {
                                    if (i3 == 4) {
                                        FrameLayout frameLayout = c1754020vkG.LJIIIZ;
                                        if (frameLayout != null) {
                                            CartBenefitItem cartBenefitItem = next.dynamicItem;
                                            if (cartBenefitItem != null && (cartBenefitContentInfo2 = cartBenefitItem.contentInfo) != null && (num = cartBenefitContentInfo2.delayShowSecond) != null) {
                                                iIntValue = num.intValue();
                                            }
                                            RunnableC1754080vkM runnableC1754080vkM = c1754020vkG.LJJ;
                                            if (runnableC1754080vkM != null) {
                                                HandlerHook.viewRemoveCallbacks(frameLayout, runnableC1754080vkM);
                                                HandlerHook.viewRemoveCallbacks(frameLayout, c1754020vkG.LJJI);
                                                c1754020vkG.LJJ = null;
                                                c1754020vkG.LJJI = null;
                                            }
                                            c1754020vkG.LJJ = new RunnableC1754080vkM(c1754020vkG, next);
                                            c1754020vkG.LJJI = new RunnableC1754130vkR(c1754020vkG, next);
                                            HandlerHook.viewPostDelay(frameLayout, c1754020vkG.LJJ, iIntValue * LSPassThroughRecordSizeConfig.DEFAULT);
                                        }
                                        FrameLayout frameLayout2 = c1754020vkG.LJIIIZ;
                                        if (frameLayout2 != null) {
                                            C786410Ut5.I7(new AjS44S0200000_26(c1754020vkG, next, 41), frameLayout2);
                                        }
                                    }
                                } else {
                                    CartBenefitItem cartBenefitItem2 = next.dynamicItem;
                                    if (cartBenefitItem2 != null && (cartBenefitContentInfo = cartBenefitItem2.contentInfo) != null && (textArgs = cartBenefitContentInfo.descArgs) != null && (countDownItem = textArgs.countDownItem) != null && (l = countDownItem.countDownSec) != null && l.longValue() < 3) {
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    c1754020vkG.LJIIL(next, z, false);
                                }
                            } else {
                                c1754020vkG.LJIIL(next, false, true);
                            }
                        } else {
                            c1754020vkG.LJIILIIL(next);
                        }
                    }
                    this.LL = c1754020vkG;
                    this.LLILLJJLI = it2;
                    this.LLILLL = 1;
                    if (AnonymousClass0958.LIZIZ(1000L, this) == objLJFF) {
                        C1C7U.LIZIZ("CartBenefitManager@e516.innerShow$2");
                        return objLJFF;
                    }
                } else {
                    throw new C1954807lC();
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("CartBenefitManager@e516.innerShow$2");
                return unit;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("CartBenefitManager@e516.innerShow$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
