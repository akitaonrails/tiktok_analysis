package X;

import X.C0QDA;

/* JADX INFO: renamed from: X.0QDA, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public class C0QDA<T extends C0QDA<T>> extends C650460PfI<T> {
    public static final /* synthetic */ int LJIIZILJ = 0;

    public C0QDA(String str) {
        super(str);
    }

    public final void LJJIJL(Integer num) {
        LJIIZILJ("doc_rank", String.valueOf(num));
    }

    public final void LJJIJLIJ(Object obj) {
        if (obj != null) {
            LJ("enter_group_id", obj.toString());
        }
    }

    public final void LJJIL(Integer num) {
        LJIIZILJ("group_position", String.valueOf(num));
    }

    public final void LJJIZ(boolean z) {
        if (z) {
            LIZLLL(1, "has_coin_entrance");
        }
    }

    public final void LJJJ(Boolean bool) {
        int i;
        if (bool != null) {
            if (bool.booleanValue()) {
                i = 1;
            } else {
                i = 0;
            }
        } else {
            i = -1;
        }
        LIZLLL(i, "is_traffic_ads");
    }

    public final void LJJJI(Boolean bool) {
        int i;
        if (bool != null) {
            if (bool.booleanValue()) {
                i = 1;
            } else {
                i = 0;
            }
        } else {
            i = -1;
        }
        LIZLLL(i, "is_video_ads");
    }

    public final void LJJJIL(String str) {
        LJIIZILJ("micon_state", str);
    }

    public final void LJJJJ(String str) {
        LJIIZILJ("search_position", str);
    }

    public final void LJJJJI(String str) {
        LJIIZILJ("icon_type", str);
    }

    public final void LJJJJIZL(Object obj) {
        if (obj != null) {
            LJ("tab_name", obj.toString());
        }
    }

    public final void LJJJJJ(String str) {
        LJIIZILJ("word_state", str);
    }

    public final void LJJJJJL(Integer num) {
        LJIIZILJ("words_num", String.valueOf(num));
    }

    public final void LJJJJL(Integer num) {
        LJIIZILJ("words_position", String.valueOf(num));
    }

    public final void LJJJJLI(String str) {
        LJIIZILJ("words_type", str);
    }
}
