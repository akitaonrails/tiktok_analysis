package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.model.EditorProCancelData;
import com.ss.android.ugc.gamora.editorpro.model.EditorProSaveData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS619S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ein, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C372350Ein {
    public final Function1<EditorProCancelData, Unit> LIZ;
    public final Function2<EditorProSaveData, Boolean, Unit> LIZIZ;
    public final InterfaceC1631630sYr<Boolean, Boolean, Boolean, Boolean, Unit> LIZJ;
    public final Function0<Unit> LIZLLL;
    public final Function0<Unit> LJ;
    public final Function0<Unit> LJFF;
    public final Function0<Unit> LJI;
    public final Function1<Function0<Unit>, Unit> LJII;
    public final Function0<Unit> LJIIIIZZ;
    public final Function0<Unit> LJIIIZ;
    public final InterfaceC1631620sYq<NLEModel, Boolean, Boolean, Unit> LJIIJ;
    public final Function0<Unit> LJIIJJI;
    public final Function0<C19A3> LJIIL;
    public final Function2<VideoPublishEditModel, Boolean, AbstractC2217051Bpv> LJIILIIL;
    public final Function0<C0EPN> LJIILJJIL;
    public final Function0<Unit> LJIILL;
    public final Function0<Unit> LJIILLIIL;
    public final Function0<Unit> LJIIZILJ;
    public final Function0<Boolean> LJIJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C372350Ein)) {
            return false;
        }
        C372350Ein c372350Ein = (C372350Ein) obj;
        return Intrinsics.LJFF(this.LIZ, c372350Ein.LIZ) && Intrinsics.LJFF(this.LIZIZ, c372350Ein.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c372350Ein.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c372350Ein.LIZLLL) && Intrinsics.LJFF(this.LJ, c372350Ein.LJ) && Intrinsics.LJFF(this.LJFF, c372350Ein.LJFF) && Intrinsics.LJFF(this.LJI, c372350Ein.LJI) && Intrinsics.LJFF(this.LJII, c372350Ein.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c372350Ein.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c372350Ein.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c372350Ein.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c372350Ein.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c372350Ein.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c372350Ein.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c372350Ein.LJIILJJIL) && Intrinsics.LJFF(this.LJIILL, c372350Ein.LJIILL) && Intrinsics.LJFF(this.LJIILLIIL, c372350Ein.LJIILLIIL) && Intrinsics.LJFF(this.LJIIZILJ, c372350Ein.LJIIZILJ) && Intrinsics.LJFF(this.LJIJ, c372350Ein.LJIJ);
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode()) * 31) + this.LJIIIZ.hashCode()) * 31) + this.LJIIJ.hashCode()) * 31) + this.LJIIJJI.hashCode()) * 31) + this.LJIIL.hashCode()) * 31) + this.LJIILIIL.hashCode()) * 31) + this.LJIILJJIL.hashCode()) * 31) + this.LJIILL.hashCode()) * 31) + this.LJIILLIIL.hashCode()) * 31) + this.LJIIZILJ.hashCode()) * 31) + this.LJIJ.hashCode();
    }

    public final String toString() {
        return "EditorProSceneActions(setCancelResult=" + this.LIZ + ", setSaveResult=" + this.LIZIZ + ", backToEditPage=" + this.LIZJ + ", onAnimInStart=" + this.LIZLLL + ", onAnimInEnd=" + this.LJ + ", onAnimOutEnd=" + this.LJFF + ", nextToPublishPage=" + this.LJI + ", registerResizeCallback=" + this.LJII + ", syncDataFromNormalEdit=" + this.LJIIIIZZ + ", syncDataFromPublish=" + this.LJIIIZ + ", onNLEModelDoneNodeChanged=" + this.LJIIJ + ", onBackFromPublishPage=" + this.LJIIJJI + ", getParentScene=" + this.LJIIL + ", getCaptionRecognizePresenter=" + this.LJIILIIL + ", getEditorProCationDelegate=" + this.LJIILJJIL + ", firstUIFrameRender=" + this.LJIILL + ", clickSaveStart=" + this.LJIILLIIL + ", fullScreenClickNextToPublishEvent=" + this.LJIIZILJ + ", preCheckSave=" + this.LJIJ + ')';
    }

    public C372350Ein(C372360Eio c372360Eio, AwS619S0100000_5 awS619S0100000_5, C372290Eih c372290Eih, C372420Eiu c372420Eiu, C372430Eiv c372430Eiv, C372440Eiw c372440Eiw, C372450Eix c372450Eix, C372320Eik c372320Eik, C372460Eiy c372460Eiy, C372470Eiz c372470Eiz, C372280Eig c372280Eig, C372330Eil c372330Eil, C372370Eip c372370Eip, C372100EiO c372100EiO, C372300Eii c372300Eii, C372340Eim c372340Eim, C372400Eis c372400Eis, C372410Eit c372410Eit, C372310Eij c372310Eij) {
        this.LIZ = c372360Eio;
        this.LIZIZ = awS619S0100000_5;
        this.LIZJ = c372290Eih;
        this.LIZLLL = c372420Eiu;
        this.LJ = c372430Eiv;
        this.LJFF = c372440Eiw;
        this.LJI = c372450Eix;
        this.LJII = c372320Eik;
        this.LJIIIIZZ = c372460Eiy;
        this.LJIIIZ = c372470Eiz;
        this.LJIIJ = c372280Eig;
        this.LJIIJJI = c372330Eil;
        this.LJIIL = c372370Eip;
        this.LJIILIIL = c372100EiO;
        this.LJIILJJIL = c372300Eii;
        this.LJIILL = c372340Eim;
        this.LJIILLIIL = c372400Eis;
        this.LJIIZILJ = c372410Eit;
        this.LJIJ = c372310Eij;
    }
}
