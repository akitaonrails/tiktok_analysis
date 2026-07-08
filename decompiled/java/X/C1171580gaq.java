package X;

import Y.ARunnableS4S1110000_18;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0gaq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class C1171580gaq extends C2217421BqW implements InterfaceC1631620sYq<String, Object, EnumC614120O6w, Unit> {
    public C1171580gaq(Object obj) {
        super(3, obj, C1171960gbS.class, "motaCacheSubscriber", "motaCacheSubscriber(Ljava/lang/String;Ljava/lang/Object;Lcom/bytedance/mota/storage/motacache/StorageOperation;)V", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(String str, Object obj, EnumC614120O6w enumC614120O6w) {
        Boolean bool;
        String str2 = str;
        C1171960gbS c1171960gbS = (C1171960gbS) this.receiver;
        c1171960gbS.getClass();
        if (obj != null && (obj instanceof Boolean) && (bool = (Boolean) obj) != null) {
            C2487409ou.LIZJ(new ARunnableS4S1110000_18(c1171960gbS, str2, bool.booleanValue(), 0));
        }
        return Unit.LIZ;
    }
}
