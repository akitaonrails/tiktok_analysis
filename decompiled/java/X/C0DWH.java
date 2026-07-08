package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.notification.view.template.NoticeTemplateMiddleMultiImageView$ImageCell;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0DWH, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DWH extends ViewOnAttachStateChangeListenerC20604515jv implements InterfaceC336510DHd {
    public static int LLILZIL;
    public static final int LLILZLL;
    public List<? extends UrlModel> LLILZ;

    static {
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(76));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
        C844470XAv.LIZ.getClass();
        int iLJIIJ = (C12ES.LJIIJ(C844470XAv.LIZ()) - iLIZIZ) - iLIZIZ2;
        int i = LLILZIL;
        if (i > 0) {
            iLJIIJ = i;
        }
        LLILZLL = (iLJIIJ - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(8.0f))) * 4)) / 5;
    }

    public C0DWH(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void LJJI(List<? extends UrlModel> list, View.OnClickListener onClickListener) {
        int size;
        this.LLILZ = list;
        if (list.isEmpty()) {
            C786410Ut5.k0(this, 8);
            return;
        }
        C786410Ut5.k0(this, 0);
        C20600815jK<InterfaceC1891350zJl> state = getState();
        ArrayList arrayList = new ArrayList();
        int iMin = Math.min(list.size(), 5);
        for (int i = 0; i < iMin; i++) {
            UrlModel urlModel = (UrlModel) ListProtector.get(list, i);
            if (i == 4) {
                size = list.size() - 5;
            } else {
                size = 0;
            }
            arrayList.add(new C06WS(urlModel, size, onClickListener));
        }
        state.LJIILL(arrayList, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (LLILZIL > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(LLILZLL, 1073741824);
        }
        super.onMeasure(i, i2);
        if (getMeasuredWidth() > 0) {
            LLILZIL = getMeasuredWidth();
        }
    }

    public C0DWH(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LJIILJJIL(NoticeTemplateMiddleMultiImageView$ImageCell.class);
        addItemDecoration(new C0DXR() { // from class: X.03wm
            public final int LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(8.0f)));
            public final int LLILLJJLI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(0.0f)));

            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                super.LIZIZ(rect, view, recyclerView, c21673919s1);
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                AbstractC21673619ry adapter = recyclerView.getAdapter();
                if (adapter != null) {
                    int itemCount = adapter.getItemCount();
                    if (childAdapterPosition == 0) {
                        rect.left = this.LLILLJJLI;
                        rect.right = this.LL / 2;
                    } else if (childAdapterPosition == itemCount - 1) {
                        rect.left = this.LL / 2;
                        rect.right = 0;
                    } else {
                        int i2 = this.LL / 2;
                        rect.left = i2;
                        rect.right = i2;
                    }
                }
            }
        });
        setLayoutManager(new LinearLayoutManager(context, 0, false));
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
