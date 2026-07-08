package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MPe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.mvtemplate.choosemedia.PhotoModeTemplateChosenResultImpl$startUseTemplate$1", f = "PhotoModeTemplateChosenResultImpl.kt", l = {153, 158, 159}, m = "invokeSuspend")
public final class C567920MPe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C0L1E LLILZ;
    public final /* synthetic */ ShortVideoContext LLILZIL;
    public final /* synthetic */ ArrayList<MediaModel> LLILZLL;
    public final /* synthetic */ C19EG LLIZ;
    public final /* synthetic */ String LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C567920MPe(C0L1E c0l1e, ShortVideoContext shortVideoContext, ArrayList<MediaModel> arrayList, C19EG c19eg, String str, InterfaceC1364105Vn<? super C567920MPe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c0l1e;
        this.LLILZIL = shortVideoContext;
        this.LLILZLL = arrayList;
        this.LLIZ = c19eg;
        this.LLIZLLLIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C567920MPe c567920MPe = new C567920MPe(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c567920MPe.LLILLL = obj;
        return c567920MPe;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00eb  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r146) {
        /*
            Method dump skipped, instruction units count: 3141
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C567920MPe.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
