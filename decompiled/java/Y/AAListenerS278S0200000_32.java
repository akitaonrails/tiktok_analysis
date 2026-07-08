package Y;

import X.AnonymousClass0956;
import X.AnonymousClass1830;
import X.AnonymousClass1871;
import X.AnonymousClass1872;
import X.C1507790pL7;
import X.C1567410qtH;
import X.C183F;
import X.C183V;
import X.C212203182n;
import X.C212208182s;
import X.C212310186q;
import X.C212381189j;
import X.C23250099c;
import X.C786410Ut5;
import X.EnumC1779100wOi;
import X.EnumC994480bzC;
import android.animation.Animator;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS223S0000000_32;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public class AAListenerS278S0200000_32 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onAnimationCancel$0(AAListenerS278S0200000_32 aAListenerS278S0200000_32, Animator animator) {
    }

    public static final void onAnimationCancel$1(AAListenerS278S0200000_32 aAListenerS278S0200000_32, Animator animator) {
    }

    public static final void onAnimationCancel$3(AAListenerS278S0200000_32 aAListenerS278S0200000_32, Animator animator) {
    }

    public static final void onAnimationCancel$4(AAListenerS278S0200000_32 aAListenerS278S0200000_32, Animator animator) {
    }

    public static final void onAnimationRepeat$0(AAListenerS278S0200000_32 aAListenerS278S0200000_32, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS278S0200000_32 aAListenerS278S0200000_32, Animator animator) {
    }

    public static final void onAnimationRepeat$2(AAListenerS278S0200000_32 aAListenerS278S0200000_32, Animator animator) {
    }

    public static final void onAnimationRepeat$3(AAListenerS278S0200000_32 aAListenerS278S0200000_32, Animator animator) {
    }

    public static final void onAnimationRepeat$4(AAListenerS278S0200000_32 aAListenerS278S0200000_32, Animator animator) {
    }

    public static final void onAnimationRepeat$5(AAListenerS278S0200000_32 aAListenerS278S0200000_32, Animator animator) {
    }

    public static final void onAnimationStart$1(AAListenerS278S0200000_32 aAListenerS278S0200000_32, Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationCancel$0(this, animator);
                break;
            case 1:
                onAnimationCancel$1(this, animator);
                break;
            case 2:
                onAnimationCancel$2(this, animator);
                break;
            case 3:
                onAnimationCancel$3(this, animator);
                break;
            case 4:
                onAnimationCancel$4(this, animator);
                break;
            case 5:
                onAnimationCancel$5(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) throws JSONException {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                break;
            case 1:
                onAnimationEnd$1(this, animator);
                break;
            case 2:
                onAnimationEnd$2(this, animator);
                break;
            case 3:
                onAnimationEnd$3(this, animator);
                break;
            case 4:
                onAnimationEnd$4(this, animator);
                break;
            case 5:
                onAnimationEnd$5(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationRepeat$0(this, animator);
                break;
            case 1:
                onAnimationRepeat$1(this, animator);
                break;
            case 2:
                onAnimationRepeat$2(this, animator);
                break;
            case 3:
                onAnimationRepeat$3(this, animator);
                break;
            case 4:
                onAnimationRepeat$4(this, animator);
                break;
            case 5:
                onAnimationRepeat$5(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                break;
            case 1:
                onAnimationStart$1(this, animator);
                break;
            case 2:
                onAnimationStart$2(this, animator);
                break;
            case 3:
                onAnimationStart$3(this, animator);
                break;
            case 4:
                onAnimationStart$4(this, animator);
                break;
            case 5:
                onAnimationStart$5(this, animator);
                break;
        }
    }

    public static final void onAnimationCancel$2(AAListenerS278S0200000_32 aAListenerS278S0200000_32, Animator animator) {
        C183V c183v = (C183V) aAListenerS278S0200000_32.l0;
        c183v.LLILLL = EnumC994480bzC.HIDE;
        ViewGroup viewGroup = c183v.LL;
        if (viewGroup != null) {
            C786410Ut5.LJJJJI(viewGroup);
        }
        ((C183V) aAListenerS278S0200000_32.l0).LLILZLL = null;
    }

    public static final void onAnimationCancel$5(AAListenerS278S0200000_32 aAListenerS278S0200000_32, Animator animator) {
        C212310186q c212310186q = ((AnonymousClass1871) aAListenerS278S0200000_32.l0).LJ;
        if (c212310186q != null) {
            c212310186q.LIZ((AnonymousClass1872) aAListenerS278S0200000_32.l1);
        }
        ((AnonymousClass1871) aAListenerS278S0200000_32.l0).LJIIL();
    }

    public static final void onAnimationEnd$0(AAListenerS278S0200000_32 aAListenerS278S0200000_32, Animator animator) throws JSONException {
        Set<Map.Entry<String, String>> setEntrySet;
        C212203182n c212203182n = (C212203182n) aAListenerS278S0200000_32.l0;
        c212203182n.LLILZLL = 3;
        C183F c183f = c212203182n.LLIZ;
        if (c183f != null) {
            c183f.onShow();
        }
        C212208182s c212208182s = ((C212203182n) aAListenerS278S0200000_32.l0).LLJIJIL;
        if (c212208182s != null) {
            Map<String, String> mapH0 = ((AnonymousClass1830) aAListenerS278S0200000_32.l1).h0(null);
            int i = ((C212203182n) aAListenerS278S0200000_32.l0).LLJJIJIL;
            JSONObject jSONObjectLIZ = c212208182s.LIZ();
            if (mapH0 != null && (setEntrySet = mapH0.entrySet()) != null) {
                Iterator<T> it2 = setEntrySet.iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    jSONObjectLIZ.put((String) entry.getKey(), entry.getValue());
                }
            }
            c212208182s.LJIIIIZZ = System.currentTimeMillis();
            C1507790pL7.LIZ.getClass();
            C1507790pL7.LIZLLL("livesdk_tiktokec_card_show", jSONObjectLIZ);
            if (i == 1) {
                C1507790pL7.LIZLLL("livesdk_tiktokec_product_show", jSONObjectLIZ);
                C1507790pL7.LIZLLL("tiktokec_product_entrance_show", jSONObjectLIZ);
                if (mapH0 != null && mapH0.get("task_id") != null) {
                    jSONObjectLIZ.put("page_name", "live_preview_page");
                    jSONObjectLIZ.put("page_type", "module");
                    jSONObjectLIZ.put("module_name", "mission_card");
                    C1507790pL7.LIZLLL("page_show", jSONObjectLIZ);
                    C1507790pL7.LIZLLL("tiktokec_live_preview_seller_mission_card_show", jSONObjectLIZ);
                    return;
                }
                return;
            }
            if (i != 2) {
                return;
            }
            C1507790pL7.LIZLLL("livesdk_tiktokec_coupon_show", jSONObjectLIZ);
        }
    }

    public static final void onAnimationEnd$1(AAListenerS278S0200000_32 aAListenerS278S0200000_32, Animator animator) {
        C212381189j c212381189j = (C212381189j) aAListenerS278S0200000_32.l0;
        AFwS223S0000000_32 aFwS223S0000000_32 = AFwS223S0000000_32.get$arr$(162);
        c212381189j.getClass();
        C212381189j.LIZJ(aFwS223S0000000_32);
        ((Function0) aAListenerS278S0200000_32.l1).invoke();
    }

    public static final void onAnimationEnd$2(AAListenerS278S0200000_32 aAListenerS278S0200000_32, Animator animator) {
        ((C183V) aAListenerS278S0200000_32.l0).LLILLL = EnumC994480bzC.HIDE;
        ViewGroup viewGroup = (ViewGroup) aAListenerS278S0200000_32.l1;
        if (viewGroup != null) {
            C786410Ut5.LJJJJI(viewGroup);
        }
        C183F c183f = ((C183V) aAListenerS278S0200000_32.l0).LLILLJJLI;
        if (c183f != null) {
            c183f.onDismiss();
        }
        ((C183V) aAListenerS278S0200000_32.l0).LJIIJJI(EnumC1779100wOi.DISMISS);
    }

    public static final void onAnimationEnd$3(AAListenerS278S0200000_32 aAListenerS278S0200000_32, Animator animator) {
        ((Function0) aAListenerS278S0200000_32.l1).invoke();
    }

    public static final void onAnimationEnd$4(AAListenerS278S0200000_32 aAListenerS278S0200000_32, Animator animator) {
        ((Function0) aAListenerS278S0200000_32.l1).invoke();
    }

    public static final void onAnimationEnd$5(AAListenerS278S0200000_32 aAListenerS278S0200000_32, Animator animator) {
        C212310186q c212310186q = ((AnonymousClass1871) aAListenerS278S0200000_32.l0).LJ;
        if (c212310186q != null) {
            c212310186q.LIZ((AnonymousClass1872) aAListenerS278S0200000_32.l1);
        }
        ((AnonymousClass1871) aAListenerS278S0200000_32.l0).LJIIL();
    }

    public static final void onAnimationStart$0(AAListenerS278S0200000_32 aAListenerS278S0200000_32, Animator animator) {
        C212203182n c212203182n = (C212203182n) aAListenerS278S0200000_32.l0;
        c212203182n.LLILZLL = 2;
        c212203182n.LLJJI = true;
        if (c212203182n.LLJJ && !c212203182n.LLJJIII) {
            c212203182n.LJIILL();
        }
        AnonymousClass0956 anonymousClass0956 = c212203182n.LLJJIJI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        c212203182n.LLJJIJI = C23250099c.LIZLLL(c212203182n.LLJJIJIIJIL, null, null, new C1567410qtH(c212203182n.LLJILLL, c212203182n, null), 3);
    }

    public static final void onAnimationStart$2(AAListenerS278S0200000_32 aAListenerS278S0200000_32, Animator animator) {
        ((C183V) aAListenerS278S0200000_32.l0).LLILLL = EnumC994480bzC.HIDE_ANIM;
    }

    public static final void onAnimationStart$3(AAListenerS278S0200000_32 aAListenerS278S0200000_32, Animator animator) {
        ((Function0) aAListenerS278S0200000_32.l0).invoke();
    }

    public static final void onAnimationStart$4(AAListenerS278S0200000_32 aAListenerS278S0200000_32, Animator animator) {
        ((Function0) aAListenerS278S0200000_32.l0).invoke();
    }

    public static final void onAnimationStart$5(AAListenerS278S0200000_32 aAListenerS278S0200000_32, Animator animator) {
        ((AnonymousClass1871) aAListenerS278S0200000_32.l0).LJIIL();
    }

    public AAListenerS278S0200000_32(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
