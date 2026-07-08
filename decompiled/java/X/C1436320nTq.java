package X;

import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nTq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1436320nTq extends AbstractC1446660nkW {
    public VideoPublishEditModel LJ;
    public PublishModel LJFF;

    public C1436320nTq() {
        super(2, EnumC1434770nRL.COMPILE);
    }

    public final void LJI() {
        C1436350nTt c1436350nTt;
        VideoPublishEditModel videoPublishEditModel;
        PublishModel publishModel = this.LJFF;
        if (publishModel == null) {
            publishModel = null;
        }
        if (publishModel.isEditSave || C1433730nPf.LJIILL() > 1) {
            return;
        }
        C1436310nTp c1436310nTp = C1436310nTp.LIZ;
        VideoPublishEditModel videoPublishEditModel2 = this.LJ;
        if (videoPublishEditModel2 == null) {
            videoPublishEditModel2 = null;
        }
        String str = videoPublishEditModel2.creativeModel.editSaveLocalModel.flowId;
        c1436310nTp.getClass();
        C1436350nTt c1436350nTt2 = C1436310nTp.LIZJ;
        if (Intrinsics.LJFF(str, c1436350nTt2 != null ? c1436350nTt2.LIZJ : null) && (c1436350nTt = C1436310nTp.LIZJ) != null && c1436350nTt.LJI) {
            C1436310nTp.LJII("restart pending save local");
            C1436350nTt c1436350nTt3 = C1436310nTp.LIZJ;
            if (c1436350nTt3 != null && (videoPublishEditModel = c1436350nTt3.LJ) != null) {
                C1436310nTp.LJIILJJIL(c1436310nTp, videoPublishEditModel, null, false, true, 6);
            }
            C1436350nTt c1436350nTt4 = C1436310nTp.LIZJ;
            C1436310nTp.LIZJ = c1436350nTt4 != null ? C1436350nTt.LIZ(c1436350nTt4, null, false, null, false, null, 0, 4031) : null;
        }
    }

    @Override // X.AbstractC1446660nkW
    public final void LJ(Object obj, C1404610meh c1404610meh) {
        Iterator<Object> it2 = c1404610meh.LIZ.iterator();
        while (true) {
            PublishModel publishModel = null;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (next instanceof C1434960nRe) {
                if (next != null) {
                    this.LJ = ((C1434960nRe) next).LIZ;
                    Iterator<Object> it3 = c1404610meh.LIZ.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Object next2 = it3.next();
                        if (next2 instanceof C1434970nRf) {
                            if (next2 != null) {
                                this.LJFF = ((C1434970nRf) next2).LIZ;
                                C1436310nTp.LIZ.getClass();
                                C1436310nTp.LIZIZ = true;
                                PublishModel publishModel2 = this.LJFF;
                                if (publishModel2 != null) {
                                    publishModel = publishModel2;
                                }
                                if (publishModel.isEditSave) {
                                    C1436310nTp.LJII("edit save compile start");
                                    return;
                                }
                                return;
                            }
                        }
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishModelContainer");
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
    }

    @Override // X.AbstractC1446660nkW
    public final void LIZ(Object obj, AbstractC1404540mea abstractC1404540mea, int i, int i2) {
        C1436310nTp.LIZ.getClass();
        C1436310nTp.LIZIZ = false;
        LJI();
        PublishModel publishModel = this.LJFF;
        if (publishModel == null) {
            publishModel = null;
        }
        if (publishModel.isEditSave) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("edit save compile canceled, cause: ");
            sbLIZ.append(abstractC1404540mea);
            C1436310nTp.LJII(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // X.AbstractC1446660nkW
    public final void LIZJ(Object obj, C1435220nS4 c1435220nS4, int i, int i2) {
        C1436310nTp.LIZ.getClass();
        C1436310nTp.LIZIZ = false;
        LJI();
        PublishModel publishModel = this.LJFF;
        if (publishModel == null) {
            publishModel = null;
        }
        if (publishModel.isEditSave) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("edit save compile failed, error: ");
            sbLIZ.append(c1435220nS4);
            C1436310nTp.LJII(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // X.AbstractC1446660nkW
    public final void LJFF(Object obj, Object obj2, boolean z, int i, int i2) {
        PublishModel publishModel;
        String str;
        C1436310nTp.LIZ.getClass();
        C1436310nTp.LIZIZ = false;
        PublishModel publishModel2 = this.LJFF;
        PublishModel publishModel3 = null;
        C1436350nTt c1436350nTtLIZ = null;
        if (publishModel2 == null) {
            publishModel = null;
        } else {
            publishModel = publishModel2;
        }
        if (publishModel.isEditSave && (obj2 instanceof SynthetiseResult)) {
            VideoPublishEditModel videoPublishEditModel = this.LJ;
            if (videoPublishEditModel == null) {
                videoPublishEditModel = null;
            }
            String str2 = videoPublishEditModel.creativeModel.editSaveLocalModel.flowId;
            SynthetiseResult synthetiseResult = (SynthetiseResult) obj2;
            C1436350nTt c1436350nTt = C1436310nTp.LIZJ;
            if (c1436350nTt != null) {
                str = c1436350nTt.LIZJ;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str2, str)) {
                C1436310nTp.LJII("setResultWhenSameFlow success");
                C1436350nTt c1436350nTt2 = C1436310nTp.LIZJ;
                if (c1436350nTt2 != null) {
                    c1436350nTtLIZ = C1436350nTt.LIZ(c1436350nTt2, null, false, null, false, synthetiseResult, 0, 3967);
                }
                C1436310nTp.LIZJ = c1436350nTtLIZ;
            }
            C1436310nTp.LJII("edit save compile complete");
            return;
        }
        if (publishModel2 == null) {
            publishModel2 = null;
        }
        if (publishModel2.isEditPrePublish && (obj2 instanceof SynthetiseResult)) {
            VideoPublishEditModel videoPublishEditModel2 = this.LJ;
        }
        LJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("some task compile success, is edit prepublish: ");
        PublishModel publishModel4 = this.LJFF;
        if (publishModel4 != null) {
            publishModel3 = publishModel4;
        }
        sbLIZ.append(publishModel3.isEditPrePublish);
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
