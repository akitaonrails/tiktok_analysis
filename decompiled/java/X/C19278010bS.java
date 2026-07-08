package X;

import com.ss.android.ugc.aweme.christmas.FestivalEntity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10bS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19278010bS extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ C19278110bT LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19278010bS(C19278110bT c19278110bT) {
        super(0);
        this.LL = c19278110bT;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        FestivalEntity festivalEntity = this.LL.LIZ;
        return Boolean.valueOf(festivalEntity != null && festivalEntity.inActivity);
    }
}
