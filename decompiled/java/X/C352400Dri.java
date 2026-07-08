package X;

import android.content.Context;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dri, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.ugctemplate.UgcTemplateHelper$resizePUGCMedias$1", f = "UgcTemplateHelper.kt", l = {}, m = "invokeSuspend")
public final class C352400Dri extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ VideoPublishEditModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C352400Dri(Context context, VideoPublishEditModel videoPublishEditModel, InterfaceC1364105Vn<? super C352400Dri> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
        this.LLILLJJLI = videoPublishEditModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C352400Dri(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UgcTemplateHelper@192b.resizePUGCMedias$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Context context = this.LL;
        VideoPublishEditModel videoPublishEditModel = this.LLILLJJLI;
        NLEModel nLEModelLIZJ = C0E4Z.LIZJ(videoPublishEditModel);
        EnumC20228014Cw enumC20228014Cw = EnumC20228014Cw.UGC_TEMPLATE_ZIP;
        C352470Drp c352470Drp = C352470Drp.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resizeMedias: ");
        sbLIZ.append(enumC20228014Cw);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c352470Drp.getClass();
        C352470Drp.LIZLLL(strLIZIZ);
        VecNLETrackSPtr tracks = nLEModelLIZJ.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (NLETrackType.VIDEO == nLETrack.getTrackType()) {
                arrayList.add(nLETrack);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((NLETrack) it2.next()).getSortedSlots(), arrayList2);
        }
        if (!(!arrayList2.isEmpty())) {
            arrayList2 = null;
        }
        C352650Ds7.LIZ.getClass();
        C352650Ds7.LIZ(nLEModelLIZJ);
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C352410Drj(arrayList2, videoPublishEditModel, enumC20228014Cw, context, null), 2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UgcTemplateHelper@192b.resizePUGCMedias$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
