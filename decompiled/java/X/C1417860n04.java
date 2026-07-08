package X;

import com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.MetaExt;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0n04, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.autocut.mob.AutoCutNetworkRequestMobListener$onRequestMusicFinish$1", f = "AutoCutNetworkRequestListener.kt", l = {}, m = "invokeSuspend")
public final class C1417860n04 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C1417870n05 LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ CutsameDataItem LLILZIL;
    public final /* synthetic */ List<MetaExt> LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ long LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ Long LLJILJIL;
    public final /* synthetic */ String LLJILJILJ;
    public final /* synthetic */ boolean LLJILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1417860n04(String str, String str2, C1417870n05 c1417870n05, boolean z, CutsameDataItem cutsameDataItem, List<MetaExt> list, int i, int i2, String str3, long j, String str4, Long l, String str5, boolean z2, InterfaceC1364105Vn<? super C1417860n04> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = c1417870n05;
        this.LLILZ = z;
        this.LLILZIL = cutsameDataItem;
        this.LLILZLL = list;
        this.LLIZ = i;
        this.LLIZLLLIL = i2;
        this.LLJ = str3;
        this.LLJI = j;
        this.LLJIJIL = str4;
        this.LLJILJIL = l;
        this.LLJILJILJ = str5;
        this.LLJILLL = z2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1417860n04(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010b  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1417860n04.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
