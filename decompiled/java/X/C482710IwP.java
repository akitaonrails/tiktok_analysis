package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0IwP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C482710IwP extends AbstractC1585810rMx implements InterfaceC21676519sR {
    public static boolean LLJI;
    public final RecyclerView LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public int LLILZ;
    public boolean LLILZIL;
    public int LLILZLL;
    public InterfaceC482720IwQ LLIZ;
    public int LLIZLLLIL = -1;
    public final C482730IwR LLJ = new InterfaceC482780IwW() { // from class: X.0IwR
        @Override // X.InterfaceC482780IwW
        public final void LJLIIIL() {
            this.LIZ.LLILZIL = false;
        }

        @Override // X.InterfaceC482780IwW
        public final void onPlayEnd() {
            this.LIZ.LJJIL(0);
        }
    };

    @Override // X.InterfaceC21676519sR
    public final void m3(View view) {
    }

    public final void onResume() {
        if (this.LLILLJJLI) {
            this.LLILLL = true;
            InterfaceC482720IwQ interfaceC482720IwQ = this.LLIZ;
            if (interfaceC482720IwQ != null) {
                interfaceC482720IwQ.o1(this.LLJ);
            } else {
                LJJIL(0);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0IwR] */
    public C482710IwP(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        this.LL = viewOnAttachStateChangeListenerC20604515jv;
    }

    public final void LJJIJIIJIL(InterfaceC482720IwQ interfaceC482720IwQ) {
        int position;
        this.LLILZIL = true;
        if (interfaceC482720IwQ != null) {
            interfaceC482720IwQ.o1(this.LLJ);
        }
        InterfaceC482720IwQ interfaceC482720IwQ2 = this.LLIZ;
        if (interfaceC482720IwQ2 != null) {
            interfaceC482720IwQ2.LJJL();
        }
        this.LLIZ = interfaceC482720IwQ;
        if (interfaceC482720IwQ != null) {
            position = interfaceC482720IwQ.getPosition();
        } else {
            position = -1;
        }
        this.LLIZLLLIL = position;
    }

    public final void LJJIL(int i) {
        int iIntValue;
        int iIntValue2;
        int i2;
        int iIndexOf;
        InterfaceC482720IwQ interfaceC482720IwQ;
        int iIntValue3;
        int iIntValue4;
        Pair pair;
        if (!this.LLILLL) {
            InterfaceC482720IwQ interfaceC482720IwQ2 = this.LLIZ;
            if (interfaceC482720IwQ2 != null) {
                interfaceC482720IwQ2.LJJL();
            }
            this.LLIZ = null;
            return;
        }
        RecyclerView.LayoutManager layoutManager = this.LL.getLayoutManager();
        if (layoutManager != null) {
            if (layoutManager instanceof GridLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                pair = new Pair(Integer.valueOf(linearLayoutManager.findFirstVisibleItemPosition()), Integer.valueOf(linearLayoutManager.findLastVisibleItemPosition()));
            } else {
                if (layoutManager instanceof StaggeredGridLayoutManager) {
                    StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                    int[] iArrLJIJ = staggeredGridLayoutManager.LJIJ(null);
                    int[] iArrLJIJJ = staggeredGridLayoutManager.LJIJJ(null);
                    Integer numLJJJJLL = C13LQ.LJJJJLL(iArrLJIJ);
                    if (numLJJJJLL != null) {
                        iIntValue3 = numLJJJJLL.intValue();
                    } else {
                        iIntValue3 = -1;
                    }
                    Integer numLJJJJJL = C13LQ.LJJJJJL(iArrLJIJJ);
                    if (numLJJJJJL != null) {
                        iIntValue4 = numLJJJJJL.intValue();
                    } else {
                        iIntValue4 = -1;
                    }
                    pair = new Pair(Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue4));
                }
                iIntValue = -1;
                iIntValue2 = -1;
            }
            iIntValue = ((Number) pair.getFirst()).intValue();
            iIntValue2 = ((Number) pair.getSecond()).intValue();
        } else {
            iIntValue = -1;
            iIntValue2 = -1;
        }
        Rect rect = new Rect();
        this.LL.getGlobalVisibleRect(rect);
        ArrayList arrayList = new ArrayList();
        if (iIntValue <= iIntValue2) {
            int i3 = iIntValue;
            while (true) {
                Object objFindViewHolderForAdapterPosition = this.LL.findViewHolderForAdapterPosition(i3);
                if ((objFindViewHolderForAdapterPosition instanceof InterfaceC482720IwQ) && (interfaceC482720IwQ = (InterfaceC482720IwQ) objFindViewHolderForAdapterPosition) != null && interfaceC482720IwQ.g1(rect)) {
                    arrayList.add(interfaceC482720IwQ);
                }
                if (i3 == iIntValue2) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        if (C13LP.LJJJJ(this.LLIZ, arrayList) && iIntValue <= (i2 = this.LLIZLLLIL) && i2 <= iIntValue2) {
            if (i != -1) {
                if (i == 1 && (iIndexOf = arrayList.indexOf(this.LLIZ)) < arrayList.size() - 1 && !this.LLILZIL) {
                    LJJIJIIJIL((InterfaceC482720IwQ) ListProtector.get(arrayList, iIndexOf + 1));
                    return;
                }
                return;
            }
            int iIndexOf2 = arrayList.indexOf(this.LLIZ);
            if (iIndexOf2 <= 0 || this.LLILZIL) {
                return;
            }
            LJJIJIIJIL((InterfaceC482720IwQ) ListProtector.get(arrayList, iIndexOf2 - 1));
            return;
        }
        if (i != -1) {
            if (i != 0 && i != 1) {
                return;
            }
            LJJIJIIJIL((InterfaceC482720IwQ) C13LP.LJJJLL(arrayList));
            return;
        }
        LJJIJIIJIL((InterfaceC482720IwQ) C13LP.LJJLIIIJL(arrayList));
    }

    @Override // X.InterfaceC21676519sR
    public final void g5(View view) {
        if (this.LLILZLL == 0) {
            LJJIL(0);
        }
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        this.LLILZLL = i;
        if (i == 0) {
            if (this.LLILZ >= 0) {
                LJJIL(1);
            } else {
                LJJIL(-1);
            }
            this.LLILZ = 0;
        }
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        this.LLILZ += i2;
    }
}
