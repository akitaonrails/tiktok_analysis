package X;

import Y.ARunnableS17S0101000_6;
import Y.ARunnableS65S0300000_32;
import Y.ATListenerS464S0100000_32;
import Y.AsS57S0100000_32;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.edit.aicover.AICoverInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.SoftKeyBoardListener;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.196S, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C196S extends FrameLayout {
    public static final int LLJJJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
    public static final int LLJJJJJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
    public static final double LLJJJJLIIL = C196H.LIZIZ();
    public static final double LLJJL = C196H.LIZIZ();
    public static final int LLJJLIIIJLLLLLLLZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26));
    public static final C01GW<Float> LLJL = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(104));
    public Activity LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public final C196T LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public Function1<? super Boolean, Unit> LLIZ;
    public InterfaceC214842196a LLIZLLLIL;
    public boolean LLJ;
    public C1322110kVd LLJI;
    public VideoPublishEditModel LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public float LLJILLL;
    public final RecyclerView LLJJ;
    public SoftKeyBoardListener LLJJI;
    public boolean LLJJIII;
    public final C214846196e LLJJIJI;
    public final C21688219uK LLJJIJIIJIL;
    public final C21688219uK LLJJIJIL;
    public C196N LLJJJ;
    public LinearLayout LLJJJIL;

    private final C196T getAdapter() {
        return (C196T) this.LLJJ.getAdapter();
    }

    public final boolean LIZ() {
        VideoPublishEditModel videoPublishEditModel = this.LLJIJIL;
        int i = ((videoPublishEditModel == null || !C1428470nHB.LLIIIILZ(videoPublishEditModel)) && !C573570MeZ.LIZ()) ? 2 : 1;
        if (!this.LLILLL) {
            i++;
        }
        return this.LLILZ.getItemCount() > i;
    }

    public final void LIZJ() {
        C196T adapter = getAdapter();
        adapter.LLJJJ = false;
        adapter.LLJJJIL = false;
    }

    public final boolean getCoverInSynthesis() {
        return this.LLJILJILJ;
    }

    public final LinearLayout getDeleteContainer() {
        return this.LLJJJIL;
    }

    public final VideoPublishEditModel getEditModel() {
        return this.LLJIJIL;
    }

    public final SoftKeyBoardListener getKeyBoardMonitor() {
        return this.LLJJI;
    }

    public final boolean getKeyboardDrivenResizeLocked() {
        return this.LLJJIII;
    }

    public final InterfaceC1391500mJY getOnSoftKeyBoardChangeListener() {
        return this.LLJJIJI;
    }

    public final Activity getRootActivity() {
        return this.LL;
    }

    public final float getThumbnailImageSizeMultiple() {
        return this.LLJILLL;
    }

    public final C196N getThumbnailOperationCallback() {
        return this.LLJJJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038 A[PHI: r2
      0x0038: PHI (r2v1 int) = (r2v0 int), (r2v5 int) binds: [B:16:0x0035, B:5:0x000c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(int r5) {
        /*
            r4 = this;
            X.196T r3 = r4.getAdapter()
            int r1 = r3.LLLL()
            r0 = 1
            if (r1 != 0) goto L34
            r2 = 1
        Lc:
            if (r1 > r5) goto L38
        Le:
            int r5 = r5 + r0
            if (r5 < r2) goto L3a
            java.util.List<X.196X> r0 = r3.LLILLL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r5 >= r0) goto L3a
            java.util.List<X.196X> r1 = r3.LLILLL
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.remove(r1, r5)
            com.bytedance.mt.protector.impl.collections.ListProtector.add(r1, r2, r0)
            r3.LLLLLIL()
            r3.LLLLIILLL()
            if (r2 > r5) goto L3a
        L2c:
            r3.notifyItemChanged(r2)
            if (r2 == r5) goto L3a
            int r2 = r2 + 1
            goto L2c
        L34:
            r2 = 0
            if (r1 < 0) goto L38
            goto Lc
        L38:
            r0 = 0
            goto Le
        L3a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196S.LIZIZ(int):void");
    }

    public final void LIZLLL(boolean z) {
        float fLIZ;
        LinearLayoutManager linearLayoutManager;
        if (z) {
            fLIZ = C196H.LIZ();
        } else {
            fLIZ = 1.0f;
        }
        int i = 0;
        if (this.LLJILLL == fLIZ) {
            return;
        }
        this.LLJILLL = fLIZ;
        RecyclerView.LayoutManager layoutManager = this.LLJJ.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            C196T adapter = getAdapter();
            adapter.LLJJJJ = fLIZ;
            if (adapter.LLJJJ) {
                adapter.LLJJJ = false;
                adapter.LLJJJIL = true;
                return;
            }
            if (adapter.LLJJJIL) {
                adapter.LLJJJ = false;
                adapter.LLJJJIL = false;
                return;
            }
            for (Object obj : (ArrayList) adapter.LLILLL) {
                int i2 = i + 1;
                if (i >= 0) {
                    C196X c196x = (C196X) obj;
                    c196x.LJFF = true;
                    c196x.LJI = fLIZ;
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            adapter.LLJJIII = Integer.valueOf(iFindFirstVisibleItemPosition);
            adapter.LLJJIJI = Integer.valueOf(iFindLastVisibleItemPosition);
            adapter.notifyDataSetChanged();
        }
    }

    public final void LJFF(AICoverInfo aICoverInfo) {
        Integer numValueOf;
        boolean z;
        boolean z2;
        C196T adapter = getAdapter();
        int size = ((ArrayList) adapter.LLILLL).size();
        int iLLLL = adapter.LLLL();
        AICoverInfo aICoverInfo2 = adapter.LLILZIL;
        Integer numValueOf2 = null;
        if (aICoverInfo2 != null) {
            numValueOf = Integer.valueOf(aICoverInfo2.getInsertIndex());
        } else {
            numValueOf = null;
        }
        boolean zLLLLIILL = adapter.LLLLIILL();
        adapter.LLILZIL = aICoverInfo;
        adapter.LLILLL = adapter.LLLJIL(adapter.LLILZ, adapter.LLJJJJJIL);
        int iLLLL2 = adapter.LLLL();
        boolean zLLLLIILL2 = adapter.LLLLIILL();
        if (iLLLL != iLLLL2) {
            z = true;
        } else {
            z = false;
        }
        if (iLLLL >= 0 && iLLLL2 >= 0 && z) {
            z2 = true;
        } else {
            z2 = false;
        }
        C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateAiCoverInfo: oldSize=");
        sbLIZ.append(size);
        sbLIZ.append(", newSize=");
        sbLIZ.append(((ArrayList) adapter.LLILLL).size());
        sbLIZ.append(", oldDisplayIndex=");
        sbLIZ.append(iLLLL);
        sbLIZ.append(", newDisplayIndex=");
        sbLIZ.append(iLLLL2);
        sbLIZ.append(", oldInsertIndex=");
        sbLIZ.append(numValueOf);
        sbLIZ.append(", newInsertIndex=");
        if (aICoverInfo != null) {
            numValueOf2 = Integer.valueOf(aICoverInfo.getInsertIndex());
        }
        sbLIZ.append(numValueOf2);
        sbLIZ.append(", oldGenerating=");
        sbLIZ.append(zLLLLIILL);
        sbLIZ.append(", newGenerating=");
        sbLIZ.append(zLLLLIILL2);
        C201955140j.LIZJ(c830690WiJ, C2188811AlT.LIZIZ(sbLIZ));
        if (size != ((ArrayList) adapter.LLILLL).size()) {
            adapter.notifyDataSetChanged();
            C196R c196r = adapter.LLJIJIL;
            if (c196r != null) {
                c196r.LJIJ(adapter.LLLLIIL());
                return;
            }
            return;
        }
        if (z2) {
            adapter.notifyItemMoved(iLLLL, iLLLL2);
            adapter.notifyItemRangeChanged(Math.min(iLLLL, iLLLL2), Math.abs(iLLLL2 - iLLLL) + 1, new C196P());
        } else {
            if (z) {
                adapter.notifyDataSetChanged();
                return;
            }
            if (iLLLL2 < 0) {
                return;
            }
            if (zLLLLIILL && zLLLLIILL2) {
                adapter.notifyItemChanged(iLLLL2, new AnonymousClass0500(0));
            } else {
                adapter.notifyItemChanged(iLLLL2);
            }
        }
    }

    public final void setCoverInSynthesis(boolean z) {
        this.LLJILJILJ = z;
    }

    public final void setDeleteContainer(LinearLayout linearLayout) {
        this.LLJJJIL = linearLayout;
    }

    public final void setEditModel(VideoPublishEditModel videoPublishEditModel) {
        this.LLJIJIL = videoPublishEditModel;
    }

    public final void setKeyBoardMonitor(SoftKeyBoardListener softKeyBoardListener) {
        this.LLJJI = softKeyBoardListener;
    }

    public final void setKeyboardDrivenResizeLocked(boolean z) {
        this.LLJJIII = z;
    }

    public final void setOnAICoverItemListener(C196Q c196q) {
        getAdapter().LLIZLLLIL = c196q;
    }

    public final void setOnChooseCoverBtnClickListener(View.OnClickListener onClickListener) {
        getAdapter().LLJ = onClickListener;
    }

    public final void setOnItemClickListener(InterfaceC214845196d interfaceC214845196d) {
        getAdapter().LLILZLL = interfaceC214845196d;
    }

    public final void setOnItemCountChangeListener(C196R c196r) {
        C196T adapter = getAdapter();
        adapter.LLJIJIL = c196r;
        if (c196r != null) {
            c196r.LJIJ(adapter.LLLLIIL());
        }
    }

    public final void setOnItemDeleteListener(C196O c196o) {
        getAdapter().LLJI = c196o;
    }

    public final void setOnItemSwapListener(InterfaceC214842196a interfaceC214842196a) {
        this.LLIZLLLIL = interfaceC214842196a;
        getAdapter().LLIZ = interfaceC214842196a;
    }

    public final void setOnScrollEndListener(Function1<? super Boolean, Unit> function1) {
        this.LLIZ = function1;
    }

    public final void setPublishEditModel(VideoPublishEditModel videoPublishEditModel) {
        this.LLJIJIL = videoPublishEditModel;
    }

    public final void setRootActivity(Activity activity) {
        this.LL = activity;
    }

    public final void setThumbnailImageSizeMultiple(float f) {
        this.LLJILLL = f;
    }

    public final void setThumbnailOperationCallback(C196N c196n) {
        this.LLJJJ = c196n;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.196e] */
    public C196S(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C196T c196t = new C196T(new AwS576S0100000_32(this, 495), new AwS576S0100000_32(this, 496));
        this.LLILZ = c196t;
        this.LLILZLL = -1;
        this.LLJ = true;
        this.LLJILLL = 1.0f;
        RecyclerView recyclerView = new RecyclerView(context, attributeSet);
        recyclerView.setId(R.id.kfo);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        recyclerView.addItemDecoration(new C0DXR() { // from class: X.196I
            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView2, C21673919s1 c21673919s1) {
                int childAdapterPosition = recyclerView2.getChildAdapterPosition(view);
                if (childAdapterPosition == -1) {
                    return;
                }
                if (childAdapterPosition == 0) {
                    if (C444960Hcc.LIZJ(context)) {
                        rect.set(C196S.LLJJJJ, 0, C196S.LLJJJJJIL, 0);
                        return;
                    } else {
                        rect.set(C196S.LLJJJJJIL, 0, C196S.LLJJJJ, 0);
                        return;
                    }
                }
                if (childAdapterPosition == this.LLILZ.getItemCount() - 1) {
                    if (C444960Hcc.LIZJ(context)) {
                        rect.set(C196S.LLJJJJJIL, 0, C196S.LLJJJJ, 0);
                        return;
                    } else {
                        rect.set(C196S.LLJJJJ, 0, C196S.LLJJJJJIL, 0);
                        return;
                    }
                }
                int i = C196S.LLJJJJ;
                rect.set(i, 0, i, 0);
            }
        });
        recyclerView.addOnScrollListener(new AsS57S0100000_32(this, 2));
        recyclerView.setOnTouchListener(new ATListenerS464S0100000_32(this, 3));
        recyclerView.setAdapter(c196t);
        this.LLJJ = recyclerView;
        this.LLJJIJI = new InterfaceC1391500mJY() { // from class: X.196e
            @Override // X.InterfaceC1391500mJY
            public final void LLLL(int i) {
            }

            @Override // X.InterfaceC1391500mJY
            public final void LJJIIJ(int i) {
                if (this.LL.getKeyboardDrivenResizeLocked()) {
                    return;
                }
                C1450070nq1.LIZJ("backPublish", "keyboardShow");
                this.LL.LIZLLL(true);
            }

            @Override // X.InterfaceC1391500mJY
            public final void LJZI(int i) {
                if (this.LL.getKeyboardDrivenResizeLocked()) {
                    return;
                }
                this.LL.LIZLLL(false);
            }
        };
        this.LLJJIJIIJIL = new C21688219uK(new AbstractC21688119uJ() { // from class: X.196J
            @Override // X.AbstractC21688119uJ
            public final void LJIILL() {
            }

            @Override // X.AbstractC21688119uJ
            public final boolean LJIIIIZZ() {
                C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Long press drag enable? Swapping: ");
                sbLIZ.append(this.LIZJ.LLILZ);
                sbLIZ.append(".isSwapping Cover Syn:");
                sbLIZ.append(this.LIZJ.getCoverInSynthesis());
                C201955140j.LIZJ(c830690WiJ, C2188811AlT.LIZIZ(sbLIZ));
                C196S c196s = this.LIZJ;
                return (c196s.LLILZ.LLJJ || c196s.getCoverInSynthesis()) ? false : true;
            }

            @Override // X.AbstractC21688119uJ
            public final void LIZJ(RecyclerView recyclerView2, RecyclerView.ViewHolder viewHolder) {
                super.LIZJ(recyclerView2, viewHolder);
                HandlerHook.viewPost(recyclerView2, new ARunnableS17S0101000_6(viewHolder.getBindingAdapterPosition(), recyclerView2, 4));
                HandlerHook.viewPost(recyclerView2, new ARunnableS65S0300000_32(recyclerView2, this.LIZJ, viewHolder, 7));
            }

            @Override // X.AbstractC21688119uJ
            public final int LJFF(RecyclerView recyclerView2, RecyclerView.ViewHolder viewHolder) {
                return AbstractC21688119uJ.LJIIIZ(12, 0);
            }

            @Override // X.AbstractC21688119uJ
            public final void LJIILJJIL(RecyclerView.ViewHolder viewHolder, int i) {
                C196T c196t2 = this.LIZJ.LLILZ;
                if (viewHolder == null) {
                    return;
                }
                c196t2.LLLILZ(viewHolder);
            }

            @Override // X.AbstractC21688119uJ
            public final boolean LJIIL(RecyclerView recyclerView2, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
                this.LIZJ.LLILZ.LLLLJ(viewHolder, viewHolder2);
                return true;
            }

            @Override // X.AbstractC21688119uJ
            public final void LJIIJ(Canvas canvas, RecyclerView recyclerView2, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
                if (z) {
                    C786410Ut5.Ob(viewHolder.itemView, 1.2f);
                    C786410Ut5.pc(viewHolder.itemView, 1.2f);
                } else {
                    C786410Ut5.Ob(viewHolder.itemView, 1.0f);
                    C786410Ut5.pc(viewHolder.itemView, 1.0f);
                }
                super.LJIIJ(canvas, recyclerView2, viewHolder, f, f2, i, z);
            }
        });
        this.LLJJIJIL = new C21688219uK(new AbstractC21688119uJ() { // from class: X.196M
            public boolean LIZJ;
            public boolean LIZLLL;

            @Override // X.AbstractC21688119uJ
            public final void LJIILL() {
            }

            @Override // X.AbstractC21688119uJ
            public final boolean LJIIIIZZ() {
                C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Long press drag enable? Swapping: ");
                sbLIZ.append(this.LJ.LLILZ);
                sbLIZ.append(".isSwapping Cover Syn:");
                sbLIZ.append(this.LJ.getCoverInSynthesis());
                C201955140j.LIZJ(c830690WiJ, C2188811AlT.LIZIZ(sbLIZ));
                C196S c196s = this.LJ;
                return (c196s.LLILZ.LLJJ || c196s.getCoverInSynthesis()) ? false : true;
            }

            /* JADX WARN: Removed duplicated region for block: B:76:0x01a0  */
            @Override // X.AbstractC21688119uJ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZJ(androidx.recyclerview.widget.RecyclerView r9, androidx.recyclerview.widget.RecyclerView.ViewHolder r10) {
                /*
                    Method dump skipped, instruction units count: 435
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C196M.LIZJ(androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$ViewHolder):void");
            }

            @Override // X.AbstractC21688119uJ
            public final int LJFF(RecyclerView recyclerView2, RecyclerView.ViewHolder viewHolder) {
                if (!this.LJ.LLILZ.LLLJL(viewHolder.getBindingAdapterPosition())) {
                    return 0;
                }
                return AbstractC21688119uJ.LJIIIZ(15, 0);
            }

            /* JADX WARN: Removed duplicated region for block: B:56:0x0106 A[PHI: r1 r2
              0x0106: PHI (r1v13 int) = (r1v10 int), (r1v9 int) binds: [B:18:0x0083, B:15:0x006a] A[DONT_GENERATE, DONT_INLINE]
              0x0106: PHI (r2v4 int) = (r2v3 int), (r2v2 int) binds: [B:18:0x0083, B:15:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.AbstractC21688119uJ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LJIIJJI(androidx.recyclerview.widget.RecyclerView.ViewHolder r15, boolean r16) {
                /*
                    Method dump skipped, instruction units count: 366
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C196M.LJIIJJI(androidx.recyclerview.widget.RecyclerView$ViewHolder, boolean):void");
            }

            @Override // X.AbstractC21688119uJ
            public final void LJIILJJIL(RecyclerView.ViewHolder viewHolder, int i) {
                if (viewHolder != null && !this.LJ.LLILZ.LLLJL(viewHolder.getBindingAdapterPosition())) {
                    return;
                }
                C196T c196t2 = this.LJ.LLILZ;
                if (viewHolder == null) {
                    return;
                }
                c196t2.LLLILZ(viewHolder);
            }

            @Override // X.AbstractC21688119uJ
            public final boolean LJIIL(RecyclerView recyclerView2, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
                if (this.LIZJ) {
                    return false;
                }
                this.LJ.LLILZ.LLLLJ(viewHolder, viewHolder2);
                return true;
            }

            @Override // X.AbstractC21688119uJ
            public final void LJIIJ(Canvas canvas, RecyclerView recyclerView2, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
                int i2;
                int i3;
                boolean z2;
                boolean zLIZ;
                float f3;
                C196N thumbnailOperationCallback;
                boolean z3 = false;
                if (z) {
                    C196S c196s = this.LJ;
                    c196s.LLJ = true;
                    C196N thumbnailOperationCallback2 = c196s.getThumbnailOperationCallback();
                    if (thumbnailOperationCallback2 != null) {
                        thumbnailOperationCallback2.LIZIZ(this.LJ.LLJ);
                    }
                    viewHolder.itemView.setPivotX(0.0f);
                    viewHolder.itemView.setPivotY(0.0f);
                    if (C1428310nGv.LIZLLL(viewHolder.itemView).top < C1428310nGv.LIZLLL(this.LJ.getDeleteContainer()).bottom) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.LIZJ = z2;
                    if (((Boolean) C273280AnO.LIZ.getValue()).booleanValue()) {
                        zLIZ = this.LJ.LIZ();
                    } else {
                        zLIZ = true;
                    }
                    if (this.LIZJ && zLIZ) {
                        z3 = true;
                    }
                    C196S c196s2 = this.LJ;
                    if (c196s2.LLJ && (thumbnailOperationCallback = c196s2.getThumbnailOperationCallback()) != null) {
                        thumbnailOperationCallback.LIZLLL(z3);
                    }
                    if (z3) {
                        f3 = 0.5f;
                    } else {
                        f3 = 1.2f;
                    }
                    C786410Ut5.Ob(viewHolder.itemView, f3);
                    C786410Ut5.pc(viewHolder.itemView, f3);
                } else {
                    C786410Ut5.Ob(viewHolder.itemView, 1.0f);
                    C786410Ut5.pc(viewHolder.itemView, 1.0f);
                    if (this.LIZJ) {
                        this.LIZJ = false;
                        C196N thumbnailOperationCallback3 = this.LJ.getThumbnailOperationCallback();
                        if (thumbnailOperationCallback3 != null) {
                            thumbnailOperationCallback3.LIZJ();
                        }
                        VideoPublishEditModel editModel = this.LJ.getEditModel();
                        if ((editModel != null && C1428470nHB.LLIIIILZ(editModel)) || C573570MeZ.LIZ()) {
                            i2 = 1;
                        } else {
                            i2 = 2;
                        }
                        C196S c196s3 = this.LJ;
                        if (c196s3.LLILLL) {
                            i3 = i2;
                        } else {
                            i3 = i2 + 1;
                        }
                        if (c196s3.LLILZ.getItemCount() <= i3) {
                            C196S c196s4 = this.LJ;
                            VideoPublishEditModel videoPublishEditModel = c196s4.LLJIJIL;
                            if (videoPublishEditModel != null) {
                                C1454040nwQ.LIZ.getClass();
                                C20684815ws.LJIILLIIL("photo_delete_reach_min_popup", C1454040nwQ.LIZJ(videoPublishEditModel, "video_post_page").LIZ);
                            }
                            String strJ4 = C786410Ut5.j4(C20642515q3.LJI(2131826404), Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1));
                            Activity activity = c196s4.LL;
                            if (activity != null) {
                                C1389890mGx c1389890mGx = new C1389890mGx(activity);
                                c1389890mGx.LJIIJ(strJ4);
                                c1389890mGx.LJIIJJI();
                            }
                        } else {
                            this.LIZLLL = true;
                            C786410Ut5.T4(viewHolder.itemView, 0.0f);
                        }
                    }
                }
                super.LJIIJ(canvas, recyclerView2, viewHolder, f, f2, i, z);
            }
        });
        addView(recyclerView, new FrameLayout.LayoutParams(-1, -1, 16));
    }

    public final void LJI(int i, C196X c196x) {
        int i2;
        C196T adapter = getAdapter();
        int iLLLL = adapter.LLLL();
        if (iLLLL >= 0 && iLLLL <= i) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i3 = i + i2;
        if (i3 >= 0 && i3 < ((ArrayList) adapter.LLILLL).size()) {
            ListProtector.set(adapter.LLILLL, i3, c196x);
            adapter.LLLLLIL();
            adapter.notifyItemChanged(i3);
        }
    }

    public final void LJ(List<C196X> list, boolean z, AICoverInfo aICoverInfo) {
        this.LLJILJIL = z;
        C196T adapter = getAdapter();
        adapter.getClass();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C196X c196x : list) {
            arrayList.add(new C196X(c196x.LIZ, c196x.LIZIZ, c196x.LIZJ, c196x.LIZLLL, c196x.LJ, c196x.LJFF, adapter.LLJJJJ, c196x.LJII, c196x.LJIIIIZZ, c196x.LJIIIZ));
        }
        adapter.LLILZ = arrayList;
        adapter.LLJJJJJIL = z;
        adapter.LLILZIL = aICoverInfo;
        adapter.LLILLL = adapter.LLLJIL(arrayList, z);
        adapter.notifyDataSetChanged();
        C196R c196r = adapter.LLJIJIL;
        if (c196r != null) {
            c196r.LJIJ(adapter.LLLLIIL());
        }
    }
}
