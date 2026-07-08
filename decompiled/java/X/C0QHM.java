package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0QHM, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QHM implements InterfaceC1355760lNu {
    public static final C0QHM LIZ = new C0QHM();

    @Override // X.InterfaceC1355760lNu
    public final void G(String str, boolean z) {
        C0Q2M.LIZ.getClass();
        C0Q2M.LJIIIIZZ(str, z);
    }

    @Override // X.InterfaceC1355760lNu
    public final void LLLLIILL(String str, String str2, String str3, String str4, boolean z) {
        C0PVO c0pvo = new C0PVO();
        c0pvo.LJIL(str);
        c0pvo.LJIIZILJ("impr_id", str2);
        c0pvo.LJJJJ(str3);
        c0pvo.LJIIZILJ("words_source", "search_bar_outer");
        c0pvo.LJIIZILJ("words_content", str4);
        String str5 = "1";
        c0pvo.LJIIZILJ("is_from_outside", "1");
        if (!z) {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        c0pvo.LJIIZILJ("not_full_word", str5);
        c0pvo.LJIILJJIL();
    }
}
