package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommonAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinInteractionAbility;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0OR5, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OR5 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C0OS7 LL;
    public final /* synthetic */ C0OOP LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OR5(C0OS7 c0os7, C0OOP c0oop, int i, int i2, String str) {
        super(0);
        this.LL = c0os7;
        this.LLILLJJLI = c0oop;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        BulletinInteractionAbility bulletinInteractionAbility;
        String str;
        BulletinInteractionAbility bulletinInteractionAbility2 = this.LL.LIZJ;
        if ((bulletinInteractionAbility2 == null || !bulletinInteractionAbility2.v20()) && ((bulletinInteractionAbility = this.LL.LIZJ) == null || !bulletinInteractionAbility.AK2())) {
            BulletinCommonAbility bulletinCommonAbility = this.LL.LIZLLL;
            if (bulletinCommonAbility == null || bulletinCommonAbility.eb2()) {
                C11JF c11jf = this.LL.LJI;
                if (c11jf != null) {
                    c11jf.dispose();
                }
                C0OS7 c0os7 = this.LL;
                C618910OPh c618910OPh = C618910OPh.LIZ;
                Context context = c0os7.LJ.getContext();
                DialogC1389620mGW dialogC1389620mGW = (DialogC1389620mGW) this.LL.LJIILIIL.getValue();
                String strSubstring = this.LLILLJJLI.LLJILJIL.substring(this.LLILLL, this.LLILZ);
                Pair[] pairArr = new Pair[4];
                C0OLV c0olvHh2 = this.LL.LIZ.Hh2();
                if (c0olvHh2 == null || (str = c0olvHh2.LL) == null) {
                    str = "";
                }
                pairArr[0] = new Pair("channel_id", str);
                pairArr[1] = new Pair("action_type", "click");
                pairArr[2] = new Pair("is_author", this.LL.LIZIZ ? "1" : CardStruct.IStatusCode.DEFAULT);
                pairArr[3] = new Pair("message_id", String.valueOf(this.LLILLJJLI.LLJJIII));
                Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
                c618910OPh.getClass();
                c0os7.LJI = C618910OPh.LJFF(context, dialogC1389620mGW, strSubstring, mapLJIIIIZZ);
                BulletinListViewModel bulletinListViewModel = this.LL.LIZ;
                Long l = this.LLILLJJLI.LLJJIII;
                String string = l != null ? l.toString() : null;
                C0OOP c0oop = this.LLILLJJLI;
                User user = c0oop.LLJJJJLIIL;
                Boolean bool = Boolean.TRUE;
                String str2 = this.LLILZIL;
                BulletinListViewModel.OQ2(bulletinListViewModel, string, "text", c0oop, user, bool, null, Boolean.valueOf(!(str2 == null || str2.length() == 0)), null, 160);
            }
        } else {
            BulletinInteractionAbility bulletinInteractionAbility3 = this.LL.LIZJ;
            if (bulletinInteractionAbility3 != null) {
                bulletinInteractionAbility3.BM1();
            }
        }
        return Unit.LIZ;
    }
}
