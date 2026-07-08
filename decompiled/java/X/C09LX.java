package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09LX, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.editcut.CutOptimizedVideoChosenHandler$compileForEditorPro$1", f = "CutOptimizedVideoChosenHandler.kt", l = {447, 508, 457, 458, 493, 508, 499, 508, 508}, m = "invokeSuspend")
public final class C09LX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public C099G LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public long LLILZIL;
    public int LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ List<MediaModel> LLIZLLLIL;
    public final /* synthetic */ Intent LLJ;
    public final /* synthetic */ C0L7R LLJI;
    public final /* synthetic */ boolean LLJIJIL;
    public final /* synthetic */ Function0<Unit> LLJILJIL;
    public final /* synthetic */ boolean LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C09LX(List<? extends MediaModel> list, Intent intent, C0L7R c0l7r, boolean z, Function0<Unit> function0, boolean z2, InterfaceC1364105Vn<? super C09LX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZLLLIL = list;
        this.LLJ = intent;
        this.LLJI = c0l7r;
        this.LLJIJIL = z;
        this.LLJILJIL = function0;
        this.LLJILJILJ = z2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C09LX c09lx = new C09LX(this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, interfaceC1364105Vn);
        c09lx.LLIZ = obj;
        return c09lx;
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x025b A[ADDED_TO_REGION] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1030
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09LX.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
