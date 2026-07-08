package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.ArrayMap;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.im.ui.recyclerview.ChatLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0ZiP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C907190ZiP extends C907200ZiQ {
    public boolean LLILZ;
    public Function0<Unit> LLILZIL;

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        List<RecyclerView.ViewHolder> listLJIILL;
        ChatLinearLayoutManager chatLinearLayoutManager;
        if (C13LZ.LJIIJ(AbstractC19994813Le.Default, new IntRange(1, 10000)) == 10) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            super.draw(canvas);
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            C0I0B.LJFF.LIZIZ();
            RecyclerView.LayoutManager layoutManager = getLayoutManager();
            if (!(layoutManager instanceof ChatLinearLayoutManager) || (chatLinearLayoutManager = (ChatLinearLayoutManager) layoutManager) == null || (listLJIILL = chatLinearLayoutManager.LJIILL(this)) == null) {
                listLJIILL = C13BV.INSTANCE;
            }
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put("duration", String.valueOf(jCurrentTimeMillis2));
            ArrayList arrayList = new ArrayList();
            for (RecyclerView.ViewHolder viewHolder : listLJIILL) {
                if (viewHolder.itemView.getVisibility() == 0) {
                    arrayList.add(viewHolder);
                }
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((RecyclerView.ViewHolder) it2.next()).itemView);
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                Object tag = ((View) it3.next()).getTag(R.id.k_t);
                if ((tag instanceof Integer) && tag != null) {
                    arrayList3.add(tag);
                }
            }
            arrayMap.put("message_type", C13LP.LJJLIIIJ(arrayList3, ",", ",", ",", 0, null, null, 56));
            ArrayList arrayList4 = new ArrayList();
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                Object tag2 = ((View) it4.next()).getTag(R.id.k_u);
                if ((tag2 instanceof String) && tag2 != null) {
                    arrayList4.add(tag2);
                }
            }
            arrayMap.put(Scene.SCENE_SERVICE, C13LP.LJJLIIIJ(arrayList4, ",", ",", ",", 0, null, null, 56));
            C20684815ws.LJIILLIIL("im_messagelist_draw_breakdown", arrayMap);
            return;
        }
        super.draw(canvas);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (this.LLILZ) {
            return true;
        }
        return zOnInterceptTouchEvent;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        if (this.LLILZ) {
            return;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setInteractionBlocked(boolean z) {
        if (this.LLILZ == z) {
            return;
        }
        this.LLILZ = z;
        if (z) {
            cancelPendingInputEvents();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
        LinearLayoutManager linearLayoutManager;
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            linearLayoutManager.setReverseLayout(true);
            super.setLayoutManager(layoutManager);
        }
    }

    public C907190ZiP(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C907190ZiP(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }

    @Override // X.ViewOnAttachStateChangeListenerC20604515jv, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Function0<Unit> function0 = this.LLILZIL;
        this.LLILZIL = null;
        if (function0 != null) {
            function0.invoke();
        }
        super.onLayout(z, i, i2, i3, i4);
    }
}
