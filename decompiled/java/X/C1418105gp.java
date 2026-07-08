package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Size;
import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.preview.PurePreviewMediaEngine;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05gp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.ui.preview.PurePreviewMediaEngine$ComposeThumbnail$2$1", f = "PurePreviewMediaEngine.kt", l = {238, 253}, m = "invokeSuspend")
public final class C1418105gp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public PurePreviewMediaEngine LL;
    public C05P0 LLILLJJLI;
    public C05P0 LLILLL;
    public Object LLILZ;
    public long LLILZIL;
    public int LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ Size LLIZLLLIL;
    public final /* synthetic */ SocMediaResource LLJ;
    public final /* synthetic */ PurePreviewMediaEngine LLJI;
    public final /* synthetic */ Context LLJIJIL;
    public final /* synthetic */ C05P0<List<C1685910tyP>> LLJILJIL;
    public final /* synthetic */ C05P0<Bitmap> LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1418105gp(Size size, SocMediaResource socMediaResource, PurePreviewMediaEngine purePreviewMediaEngine, Context context, C05P0<List<C1685910tyP>> c05p0, C05P0<Bitmap> c05p02, InterfaceC1364105Vn<? super C1418105gp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZLLLIL = size;
        this.LLJ = socMediaResource;
        this.LLJI = purePreviewMediaEngine;
        this.LLJIJIL = context;
        this.LLJILJIL = c05p0;
        this.LLJILJILJ = c05p02;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1418105gp c1418105gp = new C1418105gp(this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, interfaceC1364105Vn);
        c1418105gp.LLIZ = obj;
        return c1418105gp;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b1, code lost:
    
        if (X.C23212097q.LIZJ(r15, r11) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b3, code lost:
    
        r11 = r14.LLJI;
        r12 = r14.LLJ;
        r1 = r14.LLJILJIL;
        r0 = r14.LLJILJILJ;
        X.C2296808zG.LJFF(r6);
        r5 = X.C0PEM.LIZ;
        r4 = new X.C1404205ea(r12, r15, null);
        r14.LLIZ = r6;
        r14.LL = r11;
        r14.LLILLJJLI = r1;
        r14.LLILLL = r0;
        r14.LLILZ = r15;
        r14.LLILZIL = r2;
        r14.LLILZLL = 2;
        r4 = X.C23250099c.LJI(r14, r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d7, code lost:
    
        if (r4 != r10) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d9, code lost:
    
        X.C1C7U.LIZIZ("PurePreviewMediaEngine@cdc6.ComposeThumbnail$2$1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00dc, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0105, code lost:
    
        if (r15 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0110, code lost:
    
        r8 = r15;
        r15 = r4;
     */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1418105gp.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
