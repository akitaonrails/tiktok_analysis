package X;

import com.ss.android.ugc.aweme.creative.model.record.CameraLayoutModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MkA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C577040MkA {
    public static final AbstractC577050MkB LIZ(CameraLayoutModel cameraLayoutModel) {
        if (!cameraLayoutModel.layoutEnabled) {
            return null;
        }
        for (AbstractC577050MkB abstractC577050MkB : C1697810uHb.LJIIJJI(C577090MkF.LJFF, C577130MkJ.LJFF, C577160MkM.LJFF, C577110MkH.LJFF, C577080MkE.LJFF, C577100MkG.LJFF, C577150MkL.LJFF, C577070MkD.LJFF, C577120MkI.LJFF)) {
            if (Intrinsics.LJFF(abstractC577050MkB.LIZLLL(), cameraLayoutModel.layoutMode)) {
                return abstractC577050MkB;
            }
        }
        return null;
    }

    public static final AbstractC577050MkB LIZIZ(int i) {
        switch (i) {
        }
        return C577090MkF.LJFF;
    }
}
