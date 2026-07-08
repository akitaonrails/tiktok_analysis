package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.profile.business.ur.following.ui.viewmodel.FollowerListViewModel;
import com.ss.android.ugc.profile.business.ur.following.ui.viewmodel.states.FollowerRelationState;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0j1b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1265050j1b extends C09AY implements Function1<FollowerRelationState, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ InterfaceC1265060j1c LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1265050j1b(String str, FollowerListViewModel followerListViewModel, int i, String str2, int i2) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = followerListViewModel;
        this.LLILLL = i;
        this.LLILZ = str2;
        this.LLILZIL = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FollowerRelationState followerRelationState) {
        boolean z = Keva.getRepo(C786410Ut5.j4("repo_maf_follow_back_notice_%s", Arrays.copyOf(new Object[]{followerRelationState.getUserId()}, 1))).getBoolean(C786410Ut5.j4("key_highlight_user_nid_%s", Arrays.copyOf(new Object[]{this.LL}, 1)), false);
        this.LLILLJJLI.kV1().clear();
        if (this.LLILLL <= 1000 && C0BMR.LIZ()) {
            if (!z) {
                this.LLILLJJLI.Ig1(this.LLILZIL, this.LLILZ);
            }
        } else {
            this.LLILLJJLI.Ss0(null);
        }
        return Unit.LIZ;
    }
}
