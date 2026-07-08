package X;

import android.view.View;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.newpost.vm.SubSpaceNewPostVM;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: renamed from: X.0Jmr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C502270Jmr extends C502700JnY {
    public final View LL;
    public final SubSpaceNewPostVM LLILLJJLI;

    public C502270Jmr(View view, SubSpaceNewPostVM subSpaceNewPostVM) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = subSpaceNewPostVM;
    }

    @Override // X.C502700JnY
    public final void I5(AbstractC503810JpL abstractC503810JpL, InterfaceC2753014t interfaceC2753014t) {
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0Jmq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ArrayList<AbstractC503810JpL> arrayList;
                C502450Jn9 c502450Jn9;
                AbstractC503810JpL abstractC503810JpLPrevious;
                int iLastIndexOf;
                boolean z;
                int i;
                C502280Jms c502280Jms;
                SubSpaceNewPostVM subSpaceNewPostVM = this.LL.LLILLJJLI;
                C502390Jn3 c502390Jn3 = subSpaceNewPostVM.LLILLL;
                if (c502390Jn3 != null && (arrayList = c502390Jn3.LL) != null) {
                    ListIterator<AbstractC503810JpL> listIterator = arrayList.listIterator(arrayList.size());
                    while (true) {
                        c502450Jn9 = null;
                        if (listIterator.hasPrevious()) {
                            abstractC503810JpLPrevious = listIterator.previous();
                            if (abstractC503810JpLPrevious instanceof C502450Jn9) {
                                break;
                            }
                        } else {
                            abstractC503810JpLPrevious = null;
                            break;
                        }
                    }
                    if (abstractC503810JpLPrevious instanceof C502450Jn9) {
                        c502450Jn9 = (C502450Jn9) abstractC503810JpLPrevious;
                    }
                    if (c502450Jn9 != null) {
                        iLastIndexOf = arrayList.lastIndexOf(c502450Jn9);
                    } else {
                        iLastIndexOf = -1;
                    }
                    int i2 = 0;
                    if (iLastIndexOf >= 0) {
                        if (c502450Jn9 != null && (c502280Jms = c502450Jn9.LIZ) != null) {
                            i = c502280Jms.LIZ;
                        } else {
                            i = 0;
                        }
                        int i3 = i + 1;
                        C502280Jms c502280Jms2 = new C502280Jms(i3, false);
                        if (i3 >= 10) {
                            z = true;
                        } else {
                            z = false;
                        }
                        ListProtector.add(arrayList, iLastIndexOf + 1, new C502450Jn9(c502280Jms2));
                    } else {
                        z = false;
                    }
                    C502390Jn3 c502390Jn32 = subSpaceNewPostVM.LLILLL;
                    if (c502390Jn32 != null) {
                        c502390Jn32.notifyItemInserted(iLastIndexOf + 1);
                    }
                    if (z) {
                        Iterator<AbstractC503810JpL> it2 = arrayList.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            if (it2.next() instanceof C502490JnD) {
                                if (i2 >= 0) {
                                    ListProtector.remove(arrayList, i2);
                                    C502390Jn3 c502390Jn33 = subSpaceNewPostVM.LLILLL;
                                    if (c502390Jn33 != null) {
                                        c502390Jn33.notifyItemRemoved(i2);
                                    }
                                }
                            } else {
                                i2++;
                            }
                        }
                    }
                    subSpaceNewPostVM.setState(new C502210Jml());
                }
            }
        }, this.LL);
    }
}
