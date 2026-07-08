package X;

import android.content.Intent;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0nJf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.vechoosecover.jsb.EcEditVideoCoverMethod$handleResult$1", f = "EcEditVideoCoverMethod.kt", l = {152, 156, 170, 171, 176}, m = "invokeSuspend")
public final class C1430010nJf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Intent LLILLL;
    public final /* synthetic */ VideoPublishEditModel LLILZ;
    public final /* synthetic */ C1432140nN6 LLILZIL;
    public final /* synthetic */ DialogC1389620mGW LLILZLL;
    public final /* synthetic */ CompletionBlock<InterfaceC1463805oC> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1430010nJf(Intent intent, VideoPublishEditModel videoPublishEditModel, C1432140nN6 c1432140nN6, DialogC1389620mGW dialogC1389620mGW, CompletionBlock<InterfaceC1463805oC> completionBlock, InterfaceC1364105Vn<? super C1430010nJf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = intent;
        this.LLILZ = videoPublishEditModel;
        this.LLILZIL = c1432140nN6;
        this.LLILZLL = dialogC1389620mGW;
        this.LLIZ = completionBlock;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1430010nJf c1430010nJf = new C1430010nJf(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c1430010nJf.LLILLJJLI = obj;
        return c1430010nJf;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0262 A[Catch: JSONException -> 0x0280, TRY_ENTER, TryCatch #1 {JSONException -> 0x0280, blocks: (B:112:0x0240, B:114:0x0246, B:116:0x024c, B:117:0x0250, B:121:0x0262, B:122:0x026a, B:124:0x0270), top: B:138:0x0240 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x026a A[Catch: JSONException -> 0x0280, TryCatch #1 {JSONException -> 0x0280, blocks: (B:112:0x0240, B:114:0x0246, B:116:0x024c, B:117:0x0250, B:121:0x0262, B:122:0x026a, B:124:0x0270), top: B:138:0x0240 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01af  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1430010nJf.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
