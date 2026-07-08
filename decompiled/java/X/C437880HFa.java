package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.emojisticker.api.model.StickerInteractionDetailsInsertion;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* JADX INFO: renamed from: X.0HFa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C437880HFa implements InterfaceC19599911mH {
    public final Context LIZ;
    public final C1895007bY LIZIZ;
    public final C01GW LIZJ;
    public final C01GW LIZLLL;
    public View LJ;
    public ViewOnAttachStateChangeListenerC20604515jv LJFF;
    public TuxSheet LJI;
    public List<StickerInteractionDetailsInsertion> LJII;

    @Override // X.InterfaceC19599911mH
    public final void LJLJJI(Aweme aweme) {
        ((C1891900zKe) this.LIZJ.getValue()).LIZIZ(aweme);
    }

    @Override // X.InterfaceC19599911mH
    public final void LJLJJL(List<StickerInteractionDetailsInsertion> list) {
        TuxSheet tuxSheet;
        FragmentManager fragmentManager = (FragmentManager) this.LIZLLL.getValue();
        if (fragmentManager != null && (tuxSheet = this.LJI) != null) {
            tuxSheet.show(fragmentManager, "EmojiSliderReactionMgr");
        }
        this.LJII = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0193  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C437880HFa(android.content.Context r15, com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r16, X.C1895007bY r17) {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C437880HFa.<init>(android.content.Context, com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct, X.07bY):void");
    }

    @Override // X.InterfaceC19599911mH
    public final void LJLJJLL(int i, String str, String str2) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0HGZ(this, str, str2, i, null), 3);
    }
}
