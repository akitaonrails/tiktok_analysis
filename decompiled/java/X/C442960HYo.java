package X;

import android.net.Uri;
import com.ss.android.ugc.profile.business.ur.ui.MusProfileEditFragment;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0HYo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C442960HYo extends C2217421BqW implements Function2<C19EG, Uri, Unit> {
    public C442960HYo(Object obj) {
        super(2, obj, MusProfileEditFragment.class, "viewPhoto", "viewPhoto(Landroidx/fragment/app/FragmentActivity;Landroid/net/Uri;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C19EG c19eg, Uri uri) {
        ((ProfileEditFragment) this.receiver).xT(c19eg, uri);
        return Unit.LIZ;
    }
}
