package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hrw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentSortListVM$fetchSecondaryComment$1", f = "CommentListAssemVM.kt", l = {1939, 1960, 2050}, m = "invokeSuspend")
public final class C1220620hrw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1344210l5H LL;
    public C1340820kzo LLILLJJLI;
    public C20600815jK LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public boolean LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public /* synthetic */ Object LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ C1344210l5H LLJIJIL;
    public final /* synthetic */ C1340820kzo LLJILJIL;
    public final /* synthetic */ int LLJILJILJ;
    public final /* synthetic */ Aweme LLJILLL;
    public final /* synthetic */ String LLJJ;
    public final /* synthetic */ List<String> LLJJI;
    public final /* synthetic */ boolean LLJJIII;
    public final /* synthetic */ C20600815jK<InterfaceC1891350zJl> LLJJIJI;
    public final /* synthetic */ long LLJJIJIIJIL;
    public final /* synthetic */ int LLJJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1220620hrw(String str, C1344210l5H c1344210l5H, C1340820kzo c1340820kzo, int i, Aweme aweme, String str2, List<String> list, boolean z, C20600815jK<InterfaceC1891350zJl> c20600815jK, long j, int i2, InterfaceC1364105Vn<? super C1220620hrw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJI = str;
        this.LLJIJIL = c1344210l5H;
        this.LLJILJIL = c1340820kzo;
        this.LLJILJILJ = i;
        this.LLJILLL = aweme;
        this.LLJJ = str2;
        this.LLJJI = list;
        this.LLJJIII = z;
        this.LLJJIJI = c20600815jK;
        this.LLJJIJIIJIL = j;
        this.LLJJIJIL = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1220620hrw c1220620hrw = new C1220620hrw(this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII, this.LLJJIJI, this.LLJJIJIIJIL, this.LLJJIJIL, interfaceC1364105Vn);
        c1220620hrw.LLJ = obj;
        return c1220620hrw;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1220620hrw.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
