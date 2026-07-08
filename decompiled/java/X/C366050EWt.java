package X;

import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0EWt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C366050EWt implements InterfaceC379610EuV, InterfaceC366210EXj {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public final C1DRG LL;
    public final C0EX2 LLILLJJLI = C0EX2.AUDIO_TRACK;
    public final C1664750tQH LLILLL;
    public final C1664750tQH LLILZ;
    public final C1664740tQG LLILZIL;
    public final C1664750tQH LLILZLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C366050EWt.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C366050EWt.class, "epInitLegacyApi", "getEpInitLegacyApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EPSceneLegacyApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C366050EWt.class, "bottomBarApiComponent", "getBottomBarApiComponent()Lcom/ss/android/ugc/gamora/editorpro/framework/bottombar/ui/BottomBarApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C366050EWt.class, "editorContext", "getEditorContext()Lcom/ss/ugc/android/editor/core/EditorContextApi;", 0);
        c09r3.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    @Override // X.InterfaceC366210EXj
    public final void LIZ() {
    }

    @Override // X.InterfaceC366210EXj
    public final boolean LJ(C0EY3 c0ey3, C0EYD c0eyd) {
        return false;
    }

    @Override // X.InterfaceC366210EXj
    public final boolean LJFF() {
        return false;
    }

    @Override // X.InterfaceC366210EXj
    public final boolean LJII(NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
        return false;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC366210EXj
    public final C0EX2 getTaskType() {
        return this.LLILLJJLI;
    }

    public C366050EWt(C1DRG c1drg) {
        this.LL = c1drg;
        this.LLILLL = C1664770tQJ.LIZ(c1drg, InterfaceC1446740nke.class, null);
        this.LLILZ = C1664770tQJ.LIZ(c1drg, C0EC7.class, null);
        this.LLILZIL = C1664770tQJ.LIZIZ(c1drg, C0EGY.class, null);
        this.LLILZLL = C1664770tQJ.LIZ(c1drg, InterfaceC357200DzS.class, null);
    }

    @Override // X.InterfaceC366210EXj
    public final boolean LIZJ(NLETrack nLETrack) {
        return !TextUtils.isEmpty(C348350DlB.LIZ(nLETrack));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    @Override // X.InterfaceC366210EXj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.C0EXH r8, X.C0EY3 r9, X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C366050EWt.LIZLLL(X.0EXH, X.0EY3, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC366210EXj
    public final Object LJI(C0EXH c0exh, C0EY3 c0ey3, C366230EXl c366230EXl) {
        C348100Dkm c348100DkmLIZIZ;
        InterfaceC391070FUz interfaceC391070FUzLJFF;
        InterfaceC1452170ntP value = ((InterfaceC1455860nzM) this.LLILLL.getValue(this, LLIZ[0])).g().getValue();
        if (value != null) {
            c348100DkmLIZIZ = C352130DrH.LIZIZ(value);
        } else {
            c348100DkmLIZIZ = null;
        }
        NLEModel nLEModel = c0ey3.LIZ;
        List<NLETrack> listLJIJJ = C351220Dpo.LJIJJ(nLEModel);
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) listLJIJJ) {
            NLENode nLENode = (NLENode) obj;
            if (!nLENode.hasExtra("AudioTrackType") || nLENode.getExtra("AudioTrackType").length() == 0) {
                arrayList.add(obj);
            }
        }
        arrayList.size();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((NLENode) it2.next()).setExtra("AudioTrackType", "BGM");
        }
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList2 = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (C351220Dpo.LLJILLL(nLETrack)) {
                arrayList2.add(nLETrack);
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            ((NLENode) it3.next()).setExtra("AudioTrackType", "BGM");
        }
        if (c348100DkmLIZIZ != null && (interfaceC391070FUzLJFF = c348100DkmLIZIZ.LJFF()) != null) {
            interfaceC391070FUzLJFF.LJIIJJI(c0ey3.LIZ);
        }
        ((C0EC7) this.LLILZ.getValue(this, LLIZ[1])).Vi0().LIZIZ(c0ey3.LIZ);
        return Unit.LIZ;
    }

    @Override // X.InterfaceC366210EXj
    public final Object LIZIZ(C0EXH c0exh, C0EY3 c0ey3, boolean z, C366260EXo c366260EXo) {
        return C366220EXk.LIZ(this, c0exh, c0ey3, z, c366260EXo);
    }
}
