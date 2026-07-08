package X;

import Y.ARunnableS23S0101000_12;
import android.content.Context;
import android.graphics.Rect;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.effect.navi.NaviAvatarListPresenter;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UCW, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UCW extends FrameLayout implements InterfaceC768400UCg {
    public View LL;
    public RecyclerView LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public NaviAvatarListPresenter LLILZIL;

    private final LinearLayoutManager getLinearLayoutManager() {
        return (LinearLayoutManager) this.LLILZ.getValue();
    }

    public final C0UCZ getNaviAdapter() {
        return (C0UCZ) this.LLILLL.getValue();
    }

    public static boolean LIZ() {
        return Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0UCW(Context context) {
        super(context, null, 0);
        RecyclerView recyclerView = null;
        this.LLILLL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(398));
        this.LLILZ = C452501pT.LIZIZ(new AwS556S0100000_12(context, 870));
        FrameLayout.inflate(context, R.layout.hf8, this);
        View viewFindViewById = findViewById(R.id.qvo);
        if (viewFindViewById != null) {
            C500260Jjc.LJLIIIL(500L, viewFindViewById, new AwS591S0100000_12(this, 978));
        } else {
            viewFindViewById = null;
        }
        this.LL = viewFindViewById;
        RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.t0h);
        if (recyclerView2 != null) {
            recyclerView2.addItemDecoration(new C0DXR() { // from class: X.0H6C
                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView3, C21673919s1 c21673919s1) {
                    boolean z;
                    if (recyclerView3.getLayoutDirection() == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int childAdapterPosition = recyclerView3.getChildAdapterPosition(view);
                    if (childAdapterPosition == 0) {
                        if (z) {
                            rect.right = C497740JfY.LJIIIZ(R.dimen.amo);
                        } else {
                            rect.left = C497740JfY.LJIIIZ(R.dimen.amo);
                        }
                    } else if (z) {
                        rect.right = C497740JfY.LJIIIZ(R.dimen.amn);
                    } else {
                        rect.left = C497740JfY.LJIIIZ(R.dimen.amn);
                    }
                    RecyclerView.LayoutManager layoutManager = recyclerView3.getLayoutManager();
                    if (layoutManager != null && childAdapterPosition == layoutManager.getItemCount() - 1) {
                        if (z) {
                            rect.left = C497740JfY.LJIIIZ(R.dimen.amo);
                        } else {
                            rect.right = C497740JfY.LJIIIZ(R.dimen.amo);
                        }
                    }
                }
            });
            recyclerView2.setLayoutManager(getLinearLayoutManager());
            C0UCZ naviAdapter = getNaviAdapter();
            naviAdapter.LLILLJJLI = new AwS591S0100000_12(this, 979);
            recyclerView2.setAdapter(naviAdapter);
            recyclerView2.setHasFixedSize(true);
            recyclerView = recyclerView2;
        }
        this.LLILLJJLI = recyclerView;
    }

    public final void LIZIZ(int i) {
        if (LIZ()) {
            getNaviAdapter().LLLII(i);
        } else {
            C473410IhP.LIZIZ(new ARunnableS23S0101000_12(i, this, 27));
        }
    }

    @Override // X.InterfaceC768400UCg
    public void setSelectedIndex(int i) {
        if (LIZ()) {
            getNaviAdapter().LLLIIIIL(i);
        } else {
            C473410IhP.LIZIZ(new ARunnableS23S0101000_12(i, this, 26));
        }
    }
}
