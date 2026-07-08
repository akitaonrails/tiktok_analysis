package X;

import android.app.Activity;
import android.view.View;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0iRa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1242720iRa extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ HashMap<String, String> LL;
    public final /* synthetic */ C1255650imR LLILLJJLI;
    public final /* synthetic */ Activity LLILLL;
    public final /* synthetic */ View LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ User LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1242720iRa(HashMap map, C1255650imR c1255650imR, C19EG c19eg, AvatarComponentView avatarComponentView, String str, User user) {
        super(1);
        this.LL = map;
        this.LLILLJJLI = c1255650imR;
        this.LLILLL = c19eg;
        this.LLILZ = avatarComponentView;
        this.LLILZIL = str;
        this.LLILZLL = user;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        C1232140iAW c1232140iAW = C1232140iAW.LIZ;
        HashMap<String, String> map = this.LL;
        c1232140iAW.getClass();
        C1232140iAW.LJIIJ("click_view_present_profile_photo", "click_edit_profile", map);
        if (!this.LLILLJJLI.LJIIIIZZ()) {
            C1260090itb.LIZIZ.startHeaderDetailActivity(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL);
        }
        return Unit.LIZ;
    }
}
