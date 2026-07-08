package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.botpage.components.botmarket.TakoBotMarketHubAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0IDT, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0IDT implements View.OnLongClickListener {
    public final int $t;
    public Object l0;

    public static final /* synthetic */ boolean onLongClick$0(C0IDT c0idt, View view) {
        return ((Boolean) ((Function1) c0idt.l0).invoke(view)).booleanValue();
    }

    public static final /* synthetic */ boolean onLongClick$1(C0IDT c0idt, View view) {
        return ((Boolean) ((Function1) c0idt.l0).invoke(view)).booleanValue();
    }

    @Override // android.view.View.OnLongClickListener
    public final /* synthetic */ boolean onLongClick(View view) {
        switch (this.$t) {
            case 0:
                return onLongClick$0(this, view);
            case 1:
                return onLongClick$1(this, view);
            case 2:
                return onLongClick$2(this, view);
            case 3:
                return onLongClick$3(this, view);
            default:
                return false;
        }
    }

    public C0IDT(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onLongClick$2(C0IDT c0idt, View view) {
        C435280H5a c435280H5a = (C435280H5a) c0idt.l0;
        Function1<C435280H5a, Unit> function1 = c435280H5a.LLJI;
        if (function1 != null) {
            function1.invoke(c435280H5a);
            return true;
        }
        return true;
    }

    public static final boolean onLongClick$3(C0IDT c0idt, View view) {
        ViewGroup viewGroupY4;
        TakoCardAbility takoCardAbility = (TakoCardAbility) ((TakoBotMarketHubAssem) c0idt.l0).LLJL.getValue();
        if (takoCardAbility != null && (viewGroupY4 = takoCardAbility.Y4()) != null) {
            viewGroupY4.performLongClick();
            return true;
        }
        return true;
    }
}
