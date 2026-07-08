package X;

import android.content.Context;
import com.ss.android.ugc.aweme.model.VipSubscriptionDetailResponse;
import com.ss.android.ugc.aweme.model.VipSubscriptionPurchaseOption;
import com.ss.android.ugc.aweme.series.vip.model.SeriesSubscriptionModels$TradeProductInfo;
import com.ss.android.ugc.aweme.series.vip.viewmodel.SeriesVipSubscriptionViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0s7d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.series.vip.viewmodel.SeriesVipSubscriptionViewModel$onCtaClicked$1", f = "SeriesVipSubscriptionViewModel.kt", l = {360, 399, 401, 425, 428, 474, 514, 530, 534}, m = "invokeSuspend")
public final class C1614750s7d extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1614710s7Z LL;
    public VipSubscriptionDetailResponse LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public VipSubscriptionPurchaseOption LLILZIL;
    public SeriesSubscriptionModels$TradeProductInfo LLILZLL;
    public int LLIZ;
    public /* synthetic */ Object LLIZLLLIL;
    public final /* synthetic */ EnumC1614900s7s LLJ;
    public final /* synthetic */ SeriesVipSubscriptionViewModel LLJI;
    public final /* synthetic */ Context LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1614750s7d(EnumC1614900s7s enumC1614900s7s, SeriesVipSubscriptionViewModel seriesVipSubscriptionViewModel, Context context, InterfaceC1364105Vn<? super C1614750s7d> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJ = enumC1614900s7s;
        this.LLJI = seriesVipSubscriptionViewModel;
        this.LLJIJIL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1614750s7d c1614750s7d = new C1614750s7d(this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
        c1614750s7d.LLIZLLLIL = obj;
        return c1614750s7d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0215 A[Catch: all -> 0x03d2, TryCatch #0 {all -> 0x03d2, blocks: (B:92:0x017b, B:94:0x0187, B:97:0x0198, B:98:0x019e, B:100:0x01a4, B:102:0x01af, B:103:0x01b1, B:105:0x01b9, B:107:0x01bd, B:112:0x01d3, B:114:0x01d9, B:119:0x01e2, B:120:0x01e4, B:126:0x020f, B:128:0x0215, B:131:0x021c, B:133:0x0220, B:135:0x0226, B:137:0x0235, B:139:0x0248, B:140:0x024a, B:142:0x025a, B:148:0x0276, B:150:0x027c, B:152:0x0282, B:157:0x0291, B:159:0x0295, B:160:0x02ac, B:163:0x02bd, B:166:0x02ce, B:168:0x02dd, B:170:0x02e7, B:171:0x02e9, B:173:0x0314, B:179:0x0330, B:181:0x0336, B:183:0x033c, B:188:0x034c, B:190:0x0350, B:191:0x035c, B:194:0x036d, B:197:0x037e, B:199:0x0384, B:200:0x0387, B:202:0x0396, B:204:0x039a, B:207:0x03a1, B:125:0x020c, B:147:0x0273, B:156:0x028e, B:178:0x032d, B:187:0x0349), top: B:302:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0295 A[Catch: all -> 0x03d2, TryCatch #0 {all -> 0x03d2, blocks: (B:92:0x017b, B:94:0x0187, B:97:0x0198, B:98:0x019e, B:100:0x01a4, B:102:0x01af, B:103:0x01b1, B:105:0x01b9, B:107:0x01bd, B:112:0x01d3, B:114:0x01d9, B:119:0x01e2, B:120:0x01e4, B:126:0x020f, B:128:0x0215, B:131:0x021c, B:133:0x0220, B:135:0x0226, B:137:0x0235, B:139:0x0248, B:140:0x024a, B:142:0x025a, B:148:0x0276, B:150:0x027c, B:152:0x0282, B:157:0x0291, B:159:0x0295, B:160:0x02ac, B:163:0x02bd, B:166:0x02ce, B:168:0x02dd, B:170:0x02e7, B:171:0x02e9, B:173:0x0314, B:179:0x0330, B:181:0x0336, B:183:0x033c, B:188:0x034c, B:190:0x0350, B:191:0x035c, B:194:0x036d, B:197:0x037e, B:199:0x0384, B:200:0x0387, B:202:0x0396, B:204:0x039a, B:207:0x03a1, B:125:0x020c, B:147:0x0273, B:156:0x028e, B:178:0x032d, B:187:0x0349), top: B:302:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0350 A[Catch: all -> 0x03d2, TryCatch #0 {all -> 0x03d2, blocks: (B:92:0x017b, B:94:0x0187, B:97:0x0198, B:98:0x019e, B:100:0x01a4, B:102:0x01af, B:103:0x01b1, B:105:0x01b9, B:107:0x01bd, B:112:0x01d3, B:114:0x01d9, B:119:0x01e2, B:120:0x01e4, B:126:0x020f, B:128:0x0215, B:131:0x021c, B:133:0x0220, B:135:0x0226, B:137:0x0235, B:139:0x0248, B:140:0x024a, B:142:0x025a, B:148:0x0276, B:150:0x027c, B:152:0x0282, B:157:0x0291, B:159:0x0295, B:160:0x02ac, B:163:0x02bd, B:166:0x02ce, B:168:0x02dd, B:170:0x02e7, B:171:0x02e9, B:173:0x0314, B:179:0x0330, B:181:0x0336, B:183:0x033c, B:188:0x034c, B:190:0x0350, B:191:0x035c, B:194:0x036d, B:197:0x037e, B:199:0x0384, B:200:0x0387, B:202:0x0396, B:204:0x039a, B:207:0x03a1, B:125:0x020c, B:147:0x0273, B:156:0x028e, B:178:0x032d, B:187:0x0349), top: B:302:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0384 A[Catch: all -> 0x03d2, TryCatch #0 {all -> 0x03d2, blocks: (B:92:0x017b, B:94:0x0187, B:97:0x0198, B:98:0x019e, B:100:0x01a4, B:102:0x01af, B:103:0x01b1, B:105:0x01b9, B:107:0x01bd, B:112:0x01d3, B:114:0x01d9, B:119:0x01e2, B:120:0x01e4, B:126:0x020f, B:128:0x0215, B:131:0x021c, B:133:0x0220, B:135:0x0226, B:137:0x0235, B:139:0x0248, B:140:0x024a, B:142:0x025a, B:148:0x0276, B:150:0x027c, B:152:0x0282, B:157:0x0291, B:159:0x0295, B:160:0x02ac, B:163:0x02bd, B:166:0x02ce, B:168:0x02dd, B:170:0x02e7, B:171:0x02e9, B:173:0x0314, B:179:0x0330, B:181:0x0336, B:183:0x033c, B:188:0x034c, B:190:0x0350, B:191:0x035c, B:194:0x036d, B:197:0x037e, B:199:0x0384, B:200:0x0387, B:202:0x0396, B:204:0x039a, B:207:0x03a1, B:125:0x020c, B:147:0x0273, B:156:0x028e, B:178:0x032d, B:187:0x0349), top: B:302:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0410 A[Catch: all -> 0x058f, TryCatch #3 {all -> 0x058f, blocks: (B:15:0x005a, B:17:0x0066, B:20:0x0077, B:22:0x007b, B:27:0x0084, B:33:0x0090, B:36:0x00a1, B:38:0x00a5, B:42:0x00ac, B:43:0x00b2, B:45:0x00b8, B:47:0x00c3, B:48:0x00c5, B:50:0x00cb, B:52:0x00cf, B:54:0x00d3, B:60:0x00de, B:61:0x00e4, B:63:0x00ea, B:65:0x00f5, B:66:0x00f7, B:68:0x00ff, B:70:0x0103, B:75:0x0119, B:77:0x011f, B:82:0x0128, B:83:0x012a, B:220:0x040a, B:222:0x0410, B:225:0x0417, B:227:0x041b, B:233:0x0427, B:237:0x0433, B:239:0x043b, B:241:0x044a, B:243:0x0469, B:247:0x0484, B:250:0x0495, B:252:0x04a4, B:254:0x04b7, B:258:0x04d3, B:262:0x04e7, B:264:0x04ed, B:266:0x04f3, B:271:0x0512, B:273:0x0516, B:274:0x052c, B:277:0x053d, B:279:0x0543, B:280:0x0546, B:282:0x0553, B:284:0x0557, B:287:0x055e, B:219:0x0407, B:261:0x04e4, B:270:0x050f), top: B:302:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0516 A[Catch: all -> 0x058f, TryCatch #3 {all -> 0x058f, blocks: (B:15:0x005a, B:17:0x0066, B:20:0x0077, B:22:0x007b, B:27:0x0084, B:33:0x0090, B:36:0x00a1, B:38:0x00a5, B:42:0x00ac, B:43:0x00b2, B:45:0x00b8, B:47:0x00c3, B:48:0x00c5, B:50:0x00cb, B:52:0x00cf, B:54:0x00d3, B:60:0x00de, B:61:0x00e4, B:63:0x00ea, B:65:0x00f5, B:66:0x00f7, B:68:0x00ff, B:70:0x0103, B:75:0x0119, B:77:0x011f, B:82:0x0128, B:83:0x012a, B:220:0x040a, B:222:0x0410, B:225:0x0417, B:227:0x041b, B:233:0x0427, B:237:0x0433, B:239:0x043b, B:241:0x044a, B:243:0x0469, B:247:0x0484, B:250:0x0495, B:252:0x04a4, B:254:0x04b7, B:258:0x04d3, B:262:0x04e7, B:264:0x04ed, B:266:0x04f3, B:271:0x0512, B:273:0x0516, B:274:0x052c, B:277:0x053d, B:279:0x0543, B:280:0x0546, B:282:0x0553, B:284:0x0557, B:287:0x055e, B:219:0x0407, B:261:0x04e4, B:270:0x050f), top: B:302:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0543 A[Catch: all -> 0x058f, TryCatch #3 {all -> 0x058f, blocks: (B:15:0x005a, B:17:0x0066, B:20:0x0077, B:22:0x007b, B:27:0x0084, B:33:0x0090, B:36:0x00a1, B:38:0x00a5, B:42:0x00ac, B:43:0x00b2, B:45:0x00b8, B:47:0x00c3, B:48:0x00c5, B:50:0x00cb, B:52:0x00cf, B:54:0x00d3, B:60:0x00de, B:61:0x00e4, B:63:0x00ea, B:65:0x00f5, B:66:0x00f7, B:68:0x00ff, B:70:0x0103, B:75:0x0119, B:77:0x011f, B:82:0x0128, B:83:0x012a, B:220:0x040a, B:222:0x0410, B:225:0x0417, B:227:0x041b, B:233:0x0427, B:237:0x0433, B:239:0x043b, B:241:0x044a, B:243:0x0469, B:247:0x0484, B:250:0x0495, B:252:0x04a4, B:254:0x04b7, B:258:0x04d3, B:262:0x04e7, B:264:0x04ed, B:266:0x04f3, B:271:0x0512, B:273:0x0516, B:274:0x052c, B:277:0x053d, B:279:0x0543, B:280:0x0546, B:282:0x0553, B:284:0x0557, B:287:0x055e, B:219:0x0407, B:261:0x04e4, B:270:0x050f), top: B:302:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x055d  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 1512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1614750s7d.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
