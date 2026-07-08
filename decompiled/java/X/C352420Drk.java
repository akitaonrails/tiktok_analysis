package X;

import android.content.Context;
import com.bytedance.ies.cutsame.cut_android.NLETemplateConverter;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Drk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C352420Drk {
    public final NLEModel LIZ;
    public final NLETemplateConverter LIZIZ;
    public ArrayList<NLETrackSlot> LIZJ = new ArrayList<>();

    public NLETemplateConverter LIZIZ() {
        return this.LIZIZ;
    }

    public C352420Drk(NLEModel nLEModel, String str) {
        this.LIZ = nLEModel;
        this.LIZIZ = new NLETemplateConverter(str, nLEModel);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String LIZ(Context context, String str, boolean z, boolean z2, boolean z3) throws Throwable {
        C259800zU c259800zU = new C259800zU();
        C23250099c.LJ(C23271099x.INSTANCE, new C371901cT(c259800zU, C23250099c.LIZIZ(C817503Hh.LL, C0PEM.LIZJ, null, new C351910Dqv(this, str, context, z, z2, z3, null), 2), null));
        return (String) c259800zU.element;
    }

    /* JADX WARN: Type inference failed for: r19v1, types: [X.0Drm, X.0Dry] */
    public final void LIZJ(final int i, final Context context, final String str, final Function1 function1, final boolean z) throws Throwable {
        boolean z2;
        String strLIZIZ;
        String uuid;
        boolean z3;
        int iLIZ;
        String path;
        if (this.LIZJ.isEmpty()) {
            function1.invoke(new ArrayList());
            return;
        }
        NLETrackSlot nLETrackSlot = (NLETrackSlot) ListProtector.get(this.LIZJ, i);
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        String resourceFile = nLESegmentVideoDynamicCast.getAVFile().getResourceFile();
        if (!Intrinsics.LJFF(Boolean.TRUE, C0CHQ.LIZ().LJIILL().getMediaTypeCache(resourceFile)) && !C2471909mP.LJJIII(resourceFile, true, 4)) {
            z2 = false;
        } else {
            z2 = true;
        }
        C352470Drp.LIZ.getClass();
        if ((((Boolean) C0B7S.LIZ.getValue()).booleanValue() && !z2) || 0 != 0) {
            uuid = nLETrackSlot.getUUID();
            strLIZIZ = C352470Drp.LIZIZ(str, resourceFile, nLETrackSlot.getUUID(), z2);
        } else {
            strLIZIZ = C352470Drp.LIZIZ(str, resourceFile, null, z2);
            uuid = resourceFile;
        }
        if (nLETrackSlot.getAIMatting() == null && !C351220Dpo.LJZL(nLETrackSlot)) {
            z3 = false;
        } else {
            z3 = true;
        }
        int[] iArr = new int[1];
        if (z3) {
            iLIZ = 0;
        } else {
            iLIZ = C352310DrZ.LIZ(nLESegmentVideoDynamicCast.getTimeClipStart());
        }
        iArr[0] = iLIZ;
        int[] iArr2 = {C352310DrZ.LIZ(nLESegmentVideoDynamicCast.getTimeClipEnd())};
        final C351920Dqw c351920Dqw = new C351920Dqw(nLESegmentVideoDynamicCast, z3, this, i, str, context, z, function1);
        C0VSJ c0vsjLJJIJLIJ = C2471909mP.LIZ.LJJIJLIJ(resourceFile);
        if (c0vsjLJJIJLIJ == null || (path = c0vsjLJJIJLIJ.getPath()) == null) {
            path = resourceFile;
        }
        if (C309720CCc.LIZ(C2471909mP.LJIJI(path))) {
            boolean zLIZJ = C2471909mP.LIZJ(resourceFile, strLIZIZ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TemplateProducer skip compress, copy as-is: inputPath = ");
            sbLIZ.append(resourceFile);
            sbLIZ.append(", outPath = ");
            sbLIZ.append(strLIZIZ);
            sbLIZ.append(", copied = ");
            sbLIZ.append(zLIZJ);
            C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
            if (zLIZJ && C2286708xd.LIZJ(strLIZIZ)) {
                c351920Dqw.invoke(strLIZIZ);
                return;
            }
        }
        final String str2 = strLIZIZ;
        ?? r19 = new InterfaceC352560Dry() { // from class: X.0Drm
            @Override // X.InterfaceC352560Dry
            public final void LIZIZ(String str3, String str4) {
            }

            @Override // X.InterfaceC352560Dry
            public final void LIZJ(C352570Drz c352570Drz) {
            }

            @Override // X.InterfaceC352560Dry
            public final void onProgress(float f) {
            }

            @Override // X.InterfaceC352560Dry
            public final void LJJI(String str3, String str4) {
                c351920Dqw.invoke(str2);
            }

            @Override // X.InterfaceC352560Dry
            public final void LIZ(String str3, String str4, String str5) throws Throwable {
                C352420Drk c352420Drk = this.LIZ;
                int i2 = i;
                String str6 = str;
                Context context2 = context;
                boolean z4 = z;
                Function1<ArrayList<NLETrackSlot>, Unit> function12 = function1;
                int i3 = i2 + 1;
                if (i3 < c352420Drk.LIZJ.size()) {
                    c352420Drk.LIZJ(i3, context2, str6, function12, z4);
                } else {
                    function12.invoke(c352420Drk.LIZJ);
                }
            }
        };
        if (z) {
            C2473609mg c2473609mgLIZ = C0E3A.LIZ();
            C201955140j.LJIIL("TemplateProducer hasPreload");
            if (strLIZIZ.length() > 0 && C2286708xd.LIZJ(strLIZIZ)) {
                C201955140j.LJIIL("TemplateProducer pre-resize success");
                c351920Dqw.invoke(strLIZIZ);
                return;
            }
            C352430Drl c352430Drl = new C352430Drl(strLIZIZ, c351920Dqw, context, resourceFile, str, iArr, iArr2, r19, c2473609mgLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("waitJobResult: ");
            sbLIZ2.append(uuid);
            C352470Drp.LIZLLL(C2188811AlT.LIZIZ(sbLIZ2));
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C352460Dro(uuid, c352430Drl, null), 2);
            return;
        }
        C201955140j.LJIIL("TemplateProducer optimizeMediaSize");
        C2473609mg c2473609mgLIZ2 = C0E3A.LIZ();
        C539510LDx.LIZ.getClass();
        C539510LDx.LIZIZ(context, resourceFile, strLIZIZ, 1080, 1080, str, null, iArr, iArr2, r19, c2473609mgLIZ2);
    }
}
