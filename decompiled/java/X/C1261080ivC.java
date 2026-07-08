package X;

import Y.ACListenerS0S0521000_19;
import android.view.View;
import com.bytedance.tux.tag.TuxTag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0ivC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1261080ivC extends C09AY implements Function2<Boolean, String, Unit> {
    public final /* synthetic */ C1261130ivH LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C1261070ivB LLILLL;
    public final /* synthetic */ Aweme LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ User LLIZ;
    public final /* synthetic */ EnumC1245890iWh LLIZLLLIL;
    public final /* synthetic */ int LLJ;
    public final /* synthetic */ C426230GnV LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1261080ivC(C1261130ivH c1261130ivH, int i, C1261070ivB c1261070ivB, Aweme aweme, boolean z, boolean z2, User user, EnumC1245890iWh enumC1245890iWh, int i2, C426230GnV c426230GnV) {
        super(2);
        this.LL = c1261130ivH;
        this.LLILLJJLI = i;
        this.LLILLL = c1261070ivB;
        this.LLILZ = aweme;
        this.LLILZIL = z;
        this.LLILZLL = z2;
        this.LLIZ = user;
        this.LLIZLLLIL = enumC1245890iWh;
        this.LLJ = i2;
        this.LLJI = c426230GnV;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, String str) {
        String str2 = str;
        if (bool.booleanValue()) {
            C1261130ivH c1261130ivH = this.LL;
            int visibility = c1261130ivH.getVisibility();
            c1261130ivH.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c1261130ivH);
            C427690Gpr.LJFF(this.LL, 0.0f);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Load success with reason on video cover with index ");
            sbLIZ.append(this.LLILLJJLI);
            sbLIZ.append(" for user with nickname ");
            sbLIZ.append(this.LLILLL.LIZ.getNickname());
            sbLIZ.append(", background as ");
            sbLIZ.append(this.LL.getBackground());
            C2188811AlT.LIZIZ(sbLIZ);
            int i2 = this.LLILLJJLI;
            C1261070ivB c1261070ivB = this.LLILLL;
            if (i2 >= c1261070ivB.LIZJ) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Show Repost Icon video cover with index ");
                sbLIZ2.append(this.LLILLJJLI);
                sbLIZ2.append(" for user with nickname ");
                sbLIZ2.append(this.LLILLL.LIZ.getNickname());
                C2188811AlT.LIZIZ(sbLIZ2);
                C786410Ut5.LLLLLLZZ(this.LL.getVideoCardRepostIconFromXml(), 0);
                C786410Ut5.Wa(this.LL, new ACListenerS0S0521000_19(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLILZ, this.LLILLL, 0));
            } else {
                C786410Ut5.Wa(this.LL, new ACListenerS0S0521000_19(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLILZ, c1261070ivB, 1));
                long createTime = this.LLILZ.getCreateTime();
                C1261070ivB c1261070ivB2 = this.LLILLL;
                int i3 = this.LLILLJJLI;
                C1261130ivH c1261130ivH2 = this.LL;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Create time: ");
                TimeUnit timeUnit = TimeUnit.SECONDS;
                sbLIZ3.append(timeUnit.toMillis(createTime));
                sbLIZ3.append(", Current time: ");
                sbLIZ3.append(System.currentTimeMillis());
                sbLIZ3.append(", Gap: ");
                TimeUnit timeUnit2 = TimeUnit.DAYS;
                sbLIZ3.append(timeUnit2.toMillis(C1073960e3O.LIZJ().newPostsThreshold));
                sbLIZ3.append(", user with nickname ");
                sbLIZ3.append(c1261070ivB2.LIZ.getNickname());
                C2188811AlT.LIZIZ(sbLIZ3);
                if (System.currentTimeMillis() - timeUnit.toMillis(createTime) <= timeUnit2.toMillis(7L)) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("Show New Post Tag video cover with index ");
                    sbLIZ4.append(i3);
                    sbLIZ4.append(" for user with nickname ");
                    sbLIZ4.append(c1261070ivB2.LIZ.getNickname());
                    C2188811AlT.LIZIZ(sbLIZ4);
                    TuxTag videoCardNewPostIconFromXml = c1261130ivH2.getVideoCardNewPostIconFromXml();
                    C426750GoL.LJIIL(videoCardNewPostIconFromXml, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))), 16);
                    C786410Ut5.LLZLLIL(videoCardNewPostIconFromXml, 0);
                }
            }
        } else {
            C786410Ut5.Wa(this.LL, new View.OnClickListener() { // from class: X.0ivA
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                }
            });
            int i4 = C2187451AjH.LIZ;
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("Load fails with reason on video cover with index ");
            sbLIZ5.append(this.LLILLJJLI);
            sbLIZ5.append(" for user with nickname ");
            sbLIZ5.append(this.LLILLL.LIZ.getNickname());
            sbLIZ5.append(" as ");
            sbLIZ5.append(str2);
            C2188811AlT.LIZIZ(sbLIZ5);
        }
        return Unit.LIZ;
    }
}
