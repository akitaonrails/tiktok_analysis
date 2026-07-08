package X;

import android.content.Context;
import com.ss.android.ugc.aweme.profile.util.IShareLinkService;
import com.ss.android.ugc.aweme.qrcode.CopyLinkChannelWithBPEA;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NTs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.qrcode.compose.ShareProfileLinkButtonComposeKt$CopyLinkButton$1$1$1", f = "ShareProfileLinkButtonCompose.kt", l = {77}, m = "invokeSuspend")
public final class C594580NTs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Context LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C594580NTs(Context context, InterfaceC1364105Vn<? super C594580NTs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C594580NTs(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShareProfileLinkButtonComposeKt@5a7a.CopyLinkButton$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LLILLJJLI);
            if (c19egLIZIZ != null) {
                IShareLinkService iShareLinkService = (IShareLinkService) C1666310tSn.LIZ.getValue();
                CopyLinkChannelWithBPEA copyLinkChannelWithBPEA = new CopyLinkChannelWithBPEA(3);
                this.LL = 1;
                if (iShareLinkService.LIZ(c19egLIZIZ, copyLinkChannelWithBPEA, null, this) == objLJFF) {
                    C1C7U.LIZIZ("ShareProfileLinkButtonComposeKt@5a7a.CopyLinkButton$1$1$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShareProfileLinkButtonComposeKt@5a7a.CopyLinkButton$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
