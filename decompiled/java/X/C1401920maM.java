package X;

import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AwS230S0300000_21;

/* JADX INFO: renamed from: X.0maM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1401920maM implements CompoundButton.OnCheckedChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.$t) {
            case 0:
                onCheckedChanged$0(this, compoundButton, z);
                break;
            case 1:
                onCheckedChanged$1(this, compoundButton, z);
                break;
        }
    }

    public static final void onCheckedChanged$0(C1401920maM c1401920maM, CompoundButton compoundButton, boolean z) {
        C1587170rP9 c1587170rP9 = C1587170rP9.LIZ;
        C1393110mM9 c1393110mM9 = new C1393110mM9(((User) c1401920maM.l0).isMuted(), "relation_tab", "profile_click", "", ((User) c1401920maM.l0).getFollowStatus(), "click", null, 448);
        c1587170rP9.getClass();
        C1587170rP9.LJIIIZ(c1393110mM9);
        if (z) {
            C1589640rT8 c1589640rT8 = C1589640rT8.LIZIZ;
            User user = (User) c1401920maM.l0;
            Fragment fragmentLIZ = C946803n0.LIZ(((C1393030mM1) c1401920maM.l1).LIZIZ);
            C19EG c19eg = (C19EG) c1401920maM.l2;
            EnumC1393020mM0 enumC1393020mM0 = EnumC1393020mM0.FRIENDS_LIST;
            c1589640rT8.M2(c19eg, null, fragmentLIZ, new C1393190mMH(((User) c1401920maM.l0).getFollowStatus(), "relation_tab", "profile_click", "", null, 112), enumC1393020mM0, EnumC1392960mLu.ALL, user, new AwS230S0300000_21((C1393030mM1) c1401920maM.l1, (User) c1401920maM.l0, (C127A) c1401920maM.l3, 27));
            return;
        }
        C1589640rT8.LIZIZ.K2((User) c1401920maM.l0, C946803n0.LIZ(((C1393030mM1) c1401920maM.l1).LIZIZ), (C19EG) c1401920maM.l2, EnumC1393020mM0.FRIENDS_LIST, EnumC1392960mLu.ALL, null, new AwS230S0300000_21((C1393030mM1) c1401920maM.l1, (User) c1401920maM.l0, (C127A) c1401920maM.l3, 28));
    }

    public static final void onCheckedChanged$1(C1401920maM c1401920maM, CompoundButton compoundButton, boolean z) {
        String str;
        String str2;
        ((InterfaceC1631620sYq) c1401920maM.l0).invoke((C127A) c1401920maM.l1, (EnumC1392960mLu) c1401920maM.l2, Boolean.valueOf(z));
        C1393110mM9 c1393110mM9 = (C1393110mM9) c1401920maM.l3;
        EnumC1392960mLu enumC1392960mLu = (EnumC1392960mLu) c1401920maM.l2;
        boolean z2 = !z;
        int i = C1393130mMB.LIZ[enumC1392960mLu.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        str = "click";
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    str = "click_mute_lives";
                }
            } else {
                str = "click_mute_posts";
            }
        } else {
            str = "click_mute_stories";
        }
        C1610870s1N.LIZ.getClass();
        if (C1610870s1N.LIZLLL()) {
            str2 = "split_3";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        C1587170rP9 c1587170rP9 = C1587170rP9.LIZ;
        C1393110mM9 c1393110mM9LIZ = C1393110mM9.LIZ(c1393110mM9, z2, str, str2, 222);
        c1587170rP9.getClass();
        C1587170rP9.LJIIIZ(c1393110mM9LIZ);
    }

    public C1401920maM(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
