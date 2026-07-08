package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0EXb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C366130EXb implements C0EMV, InterfaceC350220DoC, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public final C1DRG LL;
    public final C1664740tQG LLILLJJLI;
    public final C01GW LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C366130EXb.class, "editEffectModelApiComponent", "getEditEffectModelApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/effect/EditEffectModelApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C366130EXb.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0);
        c09r3.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public C366130EXb(C1DRG c1drg) {
        this.LL = c1drg;
        C1664770tQJ.LIZIZ(c1drg, InterfaceC364140EPk.class, null);
        this.LLILLJJLI = C1664770tQJ.LIZIZ(c1drg, InterfaceC1446740nke.class, null);
        this.LLILLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1044));
    }

    @Override // X.C0EMV
    public final void LIZ(C0EMO c0emo) {
        c0emo.LIZ();
    }

    @Override // X.C0EMV
    public final void LIZJ(C0EMO c0emo) {
        c0emo.LIZ();
    }

    @Override // X.InterfaceC350220DoC
    public final void LIZLLL(C0EMN c0emn) {
        VideoPublishEditModel videoPublishEditModel;
        final C348100Dkm c348100DkmLIZ;
        final InterfaceC1446740nke interfaceC1446740nke;
        NLEModel nLEModelLIZ = c0emn.LIZ();
        if (nLEModelLIZ == null || (videoPublishEditModel = c0emn.LIZJ) == null || (c348100DkmLIZ = ((C366320EXu) this.LLILLL.getValue()).LIZ()) == null || (interfaceC1446740nke = ((C366320EXu) this.LLILLL.getValue()).LIZ) == null) {
            return;
        }
        C0EYI.LIZ(nLEModelLIZ, videoPublishEditModel, new C0EYK() { // from class: X.0EXi
            @Override // X.C0EYK
            public final void LIZIZ(C0EYM c0eym) {
            }

            @Override // X.C0EYK
            public final boolean LIZ() {
                Boolean value = interfaceC1446740nke.sc1().getValue();
                if (value != null) {
                    return value.booleanValue();
                }
                return false;
            }

            @Override // X.C0EYK
            public final int getDuration() {
                return c348100DkmLIZ.LJIIIIZZ().getDuration();
            }

            @Override // X.C0EYK
            public final List<EffectPointModel> o9() {
                return interfaceC1446740nke.o9();
            }
        }, null, C13BV.INSTANCE);
    }

    @Override // X.C0EMV
    public final void LJ(C0EMO c0emo) {
        c0emo.LIZ();
    }
}
