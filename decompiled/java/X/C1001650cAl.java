package X;

import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.api.component.photomode.CommercePhotoModeAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cAl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.api.component.photomode.CommercePhotoModeAssem$resizeTagContainer$1", f = "CommercePhotoModeAssem.kt", l = {394, 404}, m = "invokeSuspend")
public final class C1001650cAl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ InterfaceC719460SKa LLILZIL;
    public final /* synthetic */ CommercePhotoModeAssem LLILZLL;
    public final /* synthetic */ FrameLayout LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1001650cAl(long j, InterfaceC719460SKa interfaceC719460SKa, CommercePhotoModeAssem commercePhotoModeAssem, FrameLayout frameLayout, InterfaceC1364105Vn<? super C1001650cAl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = j;
        this.LLILZIL = interfaceC719460SKa;
        this.LLILZLL = commercePhotoModeAssem;
        this.LLIZ = frameLayout;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1001650cAl c1001650cAl = new C1001650cAl(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c1001650cAl.LLILLL = obj;
        return c1001650cAl;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x01a8 -> B:7:0x001d). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1001650cAl.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
