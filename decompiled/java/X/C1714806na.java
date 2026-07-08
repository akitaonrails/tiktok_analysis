package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.06na, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1714806na extends C2217421BqW implements InterfaceC1685420txc<String, String, Boolean, String, InterfaceC1480505qt, Unit> {
    public C1714806na(InterfaceC1710106mp interfaceC1710106mp) {
        super(5, interfaceC1710106mp, InterfaceC1710106mp.class, "getUser", "getUser(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/ss/android/ugc/aweme/im/contacts/api/model/IQueryIMUserCallback;)V", 0);
    }

    @Override // X.InterfaceC1685420txc
    public final Unit invoke(String str, String str2, Boolean bool, String str3, InterfaceC1480505qt interfaceC1480505qt) {
        boolean zBooleanValue = bool.booleanValue();
        InterfaceC1710106mp interfaceC1710106mp = (InterfaceC1710106mp) this.receiver;
        interfaceC1710106mp.LIZJ(interfaceC1480505qt, str, str2, str3, zBooleanValue);
        return Unit.LIZ;
    }
}
