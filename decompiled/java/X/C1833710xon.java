package X;

import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.viewmodel.LiveHighlightViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import tikcast.api.anchor.LiveFragmentDetail;

/* JADX INFO: renamed from: X.0xon, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.viewmodel.LiveHighlightViewModel$getLiveFragmentInfos$2", f = "LiveHighlightViewModel.kt", l = {506, 527}, m = "invokeSuspend")
public final class C1833710xon extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ LiveFragmentDetail LLILZ;
    public final /* synthetic */ LiveHighlightViewModel LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ EnumC997910c4j LLIZLLLIL;
    public final /* synthetic */ Integer LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ boolean LLJIJIL;
    public final /* synthetic */ Boolean LLJILJIL;
    public final /* synthetic */ int LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1833710xon(LiveFragmentDetail liveFragmentDetail, LiveHighlightViewModel liveHighlightViewModel, String str, int i, EnumC997910c4j enumC997910c4j, Integer num, String str2, boolean z, Boolean bool, int i2, InterfaceC1364105Vn<? super C1833710xon> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = liveFragmentDetail;
        this.LLILZIL = liveHighlightViewModel;
        this.LLILZLL = str;
        this.LLIZ = i;
        this.LLIZLLLIL = enumC997910c4j;
        this.LLJ = num;
        this.LLJI = str2;
        this.LLJIJIL = z;
        this.LLJILJIL = bool;
        this.LLJILJILJ = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1833710xon c1833710xon = new C1833710xon(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, interfaceC1364105Vn);
        c1833710xon.LLILLL = obj;
        return c1833710xon;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:216:0x047a A[Catch: Exception -> 0x04b7, TryCatch #0 {Exception -> 0x04b7, blocks: (B:39:0x00c5, B:40:0x00c8, B:43:0x00fa, B:45:0x0100, B:47:0x011b, B:49:0x0121, B:51:0x012b, B:60:0x013e, B:62:0x0165, B:63:0x017a, B:65:0x0180, B:69:0x018d, B:76:0x019d, B:77:0x01a1, B:78:0x01af, B:80:0x01c8, B:61:0x0152, B:81:0x01cb, B:83:0x01cf, B:86:0x01d5, B:90:0x01e1, B:92:0x01fb, B:93:0x0224, B:95:0x022f, B:97:0x0237, B:99:0x023b, B:101:0x023f, B:102:0x0248, B:104:0x024e, B:109:0x0264, B:112:0x026b, B:113:0x026d, B:114:0x0278, B:116:0x027e, B:121:0x0294, B:122:0x0298, B:124:0x029e, B:126:0x02a4, B:127:0x02af, B:128:0x02b3, B:130:0x02b9, B:131:0x02ca, B:132:0x02ce, B:134:0x02d4, B:85:0x01d3, B:148:0x0358, B:149:0x037e, B:151:0x0384, B:152:0x0390, B:153:0x0399, B:155:0x039f, B:160:0x03b5, B:161:0x03b9, B:162:0x03c8, B:164:0x03ce, B:165:0x03de, B:170:0x03f3, B:171:0x03f7, B:173:0x03fd, B:180:0x040f, B:182:0x0413, B:184:0x0417, B:185:0x041d, B:187:0x0425, B:188:0x0429, B:190:0x042f, B:197:0x0441, B:199:0x0445, B:201:0x0449, B:202:0x044d, B:204:0x0453, B:206:0x0462, B:213:0x0471, B:215:0x0475, B:216:0x047a, B:217:0x047e, B:219:0x0484, B:226:0x0496, B:228:0x049a, B:230:0x049e, B:231:0x04a4, B:135:0x02e5, B:139:0x02f3, B:140:0x031c, B:142:0x0322, B:144:0x032c, B:145:0x0330, B:147:0x0343, B:233:0x04ab, B:25:0x007a, B:26:0x007d, B:28:0x0081, B:30:0x0089, B:31:0x008b, B:33:0x0096, B:11:0x002a, B:13:0x002e, B:15:0x003e, B:17:0x0044, B:20:0x004e, B:21:0x0071, B:35:0x00b5), top: B:238:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081 A[Catch: Exception -> 0x04b7, TryCatch #0 {Exception -> 0x04b7, blocks: (B:39:0x00c5, B:40:0x00c8, B:43:0x00fa, B:45:0x0100, B:47:0x011b, B:49:0x0121, B:51:0x012b, B:60:0x013e, B:62:0x0165, B:63:0x017a, B:65:0x0180, B:69:0x018d, B:76:0x019d, B:77:0x01a1, B:78:0x01af, B:80:0x01c8, B:61:0x0152, B:81:0x01cb, B:83:0x01cf, B:86:0x01d5, B:90:0x01e1, B:92:0x01fb, B:93:0x0224, B:95:0x022f, B:97:0x0237, B:99:0x023b, B:101:0x023f, B:102:0x0248, B:104:0x024e, B:109:0x0264, B:112:0x026b, B:113:0x026d, B:114:0x0278, B:116:0x027e, B:121:0x0294, B:122:0x0298, B:124:0x029e, B:126:0x02a4, B:127:0x02af, B:128:0x02b3, B:130:0x02b9, B:131:0x02ca, B:132:0x02ce, B:134:0x02d4, B:85:0x01d3, B:148:0x0358, B:149:0x037e, B:151:0x0384, B:152:0x0390, B:153:0x0399, B:155:0x039f, B:160:0x03b5, B:161:0x03b9, B:162:0x03c8, B:164:0x03ce, B:165:0x03de, B:170:0x03f3, B:171:0x03f7, B:173:0x03fd, B:180:0x040f, B:182:0x0413, B:184:0x0417, B:185:0x041d, B:187:0x0425, B:188:0x0429, B:190:0x042f, B:197:0x0441, B:199:0x0445, B:201:0x0449, B:202:0x044d, B:204:0x0453, B:206:0x0462, B:213:0x0471, B:215:0x0475, B:216:0x047a, B:217:0x047e, B:219:0x0484, B:226:0x0496, B:228:0x049a, B:230:0x049e, B:231:0x04a4, B:135:0x02e5, B:139:0x02f3, B:140:0x031c, B:142:0x0322, B:144:0x032c, B:145:0x0330, B:147:0x0343, B:233:0x04ab, B:25:0x007a, B:26:0x007d, B:28:0x0081, B:30:0x0089, B:31:0x008b, B:33:0x0096, B:11:0x002a, B:13:0x002e, B:15:0x003e, B:17:0x0044, B:20:0x004e, B:21:0x0071, B:35:0x00b5), top: B:238:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f7  */
    /* JADX WARN: Type inference failed for: r5v14, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [T, tikcast.api.anchor.AnchorLiveFragmentListResponse$ResponseData] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 1228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1833710xon.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
