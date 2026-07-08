package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.inbox.bulletin.setting.BulletinEventGamePlayConfiguration;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinKeyValueStruct;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.0OSP, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OSP {
    public static final C0OSP LIZ = new C0OSP();
    public static final BulletinEventGamePlayConfiguration LIZIZ = new BulletinEventGamePlayConfiguration(0, 0, 0);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(509));

    public static final boolean LIZ() {
        LIZ.getClass();
        Integer num = ((BulletinEventGamePlayConfiguration) LIZJ.getValue()).enableBaseInteraction;
        return num != null && num.intValue() == 1;
    }

    public static final boolean LIZIZ() {
        LIZ.getClass();
        Integer num = ((BulletinEventGamePlayConfiguration) LIZJ.getValue()).enableCreatorInteraction;
        return num != null && num.intValue() == 1;
    }

    public static final List<BulletinKeyValueStruct> LIZJ() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BulletinKeyValueStruct("enable_base_interaction", LIZ() ? "1" : CardStruct.IStatusCode.DEFAULT));
        arrayList.add(new BulletinKeyValueStruct("enable_creator_interaction", LIZIZ() ? "1" : CardStruct.IStatusCode.DEFAULT));
        LIZ.getClass();
        Integer num = ((BulletinEventGamePlayConfiguration) LIZJ.getValue()).enablePostGuidanceOpt;
        arrayList.add(new BulletinKeyValueStruct("enable_activity_post_guidance_opt", (num == null || num.intValue() != 1) ? CardStruct.IStatusCode.DEFAULT : "1"));
        return arrayList;
    }
}
