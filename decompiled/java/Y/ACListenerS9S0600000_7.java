package Y;

import X.C20744016Fi;
import X.C20744116Fj;
import X.C475060Ik4;
import X.C475070Ik5;
import X.C475080Ik6;
import X.C786410Ut5;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.livesdkapi.depend.model.live.debug.Answer;
import com.bytedance.android.livesdkapi.depend.model.live.debug.CascadeAnswer;
import com.bytedance.android.livesdkapi.depend.model.live.debug.Question;
import java.util.HashSet;

/* JADX INFO: loaded from: classes8.dex */
public class ACListenerS9S0600000_7 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS9S0600000_7 aCListenerS9S0600000_7, View view) {
        HashSet<String> hashSet;
        ((C20744116Fj) aCListenerS9S0600000_7.l0).setChecked(!((C20744116Fj) aCListenerS9S0600000_7.l0).isChecked());
        if (((CascadeAnswer) aCListenerS9S0600000_7.l1).hasSub) {
            if (((C20744116Fj) aCListenerS9S0600000_7.l0).isChecked()) {
                C786410Ut5.LJZL(0, (LinearLayout) aCListenerS9S0600000_7.l2);
                return;
            }
            C786410Ut5.LJZL(8, (LinearLayout) aCListenerS9S0600000_7.l2);
            for (CascadeAnswer cascadeAnswer : ((CascadeAnswer) aCListenerS9S0600000_7.l1).subValue) {
                Answer answer = ((C475060Ik4) aCListenerS9S0600000_7.l3).LLILZ.get(Long.valueOf(((Question) aCListenerS9S0600000_7.l4).questionId));
                if (answer != null && (hashSet = answer.answers) != null) {
                    hashSet.remove(cascadeAnswer.value);
                }
            }
            ((C475060Ik4) aCListenerS9S0600000_7.l3).LLLI();
            return;
        }
        ((C475070Ik5) aCListenerS9S0600000_7.l5).L5(((Question) aCListenerS9S0600000_7.l4).questionId, ((CascadeAnswer) view.getTag()).value, ((C20744116Fj) aCListenerS9S0600000_7.l0).isChecked());
    }

    public static final void onClick$1(ACListenerS9S0600000_7 aCListenerS9S0600000_7, View view) {
        HashSet<String> hashSet;
        ((C20744016Fi) aCListenerS9S0600000_7.l0).setChecked(!((C20744016Fi) aCListenerS9S0600000_7.l0).isChecked());
        if (((CascadeAnswer) aCListenerS9S0600000_7.l1).hasSub) {
            if (((C20744016Fi) aCListenerS9S0600000_7.l0).isChecked()) {
                C786410Ut5.LJZL(0, (LinearLayout) aCListenerS9S0600000_7.l2);
            } else {
                C786410Ut5.LJZL(8, (LinearLayout) aCListenerS9S0600000_7.l2);
                Answer answer = ((C475060Ik4) aCListenerS9S0600000_7.l3).LLILZ.get(Long.valueOf(((Question) aCListenerS9S0600000_7.l4).questionId));
                if (answer != null && (hashSet = answer.answers) != null) {
                    hashSet.clear();
                }
            }
        } else {
            ((C475080Ik6) aCListenerS9S0600000_7.l5).L5(((Question) aCListenerS9S0600000_7.l4).questionId, ((CascadeAnswer) view.getTag()).value);
        }
        ((C475060Ik4) aCListenerS9S0600000_7.l3).LLLI();
    }

    public ACListenerS9S0600000_7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
        this.l4 = obj5;
        this.l5 = obj6;
    }
}
