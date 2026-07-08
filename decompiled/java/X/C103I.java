package X;

import java.util.Collections;
import kotlin.jvm.internal.AFwS271S0000000_28;

/* JADX INFO: renamed from: X.103I, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C103I {
    public static final C103L LIZ;

    static {
        C103N c103n = new C103N("");
        C107N c107n = new C107N("visibility", "publish_permission", 2);
        c107n.LIZ = "post_visibility_options";
        c107n.LJ = new C103N(2131850517);
        C105M c105m = new C105M(0);
        c105m.LIZ = "post_visibility_options_public";
        c105m.LJ = new C103N(AFwS271S0000000_28.get$arr$(7));
        C105M c105m2 = new C105M(2);
        c105m2.LIZ = "post_visibility_options_friend_visible";
        c105m2.LJ = new C103N(2131829278);
        c105m2.LJFF = new C103N(2131829275);
        C105M c105m3 = new C105M(3);
        c105m3.LIZ = "post_visibility_options_subscriber";
        c105m3.LJ = new C103N(2131849239);
        C105M c105m4 = new C105M(1);
        c105m4.LIZ = "post_visibility_options_private";
        c105m4.LJ = new C103N(2131829280);
        c107n.LJIIJJI = C1697810uHb.LJIILJJIL(c105m, c105m2, c105m3, c105m4);
        C107O c107o = new C107O("comment", "comment", 2);
        c107o.LIZ = "post_comment_permission_item";
        c107o.LJ = new C103N(2131826413);
        c107o.LJIIJJI = 0;
        c107o.LJIIL = 3;
        C107O c107o2 = new C107O("content_reuse_permission", "content_reuse_permission", 2);
        c107o2.LIZ = "post_content_reuse_permission_item";
        c107o2.LJ = new C103N(2131845573);
        c107o2.LJFF = new C103N(2131845572);
        c107o2.LJIIJJI = 1;
        c107o2.LJIIL = 2;
        C107O c107o3 = new C107O("allow_ai_remix", "allow_ai_remix", 2);
        c107o3.LIZ = "post_ai_remix_permission_item";
        c107o3.LJ = new C103N(2131846001);
        c107o3.LJIIJJI = 1;
        c107o3.LJIIL = 2;
        LIZ = new C103L("post_process", c103n, 0, "sheet", C1697810uHb.LJIIJJI(C191853103v.LIZ(null, Collections.singletonList(c107n), null, 12), C191853103v.LIZ(null, C1697810uHb.LJIIJJI(c107o, c107o2, c107o3), new C103N(""), 8)), 32);
    }
}
