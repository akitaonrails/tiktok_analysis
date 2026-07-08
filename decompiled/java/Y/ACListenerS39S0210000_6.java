package Y;

import X.C0P0T;
import X.C1341150l0L;
import X.C1350920lG6;
import X.C450530Hlb;
import X.C451030HmP;
import X.C454140HrQ;
import X.EnumC450450HlT;
import X.EnumC454360Hrm;
import android.view.View;
import com.ss.android.ugc.aweme.comment.model.CommentStickerStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public class ACListenerS39S0210000_6 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS39S0210000_6 aCListenerS39S0210000_6, View view) {
        C0P0T c0p0t;
        C0P0T c0p0t2 = ((C1341150l0L) aCListenerS39S0210000_6.l0).LJJ;
        if (c0p0t2 != null && c0p0t2.isShowing() && (c0p0t = ((C1341150l0L) aCListenerS39S0210000_6.l0).LJJ) != null) {
            c0p0t.dismiss();
        }
        C1350920lG6.LJJI(Boolean.valueOf(aCListenerS39S0210000_6.z2), ((C1341150l0L) aCListenerS39S0210000_6.l0).LJIIIZ, ((C1341150l0L) aCListenerS39S0210000_6.l0).LIZJ());
        C1341150l0L c1341150l0L = (C1341150l0L) aCListenerS39S0210000_6.l0;
        C454140HrQ.LIZ(view, (CommentStickerStruct) aCListenerS39S0210000_6.l1, aCListenerS39S0210000_6.z2, c1341150l0L.LJIIIZ, c1341150l0L.LIZJ(), EnumC454360Hrm.MULTI_GENRE_QUICK_MENU.getValue());
    }

    public static final void onClick$1(ACListenerS39S0210000_6 aCListenerS39S0210000_6, View view) {
        EnumC450450HlT enumC450450HlT;
        C450530Hlb c450530Hlb = (C450530Hlb) aCListenerS39S0210000_6.l0;
        boolean z = aCListenerS39S0210000_6.z2;
        C451030HmP c451030HmP = (C451030HmP) aCListenerS39S0210000_6.l1;
        Function2<C451030HmP, EnumC450450HlT, Unit> function2 = c450530Hlb.LJIJ;
        if (function2 != null) {
            if (z) {
                enumC450450HlT = EnumC450450HlT.ADD;
            } else {
                enumC450450HlT = EnumC450450HlT.REMOVE;
            }
            function2.invoke(c451030HmP, enumC450450HlT);
        }
        c450530Hlb.LJIIJ();
    }

    public static final void onClick$2(ACListenerS39S0210000_6 aCListenerS39S0210000_6, View view) {
        EnumC450450HlT enumC450450HlT;
        C450530Hlb c450530Hlb = (C450530Hlb) aCListenerS39S0210000_6.l0;
        boolean z = aCListenerS39S0210000_6.z2;
        C451030HmP c451030HmP = (C451030HmP) aCListenerS39S0210000_6.l1;
        Function2<C451030HmP, EnumC450450HlT, Unit> function2 = c450530Hlb.LJIJ;
        if (function2 != null) {
            if (z) {
                enumC450450HlT = EnumC450450HlT.ADD;
            } else {
                enumC450450HlT = EnumC450450HlT.REMOVE;
            }
            function2.invoke(c451030HmP, enumC450450HlT);
        }
        c450530Hlb.LJIIJ();
    }

    public ACListenerS39S0210000_6(Object obj, boolean z, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z2 = z;
        this.l1 = obj2;
    }
}
