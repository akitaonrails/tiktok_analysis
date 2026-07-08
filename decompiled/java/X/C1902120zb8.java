package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0zb8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1902120zb8 extends AbstractC624280OeA<C1902120zb8> {
    public boolean LJI;
    public String LJII;

    public C1902120zb8() {
        super("edit_popup_event");
        this.LJII = "";
    }

    @Override // X.AbstractC624280OeA
    public final void LIZLLL() {
        super.LIZLLL();
        LIZ(this.LJI ? 1 : 0, "is_show");
        LIZJ(FollowStatusChangeMethod.PARAM_UID, this.LJII);
    }
}
