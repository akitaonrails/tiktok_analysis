package X;

import android.graphics.Bitmap;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.intelligent.IntelligentBoardSaveAssem;
import com.bytedance.android.livesdk.model.Board;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01As, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C290801As extends C09AY implements Function2<UIAssem, C291001Au<? extends C443120HZe<? extends Board, ? extends Bitmap, ? extends Integer>>, Unit> {
    public final /* synthetic */ IntelligentBoardSaveAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C290801As(IntelligentBoardSaveAssem intelligentBoardSaveAssem) {
        super(2);
        this.LL = intelligentBoardSaveAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C291001Au<? extends C443120HZe<? extends Board, ? extends Bitmap, ? extends Integer>> c291001Au) {
        C291001Au<? extends C443120HZe<? extends Board, ? extends Bitmap, ? extends Integer>> c291001Au2 = c291001Au;
        if (uIAssem.getContext() != null) {
            IntelligentBoardSaveAssem intelligentBoardSaveAssem = this.LL;
            C443120HZe<? extends Board, ? extends Bitmap, ? extends Integer> c443120HZeLIZ = c291001Au2.LIZ();
            if (c443120HZeLIZ != null) {
                Board first = c443120HZeLIZ.getFirst();
                Bitmap second = c443120HZeLIZ.getSecond();
                int iIntValue = c443120HZeLIZ.getThird().intValue();
                if (first != null) {
                    intelligentBoardSaveAssem.getClass();
                    C1790630whJ c1790630whJ = C1790620whI.LIZIZ;
                    if (c1790630whJ != null) {
                        c1790630whJ.LJIIJJI = System.currentTimeMillis();
                    }
                    if (first.version == 2) {
                        new C232900v9();
                        String strLIZLLL = C202500qF.LIZLLL(C232900v9.LIZIZ(first));
                        if (strLIZLLL == null) {
                            strLIZLLL = "#8C8C8C";
                        }
                        first.previewBgColor = strLIZLLL;
                    }
                    if (second == null) {
                        C176600m4.LIZJ(new C290901At(intelligentBoardSaveAssem, first, iIntValue));
                    } else {
                        intelligentBoardSaveAssem.Jo(first, second, iIntValue);
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
