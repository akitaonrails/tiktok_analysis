package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.u;
import njp.a;

/* JADX INFO: renamed from: X.01ah, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.profile.platform.framework.aweme.profile.shared.UserProfileVideoLruCache$deleteFile$2", f = "UserProfileVideoLruCache.kt", l = {}, m = "invokeSuspend")
public final class C360901ah extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C360901ah(String str, InterfaceC1364105Vn<? super C360901ah> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C360901ah(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLJJIFFI;
        C1C7U.LIZ("UserProfileVideoLruCache@3dee.deleteFile$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = this.LL;
        if (str != null) {
            Boolean.valueOf(new C0VSJ(str).delete());
        }
        String str2 = this.LL;
        Boolean boolValueOf = null;
        if (str2 != null && (strLJJIFFI = u.LJJIFFI(str2, "aweme_publish", "aweme_popular", false)) != null) {
            boolValueOf = Boolean.valueOf(new C0VSJ(strLJJIFFI).delete());
        }
        C1C7U.LIZIZ("UserProfileVideoLruCache@3dee.deleteFile$2");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
