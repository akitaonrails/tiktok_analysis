package X;

import Y.ARunnableS59S0300000_26;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.pipo.cashier.common.address.Region;
import com.zhiliaoapp.musically.R;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0ugM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1713160ugM extends FrameLayout {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public C1713170ugN LLILLL;
    public String LLILZ;

    private final C21630719l3 getSideBar() {
        return (C21630719l3) this.LLILLJJLI.getValue();
    }

    public final RecyclerView getRecyclerView() {
        return (RecyclerView) this.LL.getValue();
    }

    public C1713160ugM(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1562));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1563));
        C786410Ut5.Sd(R.layout.dw7, C786410Ut5.ne(getContext()), this);
    }

    public final void LIZJ(List<C1712010ueV> list, Function1<? super String, Unit> function1) {
        LinearLayoutManager linearLayoutManager;
        RecyclerView.LayoutManager layoutManager = getRecyclerView().getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            if (iFindFirstVisibleItemPosition != -1 && iFindFirstVisibleItemPosition >= 0 && iFindFirstVisibleItemPosition < list.size()) {
                while (true) {
                    String str = ((C1712010ueV) ListProtector.get(list, iFindFirstVisibleItemPosition)).LIZ;
                    if (str != null && str.length() > 0) {
                        if (str.length() != 0) {
                            LIZIZ(str, false, function1);
                            return;
                        }
                    } else {
                        iFindFirstVisibleItemPosition--;
                        if (-1 >= iFindFirstVisibleItemPosition) {
                            break;
                        }
                    }
                }
                LIZIZ(null, false, function1);
                return;
            }
            LIZIZ(null, false, function1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [X.0rMx, X.0ugN] */
    public final void LIZ(List<Region> list, Function1<? super Region, Unit> function1, final Function1<? super String, Unit> function12) {
        String str;
        boolean z;
        C1712010ueV c1712010ueV;
        this.LLILZ = null;
        ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        String str2 = "";
        int i = 0;
        for (Region region : list) {
            int i2 = i + 1;
            if (i >= 0) {
                Region region2 = region;
                String str3 = region2.asciName;
                if (str3 != null && str3.length() != 0) {
                    BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                    characterInstance.setText(str3);
                    int next = characterInstance.next();
                    if (next != -1 && next > 0) {
                        str = str3.substring(0, next);
                    } else {
                        str = new String(Character.toChars(str3.codePointAt(0)));
                    }
                } else {
                    str = null;
                }
                if (i == list.size() - 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (str2 != null && str2.length() != 0 && Intrinsics.LJFF(str2, str)) {
                    c1712010ueV = new C1712010ueV(null, region2, z);
                } else {
                    if (str != null) {
                        arrayList.add(str);
                    }
                    c1712010ueV = new C1712010ueV(str, region2, z);
                    str2 = str;
                }
                arrayList2.add(c1712010ueV);
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        C1711990ueT c1711990ueT = new C1711990ueT(function1);
        RecyclerView recyclerView = getRecyclerView();
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(c1711990ueT);
        recyclerView.setItemAnimator(null);
        C1713170ugN c1713170ugN = this.LLILLL;
        if (c1713170ugN != null) {
            getRecyclerView().removeOnScrollListener(c1713170ugN);
        }
        if (!arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                String str4 = ((C1712010ueV) it2.next()).LIZ;
                if (str4 != null && str4.length() != 0) {
                    ?? r1 = new AbstractC1585810rMx() { // from class: X.0ugN
                        @Override // X.AbstractC1585810rMx
                        public final void LJJIIZI(RecyclerView recyclerView2, int i3, int i4) {
                            this.LL.LIZJ(arrayList2, function12);
                        }
                    };
                    getRecyclerView().addOnScrollListener(r1);
                    this.LLILLL = r1;
                    HandlerHook.viewPost(getRecyclerView(), new ARunnableS59S0300000_26(this, arrayList2, function12, 11));
                    break;
                }
            }
            this.LLILLL = null;
            LIZIZ(null, true, function12);
        } else {
            this.LLILLL = null;
            LIZIZ(null, true, function12);
        }
        ArrayList arrayList3 = (ArrayList) c1711990ueT.LLILLJJLI;
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        c1711990ueT.notifyDataSetChanged();
        C21630719l3 sideBar = getSideBar();
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        sideBar.setIndexItems((String[]) Arrays.copyOf(strArr, strArr.length));
        getSideBar().setPosition(C426750GoL.LJ(getSideBar()) ? 1 : 0);
        getSideBar().setOnSelectIndexItemListener(new InterfaceC1713180ugO(this) { // from class: X.0ugL
            public final /* synthetic */ C1713160ugM LIZIZ;

            {
                this.LIZIZ = this;
            }

            @Override // X.InterfaceC1713180ugO
            public final void LIZ(String str5) {
                LinearLayoutManager linearLayoutManager;
                int size = arrayList2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    if (u.LJIJI(((C1712010ueV) ListProtector.get(arrayList2, i3)).LIZ, str5, true)) {
                        RecyclerView.LayoutManager layoutManager = this.LIZIZ.getRecyclerView().getLayoutManager();
                        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                            linearLayoutManager.scrollToPositionWithOffset(i3, 0);
                        }
                        HandlerHook.viewPost(this.LIZIZ.getRecyclerView(), new ARunnableS59S0300000_26(this.LIZIZ, arrayList2, function12, 3));
                        return;
                    }
                }
            }
        });
        C12ES.LJIILL(0, getSideBar());
    }

    public final void LIZIZ(String str, boolean z, Function1 function1) {
        if (z || !Intrinsics.LJFF(str, this.LLILZ)) {
            this.LLILZ = str;
            function1.invoke(str);
        }
    }
}
