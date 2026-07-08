package X;

import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel;
import com.ss.android.ugc.aweme.inbox.widget.multi.InboxHorizontalTopListCombinePod;
import com.ss.android.ugc.aweme.item.StoryCacheData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0rgV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel$processAndGetCacheData$2", f = "SkylightListViewModel.kt", l = {1061, 236, 240, 253}, m = "invokeSuspend")
public final class C1597930rgV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<InterfaceC1891350zJl>>, Object> {
    public Object LL;
    public InterfaceC383701eN LLILLJJLI;
    public StoryCacheData LLILLL;
    public SkylightListViewModel LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public int LLIZ;
    public final /* synthetic */ SkylightListViewModel LLIZLLLIL;
    public final /* synthetic */ InboxHorizontalTopListCombinePod LLJ;
    public final /* synthetic */ StoryCacheData LLJI;
    public final /* synthetic */ List<EnumC1598330rh9> LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1597930rgV(SkylightListViewModel skylightListViewModel, InboxHorizontalTopListCombinePod inboxHorizontalTopListCombinePod, StoryCacheData storyCacheData, List<? extends EnumC1598330rh9> list, InterfaceC1364105Vn<? super C1597930rgV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZLLLIL = skylightListViewModel;
        this.LLJ = inboxHorizontalTopListCombinePod;
        this.LLJI = storyCacheData;
        this.LLJIJIL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1597930rgV(this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01ea A[Catch: all -> 0x02b8, LOOP:2: B:100:0x01e4->B:102:0x01ea, LOOP_END, TryCatch #3 {all -> 0x02b8, blocks: (B:91:0x01bd, B:93:0x01c5, B:94:0x01ce, B:96:0x01d4, B:98:0x01dc, B:99:0x01e0, B:100:0x01e4, B:102:0x01ea, B:103:0x01f4, B:104:0x01fd, B:106:0x0203, B:108:0x020b, B:109:0x020f, B:110:0x0213, B:112:0x0219, B:113:0x0223, B:114:0x022c, B:116:0x0232, B:118:0x023a, B:119:0x023e, B:120:0x0242, B:122:0x0248, B:123:0x0252, B:124:0x0271, B:126:0x0277, B:128:0x027f, B:129:0x0283, B:130:0x0292, B:132:0x0298, B:133:0x02aa, B:137:0x02b4, B:89:0x01b6), top: B:149:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0203 A[Catch: all -> 0x02b8, TryCatch #3 {all -> 0x02b8, blocks: (B:91:0x01bd, B:93:0x01c5, B:94:0x01ce, B:96:0x01d4, B:98:0x01dc, B:99:0x01e0, B:100:0x01e4, B:102:0x01ea, B:103:0x01f4, B:104:0x01fd, B:106:0x0203, B:108:0x020b, B:109:0x020f, B:110:0x0213, B:112:0x0219, B:113:0x0223, B:114:0x022c, B:116:0x0232, B:118:0x023a, B:119:0x023e, B:120:0x0242, B:122:0x0248, B:123:0x0252, B:124:0x0271, B:126:0x0277, B:128:0x027f, B:129:0x0283, B:130:0x0292, B:132:0x0298, B:133:0x02aa, B:137:0x02b4, B:89:0x01b6), top: B:149:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0219 A[Catch: all -> 0x02b8, LOOP:4: B:110:0x0213->B:112:0x0219, LOOP_END, TryCatch #3 {all -> 0x02b8, blocks: (B:91:0x01bd, B:93:0x01c5, B:94:0x01ce, B:96:0x01d4, B:98:0x01dc, B:99:0x01e0, B:100:0x01e4, B:102:0x01ea, B:103:0x01f4, B:104:0x01fd, B:106:0x0203, B:108:0x020b, B:109:0x020f, B:110:0x0213, B:112:0x0219, B:113:0x0223, B:114:0x022c, B:116:0x0232, B:118:0x023a, B:119:0x023e, B:120:0x0242, B:122:0x0248, B:123:0x0252, B:124:0x0271, B:126:0x0277, B:128:0x027f, B:129:0x0283, B:130:0x0292, B:132:0x0298, B:133:0x02aa, B:137:0x02b4, B:89:0x01b6), top: B:149:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0232 A[Catch: all -> 0x02b8, TryCatch #3 {all -> 0x02b8, blocks: (B:91:0x01bd, B:93:0x01c5, B:94:0x01ce, B:96:0x01d4, B:98:0x01dc, B:99:0x01e0, B:100:0x01e4, B:102:0x01ea, B:103:0x01f4, B:104:0x01fd, B:106:0x0203, B:108:0x020b, B:109:0x020f, B:110:0x0213, B:112:0x0219, B:113:0x0223, B:114:0x022c, B:116:0x0232, B:118:0x023a, B:119:0x023e, B:120:0x0242, B:122:0x0248, B:123:0x0252, B:124:0x0271, B:126:0x0277, B:128:0x027f, B:129:0x0283, B:130:0x0292, B:132:0x0298, B:133:0x02aa, B:137:0x02b4, B:89:0x01b6), top: B:149:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0248 A[Catch: all -> 0x02b8, LOOP:6: B:120:0x0242->B:122:0x0248, LOOP_END, TryCatch #3 {all -> 0x02b8, blocks: (B:91:0x01bd, B:93:0x01c5, B:94:0x01ce, B:96:0x01d4, B:98:0x01dc, B:99:0x01e0, B:100:0x01e4, B:102:0x01ea, B:103:0x01f4, B:104:0x01fd, B:106:0x0203, B:108:0x020b, B:109:0x020f, B:110:0x0213, B:112:0x0219, B:113:0x0223, B:114:0x022c, B:116:0x0232, B:118:0x023a, B:119:0x023e, B:120:0x0242, B:122:0x0248, B:123:0x0252, B:124:0x0271, B:126:0x0277, B:128:0x027f, B:129:0x0283, B:130:0x0292, B:132:0x0298, B:133:0x02aa, B:137:0x02b4, B:89:0x01b6), top: B:149:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0277 A[Catch: all -> 0x02b8, TryCatch #3 {all -> 0x02b8, blocks: (B:91:0x01bd, B:93:0x01c5, B:94:0x01ce, B:96:0x01d4, B:98:0x01dc, B:99:0x01e0, B:100:0x01e4, B:102:0x01ea, B:103:0x01f4, B:104:0x01fd, B:106:0x0203, B:108:0x020b, B:109:0x020f, B:110:0x0213, B:112:0x0219, B:113:0x0223, B:114:0x022c, B:116:0x0232, B:118:0x023a, B:119:0x023e, B:120:0x0242, B:122:0x0248, B:123:0x0252, B:124:0x0271, B:126:0x0277, B:128:0x027f, B:129:0x0283, B:130:0x0292, B:132:0x0298, B:133:0x02aa, B:137:0x02b4, B:89:0x01b6), top: B:149:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0298 A[Catch: all -> 0x02b8, LOOP:8: B:130:0x0292->B:132:0x0298, LOOP_END, TryCatch #3 {all -> 0x02b8, blocks: (B:91:0x01bd, B:93:0x01c5, B:94:0x01ce, B:96:0x01d4, B:98:0x01dc, B:99:0x01e0, B:100:0x01e4, B:102:0x01ea, B:103:0x01f4, B:104:0x01fd, B:106:0x0203, B:108:0x020b, B:109:0x020f, B:110:0x0213, B:112:0x0219, B:113:0x0223, B:114:0x022c, B:116:0x0232, B:118:0x023a, B:119:0x023e, B:120:0x0242, B:122:0x0248, B:123:0x0252, B:124:0x0271, B:126:0x0277, B:128:0x027f, B:129:0x0283, B:130:0x0292, B:132:0x0298, B:133:0x02aa, B:137:0x02b4, B:89:0x01b6), top: B:149:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016f A[Catch: all -> 0x0194, TryCatch #2 {all -> 0x0194, blocks: (B:67:0x015e, B:68:0x0169, B:70:0x016f, B:72:0x017a, B:78:0x0188, B:79:0x018c), top: B:152:0x015e }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01bd A[Catch: all -> 0x02b8, TryCatch #3 {all -> 0x02b8, blocks: (B:91:0x01bd, B:93:0x01c5, B:94:0x01ce, B:96:0x01d4, B:98:0x01dc, B:99:0x01e0, B:100:0x01e4, B:102:0x01ea, B:103:0x01f4, B:104:0x01fd, B:106:0x0203, B:108:0x020b, B:109:0x020f, B:110:0x0213, B:112:0x0219, B:113:0x0223, B:114:0x022c, B:116:0x0232, B:118:0x023a, B:119:0x023e, B:120:0x0242, B:122:0x0248, B:123:0x0252, B:124:0x0271, B:126:0x0277, B:128:0x027f, B:129:0x0283, B:130:0x0292, B:132:0x0298, B:133:0x02aa, B:137:0x02b4, B:89:0x01b6), top: B:149:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01d4 A[Catch: all -> 0x02b8, TryCatch #3 {all -> 0x02b8, blocks: (B:91:0x01bd, B:93:0x01c5, B:94:0x01ce, B:96:0x01d4, B:98:0x01dc, B:99:0x01e0, B:100:0x01e4, B:102:0x01ea, B:103:0x01f4, B:104:0x01fd, B:106:0x0203, B:108:0x020b, B:109:0x020f, B:110:0x0213, B:112:0x0219, B:113:0x0223, B:114:0x022c, B:116:0x0232, B:118:0x023a, B:119:0x023e, B:120:0x0242, B:122:0x0248, B:123:0x0252, B:124:0x0271, B:126:0x0277, B:128:0x027f, B:129:0x0283, B:130:0x0292, B:132:0x0298, B:133:0x02aa, B:137:0x02b4, B:89:0x01b6), top: B:149:0x0014 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 739
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1597930rgV.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<InterfaceC1891350zJl>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
