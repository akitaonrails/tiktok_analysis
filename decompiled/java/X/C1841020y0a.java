package X;

import android.content.Context;
import com.ss.android.ugc.aweme.widget.model.SuggestedVideoWidgetData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0y0a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.widget.utils.SuggestedVideoWidgetUpdateUtil$update$1", f = "SuggestedVideoWidgetUpdateUtil.kt", l = {181}, m = "invokeSuspend")
public final class C1841020y0a extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public SuggestedVideoWidgetData LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ int[] LLILZIL;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZLL;
    public final /* synthetic */ boolean LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1841020y0a(Context context, int[] iArr, Function1<? super Boolean, Unit> function1, boolean z, InterfaceC1364105Vn<? super C1841020y0a> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = context;
        this.LLILZIL = iArr;
        this.LLILZLL = function1;
        this.LLIZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1841020y0a(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02a8 A[Catch: Exception -> 0x033b, TryCatch #3 {Exception -> 0x033b, blocks: (B:78:0x020b, B:80:0x020f, B:83:0x0215, B:85:0x0221, B:87:0x022b, B:143:0x030b, B:145:0x031f, B:146:0x032e, B:148:0x0332, B:88:0x023a, B:90:0x0240, B:92:0x0244, B:93:0x024a, B:96:0x0252, B:98:0x0258, B:100:0x025c, B:103:0x0262, B:106:0x0268, B:109:0x026e, B:112:0x0274, B:119:0x0282, B:126:0x0290, B:132:0x029c, B:135:0x02a1, B:138:0x02a8, B:139:0x02bf, B:141:0x02e8, B:142:0x02f5), top: B:171:0x020b }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02bf A[Catch: Exception -> 0x033b, TryCatch #3 {Exception -> 0x033b, blocks: (B:78:0x020b, B:80:0x020f, B:83:0x0215, B:85:0x0221, B:87:0x022b, B:143:0x030b, B:145:0x031f, B:146:0x032e, B:148:0x0332, B:88:0x023a, B:90:0x0240, B:92:0x0244, B:93:0x024a, B:96:0x0252, B:98:0x0258, B:100:0x025c, B:103:0x0262, B:106:0x0268, B:109:0x026e, B:112:0x0274, B:119:0x0282, B:126:0x0290, B:132:0x029c, B:135:0x02a1, B:138:0x02a8, B:139:0x02bf, B:141:0x02e8, B:142:0x02f5), top: B:171:0x020b }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02f5 A[Catch: Exception -> 0x033b, TryCatch #3 {Exception -> 0x033b, blocks: (B:78:0x020b, B:80:0x020f, B:83:0x0215, B:85:0x0221, B:87:0x022b, B:143:0x030b, B:145:0x031f, B:146:0x032e, B:148:0x0332, B:88:0x023a, B:90:0x0240, B:92:0x0244, B:93:0x024a, B:96:0x0252, B:98:0x0258, B:100:0x025c, B:103:0x0262, B:106:0x0268, B:109:0x026e, B:112:0x0274, B:119:0x0282, B:126:0x0290, B:132:0x029c, B:135:0x02a1, B:138:0x02a8, B:139:0x02bf, B:141:0x02e8, B:142:0x02f5), top: B:171:0x020b }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x031f A[Catch: Exception -> 0x033b, TryCatch #3 {Exception -> 0x033b, blocks: (B:78:0x020b, B:80:0x020f, B:83:0x0215, B:85:0x0221, B:87:0x022b, B:143:0x030b, B:145:0x031f, B:146:0x032e, B:148:0x0332, B:88:0x023a, B:90:0x0240, B:92:0x0244, B:93:0x024a, B:96:0x0252, B:98:0x0258, B:100:0x025c, B:103:0x0262, B:106:0x0268, B:109:0x026e, B:112:0x0274, B:119:0x0282, B:126:0x0290, B:132:0x029c, B:135:0x02a1, B:138:0x02a8, B:139:0x02bf, B:141:0x02e8, B:142:0x02f5), top: B:171:0x020b }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0332 A[Catch: Exception -> 0x033b, TRY_LEAVE, TryCatch #3 {Exception -> 0x033b, blocks: (B:78:0x020b, B:80:0x020f, B:83:0x0215, B:85:0x0221, B:87:0x022b, B:143:0x030b, B:145:0x031f, B:146:0x032e, B:148:0x0332, B:88:0x023a, B:90:0x0240, B:92:0x0244, B:93:0x024a, B:96:0x0252, B:98:0x0258, B:100:0x025c, B:103:0x0262, B:106:0x0268, B:109:0x026e, B:112:0x0274, B:119:0x0282, B:126:0x0290, B:132:0x029c, B:135:0x02a1, B:138:0x02a8, B:139:0x02bf, B:141:0x02e8, B:142:0x02f5), top: B:171:0x020b }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x020f A[Catch: Exception -> 0x033b, TryCatch #3 {Exception -> 0x033b, blocks: (B:78:0x020b, B:80:0x020f, B:83:0x0215, B:85:0x0221, B:87:0x022b, B:143:0x030b, B:145:0x031f, B:146:0x032e, B:148:0x0332, B:88:0x023a, B:90:0x0240, B:92:0x0244, B:93:0x024a, B:96:0x0252, B:98:0x0258, B:100:0x025c, B:103:0x0262, B:106:0x0268, B:109:0x026e, B:112:0x0274, B:119:0x0282, B:126:0x0290, B:132:0x029c, B:135:0x02a1, B:138:0x02a8, B:139:0x02bf, B:141:0x02e8, B:142:0x02f5), top: B:171:0x020b }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0212  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 906
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1841020y0a.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
