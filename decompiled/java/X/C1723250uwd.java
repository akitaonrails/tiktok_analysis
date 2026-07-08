package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.pipo.auth.PipoAuthViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uwd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.auth.PipoAuthViewModel$pipoAuth$2", f = "PipoAuthViewModel.kt", l = {BaseNotice.RECOMMEND_LIVE}, m = "invokeSuspend")
public final class C1723250uwd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PipoAuthViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1723250uwd(PipoAuthViewModel pipoAuthViewModel, InterfaceC1364105Vn<? super C1723250uwd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pipoAuthViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1723250uwd(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0199 A[Catch: all -> 0x01b4, TRY_LEAVE, TryCatch #0 {all -> 0x01b4, blocks: (B:76:0x0128, B:77:0x012b, B:80:0x0131, B:82:0x0137, B:83:0x013b, B:85:0x0141, B:87:0x0152, B:89:0x0156, B:92:0x015d, B:97:0x0167, B:99:0x0171, B:100:0x017e, B:101:0x0199, B:9:0x0023, B:11:0x002b, B:14:0x0031, B:20:0x003d, B:22:0x005c, B:24:0x0064, B:27:0x006a, B:33:0x0076, B:35:0x0095, B:38:0x00a1, B:41:0x00a6, B:43:0x00c7, B:45:0x00cf, B:48:0x00d4, B:50:0x00de, B:53:0x00e3, B:55:0x00eb, B:58:0x00f0, B:60:0x00f8, B:63:0x00fd, B:65:0x0105, B:68:0x010a, B:70:0x0112, B:71:0x0114), top: B:106:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0159 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0141 A[Catch: all -> 0x01b4, TryCatch #0 {all -> 0x01b4, blocks: (B:76:0x0128, B:77:0x012b, B:80:0x0131, B:82:0x0137, B:83:0x013b, B:85:0x0141, B:87:0x0152, B:89:0x0156, B:92:0x015d, B:97:0x0167, B:99:0x0171, B:100:0x017e, B:101:0x0199, B:9:0x0023, B:11:0x002b, B:14:0x0031, B:20:0x003d, B:22:0x005c, B:24:0x0064, B:27:0x006a, B:33:0x0076, B:35:0x0095, B:38:0x00a1, B:41:0x00a6, B:43:0x00c7, B:45:0x00cf, B:48:0x00d4, B:50:0x00de, B:53:0x00e3, B:55:0x00eb, B:58:0x00f0, B:60:0x00f8, B:63:0x00fd, B:65:0x0105, B:68:0x010a, B:70:0x0112, B:71:0x0114), top: B:106:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0156 A[Catch: all -> 0x01b4, TryCatch #0 {all -> 0x01b4, blocks: (B:76:0x0128, B:77:0x012b, B:80:0x0131, B:82:0x0137, B:83:0x013b, B:85:0x0141, B:87:0x0152, B:89:0x0156, B:92:0x015d, B:97:0x0167, B:99:0x0171, B:100:0x017e, B:101:0x0199, B:9:0x0023, B:11:0x002b, B:14:0x0031, B:20:0x003d, B:22:0x005c, B:24:0x0064, B:27:0x006a, B:33:0x0076, B:35:0x0095, B:38:0x00a1, B:41:0x00a6, B:43:0x00c7, B:45:0x00cf, B:48:0x00d4, B:50:0x00de, B:53:0x00e3, B:55:0x00eb, B:58:0x00f0, B:60:0x00f8, B:63:0x00fd, B:65:0x0105, B:68:0x010a, B:70:0x0112, B:71:0x0114), top: B:106:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0167 A[Catch: all -> 0x01b4, TryCatch #0 {all -> 0x01b4, blocks: (B:76:0x0128, B:77:0x012b, B:80:0x0131, B:82:0x0137, B:83:0x013b, B:85:0x0141, B:87:0x0152, B:89:0x0156, B:92:0x015d, B:97:0x0167, B:99:0x0171, B:100:0x017e, B:101:0x0199, B:9:0x0023, B:11:0x002b, B:14:0x0031, B:20:0x003d, B:22:0x005c, B:24:0x0064, B:27:0x006a, B:33:0x0076, B:35:0x0095, B:38:0x00a1, B:41:0x00a6, B:43:0x00c7, B:45:0x00cf, B:48:0x00d4, B:50:0x00de, B:53:0x00e3, B:55:0x00eb, B:58:0x00f0, B:60:0x00f8, B:63:0x00fd, B:65:0x0105, B:68:0x010a, B:70:0x0112, B:71:0x0114), top: B:106:0x0012 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1723250uwd.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
