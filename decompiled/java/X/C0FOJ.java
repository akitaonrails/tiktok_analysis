package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0FOJ, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FOJ extends RecyclerView {
    public MutableLiveData<Set<String>> LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;

    private final C0FOI getAdapter() {
        return (C0FOI) this.LLILLJJLI.getValue();
    }

    private final LinearLayoutManager getManager() {
        return (LinearLayoutManager) this.LLILLL.getValue();
    }

    public final void LIZJ() {
        C0FOI adapter = getAdapter();
        adapter.LLILLL = C13BV.INSTANCE;
        adapter.notifyDataSetChanged();
    }

    public final MutableLiveData<Set<String>> getEvent() {
        return this.LL;
    }

    public final void setData(List<? extends C0FC7> list) {
        C0FOI adapter = getAdapter();
        adapter.LLILLL = list;
        adapter.notifyDataSetChanged();
    }

    public final void setEvent(MutableLiveData<Set<String>> mutableLiveData) {
        this.LL = mutableLiveData;
    }

    public C0FOJ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0FOJ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS406S0200000_5(context, this, 39));
        this.LLILLL = C452501pT.LIZIZ(new AwS549S0100000_5(context, 308));
        setAdapter(getAdapter());
        setLayoutManager(getManager());
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
