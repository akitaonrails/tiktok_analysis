package com.bytedance.android.live.liveinteract.multiguestv3.main.common.switchspot;

import X.AbstractC21673619ry;
import X.C01GW;
import X.C0DXR;
import X.C1117360fBO;
import X.C15438062q;
import X.C439101nJ;
import X.C452501pT;
import X.C786410Ut5;
import X.C929090aHj;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class SwitchSpotBottomActionListDialogFragment extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSwiZyHELIOSw8JSgjJ2EgPyw4KicgOCo4ZxwkITEvIRwjJzEOJjsnJygNKjs6JysAIDwnDCwtJSA0DjctLiI2JjE=";
    public final List<C929090aHj> LLJLLL = new ArrayList();
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS559S0100000_15(this, 237));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 238));
    public RecyclerView LLL;

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        Iterator<C929090aHj> it2 = this.LLJLLL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ = null;
        }
        ((ArrayList) this.LLJLLL).clear();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.draggable = false;
        sheetOptions.dimBehindType = 1;
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        RecyclerView recyclerView;
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.wuu);
        this.LLL = recyclerView2;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(view.getContext()));
        }
        RecyclerView recyclerView3 = this.LLL;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter((AbstractC21673619ry) this.LLJZ.getValue());
        }
        final Context context = getContext();
        if (context != null && (recyclerView = this.LLL) != null) {
            final int iLIZ = C439101nJ.LIZ(16);
            recyclerView.addItemDecoration(new C0DXR(iLIZ, context) { // from class: X.0DYY
                public final int LL;
                public final Drawable LLILLJJLI;

                {
                    this.LL = iLIZ;
                    this.LLILLJJLI = C800330VaR.LIZIZ(context, R.drawable.f4y);
                }

                @Override // X.C0DXR
                public final void LIZLLL(Canvas canvas, RecyclerView recyclerView4, C21673919s1 c21673919s1) {
                    int intrinsicHeight;
                    int paddingLeft = recyclerView4.getPaddingLeft();
                    int width = recyclerView4.getWidth() - recyclerView4.getPaddingRight();
                    int childCount = recyclerView4.getChildCount();
                    int iLIZIZ = c21673919s1.LIZIZ();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = recyclerView4.getChildAt(i);
                        if (recyclerView4.getChildAdapterPosition(childAt) != iLIZIZ - 1) {
                            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).bottomMargin;
                            Drawable drawable = this.LLILLJJLI;
                            if (drawable != null) {
                                intrinsicHeight = drawable.getIntrinsicHeight();
                            } else {
                                intrinsicHeight = 0;
                            }
                            int i2 = intrinsicHeight + bottom;
                            Drawable drawable2 = this.LLILLJJLI;
                            if (drawable2 != null) {
                                int i3 = this.LL;
                                drawable2.setBounds(paddingLeft + i3, bottom, width - i3, i2);
                            }
                            Drawable drawable3 = this.LLILLJJLI;
                            if (drawable3 != null) {
                                drawable3.draw(canvas);
                            }
                        }
                    }
                }
            });
        }
        C1117360fBO c1117360fBO = (C1117360fBO) this.LLJZ.getValue();
        List<C929090aHj> list = this.LLJLLL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            arrayList.add(((C929090aHj) it2.next()).LIZ);
        }
        c1117360fBO.LLLII(arrayList);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.h9u, viewGroup, false);
    }
}
