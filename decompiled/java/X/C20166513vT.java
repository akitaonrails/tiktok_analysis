package X;

import com.ss.android.ugc.aweme.relation.auth.model.ContactBookUploadItem;
import com.ss.android.ugc.aweme.relation.auth.model.ContactUploadResponse;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.13vT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.auth.contact.filter.ContactBookFilterByPsi$tryFilterBeforeUpload$4", f = "ContactFilterByPsi.kt", l = {265, 272, 277}, m = "invokeSuspend")
public final class C20166513vT extends C09AX implements Function1<InterfaceC1364105Vn<? super ContactUploadResponse>, Object> {
    public ContactUploadResponse LL;
    public int LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C20166313vR LLILZ;
    public final /* synthetic */ C20166613vU LLILZIL;
    public final /* synthetic */ List<ContactBookUploadItem> LLILZLL;
    public final /* synthetic */ HashSet<String> LLIZ;
    public final /* synthetic */ HashSet<String> LLIZLLLIL;
    public final /* synthetic */ Set<String> LLJ;
    public final /* synthetic */ Set<String> LLJI;
    public final /* synthetic */ Function2<List<ContactBookUploadItem>, InterfaceC1364105Vn<? super ContactUploadResponse>, Object> LLJIJIL;
    public final /* synthetic */ Set<String> LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C20166513vT(boolean z, C20166313vR c20166313vR, C20166613vU c20166613vU, List<ContactBookUploadItem> list, HashSet<String> hashSet, HashSet<String> hashSet2, Set<String> set, Set<String> set2, Function2<? super List<ContactBookUploadItem>, ? super InterfaceC1364105Vn<? super ContactUploadResponse>, ? extends Object> function2, Set<String> set3, InterfaceC1364105Vn<? super C20166513vT> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLL = z;
        this.LLILZ = c20166313vR;
        this.LLILZIL = c20166613vU;
        this.LLILZLL = list;
        this.LLIZ = hashSet;
        this.LLIZLLLIL = hashSet2;
        this.LLJ = set;
        this.LLJI = set2;
        this.LLJIJIL = function2;
        this.LLJILJIL = set3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20166513vT(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super ContactUploadResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0218  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 743
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20166513vT.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
