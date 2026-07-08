package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18Gi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21256218Gi extends C09AY implements Function0<Keva> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21256218Gi(String str) {
        super(0);
        this.LL = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Keva invoke() {
        Keva repo = Keva.getRepo(this.LL);
        if (C18EH.LJ) {
            repo.clear();
        }
        return repo;
    }
}
