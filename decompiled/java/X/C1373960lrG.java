package X;

import android.content.Context;
import com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0lrG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler$executeShare$1$1", f = "BaseChannelShareHandler.kt", l = {148, 149}, m = "invokeSuspend")
public final class C1373960lrG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ BaseChannelShareHandler<BaseSharePackage> LLILZ;
    public final /* synthetic */ InterfaceC1371340ln2 LLILZIL;
    public final /* synthetic */ InterfaceC1369790lkX LLILZLL;
    public final /* synthetic */ BaseSharePackage LLIZ;
    public final /* synthetic */ Context LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1373960lrG(Context context, BaseChannelShareHandler baseChannelShareHandler, InterfaceC1371340ln2 interfaceC1371340ln2, BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = baseChannelShareHandler;
        this.LLILZIL = interfaceC1371340ln2;
        this.LLILZLL = interfaceC1369790lkX;
        this.LLIZ = baseSharePackage;
        this.LLIZLLLIL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        BaseChannelShareHandler<BaseSharePackage> baseChannelShareHandler = this.LLILZ;
        InterfaceC1371340ln2 interfaceC1371340ln2 = this.LLILZIL;
        InterfaceC1369790lkX interfaceC1369790lkX = this.LLILZLL;
        C1373960lrG c1373960lrG = new C1373960lrG(this.LLIZLLLIL, baseChannelShareHandler, interfaceC1371340ln2, this.LLIZ, interfaceC1369790lkX, interfaceC1364105Vn);
        c1373960lrG.LLILLL = obj;
        return c1373960lrG;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1373960lrG.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
