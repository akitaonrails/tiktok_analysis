package com.bytedance.android.live.liveinteract.multihost.biz.link.view;

import X.C21673319rv;
import X.C21673919s1;
import X.C21674119s3;
import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes18.dex */
public final class LivingNoticeManager extends LinearLayoutManager {
    public LivingNoticeManager(Context context) {
        super(context);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        try {
            super.onLayoutChildren(c21673319rv, c21673919s1);
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, C21673919s1 c21673919s1, int i) {
        final Context context;
        if (recyclerView != null) {
            context = recyclerView.getContext();
        } else {
            context = null;
        }
        C21674119s3 c21674119s3 = new C21674119s3(context) { // from class: X.0fNq
            @Override // X.C21674119s3
            public final int LJIILL() {
                return -1;
            }

            @Override // X.C21674119s3
            public final float LJIIJJI(DisplayMetrics displayMetrics) {
                if (displayMetrics != null && Integer.valueOf(displayMetrics.densityDpi) != null) {
                    return 200.0f / displayMetrics.densityDpi;
                }
                return 25.0f / displayMetrics.densityDpi;
            }
        };
        c21674119s3.LIZ = i;
        startSmoothScroll(c21674119s3);
    }
}
