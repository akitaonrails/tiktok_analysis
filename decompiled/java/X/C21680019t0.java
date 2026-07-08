package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.19t0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21680019t0 implements InterfaceC21681019tA {
    public final C21679919sz LIZ;
    public final InterfaceC21654919ox LIZIZ;
    public final List<WeakReference<RecyclerView>> LIZJ = new ArrayList();
    public final IdentityHashMap<RecyclerView.ViewHolder, C21680219t2> LIZLLL = new IdentityHashMap<>();
    public final List<C21680219t2> LJ = new ArrayList();
    public C21680319t3 LJFF = new C21680319t3();
    public final C0JEK LJI;
    public final InterfaceC21680419t4 LJII;

    public final void LIZIZ() {
        C18QP c18qp;
        Iterator it2 = ((ArrayList) this.LJ).iterator();
        while (true) {
            if (!it2.hasNext()) {
                c18qp = C18QP.ALLOW;
                break;
            }
            C21680219t2 c21680219t2 = (C21680219t2) it2.next();
            C18QP c18qp2 = c21680219t2.LIZJ.mStateRestorationPolicy;
            c18qp = C18QP.PREVENT;
            if (c18qp2 == c18qp || (c18qp2 == C18QP.PREVENT_WHEN_EMPTY && c21680219t2.LJ == 0)) {
                break;
            }
        }
        C21679919sz c21679919sz = this.LIZ;
        if (c18qp != c21679919sz.mStateRestorationPolicy) {
            c21679919sz.LLLII(c18qp);
        }
    }

    public final int LIZJ(C21680219t2 c21680219t2) {
        C21680219t2 c21680219t22;
        Iterator it2 = ((ArrayList) this.LJ).iterator();
        int i = 0;
        while (it2.hasNext() && (c21680219t22 = (C21680219t2) it2.next()) != c21680219t2) {
            i += c21680219t22.LJ;
        }
        return i;
    }

    public final C21680319t3 LIZLLL(int i) {
        C21680319t3 c21680319t3 = this.LJFF;
        if (c21680319t3.LIZJ) {
            c21680319t3 = new C21680319t3();
        } else {
            c21680319t3.LIZJ = true;
        }
        Iterator it2 = ((ArrayList) this.LJ).iterator();
        int i2 = i;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C21680219t2 c21680219t2 = (C21680219t2) it2.next();
            int i3 = c21680219t2.LJ;
            if (i3 > i2) {
                c21680319t3.LIZ = c21680219t2;
                c21680319t3.LIZIZ = i2;
                break;
            }
            i2 -= i3;
        }
        if (c21680319t3.LIZ != null) {
            return c21680319t3;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Cannot find wrapper for ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final C21680219t2 LJ(RecyclerView.ViewHolder viewHolder) {
        C21680219t2 c21680219t2 = this.LIZLLL.get(viewHolder);
        if (c21680219t2 != null) {
            return c21680219t2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Cannot find wrapper for ");
        sbLIZ.append(viewHolder);
        sbLIZ.append(", seems like it is not bound by this adapter: ");
        sbLIZ.append(this);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final int LJFF(AbstractC21673619ry<RecyclerView.ViewHolder> abstractC21673619ry) {
        int size = ((ArrayList) this.LJ).size();
        for (int i = 0; i < size; i++) {
            if (((C21680219t2) ListProtector.get(this.LJ, i)).LIZJ == abstractC21673619ry) {
                return i;
            }
        }
        return -1;
    }

    public C21680019t0(C21679919sz c21679919sz, C0JEI c0jei) {
        this.LIZ = c21679919sz;
        if (c0jei.LIZ) {
            this.LIZIZ = new C21654619ou();
        } else {
            this.LIZIZ = new C21654719ov();
        }
        C0JEK c0jek = c0jei.LIZIZ;
        this.LJI = c0jek;
        if (c0jek == C0JEK.NO_STABLE_IDS) {
            this.LJII = new InterfaceC21680419t4() { // from class: X.19t6
                public final C21680819t8 LIZ = new InterfaceC21465518zV() { // from class: X.19t8
                    @Override // X.InterfaceC21465518zV
                    public final long LIZ(long j) {
                        return -1L;
                    }
                };

                @Override // X.InterfaceC21680419t4
                public final InterfaceC21465518zV LIZ() {
                    return this.LIZ;
                }
            };
        } else if (c0jek == C0JEK.ISOLATED_STABLE_IDS) {
            this.LJII = new C21465418zU();
        } else {
            if (c0jek == C0JEK.SHARED_STABLE_IDS) {
                this.LJII = new InterfaceC21680419t4() { // from class: X.19t7
                    public final C21680919t9 LIZ = new InterfaceC21465518zV() { // from class: X.19t9
                        @Override // X.InterfaceC21465518zV
                        public final long LIZ(long j) {
                            return j;
                        }
                    };

                    @Override // X.InterfaceC21680419t4
                    public final InterfaceC21465518zV LIZ() {
                        return this.LIZ;
                    }
                };
                return;
            }
            throw new IllegalArgumentException("unknown stable id mode");
        }
    }

    public final boolean LIZ(int i, AbstractC21673619ry<RecyclerView.ViewHolder> abstractC21673619ry) {
        if (i >= 0 && i <= ((ArrayList) this.LJ).size()) {
            if (this.LJI != C0JEK.NO_STABLE_IDS) {
                C08IF.LIZ("All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS", abstractC21673619ry.mHasStableIds);
            }
            int iLJFF = LJFF(abstractC21673619ry);
            if (iLJFF != -1 && ListProtector.get(this.LJ, iLJFF) != null) {
                return false;
            }
            C21680219t2 c21680219t2 = new C21680219t2(abstractC21673619ry, this, this.LIZIZ, this.LJII.LIZ());
            ListProtector.add(this.LJ, i, c21680219t2);
            Iterator it2 = ((ArrayList) this.LIZJ).iterator();
            while (it2.hasNext()) {
                RecyclerView recyclerView = (RecyclerView) ((Reference) it2.next()).get();
                if (recyclerView != null) {
                    abstractC21673619ry.onAttachedToRecyclerView(recyclerView);
                }
            }
            if (c21680219t2.LJ > 0) {
                this.LIZ.notifyItemRangeInserted(LIZJ(c21680219t2), c21680219t2.LJ);
            }
            LIZIZ();
            return true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Index must be between 0 and ");
        sbLIZ.append(((ArrayList) this.LJ).size());
        sbLIZ.append(". Given:");
        sbLIZ.append(i);
        throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
