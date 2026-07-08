package X;

import Y.AObjectS240S0100000_5;
import Y.AObserverS209S0100000_5;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.tools.view.widget.ScrollCenterLayoutManager;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS132S0201000_5;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS59S0210000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0EBP, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EBP extends AbstractC360500EBk {
    public final VideoPublishEditModel LLJJIJIL;
    public final String LLJJJ;
    public final boolean LLJJJIL;
    public final C355530Dwl LLJJJJ;
    public final Activity LLJJJJJIL;
    public final C1DRG LLJJJJLIIL;
    public final boolean LLJJL;
    public final boolean LLJLILLLLZIIL;
    public C0EDF LLJLL;
    public C0ED1 LLJLLIL;
    public boolean LLJLLL;
    public C0EBS LLJZ;
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 464));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 465));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 463));
    public final List<Integer> LLJZIJLIL = new ArrayList();

    public final C0E48 LIZIZ() {
        return (C0E48) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    @Override // X.AbstractC360500EBk
    public final void LLLLIL() {
        C0EDF c0edf = this.LLJLL;
        if (c0edf != null) {
            c0edf.LIZLLL(true);
        }
    }

    public final InterfaceC358190E2n LLLLJ() {
        return (InterfaceC358190E2n) this.LLJL.getValue();
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onDestroyView() {
        RecyclerView recyclerView;
        C0EDF c0edf = this.LLJLL;
        if (c0edf != null) {
            c0edf.LLJ = null;
            c0edf.LLJI = null;
            c0edf.LLJIJIL = null;
        }
        C0EBS c0ebs = this.LLJZ;
        if (c0ebs != null && c0edf != null && (recyclerView = c0edf.getRecyclerView()) != null) {
            recyclerView.removeOnChildAttachStateChangeListener(c0ebs);
        }
        this.LLJZ = null;
        this.LLJJIJIIJIL = null;
        super.onDestroyView();
    }

    @Override // X.AbstractC360500EBk
    public final C0EDF LLLLIILL() {
        return this.LLJLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v24, types: [X.0EBS, X.19sR] */
    /* JADX WARN: Type inference failed for: r6v5, types: [X.09AY, kotlin.jvm.functions.Function1] */
    @Override // com.bytedance.scene.Scene
    public final void LLJJL(boolean z) {
        RecyclerView.LayoutManager layoutManager;
        int iFindFirstVisibleItemPosition;
        C361100EDs resourceListAdapter;
        ResourceItem resourceItem;
        LinearLayoutManager linearLayoutManager;
        RecyclerView recyclerView;
        LinearLayoutManager linearLayoutManager2;
        RecyclerView recyclerView2;
        RecyclerView.LayoutManager layoutManager2;
        int iFindFirstVisibleItemPosition2;
        int iFindLastVisibleItemPosition;
        C361100EDs resourceListAdapter2;
        ResourceItem resourceItem2;
        LinearLayoutManager linearLayoutManager3;
        RecyclerView recyclerView3;
        LinearLayoutManager linearLayoutManager4;
        RecyclerView recyclerView4;
        C0EJC c0ejc;
        C0EDU c0edu;
        int iLLLLILI;
        int iLLLLILI2;
        RecyclerView recyclerView5;
        if (z) {
            RecyclerView.LayoutManager layoutManager3 = null;
            int iFindLastVisibleItemPosition2 = 0;
            if (!this.LLJLLL && C0E47.LIZ()) {
                C0ED7 c0ed7 = new C0ED7();
                c0ed7.LJFF = this.LLJJJIL;
                c0ed7.LIZJ = "filtercomposer";
                c0ed7.LIZ = new ScrollCenterLayoutManager(requireView().getContext());
                if (C357780E0y.LIZ()) {
                    c0ejc = new C0EJC(8, true);
                } else {
                    c0ejc = new C0EJC(13, true);
                }
                c0ed7.LIZIZ = c0ejc;
                c0ed7.LJII = false;
                c0ed7.LJJ = true;
                c0ed7.LJJI = this.LLJLILLLLZIIL;
                if (C357780E0y.LIZ()) {
                    c0edu = new C0EDU(true, 81, 81, R.drawable.bog, R.raw.icon_control_fill, 0, 224);
                } else {
                    c0edu = new C0EDU(true, 62, 62, R.drawable.bof, R.raw.icon_control_fill, 0, 224);
                }
                c0ed7.LJIILL = c0edu;
                c0ed7.LJIIL = C0EBT.LIZ(this.LLJJJJJIL);
                C0EE1 c0ee1 = C0EE1.DOWN;
                if (C357780E0y.LIZ()) {
                    iLLLLILI = LLLLILI(R.attr.a1k);
                } else {
                    iLLLLILI = LLLLILI(R.attr.eg);
                }
                if (C357780E0y.LIZ()) {
                    iLLLLILI2 = LLLLILI(R.attr.a1h);
                } else {
                    iLLLLILI2 = LLLLILI(R.attr.ee);
                }
                C357780E0y.LIZ();
                c0ed7.LJIIJJI = new C361120EDu(false, iLLLLILI, iLLLLILI2, c0ee1, 4, 0, 0, 0.0f, new AwS549S0100000_5(this, 461), AFwS234S0000000_5.get$arr$(202), AFwS234S0000000_5.get$arr$(203), 1891);
                c0ed7.LJIILIIL = new C0EDB(126);
                c0ed7.LJIJJLI = new C0EDD(new AwS549S0100000_5(this, 462), new InterfaceC361150EDx() { // from class: X.0EBU
                    @Override // X.InterfaceC361150EDx
                    public final void LIZ() {
                    }

                    @Override // X.InterfaceC361150EDx
                    public final void LIZJ(View view) {
                        C19670811xi c19670811xi;
                        if ((view instanceof C19670911xj) && (c19670811xi = (C19670811xi) view) != null) {
                            c19670811xi.setProgress(100);
                        }
                    }

                    @Override // X.InterfaceC361150EDx
                    public final void LIZIZ(int i, View view) {
                        C19670811xi c19670811xi;
                        if ((view instanceof C19670911xj) && (c19670811xi = (C19670811xi) view) != null) {
                            c19670811xi.setProgress(i);
                        }
                    }
                }, 4);
                if (this.LLJJJIL) {
                    c0ed7.LIZLLL = this.LLJJJ;
                }
                final ?? r6 = this.LLJJIJIIJIL;
                final C0EDF c0edf = this.LLJLL;
                if (c0edf != null) {
                    c0edf.setResourceListInitListener(new C0EDS() { // from class: X.0E2m
                        @Override // X.C0EDS
                        public final List<ResourceItem> LIZ() {
                            return C13BV.INSTANCE;
                        }

                        @Override // X.C0EDS
                        public final List<ResourceItem> LIZJ(List<? extends ResourceItem> list) {
                            List<FilterBean> listLJIIIZ;
                            String string;
                            InterfaceC1639870sm9 interfaceC1639870sm9LIZIZ = C0CHQ.LIZ().LJJIL().LIZIZ();
                            if (this.LIZ.LLJJL) {
                                listLJIIIZ = interfaceC1639870sm9LIZIZ.LJIIIZ();
                            } else {
                                listLJIIIZ = C13BV.INSTANCE;
                            }
                            ArrayList arrayList = new ArrayList();
                            Iterator<FilterBean> it2 = listLJIIIZ.iterator();
                            while (it2.hasNext()) {
                                String resId = it2.next().getResId();
                                if (resId != null && resId.length() > 0) {
                                    arrayList.add(resId);
                                }
                            }
                            Set setLLIIJI = C13LP.LLIIJI(arrayList);
                            List list2 = (List) interfaceC1639870sm9LIZIZ.LJJI().LJI().getValue();
                            List list3 = list;
                            if (list2 != null) {
                                list3 = list;
                                if (!list2.isEmpty()) {
                                    ArrayList arrayList2 = new ArrayList();
                                    for (ResourceItem resourceItem3 : list) {
                                        ResourceItem resourceItem4 = resourceItem3;
                                        if (!setLLIIJI.contains(resourceItem4.getResourceId())) {
                                            Iterator it3 = list2.iterator();
                                            while (it3.hasNext()) {
                                                String resId2 = ((FilterBean) it3.next()).getResId();
                                                resId2.toString();
                                                if (Intrinsics.LJFF(resId2, resourceItem4.getResourceId())) {
                                                }
                                            }
                                        }
                                        arrayList2.add(resourceItem3);
                                    }
                                    list3 = arrayList2;
                                }
                            }
                            if (listLJIIIZ.isEmpty()) {
                                return list3;
                            }
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it4 = list3.iterator();
                            while (it4.hasNext()) {
                                String resourceId = ((ResourceItem) it4.next()).getResourceId();
                                if (resourceId != null && resourceId.length() > 0) {
                                    arrayList3.add(resourceId);
                                }
                            }
                            Set setLLIIJI2 = C13LP.LLIIJI(arrayList3);
                            ArrayList<FilterBean> arrayList4 = new ArrayList();
                            for (FilterBean filterBean : listLJIIIZ) {
                                FilterBean filterBean2 = filterBean;
                                if (C123100dR.LIZ(filterBean2.getResId()) && !setLLIIJI2.contains(filterBean2.getResId())) {
                                    arrayList4.add(filterBean);
                                }
                            }
                            C0EBP c0ebp = this.LIZ;
                            ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(arrayList4, 10));
                            for (FilterBean filterBean3 : arrayList4) {
                                c0ebp.getClass();
                                ResourceItem resourceItem5 = new ResourceItem();
                                String resId3 = filterBean3.getResId();
                                String str = "";
                                if (resId3 == null) {
                                    resId3 = "";
                                }
                                resourceItem5.setResourceId(resId3);
                                String id = filterBean3.getId();
                                if (id == null) {
                                    id = "";
                                }
                                resourceItem5.setEffectId(id);
                                String name = filterBean3.getName();
                                if (name == null) {
                                    name = "";
                                }
                                resourceItem5.setName(name);
                                String enName = filterBean3.getEnName();
                                if (enName == null) {
                                    enName = "";
                                }
                                resourceItem5.setNameEn(enName);
                                String filterFolder = filterBean3.getFilterFolder();
                                if (filterFolder == null) {
                                    filterFolder = "";
                                }
                                resourceItem5.setPath(filterFolder);
                                Uri thumbnailFileUri = filterBean3.getThumbnailFileUri();
                                if (thumbnailFileUri == null || (string = thumbnailFileUri.toString()) == null) {
                                    string = "";
                                }
                                if (a0.LJJJIL(string)) {
                                    String thumbnailFilePath = filterBean3.getThumbnailFilePath();
                                    if (thumbnailFilePath != null) {
                                        str = thumbnailFilePath;
                                    }
                                    string = str;
                                }
                                resourceItem5.setIcon(string);
                                resourceItem5.extra = filterBean3.getExtra();
                                resourceItem5.setOrder(0);
                                arrayList5.add(resourceItem5);
                            }
                            if (!arrayList5.isEmpty()) {
                                return C13LP.LJLIL(list3, arrayList5);
                            }
                            return list3;
                        }

                        @Override // X.C0EDS
                        public final void LIZIZ(boolean z2, boolean z3) {
                            C0EBP c0ebp;
                            C0ED1 c0ed1;
                            String strLJJJJJ;
                            NLETrackSlot nLETrackSlotLLLLLLIL;
                            List<ResourceItem> listLLLFZ;
                            C0ED1 c0ed12;
                            if (this.LIZ.mViewDestroyed) {
                                return;
                            }
                            if (z2) {
                                C0ED1 c0ed13 = this.LIZ.LLJLLIL;
                                if (c0ed13 != null) {
                                    c0ed13.LIZ();
                                }
                                C361100EDs resourceListAdapter3 = c0edf.getResourceListAdapter();
                                if (resourceListAdapter3 != null && ((ArrayList) resourceListAdapter3.LLLFZ()).isEmpty() && Intrinsics.LJFF(this.LIZ.LLJJJ, "Favorite") && (c0ed12 = this.LIZ.LLJLLIL) != null) {
                                    c0ed12.LIZIZ();
                                }
                                c0edf.LIZJ(6);
                                InterfaceC358190E2n interfaceC358190E2nLLLLJ = this.LIZ.LLLLJ();
                                if (interfaceC358190E2nLLLLJ != null) {
                                    String str = this.LIZ.LLJJJ;
                                    C361100EDs resourceListAdapter4 = c0edf.getResourceListAdapter();
                                    if (resourceListAdapter4 != null) {
                                        listLLLFZ = resourceListAdapter4.LLLFZ();
                                    } else {
                                        listLLLFZ = C13BV.INSTANCE;
                                    }
                                    interfaceC358190E2nLLLLJ.fl0(str, listLLLFZ);
                                }
                                C0EDF c0edf2 = c0edf;
                                C0EBP c0ebp2 = this.LIZ;
                                if (c0edf2.isLaidOut() && !c0edf2.isLayoutRequested()) {
                                    C0E48 c0e48LIZIZ = c0ebp2.LIZIZ();
                                    if (c0e48LIZIZ == null || (nLETrackSlotLLLLLLIL = c0e48LIZIZ.LLLLLLIL()) == null || (strLJJJJJ = C351220Dpo.LJJJJJ(nLETrackSlotLLLLLLIL)) == null) {
                                        strLJJJJJ = "";
                                    }
                                    C0EDF.LJIIL(c0edf2, strLJJJJJ, C0E17.DIRECT_SCROLL, 8);
                                } else {
                                    c0edf2.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC391520FWs(c0ebp2, c0edf2, 0));
                                }
                            } else {
                                C0ED1 c0ed14 = this.LIZ.LLJLLIL;
                                if (c0ed14 != null) {
                                    c0ed14.LIZLLL();
                                }
                                if (z3 && (c0ed1 = (c0ebp = this.LIZ).LLJLLIL) != null) {
                                    c0ed1.LJ(c0ebp.LLJJJJJIL);
                                }
                            }
                            Function1<Boolean, Unit> function1 = r6;
                            if (function1 != null) {
                                function1.invoke(Boolean.valueOf(z2));
                            }
                        }
                    });
                    c0edf.setOnItemClickListener(new C0E16() { // from class: X.0E15
                        @Override // X.C0E16, X.C0EDC
                        public final void LIZJ(ResourceItem resourceItem3) {
                            String enterFrom;
                            C0EBP c0ebp = this.LIZ;
                            Activity activity = c0ebp.LLJJJJJIL;
                            VideoPublishEditModel videoPublishEditModel = c0ebp.LLJJIJIL;
                            if (videoPublishEditModel == null || (enterFrom = videoPublishEditModel.getEnterFrom()) == null) {
                                enterFrom = "";
                            }
                            C2256508sl.LIZ(activity, enterFrom, new AwS371S0200000_5(resourceItem3, this.LIZ, 82));
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:32:0x006b, code lost:
                        
                            if (X.C289210BVf.LIZ(r2.LLJJIJIL) != false) goto L33;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:95:0x0188, code lost:
                        
                            if (0 == 0) goto L86;
                         */
                        /* JADX WARN: Removed duplicated region for block: B:122:0x0201  */
                        /* JADX WARN: Removed duplicated region for block: B:125:0x020d  */
                        /* JADX WARN: Removed duplicated region for block: B:128:0x0223  */
                        /* JADX WARN: Removed duplicated region for block: B:131:0x0240  */
                        /* JADX WARN: Removed duplicated region for block: B:134:0x024a  */
                        /* JADX WARN: Removed duplicated region for block: B:158:0x02a2 A[PHI: r9
                          0x02a2: PHI (r9v4 java.lang.String) = (r9v0 java.lang.String), (r9v5 java.lang.String) binds: [B:157:0x02a0, B:155:0x029d] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Removed duplicated region for block: B:160:0x02a8 A[PHI: r9
                          0x02a8: PHI (r9v3 java.lang.String) = (r9v0 java.lang.String), (r9v4 java.lang.String) binds: [B:157:0x02a0, B:159:0x02a6] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Removed duplicated region for block: B:162:0x02ab A[PHI: r7 r9
                          0x02ab: PHI (r7v1 java.lang.String) = (r7v4 java.lang.String), (r7v5 java.lang.String) binds: [B:161:0x02a9, B:159:0x02a6] A[DONT_GENERATE, DONT_INLINE]
                          0x02ab: PHI (r9v1 java.lang.String) = (r9v3 java.lang.String), (r9v4 java.lang.String) binds: [B:161:0x02a9, B:159:0x02a6] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
                        /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
                        /* JADX WARN: Removed duplicated region for block: B:38:0x007b  */
                        /* JADX WARN: Removed duplicated region for block: B:40:0x007f A[PHI: r28
                          0x007f: PHI (r28v3 java.lang.String) = (r28v0 java.lang.String), (r28v4 java.lang.String) binds: [B:39:0x007d, B:37:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Removed duplicated region for block: B:85:0x016a  */
                        /* JADX WARN: Removed duplicated region for block: B:92:0x0182 A[PHI: r28
                          0x0182: PHI (r28v1 java.lang.String) = (r28v0 java.lang.String), (r28v3 java.lang.String) binds: [B:39:0x007d, B:41:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Removed duplicated region for block: B:93:0x0185  */
                        @Override // X.C0EDC
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void LIZIZ(int r34, com.ss.ugc.android.editor.base.resource.ResourceItem r35, boolean r36) {
                            /*
                                Method dump skipped, instruction units count: 837
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C0E15.LIZIZ(int, com.ss.ugc.android.editor.base.resource.ResourceItem, boolean):void");
                        }

                        @Override // X.C0E16, X.C0EDC
                        public final void LIZ(ResourceItem resourceItem3, int i, boolean z2, C0E14 c0e14) {
                            String enterFrom;
                            C0E55 player;
                            C0E48 c0e48LIZIZ = this.LIZ.LIZIZ();
                            if (c0e48LIZIZ != null && (player = c0e48LIZIZ.getPlayer()) != null) {
                                player.pause(false);
                            }
                            if (resourceItem3 != null) {
                                C0EBP c0ebp = this.LIZ;
                                if (C357750E0v.LIZ(resourceItem3, c0ebp.LLJJJJJIL)) {
                                    c0e14.LIZ(false);
                                    return;
                                }
                                Activity activity = c0ebp.LLJJJJJIL;
                                VideoPublishEditModel videoPublishEditModel = c0ebp.LLJJIJIL;
                                if (videoPublishEditModel == null || (enterFrom = videoPublishEditModel.getEnterFrom()) == null) {
                                    enterFrom = "";
                                }
                                C2256508sl.LIZ(activity, enterFrom, new AwS584S0100000_5(c0e14, 395));
                            }
                        }
                    });
                }
                c0ed7.LJJIFFI = false;
                C0EDF c0edf2 = this.LLJLL;
                if (c0edf2 != null) {
                    C0ED8 c0ed8 = new C0ED8(c0ed7);
                    C1DRG c1drg = this.LLJJJJLIIL;
                    if (c0ed8.LJI) {
                        c0edf2.LJI(null, c1drg);
                    }
                    c0edf2.LJIIIIZZ(c0ed8);
                }
                C0EDF c0edf3 = this.LLJLL;
                if (c0edf3 != null) {
                    c0edf3.LIZLLL(false);
                }
                ?? r4 = new InterfaceC21676519sR() { // from class: X.0EBS
                    @Override // X.InterfaceC21676519sR
                    public final void m3(View view) {
                    }

                    @Override // X.InterfaceC21676519sR
                    public final void g5(View view) {
                        RecyclerView recyclerView6;
                        C361100EDs resourceListAdapter3;
                        ResourceItem resourceItem3;
                        C0EDF c0edf4 = this.LL.LLJLL;
                        if (c0edf4 != null && (recyclerView6 = c0edf4.getRecyclerView()) != null) {
                            int childAdapterPosition = recyclerView6.getChildAdapterPosition(view);
                            if (this.LL.isVisible()) {
                                C0EDF c0edf5 = this.LL.LLJLL;
                                if (c0edf5 != null && (resourceListAdapter3 = c0edf5.getResourceListAdapter()) != null && (resourceItem3 = (ResourceItem) C13LP.LJJJLZIJ(childAdapterPosition, resourceListAdapter3.LLLFZ())) != null) {
                                    C354270Duj.LIZ(0L, new AwS132S0201000_5(this.LL, childAdapterPosition, resourceItem3, 0));
                                    return;
                                }
                                return;
                            }
                            ((ArrayList) this.LL.LLJZIJLIL).add(Integer.valueOf(childAdapterPosition));
                        }
                    }
                };
                this.LLJZ = r4;
                C0EDF c0edf4 = this.LLJLL;
                if (c0edf4 != null && (recyclerView5 = c0edf4.getRecyclerView()) != 0) {
                    recyclerView5.addOnChildAttachStateChangeListener(r4);
                }
                C0EDF c0edf5 = this.LLJLL;
                if (c0edf5 != null) {
                    c0edf5.setResourceListMobListener(new C0EDT() { // from class: X.0E2y
                        @Override // X.C0EDT
                        public final void LIZ(boolean z2, boolean z3, long j, Exception exc, Integer num, ResourceItem resourceItem3) {
                            int iIntValue;
                            String message;
                            Object obj;
                            C0EU5.LIZIZ(this.LIZ.LIZIZ(), "filter_panel", resourceItem3.getEffectId(), z3);
                            C362710EJx c362710EJx = C362710EJx.LIZ;
                            if (num != null) {
                                iIntValue = num.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            if (exc == null || (message = exc.getMessage()) == null) {
                                message = "";
                            }
                            String effectId = resourceItem3.getEffectId();
                            String name = resourceItem3.getName();
                            String str = this.LIZ.LLJJJ;
                            c362710EJx.getClass();
                            Pair[] pairArr = new Pair[8];
                            String str2 = CardStruct.IStatusCode.DEFAULT;
                            if (!z2) {
                                obj = "1";
                            } else {
                                obj = CardStruct.IStatusCode.DEFAULT;
                            }
                            pairArr[0] = new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, obj);
                            pairArr[1] = new Pair("duration", String.valueOf(j));
                            pairArr[2] = new Pair("resource_id", effectId);
                            pairArr[3] = new Pair("resource_name", name);
                            pairArr[4] = new Pair("animation_type", str);
                            if (z3) {
                                str2 = "1";
                            }
                            pairArr[5] = new Pair("use_cache", str2);
                            pairArr[6] = new Pair("error_code", String.valueOf(iIntValue));
                            pairArr[7] = new Pair("error_domain", message);
                            C20684815ws.LJIILLIIL("download_filter", C2097608Jq.LJIIJ(pairArr));
                        }

                        @Override // X.C0EDT
                        public final void LIZIZ(boolean z2, long j, boolean z3, Exception exc, Integer num, boolean z4) {
                            InterfaceC360730ECh editorProResourceProvider;
                            C0EDF c0edf6 = this.LIZ.LLJLL;
                            if (c0edf6 != null && (editorProResourceProvider = c0edf6.getEditorProResourceProvider()) != null) {
                                String str = this.LIZ.LLJJJ;
                                InterfaceC1635390sev.LJJLIIIIJ.getClass();
                                editorProResourceProvider.LIZLLL(1, "filtercomposer", str, new AwS59S0210000_5(z2, num, exc, 5));
                            }
                        }
                    });
                }
                this.LLJLLL = true;
            }
            if (!((ArrayList) this.LLJZIJLIL).isEmpty()) {
                C0EDF c0edf6 = this.LLJLL;
                if (c0edf6 != null && (recyclerView4 = c0edf6.getRecyclerView()) != null) {
                    layoutManager2 = recyclerView4.getLayoutManager();
                } else {
                    layoutManager2 = null;
                }
                if ((layoutManager2 instanceof LinearLayoutManager) && (linearLayoutManager4 = (LinearLayoutManager) layoutManager2) != null) {
                    iFindFirstVisibleItemPosition2 = linearLayoutManager4.findFirstVisibleItemPosition();
                } else {
                    iFindFirstVisibleItemPosition2 = 0;
                }
                C0EDF c0edf7 = this.LLJLL;
                if (c0edf7 != null && (recyclerView3 = c0edf7.getRecyclerView()) != null) {
                    layoutManager3 = recyclerView3.getLayoutManager();
                }
                if ((layoutManager3 instanceof LinearLayoutManager) && (linearLayoutManager3 = (LinearLayoutManager) layoutManager3) != null) {
                    iFindLastVisibleItemPosition = linearLayoutManager3.findLastVisibleItemPosition();
                } else {
                    iFindLastVisibleItemPosition = 0;
                }
                Iterator it2 = ((ArrayList) this.LLJZIJLIL).iterator();
                while (it2.hasNext()) {
                    int iIntValue = ((Number) it2.next()).intValue();
                    C0EDF c0edf8 = this.LLJLL;
                    if (c0edf8 != null && (resourceListAdapter2 = c0edf8.getResourceListAdapter()) != null && (resourceItem2 = (ResourceItem) C13LP.LJJJLZIJ(iIntValue, resourceListAdapter2.LLLFZ())) != null && iFindFirstVisibleItemPosition2 <= iIntValue && iIntValue <= iFindLastVisibleItemPosition) {
                        LLLLJI(resourceItem2, this.LLJJJJ);
                    }
                }
                ((ArrayList) this.LLJZIJLIL).clear();
                return;
            }
            C0EDF c0edf9 = this.LLJLL;
            if (c0edf9 != null && (recyclerView2 = c0edf9.getRecyclerView()) != null) {
                layoutManager = recyclerView2.getLayoutManager();
            } else {
                layoutManager = null;
            }
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager2 = (LinearLayoutManager) layoutManager) != null) {
                iFindFirstVisibleItemPosition = linearLayoutManager2.findFirstVisibleItemPosition();
            } else {
                iFindFirstVisibleItemPosition = 0;
            }
            C0EDF c0edf10 = this.LLJLL;
            if (c0edf10 != null && (recyclerView = c0edf10.getRecyclerView()) != null) {
                layoutManager3 = recyclerView.getLayoutManager();
            }
            if ((layoutManager3 instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager3) != null) {
                iFindLastVisibleItemPosition2 = linearLayoutManager.findLastVisibleItemPosition();
            }
            if (iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition2) {
                return;
            }
            while (true) {
                C0EDF c0edf11 = this.LLJLL;
                if (c0edf11 != null && (resourceListAdapter = c0edf11.getResourceListAdapter()) != null && (resourceItem = (ResourceItem) C13LP.LJJJLZIJ(iFindFirstVisibleItemPosition, resourceListAdapter.LLLFZ())) != null) {
                    LLLLJI(resourceItem, this.LLJJJJ);
                }
                if (iFindFirstVisibleItemPosition != iFindLastVisibleItemPosition2) {
                    iFindFirstVisibleItemPosition++;
                } else {
                    return;
                }
            }
        }
    }

    public final int LLLLILI(int i) {
        Integer numLIZJ;
        Context sceneContext = getSceneContext();
        if (sceneContext != null && (numLIZJ = C1308910kAL.LIZJ(i, sceneContext)) != null) {
            return numLIZJ.intValue();
        }
        return -1;
    }

    public final void LLLLJI(ResourceItem resourceItem, C355530Dwl c355530Dwl) {
        String str;
        VideoPublishEditModel videoPublishEditModel = this.LLJJIJIL;
        if (videoPublishEditModel == null) {
            return;
        }
        C362710EJx c362710EJx = C362710EJx.LIZ;
        if (c355530Dwl != null) {
            str = c355530Dwl.LJ;
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            str = "editorpro_main";
        }
        String str2 = this.LLJJJ;
        String effectId = resourceItem.getEffectId();
        String str3 = "";
        if (effectId == null) {
            effectId = "";
        }
        String nameEn = resourceItem.getNameEn();
        if (nameEn == null) {
            nameEn = "";
        }
        String str4 = resourceItem.extra;
        if (str4 != null) {
            str3 = str4;
        }
        String strValueOf = String.valueOf(C351220Dpo.LJJJJ(str3));
        c362710EJx.getClass();
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_way", str), new Pair("tab_name", str2), new Pair("filter_id", effectId), new Pair("filter_name", nameEn), new Pair("filter_value", strValueOf));
        C362710EJx.LIZLLL(videoPublishEditModel, mapLJIIJ);
        C20684815ws.LJIILLIIL("filter_effect_show", mapLJIIJ);
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        LiveEvent<Unit> liveEventRD1;
        LiveEvent<ResourceItem> liveEventNf0;
        LiveData<String> liveDataXF2;
        super.onViewCreated(view, bundle);
        this.LLJLL = (C0EDF) view.findViewById(R.id.td4);
        this.LLJLLIL = (C0ED1) view.findViewById(R.id.l2r);
        InterfaceC358190E2n interfaceC358190E2nLLLLJ = LLLLJ();
        if (interfaceC358190E2nLLLLJ != null && (liveDataXF2 = interfaceC358190E2nLLLLJ.xF2()) != null) {
            liveDataXF2.observe(this, new AObserverS209S0100000_5(this, 56));
        }
        InterfaceC358190E2n interfaceC358190E2nLLLLJ2 = LLLLJ();
        if (interfaceC358190E2nLLLLJ2 != null && (liveEventNf0 = interfaceC358190E2nLLLLJ2.nf0()) != null) {
            liveEventNf0.LIZ(this, new AObjectS240S0100000_5(this, 70));
        }
        InterfaceC358190E2n interfaceC358190E2nLLLLJ3 = LLLLJ();
        if (interfaceC358190E2nLLLLJ3 != null && (liveEventRD1 = interfaceC358190E2nLLLLJ3.RD1()) != null) {
            liveEventRD1.LJII(this, Lifecycle.State.RESUMED, new AObjectS240S0100000_5(this, 72));
        }
        C0ED1 c0ed1 = this.LLJLLIL;
        if (c0ed1 != null) {
            Activity activity = this.LLJJJJJIL;
            c0ed1.setLoadingTip(activity.getString(2131833349));
            c0ed1.setErrorTip(activity.getString(2131833344));
            c0ed1.setEmptyTitle(activity.getString(2131833346));
            c0ed1.setEmptyTip(activity.getString(2131833345));
            c0ed1.setOnRetryClick(new AwS584S0100000_5(this, 396));
            c0ed1.LIZJ();
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (C357780E0y.LIZ()) {
            return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.c0y, viewGroup, false);
        }
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.c0x, viewGroup, false);
    }

    public C0EBP(VideoPublishEditModel videoPublishEditModel, String str, boolean z, C355530Dwl c355530Dwl, Activity activity, C1DRG c1drg, boolean z2) {
        this.LLJJIJIL = videoPublishEditModel;
        this.LLJJJ = str;
        this.LLJJJIL = z;
        this.LLJJJJ = c355530Dwl;
        this.LLJJJJJIL = activity;
        this.LLJJJJLIIL = c1drg;
        this.LLJJL = z2;
        this.LLJLILLLLZIIL = C289190BVd.LIZ(videoPublishEditModel);
    }
}
