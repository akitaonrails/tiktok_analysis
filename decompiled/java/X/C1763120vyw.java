package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: X.0vyw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1763120vyw extends AbstractC1763150vyz<AbstractC1763170vz1> {
    public final Object LLIZ;
    public final boolean LLIZLLLIL;
    public List<? extends AbstractC1763110vyv> LLJ;
    public final LinkedList<C1763130vyx> LLJI = new LinkedList<>();
    public final LinkedList<C1762660vyC> LLJIJIL = new LinkedList<>();
    public boolean LLJILJIL = true;
    public boolean LLJILJILJ;
    public int LLJILLL;
    public boolean LLJJ;
    public InterfaceC1765420w2e LLJJI;
    public InterfaceC1763180vz2 LLJJIII;
    public InterfaceC1763420vzQ LLJJIJI;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        List<? extends AbstractC1763110vyv> list = this.LLJ;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // X.AbstractC1763150vyz
    public final void onDestroy() {
        InterfaceC1484080ois interfaceC1484080oisLJ;
        for (C1763130vyx c1763130vyx : this.LLJI) {
            c1763130vyx.LLILLL.LIZ(true);
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("galleryVideoVH destroy, playState: ");
            sbLIZ.append(C1507750pL3.LIZ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c2341109Fh.getClass();
            C2341109Fh.LIZ(strLIZIZ);
            InterfaceC1508380pM4 interfaceC1508380pM4 = c1763130vyx.N5().LJIIIIZZ;
            if (interfaceC1508380pM4 != null && (interfaceC1484080oisLJ = interfaceC1508380pM4.LJ()) != null) {
                interfaceC1484080oisLJ.isPlaying();
            }
        }
        for (C1762660vyC c1762660vyC : this.LLJIJIL) {
            c1762660vyC.LLILLJJLI.LIZ(false);
            C1508390pM5 c1508390pM5 = c1762660vyC.LLILLL;
            if (c1508390pM5 == null) {
                c1508390pM5 = null;
            }
            c1508390pM5.LJIIIZ(c1762660vyC.LLILLJJLI);
        }
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        EnumC1761790vwn enumC1761790vwnLIZIZ;
        AbstractC1763110vyv abstractC1763110vyv;
        List<? extends AbstractC1763110vyv> list = this.LLJ;
        if (list == null || (abstractC1763110vyv = (AbstractC1763110vyv) ListProtector.get(list, i)) == null || (enumC1761790vwnLIZIZ = abstractC1763110vyv.LIZIZ()) == null) {
            enumC1761790vwnLIZIZ = EnumC1761790vwn.PHOTO;
        }
        if (enumC1761790vwnLIZIZ != EnumC1761790vwn.PHOTO) {
            if (enumC1761790vwnLIZIZ == EnumC1761790vwn.PHOTO_INFO) {
                return 4;
            }
            if (enumC1761790vwnLIZIZ == EnumC1761790vwn.VIDEO) {
                return 2;
            }
            if (enumC1761790vwnLIZIZ == EnumC1761790vwn.VIDEO_V2) {
                return 3;
            }
            return 1;
        }
        return 1;
    }

    @Override // X.AbstractC1763150vyz, X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        C1765450w2h c1765450w2h;
        InterfaceC1765420w2e interfaceC1765420w2e;
        InterfaceC1765420w2e interfaceC1765420w2e2;
        AbstractC1763170vz1 abstractC1763170vz1 = (AbstractC1763170vz1) viewHolder;
        super.onViewAttachedToWindow(abstractC1763170vz1);
        abstractC1763170vz1.onViewAttachedToWindow();
        C1765440w2g c1765440w2g = null;
        if (abstractC1763170vz1 instanceof C1765440w2g) {
            c1765440w2g = (C1765440w2g) abstractC1763170vz1;
        }
        if (c1765440w2g != null && (interfaceC1765420w2e2 = this.LLJJI) != null) {
            c1765440w2g.LLILLJJLI.LJI(interfaceC1765420w2e2);
        }
        if ((abstractC1763170vz1 instanceof C1765450w2h) && (c1765450w2h = (C1765450w2h) abstractC1763170vz1) != null && (interfaceC1765420w2e = this.LLJJI) != null) {
            c1765450w2h.LL.LJI(interfaceC1765420w2e);
        }
    }

    @Override // X.AbstractC1763150vyz, X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        C1765450w2h c1765450w2h;
        InterfaceC1765420w2e interfaceC1765420w2e;
        C1765440w2g c1765440w2g;
        InterfaceC1765420w2e interfaceC1765420w2e2;
        AbstractC1763170vz1 abstractC1763170vz1 = (AbstractC1763170vz1) viewHolder;
        super.onViewDetachedFromWindow(abstractC1763170vz1);
        abstractC1763170vz1.onViewDetachedFromWindow();
        C21649419o4 c21649419o4 = null;
        if ((abstractC1763170vz1 instanceof C1765440w2g) && (c1765440w2g = (C1765440w2g) abstractC1763170vz1) != null && (interfaceC1765420w2e2 = this.LLJJI) != null) {
            C21649419o4 c21649419o42 = c1765440w2g.LLILLJJLI.LLIZLLLIL;
            if (c21649419o42 == null) {
                c21649419o42 = null;
            }
            ((List) c21649419o42.LLLF.getValue()).remove(interfaceC1765420w2e2);
        }
        if ((abstractC1763170vz1 instanceof C1765450w2h) && (c1765450w2h = (C1765450w2h) abstractC1763170vz1) != null && (interfaceC1765420w2e = this.LLJJI) != null) {
            C21649419o4 c21649419o43 = c1765450w2h.LL.LLIZLLLIL;
            if (c21649419o43 != null) {
                c21649419o4 = c21649419o43;
            }
            ((List) c21649419o4.LLLF.getValue()).remove(interfaceC1765420w2e);
        }
    }

    public C1763120vyw(Object obj, boolean z) {
        this.LLIZ = obj;
        this.LLIZLLLIL = z;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        AbstractC1763110vyv abstractC1763110vyv;
        AbstractC1763170vz1 abstractC1763170vz1 = (AbstractC1763170vz1) viewHolder;
        List<? extends AbstractC1763110vyv> list = this.LLJ;
        if (list != null && (abstractC1763110vyv = (AbstractC1763110vyv) ListProtector.get(list, i)) != null) {
            C0H9H.LJI(this.LLJILLL, abstractC1763170vz1.itemView);
            abstractC1763170vz1.I5(abstractC1763110vyv);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        C1765440w2g c1765440w2g = new C1765440w2g((C21649519o5) C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bpq, viewGroup, false), this.LLJILJIL, false, 12);
                        c1765440w2g.LLILLL = this.LLJJIII;
                        viewHolder = c1765440w2g;
                    } else {
                        C1765450w2h c1765450w2h = new C1765450w2h((C21649519o5) C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bpr, viewGroup, false), this.LLJILJIL);
                        c1765450w2h.LLILZLL = this.LLJJIII;
                        viewHolder = c1765450w2h;
                    }
                } else {
                    C1762660vyC c1762660vyC = new C1762660vyC((C21649519o5) C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bps, viewGroup, false), this.LLIZ);
                    c1762660vyC.LLILZLL = this.LLJJIJI;
                    this.LLJIJIL.add(c1762660vyC);
                    viewHolder = c1762660vyC;
                }
            } else {
                C1763130vyx c1763130vyx = new C1763130vyx((C21649519o5) C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bps, viewGroup, false), this.LLIZ, this.LLIZLLLIL);
                c1763130vyx.LLIZ = this.LLJJIJI;
                this.LLJI.add(c1763130vyx);
                viewHolder = c1763130vyx;
            }
        } else {
            C1765440w2g c1765440w2g2 = new C1765440w2g((C21649519o5) C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bpq, viewGroup, false), this.LLJILJIL, this.LLJILJILJ, 4);
            c1765440w2g2.LLILLL = this.LLJJIII;
            viewHolder = c1765440w2g2;
        }
        try {
            View view = viewHolder.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        viewHolder.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(viewHolder.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(viewHolder.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = viewHolder.getClass().getName();
        return viewHolder;
    }
}
