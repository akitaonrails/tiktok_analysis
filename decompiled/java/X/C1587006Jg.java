package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.06Jg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1587006Jg extends C09AY implements Function0<IStreakPetService> {
    public C1587006Jg() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IStreakPetService invoke() {
        return ServiceManager.get().getService(IStreakPetService.class);
    }
}
