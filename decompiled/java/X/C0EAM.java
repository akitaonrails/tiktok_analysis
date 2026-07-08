package X;

import com.ss.ugc.android.editor.base.resource.ResourceItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EAM, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EAM {
    public final Function2<Boolean, List<? extends ResourceItem>, Unit> LIZ;
    public final InterfaceC1631620sYq<Boolean, Integer, ResourceItem, Unit> LIZIZ;
    public final Function0<Unit> LIZJ;
    public final Function0<Unit> LIZLLL;
    public final Function1<ResourceItem, Unit> LJ;
    public final Function2<ResourceItem, Integer, Unit> LJFF;
    public final Function2<ResourceItem, Integer, Unit> LJI;
    public final Function0<Unit> LJII;
    public final Function0<Unit> LJIIIIZZ;
    public final Function0<Unit> LJIIIZ;
    public final Function0<Unit> LJIIJ;
    public final Function0<Unit> LJIIJJI;
    public final Function0<Boolean> LJIIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0EAM)) {
            return false;
        }
        C0EAM c0eam = (C0EAM) obj;
        return Intrinsics.LJFF(this.LIZ, c0eam.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0eam.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0eam.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0eam.LIZLLL) && Intrinsics.LJFF(this.LJ, c0eam.LJ) && Intrinsics.LJFF(this.LJFF, c0eam.LJFF) && Intrinsics.LJFF(this.LJI, c0eam.LJI) && Intrinsics.LJFF(this.LJII, c0eam.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c0eam.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c0eam.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c0eam.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c0eam.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c0eam.LJIIL);
    }

    public final int hashCode() {
        return (((((((((((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode()) * 31) + this.LJIIIZ.hashCode()) * 31) + this.LJIIJ.hashCode()) * 31) + this.LJIIJJI.hashCode()) * 31) + this.LJIIL.hashCode();
    }

    public final String toString() {
        return "RetouchPanelSceneActions(onFetchItemListFinish=" + this.LIZ + ", onItemClick=" + this.LIZIZ + ", onApplyAutoRetouchClicked=" + this.LIZJ + ", onRemoveAutoRetouchClicked=" + this.LIZLLL + ", onStartSeek=" + this.LJ + ", onSeekBarProgressChange=" + this.LJFF + ", onStopSeek=" + this.LJI + ", onResetAll=" + this.LJII + ", onApplyToAll=" + this.LJIIIIZZ + ", onSecondaryBack=" + this.LJIIIZ + ", onConfirm=" + this.LJIIJ + ", onRetry=" + this.LJIIJJI + ", isPipTrack=" + this.LJIIL + ')';
    }

    public C0EAM(C0EAN c0ean, C0EA7 c0ea7, C0EAT c0eat, C0EAK c0eak, C0EA6 c0ea6, C0EA4 c0ea4, C0EA2 c0ea2, C0EAL c0eal, C0EA1 c0ea1, C0EAR c0ear, C0EAQ c0eaq, C0EAS c0eas, C0EAP c0eap) {
        this.LIZ = c0ean;
        this.LIZIZ = c0ea7;
        this.LIZJ = c0eat;
        this.LIZLLL = c0eak;
        this.LJ = c0ea6;
        this.LJFF = c0ea4;
        this.LJI = c0ea2;
        this.LJII = c0eal;
        this.LJIIIIZZ = c0ea1;
        this.LJIIIZ = c0ear;
        this.LJIIJ = c0eaq;
        this.LJIIJJI = c0eas;
        this.LJIIL = c0eap;
    }
}
