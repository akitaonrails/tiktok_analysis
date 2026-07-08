package X;

import android.content.Context;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import java.util.List;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.11jS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19582411jS extends AbstractC19580211j6 {
    public final InterfaceC386401eo LJ;
    public final C01GW LJFF;

    @Override // X.AbstractC19580211j6
    public final List<NormalTrackTimeStamp> LIZIZ(long j, InteractStickerStruct interactStickerStruct) {
        return C19580611jA.LIZJ(j, interactStickerStruct);
    }

    @Override // X.AbstractC19580211j6
    public final void LJIIJJI(float f, float f2, InterfaceC19579211iw interfaceC19579211iw) {
        if (C0OBG.LIZIZ(this.LIZIZ.getView())) {
            return;
        }
        C1440005kM.LIZ(new C1209650haF(this.LIZIZ.hashCode()));
        C19582611jU c19582611jU = C19582611jU.LIZ;
        Context context = this.LIZ;
        InteractStickerStruct interactStickerStruct = this.LIZJ;
        C705930RmZ c705930RmZ = this.LIZLLL;
        c19582611jU.getClass();
        C19582611jU.LIZLLL(context, interactStickerStruct, c705930RmZ);
    }

    @Override // X.AbstractC19580211j6, X.InterfaceC19594911lT
    public final boolean LJI(float f, float f2, int i, long j) {
        C1367960lha.LIZ.getClass();
        if (!C1367960lha.LIZ().LJIL()) {
            return false;
        }
        return super.LJI(f, f2, i, j);
    }

    public C19582411jS(Context context, C19582211jQ c19582211jQ, InteractStickerStruct interactStickerStruct, C705930RmZ c705930RmZ, InterfaceC386401eo interfaceC386401eo) {
        super(context, c19582211jQ, interactStickerStruct, c705930RmZ);
        this.LJ = interfaceC386401eo;
        this.LJFF = C452501pT.LIZIZ(new AwS573S0100000_29(this, 29));
    }
}
