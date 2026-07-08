package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06p8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.contacts.impl.serviceimpl.IMUserRepo$updateUserBizAccountInfoForUserTags$1", f = "IMUserRepo.kt", l = {806, 841, 844}, m = "invokeSuspend")
public final class C1724406p8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public IMUserBizInfo LLILLJJLI;
    public IMUser LLILLL;
    public int LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ C1BGR LLILZLL;
    public final /* synthetic */ Map<String, List<Integer>> LLIZ;
    public final /* synthetic */ IMUser LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1724406p8(String str, C1BGR c1bgr, Map<String, ? extends List<Integer>> map, IMUser iMUser, InterfaceC1364105Vn<? super C1724406p8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = str;
        this.LLILZLL = c1bgr;
        this.LLIZ = map;
        this.LLIZLLLIL = iMUser;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1724406p8(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c6 A[Catch: Exception -> 0x01e9, TryCatch #0 {Exception -> 0x01e9, blocks: (B:7:0x001b, B:11:0x002e, B:82:0x01c1, B:84:0x01c8, B:86:0x01cd, B:87:0x01d0, B:43:0x00b5, B:45:0x00c6, B:46:0x00cb, B:47:0x00d5, B:49:0x00db, B:51:0x00ed, B:52:0x00f5, B:54:0x0107, B:56:0x010d, B:58:0x013f, B:60:0x014b, B:62:0x0151, B:64:0x015b, B:69:0x0180, B:70:0x0183, B:72:0x018f, B:74:0x0193, B:76:0x0198, B:65:0x015e, B:53:0x0101), top: B:97:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00db A[Catch: Exception -> 0x01e9, TryCatch #0 {Exception -> 0x01e9, blocks: (B:7:0x001b, B:11:0x002e, B:82:0x01c1, B:84:0x01c8, B:86:0x01cd, B:87:0x01d0, B:43:0x00b5, B:45:0x00c6, B:46:0x00cb, B:47:0x00d5, B:49:0x00db, B:51:0x00ed, B:52:0x00f5, B:54:0x0107, B:56:0x010d, B:58:0x013f, B:60:0x014b, B:62:0x0151, B:64:0x015b, B:69:0x0180, B:70:0x0183, B:72:0x018f, B:74:0x0193, B:76:0x0198, B:65:0x015e, B:53:0x0101), top: B:97:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0101 A[Catch: Exception -> 0x01e9, TryCatch #0 {Exception -> 0x01e9, blocks: (B:7:0x001b, B:11:0x002e, B:82:0x01c1, B:84:0x01c8, B:86:0x01cd, B:87:0x01d0, B:43:0x00b5, B:45:0x00c6, B:46:0x00cb, B:47:0x00d5, B:49:0x00db, B:51:0x00ed, B:52:0x00f5, B:54:0x0107, B:56:0x010d, B:58:0x013f, B:60:0x014b, B:62:0x0151, B:64:0x015b, B:69:0x0180, B:70:0x0183, B:72:0x018f, B:74:0x0193, B:76:0x0198, B:65:0x015e, B:53:0x0101), top: B:97:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010d A[Catch: Exception -> 0x01e9, TryCatch #0 {Exception -> 0x01e9, blocks: (B:7:0x001b, B:11:0x002e, B:82:0x01c1, B:84:0x01c8, B:86:0x01cd, B:87:0x01d0, B:43:0x00b5, B:45:0x00c6, B:46:0x00cb, B:47:0x00d5, B:49:0x00db, B:51:0x00ed, B:52:0x00f5, B:54:0x0107, B:56:0x010d, B:58:0x013f, B:60:0x014b, B:62:0x0151, B:64:0x015b, B:69:0x0180, B:70:0x0183, B:72:0x018f, B:74:0x0193, B:76:0x0198, B:65:0x015e, B:53:0x0101), top: B:97:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015e A[Catch: Exception -> 0x01e9, TryCatch #0 {Exception -> 0x01e9, blocks: (B:7:0x001b, B:11:0x002e, B:82:0x01c1, B:84:0x01c8, B:86:0x01cd, B:87:0x01d0, B:43:0x00b5, B:45:0x00c6, B:46:0x00cb, B:47:0x00d5, B:49:0x00db, B:51:0x00ed, B:52:0x00f5, B:54:0x0107, B:56:0x010d, B:58:0x013f, B:60:0x014b, B:62:0x0151, B:64:0x015b, B:69:0x0180, B:70:0x0183, B:72:0x018f, B:74:0x0193, B:76:0x0198, B:65:0x015e, B:53:0x0101), top: B:97:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c8 A[Catch: Exception -> 0x01e9, TryCatch #0 {Exception -> 0x01e9, blocks: (B:7:0x001b, B:11:0x002e, B:82:0x01c1, B:84:0x01c8, B:86:0x01cd, B:87:0x01d0, B:43:0x00b5, B:45:0x00c6, B:46:0x00cb, B:47:0x00d5, B:49:0x00db, B:51:0x00ed, B:52:0x00f5, B:54:0x0107, B:56:0x010d, B:58:0x013f, B:60:0x014b, B:62:0x0151, B:64:0x015b, B:69:0x0180, B:70:0x0183, B:72:0x018f, B:74:0x0193, B:76:0x0198, B:65:0x015e, B:53:0x0101), top: B:97:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01cd A[Catch: Exception -> 0x01e9, TryCatch #0 {Exception -> 0x01e9, blocks: (B:7:0x001b, B:11:0x002e, B:82:0x01c1, B:84:0x01c8, B:86:0x01cd, B:87:0x01d0, B:43:0x00b5, B:45:0x00c6, B:46:0x00cb, B:47:0x00d5, B:49:0x00db, B:51:0x00ed, B:52:0x00f5, B:54:0x0107, B:56:0x010d, B:58:0x013f, B:60:0x014b, B:62:0x0151, B:64:0x015b, B:69:0x0180, B:70:0x0183, B:72:0x018f, B:74:0x0193, B:76:0x0198, B:65:0x015e, B:53:0x0101), top: B:97:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e5  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1724406p8.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
