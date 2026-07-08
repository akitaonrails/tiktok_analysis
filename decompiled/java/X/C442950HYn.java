package X;

import com.ss.android.ugc.profile.business.ur.ui.MusProfileEditFragment;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0HYn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C442950HYn extends C2217421BqW implements Function2<Integer, C19EG, Unit> {
    public C442950HYn(Object obj) {
        super(2, obj, MusProfileEditFragment.class, "actionsAfterTakePhoto", "actionsAfterTakePhoto(ILandroidx/fragment/app/FragmentActivity;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, C19EG c19eg) {
        ((ProfileEditFragment) this.receiver).MR(num.intValue(), c19eg);
        return Unit.LIZ;
    }
}
