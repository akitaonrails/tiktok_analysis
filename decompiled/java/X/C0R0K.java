package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.lynx.react.bridge.JavaOnlyArray;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility;
import com.ss.android.ugc.aweme.search.lynx.xsearch.newsearchlist.ui.ISearchList;
import com.ss.android.ugc.aweme.search.lynx.xsearch.newsearchlist.viewmodel.SearchListPlayer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0R0K, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0R0K {
    public C0PMK LIZ;
    public SearchListPlayer LIZLLL;
    public ISearchList.HorizontalStyle LJ;
    public C0R0N LJFF;
    public C653210Pjj LJII;
    public boolean LJIIJ;
    public C0R0N LJIIJJI;
    public boolean LJIIL;
    public C0R0N LJIILIIL;
    public boolean LJIILJJIL;
    public SearchListPlayer LJIILL;
    public SearchListPlayer LJIILLIIL;
    public C0R0Y LJIIZILJ;
    public JavaOnlyArray LJIJ;
    public C0R0N LJIJI;
    public C688800R0c LJIJJ;
    public SearchListPlayer LJIJJLI;
    public int LJIL;
    public boolean LJJ;
    public boolean LJJI;
    public C653210Pjj LJJII;
    public JavaOnlyArray LIZIZ = new JavaOnlyArray();
    public int LIZJ = -1;
    public ISearchList.ActiveArea LJI = new ISearchList.ActiveArea(0.0f, 0.0f, 0.0f, 0.0f);
    public int LJIIIIZZ = -1;
    public final C688840R0g LJIIIZ = new C688840R0g(this);
    public final C01GW LJJIFFI = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(24));

    public final void LIZ() {
        LIZLLL(null);
        this.LJI.clear();
        LJ(-1);
        LIZJ(false);
        this.LJIIZILJ = null;
        LIZIZ(true);
        this.LJIL = 0;
        this.LJJ = false;
        this.LJJI = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.ss.android.ugc.aweme.search.lynx.xsearch.newsearchlist.viewmodel.SearchListPlayer] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LIZIZ(final boolean z) {
        final ?? arrayList;
        InterfaceC652740Piy interfaceC652740PiyLIZIZ;
        final ?? r4 = this.LJIILLIIL;
        if (r4 != 0) {
            ((HashMap) r4.LLIZLLLIL).clear();
            RecyclerView recyclerView = r4.LLILZIL;
            if (recyclerView == null) {
                arrayList = C13BV.INSTANCE;
            } else {
                List<Integer> listLIZ = C641510PEf.LIZ(recyclerView);
                if (listLIZ.isEmpty()) {
                    arrayList = C13BV.INSTANCE;
                } else {
                    arrayList = new ArrayList();
                    Iterator<Integer> it2 = listLIZ.iterator();
                    while (it2.hasNext()) {
                        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(it2.next().intValue());
                        if ((viewHolderFindViewHolderForAdapterPosition instanceof RecyclerView.ViewHolder) && viewHolderFindViewHolderForAdapterPosition != null) {
                            arrayList.add(viewHolderFindViewHolderForAdapterPosition);
                        }
                    }
                }
            }
            for (RecyclerView.ViewHolder viewHolder : arrayList) {
                JavaOnlyArray javaOnlyArray = r4.LLILLJJLI.LJIJ;
                if (javaOnlyArray != null && !javaOnlyArray.contains(Integer.valueOf(viewHolder.getBindingAdapterPosition()))) {
                    ((HashMap) r4.LLIZLLLIL).put(new WeakReference(viewHolder.itemView), viewHolder);
                }
            }
            RecyclerView recyclerView2 = r4.LLILZIL;
            if (recyclerView2.isLaidOut() && !recyclerView2.isLayoutRequested()) {
                Map<InterfaceC652740Piy, SearchServiceCenter$AutoPlayAbility> mapLJJIZ = r4.LJJIZ(arrayList);
                C653210Pjj c653210Pjj = r4.LLILLJJLI.LJJII;
                if (c653210Pjj != null && (interfaceC652740PiyLIZIZ = c653210Pjj.LIZIZ(r4.LLILZIL, 0, mapLJJIZ.keySet())) != null) {
                    r4.LJJIL(interfaceC652740PiyLIZIZ, mapLJJIZ.get(interfaceC652740PiyLIZIZ), z);
                    return;
                }
                return;
            }
            recyclerView2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0R0I
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    InterfaceC652740Piy interfaceC652740PiyLIZIZ2;
                    view.removeOnLayoutChangeListener(this);
                    Map<InterfaceC652740Piy, SearchServiceCenter$AutoPlayAbility> mapLJJIZ2 = r4.LJJIZ(arrayList);
                    SearchListPlayer searchListPlayer = r4;
                    C653210Pjj c653210Pjj2 = searchListPlayer.LLILLJJLI.LJJII;
                    if (c653210Pjj2 != null && (interfaceC652740PiyLIZIZ2 = c653210Pjj2.LIZIZ(searchListPlayer.LLILZIL, 0, mapLJJIZ2.keySet())) != null) {
                        r4.LJJIL(interfaceC652740PiyLIZIZ2, mapLJJIZ2.get(interfaceC652740PiyLIZIZ2), z);
                    }
                }
            });
        }
    }

    public final void LIZJ(boolean z) {
        int size;
        this.LJIIJ = z;
        C0R0N c0r0n = this.LJIIJJI;
        if (c0r0n != null) {
            C0R0S c0r0s = (C0R0S) c0r0n.LLILLL.getValue();
            C0R0K c0r0k = c0r0n.LLILLJJLI;
            c0r0s.LLILZLL = c0r0k.LJIIJ;
            JavaOnlyArray javaOnlyArray = c0r0k.LJIJ;
            if (javaOnlyArray != null) {
                size = javaOnlyArray.size();
            } else {
                size = 0;
            }
            c0r0s.LLIZ = size;
            if (((RecyclerView) c0r0n.LL.mView).getEdgeEffectFactory() instanceof C688820R0e) {
                boolean z2 = ((RecyclerView) c0r0n.LL.mView).getEdgeEffectFactory() instanceof C688820R0e;
            }
        }
    }

    public final void LIZLLL(ISearchList.HorizontalStyle horizontalStyle) {
        Context context;
        this.LJ = horizontalStyle;
        C0R0N c0r0n = this.LJFF;
        if (c0r0n != null && horizontalStyle != null && (context = c0r0n.LL.mView.getContext()) != null) {
            if (((RecyclerView) c0r0n.LL.mView).getItemDecorationCount() <= 0) {
                ((RecyclerView) c0r0n.LL.mView).addItemDecoration((C0DXR) c0r0n.LLILLL.getValue());
            }
            C0R0S c0r0s = (C0R0S) c0r0n.LLILLL.getValue();
            c0r0s.LL = C12ES.LIZJ(horizontalStyle.getItemSpace(), context);
            c0r0s.LLILZ = C0HCL.LIZ(horizontalStyle.getLeftMargin(), context);
            c0r0s.LLILZIL = C0HCL.LIZ(horizontalStyle.getRightMargin(), context);
        }
    }

    public final void LJ(int i) {
        C649040Pd0 c649040Pd0LIZ;
        this.LJIIIIZZ = i;
        C688840R0g c688840R0g = this.LJIIIZ;
        if (c688840R0g != null && c688840R0g.LIZ.LIZJ != -1 && (c649040Pd0LIZ = C647140PZw.LIZ.LIZ(i)) != null) {
            List<DynamicPatch.SearchMultiTabListData> awemeMultiTabList = c649040Pd0LIZ.LIZ.getAwemeMultiTabList();
            List<Map<?, ?>> awemeMultiTabListRaw = c649040Pd0LIZ.LIZ.getAwemeMultiTabListRaw();
            int i2 = 0;
            if (awemeMultiTabList != null && !awemeMultiTabList.isEmpty()) {
                if (c649040Pd0LIZ.LJIIIIZZ == null) {
                    c649040Pd0LIZ.LJIIIIZZ = new ArrayList();
                }
                List<DynamicPatch.SearchMultiTabListData> list = c649040Pd0LIZ.LJIIIIZZ;
                if (list != null) {
                    ((ArrayList) list).addAll(awemeMultiTabList);
                }
                if (c649040Pd0LIZ.LJI == null) {
                    c649040Pd0LIZ.LJI = new HashMap();
                }
                int i3 = 0;
                for (DynamicPatch.SearchMultiTabListData searchMultiTabListData : awemeMultiTabList) {
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        DynamicPatch.SearchMultiTabListData searchMultiTabListData2 = searchMultiTabListData;
                        Map<Integer, List<Aweme>> map = c649040Pd0LIZ.LJI;
                        if (map != null) {
                            ((HashMap) map).put(Integer.valueOf(i3), searchMultiTabListData2.tabAwemeList);
                        }
                        i3 = i4;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                if (awemeMultiTabListRaw != null) {
                    if (c649040Pd0LIZ.LJII == null) {
                        c649040Pd0LIZ.LJII = new HashMap();
                    }
                    for (Map<?, ?> map2 : awemeMultiTabListRaw) {
                        int i5 = i2 + 1;
                        if (i2 >= 0) {
                            Object arrayList = map2.get("tab_aweme_list");
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            Map<Integer, List<Map<?, ?>>> map3 = c649040Pd0LIZ.LJII;
                            if (map3 != null) {
                                ((HashMap) map3).put(Integer.valueOf(i2), C19719512Dh.LIZIZ(arrayList));
                            }
                            i2 = i5;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                }
            }
        }
    }
}
