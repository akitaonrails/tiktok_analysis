package X;

import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.ContactsAndLocationVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.07h0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1928807h0 extends C2217421BqW implements Function1<C07VM, Unit> {
    public C1928807h0(Object obj) {
        super(1, obj, ContactsAndLocationVM.class, "processEvent", "processEvent(Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/group/content/cell/ContactsAndLocationCellEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C07VM c07vm) {
        C07VM c07vm2 = c07vm;
        ContactsAndLocationVM contactsAndLocationVM = (ContactsAndLocationVM) this.receiver;
        contactsAndLocationVM.getClass();
        if (c07vm2 instanceof C07VL) {
            contactsAndLocationVM.vQ2(((C07VL) c07vm2).LIZ, "settings_page");
            return Unit.LIZ;
        }
        throw new C1954807lC();
    }
}
