package X;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.SharedViewModelProvider;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.IDetailPageShareVMService;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.story.preload.v2.IStoryPreloaderV2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS62S1000000_11;

/* JADX INFO: renamed from: X.0SgJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C727530SgJ {
    public static final Map<String, Function1<Intent, String>> LIZ;

    static {
        AFwS243S0000000_11 aFwS243S0000000_11 = AFwS243S0000000_11.get$arr$(624);
        AFwS243S0000000_11 aFwS243S0000000_112 = AFwS243S0000000_11.get$arr$(627);
        AFwS243S0000000_11 aFwS243S0000000_113 = AFwS243S0000000_11.get$arr$(626);
        AFwS243S0000000_11 aFwS243S0000000_114 = AFwS243S0000000_11.get$arr$(625);
        LIZ = C2097608Jq.LJIIIIZZ(new Pair("STORY_ENTRANCE_DEFAULT", aFwS243S0000000_11), new Pair("STORY_ENTRANCE_WIDGET", aFwS243S0000000_112), new Pair("STORY_ENTRANCE_MINE", aFwS243S0000000_113), new Pair("STORY_ENTRANCE_OTHER", aFwS243S0000000_113), new Pair("STORY_ENTRANCE_AVATAR", aFwS243S0000000_113), new Pair("STORY_ENTRANCE_ARCHIVE", new AwS62S1000000_11("STORY_ENTRANCE_ARCHIVE", 6)), new Pair("STORY_ENTRANCE_INBOX_TOP_LIST", new AwS62S1000000_11("STORY_ENTRANCE_INBOX_TOP_LIST", 6)), new Pair("STORY_ENTRANCE_FOLLOWING_FEED_TOP_LIST_NEW", new AwS62S1000000_11("STORY_ENTRANCE_FOLLOWING_FEED_TOP_LIST_NEW", 6)), new Pair("STORY_ENTRANCE_FRIENDS_TOP_LIST", new AwS62S1000000_11("STORY_ENTRANCE_FRIENDS_TOP_LIST", 6)), new Pair("STORY_ENTRANCE_FYP_TOP_LIST", new AwS62S1000000_11("STORY_ENTRANCE_FYP_TOP_LIST", 6)), new Pair("from_profile_self", aFwS243S0000000_114), new Pair("from_profile_other", aFwS243S0000000_114));
    }

    public static final List<Aweme> LIZ(List<? extends Aweme> list) {
        List<Aweme> stories;
        ArrayList arrayList = new ArrayList();
        Iterator<? extends Aweme> it2 = list.iterator();
        while (it2.hasNext()) {
            UserStory userStory = it2.next().getUserStory();
            if (userStory != null && (stories = userStory.getStories()) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Aweme aweme : stories) {
                    if (!AwemeBizExtKt.isStoryFakeAweme(aweme)) {
                        arrayList2.add(aweme);
                    }
                }
                arrayList.addAll(arrayList2);
            }
        }
        return arrayList;
    }

    public static final void LIZJ(Aweme aweme) {
        List<Aweme> stories;
        Aweme aweme2;
        List<Aweme> stories2;
        Object objLJJJLL;
        if (((Boolean) C0AW8.LIZ.getValue()).booleanValue()) {
            C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
            c13dvLIZIZ.add(aweme);
            UserStory userStory = aweme.getUserStory();
            if (userStory != null && (stories2 = userStory.getStories()) != null && (objLJJJLL = C13LP.LJJJLL(stories2)) != null) {
                c13dvLIZIZ.add(objLJJJLL);
            }
            List<? extends Aweme> listLIZ = C1697820uHc.LIZ(c13dvLIZIZ);
            IStoryPreloaderV2 iStoryPreloaderV2LJJLI = C1618440sDa.LIZIZ.LJJLI();
            if (iStoryPreloaderV2LJJLI != null) {
                iStoryPreloaderV2LJJLI.LIZ(listLIZ, null, AFwS232S0000000_4.get$arr$(189));
                return;
            }
            return;
        }
        C1483340ohg.LJIL(0, aweme);
        UserStory userStory2 = aweme.getUserStory();
        if (userStory2 == null || (stories = userStory2.getStories()) == null || (aweme2 = (Aweme) C13LP.LJJJLL(stories)) == null) {
            return;
        }
        LIZJ(aweme2);
    }

    public static final List<Aweme> LIZIZ(Lifecycle lifecycle, C2189821An6 c2189821An6) {
        Object next;
        HashMap<String, InterfaceC1186204kW> mapLIZ;
        InterfaceC1186204kW interfaceC1186204kW;
        Pair<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> pairLIZ;
        Class<? extends BaseDetailShareVM<?, ?, ?>> second;
        Iterator it2 = ServiceManager.get().getServices(IDetailPageShareVMService.class).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                HashMap<String, InterfaceC1186204kW> mapLIZ2 = ((IDetailPageShareVMService) next).LIZ();
                if (mapLIZ2 != null && mapLIZ2.containsKey(c2189821An6.getFrom())) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        IDetailPageShareVMService iDetailPageShareVMService = (IDetailPageShareVMService) next;
        if (iDetailPageShareVMService == null || (mapLIZ = iDetailPageShareVMService.LIZ()) == null || (interfaceC1186204kW = mapLIZ.get(c2189821An6.getFrom())) == null || (pairLIZ = interfaceC1186204kW.LIZ(c2189821An6)) == null || (second = pairLIZ.getSecond()) == null) {
            return null;
        }
        BaseDetailShareVM baseDetailShareVM = (BaseDetailShareVM) new SharedViewModelProvider(new ViewModelProvider.NewInstanceFactory()).get(lifecycle, pairLIZ.getFirst(), second);
        if (!baseDetailShareVM._initialized) {
            return null;
        }
        return baseDetailShareVM.getAwemeList();
    }

    public static final void LIZLLL(final Bundle bundle, final Class<? extends InterfaceC20153313tL> cls, final InterfaceC1726310v1Z interfaceC1726310v1Z) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preloader shot: ");
        sbLIZ.append(cls);
        C1720106oR.LJI("STORY-Preloader", C2188811AlT.LIZIZ(sbLIZ));
        C20153113tJ c20153113tJ = C20152913tH.LIZLLL;
        InterfaceC20153213tK interfaceC20153213tK = new InterfaceC20153213tK() { // from class: X.0SgK
            @Override // X.InterfaceC20153213tK
            public final void LIZ(C20152113t9 c20152113t9) {
                c20152113t9.LIZ(bundle, cls, interfaceC1726310v1Z, Boolean.FALSE);
            }
        };
        c20153113tJ.getClass();
        C20153113tJ.LIZJ(interfaceC20153213tK);
    }
}
