package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.18zX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21465718zX extends FrameLayout {
    public static final /* synthetic */ int LLILLL = 0;
    public final ViewGroup LL;
    public boolean LLILLJJLI;

    public C21465718zX(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.LL = viewGroup;
        viewGroup.setTag(R.id.iva, this);
        new C21466018za(viewGroup).LIZ.add(this);
        this.LLILLJJLI = true;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        if (this.LLILLJJLI) {
            super.onViewAdded(view);
            return;
        }
        throw new IllegalStateException("This GhostViewHolder is detached!");
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            this.LL.setTag(R.id.iva, null);
            new C21466018za(this.LL).LIZ.remove(this);
            this.LLILLJJLI = false;
        }
    }

    public static void LIZ(View view, ArrayList<View> arrayList) {
        Object parent = view.getParent();
        if (parent instanceof ViewGroup) {
            LIZ((View) parent, arrayList);
        }
        arrayList.add(view);
    }
}
