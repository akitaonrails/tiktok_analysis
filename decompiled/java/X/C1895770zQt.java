package X;

import android.graphics.Bitmap;
import com.bytedance.touchpoint.api.model.ChristmasShareInfo;
import com.bytedance.touchpoint.api.model.ShareTopPanel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0zQt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1895770zQt extends C09AY implements Function1<Long, Unit> {
    public C1895770zQt() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Long l) {
        String str;
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ;
        l.longValue();
        C1895760zQs.LL.getClass();
        C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
        ChristmasShareInfo christmasShareInfo = (ChristmasShareInfo) C2178808gE.LIZ().LJ(72);
        if (christmasShareInfo != null) {
            C1895760zQs.LLJ = christmasShareInfo;
            C1895760zQs.LLIZ = christmasShareInfo.shareBubble;
            ShareTopPanel shareTopPanel = christmasShareInfo.shareTopPanel;
            C1895760zQs.LLIZLLLIL = shareTopPanel;
            if (shareTopPanel != null && (str = shareTopPanel.iconUrl) != null && str.length() != 0 && (interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ()) != null) {
                interfaceC1897260zTILIZIZ.LJ(str, new InterfaceC2281081EQg() { // from class: X.0zR4
                    @Override // X.InterfaceC2281081EQg
                    public final void onFailed() {
                    }

                    @Override // X.InterfaceC2281081EQg
                    public final void LIZ(Bitmap bitmap) {
                        if (bitmap != null) {
                            C1895760zQs.LLJI = bitmap;
                        }
                    }
                });
            }
        }
        return Unit.LIZ;
    }
}
