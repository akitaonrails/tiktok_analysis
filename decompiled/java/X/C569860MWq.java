package X;

import Y.ARunnableS108S0100000_8;
import android.view.View;
import com.ss.android.ugc.aweme.portrait.model.PortraitStyleItem;
import com.ss.android.ugc.aweme.portrait.tab.AIPortraitTabFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MWq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C569860MWq implements InterfaceC346701Wf, InterfaceC1635506an {
    public final /* synthetic */ AIPortraitTabFragment LL;

    public C569860MWq(AIPortraitTabFragment aIPortraitTabFragment) {
        this.LL = aIPortraitTabFragment;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC346701Wf) && (obj instanceof InterfaceC1635506an)) {
            return Intrinsics.LJFF(getFunctionDelegate(), ((InterfaceC1635506an) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC1635506an
    public final InterfaceC1451105m9<?> getFunctionDelegate() {
        return new C1696260uF6(2, this.LL, AIPortraitTabFragment.class, "renderPageState", "renderPageState(Lcom/ss/android/ugc/aweme/portrait/tab/AIPortraitTabPageState;)V", 4);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        int i;
        C569820MWm c569820MWm = (C569820MWm) obj;
        AIPortraitTabFragment aIPortraitTabFragment = this.LL;
        View view = aIPortraitTabFragment.LLILZIL;
        int i2 = 0;
        if (view != null) {
            if (c569820MWm.LIZLLL) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
        if (!c569820MWm.LIZLLL) {
            List<PortraitStyleItem> list = c569820MWm.LIZIZ;
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            if (list != aIPortraitTabFragment.LLJILJILJ || c569820MWm.LJFF != aIPortraitTabFragment.LLJILLL) {
                aIPortraitTabFragment.LLJILJILJ = list;
                boolean z = c569820MWm.LJFF;
                aIPortraitTabFragment.LLJILLL = z;
                C0MX0 c0mx0 = aIPortraitTabFragment.LLJI;
                if (c0mx0 != null) {
                    ARunnableS108S0100000_8 aRunnableS108S0100000_8 = new ARunnableS108S0100000_8(aIPortraitTabFragment, 140);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
                    for (PortraitStyleItem portraitStyleItem : list) {
                        int i3 = i2 + 1;
                        if (i2 >= 0) {
                            arrayList2.add(new C0MX2(portraitStyleItem, i2));
                            i2 = i3;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                    arrayList.addAll(arrayList2);
                    if (z) {
                        arrayList.add(new C0MX3() { // from class: X.0MX6
                            public static final String LIZIZ = "FOOTER";
                            public static final int LIZJ = 2;

                            @Override // X.C0MX3
                            public final String LIZ() {
                                return LIZIZ;
                            }

                            @Override // X.C0MX3
                            public final int LIZIZ() {
                                return LIZJ;
                            }
                        });
                    } else if (!list.isEmpty()) {
                        arrayList.add(new C0MX3() { // from class: X.0MX7
                            public static final String LIZIZ = "NO_MORE";
                            public static final int LIZJ = 3;

                            @Override // X.C0MX3
                            public final String LIZ() {
                                return LIZIZ;
                            }

                            @Override // X.C0MX3
                            public final int LIZIZ() {
                                return LIZJ;
                            }
                        });
                    }
                    c0mx0.LLLII(arrayList, aRunnableS108S0100000_8);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C099R.LJFF();
        return unit;
    }
}
