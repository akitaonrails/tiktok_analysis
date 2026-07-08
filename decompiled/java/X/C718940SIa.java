package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0SIa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C718940SIa extends C1696260uF6 implements Function2<Aweme, C0S5S, Unit> {
    public C718940SIa(Object obj) {
        super(2, obj, C718770SHj.class, "updateTitleWhenNeeded", "updateTitleWhenNeeded(Lcom/ss/android/ugc/aweme/feed/model/Aweme;Lcom/ss/android/ugc/aweme/translation/state/PhotoTitleData;Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Aweme aweme, C0S5S c0s5s) {
        ((C718770SHj) this.receiver).LJZI(aweme, c0s5s, false);
        return Unit.LIZ;
    }
}
