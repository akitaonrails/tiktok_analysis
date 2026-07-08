package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.story.highlights.HighlightsListItem;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection;
import com.zhiliaoapp.musically.R;
import irm.AkS62S0200000_25;
import irm.AkS92S0100000_25;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tgV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1674810tgV extends AbstractC2172971A2l<HighlightsListItem, C1674840tgY> {
    public final Function0<Unit> LLILLJJLI;
    public final Function1<StoryHighlightCollection, Unit> LLILLL;
    public final Function1<StoryHighlightCollection, Unit> LLILZ;

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C1523605xq c1523605xq;
        List<String> urlList;
        C1674840tgY c1674840tgY = (C1674840tgY) viewHolder;
        HighlightsListItem highlightsListItemLLLFZ = LLLFZ(i);
        if (highlightsListItemLLLFZ instanceof HighlightsListItem.NewListItem) {
            c1674840tgY.LLILLJJLI.setText(C1383370m6R.LJIIJ(2131848962));
            c1674840tgY.LL.getUiState().setValue(new C1674790tgT(null, null, new C1674800tgU(C1669660tYC.LLZL, C1383370m6R.LJFF(R.attr.a1h)), 0, C1383370m6R.LJFF(R.attr.a02), 1.0f, false, 0, 0.0f, 971));
            C786410Ut5.I7(new AkS92S0100000_25(this, 17), c1674840tgY.itemView);
            return;
        }
        if (highlightsListItemLLLFZ instanceof HighlightsListItem.CollectionListItem) {
            HighlightsListItem.CollectionListItem collectionListItem = (HighlightsListItem.CollectionListItem) highlightsListItemLLLFZ;
            c1674840tgY.LLILLJJLI.setText(collectionListItem.storyHighlightCollection.title);
            C05P0<C1674790tgT> uiState = c1674840tgY.LL.getUiState();
            UrlModel urlModel = collectionListItem.storyHighlightCollection.collectionCoverUrl;
            C1674800tgU c1674800tgU = null;
            if (urlModel != null && (urlList = urlModel.getUrlList()) != null) {
                c1523605xq = new C1523605xq(urlList);
            } else {
                c1523605xq = null;
            }
            int iLJFF = C1383370m6R.LJFF(R.attr.a02);
            if (collectionListItem.isSelected) {
                c1674800tgU = new C1674800tgU(C1669660tYC.G, C1383370m6R.LJFF(R.attr.zi), 28.0f, C1383370m6R.LJFF(R.attr.zc));
            }
            uiState.setValue(new C1674790tgT(c1523605xq, null, c1674800tgU, 0, iLJFF, 0.25f, false, 0, 0.0f, 970));
            C786410Ut5.I7(new AkS62S0200000_25(highlightsListItemLLLFZ, this, 2), c1674840tgY.itemView);
            return;
        }
        throw new C1954807lC();
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1674840tgY c1674840tgY = new C1674840tgY(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.fbi, viewGroup, false));
        try {
            View view = c1674840tgY.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1674840tgY.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1674840tgY.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1674840tgY.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1674840tgY.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1674840tgY.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1674840tgY.class.getName();
        return c1674840tgY;
    }

    public C1674810tgV(AwS546S0100000_2 awS546S0100000_2, AwS581S0100000_2 awS581S0100000_2, AwS581S0100000_2 awS581S0100000_22) {
        super(new AbstractC339510DSr<HighlightsListItem>() { // from class: X.0tgW
            @Override // X.AbstractC339510DSr
            public final boolean LIZ(HighlightsListItem highlightsListItem, HighlightsListItem highlightsListItem2) {
                HighlightsListItem highlightsListItem3 = highlightsListItem;
                HighlightsListItem highlightsListItem4 = highlightsListItem2;
                if ((highlightsListItem3 instanceof HighlightsListItem.NewListItem) && (highlightsListItem4 instanceof HighlightsListItem.NewListItem)) {
                    return true;
                }
                if ((highlightsListItem3 instanceof HighlightsListItem.CollectionListItem) && (highlightsListItem4 instanceof HighlightsListItem.CollectionListItem)) {
                    return Intrinsics.LJFF(((HighlightsListItem.CollectionListItem) highlightsListItem3).storyHighlightCollection, ((HighlightsListItem.CollectionListItem) highlightsListItem4).storyHighlightCollection);
                }
                return false;
            }

            @Override // X.AbstractC339510DSr
            public final boolean LIZIZ(HighlightsListItem highlightsListItem, HighlightsListItem highlightsListItem2) {
                HighlightsListItem highlightsListItem3 = highlightsListItem;
                HighlightsListItem highlightsListItem4 = highlightsListItem2;
                if ((highlightsListItem3 instanceof HighlightsListItem.NewListItem) && (highlightsListItem4 instanceof HighlightsListItem.NewListItem)) {
                    return true;
                }
                if ((highlightsListItem3 instanceof HighlightsListItem.CollectionListItem) && (highlightsListItem4 instanceof HighlightsListItem.CollectionListItem)) {
                    return Intrinsics.LJFF(((HighlightsListItem.CollectionListItem) highlightsListItem3).storyHighlightCollection.collectionId, ((HighlightsListItem.CollectionListItem) highlightsListItem4).storyHighlightCollection.collectionId);
                }
                return false;
            }
        });
        this.LLILLJJLI = awS546S0100000_2;
        this.LLILLL = awS581S0100000_2;
        this.LLILZ = awS581S0100000_22;
    }
}
