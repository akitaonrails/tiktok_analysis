package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0gou, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1180300gou extends AbstractC1181640gr4 implements InterfaceC1181650gr5 {
    public int LLILLJJLI = -1;
    public RecyclerView LLILLL;

    public final BaseComponentData LJJIFFI(int i) {
        C20600815jK<InterfaceC1891350zJl> state;
        int iLJIIIIZZ;
        InterfaceC1891350zJl interfaceC1891350zJlLJI;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvLt;
        InterfaceC1181010gq3 interfaceC1181010gq3 = this.LL;
        if (interfaceC1181010gq3 != null && (viewOnAttachStateChangeListenerC20604515jvLt = interfaceC1181010gq3.Lt()) != null) {
            state = viewOnAttachStateChangeListenerC20604515jvLt.getState();
            if (state != null) {
                iLJIIIIZZ = state.LJIIIIZZ();
            }
            if (i >= iLJIIIIZZ && i >= 0) {
                if (state != null) {
                    interfaceC1891350zJlLJI = state.LJI(i);
                } else {
                    interfaceC1891350zJlLJI = null;
                }
                if (!(interfaceC1891350zJlLJI instanceof BaseComponentData)) {
                    return null;
                }
                return (BaseComponentData) interfaceC1891350zJlLJI;
            }
        }
        state = null;
        iLJIIIIZZ = 0;
        return i >= iLJIIIIZZ ? null : null;
    }

    @Override // X.InterfaceC1181650gr5
    public final void LLF(RecyclerView recyclerView, int i) {
        List<InterfaceC1174130gex> listQN;
        this.LLILLL = recyclerView;
        InterfaceC1181010gq3 interfaceC1181010gq3 = this.LL;
        if (interfaceC1181010gq3 != null && (listQN = interfaceC1181010gq3.qN()) != null) {
            Iterator<InterfaceC1174130gex> it2 = listQN.iterator();
            while (it2.hasNext()) {
                it2.next().LJJJJJ(i);
            }
        }
    }

    @Override // X.InterfaceC1181650gr5
    public final void LLFF(RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager;
        int iFindFirstVisibleItemPosition;
        List<InterfaceC1174130gex> listQN;
        int itemCount;
        LinearLayoutManager linearLayoutManager2;
        View viewFindViewByPosition;
        LinearLayoutManager linearLayoutManager3;
        int iFindFirstVisibleItemPosition2;
        C1186840gzS c1186840gzSLw1;
        C1180090goZ c1180090goZ;
        C056A c056a;
        RecyclerView recyclerView2 = this.LLILLL;
        String str = null;
        if (recyclerView2 != null) {
            RecyclerView.LayoutManager layoutManager = recyclerView2.getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager3 = (LinearLayoutManager) layoutManager) != null && (iFindFirstVisibleItemPosition2 = linearLayoutManager3.findFirstVisibleItemPosition()) >= 0 && iFindFirstVisibleItemPosition2 != this.LLILLJJLI) {
                this.LLILLJJLI = iFindFirstVisibleItemPosition2;
                BaseComponentData baseComponentDataLJJIFFI = LJJIFFI(iFindFirstVisibleItemPosition2);
                InterfaceC1181010gq3 interfaceC1181010gq3 = this.LL;
                if (interfaceC1181010gq3 != null && (c1186840gzSLw1 = interfaceC1181010gq3.lw1()) != null) {
                    int i3 = this.LLILLJJLI;
                    if (baseComponentDataLJJIFFI != null) {
                        str = baseComponentDataLJJIFFI.instanceId;
                        c1180090goZ = baseComponentDataLJJIFFI.componentType;
                    } else {
                        c1180090goZ = null;
                    }
                    if (i2 > 0) {
                        c056a = C056A.FINGER_UP;
                    } else {
                        c056a = C056A.FINGER_DOWN;
                    }
                    c1186840gzSLw1.LIZ(new C1183700guO(i3, str, c1180090goZ, c056a));
                }
            }
        }
        if ((recyclerView instanceof ViewOnAttachStateChangeListenerC20604515jv) && recyclerView != null) {
            RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
            if ((layoutManager2 instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager2) != null && (iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition()) >= 0) {
                ArrayList arrayList = new ArrayList();
                int i4 = iFindFirstVisibleItemPosition + 1;
                if (iFindFirstVisibleItemPosition <= i4) {
                    while (true) {
                        BaseComponentData baseComponentDataLJJIFFI2 = LJJIFFI(iFindFirstVisibleItemPosition);
                        if (baseComponentDataLJJIFFI2 != null) {
                            AbstractC21673619ry adapter = recyclerView.getAdapter();
                            if (adapter != null) {
                                itemCount = adapter.getItemCount();
                            } else {
                                itemCount = 0;
                            }
                            if (iFindFirstVisibleItemPosition >= 0) {
                                if (itemCount > iFindFirstVisibleItemPosition) {
                                    try {
                                        RecyclerView.LayoutManager layoutManager3 = recyclerView.getLayoutManager();
                                        if ((layoutManager3 instanceof LinearLayoutManager) && (linearLayoutManager2 = (LinearLayoutManager) layoutManager3) != null && (viewFindViewByPosition = linearLayoutManager2.findViewByPosition(iFindFirstVisibleItemPosition)) != null) {
                                            int[] iArr = new int[2];
                                            viewFindViewByPosition.getLocationInWindow(iArr);
                                            Integer numValueOf = Integer.valueOf(iArr[1]);
                                            if (numValueOf != null) {
                                                int iIntValue = numValueOf.intValue();
                                                String str2 = baseComponentDataLJJIFFI2.instanceId;
                                                if (str2 == null) {
                                                    str2 = "";
                                                }
                                                arrayList.add(new C1174050gep(iIntValue, str2));
                                            }
                                        }
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                    }
                                }
                            } else {
                                continue;
                                iFindFirstVisibleItemPosition++;
                            }
                        }
                        if (iFindFirstVisibleItemPosition == i4) {
                            break;
                        } else {
                            iFindFirstVisibleItemPosition++;
                        }
                    }
                }
                InterfaceC1181010gq3 interfaceC1181010gq32 = this.LL;
                if (interfaceC1181010gq32 != null && (listQN = interfaceC1181010gq32.qN()) != null) {
                    Iterator<InterfaceC1174130gex> it2 = listQN.iterator();
                    while (it2.hasNext()) {
                        it2.next().LIZLLL(arrayList);
                    }
                }
            }
        }
    }
}
