package X;

import android.animation.ValueAnimator;
import android.graphics.drawable.Animatable;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.viewmodel.PrivilegeDetailViewModel;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0K5M, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K5M extends C09AY implements Function1<Animatable, Unit> {
    public final /* synthetic */ C0K0K LL;
    public final /* synthetic */ C0K5L LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0K5M(C0K0K c0k0k, C0K5L c0k5l, String str, String str2) {
        super(1);
        this.LL = c0k0k;
        this.LLILLJJLI = c0k5l;
        this.LLILLL = str;
        this.LLILZ = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Animatable animatable) {
        PrivilegeDetailViewModel privilegeDetailViewModelZS;
        Pair pair;
        final Locale localeLJ;
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment;
        PrivilegeDetailViewModel privilegeDetailViewModelZS2;
        C0K0K c0k0k = this.LL;
        if (!c0k0k.LJIIIIZZ && (subscriptionPrivilegeDetailFragment = c0k0k.LJ) != null && (privilegeDetailViewModelZS2 = subscriptionPrivilegeDetailFragment.zS()) != null && privilegeDetailViewModelZS2.LLJLL != null) {
            this.LLILLJJLI.LLJILJIL.LJJJI(this.LLILZ);
        } else {
            SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment2 = this.LL.LJ;
            if (subscriptionPrivilegeDetailFragment2 != null && (privilegeDetailViewModelZS = subscriptionPrivilegeDetailFragment2.zS()) != null) {
                final C0K5Q c0k5q = this.LLILLJJLI.LLJILJIL;
                String str = this.LLILLL;
                String str2 = this.LLILZ;
                c0k5q.getClass();
                Pair pairLJIIIIZZ = C513890KDj.LJIIIIZZ(str);
                final String str3 = (String) pairLJIIIIZZ.getFirst();
                final boolean zBooleanValue = ((Boolean) pairLJIIIIZZ.getSecond()).booleanValue();
                String string = a0.LJLIIIL(str3).toString();
                Object obj = ((Map) C513890KDj.LIZ.getValue()).get(string);
                if (obj != null) {
                    pair = new Pair(obj, Boolean.TRUE);
                } else {
                    Object objLJ = ((Map) C513890KDj.LIZIZ.getValue()).get(string);
                    if (objLJ == null) {
                        objLJ = C513890KDj.LJ();
                    }
                    pair = new Pair(objLJ, Boolean.FALSE);
                }
                Locale locale = (Locale) pair.getFirst();
                if (((Boolean) pair.getSecond()).booleanValue()) {
                    localeLJ = locale;
                } else {
                    localeLJ = C513890KDj.LJ();
                }
                BigDecimal bigDecimalLJII = C513890KDj.LJII(str2, localeLJ, locale);
                BigDecimal bigDecimalLJII2 = C513890KDj.LJII(str, localeLJ, locale);
                final int iScale = bigDecimalLJII.scale();
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(bigDecimalLJII.scaleByPowerOfTen(iScale).intValue(), bigDecimalLJII2.scaleByPowerOfTen(iScale).intValue());
                valueAnimatorOfInt.setDuration(500L);
                valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0K5S
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int iIntValue;
                        String strLIZIZ;
                        Integer num;
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        if (zBooleanValue) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(C513890KDj.LIZLLL(BigDecimal.valueOf(iIntValue).scaleByPowerOfTen(-iScale), localeLJ));
                            sbLIZ.append(str3);
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        } else {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(str3);
                            sbLIZ2.append(C513890KDj.LIZLLL(BigDecimal.valueOf(iIntValue).scaleByPowerOfTen(-iScale), localeLJ));
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        }
                        c0k5q.LJJJI(strLIZIZ);
                    }
                });
                valueAnimatorOfInt.start();
                privilegeDetailViewModelZS.LLJLL = valueAnimatorOfInt;
            }
        }
        return Unit.LIZ;
    }
}
