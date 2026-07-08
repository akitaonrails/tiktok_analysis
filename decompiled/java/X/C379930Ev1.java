package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS619S0100000_5;

/* JADX INFO: renamed from: X.0Ev1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C379930Ev1 extends RecyclerView {
    public final C379920Ev0 LL;
    public List<C379910Euz> LLILLJJLI;
    public List<C379910Euz> LLILLL;
    public C0FN0 LLILZ;
    public Function1<? super EnumC379800Euo, Unit> LLILZIL;
    public final C01GW LLILZLL;

    private final C04JC getItemDecoration() {
        return (C04JC) this.LLILZLL.getValue();
    }

    public final Function1<EnumC379800Euo, Unit> getOnFunctionClickListener() {
        return this.LLILZIL;
    }

    public final void setData(List<C379910Euz> list) {
        this.LLILLJJLI = list;
        ArrayList arrayList = new ArrayList();
        for (C379910Euz c379910Euz : list) {
            if (!c379910Euz.LIZIZ) {
                arrayList.add(c379910Euz);
            }
        }
        C379920Ev0 c379920Ev0 = this.LL;
        ((ArrayList) c379920Ev0.LL).clear();
        ((ArrayList) c379920Ev0.LL).addAll(arrayList);
        c379920Ev0.notifyDataSetChanged();
    }

    public final void setOnFunctionClickListener(Function1<? super EnumC379800Euo, Unit> function1) {
        this.LLILZIL = function1;
    }

    public C379930Ev1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C379930Ev1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C379920Ev0 c379920Ev0 = new C379920Ev0();
        this.LL = c379920Ev0;
        this.LLILLJJLI = new ArrayList();
        this.LLILLL = C13BV.INSTANCE;
        this.LLILZLL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(81));
        setLayoutManager(new LinearLayoutManager(context, 0, false));
        setAdapter(c379920Ev0);
        setItemAnimator(null);
        addItemDecoration(getItemDecoration());
        c379920Ev0.LLILLJJLI = new AwS619S0100000_5(this, 8);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
