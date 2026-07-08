package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.skylight.SkylightCellLongClickAbilityImpl;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rx0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1608160rx0 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ SkylightCellLongClickAbilityImpl LL;
    public final /* synthetic */ View LLILLJJLI;
    public final /* synthetic */ User LLILLL;
    public final /* synthetic */ EnumC1605560rso LLILZ;
    public final /* synthetic */ Map<String, String> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1608160rx0(SkylightCellLongClickAbilityImpl skylightCellLongClickAbilityImpl, View view, User user, EnumC1605560rso enumC1605560rso, Map<String, String> map) {
        super(0);
        this.LL = skylightCellLongClickAbilityImpl;
        this.LLILLJJLI = view;
        this.LLILLL = user;
        this.LLILZ = enumC1605560rso;
        this.LLILZIL = map;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        SkylightCellLongClickAbilityImpl skylightCellLongClickAbilityImpl = this.LL;
        Context context = this.LLILLJJLI.getContext();
        User user = this.LLILLL;
        EnumC1605560rso enumC1605560rso = this.LLILZ;
        Map<String, String> map = this.LLILZIL;
        skylightCellLongClickAbilityImpl.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - skylightCellLongClickAbilityImpl.LL >= 300) {
            skylightCellLongClickAbilityImpl.LL = jCurrentTimeMillis;
            C1610870s1N.LIZ.getClass();
            boolean zLIZLLL = C1610870s1N.LIZLLL();
            boolean z = enumC1605560rso == EnumC1605560rso.MUTE_STORIES;
            boolean z2 = enumC1605560rso == EnumC1605560rso.MUTE_LIVES;
            C1243240iSQ.LIZ.getClass();
            String nickname = user.getNickname();
            String str = "";
            if (nickname == null) {
                nickname = "";
            }
            String string = context.getString(2131848309, C0SE9.LIZ(user, nickname));
            String string2 = context.getString(2131848313);
            String string3 = context.getString(2131848314);
            String string4 = context.getString(2131848316);
            String string5 = context.getString(zLIZLLL ? 2131848315 : 2131848312);
            String string6 = context.getString(2131848310);
            if (zLIZLLL) {
                int i = C1605570rsp.LIZ[enumC1605560rso.ordinal()];
                if (i == 1) {
                    str = "split_2_story";
                } else if (i == 2) {
                    str = "split_2_live";
                } else if (i != 3 && i != 4 && i != 5) {
                    throw new C1954807lC();
                }
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            SkylightCellLongClickAbilityImpl.LIZIZ("click", str, map);
            C1587170rP9 c1587170rP9 = C1587170rP9.LIZ;
            C1393190mMH c1393190mMHLJI = SkylightCellLongClickAbilityImpl.LJI(str, map);
            c1587170rP9.getClass();
            C1587170rP9.LJIIJ("show", c1393190mMHLJI);
            C1397580mTM c1397580mTM = new C1397580mTM(context);
            c1397580mTM.LJI(string);
            c1397580mTM.LIZIZ(string2);
            c1397580mTM.LJII = false;
            C985403tE.LIZ(c1397580mTM, new C1608180rx2(zLIZLLL, z, string3, z2, string4, string5, string6, skylightCellLongClickAbilityImpl, map, str, context, user));
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
        return Unit.LIZ;
    }
}
