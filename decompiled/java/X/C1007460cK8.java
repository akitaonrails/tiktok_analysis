package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.0cK8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.dmrisky.EditableTagsView$enableAddButton$1", f = "EditableTagsView.kt", l = {}, m = "invokeSuspend")
public final class C1007460cK8 extends C09AX implements InterfaceC1631620sYq<String, AbstractC1007490cKB, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;
    public /* synthetic */ AbstractC1007490cKB LLILLJJLI;

    public C1007460cK8(InterfaceC1364105Vn<? super C1007460cK8> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("EditableTagsView@4773.enableAddButton$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = (String) this.LL;
        AbstractC1007490cKB abstractC1007490cKB = this.LLILLJJLI;
        if (C123100dR.LIZ(str) && (abstractC1007490cKB instanceof C1007510cKD)) {
            z = true;
        } else {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("EditableTagsView@4773.enableAddButton$1");
        return boolValueOf;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(String str, AbstractC1007490cKB abstractC1007490cKB, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        C1007460cK8 c1007460cK8 = new C1007460cK8(interfaceC1364105Vn);
        c1007460cK8.LL = str;
        c1007460cK8.LLILLJJLI = abstractC1007490cKB;
        return c1007460cK8.invokeSuspend(Unit.LIZ);
    }
}
