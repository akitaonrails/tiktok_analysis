package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.service.impl.StoryIMService;
import com.ss.android.ugc.aweme.im.service.service.IStoryIMService;
import com.ss.android.ugc.aweme.im.service.service.QuickDMEventParam;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0S1K, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S1K implements IStoryIMService {
    public static final C0S1K LIZIZ = new C0S1K();
    public final /* synthetic */ IStoryIMService LIZ;

    @Override // com.ss.android.ugc.aweme.im.service.service.IStoryIMService
    public final boolean LIZ(Aweme aweme, EnumC713160RyE enumC713160RyE, Fragment fragment) {
        return this.LIZ.LIZ(aweme, enumC713160RyE, fragment);
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IStoryIMService
    public final void LIZIZ(User user, boolean z, String str, String str2) {
        this.LIZ.LIZIZ(user, z, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IStoryIMService
    public final void LIZJ(String str, User user, Aweme aweme, String str2, String str3, String str4, Boolean bool, boolean z, Map<String, String> map, Function1<? super String, Unit> function1) {
        this.LIZ.LIZJ(str, user, aweme, str2, str3, str4, bool, z, map, function1);
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IStoryIMService
    public final void LIZLLL(C19EG c19eg, View view, FragmentManager fragmentManager, QuickDMEventParam quickDMEventParam, Aweme aweme, User user, String str, String str2, String str3, boolean z, C0I08 c0i08, Function0 function0, C19600211mK c19600211mK, String str4, Integer num, Integer num2, boolean z2, boolean z3, boolean z4, Fragment fragment, Map map) {
        this.LIZ.LIZLLL(c19eg, view, fragmentManager, quickDMEventParam, aweme, user, str, str2, str3, z, c0i08, function0, c19600211mK, str4, num, num2, z2, z3, z4, fragment, map);
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IStoryIMService
    public final void LJ(View view) {
        this.LIZ.LJ(view);
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IStoryIMService
    public final PointF LJFF() {
        return this.LIZ.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IStoryIMService
    public final C11NZ<C0S1L> LJI(Aweme aweme, EnumC713160RyE enumC713160RyE, Fragment fragment) {
        return this.LIZ.LJI(aweme, enumC713160RyE, fragment);
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IStoryIMService
    public final String LJII(Context context, boolean z) {
        return this.LIZ.LJII(context, z);
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IStoryIMService
    public final C1389880mGw LJIIIIZZ(C19EG c19eg) {
        return this.LIZ.LJIIIIZZ(c19eg);
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IStoryIMService
    public final C1389890mGx LJIIIZ(Activity activity, String str) {
        return this.LIZ.LJIIIZ(activity, str);
    }

    public C0S1K() {
        IStoryIMService iStoryIMService;
        Object objLIZ = C04TD.LIZ(IStoryIMService.class, false);
        if (objLIZ != null) {
            iStoryIMService = (IStoryIMService) objLIZ;
        } else {
            if (C04TD.g1 == null) {
                synchronized (IStoryIMService.class) {
                    if (C04TD.g1 == null) {
                        C04TD.g1 = new StoryIMService();
                    }
                }
            }
            iStoryIMService = C04TD.g1;
        }
        this.LIZ = iStoryIMService;
    }
}
