package X;

import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0FWr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class ViewOnLongClickListenerC391510FWr implements View.OnLongClickListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.$t) {
            case 0:
                return onLongClick$0(this, view);
            case 1:
                return onLongClick$1(this, view);
            default:
                return false;
        }
    }

    public static final boolean onLongClick$0(ViewOnLongClickListenerC391510FWr viewOnLongClickListenerC391510FWr, View view) {
        MutableLiveData<Pair<EditorProAIGCMediaItemModel, Boolean>> longClickEvent = ((C380110EvJ) viewOnLongClickListenerC391510FWr.l0).LLILLJJLI.getLongClickEvent();
        if (longClickEvent != null) {
            longClickEvent.setValue(new Pair<>((EditorProAIGCMediaItemModel) viewOnLongClickListenerC391510FWr.l1, Boolean.TRUE));
            return true;
        }
        return true;
    }

    public static final boolean onLongClick$1(ViewOnLongClickListenerC391510FWr viewOnLongClickListenerC391510FWr, View view) {
        C0EDA c0eda = ((C361100EDs) viewOnLongClickListenerC391510FWr.l0).LLILZ;
        if (c0eda != null) {
            C0EDQ c0edq = (C0EDQ) viewOnLongClickListenerC391510FWr.l1;
            C0EDC c0edc = c0eda.LIZ.LLJI;
            if (c0edc != null) {
                c0edc.LIZJ(c0edq.LIZ);
                return true;
            }
            return true;
        }
        return true;
    }

    public ViewOnLongClickListenerC391510FWr(C380110EvJ c380110EvJ, EditorProAIGCMediaItemModel editorProAIGCMediaItemModel, int i) {
        this.$t = i;
        this.l0 = c380110EvJ;
        this.l1 = editorProAIGCMediaItemModel;
    }

    public ViewOnLongClickListenerC391510FWr(C361100EDs c361100EDs, C0EDQ c0edq, int i, int i2) {
        this.$t = i2;
        this.l0 = c361100EDs;
        this.l1 = c0edq;
    }
}
