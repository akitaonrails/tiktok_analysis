package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.model.edit.EditImageInfo;
import com.ss.android.ugc.aweme.creative.model.edit.PhotoTemplateAsset;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.image.phototemplate.processor.PhotoTemplateMagicProcessor;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nH4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1428400nH4 implements InterfaceC1428350nGz {
    public C1428420nH6 LIZ;
    public C1428420nH6 LIZIZ;
    public SingleImageData LIZJ;
    public volatile long LIZLLL;
    public final List<InterfaceC1428350nGz> LJ;

    @Override // X.InterfaceC1428350nGz
    public final PhotoTemplateAsset LIZLLL() {
        C1428420nH6 c1428420nH6 = this.LIZ;
        if (c1428420nH6 != null) {
            return c1428420nH6.LIZ;
        }
        return null;
    }

    @Override // X.InterfaceC1428350nGz
    public final void LJFF() {
        this.LIZIZ = this.LIZ;
        this.LIZ = null;
    }

    @Override // X.InterfaceC1428350nGz
    public final void LIZJ() {
        if (C0C0Q.LIZ()) {
            this.LIZLLL++;
        }
        Iterator<InterfaceC1428350nGz> it2 = this.LJ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZJ();
        }
    }

    @Override // X.InterfaceC1428350nGz
    public final String LIZ(NLEModel nLEModel) {
        InterfaceC1428350nGz interfaceC1428350nGz;
        C1428420nH6 c1428420nH6 = this.LIZ;
        if (c1428420nH6 == null || (interfaceC1428350nGz = c1428420nH6.LIZIZ) == null) {
            return null;
        }
        return interfaceC1428350nGz.LIZ(c1428420nH6.LIZJ);
    }

    @Override // X.InterfaceC1428350nGz
    public final void LIZIZ(SingleImageData singleImageData) {
        SingleImageData singleImageData2 = this.LIZJ;
        boolean z = false;
        if (singleImageData2 != null && singleImageData2.getSrcImageInfo().equals(singleImageData.getSrcImageInfo())) {
            EditImageInfo editImageInfo = singleImageData2.getEditImageInfo();
            EditImageInfo editImageInfo2 = singleImageData.getEditImageInfo();
            if (Intrinsics.LJ(editImageInfo.getScaleAfterCrop(), editImageInfo2.getScaleAfterCrop()) && Intrinsics.LJ(editImageInfo.getOffsetX(), editImageInfo2.getOffsetX()) && Intrinsics.LJ(editImageInfo.getOffsetY(), editImageInfo2.getOffsetY()) && Intrinsics.LJFF(editImageInfo.getCanvasTransformParams(), editImageInfo2.getCanvasTransformParams())) {
                z = true;
            }
        }
        if (z) {
            this.LIZIZ = this.LIZ;
            this.LIZ = null;
        } else {
            this.LIZ = null;
            this.LIZIZ = null;
        }
        this.LIZJ = singleImageData;
        Iterator<InterfaceC1428350nGz> it2 = this.LJ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ(singleImageData);
        }
    }

    @Override // X.InterfaceC1428350nGz
    public final NLEModel LJI(PhotoTemplateAsset photoTemplateAsset) {
        PhotoTemplateAsset photoTemplateAsset2;
        PhotoTemplateAsset photoTemplateAsset3;
        if (C1413020msG.LIZIZ(photoTemplateAsset)) {
            return null;
        }
        C1428420nH6 c1428420nH6 = this.LIZ;
        if (c1428420nH6 != null) {
            photoTemplateAsset2 = c1428420nH6.LIZ;
        } else {
            photoTemplateAsset2 = null;
        }
        if (C1413020msG.LIZ(photoTemplateAsset, photoTemplateAsset2)) {
            C1428420nH6 c1428420nH62 = this.LIZ;
            if (c1428420nH62 == null) {
                return null;
            }
            return c1428420nH62.LIZJ;
        }
        C1428420nH6 c1428420nH63 = this.LIZIZ;
        if (c1428420nH63 != null) {
            photoTemplateAsset3 = c1428420nH63.LIZ;
        } else {
            photoTemplateAsset3 = null;
        }
        if (!C1413020msG.LIZ(photoTemplateAsset, photoTemplateAsset3)) {
            return null;
        }
        C1428420nH6 c1428420nH64 = this.LIZIZ;
        this.LIZIZ = this.LIZ;
        this.LIZ = c1428420nH64;
        C385200F8k.LIZ("CompositePhotoTemplateProcessor", "fastApplyTemplate: cached last cache");
        C1428420nH6 c1428420nH65 = this.LIZ;
        if (c1428420nH65 == null) {
            return null;
        }
        return c1428420nH65.LIZJ;
    }

    @Override // X.InterfaceC1428350nGz
    public final boolean LJII(PhotoTemplateAsset photoTemplateAsset) {
        List<InterfaceC1428350nGz> list = this.LJ;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<InterfaceC1428350nGz> it2 = list.iterator();
        while (it2.hasNext()) {
            if (it2.next().LJII(photoTemplateAsset)) {
                return true;
            }
        }
        return false;
    }

    public C1428400nH4(Context context, InterfaceC1428340nGy interfaceC1428340nGy, C1424090nA7 c1424090nA7) {
        this.LJ = C1697810uHb.LJIIJJI(new PhotoTemplateMagicProcessor(context, interfaceC1428340nGy, c1424090nA7), new C0E08(interfaceC1428340nGy, c1424090nA7));
    }

    @Override // X.InterfaceC1428350nGz
    public final AbstractC19484711Kz<NLEModel> LJ(int i, final PhotoTemplateAsset photoTemplateAsset, NLETrackSlot nLETrackSlot, NLEModel nLEModel, LifecycleOwner lifecycleOwner, Function1<? super Integer, Unit> function1) {
        InterfaceC1428350nGz next;
        this.LIZLLL++;
        final long j = this.LIZLLL;
        Iterator<InterfaceC1428350nGz> it2 = this.LJ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LJII(photoTemplateAsset)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        final InterfaceC1428350nGz interfaceC1428350nGz = next;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("applyTemplate: pick processor:");
        sbLIZ.append(interfaceC1428350nGz);
        C385200F8k.LIZ("CompositePhotoTemplateProcessor", C2188811AlT.LIZIZ(sbLIZ));
        if (interfaceC1428350nGz == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Unsupported template ");
            sbLIZ2.append(photoTemplateAsset);
            return AbstractC19484711Kz.LJIILLIIL(new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2)));
        }
        return interfaceC1428350nGz.LJ(i, photoTemplateAsset, nLETrackSlot, nLEModel, lifecycleOwner, function1).LJIILL(new C09JN() { // from class: X.0nH5
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("CompositePhotoTemplateProcessor@66a5.applyTemplate$1");
                NLENode nLENode = (NLENode) obj;
                if (C0C0Q.LIZ() && j != this.LIZLLL) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("applyTemplate: drop stale result seq=");
                    sbLIZ3.append(j);
                    sbLIZ3.append(" current=");
                    sbLIZ3.append(this.LIZLLL);
                    C385200F8k.LIZ("CompositePhotoTemplateProcessor", C2188811AlT.LIZIZ(sbLIZ3));
                } else {
                    C1428400nH4 c1428400nH4 = this;
                    c1428400nH4.LIZIZ = c1428400nH4.LIZ;
                    c1428400nH4.LIZ = new C1428420nH6(photoTemplateAsset, interfaceC1428350nGz, NLEModel.dynamicCast(nLENode.deepClone()));
                }
                C1C7U.LIZIZ("CompositePhotoTemplateProcessor@66a5.applyTemplate$1");
            }
        });
    }
}
