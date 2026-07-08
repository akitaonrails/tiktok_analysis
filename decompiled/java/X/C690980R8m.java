package X;

import android.content.Context;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.OcrLocation;
import com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility;

/* JADX INFO: renamed from: X.0R8m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C690980R8m implements InterfaceC19582111jP {
    public final Context LIZ;
    public final Aweme LIZIZ;
    public final C692910RFx LIZJ;
    public final OcrLocation LIZLLL;
    public final ViewGroup LJ;
    public final CellAdaptionComponentAbility LJFF;

    @Override // X.InterfaceC19582111jP
    public final C690990R8n LIZ() {
        C690990R8n c690990R8nFF0;
        Aweme aweme = this.LIZIZ;
        if (aweme == null || aweme.getVideo() == null) {
            return new C690990R8n(0, 0);
        }
        CellAdaptionComponentAbility cellAdaptionComponentAbility = this.LJFF;
        return (cellAdaptionComponentAbility == null || (c690990R8nFF0 = cellAdaptionComponentAbility.FF0(this.LIZ, this.LIZIZ, this.LIZLLL, this.LJ)) == null) ? this.LIZJ.LIZIZ(this.LIZ, this.LIZIZ, this.LJ) : c690990R8nFF0;
    }

    public C690980R8m(Context context, Aweme aweme, C692910RFx c692910RFx, OcrLocation ocrLocation, ViewGroup viewGroup, CellAdaptionComponentAbility cellAdaptionComponentAbility) {
        this.LIZ = context;
        this.LIZIZ = aweme;
        this.LIZJ = c692910RFx;
        this.LIZLLL = ocrLocation;
        this.LJ = viewGroup;
        this.LJFF = cellAdaptionComponentAbility;
    }
}
