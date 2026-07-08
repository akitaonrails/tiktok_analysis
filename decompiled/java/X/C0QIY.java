package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0QIY, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QIY implements Runnable {
    public final /* synthetic */ Integer LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ String LLILZLL;

    public C0QIY(String str, String str2, String str3, boolean z, String str4, Integer num) {
        this.LL = num;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = z;
        this.LLILZLL = str4;
    }

    public final void LIZ() {
        C0QIZ c0qiz = new C0QIZ();
        Integer num = this.LL;
        if (num != null) {
            c0qiz.LJIIZILJ("item_num", String.valueOf(num));
        }
        c0qiz.LJ("search_position", this.LLILLJJLI);
        c0qiz.LJ("search_entrance", this.LLILLL);
        c0qiz.LJ("blankpage_id", this.LLILZ);
        c0qiz.LJ("has_sound_label", this.LLILZIL ? "1" : CardStruct.IStatusCode.DEFAULT);
        c0qiz.LJIIZILJ("action_type", this.LLILZLL);
        c0qiz.LJIILJJIL();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("SearchHistoryStatistics@5509.sendShowEvent$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchHistoryStatistics@5509.sendShowEvent$1");
    }
}
