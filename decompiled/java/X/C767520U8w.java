package X;

import com.bytedance.android.live.effect.sticker.data.MultiGuestStickerViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0U8w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.data.MultiGuestStickerViewModel$fetchStickers$1", f = "MultiGuestStickerViewModel.kt", l = {59, 61, 66, 67, 71, 80, 81, 86, 88}, m = "invokeSuspend")
public final class C767520U8w extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public final /* synthetic */ MultiGuestStickerViewModel LLILZIL;
    public final /* synthetic */ DataChannel LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C767520U8w(MultiGuestStickerViewModel multiGuestStickerViewModel, DataChannel dataChannel, int i, InterfaceC1364105Vn<? super C767520U8w> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = multiGuestStickerViewModel;
        this.LLILZLL = dataChannel;
        this.LLIZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C767520U8w(this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0174, code lost:
    
        if (((java.lang.Boolean) r4).booleanValue() == false) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0219 A[Catch: Exception -> 0x0245, TryCatch #2 {Exception -> 0x0245, blocks: (B:99:0x0200, B:100:0x0213, B:102:0x0219, B:104:0x0225, B:107:0x022b, B:108:0x0232, B:83:0x01b4, B:97:0x01fb), top: B:158:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x022b A[Catch: Exception -> 0x0245, TryCatch #2 {Exception -> 0x0245, blocks: (B:99:0x0200, B:100:0x0213, B:102:0x0219, B:104:0x0225, B:107:0x022b, B:108:0x0232, B:83:0x01b4, B:97:0x01fb), top: B:158:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02c0 A[LOOP:2: B:127:0x02ba->B:129:0x02c0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0228 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075 A[Catch: Exception -> 0x015e, TryCatch #0 {Exception -> 0x015e, blocks: (B:7:0x002f, B:9:0x0037, B:19:0x006d, B:21:0x0075, B:27:0x0094, B:13:0x004d, B:49:0x010a, B:52:0x0116, B:54:0x011a, B:18:0x006a, B:26:0x0091, B:45:0x00f3, B:48:0x0107), top: B:158:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f A[Catch: Exception -> 0x0243, TryCatch #3 {Exception -> 0x0243, blocks: (B:29:0x0097, B:31:0x009f, B:32:0x00a6, B:76:0x0193, B:87:0x01c7, B:90:0x01d3, B:92:0x01d7, B:98:0x01fe, B:72:0x0176, B:84:0x01b7, B:37:0x00c9, B:69:0x016b, B:86:0x01c4), top: B:158:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d4 A[Catch: Exception -> 0x01ab, TryCatch #1 {Exception -> 0x01ab, blocks: (B:38:0x00cc, B:40:0x00d4, B:46:0x00f6, B:58:0x012c, B:60:0x013e, B:62:0x0147, B:70:0x016e), top: B:159:0x00cc }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011a A[Catch: Exception -> 0x015e, TryCatch #0 {Exception -> 0x015e, blocks: (B:7:0x002f, B:9:0x0037, B:19:0x006d, B:21:0x0075, B:27:0x0094, B:13:0x004d, B:49:0x010a, B:52:0x0116, B:54:0x011a, B:18:0x006a, B:26:0x0091, B:45:0x00f3, B:48:0x0107), top: B:158:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012c A[Catch: Exception -> 0x01ab, TRY_ENTER, TryCatch #1 {Exception -> 0x01ab, blocks: (B:38:0x00cc, B:40:0x00d4, B:46:0x00f6, B:58:0x012c, B:60:0x013e, B:62:0x0147, B:70:0x016e), top: B:159:0x00cc }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d7 A[Catch: Exception -> 0x0243, TryCatch #3 {Exception -> 0x0243, blocks: (B:29:0x0097, B:31:0x009f, B:32:0x00a6, B:76:0x0193, B:87:0x01c7, B:90:0x01d3, B:92:0x01d7, B:98:0x01fe, B:72:0x0176, B:84:0x01b7, B:37:0x00c9, B:69:0x016b, B:86:0x01c4), top: B:158:0x0018 }] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
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
        throw new UnsupportedOperationException("Method not decompiled: X.C767520U8w.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
