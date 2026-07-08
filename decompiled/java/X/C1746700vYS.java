package X;

import X.C1746700vYS;
import X.C1746920vYo;
import X.C1C7U;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1746910vYn;
import Y.ARunnableS37S0101000_26;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.ecommerce.base.address.widget.search.OneSearchHelper$handler$1;
import com.ss.android.ugc.aweme.ecommerce.base.address.widget.search.OneSearchResultAdapter;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0vYS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1746700vYS<T> implements InterfaceC1747710va5 {
    public final Context LIZ;
    public final View LIZIZ;
    public final InterfaceC1747590vZt LIZJ;
    public Boolean LIZLLL;
    public boolean LJ = true;
    public final View LJFF;
    public RecyclerView LJI;
    public PopupWindow LJII;
    public OneSearchResultAdapter LJIIIIZZ;
    public WeakReference<InterfaceC1746910vYn<T>> LJIIIZ;
    public List<C1746920vYo<T>> LJIIJ;
    public final OneSearchHelper$handler$1 LJIIJJI;

    public final void LIZJ() {
        removeMessages(2);
        removeMessages(3);
        sendEmptyMessage(2);
    }

    @Override // X.InterfaceC1747710va5
    public final void LIZ(int i) {
        C1746920vYo<T> c1746920vYo;
        InterfaceC1746910vYn<T> interfaceC1746910vYn;
        InterfaceC1746910vYn<T> interfaceC1746910vYn2;
        List<C1746920vYo<T>> list = this.LJIIJ;
        if (list != null && (c1746920vYo = (C1746920vYo) C13LP.LJJJLZIJ(i, list)) != null) {
            LIZJ();
            Integer num = c1746920vYo.LJ;
            int size = 0;
            if (num != null && num.intValue() == -100) {
                WeakReference<InterfaceC1746910vYn<T>> weakReference = this.LJIIIZ;
                if (weakReference != null && (interfaceC1746910vYn2 = weakReference.get()) != null) {
                    List<C1746920vYo<T>> list2 = this.LJIIJ;
                    if (list2 != null) {
                        ArrayList arrayList = new ArrayList();
                        for (C1746920vYo<T> c1746920vYo2 : list2) {
                            Integer num2 = c1746920vYo2.LJ;
                            if (num2 != null && num2.intValue() == 6) {
                                arrayList.add(c1746920vYo2);
                            }
                        }
                        size = arrayList.size();
                    }
                    interfaceC1746910vYn2.t2(size);
                    return;
                }
                return;
            }
            WeakReference<InterfaceC1746910vYn<T>> weakReference2 = this.LJIIIZ;
            if (weakReference2 != null && (interfaceC1746910vYn = weakReference2.get()) != null) {
                List<C1746920vYo<T>> list3 = this.LJIIJ;
                if (list3 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (C1746920vYo<T> c1746920vYo3 : list3) {
                        Integer num3 = c1746920vYo3.LJ;
                        if (num3 != null && num3.intValue() == 6) {
                            arrayList2.add(c1746920vYo3);
                        }
                    }
                    size = arrayList2.size();
                }
                interfaceC1746910vYn.Y0(c1746920vYo, size, i + 1);
            }
        }
    }

    @Override // X.InterfaceC1747710va5
    public final void LIZIZ(int i) {
        InterfaceC1746910vYn<T> interfaceC1746910vYn;
        WeakReference<InterfaceC1746910vYn<T>> weakReference = this.LJIIIZ;
        if (weakReference != null && (interfaceC1746910vYn = weakReference.get()) != null) {
            interfaceC1746910vYn.H5(i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.ecommerce.base.address.widget.search.OneSearchHelper$handler$1] */
    public C1746700vYS(Context context, View view, C1746710vYT c1746710vYT) {
        this.LIZ = context;
        this.LIZIZ = view;
        this.LIZJ = c1746710vYT;
        this.LJFF = C954703oH.LIZ(context, R.layout.ay2, null, false);
        final Looper mainLooper = Looper.getMainLooper();
        this.LJIIJJI = new BPEAHandler(this, mainLooper) { // from class: com.ss.android.ugc.aweme.ecommerce.base.address.widget.search.OneSearchHelper$handler$1
            public final /* synthetic */ C1746700vYS<Object> LL;

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                PopupWindow popupWindow;
                InterfaceC1746910vYn<Object> interfaceC1746910vYn;
                C1C7U.LIZ("OneSearchHelper@14de.handler$1");
                int i = message.what;
                if (i != 1) {
                    int height = 0;
                    if (i != 2) {
                        if (i == 3) {
                            C1746700vYS<Object> c1746700vYS = this.LL;
                            List<C1746920vYo<Object>> list = c1746700vYS.LJIIJ;
                            c1746700vYS.getClass();
                            ArrayList arrayList = new ArrayList();
                            if (list != null) {
                                for (C1746920vYo<Object> c1746920vYo : list) {
                                    arrayList.add(new OneSearchResultAdapter.SearchResultItemVO(c1746920vYo.LJ, c1746920vYo.LIZLLL, c1746920vYo.LIZIZ, c1746920vYo.LIZJ, null));
                                }
                            }
                            if (arrayList.isEmpty()) {
                                this.LL.LIZJ();
                            } else {
                                OneSearchResultAdapter oneSearchResultAdapter = this.LL.LJIIIIZZ;
                                if (oneSearchResultAdapter != null) {
                                    oneSearchResultAdapter.LL = arrayList;
                                    oneSearchResultAdapter.notifyDataSetChanged();
                                }
                                PopupWindow popupWindow2 = this.LL.LJII;
                                if (popupWindow2 != null && !popupWindow2.isShowing()) {
                                    C1746700vYS<Object> c1746700vYS2 = this.LL;
                                    PopupWindow popupWindow3 = c1746700vYS2.LJII;
                                    if (popupWindow3 != null) {
                                        C786410Ut5.i3(popupWindow3, c1746700vYS2.LIZIZ, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                                    }
                                    WeakReference<InterfaceC1746910vYn<Object>> weakReference = this.LL.LJIIIZ;
                                    if (weakReference != null && (interfaceC1746910vYn = weakReference.get()) != null) {
                                        interfaceC1746910vYn.LLJI(arrayList);
                                    }
                                }
                                C1746700vYS<Object> c1746700vYS3 = this.LL;
                                if (c1746700vYS3.LJ) {
                                    int width = c1746700vYS3.LIZIZ.getWidth();
                                    View view2 = c1746700vYS3.LJFF;
                                    if (view2 != null) {
                                        HandlerHook.viewPost(view2, new ARunnableS37S0101000_26(c1746700vYS3, width, 1));
                                    }
                                } else {
                                    PopupWindow popupWindow4 = c1746700vYS3.LJII;
                                    if (popupWindow4 != null) {
                                        int width2 = c1746700vYS3.LIZIZ.getWidth();
                                        PopupWindow popupWindow5 = this.LL.LJII;
                                        if (popupWindow5 != null) {
                                            height = popupWindow5.getHeight();
                                        }
                                        popupWindow4.update(width2, height);
                                    }
                                }
                            }
                        }
                    } else {
                        PopupWindow popupWindow6 = this.LL.LJII;
                        if (popupWindow6 != null && popupWindow6.isShowing() && (popupWindow = this.LL.LJII) != null) {
                            popupWindow.dismiss();
                        }
                    }
                } else {
                    this.LL.LIZJ.LIZ();
                }
                C1C7U.LIZIZ("OneSearchHelper@14de.handler$1");
            }

            {
                this.LL = this;
            }
        };
    }
}
