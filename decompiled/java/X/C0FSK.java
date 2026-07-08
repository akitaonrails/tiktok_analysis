package X;

import Y.AObjectS365S0100000_22;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0FSK, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FSK {
    public final VideoPublishEditModel LIZ;
    public final C19A3 LIZIZ;
    public final FrameLayout.LayoutParams LIZJ;
    public final InterfaceC1452170ntP LIZLLL;
    public final Function1<Boolean, Unit> LJ;
    public C390390FSj LJFF;
    public C0FSN LJI;
    public final C01GW LJII = C452501pT.LIZIZ(new AwS549S0100000_5(this, 103));
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(61));
    public C0FSL LJIIIZ;

    public final void LIZ() {
        if (this.LJFF == null) {
            return;
        }
        C1466090oFr.LIZLLL(this.LIZ.creativeModel.stickerModel, EnumC1466150oFx.ADD_YOURS);
        C390390FSj c390390FSj = this.LJFF;
        if (c390390FSj != null) {
            List<StickerModel> listLIZLLL = c390390FSj.LIZLLL();
            ArrayList arrayList = new ArrayList();
            for (Object obj : (ArrayList) listLIZLLL) {
                if (((StickerModel) obj).getStickerType() == EnumC1466150oFx.ADD_YOURS) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C1466090oFr.LIZIZ(this.LIZ.creativeModel.stickerModel, (StickerModel) it2.next());
            }
        }
    }

    public C0FSK(VideoPublishEditModel videoPublishEditModel, C19A3 c19a3, FrameLayout.LayoutParams layoutParams, InterfaceC1452170ntP interfaceC1452170ntP, AObjectS365S0100000_22 aObjectS365S0100000_22) {
        this.LIZ = videoPublishEditModel;
        this.LIZIZ = c19a3;
        this.LIZJ = layoutParams;
        this.LIZLLL = interfaceC1452170ntP;
        this.LJ = aObjectS365S0100000_22;
    }
}
