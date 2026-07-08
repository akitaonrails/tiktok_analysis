package Y;

import X.C119J;
import X.C119K;
import X.C119X;
import X.C119Y;
import X.C1C7U;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: loaded from: classes30.dex */
public class ACallableS32S0301000_29 implements Callable {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS32S0301000_29 aCallableS32S0301000_29) {
        Unit unit;
        CategoryEffectModel categoryEffects;
        C1C7U.LIZ("FTCAudioItemAdapter@d5bf.onClickAudioEffect$1$onSuccess$1");
        Effect effect = (Effect) aCallableS32S0301000_29.l0;
        if (effect != null) {
            C119K c119k = (C119K) aCallableS32S0301000_29.l1;
            int i = aCallableS32S0301000_29.i3;
            CategoryPageModel categoryPageModel = c119k.LLIZLLLIL;
            if (categoryPageModel != null && (categoryEffects = categoryPageModel.getCategoryEffects()) != null) {
                ArrayList arrayList = new ArrayList(categoryEffects.getEffects());
                ListProtector.set(arrayList, i - 1, effect);
                categoryEffects.setEffects(arrayList);
            }
        }
        ((C119K) aCallableS32S0301000_29.l1).LLLI(aCallableS32S0301000_29.i3, 1);
        ((C119K) aCallableS32S0301000_29.l1).LLLII(aCallableS32S0301000_29.i3);
        C119X c119x = ((C119K) aCallableS32S0301000_29.l1).LLJILJIL;
        if (c119x != null) {
            c119x.LLLIIIIL((Effect) aCallableS32S0301000_29.l2);
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("FTCAudioItemAdapter@d5bf.onClickAudioEffect$1$onSuccess$1");
        return unit;
    }

    public static final Object call$1(ACallableS32S0301000_29 aCallableS32S0301000_29) {
        Unit unit;
        CategoryEffectModel categoryEffects;
        C1C7U.LIZ("AudioItemAdapter@308.onClickAudioEffect$1$onSuccess$1");
        Effect effect = (Effect) aCallableS32S0301000_29.l0;
        if (effect != null) {
            C119J c119j = (C119J) aCallableS32S0301000_29.l1;
            int i = aCallableS32S0301000_29.i3;
            CategoryPageModel categoryPageModel = c119j.LLIZLLLIL;
            if (categoryPageModel != null && (categoryEffects = categoryPageModel.getCategoryEffects()) != null) {
                ArrayList arrayList = new ArrayList(categoryEffects.getEffects());
                ListProtector.set(arrayList, i - 1, effect);
                categoryEffects.setEffects(arrayList);
            }
        }
        ((C119J) aCallableS32S0301000_29.l1).LLLI(aCallableS32S0301000_29.i3, 1);
        ((C119J) aCallableS32S0301000_29.l1).LLLII(aCallableS32S0301000_29.i3);
        C119Y c119y = ((C119J) aCallableS32S0301000_29.l1).LLJILJIL;
        if (c119y != null) {
            c119y.LLLIIIIL((Effect) aCallableS32S0301000_29.l2);
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("AudioItemAdapter@308.onClickAudioEffect$1$onSuccess$1");
        return unit;
    }

    public ACallableS32S0301000_29(Object obj, Object obj2, int i, Object obj3, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.i3 = i;
        this.l2 = obj3;
    }
}
