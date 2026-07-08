package X;

import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import com.ss.android.ugc.aweme.notice.repo.list.bean.SingleBulletinItemCreateInfo;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0OOL, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.utils.BulletinPublishManager$publishMultiItems$1", f = "BulletinPublishManager.kt", l = {1847}, m = "invokeSuspend")
public final class C0OOL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ List<SingleBulletinItemCreateInfo> LLILLL;
    public final /* synthetic */ List<BulletinBaseItem> LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ Map<String, String> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0OOL(List<SingleBulletinItemCreateInfo> list, List<? extends BulletinBaseItem> list2, boolean z, String str, boolean z2, Map<String, String> map, InterfaceC1364105Vn<? super C0OOL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = list2;
        this.LLILZIL = z;
        this.LLILZLL = str;
        this.LLIZ = z2;
        this.LLIZLLLIL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0OOL(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:139:0x032e A[Catch: Exception -> 0x0392, TryCatch #4 {Exception -> 0x0392, blocks: (B:85:0x022f, B:86:0x0232, B:88:0x0257, B:89:0x025b, B:91:0x026b, B:92:0x0276, B:94:0x027c, B:96:0x0284, B:99:0x028c, B:101:0x0292, B:103:0x0298, B:105:0x02a0, B:107:0x02a8, B:110:0x02b3, B:137:0x031f, B:139:0x032e, B:141:0x0334, B:142:0x033a, B:144:0x0340, B:111:0x02c1, B:113:0x02c9, B:115:0x02d5, B:116:0x02db, B:136:0x0319, B:121:0x02e8, B:123:0x02f0, B:125:0x02f4, B:126:0x02f8, B:128:0x02fe, B:129:0x0304, B:135:0x0312, B:148:0x034f, B:149:0x0353, B:150:0x0354, B:151:0x0362, B:153:0x0368, B:155:0x0370, B:158:0x0383, B:159:0x038d, B:160:0x0391), top: B:184:0x022f }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0354 A[Catch: Exception -> 0x0392, TryCatch #4 {Exception -> 0x0392, blocks: (B:85:0x022f, B:86:0x0232, B:88:0x0257, B:89:0x025b, B:91:0x026b, B:92:0x0276, B:94:0x027c, B:96:0x0284, B:99:0x028c, B:101:0x0292, B:103:0x0298, B:105:0x02a0, B:107:0x02a8, B:110:0x02b3, B:137:0x031f, B:139:0x032e, B:141:0x0334, B:142:0x033a, B:144:0x0340, B:111:0x02c1, B:113:0x02c9, B:115:0x02d5, B:116:0x02db, B:136:0x0319, B:121:0x02e8, B:123:0x02f0, B:125:0x02f4, B:126:0x02f8, B:128:0x02fe, B:129:0x0304, B:135:0x0312, B:148:0x034f, B:149:0x0353, B:150:0x0354, B:151:0x0362, B:153:0x0368, B:155:0x0370, B:158:0x0383, B:159:0x038d, B:160:0x0391), top: B:184:0x022f }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0348 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0257 A[Catch: Exception -> 0x0392, TryCatch #4 {Exception -> 0x0392, blocks: (B:85:0x022f, B:86:0x0232, B:88:0x0257, B:89:0x025b, B:91:0x026b, B:92:0x0276, B:94:0x027c, B:96:0x0284, B:99:0x028c, B:101:0x0292, B:103:0x0298, B:105:0x02a0, B:107:0x02a8, B:110:0x02b3, B:137:0x031f, B:139:0x032e, B:141:0x0334, B:142:0x033a, B:144:0x0340, B:111:0x02c1, B:113:0x02c9, B:115:0x02d5, B:116:0x02db, B:136:0x0319, B:121:0x02e8, B:123:0x02f0, B:125:0x02f4, B:126:0x02f8, B:128:0x02fe, B:129:0x0304, B:135:0x0312, B:148:0x034f, B:149:0x0353, B:150:0x0354, B:151:0x0362, B:153:0x0368, B:155:0x0370, B:158:0x0383, B:159:0x038d, B:160:0x0391), top: B:184:0x022f }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x026b A[Catch: Exception -> 0x0392, TryCatch #4 {Exception -> 0x0392, blocks: (B:85:0x022f, B:86:0x0232, B:88:0x0257, B:89:0x025b, B:91:0x026b, B:92:0x0276, B:94:0x027c, B:96:0x0284, B:99:0x028c, B:101:0x0292, B:103:0x0298, B:105:0x02a0, B:107:0x02a8, B:110:0x02b3, B:137:0x031f, B:139:0x032e, B:141:0x0334, B:142:0x033a, B:144:0x0340, B:111:0x02c1, B:113:0x02c9, B:115:0x02d5, B:116:0x02db, B:136:0x0319, B:121:0x02e8, B:123:0x02f0, B:125:0x02f4, B:126:0x02f8, B:128:0x02fe, B:129:0x0304, B:135:0x0312, B:148:0x034f, B:149:0x0353, B:150:0x0354, B:151:0x0362, B:153:0x0368, B:155:0x0370, B:158:0x0383, B:159:0x038d, B:160:0x0391), top: B:184:0x022f }] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 1018
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0OOL.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
