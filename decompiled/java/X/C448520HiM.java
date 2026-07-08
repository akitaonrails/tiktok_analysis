package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.aigroupshot.AIGroupShotRecallVM;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.message.template.card.AIGroupShotCardTemplate;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS15S0410000_6;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: renamed from: X.0HiM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C448520HiM extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ C19EG LL;
    public final /* synthetic */ Fragment LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C0ZQI LLILZ;
    public final /* synthetic */ C869590Y9l LLILZIL;
    public final /* synthetic */ AIGroupShotCardTemplate LLILZLL;
    public final /* synthetic */ SessionInfo LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C448520HiM(C19EG c19eg, Fragment fragment, boolean z, C0ZQI c0zqi, C869590Y9l c869590Y9l, AIGroupShotCardTemplate aIGroupShotCardTemplate, SessionInfo sessionInfo) {
        super(1);
        this.LL = c19eg;
        this.LLILLJJLI = fragment;
        this.LLILLL = z;
        this.LLILZ = c0zqi;
        this.LLILZIL = c869590Y9l;
        this.LLILZLL = aIGroupShotCardTemplate;
        this.LLIZ = sessionInfo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        Fragment fragment;
        String string;
        if (this.LL != null && (fragment = this.LLILLJJLI) != null) {
            C736950SvV c736950SvV = new C736950SvV(C13LE.LIZ(AIGroupShotRecallVM.class), null, new C452070Ho5(), C724750Sbp.LJII(fragment), C1220000hqw.LIZ(fragment), AFwS236S0000000_6.get$arr$(476), new C451460Hn6(fragment, false), new C451620HnM(fragment, true), new C338520DOw(fragment));
            if (this.LLILLL) {
                string = this.LLILLJJLI.getString(2131831144);
            } else {
                string = this.LLILLJJLI.getString(2131830910);
            }
            C19EG c19eg = this.LL;
            AwS15S0410000_6 awS15S0410000_6 = new AwS15S0410000_6(this.LLILLL, (boolean) this.LLILZIL, (C869590Y9l) this.LLILZLL, (AIGroupShotCardTemplate) this.LLIZ, (SessionInfo) c736950SvV, (C736950SvV<C448500HiK, AIGroupShotRecallVM>) 0);
            C1247510iZJ c1247510iZJ = new C1247510iZJ();
            c1247510iZJ.LIZJ = 1;
            c1247510iZJ.LIZ(new AwS585S0100000_6(awS15S0410000_6, 350));
            c1247510iZJ.LIZ = string;
            C1390850mIV c1390850mIV = new C1390850mIV();
            c1390850mIV.LIZIZ(c1247510iZJ);
            c1390850mIV.LIZJ().show(c19eg.getSupportFragmentManager(), "");
            this.LLILZ.LJ(C0ZL0.REMOVE_AI_GROUP_SHOT, null);
        }
        return Unit.LIZ;
    }
}
