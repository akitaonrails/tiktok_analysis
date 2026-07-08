package Y;

import X.C0VL0;
import X.C1238740iLA;
import X.C19468411Es;
import X.C19468511Et;
import X.C1C7U;
import android.text.TextUtils;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.challenge.data.LocalHashTag;
import com.ss.android.ugc.aweme.challenge.data.LocalHashTagDataBase;
import com.ss.android.ugc.aweme.challenge.model.ChallengeList;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes30.dex */
public class ACallableS154S0000000_29 implements Callable {
    public final int $t;

    public static final Object call$1(ACallableS154S0000000_29 aCallableS154S0000000_29) {
        return JediViewModel.KQ2();
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public ACallableS154S0000000_29(int i) {
        this.$t = i;
    }

    public static final Object call$0(ACallableS154S0000000_29 aCallableS154S0000000_29) {
        String str;
        C1C7U.LIZ("ChallengeRecommendModel@4d30.fetchLocalList$1L");
        ChallengeList challengeList = new ChallengeList();
        ArrayList arrayList = new ArrayList();
        if (TextUtils.equals(C1238740iLA.LIZLLL().LIZIZ("hash_tag_history_version", ""), "")) {
            C1238740iLA.LIZLLL().LJFF("hash_tag_history_version", "v2");
            if (!((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin()) {
                try {
                    LocalHashTagDataBase localHashTagDataBaseLIZIZ = C19468411Es.LIZ.LIZIZ();
                    if (localHashTagDataBaseLIZIZ != null) {
                        List<C0VL0> listLIZ = localHashTagDataBaseLIZIZ.LIZ().LIZ();
                        if (listLIZ != null && listLIZ.size() > 0) {
                            C19468511Et c19468511EtLIZJ = C19468511Et.LIZJ();
                            c19468511EtLIZJ.getClass();
                            if (listLIZ.size() > 0) {
                                for (C0VL0 c0vl0 : listLIZ) {
                                    List<LocalHashTag> list = c19468511EtLIZJ.LLILZLL;
                                    if (c0vl0 == null) {
                                        str = "";
                                    } else {
                                        str = c0vl0.LIZ;
                                    }
                                    ((ArrayList) list).add(new LocalHashTag(str, Boolean.TRUE));
                                }
                                c19468511EtLIZJ.LIZLLL();
                            }
                            for (C0VL0 c0vl02 : listLIZ) {
                                Challenge challenge = new Challenge();
                                challenge.setChallengeName(c0vl02.LIZ);
                                arrayList.add(challenge);
                            }
                        }
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        } else {
            List<LocalHashTag> list2 = C19468511Et.LIZJ().LLILZLL;
            if (list2 != null) {
                ArrayList<LocalHashTag> arrayList2 = (ArrayList) list2;
                if (arrayList2.size() > 0) {
                    for (LocalHashTag localHashTag : arrayList2) {
                        Challenge challenge2 = new Challenge();
                        challenge2.setChallengeName(localHashTag.name);
                        arrayList.add(challenge2);
                    }
                }
            }
        }
        challengeList.items = arrayList;
        C1C7U.LIZIZ("ChallengeRecommendModel@4d30.fetchLocalList$1L");
        return challengeList;
    }
}
