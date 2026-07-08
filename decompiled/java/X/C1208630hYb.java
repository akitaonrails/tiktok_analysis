package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.minidrama.tab.v2.guest.DramaGuestLandingAssem;
import com.ss.android.ugc.aweme.story.archive2.calendar.StoryArchiveV2CalendarAssem;
import com.ss.android.ugc.aweme.story.archive2.list.StoryArchiveV2ListAssem;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;

/* JADX INFO: renamed from: X.0hYb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C1208630hYb extends AbstractC214823195h {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC214823195h
    public final int LJFF(int i) {
        switch (this.$t) {
            case 0:
                return LJFF$0(this, i);
            case 1:
                return LJFF$1(this, i);
            case 2:
                return LJFF$2(this, i);
            case 3:
                return LJFF$3(this, i);
            case 4:
                return LJFF$4(this, i);
            default:
                return super.LJFF(i);
        }
    }

    public C1208630hYb(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final int LJFF$0(C1208630hYb c1208630hYb, int i) {
        if (i < ((DramaGuestLandingAssem) c1208630hYb.l0).Go().getState().LJIIIIZZ()) {
            return 1;
        }
        return 3;
    }

    public static final int LJFF$1(C1208630hYb c1208630hYb, int i) {
        if (i >= 1) {
            return 1;
        }
        return ((WrapGridLayoutManager) c1208630hYb.l0).LLILLJJLI;
    }

    public static final int LJFF$2(C1208630hYb c1208630hYb, int i) {
        if (C13LP.LJJJLZIJ(i, ((StoryArchiveV2CalendarAssem) c1208630hYb.l0).Go().getListItems()) instanceof C1156960gDG) {
            return 7;
        }
        return 1;
    }

    public static final int LJFF$3(C1208630hYb c1208630hYb, int i) {
        InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) C13LP.LJJJLZIJ(i, ((StoryArchiveV2ListAssem) c1208630hYb.l0).Go().getListItems());
        if (interfaceC1891350zJl instanceof C1164060gOi) {
            return 3;
        }
        if (interfaceC1891350zJl instanceof C1157030gDN) {
            return ((C1157030gDN) interfaceC1891350zJl).LL;
        }
        return 1;
    }

    public static final int LJFF$4(C1208630hYb c1208630hYb, int i) {
        int itemCount;
        AbstractC21673619ry adapter = ((RecyclerView) c1208630hYb.l0).getAdapter();
        if (adapter != null) {
            itemCount = adapter.getItemCount();
        } else {
            itemCount = 0;
        }
        if (i == itemCount - 1 && itemCount % 2 != 0) {
            return 2;
        }
        return 1;
    }
}
