package X;

import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;

/* JADX INFO: renamed from: X.0L3m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C536800L3m {
    public static C2344009Gk LIZ() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        ShortVideoContext shortVideoContextLIZ = C536810L3n.LIZ();
        c2344009Gk.LJIIIIZZ("shoot_way", shortVideoContextLIZ != null ? shortVideoContextLIZ.shootWay : null);
        ShortVideoContext shortVideoContextLIZ2 = C536810L3n.LIZ();
        c2344009Gk.LJIIIIZZ("creation_id", shortVideoContextLIZ2 != null ? shortVideoContextLIZ2.getCreationId() : null);
        c2344009Gk.LJIIIIZZ("enter_from", "mv_preview");
        c2344009Gk.LJIIIIZZ("content_type", C536810L3n.LIZJ);
        c2344009Gk.LJIIIIZZ("content_source", "upload");
        CutsameDataItem cutsameDataItemLIZIZ = C536810L3n.LIZIZ();
        c2344009Gk.LJIIIIZZ("mv_id", cutsameDataItemLIZIZ != null ? cutsameDataItemLIZIZ.templateId : null);
        return c2344009Gk;
    }
}
