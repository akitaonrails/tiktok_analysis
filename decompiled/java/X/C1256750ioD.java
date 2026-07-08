package X;

import com.ss.android.ugc.profile.business.ur.enlarge.EnlargeAvatarOptActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ioD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class C1256750ioD extends C2217421BqW implements Function1<Integer, Unit> {
    public C1256750ioD(Object obj) {
        super(1, obj, EnlargeAvatarOptActivity.class, "updateNewAvatarSource", "updateNewAvatarSource(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        ((EnlargeAvatarOptActivity) this.receiver).LLJILJIL = Integer.valueOf(iIntValue);
        return Unit.LIZ;
    }
}
