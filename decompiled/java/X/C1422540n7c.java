package X;

import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0n7c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1422540n7c {
    public final int LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final TemplateCategoryData LIZLLL;
    public final long LJ;
    public final long LJFF;
    public final int LJI;
    public final C1419590n2r LJII;

    public final String toString() {
        Asset asset;
        Asset asset2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplatePlayEvent(showFrom=");
        sbLIZ.append(this.LJI == 0 ? "2-col" : "Feed");
        sbLIZ.append(", event=");
        int i = this.LIZ;
        sbLIZ.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "unknown" : "COMPLETE" : "STOP" : "PAUSE" : "RESUME" : "RENDER_FIRST_FRAME");
        sbLIZ.append(", sourceId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", position=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", templateId=");
        C1419590n2r c1419590n2r = this.LJII;
        sbLIZ.append((c1419590n2r == null || (asset2 = c1419590n2r.LIZ) == null) ? null : asset2.getAsset_id());
        sbLIZ.append(", templateName=");
        C1419590n2r c1419590n2r2 = this.LJII;
        sbLIZ.append((c1419590n2r2 == null || (asset = c1419590n2r2.LIZ) == null) ? null : asset.getTitle());
        sbLIZ.append(", categoryData=");
        TemplateCategoryData templateCategoryData = this.LIZLLL;
        sbLIZ.append(templateCategoryData != null ? templateCategoryData.key : null);
        sbLIZ.append(", currentProgress=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        C1422540n7c c1422540n7c;
        String asset_id;
        Asset asset;
        Asset asset2;
        String asset_id2 = null;
        if (obj instanceof C1422540n7c) {
            c1422540n7c = (C1422540n7c) obj;
        } else {
            c1422540n7c = null;
        }
        if (c1422540n7c == null || this.LIZ != c1422540n7c.LIZ || !Intrinsics.LJFF(this.LIZIZ, c1422540n7c.LIZIZ) || this.LIZJ != c1422540n7c.LIZJ || !Intrinsics.LJFF(this.LIZLLL, c1422540n7c.LIZLLL) || this.LJI != c1422540n7c.LJI) {
            return false;
        }
        C1419590n2r c1419590n2r = this.LJII;
        if (c1419590n2r != null && (asset2 = c1419590n2r.LIZ) != null) {
            asset_id = asset2.getAsset_id();
        } else {
            asset_id = null;
        }
        C1419590n2r c1419590n2r2 = c1422540n7c.LJII;
        if (c1419590n2r2 != null && (asset = c1419590n2r2.LIZ) != null) {
            asset_id2 = asset.getAsset_id();
        }
        if (!Intrinsics.LJFF(asset_id, asset_id2)) {
            return false;
        }
        return true;
    }

    public C1422540n7c(int i, String str, int i2, TemplateCategoryData templateCategoryData, long j, long j2, int i3, C1419590n2r c1419590n2r) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = i2;
        this.LIZLLL = templateCategoryData;
        this.LJ = j;
        this.LJFF = j2;
        this.LJI = i3;
        this.LJII = c1419590n2r;
    }
}
