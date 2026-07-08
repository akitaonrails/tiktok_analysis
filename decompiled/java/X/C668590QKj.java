package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0QKj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C668590QKj extends C650460PfI<C668590QKj> {
    public C668590QKj() {
        super("ttk_search_sug_request_monitor");
    }

    public final void LJJIJLIJ() {
        if (this.LJIILLIIL.containsKey("ret")) {
            return;
        }
        LJIIZILJ("ret", "1");
        LJIIZILJ("reason", "success");
    }

    public final void LJJIJL(String str) {
        if (!this.LJIILLIIL.containsKey("ret")) {
            LJIIZILJ("ret", CardStruct.IStatusCode.DEFAULT);
            LJIIZILJ("reason", str);
        }
    }

    public final void LJJIL(String str) {
        LJIIZILJ("type", str);
    }
}
