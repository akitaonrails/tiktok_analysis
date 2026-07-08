package X;

import Y.ACListenerS152S0100000_17;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.gift.model.GiftColorInfo;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS666S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0fT6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1128340fT6 extends ConstraintLayout implements C0T8B {
    public final RecyclerView LL;
    public final View LLILLJJLI;
    public final C16F5 LLILLL;
    public InterfaceC1631620sYq<? super C1128350fT7, ? super Boolean, ? super Integer, Unit> LLILZ;

    @Override // X.C0T8B
    public final boolean h() {
        return true;
    }

    public final void e0(C1128330fT5 c1128330fT5) {
        Object next;
        final List<GiftColorInfo> list = c1128330fT5.LIZ;
        long j = c1128330fT5.LIZIZ;
        long j2 = c1128330fT5.LIZJ;
        ArrayList<C1128350fT7> arrayList = new ArrayList();
        Iterator<GiftColorInfo> it2 = list.iterator();
        int i = 0;
        while (it2.hasNext()) {
            arrayList.add(new C1128350fT7(i, j2, it2.next(), false));
            i++;
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (C1128350fT7 c1128350fT7LIZ : arrayList) {
            Long l = c1128350fT7LIZ.LIZJ.colorId;
            if (l != null && l.longValue() == j) {
                c1128350fT7LIZ = C1128350fT7.LIZ(c1128350fT7LIZ, true);
            }
            arrayList2.add(c1128350fT7LIZ);
        }
        C1128370fT9 c1128370fT9 = new C1128370fT9(new AwS666S0100000_17(this, 2));
        this.LL.setAdapter(c1128370fT9);
        Iterator it3 = arrayList2.iterator();
        while (true) {
            if (it3.hasNext()) {
                next = it3.next();
                if (((C1128350fT7) next).LIZLLL) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        c1128370fT9.LLILLL = (C1128350fT7) next;
        c1128370fT9.LLLI(arrayList2);
        final Long lValueOf = Long.valueOf(j2);
        final Integer numValueOf = Integer.valueOf(list.size());
        final Long lValueOf2 = Long.valueOf(j);
        HandlerHook.viewPostDelay(this.LL, new Runnable() { // from class: X.01Du
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r6v0, types: [X.13BV] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.util.Collection] */
            /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
            public final void LIZ() {
                ?? arrayList3;
                Long l2;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.LL.LL.getLayoutManager();
                int iFindLastVisibleItemPosition = (linearLayoutManager.findLastVisibleItemPosition() - linearLayoutManager.findFirstVisibleItemPosition()) + 1;
                Long l3 = lValueOf;
                Long l4 = lValueOf2;
                Integer num = numValueOf;
                Boolean boolValueOf = Boolean.valueOf(iFindLastVisibleItemPosition >= (num != null ? num.intValue() : 0));
                List<GiftColorInfo> list2 = list;
                if (list2 != null) {
                    arrayList3 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                    Iterator<GiftColorInfo> it4 = list2.iterator();
                    while (it4.hasNext()) {
                        GiftColorInfo next2 = it4.next();
                        arrayList3.add(Long.valueOf((next2 == null || (l2 = next2.colorId) == null) ? 0L : l2.longValue()));
                    }
                } else {
                    arrayList3 = C13BV.INSTANCE;
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ("gift_color_tab_show");
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LJJII(new JSONArray((Collection) arrayList3).toString(), "color_id_set");
                c474500IjALIZ.LJJII(Intrinsics.LJFF(boolValueOf, Boolean.TRUE) ? "1" : CardStruct.IStatusCode.DEFAULT, "is_all_show");
                c474500IjALIZ.LJJII(l4, "oncall_color");
                c474500IjALIZ.LJJII(l3, "gift_id");
                c474500IjALIZ.LJJII(C1130100fVw.LIZ.LIZ, "guide_from");
                c474500IjALIZ.LIZ();
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SwitchColorPanel@c481.onColorBarShown$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SwitchColorPanel@c481.onColorBarShown$1");
            }
        }, 300L);
    }

    public final void setOnMoreClickListener(Function0<Unit> function0) {
        C786410Ut5.l8(this.LLILLL, new ACListenerS152S0100000_17(function0, 51));
    }

    public final void setShowMoreButton(boolean z) {
        int i;
        int paddingStart;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LLJJJJ(this.LLILLL, i);
        C786410Ut5.LJLLLLLL(i, this.LLILLJJLI);
        if (z) {
            paddingStart = this.LLILLJJLI.getLayoutParams().width;
        } else {
            paddingStart = this.LL.getPaddingStart();
        }
        RecyclerView recyclerView = this.LL;
        recyclerView.setPaddingRelative(recyclerView.getPaddingStart(), this.LL.getPaddingTop(), paddingStart, this.LL.getPaddingBottom());
    }

    public C1128340fT6(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            this.LL.scheduleLayoutAnimation();
        }
    }

    public C1128340fT6(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ViewGroup.inflate(context, R.layout.hzo, this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.e8a);
        this.LL = recyclerView;
        View viewFindViewById = findViewById(R.id.hjk);
        this.LLILLJJLI = viewFindViewById;
        C16F5 c16f5 = (C16F5) findViewById(R.id.wvh);
        this.LLILLL = c16f5;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setItemAnimator(new C423520Gj8());
        recyclerView.setLayoutAnimation(AnimationUtils.loadLayoutAnimation(context, R.anim.gu));
        if (getResources().getConfiguration().getLayoutDirection() == 1) {
            C786410Ut5.Ob(viewFindViewById, -1.0f);
        }
        C786410Ut5.LLJJJJ(c16f5, 8);
        C786410Ut5.LJLLLLLL(8, viewFindViewById);
    }
}
