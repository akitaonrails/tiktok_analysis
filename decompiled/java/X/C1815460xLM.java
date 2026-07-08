package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.SceneryApplyViewModel;
import com.bytedance.android.livesdk.model.BoardItem;
import com.bytedance.android.livesdk.model.ImageContent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0xLM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.SceneryApplyViewModel$doneScenery$1", f = "SceneryApplyViewModel.kt", l = {149, 162, 177, 192}, m = "invokeSuspend")
public final class C1815460xLM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public BoardItem LL;
    public ImageModel LLILLJJLI;
    public ImageModel LLILLL;
    public ImageContent LLILZ;
    public int LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ SceneryApplyViewModel LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1815460xLM(SceneryApplyViewModel sceneryApplyViewModel, InterfaceC1364105Vn<? super C1815460xLM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = sceneryApplyViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1815460xLM c1815460xLM = new C1815460xLM(this.LLIZ, interfaceC1364105Vn);
        c1815460xLM.LLILZLL = obj;
        return c1815460xLM;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010e A[Catch: all -> 0x0183, TryCatch #0 {all -> 0x0183, blocks: (B:72:0x013b, B:73:0x013e, B:75:0x0146, B:76:0x0164, B:77:0x016a, B:79:0x0172, B:81:0x0178, B:82:0x017a, B:83:0x017c, B:50:0x00e2, B:51:0x00e5, B:56:0x00ef, B:58:0x00f5, B:59:0x00f7, B:63:0x00ff, B:65:0x0105, B:66:0x0107, B:68:0x010e, B:69:0x0111, B:14:0x003e, B:17:0x0053, B:19:0x005d, B:25:0x0068, B:28:0x006e, B:30:0x0072, B:32:0x0078, B:34:0x007c, B:36:0x0089, B:38:0x008d, B:40:0x0091, B:41:0x00a1, B:43:0x00a5, B:45:0x00a9, B:46:0x00b9), top: B:106:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0146 A[Catch: all -> 0x0183, TryCatch #0 {all -> 0x0183, blocks: (B:72:0x013b, B:73:0x013e, B:75:0x0146, B:76:0x0164, B:77:0x016a, B:79:0x0172, B:81:0x0178, B:82:0x017a, B:83:0x017c, B:50:0x00e2, B:51:0x00e5, B:56:0x00ef, B:58:0x00f5, B:59:0x00f7, B:63:0x00ff, B:65:0x0105, B:66:0x0107, B:68:0x010e, B:69:0x0111, B:14:0x003e, B:17:0x0053, B:19:0x005d, B:25:0x0068, B:28:0x006e, B:30:0x0072, B:32:0x0078, B:34:0x007c, B:36:0x0089, B:38:0x008d, B:40:0x0091, B:41:0x00a1, B:43:0x00a5, B:45:0x00a9, B:46:0x00b9), top: B:106:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016a A[Catch: all -> 0x0183, TryCatch #0 {all -> 0x0183, blocks: (B:72:0x013b, B:73:0x013e, B:75:0x0146, B:76:0x0164, B:77:0x016a, B:79:0x0172, B:81:0x0178, B:82:0x017a, B:83:0x017c, B:50:0x00e2, B:51:0x00e5, B:56:0x00ef, B:58:0x00f5, B:59:0x00f7, B:63:0x00ff, B:65:0x0105, B:66:0x0107, B:68:0x010e, B:69:0x0111, B:14:0x003e, B:17:0x0053, B:19:0x005d, B:25:0x0068, B:28:0x006e, B:30:0x0072, B:32:0x0078, B:34:0x007c, B:36:0x0089, B:38:0x008d, B:40:0x0091, B:41:0x00a1, B:43:0x00a5, B:45:0x00a9, B:46:0x00b9), top: B:106:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c3  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1815460xLM.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
