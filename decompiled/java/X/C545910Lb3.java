package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.external.IAVDraftService;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lb3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.operate.SaveDraftByPath$resolveMedia$1", f = "SaveDraftByPath.kt", l = {121, 135, 132}, m = "invokeSuspend")
public final class C545910Lb3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ IAVDraftService.SaveDraftByPathParam LLILZLL;
    public final /* synthetic */ List<MediaModel> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C545910Lb3(IAVDraftService.SaveDraftByPathParam saveDraftByPathParam, List<? extends MediaModel> list, InterfaceC1364105Vn<? super C545910Lb3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = saveDraftByPathParam;
        this.LLIZ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C545910Lb3 c545910Lb3 = new C545910Lb3(this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c545910Lb3.LLILZIL = obj;
        return c545910Lb3;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|2|(1:137)|(1:(1:(1:(3:114|115|116)(2:8|9))(17:10|46|47|(2:51|(1:53))|54|(4:56|(1:63)(1:62)|(1:65)|(5:67|(4:69|(3:75|(1:77)(1:78)|(1:80))|81|(1:83))|84|(1:86)|87))|88|(1:97)(1:96)|(1:99)|100|(1:104)|105|(1:109)|110|(2:112|113)|115|116))(2:11|35))(6:12|13|(2:15|17)(1:16)|(4:131|19|(1:21)(1:22)|130)(1:25)|26|(5:28|29|(3:117|135|118)(12:38|(1:40)(1:41)|42|(2:44|45)|47|(3:49|51|(0))|54|(0)|88|(9:90|97|(0)|100|(2:102|104)|105|(2:107|109)|110|(0))(0)|115|116)|128|129)(2:32|(3:34|121|122)))|36|29|(1:31)|117|135|118|128|129|(1:(1:134))) */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0307, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0308, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2);
        X.C189200o6.m2constructorimpl(new X.C098200Yq(r2));
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0202 A[Catch: Exception -> 0x0318, TryCatch #3 {Exception -> 0x0318, blocks: (B:114:0x02ea, B:115:0x02ed, B:46:0x01ce, B:47:0x01d1, B:49:0x01da, B:51:0x01de, B:53:0x0202, B:54:0x020a, B:56:0x020e, B:58:0x0216, B:60:0x021a, B:65:0x0223, B:67:0x0229, B:69:0x022d, B:71:0x0232, B:73:0x023a, B:75:0x0242, B:80:0x024d, B:81:0x0251, B:83:0x0266, B:84:0x0269, B:86:0x0275, B:87:0x0277, B:88:0x0281, B:90:0x0285, B:92:0x0289, B:94:0x028d, B:99:0x0297, B:100:0x029f, B:102:0x02a5, B:104:0x02a9, B:105:0x02bc, B:107:0x02c0, B:109:0x02c4, B:110:0x02c8, B:35:0x0168, B:36:0x016b, B:29:0x011e, B:38:0x0170, B:42:0x018e, B:117:0x02f3, B:120:0x0308, B:13:0x004b, B:26:0x00f8, B:28:0x010b, B:32:0x0143, B:25:0x00e4, B:24:0x00b0, B:19:0x005f, B:21:0x0095, B:22:0x009a, B:118:0x02f5), top: B:137:0x0014, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x020e A[Catch: Exception -> 0x0318, TryCatch #3 {Exception -> 0x0318, blocks: (B:114:0x02ea, B:115:0x02ed, B:46:0x01ce, B:47:0x01d1, B:49:0x01da, B:51:0x01de, B:53:0x0202, B:54:0x020a, B:56:0x020e, B:58:0x0216, B:60:0x021a, B:65:0x0223, B:67:0x0229, B:69:0x022d, B:71:0x0232, B:73:0x023a, B:75:0x0242, B:80:0x024d, B:81:0x0251, B:83:0x0266, B:84:0x0269, B:86:0x0275, B:87:0x0277, B:88:0x0281, B:90:0x0285, B:92:0x0289, B:94:0x028d, B:99:0x0297, B:100:0x029f, B:102:0x02a5, B:104:0x02a9, B:105:0x02bc, B:107:0x02c0, B:109:0x02c4, B:110:0x02c8, B:35:0x0168, B:36:0x016b, B:29:0x011e, B:38:0x0170, B:42:0x018e, B:117:0x02f3, B:120:0x0308, B:13:0x004b, B:26:0x00f8, B:28:0x010b, B:32:0x0143, B:25:0x00e4, B:24:0x00b0, B:19:0x005f, B:21:0x0095, B:22:0x009a, B:118:0x02f5), top: B:137:0x0014, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0297 A[Catch: Exception -> 0x0318, TryCatch #3 {Exception -> 0x0318, blocks: (B:114:0x02ea, B:115:0x02ed, B:46:0x01ce, B:47:0x01d1, B:49:0x01da, B:51:0x01de, B:53:0x0202, B:54:0x020a, B:56:0x020e, B:58:0x0216, B:60:0x021a, B:65:0x0223, B:67:0x0229, B:69:0x022d, B:71:0x0232, B:73:0x023a, B:75:0x0242, B:80:0x024d, B:81:0x0251, B:83:0x0266, B:84:0x0269, B:86:0x0275, B:87:0x0277, B:88:0x0281, B:90:0x0285, B:92:0x0289, B:94:0x028d, B:99:0x0297, B:100:0x029f, B:102:0x02a5, B:104:0x02a9, B:105:0x02bc, B:107:0x02c0, B:109:0x02c4, B:110:0x02c8, B:35:0x0168, B:36:0x016b, B:29:0x011e, B:38:0x0170, B:42:0x018e, B:117:0x02f3, B:120:0x0308, B:13:0x004b, B:26:0x00f8, B:28:0x010b, B:32:0x0143, B:25:0x00e4, B:24:0x00b0, B:19:0x005f, B:21:0x0095, B:22:0x009a, B:118:0x02f5), top: B:137:0x0014, inners: #0, #2 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 855
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C545910Lb3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
