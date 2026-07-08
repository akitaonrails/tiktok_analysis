package X;

import com.ss.android.ugc.aweme.music.v2.assem.MusicFavoriteButtonAssem;
import com.ss.android.ugc.aweme.music.v2.assem.MusicShareToEditAssem;
import com.ss.android.ugc.aweme.music.v2.panel.MusicItemAssem;
import com.ss.android.ugc.aweme.prefab.ability.FavoriteAbility;
import com.ss.android.ugc.aweme.topic.book.recommend.BookRecommendSearchCell;
import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import com.ss.android.ugc.aweme.topic.recommend.vm.TopicRecommendListVM;

/* JADX INFO: renamed from: X.0P4o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C639000P4o implements InterfaceC849390XTt {
    public final int $t;
    public Object l0;

    public static final /* synthetic */ void LIZIZ$0(C639000P4o c639000P4o) {
    }

    public static final /* synthetic */ void LIZIZ$1(C639000P4o c639000P4o) {
    }

    public static final /* synthetic */ void LIZIZ$2(C639000P4o c639000P4o) {
    }

    public static final /* synthetic */ void LIZIZ$3(C639000P4o c639000P4o) {
    }

    public static final /* synthetic */ void LIZIZ$4(C639000P4o c639000P4o) {
    }

    public static final /* synthetic */ void LIZIZ$5(C639000P4o c639000P4o) {
    }

    @Override // X.InterfaceC849390XTt
    public final void LIZ() {
        switch (this.$t) {
            case 0:
                LIZ$0(this);
                break;
            case 1:
                LIZ$1(this);
                break;
            case 2:
                LIZ$2(this);
                break;
            case 3:
                LIZ$3(this);
                break;
            case 4:
                LIZ$4(this);
                break;
            case 5:
                LIZ$5(this);
                break;
        }
    }

    @Override // X.InterfaceC849390XTt
    public final /* synthetic */ void LIZIZ() {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this);
                break;
            case 1:
                LIZIZ$1(this);
                break;
            case 2:
                LIZIZ$2(this);
                break;
            case 3:
                LIZIZ$3(this);
                break;
            case 4:
                LIZIZ$4(this);
                break;
            case 5:
                LIZIZ$5(this);
                break;
        }
    }

    public static final void LIZ$0(C639000P4o c639000P4o) {
        MusicShareToEditAssem.sp((MusicShareToEditAssem) c639000P4o.l0);
    }

    public static final void LIZ$1(C639000P4o c639000P4o) {
        ((MusicFavoriteButtonAssem) c639000P4o.l0).op().oD2();
    }

    public static final void LIZ$2(C639000P4o c639000P4o) {
        ((MusicItemAssem) c639000P4o.l0).op().oD2();
    }

    public static final void LIZ$3(C639000P4o c639000P4o) {
        ((FavoriteAbility) c639000P4o.l0).oD2();
    }

    public static final void LIZ$4(C639000P4o c639000P4o) {
        ((C634930OvL) c639000P4o.l0).LJFF();
    }

    public static final void LIZ$5(C639000P4o c639000P4o) {
        TopicRawInfo topicRawInfo;
        TopicRecommendListVM topicRecommendListVM;
        C0OAT item = ((BookRecommendSearchCell) c639000P4o.l0).getItem();
        if (item != null && (topicRawInfo = item.LL) != null && (topicRecommendListVM = ((BookRecommendSearchCell) c639000P4o.l0).LLILLJJLI) != null) {
            topicRecommendListVM.xQ2(topicRawInfo);
        }
    }

    public C639000P4o(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
