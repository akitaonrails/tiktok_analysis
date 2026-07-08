package X;

import Y.AObserverS225S0100000_22;
import android.content.Context;
import android.util.AttributeSet;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.effectmanager.effect.model.CategoryInfo;
import java.util.List;

/* JADX INFO: renamed from: X.0nGD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1427870nGD extends RecyclerView {
    public MutableLiveData<AbstractC1427970nGN> LL;
    public final C1427840nGA LLILLJJLI;

    public final CategoryInfo getCurrentTab() {
        return this.LLILLJJLI.LLLFZ();
    }

    public final MutableLiveData<AbstractC1427970nGN> getEvent() {
        return this.LL;
    }

    public final void setData(List<CategoryInfo> list) {
        this.LLILLJJLI.setData(list);
    }

    public final void setEvent(MutableLiveData<AbstractC1427970nGN> mutableLiveData) {
        if (mutableLiveData != null) {
            mutableLiveData.observeForever(new AObserverS225S0100000_22(this, 27));
        }
        this.LL = mutableLiveData;
    }

    public C1427870nGD(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1427870nGD(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C1427840nGA c1427840nGA = new C1427840nGA(context, this);
        this.LLILLJJLI = c1427840nGA;
        setAdapter(c1427840nGA);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(0);
        setLayoutManager(linearLayoutManager);
        addItemDecoration(new C1466540oGa(1));
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
