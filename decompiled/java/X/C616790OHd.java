package X;

import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinEmojiAbility;

/* JADX INFO: renamed from: X.0OHd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C616790OHd implements InterfaceC616810OHf {
    public final /* synthetic */ BulletinEmojiAbility LIZ;

    @Override // X.InterfaceC616810OHf
    public final void u3() {
    }

    public C616790OHd(BulletinEmojiAbility bulletinEmojiAbility) {
        this.LIZ = bulletinEmojiAbility;
    }

    @Override // X.InterfaceC616810OHf
    public final void y6(String str, C0OSZ c0osz) {
        BulletinEmojiAbility bulletinEmojiAbility = this.LIZ;
        if (bulletinEmojiAbility != null) {
            bulletinEmojiAbility.if2(str, "click_interaction_detail_panel_emoji", c0osz);
        }
    }
}
