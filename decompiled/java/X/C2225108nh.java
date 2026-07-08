package X;

import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08nh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.components.EditPanelPanelFavoriteComponent$modifyPanelFavorites$4", f = "EditPanelPanelFavoriteComponent.kt", l = {180, 182, 191}, m = "invokeSuspend")
public final class C2225108nh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C2244708qr LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ List<String> LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ List<String> LLJ;
    public final /* synthetic */ List<Pair<String, String>> LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2225108nh(C2244708qr c2244708qr, String str, List<String> list, boolean z, List<String> list2, List<Pair<String, String>> list3, InterfaceC1364105Vn<? super C2225108nh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c2244708qr;
        this.LLILZLL = str;
        this.LLIZ = list;
        this.LLIZLLLIL = z;
        this.LLJ = list2;
        this.LLJI = list3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2225108nh c2225108nh = new C2225108nh(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
        c2225108nh.LLILZ = obj;
        return c2225108nh;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab A[LOOP:0: B:30:0x00a5->B:32:0x00ab, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2225108nh.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
