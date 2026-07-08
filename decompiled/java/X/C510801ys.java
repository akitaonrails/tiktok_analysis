package X;

import com.bytedance.android.live.effect.beauty.data.LiveSmallItemBeautyViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01ys, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.beauty.data.LiveSmallItemBeautyViewModel$fetchData$1", f = "LiveSmallItemBeautyViewModel.kt", l = {483, 485, 491, 496, 497, 499, 500, 504, 505, 508, 511, 512, 516, 517, 519, 520, 524}, m = "invokeSuspend")
public final class C510801ys extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public final /* synthetic */ LiveSmallItemBeautyViewModel LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C510801ys(LiveSmallItemBeautyViewModel liveSmallItemBeautyViewModel, InterfaceC1364105Vn<? super C510801ys> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = liveSmallItemBeautyViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C510801ys(this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d A[Catch: Exception -> 0x0281, TryCatch #0 {Exception -> 0x0281, blocks: (B:18:0x005c, B:20:0x006d, B:37:0x00d9, B:39:0x00e4, B:60:0x014d, B:71:0x0185, B:73:0x018b, B:75:0x0191, B:79:0x01a7, B:81:0x01af, B:98:0x022d, B:85:0x01d5, B:87:0x01dd, B:104:0x0247, B:91:0x0203, B:110:0x0263, B:63:0x0157, B:70:0x0180, B:25:0x0086, B:27:0x008e, B:45:0x0101, B:56:0x013c, B:31:0x00af, B:51:0x011c, B:36:0x00d6, B:44:0x00fe, B:50:0x0119, B:55:0x0139, B:59:0x014a, B:69:0x017d, B:95:0x0224, B:97:0x022a, B:103:0x0244, B:109:0x0260), top: B:122:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086 A[Catch: Exception -> 0x0281, TRY_ENTER, TryCatch #0 {Exception -> 0x0281, blocks: (B:18:0x005c, B:20:0x006d, B:37:0x00d9, B:39:0x00e4, B:60:0x014d, B:71:0x0185, B:73:0x018b, B:75:0x0191, B:79:0x01a7, B:81:0x01af, B:98:0x022d, B:85:0x01d5, B:87:0x01dd, B:104:0x0247, B:91:0x0203, B:110:0x0263, B:63:0x0157, B:70:0x0180, B:25:0x0086, B:27:0x008e, B:45:0x0101, B:56:0x013c, B:31:0x00af, B:51:0x011c, B:36:0x00d6, B:44:0x00fe, B:50:0x0119, B:55:0x0139, B:59:0x014a, B:69:0x017d, B:95:0x0224, B:97:0x022a, B:103:0x0244, B:109:0x0260), top: B:122:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e4 A[Catch: Exception -> 0x0281, TryCatch #0 {Exception -> 0x0281, blocks: (B:18:0x005c, B:20:0x006d, B:37:0x00d9, B:39:0x00e4, B:60:0x014d, B:71:0x0185, B:73:0x018b, B:75:0x0191, B:79:0x01a7, B:81:0x01af, B:98:0x022d, B:85:0x01d5, B:87:0x01dd, B:104:0x0247, B:91:0x0203, B:110:0x0263, B:63:0x0157, B:70:0x0180, B:25:0x0086, B:27:0x008e, B:45:0x0101, B:56:0x013c, B:31:0x00af, B:51:0x011c, B:36:0x00d6, B:44:0x00fe, B:50:0x0119, B:55:0x0139, B:59:0x014a, B:69:0x017d, B:95:0x0224, B:97:0x022a, B:103:0x0244, B:109:0x0260), top: B:122:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018b A[Catch: Exception -> 0x0281, TryCatch #0 {Exception -> 0x0281, blocks: (B:18:0x005c, B:20:0x006d, B:37:0x00d9, B:39:0x00e4, B:60:0x014d, B:71:0x0185, B:73:0x018b, B:75:0x0191, B:79:0x01a7, B:81:0x01af, B:98:0x022d, B:85:0x01d5, B:87:0x01dd, B:104:0x0247, B:91:0x0203, B:110:0x0263, B:63:0x0157, B:70:0x0180, B:25:0x0086, B:27:0x008e, B:45:0x0101, B:56:0x013c, B:31:0x00af, B:51:0x011c, B:36:0x00d6, B:44:0x00fe, B:50:0x0119, B:55:0x0139, B:59:0x014a, B:69:0x017d, B:95:0x0224, B:97:0x022a, B:103:0x0244, B:109:0x0260), top: B:122:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01af A[Catch: Exception -> 0x0281, TryCatch #0 {Exception -> 0x0281, blocks: (B:18:0x005c, B:20:0x006d, B:37:0x00d9, B:39:0x00e4, B:60:0x014d, B:71:0x0185, B:73:0x018b, B:75:0x0191, B:79:0x01a7, B:81:0x01af, B:98:0x022d, B:85:0x01d5, B:87:0x01dd, B:104:0x0247, B:91:0x0203, B:110:0x0263, B:63:0x0157, B:70:0x0180, B:25:0x0086, B:27:0x008e, B:45:0x0101, B:56:0x013c, B:31:0x00af, B:51:0x011c, B:36:0x00d6, B:44:0x00fe, B:50:0x0119, B:55:0x0139, B:59:0x014a, B:69:0x017d, B:95:0x0224, B:97:0x022a, B:103:0x0244, B:109:0x0260), top: B:122:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d5 A[Catch: Exception -> 0x0281, TRY_ENTER, TryCatch #0 {Exception -> 0x0281, blocks: (B:18:0x005c, B:20:0x006d, B:37:0x00d9, B:39:0x00e4, B:60:0x014d, B:71:0x0185, B:73:0x018b, B:75:0x0191, B:79:0x01a7, B:81:0x01af, B:98:0x022d, B:85:0x01d5, B:87:0x01dd, B:104:0x0247, B:91:0x0203, B:110:0x0263, B:63:0x0157, B:70:0x0180, B:25:0x0086, B:27:0x008e, B:45:0x0101, B:56:0x013c, B:31:0x00af, B:51:0x011c, B:36:0x00d6, B:44:0x00fe, B:50:0x0119, B:55:0x0139, B:59:0x014a, B:69:0x017d, B:95:0x0224, B:97:0x022a, B:103:0x0244, B:109:0x0260), top: B:122:0x000f }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C510801ys.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
