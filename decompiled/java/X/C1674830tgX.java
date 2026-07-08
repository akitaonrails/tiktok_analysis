package X;

import Y.ATListenerS457S0100000_25;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.story.highlights.HighlightsListItem;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection;
import com.ss.android.ugc.aweme.story.highlights.widget.StoryHighlightsCoverView;
import com.zhiliaoapp.musically.R;
import irm.AkS92S0100000_25;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.AwS403S0200000_2;
import kotlin.jvm.internal.AwS581S0100000_2;

/* JADX INFO: renamed from: X.0tgX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1674830tgX extends AbstractC21673619ry<C1674850tgZ> {
    public final Function0<Unit> LL;
    public final Function1<Integer, Unit> LLILLJJLI;
    public final Function1<Integer, Unit> LLILLL;
    public List<HighlightsListItem> LLILZ;
    public C2262491Dh1 LLILZIL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILZ.size();
    }

    public final StoryHighlightCollection LLLFZ(int i) {
        HighlightsListItem.CollectionListItem collectionListItem;
        Object obj = ListProtector.get(this.LLILZ, i);
        if (!(obj instanceof HighlightsListItem.CollectionListItem) || (collectionListItem = (HighlightsListItem.CollectionListItem) obj) == null) {
            return null;
        }
        return collectionListItem.storyHighlightCollection;
    }

    @Override // X.AbstractC21673619ry
    public final long getItemId(int i) {
        HighlightsListItem highlightsListItem = (HighlightsListItem) ListProtector.get(this.LLILZ, i);
        if (highlightsListItem instanceof HighlightsListItem.NewListItem) {
            return -1L;
        }
        if (highlightsListItem instanceof HighlightsListItem.CollectionListItem) {
            String str = ((HighlightsListItem.CollectionListItem) highlightsListItem).storyHighlightCollection.collectionId;
            if (str != null) {
                i = str.hashCode();
            }
            return i;
        }
        throw new C1954807lC();
    }

    @Override // X.AbstractC21673619ry
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        C2262481Dh0 c2262481Dh0;
        super.onViewRecycled(viewHolder);
        Object tag = viewHolder.itemView.getTag(R.id.s6b);
        if ((tag instanceof C2262481Dh0) && (c2262481Dh0 = (C2262481Dh0) tag) != null) {
            c2262481Dh0.LIZ();
        }
        viewHolder.itemView.setOnTouchListener(null);
        C786410Ut5.I7(null, viewHolder.itemView);
        viewHolder.itemView.setTag(R.id.s6b, null);
        C2262491Dh1 c2262491Dh1 = this.LLILZIL;
        if (c2262491Dh1 != null) {
            c2262491Dh1.LIZLLL.remove(viewHolder);
        }
    }

    public final void LLLI(List<StoryHighlightCollection> list, boolean z) {
        int size = ((ArrayList) this.LLILZ).size();
        C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
        if (z) {
            c13dvLIZIZ.add(HighlightsListItem.NewListItem.INSTANCE);
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<StoryHighlightCollection> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new HighlightsListItem.CollectionListItem(it2.next(), false));
        }
        c13dvLIZIZ.addAll(arrayList);
        ArrayList arrayList2 = new ArrayList(C1697820uHc.LIZ(c13dvLIZIZ));
        this.LLILZ = arrayList2;
        if (z && arrayList2.size() == size + 1) {
            notifyItemInserted(1);
        } else {
            notifyDataSetChanged();
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        List<String> urlList;
        C1523605xq c1523605xq;
        int iLJFF;
        int iLJFF2;
        int iLJFF3;
        int iLJFF4;
        C1674850tgZ c1674850tgZ = (C1674850tgZ) viewHolder;
        c1674850tgZ.itemView.setBackground(null);
        HighlightsListItem highlightsListItem = (HighlightsListItem) ListProtector.get(this.LLILZ, i);
        if (highlightsListItem instanceof HighlightsListItem.NewListItem) {
            c1674850tgZ.itemView.setOnTouchListener(null);
            c1674850tgZ.itemView.setTag(R.id.s6b, null);
            c1674850tgZ.LL.setText(C1383370m6R.LJIIJ(2131848962));
            Context context = c1674850tgZ.itemView.getContext();
            C05P0<C1674790tgT> uiState = c1674850tgZ.LLILLJJLI.getUiState();
            C1668880tWw c1668880tWw = C1669660tYC.LLZL;
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
            if (numLIZJ != null) {
                iLJFF3 = numLIZJ.intValue();
            } else {
                iLJFF3 = C1383370m6R.LJFF(R.attr.a1h);
            }
            C1674800tgU c1674800tgU = new C1674800tgU(c1668880tWw, iLJFF3);
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a02, context);
            if (numLIZJ2 != null) {
                iLJFF4 = numLIZJ2.intValue();
            } else {
                iLJFF4 = C1383370m6R.LJFF(R.attr.a02);
            }
            uiState.setValue(new C1674790tgT(null, null, c1674800tgU, 0, iLJFF4, 1.75f, false, 0, 0.0f, 971));
            C786410Ut5.I7(new AkS92S0100000_25(this, 16), c1674850tgZ.itemView);
            return;
        }
        if (highlightsListItem instanceof HighlightsListItem.CollectionListItem) {
            HighlightsListItem.CollectionListItem collectionListItem = (HighlightsListItem.CollectionListItem) highlightsListItem;
            c1674850tgZ.LL.setText(collectionListItem.storyHighlightCollection.title);
            UrlModel urlModel = collectionListItem.storyHighlightCollection.collectionCoverUrl;
            if (urlModel != null) {
                urlList = urlModel.getUrlList();
            } else {
                urlList = null;
            }
            Context context2 = c1674850tgZ.LLILLJJLI.getContext();
            C05P0<C1674790tgT> uiState2 = c1674850tgZ.LLILLJJLI.getUiState();
            if (urlList != null) {
                c1523605xq = new C1523605xq(urlList);
            } else {
                c1523605xq = null;
            }
            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a03, context2);
            if (numLIZJ3 != null) {
                iLJFF = numLIZJ3.intValue();
            } else {
                iLJFF = C1383370m6R.LJFF(R.attr.a03);
            }
            Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.a01, context2);
            if (numLIZJ4 != null) {
                iLJFF2 = numLIZJ4.intValue();
            } else {
                iLJFF2 = C1383370m6R.LJFF(R.attr.a01);
            }
            uiState2.setValue(new C1674790tgT(c1523605xq, null, null, iLJFF, 0, 0.0f, true, iLJFF2, 4.0f, 566));
            if (this.LLILLJJLI == null && this.LLILLL == null) {
                C786410Ut5.I7(null, c1674850tgZ.itemView);
                C2262491Dh1 c2262491Dh1 = this.LLILZIL;
                if (c2262491Dh1 == null) {
                    return;
                }
                c2262491Dh1.LIZ(c1674850tgZ);
                return;
            }
            c1674850tgZ.LLILLJJLI.animate().cancel();
            StoryHighlightsCoverView storyHighlightsCoverView = c1674850tgZ.LLILLJJLI;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(storyHighlightsCoverView);
            storyHighlightsCoverView.setScaleX(1.0f);
            StoryHighlightsCoverView storyHighlightsCoverView2 = c1674850tgZ.LLILLJJLI;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(storyHighlightsCoverView2);
            storyHighlightsCoverView2.setScaleY(1.0f);
            c1674850tgZ.itemView.setOnTouchListener(new ATListenerS457S0100000_25(c1674850tgZ, 4));
            C786410Ut5.I7(new AbstractViewOnClickListenerC1173120gdK() { // from class: X.0tga
                @Override // X.AbstractViewOnClickListenerC1173120gdK
                public final void LIZ(View view) {
                    Function1<Integer, Unit> function1 = this.LLILZ.LLILLJJLI;
                    if (function1 != null) {
                        function1.invoke(Integer.valueOf(i));
                    }
                }
            }, c1674850tgZ.itemView);
            c1674850tgZ.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.0tgb
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    Function1<Integer, Unit> function1 = this.LL.LLILLL;
                    if (function1 != null) {
                        function1.invoke(Integer.valueOf(i));
                        return true;
                    }
                    return true;
                }
            });
            return;
        }
        throw new C1954807lC();
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1674850tgZ c1674850tgZ = new C1674850tgZ(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.eiw, viewGroup, false));
        try {
            View view = c1674850tgZ.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1674850tgZ.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1674850tgZ.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1674850tgZ.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1674850tgZ.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1674850tgZ.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1674850tgZ.class.getName();
        return c1674850tgZ;
    }

    public C1674830tgX(int i, AwS403S0200000_2 awS403S0200000_2, AwS368S0200000_2 awS368S0200000_2, AwS581S0100000_2 awS581S0100000_2) {
        awS403S0200000_2 = (i & 1) != 0 ? null : awS403S0200000_2;
        awS368S0200000_2 = (i & 2) != 0 ? null : awS368S0200000_2;
        awS581S0100000_2 = (i & 4) != 0 ? null : awS581S0100000_2;
        this.LL = awS403S0200000_2;
        this.LLILLJJLI = awS368S0200000_2;
        this.LLILLL = awS581S0100000_2;
        this.LLILZ = new ArrayList();
        setHasStableIds(true);
    }
}
