package X;

import com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoRelationAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0SDn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C717770SDn extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ VideoAuthorInfoRelationAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C717770SDn(VideoAuthorInfoRelationAssem videoAuthorInfoRelationAssem) {
        super(1);
        this.LL = videoAuthorInfoRelationAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Boolean bool2 = bool;
        if (bool2 != null) {
            bool2.booleanValue();
            if (this.LL.LJJIJL() instanceof C708910RrN) {
                ((C708910RrN) this.LL.LJJIJL()).setGroupClickable(bool2.booleanValue());
            }
        }
        return Unit.LIZ;
    }
}
