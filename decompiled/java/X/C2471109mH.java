package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.external.ability.IPageToFinish;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09mH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.external.ability.OpenPhotoNextServiceImpl$gotoNextPage$1$1", f = "OpenPhotoNextServiceImpl.kt", l = {74, 85}, m = "invokeSuspend")
public final class C2471109mH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public ShortVideoContext LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public MediaModel LLILZ;
    public MediaModel LLILZIL;
    public Object LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;
    public final /* synthetic */ ShortVideoContext LLJI;
    public final /* synthetic */ List<String> LLJIJIL;
    public final /* synthetic */ C573020Mdg LLJILJIL;
    public final /* synthetic */ IPageToFinish LLJILJILJ;
    public final /* synthetic */ Bundle LLJILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2471109mH(boolean z, ShortVideoContext shortVideoContext, List<String> list, C573020Mdg c573020Mdg, IPageToFinish iPageToFinish, Bundle bundle, InterfaceC1364105Vn<? super C2471109mH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJ = z;
        this.LLJI = shortVideoContext;
        this.LLJIJIL = list;
        this.LLJILJIL = c573020Mdg;
        this.LLJILJILJ = iPageToFinish;
        this.LLJILLL = bundle;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2471109mH(this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0319  */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [T, java.util.ArrayList] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00e3 -> B:29:0x00fd). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 809
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2471109mH.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
