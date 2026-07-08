package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiHangoutLiveCardOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiTopLivePendingAvatarTaskCountSetting;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: renamed from: X.15CF, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15CF extends FrameLayout {
    public final C01GW LL;
    public Function0<Unit> LLILLJJLI;
    public boolean LLILLL;
    public final C13E8<Function0<Unit>> LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;

    private final C15CE getAdapter() {
        return (C15CE) this.LL.getValue();
    }

    private final float getSpacing() {
        return MultiHangoutLiveCardOptimizeSetting.INSTANCE.isEnable() ? 6.0f : 8.0f;
    }

    public final void LIZ() {
        this.LLILZ.clear();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LIZ();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(false);
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(false);
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        LIZ();
    }

    public final void setAvatars(List<? extends ImageModel> list) {
        C15CE adapter = getAdapter();
        adapter.getClass();
        if (MultiHangoutLiveCardOptimizeSetting.INSTANCE.isEnable()) {
            adapter.LLILZLL = list.size();
            int size = list.size();
            int i = adapter.LLIZ.LLILZLL;
            if (size > i) {
                adapter.LLILZIL = true;
                list = C13LP.LL(list, Math.max(i, 1));
            } else {
                adapter.LLILZIL = false;
                list = C13LP.LL(list, Math.max(i, 1));
            }
        }
        adapter.LL = list;
        adapter.notifyDataSetChanged();
    }

    public final void setOnAddClickListener(Function0<Unit> function0) {
        getAdapter().LLILLJJLI = new AwS575S0100000_31(function0, (Function0<Unit>) 692);
    }

    public final void setOnAvatarClickListener(Function0<Unit> function0) {
        getAdapter().LLILLL = new AwS575S0100000_31(function0, (Function0<Unit>) 693);
    }

    public final void setOnViewClickListener(Function0<Unit> function0) {
        this.LLILLJJLI = function0;
    }

    public final void setScrollState(boolean z) {
        if (this.LLILLL != z) {
            this.LLILLL = z;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Scroll state changed: isScrolling=");
            sbLIZ.append(this.LLILLL);
            C20441214yg.LIZIZ("AvatarListView", C2188811AlT.LIZIZ(sbLIZ));
            getAdapter().LLILZ = z;
            if (!this.LLILLL) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Processing ");
                sbLIZ2.append(this.LLILZ.size());
                sbLIZ2.append(" pending avatar loads");
                C20441214yg.LIZIZ("AvatarListView", C2188811AlT.LIZIZ(sbLIZ2));
                while (!this.LLILZ.isEmpty()) {
                    this.LLILZ.removeFirst().invoke();
                }
            }
        }
    }

    public C15CF(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        RecyclerView recyclerView = new RecyclerView(context);
        this.LL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 694));
        this.LLILZ = new C13E8<>();
        this.LLILZIL = MultiTopLivePendingAvatarTaskCountSetting.getValue();
        this.LLILZLL = (int) ((C497740JfY.LJIIZILJ() - ((int) C497740JfY.LIZIZ(58.0f))) / ((int) C497740JfY.LIZIZ(42.0f)));
        if (MultiHangoutLiveCardOptimizeSetting.INSTANCE.isEnable()) {
            recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        } else {
            recyclerView.setLayoutManager(new GridLayoutManager(context) { // from class: com.ss.android.ugc.aweme.hangout.common.view.MultiTopLiveAvatarListView$1
                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                public final boolean canScrollHorizontally() {
                    return false;
                }

                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                public final boolean canScrollVertically() {
                    return false;
                }
            });
        }
        recyclerView.setAdapter(getAdapter());
        recyclerView.setItemAnimator(null);
        addView(recyclerView, new FrameLayout.LayoutParams(-1, -2));
        final int iLIZIZ = (int) C497740JfY.LIZIZ(getSpacing());
        recyclerView.addItemDecoration(new C0DXR(iLIZIZ) { // from class: X.0IrP
            public final int LL;

            {
                this.LL = iLIZIZ;
            }

            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView2, C21673919s1 c21673919s1) {
                int childAdapterPosition = recyclerView2.getChildAdapterPosition(view);
                if (childAdapterPosition == -1) {
                    return;
                }
                if (MultiHangoutLiveCardOptimizeSetting.INSTANCE.isEnable()) {
                    AbstractC21673619ry adapter = recyclerView2.getAdapter();
                    if (adapter != null) {
                        int itemCount = adapter.getItemCount();
                        int i = childAdapterPosition % itemCount;
                        int i2 = this.LL;
                        int i3 = (i2 * i) / itemCount;
                        int i4 = (i2 * ((itemCount - i) - 1)) / itemCount;
                        if (C497740JfY.LJJ()) {
                            rect.left = i4;
                            rect.right = i3;
                        } else {
                            rect.left = i3;
                            rect.right = i4;
                        }
                        rect.top = 0;
                        rect.bottom = 0;
                        return;
                    }
                    return;
                }
                int i5 = childAdapterPosition % 6;
                int i6 = childAdapterPosition / 6;
                int i7 = this.LL;
                int i8 = (i7 * i5) / 6;
                int i9 = (i7 * ((6 - i5) - 1)) / 6;
                if (C497740JfY.LJJ()) {
                    rect.left = i9;
                    rect.right = i8;
                } else {
                    rect.left = i8;
                    rect.right = i9;
                }
                if (i6 != 0) {
                    if (i6 != 1) {
                        int i10 = this.LL / 2;
                        rect.top = i10;
                        rect.bottom = i10;
                        return;
                    } else {
                        rect.top = this.LL / 2;
                        rect.bottom = 0;
                        return;
                    }
                }
                rect.top = 0;
                rect.bottom = this.LL / 2;
            }
        });
        recyclerView.setNestedScrollingEnabled(false);
        C500260Jjc.LJLIIIL(500L, this, new AwS610S0100000_31(this, 2));
        recyclerView.addOnItemTouchListener(new InterfaceC21676019sM() { // from class: X.15CG
            @Override // X.InterfaceC21676019sM
            public final void LJIIJ(RecyclerView recyclerView2, MotionEvent motionEvent) {
            }

            @Override // X.InterfaceC21676019sM
            public final void LJIIZILJ(boolean z) {
            }

            @Override // X.InterfaceC21676019sM
            public final boolean LJJIFFI(RecyclerView recyclerView2, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1 && recyclerView2.findChildViewUnder(motionEvent.getX(), motionEvent.getY()) == null) {
                    Function0<Unit> function0 = this.LL.LLILLJJLI;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    return true;
                }
                return false;
            }
        });
    }
}
