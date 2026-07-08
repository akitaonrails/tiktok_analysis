package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment$createLayoutManager$layoutManager$1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0PC8, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PC8 implements C0PTK {
    public final RecyclerView LIZ;
    public final C0PF9 LIZIZ;
    public final List<SearchMixFeed> LIZJ = new ArrayList();

    @Override // X.C0PTK
    public final void LIZ(SearchMixFeed searchMixFeed) {
        C0PC7 c0pc7;
        SearchMixFeed searchMixFeed2;
        C0PCB customContent = searchMixFeed.getCustomContent();
        if (customContent != null && (c0pc7 = customContent.fakeNullifyCardInfo) != null && (searchMixFeed2 = c0pc7.nullifyCard) != null) {
            ListProtector.add(this.LIZJ, 0, searchMixFeed2);
            this.LIZIZ.setData(this.LIZJ);
        }
    }

    @Override // X.C0PTK
    public final void LIZIZ(SearchMixFeed searchMixFeed) {
        C0PCB customContent;
        C0PC7 c0pc7;
        SearchMixFeed searchMixFeed2;
        if (searchMixFeed != null && (customContent = searchMixFeed.getCustomContent()) != null && (c0pc7 = customContent.fakeNullifyCardInfo) != null && (searchMixFeed2 = c0pc7.nullifyCard) != null) {
            ((ArrayList) this.LIZJ).remove(searchMixFeed2);
            this.LIZIZ.setData(this.LIZJ);
        }
    }

    public C0PC8(C0PPX c0ppx, SearchJediMixFeedFragment$createLayoutManager$layoutManager$1 searchJediMixFeedFragment$createLayoutManager$layoutManager$1, C0PF9 c0pf9, C0PPU c0ppu) {
        this.LIZ = c0ppx;
        this.LIZIZ = c0pf9;
        C786410Ut5.LLIZLLLIL(c0ppx, 4);
        c0ppx.setLayoutManager(searchJediMixFeedFragment$createLayoutManager$layoutManager$1);
        c0ppx.setAdapter(c0pf9);
        c0ppu.setOnLayoutRequestListener(new C0PPY() { // from class: X.0PC9
            @Override // X.C0PPY
            public final void LIZ() {
                this.LIZ.LIZ.forceLayout();
            }

            @Override // X.C0PPY
            public final void LIZIZ() {
                this.LIZ.LIZ.forceLayout();
            }
        });
    }
}
