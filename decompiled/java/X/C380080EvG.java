package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0EvG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C380080EvG extends RecyclerView {
    public MutableLiveData<Pair<EditorProAIGCMediaItemModel, Boolean>> LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;

    private final C380070EvF getAdapter() {
        return (C380070EvF) this.LLILLJJLI.getValue();
    }

    private final C04JC getItemDecoration() {
        return (C04JC) this.LLILZ.getValue();
    }

    private final WrapGridLayoutManager getManager() {
        return (WrapGridLayoutManager) this.LLILLL.getValue();
    }

    public final void LIZJ() {
        String str;
        AIGCGenerationParam aIGCGenerationParam;
        getAdapter().getClass();
        getAdapter().LLILZLL = null;
        C380070EvF adapter = getAdapter();
        C13BV c13bv = C13BV.INSTANCE;
        adapter.LLILLL = c13bv;
        EditorProAIGCMediaItemModel editorProAIGCMediaItemModel = (EditorProAIGCMediaItemModel) C13LP.LJJLIIIJL(c13bv);
        if (editorProAIGCMediaItemModel == null || (aIGCGenerationParam = editorProAIGCMediaItemModel.param) == null || (str = aIGCGenerationParam.aspectRatio) == null) {
            str = "";
        }
        adapter.LLILZ = str;
        adapter.notifyDataSetChanged();
    }

    public final MutableLiveData<Pair<EditorProAIGCMediaItemModel, Boolean>> getEvent() {
        return this.LL;
    }

    public final void setData(List<EditorProAIGCMediaItemModel> list) {
        String str;
        AIGCGenerationParam aIGCGenerationParam;
        C380070EvF adapter = getAdapter();
        adapter.LLILLL = list;
        EditorProAIGCMediaItemModel editorProAIGCMediaItemModel = (EditorProAIGCMediaItemModel) C13LP.LJJLIIIJL(list);
        if (editorProAIGCMediaItemModel == null || (aIGCGenerationParam = editorProAIGCMediaItemModel.param) == null || (str = aIGCGenerationParam.aspectRatio) == null) {
            str = "";
        }
        adapter.LLILZ = str;
        adapter.notifyDataSetChanged();
    }

    public final void setEvent(MutableLiveData<Pair<EditorProAIGCMediaItemModel, Boolean>> mutableLiveData) {
        this.LL = mutableLiveData;
    }

    public final void setPanelType(EnumC378720Et4 enumC378720Et4) {
        C380070EvF adapter = getAdapter();
        adapter.LLILZIL = enumC378720Et4;
        adapter.notifyDataSetChanged();
    }

    public C380080EvG(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void LIZLLL(int i, boolean z) {
        getAdapter().LLLFZ(i, false);
    }

    public C380080EvG(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS406S0200000_5(context, this, 40));
        this.LLILLL = C452501pT.LIZIZ(new AwS549S0100000_5(context, 322));
        this.LLILZ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(104));
        setAdapter(getAdapter());
        setLayoutManager(getManager());
        addItemDecoration(getItemDecoration());
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
