package X;

import Y.AObserverS225S0100000_22;
import android.content.Context;
import android.util.AttributeSet;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.creative.model.edit.PhotoTemplateAsset;
import java.util.List;

/* JADX INFO: renamed from: X.0nGL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1427950nGL extends RecyclerView {
    public MutableLiveData<AbstractC1427970nGN> LL;
    public final C1427900nGG LLILLJJLI;

    public final MutableLiveData<AbstractC1427970nGN> getEvent() {
        return this.LL;
    }

    public final void setData(List<PhotoTemplateAsset> list) {
        C1427900nGG c1427900nGG = this.LLILLJJLI;
        c1427900nGG.LLILZ = list;
        c1427900nGG.notifyDataSetChanged();
    }

    public final void setEvent(MutableLiveData<AbstractC1427970nGN> mutableLiveData) {
        if (mutableLiveData != null) {
            mutableLiveData.observeForever(new AObserverS225S0100000_22(this, 26));
        }
        this.LL = mutableLiveData;
    }

    public C1427950nGL(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1427950nGL(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C1427900nGG c1427900nGG = new C1427900nGG(context, this);
        this.LLILLJJLI = c1427900nGG;
        setAdapter(c1427900nGG);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(0);
        setLayoutManager(linearLayoutManager);
        addItemDecoration(new C1466540oGa(0));
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
