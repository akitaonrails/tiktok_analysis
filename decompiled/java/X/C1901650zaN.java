package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zaN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1901650zaN extends AbstractC624280OeA<C1901650zaN> {
    public String LJI;
    public int LJII;

    public C1901650zaN() {
        super("inbox_unread_remind_button");
    }

    @Override // X.AbstractC624280OeA
    public final void LIZLLL() {
        super.LIZLLL();
        String str = this.LJI;
        if (str != null) {
            LIZIZ("action_type", str);
        }
        if (Intrinsics.LJFF(this.LJI, "click")) {
            return;
        }
        LIZ(this.LJII, "show_cnt");
    }
}
