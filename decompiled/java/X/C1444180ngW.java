package X;

import Y.ACallableS415S0100000_8;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0ngW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1444180ngW {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1  */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.0sYq, java.lang.String, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Pair<android.graphics.Bitmap, java.lang.Boolean> LIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r15) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1444180ngW.LIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):kotlin.Pair");
    }

    public static void LIZIZ(VideoPublishEditModel videoPublishEditModel, final Function2 function2) {
        if (C1428470nHB.LJJZZI(videoPublishEditModel) && C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_cover_async_extraction_manager_enable", true) == 1) {
            C1444190ngX c1444190ngX = new C1444190ngX(videoPublishEditModel);
            c1444190ngX.LJFF = function2;
            C23250099c.LIZLLL(C20178213xM.LIZLLL, null, null, new C20178413xO(new C1457070o1J(videoPublishEditModel, null, 1001, null, c1444190ngX.LIZ, c1444190ngX.LIZIZ, c1444190ngX.LIZJ, c1444190ngX.LIZLLL, c1444190ngX.LJ, false, false, null, false, false, null, null, null, null, null, function2, 3072), null), 3);
            return;
        }
        C15O7.LIZJ(new ACallableS415S0100000_8(videoPublishEditModel, 23)).LJ(new InterfaceC2385309Wh() { // from class: X.03oq
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7 c15o7) {
                C1C7U.LIZ("ImageCoverHelperKt@2181.loadImageCover$2");
                function2.invoke((Bitmap) ((Pair) c15o7.LJIIL()).getFirst(), (Boolean) ((Pair) c15o7.LJIIL()).getSecond());
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("ImageCoverHelperKt@2181.loadImageCover$2");
                return unit;
            }
        }, C15O7.LJIIIIZZ, null);
    }
}
