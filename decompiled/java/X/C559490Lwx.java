package X;

import android.content.Context;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS8S0201100_8;

/* JADX INFO: renamed from: X.0Lwx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C559490Lwx extends AbstractC2255721DQs<C0ME1> implements C0ME1, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public static final int LLJI;
    public final C1DRG LL;
    public final C0ME1 LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 524));
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1446740nke.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC559500Lwy.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1453420nvQ.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC564940MDs.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C559490Lwx.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C559490Lwx.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C559490Lwx.class, "editAutoSaveDraftApi", "getEditAutoSaveDraftApi()Lcom/ss/android/ugc/gamora/editor/draft/EditAutoSaveDraftApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C559490Lwx.class, "editExitApi", "getEditExitApi()Lcom/ss/android/ugc/gamora/editor/exit/EditExitApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C559490Lwx.class, "taskHandler", "getTaskHandler()Lcom/ss/android/ugc/gamora/editor/ailive/AILiveTaskApi;", 0);
        c09r3.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
        LLJI = 8;
    }

    private final InterfaceC559500Lwy X1() {
        return (InterfaceC559500Lwy) this.LLILZLL.getValue(this, LLJ[2]);
    }

    private final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLILLL.getValue(this, LLJ[0]);
    }

    private final NLEEditor o2() {
        return (NLEEditor) this.LLILZ.getValue();
    }

    private final InterfaceC564940MDs w2() {
        return (InterfaceC564940MDs) this.LLIZLLLIL.getValue(this, LLJ[4]);
    }

    public final InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) this.LLILZIL.getValue(this, LLJ[1]);
    }

    public final InterfaceC1453420nvQ Z1() {
        return (InterfaceC1453420nvQ) this.LLIZ.getValue(this, LLJ[3]);
    }

    public C0ME1 W1() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C559490Lwx(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.C0ME1
    public void h6(Function0<Unit> function0) {
        C537710L6z c537710L6z = C537710L6z.LIZ;
        Context contextLJIIIZ = C1664590tQ1.LJIIIZ(this);
        VideoPublishEditModel editModel = getEditModel();
        InterfaceC1453420nvQ interfaceC1453420nvQZ1 = Z1();
        AwS587S0100000_8 awS587S0100000_8 = new AwS587S0100000_8(function0, (Function0<Unit>) 346);
        c537710L6z.getClass();
        C537710L6z.LIZIZ(contextLJIIIZ, "ai_livephoto_publish_auto_save", 29, editModel, interfaceC1453420nvQZ1, awS587S0100000_8);
    }

    @Override // X.C0ME1
    public void TB2(String str, int i) {
        do1(str, i, new AwS552S0100000_8(this, 525));
    }

    @Override // X.C0ME1
    public void do1(String str, int i, Function0<Unit> function0) {
        w2().kj2();
        w2().kq();
        if (C1428470nHB.LJJJZ(getEditModel())) {
            InterfaceC1453420nvQ interfaceC1453420nvQZ1 = Z1();
            if (interfaceC1453420nvQZ1 != null && !interfaceC1453420nvQZ1.Q2()) {
                InterfaceC559500Lwy interfaceC559500LwyX1 = X1();
                if (interfaceC559500LwyX1 != null) {
                    interfaceC559500LwyX1.Bw0();
                }
                function0.invoke();
                C537710L6z c537710L6z = C537710L6z.LIZ;
                C19EG c19egLIZIZ = C1388190mED.LIZIZ(C1664590tQ1.LJIIIZ(this));
                c537710L6z.getClass();
                C537710L6z.LIZLLL(i, c19egLIZIZ);
                return;
            }
            C537710L6z c537710L6z2 = C537710L6z.LIZ;
            Context contextLJIIIZ = C1664590tQ1.LJIIIZ(this);
            InterfaceC1453420nvQ interfaceC1453420nvQZ12 = Z1();
            AwS587S0100000_8 awS587S0100000_8 = new AwS587S0100000_8(function0, (Function0<Unit>) 344);
            c537710L6z2.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            CreativeDialogWrapper creativeDialogWrapperLIZ = C537710L6z.LIZ(contextLJIIIZ);
            creativeDialogWrapperLIZ.show();
            if (interfaceC1453420nvQZ12 != null) {
                interfaceC1453420nvQZ12.Ys0(str, i, AFwS194S0000000_8.get$arr$(348), new C537690L6x(creativeDialogWrapperLIZ, i, contextLJIIIZ, awS587S0100000_8, jCurrentTimeMillis), new AwS8S0201100_8(creativeDialogWrapperLIZ, awS587S0100000_8, i, jCurrentTimeMillis, 0));
                return;
            }
            return;
        }
        C537710L6z c537710L6z3 = C537710L6z.LIZ;
        Context contextLJIIIZ2 = C1664590tQ1.LJIIIZ(this);
        VideoPublishEditModel editModel = getEditModel();
        InterfaceC1453420nvQ interfaceC1453420nvQZ13 = Z1();
        AwS587S0100000_8 awS587S0100000_82 = new AwS587S0100000_8(function0, (Function0<Unit>) 345);
        c537710L6z3.getClass();
        C537710L6z.LIZIZ(contextLJIIIZ2, str, i, editModel, interfaceC1453420nvQZ13, awS587S0100000_82);
    }
}
