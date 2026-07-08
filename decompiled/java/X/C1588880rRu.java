package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: renamed from: X.0rRu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1588880rRu implements IEvent {
    public final boolean LIZ;
    public final Set<? extends EnumC1588660rRY> LIZIZ;
    public final String LIZJ;

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C1440005kM.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C1440005kM.LIZIZ(this);
        return this;
    }

    public C1588880rRu(String str, boolean z) {
        this(str, Collections.singleton(EnumC1588660rRY.FOR_YOU), z);
    }

    public C1588880rRu(String str, Set set, boolean z) {
        this.LIZ = z;
        this.LIZIZ = set;
        this.LIZJ = str;
    }
}
