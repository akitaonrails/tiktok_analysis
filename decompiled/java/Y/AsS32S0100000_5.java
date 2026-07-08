package Y;

import X.AbstractC1585810rMx;
import X.C0E48;
import X.C0EBX;
import X.C0EDF;
import X.C0EFO;
import X.C0EJ9;
import X.C0EJZ;
import X.C0F30;
import X.C0LAB;
import X.C106900ap;
import X.C13BV;
import X.C13LP;
import X.C15438062q;
import X.C20684815ws;
import X.C357590E0f;
import X.C361100EDs;
import X.C361680EFy;
import X.C361980EHc;
import X.C370320EfW;
import X.C560530Lyd;
import X.C814420VxA;
import X.InterfaceC361900EGu;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.capabilities.video.speed.curve.CurveSpeedFragment;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes6.dex */
public class AsS32S0100000_5 extends AbstractC1585810rMx {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        switch (this.$t) {
            case 0:
                LJJIIJ$0(this, recyclerView, i);
                break;
            case 1:
                LJJIIJ$1(this, recyclerView, i);
                break;
            case 2:
                LJJIIJ$2(this, recyclerView, i);
                break;
            case 3:
                LJJIIJ$3(this, recyclerView, i);
                break;
            case 4:
                LJJIIJ$4(this, recyclerView, i);
                break;
            case 5:
                LJJIIJ$5(this, recyclerView, i);
                break;
            case 6:
                LJJIIJ$6(this, recyclerView, i);
                break;
            default:
                super.LJJIIJ(recyclerView, i);
                break;
        }
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        switch (this.$t) {
            case 2:
                LJJIIZI$0(this, recyclerView, i, i2);
                break;
            case 3:
            case 4:
            default:
                super.LJJIIZI(recyclerView, i, i2);
                break;
            case 5:
                LJJIIZI$1(this, recyclerView, i, i2);
                break;
        }
    }

    public AsS32S0100000_5(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJJIIJ$0(AsS32S0100000_5 asS32S0100000_5, RecyclerView recyclerView, int i) {
        C0EBX c0ebx;
        VideoPublishEditModel videoPublishEditModel;
        if (i == 0 && (videoPublishEditModel = (c0ebx = (C0EBX) asS32S0100000_5.l0).LLJJIJIL) != null) {
            List listLLIIII = C13LP.LLIIII(C13LP.LLIIJI(c0ebx.LLJLILLLLZIIL));
            ArrayList arrayList = new ArrayList();
            for (Object obj : listLLIIII) {
                if (true ^ a0.LJJJIL((String) obj)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            C0E48 c0e48LIZIZ = c0ebx.LIZIZ();
            if (c0e48LIZIZ != null) {
                C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModel, c0e48LIZIZ, new Pair(-1, -1));
                c0labLJFF.LJ("music_id", videoPublishEditModel.getMusicId());
                c0labLJFF.LJ("enter_from", videoPublishEditModel.getEnterFrom());
                c0labLJFF.LIZ(1, "is_editor_pro");
                c0labLJFF.LIZ(size, "scroll_cnt");
                C20684815ws.LJIILLIIL("scroll_transition", c0labLJFF.LIZ);
            }
            c0ebx.LLJLILLLLZIIL.clear();
        }
    }

    public static final void LJJIIJ$1(AsS32S0100000_5 asS32S0100000_5, RecyclerView recyclerView, int i) {
        if (i == 1) {
            ((C0EFO) asS32S0100000_5.l0).LLLLIL().LIZLLL.invoke();
        }
    }

    public static final void LJJIIJ$2(AsS32S0100000_5 asS32S0100000_5, RecyclerView recyclerView, int i) {
        if (i != 0) {
            if (i == 1) {
                ((C0F30) asS32S0100000_5.l0).LLJ = false;
            }
        } else {
            C0F30 c0f30 = (C0F30) asS32S0100000_5.l0;
            c0f30.LLJ = true;
            C560530Lyd<Long> onScrollTouchUp = c0f30.getOnScrollTouchUp();
            C0F30 c0f302 = (C0F30) asS32S0100000_5.l0;
            onScrollTouchUp.LJIIJ(Long.valueOf(C814420VxA.LIZJ(c0f302.LLIZ / c0f302.LLILZ)));
        }
    }

    public static final void LJJIIJ$3(AsS32S0100000_5 asS32S0100000_5, RecyclerView recyclerView, int i) {
        RecyclerView.LayoutManager layoutManager;
        LinearLayoutManager linearLayoutManager;
        int iFindFirstVisibleItemPosition;
        List list;
        LinearLayoutManager linearLayoutManager2;
        if (i == 0) {
            RecyclerView recyclerView2 = ((C0EJ9) asS32S0100000_5.l0).LLJJJJ;
            RecyclerView.LayoutManager layoutManager2 = null;
            if (recyclerView2 != null) {
                layoutManager = recyclerView2.getLayoutManager();
            } else {
                layoutManager = null;
            }
            if (layoutManager instanceof LinearLayoutManager) {
                linearLayoutManager = (LinearLayoutManager) layoutManager;
            } else {
                linearLayoutManager = null;
            }
            int iFindLastVisibleItemPosition = 0;
            if (linearLayoutManager != null) {
                iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            } else {
                iFindFirstVisibleItemPosition = 0;
            }
            RecyclerView recyclerView3 = ((C0EJ9) asS32S0100000_5.l0).LLJJJJ;
            if (recyclerView3 != null) {
                layoutManager2 = recyclerView3.getLayoutManager();
            }
            if ((layoutManager2 instanceof LinearLayoutManager) && (linearLayoutManager2 = (LinearLayoutManager) layoutManager2) != null) {
                iFindLastVisibleItemPosition = linearLayoutManager2.findLastVisibleItemPosition();
            }
            C370320EfW c370320EfW = ((C0EJ9) asS32S0100000_5.l0).LLLF;
            if (c370320EfW == null || (list = c370320EfW.LL) == null) {
                list = C13BV.INSTANCE;
            }
            List listLIZ = C106900ap.LIZ(iFindFirstVisibleItemPosition, iFindLastVisibleItemPosition + 1, list);
            InterfaceC361900EGu interfaceC361900EGu = ((C0EJ9) asS32S0100000_5.l0).LLLFZ;
            if (interfaceC361900EGu != null) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZ, 10));
                Iterator it2 = listLIZ.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((C361980EHc) it2.next()).LJI);
                }
                interfaceC361900EGu.LIZIZ(arrayList);
            }
        }
    }

    public static final void LJJIIJ$4(AsS32S0100000_5 asS32S0100000_5, RecyclerView recyclerView, int i) {
        RecyclerView.LayoutManager layoutManager;
        LinearLayoutManager linearLayoutManager;
        int iFindFirstVisibleItemPosition;
        List list;
        LinearLayoutManager linearLayoutManager2;
        if (i == 0) {
            RecyclerView recyclerView2 = ((C0EJ9) asS32S0100000_5.l0).LLJJJIL;
            RecyclerView.LayoutManager layoutManager2 = null;
            if (recyclerView2 != null) {
                layoutManager = recyclerView2.getLayoutManager();
            } else {
                layoutManager = null;
            }
            if (layoutManager instanceof LinearLayoutManager) {
                linearLayoutManager = (LinearLayoutManager) layoutManager;
            } else {
                linearLayoutManager = null;
            }
            int iFindLastVisibleItemPosition = 0;
            if (linearLayoutManager != null) {
                iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            } else {
                iFindFirstVisibleItemPosition = 0;
            }
            RecyclerView recyclerView3 = ((C0EJ9) asS32S0100000_5.l0).LLJJJIL;
            if (recyclerView3 != null) {
                layoutManager2 = recyclerView3.getLayoutManager();
            }
            if ((layoutManager2 instanceof LinearLayoutManager) && (linearLayoutManager2 = (LinearLayoutManager) layoutManager2) != null) {
                iFindLastVisibleItemPosition = linearLayoutManager2.findLastVisibleItemPosition();
            }
            C370320EfW c370320EfW = ((C0EJ9) asS32S0100000_5.l0).LLL;
            if (c370320EfW == null || (list = c370320EfW.LL) == null) {
                list = C13BV.INSTANCE;
            }
            List listLIZ = C106900ap.LIZ(iFindFirstVisibleItemPosition, iFindLastVisibleItemPosition + 1, list);
            InterfaceC361900EGu interfaceC361900EGu = ((C0EJ9) asS32S0100000_5.l0).LLLFZ;
            if (interfaceC361900EGu != null) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZ, 10));
                Iterator it2 = listLIZ.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((C361980EHc) it2.next()).LJI);
                }
                interfaceC361900EGu.LIZIZ(arrayList);
            }
        }
    }

    public static final void LJJIIJ$5(AsS32S0100000_5 asS32S0100000_5, RecyclerView recyclerView, int i) {
        C0EJZ c0ejz = (C0EJZ) asS32S0100000_5.l0;
        c0ejz.LLJILJILJ = c0ejz.LLJILLL;
        c0ejz.LLJILLL = i;
    }

    public static final void LJJIIJ$6(AsS32S0100000_5 asS32S0100000_5, RecyclerView recyclerView, int i) {
        if (i == 1) {
            ((CurveSpeedFragment) asS32S0100000_5.l0).LLJ = true;
            recyclerView.removeOnScrollListener(asS32S0100000_5);
        }
    }

    public static final void LJJIIZI$0(AsS32S0100000_5 asS32S0100000_5, RecyclerView recyclerView, int i, int i2) {
        C0F30 c0f30;
        int i3;
        float translationX;
        C0F30 c0f302 = (C0F30) asS32S0100000_5.l0;
        if (c0f302.LLIZLLLIL) {
            if (c0f302.e0()) {
                c0f30 = (C0F30) asS32S0100000_5.l0;
                i3 = c0f30.LLIZ - i;
            } else {
                c0f30 = (C0F30) asS32S0100000_5.l0;
                i3 = c0f30.LLIZ + i;
            }
            c0f30.LLIZ = i3;
            C0F30 c0f303 = (C0F30) asS32S0100000_5.l0;
            if (c0f303.LLILZLL != null && c0f303.LLILZ != 0.0f) {
                c0f303.getCurStartTimeEvent().LJIIJ(Long.valueOf(C814420VxA.LIZJ(c0f303.LLIZ / c0f303.LLILZ)));
                C560530Lyd<Long> rangeSeekEvent = c0f303.getRangeSeekEvent();
                if (c0f303.e0()) {
                    translationX = c0f303.LLIZ - c0f303.LLILLJJLI.getTranslationX();
                } else {
                    translationX = c0f303.LLILLJJLI.getTranslationX() + c0f303.LLIZ;
                }
                rangeSeekEvent.LJIIJ(Long.valueOf(C814420VxA.LIZJ(translationX / c0f303.LLILZ)));
            }
            Function1<Integer, Unit> onScrollerChange = ((C0F30) asS32S0100000_5.l0).getOnScrollerChange();
            if (onScrollerChange != null) {
                onScrollerChange.invoke(Integer.valueOf(((C0F30) asS32S0100000_5.l0).LLIZ));
            }
        }
    }

    public static final void LJJIIZI$1(AsS32S0100000_5 asS32S0100000_5, RecyclerView recyclerView, int i, int i2) {
        C0EDF c0edf;
        RecyclerView recyclerView2;
        C0EDF c0edf2;
        C361100EDs resourceListAdapter;
        LinearLayoutManager linearLayoutManager;
        ResourceItem resourceItem;
        String str;
        C0EJZ c0ejz = (C0EJZ) asS32S0100000_5.l0;
        if (c0ejz.LLJJI) {
            c0ejz.LLJJI = false;
            return;
        }
        if ((c0ejz.LLJILJILJ != 0 || c0ejz.LLJILLL != 2) && (c0edf = c0ejz.LLJIJIL) != null && (recyclerView2 = c0edf.getRecyclerView()) != null && (c0edf2 = ((C0EJZ) asS32S0100000_5.l0).LLJIJIL) != null && (resourceListAdapter = c0edf2.getResourceListAdapter()) != null) {
            RecyclerView.LayoutManager layoutManager = recyclerView2.getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null && (resourceItem = (ResourceItem) C13LP.LJJJLZIJ(linearLayoutManager.findFirstVisibleItemPosition(), resourceListAdapter.LLLFZ())) != null) {
                C0EJZ c0ejz2 = (C0EJZ) asS32S0100000_5.l0;
                C357590E0f category = resourceItem.getCategory();
                if (category != null && (str = category.LIZIZ) != null) {
                    c0ejz2.LJ(str, false);
                }
            }
        }
    }
}
