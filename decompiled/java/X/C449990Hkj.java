package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0Hkj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C449990Hkj extends AbstractC444180HbM implements InterfaceC449500Hjw, InterfaceC487330J9f {
    public final RecyclerView LLILLJJLI;
    public final C449890HkZ LLILLL;
    public RecyclerView.LayoutManager LLILZ;
    public final C0DXR LLILZIL;

    @Override // X.InterfaceC449500Hjw
    public final C449450Hjr LIZIZ() {
        return null;
    }

    public final void LIZJ() {
        C0DXR c0dxr;
        RecyclerView.LayoutManager layoutManager;
        if (!C2279851ELn.LIZIZ() || (c0dxr = this.LLILZIL) == null || (layoutManager = this.LLILZ) == null || !(layoutManager instanceof LinearLayoutManager)) {
            return;
        }
        this.LLILLJJLI.removeItemDecoration(c0dxr);
        this.LLILLJJLI.addItemDecoration(this.LLILZIL);
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        RecyclerView recyclerView = this.LLILLJJLI;
        if (recyclerView != null) {
            recyclerView.setAdapter(this.LLILLL);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C449990Hkj(InterfaceC449820HkS interfaceC449820HkS, ViewGroup viewGroup, InterfaceC449960Hkg interfaceC449960Hkg, LinearLayoutManager linearLayoutManager, C423590GjF c423590GjF, List list, C0DXR c0dxr, int i, int i2, int i3, Aweme aweme, Boolean bool) {
        super(viewGroup, R.layout.c3v);
        LinearLayoutManager gridLayoutManager = linearLayoutManager;
        C0DXR c0dxr2 = c0dxr;
        View view = this.LL;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.f715h0b);
        this.LLILLJJLI = recyclerView;
        Context context = viewGroup.getContext();
        C449890HkZ c449890HkZ = new C449890HkZ(interfaceC449820HkS, interfaceC449960Hkg, i2, i3, aweme, bool);
        this.LLILLL = c449890HkZ;
        recyclerView.setAdapter(c449890HkZ);
        if (bool.booleanValue()) {
            int iLIZ = C341940Daq.LIZ(12.0d);
            recyclerView.setPadding(iLIZ, 0, iLIZ, 0);
            recyclerView.setClipToPadding(false);
        } else if (i3 == 2) {
            recyclerView.setClipToPadding(false);
        }
        c449890HkZ.LLILLL.clear();
        if (list != null) {
            c449890HkZ.LLILLL.addAll(list);
        }
        c449890HkZ.notifyDataSetChanged();
        if (i <= 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("return due to 0 span count ");
            sbLIZ.append(i);
            sbLIZ.append(" ,size of emojiList: ");
            sbLIZ.append(list.size());
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        if (gridLayoutManager == null) {
            if (bool.booleanValue() && i3 == 2) {
                gridLayoutManager = new LinearLayoutManager(context, 0, false);
            } else {
                gridLayoutManager = new GridLayoutManager(view.getContext(), i);
            }
        }
        this.LLILZ = gridLayoutManager;
        c0dxr2 = c0dxr2 == null ? new C0DXR() { // from class: X.0DQ2
            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView2, C21673919s1 c21673919s1) {
                super.LIZIZ(rect, view2, recyclerView2, c21673919s1);
                int measuredWidth = recyclerView2.getMeasuredWidth() / 8;
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    measuredWidth = (measuredWidth - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin;
                }
                layoutParams.width = measuredWidth;
            }
        } : c0dxr2;
        this.LLILZIL = c0dxr2;
        if (c423590GjF != null) {
            recyclerView.setItemAnimator(c423590GjF);
        }
        recyclerView.addItemDecoration(c0dxr2);
        recyclerView.setLayoutManager(gridLayoutManager);
        Activity activityLIZ = C1388190mED.LIZ(viewGroup.getContext());
        if (activityLIZ != null) {
            C487280J9a.LIZ(activityLIZ.hashCode(), this);
        }
    }
}
