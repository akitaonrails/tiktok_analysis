package X;

import com.ss.android.ugc.aweme.favorites.business.aweme.ability.IAwemeCollectionStateNotifier;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.state.ability.IStateNotifier;
import kotlin.Unit;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gam, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class C1171540gam extends C2217421BqW implements InterfaceC1631620sYq<String, Object, EnumC614120O6w, Unit> {
    public C1171540gam(Object obj) {
        super(3, obj, C1171530gal.class, "motaCacheSubscriber", "motaCacheSubscriber(Ljava/lang/String;Ljava/lang/Object;Lcom/bytedance/mota/storage/motacache/StorageOperation;)V", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(String str, Object obj, EnumC614120O6w enumC614120O6w) {
        Boolean bool;
        String str2 = str;
        C1171530gal c1171530gal = (C1171530gal) this.receiver;
        c1171530gal.getClass();
        if (obj != null && (obj instanceof Boolean) && (bool = (Boolean) obj) != null) {
            boolean zBooleanValue = bool.booleanValue();
            if (enumC614120O6w == EnumC614120O6w.Mutation && zBooleanValue) {
                if (Intrinsics.LJFF(str2, c1171530gal.LL)) {
                    AwS419S0200000_18 awS419S0200000_18 = c1171530gal.LLJIJIL;
                    if (awS419S0200000_18 != null) {
                        awS419S0200000_18.invoke();
                    }
                    c1171530gal.LLJI = str2;
                }
                c1171530gal.LLJIJIL = null;
                ((IStateNotifier) ServiceManager.get().getService(IAwemeCollectionStateNotifier.class)).removeSubscriber(c1171530gal.LLIZLLLIL);
            }
        }
        return Unit.LIZ;
    }
}
