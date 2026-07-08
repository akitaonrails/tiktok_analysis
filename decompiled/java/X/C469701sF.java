package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01sF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.edit.cover.CoverCreationManager$saveNewCoverSync$1", f = "CoverCreationManager.kt", l = {473}, m = "invokeSuspend")
public final class C469701sF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ VideoPublishEditModel LLILLJJLI;
    public final /* synthetic */ Bitmap LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C469701sF(VideoPublishEditModel videoPublishEditModel, Bitmap bitmap, int i, int i2, String str, int i3, InterfaceC1364105Vn<? super C469701sF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = videoPublishEditModel;
        this.LLILLL = bitmap;
        this.LLILZ = i;
        this.LLILZIL = i2;
        this.LLILZLL = str;
        this.LLIZ = i3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C469701sF(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJIJ = obj;
        C1C7U.LIZ("CoverCreationManager@555f.saveNewCoverSync$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJIJ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJIJ);
            C0MH8 c0mh8 = C0MH8.LIZ;
            VideoPublishEditModel videoPublishEditModel = this.LLILLJJLI;
            Bitmap bitmap = this.LLILLL;
            int i2 = this.LLILZ;
            int i3 = this.LLILZIL;
            String str = this.LLILZLL;
            int i4 = this.LLIZ;
            this.LL = 1;
            c0mh8.getClass();
            C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            C0MH8.LJIIZILJ(c0mh8, videoPublishEditModel, bitmap, i2, i3, str, i4, null, new C5183020f(c2252611DEt, 11), 64);
            objLJIJ = c2252611DEt.LJIJ();
            if (objLJIJ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLJIJ == objLJFF) {
                C1C7U.LIZIZ("CoverCreationManager@555f.saveNewCoverSync$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("CoverCreationManager@555f.saveNewCoverSync$1");
        return objLJIJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
