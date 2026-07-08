package X;

import com.ss.android.ugc.profile.business.ur.ui.MusProfileEditFragment;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0HYp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C442970HYp extends C2217421BqW implements Function1<Integer, Unit> {
    public C442970HYp(Object obj) {
        super(1, obj, MusProfileEditFragment.class, "actionsAfterUploadPhoto", "actionsAfterUploadPhoto(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        ((ProfileEditFragment) this.receiver).NR(num.intValue());
        return Unit.LIZ;
    }
}
