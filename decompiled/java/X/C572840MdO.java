package X;

import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.creative.model.edit.TextImageTaskInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.texttoimage.Text2ImageGenerator;
import dmt.av.video.VEPreviewParams;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: X.0MdO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C572840MdO extends C1455870nzN<C0CSK> implements C0CSK {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLZZIL;
    public static final int LLZ;
    public final VEPreviewParams LLLZLL;
    public final InterfaceC1731706qJ LLLZLZ;
    public Text2ImageGenerator LLLZZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C572840MdO.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLLZZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLZ = 8;
    }

    private final VideoPublishEditModel I9() {
        return (VideoPublishEditModel) this.LLLZLZ.getValue(this, LLLZZIL[0]);
    }

    @Override // X.C0CSK
    public void iv() {
        Text2ImageGenerator text2ImageGenerator = this.LLLZZ;
        if (text2ImageGenerator != null) {
            C572800MdK c572800MdK = text2ImageGenerator.LJII;
            if (c572800MdK.LJIJJ) {
                c572800MdK.LJIILL = 1;
                c572800MdK.LJI();
            }
        }
    }

    @Override // X.C1455870nzN
    public AbstractC1452680nuE G2() {
        if (C18161079j.LIZ()) {
            this.LLILZ.LJFF.LIZIZ = "TextToImagePreviewComponent";
        }
        return super.G2();
    }

    @Override // X.C1455870nzN
    public int W6() {
        int iW6 = super.W6();
        AbstractC1452680nuE abstractC1452680nuEGc = gc();
        ((C1463670oBx) (abstractC1452680nuEGc != null ? abstractC1452680nuEGc.LJJ() : null)).LJFF = true;
        return iW6;
    }

    @Override // X.C1455870nzN, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        this.LLLZZ = new Text2ImageGenerator(g().getValue());
        if (1 == ((Number) C276860AtA.LIZ.getValue()).intValue()) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C05C6(this, null), 3);
        }
    }

    public final VEPreviewParams J9() {
        return this.LLLZLL;
    }

    @Override // X.C0CSK
    public Object NT1(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
        Text2ImageGenerator text2ImageGenerator = this.LLLZZ;
        if (text2ImageGenerator != null) {
            Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C572700MdA(I9(), text2ImageGenerator, null));
            if (objLJI != C099R.LJFF()) {
                objLJI = Unit.LIZ;
            }
            if (objLJI == C099R.LJFF()) {
                return objLJI;
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    @Override // X.C0CSK
    public Object sZ0(InterfaceC1631630sYr<? super List<TextImageTaskInfo>, ? super Boolean, ? super Integer, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> interfaceC1631630sYr, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
        Text2ImageGenerator text2ImageGenerator = this.LLLZZ;
        if (text2ImageGenerator == null) {
            return Unit.LIZ;
        }
        Object objLJII = text2ImageGenerator.LJII(I9(), true, false, null, false, interfaceC1631630sYr, interfaceC1364105Vn);
        if (objLJII == C099R.LJFF()) {
            return objLJII;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C572840MdO(C1DRG c1drg, VEPreviewParams vEPreviewParams, Function1<? super C1455930nzT, Unit> function1) {
        super(c1drg, vEPreviewParams, function1, null, 8, 0 == true ? 1 : 0);
        this.LLLZLL = vEPreviewParams;
        this.LLLZLZ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    }

    public /* synthetic */ C572840MdO(C1DRG c1drg, VEPreviewParams vEPreviewParams, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c1drg, vEPreviewParams, (i & 4) != 0 ? null : function1);
    }
}
