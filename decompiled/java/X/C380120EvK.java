package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0EvK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C380120EvK extends RecyclerView {
    public MutableLiveData<C379670Eub> LL;
    public MutableLiveData<Pair<EditorProAIGCMediaItemModel, Boolean>> LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public C0DXR LLILZIL;

    private final C380110EvJ getAdapter() {
        return (C380110EvJ) this.LLILLL.getValue();
    }

    private final GridLayoutManager getManagerV2() {
        return (GridLayoutManager) this.LLILZ.getValue();
    }

    public final void LJII() {
        if (getAdapter().LLILZLL == null) {
            return;
        }
        C380110EvJ adapter = getAdapter();
        Integer num = adapter.LLILZLL;
        adapter.LLILZLL = null;
        adapter.notifyItemChanged(num != null ? num.intValue() : -1, 101);
    }

    public final MutableLiveData<C379670Eub> getEvent() {
        return this.LL;
    }

    public final MutableLiveData<Pair<EditorProAIGCMediaItemModel, Boolean>> getLongClickEvent() {
        return this.LLILLJJLI;
    }

    public final void LIZJ(int i) {
        getAdapter().LLLFZ(i);
    }

    public final C07YH LIZLLL(int i) {
        GridLayoutManager gridLayoutManager;
        boolean z;
        int itemCount = getAdapter().getItemCount();
        boolean z2 = true;
        if (i != -1 && itemCount > 0) {
            RecyclerView.LayoutManager layoutManager = getLayoutManager();
            if ((layoutManager instanceof GridLayoutManager) && (gridLayoutManager = (GridLayoutManager) layoutManager) != null) {
                if (gridLayoutManager.getOrientation() != 1) {
                    return new C07YH(1, true, true);
                }
                int i2 = gridLayoutManager.LLILLJJLI;
                if (i2 < 1) {
                    i2 = 1;
                }
                int i3 = i / i2;
                int i4 = ((itemCount + i2) - 1) / i2;
                if (i3 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (i3 != i4 - 1) {
                    z2 = false;
                }
                return new C07YH(i4, z, z2);
            }
            return new C07YH(1, true, true);
        }
        return new C07YH(1, true, true);
    }

    public final void setEvent(MutableLiveData<C379670Eub> mutableLiveData) {
        this.LL = mutableLiveData;
    }

    public final void setLongClickEvent(MutableLiveData<Pair<EditorProAIGCMediaItemModel, Boolean>> mutableLiveData) {
        this.LLILLJJLI = mutableLiveData;
    }

    public C380120EvK(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void LJFF(EnumC378720Et4 enumC378720Et4, List list) {
        String str;
        AIGCGenerationParam aIGCGenerationParam;
        getAdapter().LLILZIL = enumC378720Et4;
        C380110EvJ adapter = getAdapter();
        adapter.LLILLL = list;
        EditorProAIGCMediaItemModel editorProAIGCMediaItemModel = (EditorProAIGCMediaItemModel) C13LP.LJJLIIIJL(list);
        if (editorProAIGCMediaItemModel == null || (aIGCGenerationParam = editorProAIGCMediaItemModel.param) == null || (str = aIGCGenerationParam.aspectRatio) == null) {
            str = "";
        }
        adapter.LLILZ = str;
        adapter.notifyDataSetChanged();
        if (enumC378720Et4 == EnumC378720Et4.TEXT_TO_IMAGE_RESULT) {
            setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
            getLayoutParams().height = getAdapter().LLLI().getHeight();
            requestLayout();
            C0DXR c0dxr = this.LLILZIL;
            if (c0dxr != null) {
                removeItemDecoration(c0dxr);
            }
            final int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            C0DXR c0dxr2 = new C0DXR(iLIZIZ) { // from class: X.0EvM
                public final int LL = 2;
                public final int LLILLJJLI;

                {
                    this.LLILLJJLI = iLIZIZ;
                }

                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                    int i;
                    int i2;
                    int i3;
                    int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                    if (childAdapterPosition != -1 && (i = this.LL) > 0) {
                        int i4 = childAdapterPosition % i;
                        int i5 = childAdapterPosition / i;
                        if (i4 == 0) {
                            i2 = 0;
                        } else {
                            i2 = this.LLILLJJLI;
                        }
                        rect.left = i2;
                        if (i5 == 0) {
                            i3 = 0;
                        } else {
                            i3 = this.LLILLJJLI;
                        }
                        rect.top = i3;
                        rect.right = 0;
                        rect.bottom = 0;
                        return;
                    }
                    rect.set(0, 0, 0, 0);
                }
            };
            addItemDecoration(c0dxr2);
            this.LLILZIL = c0dxr2;
            return;
        }
        setLayoutManager(getManagerV2());
        getManagerV2().LJIJ(3);
        int size = ((list.size() + 3) - 1) / 3;
        getLayoutParams().height = (getAdapter().LLLI().getHeight() * size) + ((size - 1) * C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        requestLayout();
        C0DXR c0dxr3 = this.LLILZIL;
        if (c0dxr3 != null) {
            removeItemDecoration(c0dxr3);
        }
        C345780Dh2 c345780Dh2 = new C345780Dh2(3, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), false);
        addItemDecoration(c345780Dh2);
        this.LLILZIL = c345780Dh2;
    }

    public C380120EvK(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILLL = C452501pT.LIZIZ(new AwS406S0200000_5(context, this, 31));
        this.LLILZ = C452501pT.LIZIZ(new AwS549S0100000_5(context, 197));
        setAdapter(getAdapter());
        setLayoutManager(getManagerV2());
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }

    public final void LJ(int i, int i2, boolean z) {
        getAdapter().LLLIIIIL(z, i, i2, false, false);
    }
}
