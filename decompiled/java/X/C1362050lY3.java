package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0lY3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1362050lY3 extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LLILZLL = 0;
    public SharePanelViewModel LL;
    public final C430200Gtu LLILLJJLI;
    public final TuxTextView LLILLL;
    public final C1361580lXI LLILZ;
    public C1363140lZo LLILZIL;

    public C1362050lY3(View view, SharePanelViewModel sharePanelViewModel, boolean z, int i, boolean z2, int i2, int i3) {
        Integer numLIZJ;
        LinearLayout.LayoutParams layoutParams;
        super(view);
        this.LL = sharePanelViewModel;
        this.LLILZ = new C1361580lXI();
        view.getLayoutParams().width = i;
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.am5);
        this.LLILLL = tuxTextView;
        C430200Gtu c430200Gtu = (C430200Gtu) view.findViewById(R.id.alv);
        this.LLILLJJLI = c430200Gtu;
        if (c430200Gtu != null) {
            c430200Gtu.setImportantForAccessibility(2);
        }
        C1362230lYL c1362230lYL = this.LL.LLJI;
        if (c1362230lYL != null) {
            view.getLayoutParams().width = c1362230lYL.LJIIJJI;
            if (c430200Gtu != null) {
                c430200Gtu.getLayoutParams().width = c1362230lYL.LJIIL;
                c430200Gtu.getLayoutParams().height = c1362230lYL.LJIIL;
                c430200Gtu.setSize(C418440Gaw.LJFF(c1362230lYL.LJIIL, view.getContext()));
            }
            TuxTextView tuxTextView2 = this.LLILLL;
            if (tuxTextView2 != null) {
                ViewGroup.LayoutParams layoutParams2 = tuxTextView2.getLayoutParams();
                LinearLayout.LayoutParams layoutParams3 = null;
                if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams2) != null) {
                    layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                    layoutParams3 = layoutParams;
                }
                C786410Ut5.R6(tuxTextView2, layoutParams3);
                tuxTextView2.setTextColorRes(R.attr.a1h);
                Integer num = c1362230lYL.LJIIZILJ;
                if (num != null) {
                    tuxTextView2.setTuxFont(num.intValue());
                }
            }
        } else {
            if (z) {
                view.getLayoutParams().width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(62));
                if (tuxTextView != null) {
                    C426750GoL.LJIIIZ(tuxTextView, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, null, false, 29);
                }
            }
            if (z2) {
                int dimensionPixelOffset = view.getContext().getResources().getDimensionPixelOffset(R.dimen.a2s);
                if (c430200Gtu != null) {
                    ViewGroup.LayoutParams layoutParams4 = c430200Gtu.getLayoutParams();
                    if (layoutParams4 != null) {
                        layoutParams4.height = dimensionPixelOffset;
                    }
                    ViewGroup.LayoutParams layoutParams5 = c430200Gtu.getLayoutParams();
                    if (layoutParams5 != null) {
                        layoutParams5.width = dimensionPixelOffset;
                    }
                    c430200Gtu.setSize(C418440Gaw.LJFF(dimensionPixelOffset, view.getContext()));
                }
            }
        }
        if (tuxTextView != null) {
            tuxTextView.setMaxLines(i2);
            Context context = tuxTextView.getContext();
            if (context != null && (numLIZJ = C1308910kAL.LIZJ(i3, context)) != null) {
                tuxTextView.setTextColor(numLIZJ.intValue());
            }
        }
        C2211751BhN.LIZ(view, this.LLILZ);
        C786410Ut5.I7(new AbstractViewOnClickListenerC1173120gdK() { // from class: X.0lY4
            @Override // X.AbstractViewOnClickListenerC1173120gdK
            public final void LIZ(View view2) {
                List<IMContact> contacts;
                List<IMContact> contacts2;
                List<IMContact> contacts3;
                C1362050lY3 c1362050lY3 = this.LLILZ;
                SharePanelViewModel sharePanelViewModel2 = c1362050lY3.LL;
                C1363140lZo c1363140lZo = c1362050lY3.LLILZIL;
                sharePanelViewModel2.getClass();
                if (c1363140lZo != null) {
                    contacts = c1363140lZo.getContacts();
                } else {
                    contacts = null;
                }
                int size = 0;
                if (contacts != null && !contacts.isEmpty()) {
                    Iterator it2 = ((ArrayList) sharePanelViewModel2.LLJJI).iterator();
                    int i4 = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (it2.next() instanceof C1363140lZo) {
                            if (i4 >= 0) {
                                ArrayList arrayList = new ArrayList();
                                ArrayList arrayList2 = new ArrayList();
                                arrayList.addAll(((ArrayList) sharePanelViewModel2.LLJJI).subList(0, i4));
                                ListProtector.remove(sharePanelViewModel2.LLJJI, i4);
                                arrayList.addAll(contacts);
                                for (Object obj : (ArrayList) sharePanelViewModel2.LLJJI) {
                                    if (!arrayList.contains(obj)) {
                                        arrayList.add(obj);
                                    }
                                }
                                ((ArrayList) sharePanelViewModel2.LLJJI).clear();
                                ((ArrayList) sharePanelViewModel2.LLJJI).addAll(arrayList);
                                arrayList2.addAll(contacts);
                                for (IMContact iMContact : sharePanelViewModel2.LJIIJJI()) {
                                    if (!arrayList2.contains(iMContact)) {
                                        arrayList2.add(iMContact);
                                    }
                                }
                                sharePanelViewModel2.LJIIJJI().clear();
                                sharePanelViewModel2.LJIIJJI().addAll(arrayList2);
                                for (IMContact iMContact2 : contacts) {
                                    iMContact2.displayPosition = sharePanelViewModel2.LJIIJJI().indexOf(iMContact2);
                                }
                                InterfaceC1356390lOv interfaceC1356390lOv = sharePanelViewModel2.LLILLJJLI;
                                if (interfaceC1356390lOv != null) {
                                    interfaceC1356390lOv.Pu0(sharePanelViewModel2.LLJJI, contacts);
                                }
                            }
                        } else {
                            i4++;
                        }
                    }
                }
                C1364620lcC c1364620lcC = C1364620lcC.LIZ;
                C1363140lZo c1363140lZo2 = this.LLILZ.LLILZIL;
                if (c1363140lZo2 != null && (contacts3 = c1363140lZo2.getContacts()) != null) {
                    size = contacts3.size();
                }
                SharePackage sharePackage = this.LLILZ.LL.LL;
                c1364620lcC.getClass();
                C1364620lcC.LJ(size, sharePackage, "click");
                C1363140lZo c1363140lZo3 = this.LLILZ.LLILZIL;
                if (c1363140lZo3 != null && (contacts2 = c1363140lZo3.getContacts()) != null) {
                    for (IMContact iMContact3 : contacts2) {
                        SharePackage sharePackage2 = this.LLILZ.LL.LL;
                        if (sharePackage2 != null) {
                            C1364620lcC c1364620lcC2 = C1364620lcC.LIZ;
                            InterfaceC1493505sz interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
                            c1364620lcC2.getClass();
                            C1364620lcC.LJIILLIIL(sharePackage2, iMContact3, interfaceC1493505szLIZIZ);
                        }
                    }
                }
            }
        }, view);
    }
}
