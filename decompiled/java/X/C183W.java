package X;

import Y.AAListenerS278S0200000_32;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.183W, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C183W extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ C183V LL;
    public final /* synthetic */ C183Z LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C183W(C183V c183v, C183Z c183z) {
        super(1);
        this.LL = c183v;
        this.LLILLJJLI = c183z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) throws JSONException {
        C183V c183v = this.LL;
        C212210182u c212210182u = c183v.LLIZ;
        if (c212210182u != null) {
            Map<String, String> mapLJIIJ = c183v.LJIIJ();
            JSONObject jSONObjectLIZ = c212210182u.LIZ();
            Set<Map.Entry> setEntrySet = ((LinkedHashMap) mapLJIIJ).entrySet();
            if (setEntrySet != null) {
                for (Map.Entry entry : setEntrySet) {
                    jSONObjectLIZ.put((String) entry.getKey(), entry.getValue());
                }
            }
            C1507790pL7.LIZ.getClass();
            C1507790pL7.LIZLLL("livesdk_tiktokec_card_close", jSONObjectLIZ);
            c212210182u.LIZIZ("user_close", mapLJIIJ);
        }
        C183V c183v2 = this.LL;
        ViewGroup viewGroup = c183v2.LL;
        C183Z c183z = this.LLILLJJLI;
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(c183z, PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, c183z.getAlpha(), 0.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, c183z.getTranslationY(), c183z.getLayoutParams().height));
        objectAnimatorOfPropertyValuesHolder.setDuration(290L);
        c183v2.LLILZLL = objectAnimatorOfPropertyValuesHolder;
        objectAnimatorOfPropertyValuesHolder.addListener(new AAListenerS278S0200000_32(c183v2, viewGroup, 2));
        Animator animator = c183v2.LLILZLL;
        if (animator != null) {
            animator.start();
        }
        C183F c183f = c183v2.LLILLJJLI;
        if (c183f != null) {
            c183f.LIZIZ();
        }
        return Unit.LIZ;
    }
}
