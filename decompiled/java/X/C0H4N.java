package X;

import Y.ARunnableS106S0100000_6;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.List;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.0H4N, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H4N extends RecyclerView {
    public static final int LLILLJJLI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
    public final C01GW LL;

    private final C434900H3o getListAdapter() {
        return (C434900H3o) this.LL.getValue();
    }

    public final void LIZJ(C1750460veW c1750460veW) {
        setItemAnimator(null);
        setNestedScrollingEnabled(false);
        setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        addItemDecoration(new C0IDG(1));
        setAdapter(getListAdapter());
        getListAdapter().LLILLJJLI = c1750460veW;
    }

    public final void LIZLLL(List<Image> list) {
        Image image;
        C434900H3o listAdapter = getListAdapter();
        if (list != null) {
            image = (Image) C13LP.LJJJLL(list);
        } else {
            image = null;
        }
        listAdapter.getClass();
        if (image != null) {
            Integer width = image.getWidth();
            Integer height = image.getHeight();
            if (width != null && width.intValue() > 0 && height != null && height.intValue() > 0) {
                listAdapter.LLILLL = (C434910H3p.LLILLL * height.intValue()) / width.intValue();
            }
        }
        getListAdapter().LLLII(list, new ARunnableS106S0100000_6((Object) this, 50));
    }

    public C0H4N(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0H4N(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(42));
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
