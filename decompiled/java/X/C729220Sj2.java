package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.story.ICStoryService;
import com.ss.android.ugc.aweme.services.story.IStoryPublishService;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.story.publish.ISocialPublishBridgeService;
import com.ss.android.ugc.aweme.story.publish.SocialPublishCallback;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Sj2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C729220Sj2 implements InterfaceC1593650rZb, SocialPublishCallback, InterfaceC729270Sj7 {
    public static boolean LLILLJJLI;
    public static final C729220Sj2 LL = new C729220Sj2();
    public static final C728210ShP LLILLL = new C728210ShP();
    public static final C729300SjA LLILZ = new C729300SjA();
    public static final C01GW LLILZIL = C452501pT.LIZIZ(new C729230Sj3());

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onPublishCanceled(PublishModel publishModel, AbstractC1433460nPE abstractC1433460nPE, Object obj) {
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onReadyToCreateAweme(PublishModel publishModel) {
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onReportPublish() {
    }

    public static C729240Sj4 LJIIZILJ() {
        return (C729240Sj4) LLILZIL.getValue();
    }

    public static boolean LJIJ() {
        CopyOnWriteArrayList<C0SPF> copyOnWriteArrayList = LLILLL.LIZJ;
        if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
            Iterator<C0SPF> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                if (it2.next().LIZIZ.LIZIZ == EnumC696090RSd.FAILED) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC727980Sh2
    public final List<C0SPF> LIZ() {
        return LLILLL.LIZJ;
    }

    @Override // X.InterfaceC1581360rFm
    public final void LIZJ() {
        if (!LLILLJJLI) {
            AFwS243S0000000_11 aFwS243S0000000_11 = AFwS243S0000000_11.get$arr$(655);
            ISocialPublishBridgeService iSocialPublishBridgeService = (ISocialPublishBridgeService) PluggableExtentionKt.pluggableSpi$default(ISocialPublishBridgeService.class, false, false, false, 14, null);
            if (iSocialPublishBridgeService != null) {
                iSocialPublishBridgeService.Kg(this, aFwS243S0000000_11);
            }
            LJIIZILJ().getClass();
        }
        LLILLJJLI = true;
    }

    @Override // X.InterfaceC727980Sh2
    public final List<Aweme> LJIIIZ() {
        return LLILLL.LIZIZ();
    }

    @Override // X.InterfaceC727980Sh2
    public final List<Aweme> LJIILL() {
        C728210ShP c728210ShP = LLILLL;
        c728210ShP.getClass();
        Objects.toString(c728210ShP.LIZIZ());
        CopyOnWriteArrayList<Aweme> copyOnWriteArrayListLIZIZ = c728210ShP.LIZIZ();
        ArrayList arrayList = new ArrayList();
        for (Aweme aweme : copyOnWriteArrayListLIZIZ) {
            if (C728210ShP.LIZLLL(aweme)) {
                arrayList.add(aweme);
            }
        }
        CopyOnWriteArrayList<Aweme> copyOnWriteArrayListLIZIZ2 = c728210ShP.LIZIZ();
        ArrayList arrayList2 = new ArrayList();
        for (Aweme aweme2 : copyOnWriteArrayListLIZIZ2) {
            if (C728210ShP.LIZLLL(aweme2)) {
                arrayList2.add(aweme2);
            }
        }
        return arrayList2;
    }

    @Override // X.InterfaceC1593650rZb
    public final boolean LJIIIIZZ() {
        return LJIIZILJ().LJIIIIZZ();
    }

    @Override // X.InterfaceC1581360rFm
    public final boolean isPublishing() {
        return LJIIZILJ().LLILLJJLI.LLILZIL;
    }

    @Override // X.InterfaceC1593650rZb
    public final InterfaceC1593660rZc LJ() {
        return new InterfaceC1593660rZc() { // from class: X.0Sj5
            public static Pair<String, String> LIZIZ;
            public static Pair<String, String> LIZJ;

            @Override // X.InterfaceC1593660rZc
            public final Pair<String, String> LIZ(boolean z) {
                if (z) {
                    return LIZJ;
                }
                return LIZIZ;
            }

            @Override // X.InterfaceC1593660rZc
            public final void LIZIZ(String str, String str2, boolean z) {
                if (z) {
                    LIZJ = new Pair<>(str, str2);
                } else {
                    LIZIZ = new Pair<>(str, str2);
                }
            }
        };
    }

    public static final String LJIILLIIL(String str) {
        C728210ShP c728210ShP;
        C0SPF c0spfLIZJ;
        ICStoryService iCStoryServiceStoryService;
        IStoryPublishService iStoryPublishServiceStoryPublishService;
        C729240Sj4 c729240Sj4LJIIZILJ = LJIIZILJ();
        String strResolveCoverPathFallback = null;
        if (str == null) {
            c729240Sj4LJIIZILJ.getClass();
        } else {
            String str2 = (String) ((ConcurrentHashMap) c729240Sj4LJIIZILJ.LL.LJFF.getValue()).get(str);
            if (str2 != null) {
                return str2;
            }
            if (str == null || (c0spfLIZJ = (c728210ShP = LLILLL).LIZJ(str)) == null) {
                return null;
            }
            IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
            if (iExternalService != null && (iCStoryServiceStoryService = iExternalService.storyService()) != null && (iStoryPublishServiceStoryPublishService = iCStoryServiceStoryService.storyPublishService()) != null && (strResolveCoverPathFallback = iStoryPublishServiceStoryPublishService.resolveCoverPathFallback(c0spfLIZJ.LIZ)) != null) {
                ((ConcurrentHashMap) c728210ShP.LJFF.getValue()).put(str, strResolveCoverPathFallback);
            }
            return strResolveCoverPathFallback;
        }
        return null;
    }

    @Override // X.InterfaceC1593650rZb
    public final boolean LIZIZ(PublishModel publishModel) {
        return LJIIZILJ().LIZIZ(publishModel);
    }

    @Override // X.InterfaceC727980Sh2
    public final C729450SjP LIZLLL(String str) {
        return LJIIZILJ().LIZLLL(str);
    }

    @Override // X.InterfaceC1581360rFm
    public final EnumC696090RSd LJFF(String str) {
        return LJIIZILJ().LJFF(str);
    }

    @Override // X.InterfaceC727980Sh2
    public final C0SPF LJIIJ(String str) {
        C0SPF c0spf = null;
        if (str == null) {
            return null;
        }
        Iterator<C0SPF> it2 = LLILLL.LIZJ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C0SPF next = it2.next();
            if (Intrinsics.LJFF(next.LIZ.creationId, str)) {
                c0spf = next;
                break;
            }
        }
        return c0spf;
    }

    @Override // X.InterfaceC1581360rFm
    public final void LJIIL(String str) {
        LLILZ.LIZ.remove(str);
    }

    @Override // X.C0CWQ
    public final void LJIILIIL(String str) {
        try {
            LL.getClass();
            LJIIZILJ().LJIILIIL(str);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // X.C0CWQ
    public final int LJIILJJIL(UserStory userStory) {
        C728210ShP c728210ShP = LLILLL;
        int i = 0;
        if (c728210ShP.LIZIZ().isEmpty()) {
            return 0;
        }
        List<Aweme> stories = userStory.getStories();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(stories, 10));
        Iterator<Aweme> it2 = stories.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getAid());
        }
        int i2 = 0;
        while (i < c728210ShP.LIZIZ().size()) {
            Aweme aweme = c728210ShP.LIZIZ().get(i);
            if (arrayList.contains(aweme.getAid()) && C728210ShP.LIZLLL(aweme)) {
                i2++;
                c728210ShP.LIZIZ().remove(i);
                i--;
            }
            i++;
        }
        return i2;
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onPublishStart(PublishModel publishModel) {
        LJIIZILJ().onPublishStart(publishModel);
    }

    public static final boolean LJIJI(C19EG c19eg, String str) {
        C729240Sj4 c729240Sj4LJIIZILJ = LJIIZILJ();
        C0SPF c0spfLIZJ = c729240Sj4LJIIZILJ.LL.LIZJ(str);
        if (c0spfLIZJ != null && c0spfLIZJ.LIZIZ.LIZIZ == EnumC696090RSd.FAILED) {
            C729440SjO c729440SjO = c729240Sj4LJIIZILJ.LLILLJJLI;
            if ((c729440SjO instanceof InterfaceC729270Sj7) && c729440SjO != null) {
                c729440SjO.LJIL(c19eg, c0spfLIZJ);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.C0CWQ
    public final void LJI(String str, boolean z) {
        if (str == null) {
            return;
        }
        LJIIZILJ().LJI(str, z);
    }

    @Override // X.InterfaceC1581360rFm
    public final void LJII(Object obj, InterfaceC729460SjQ interfaceC729460SjQ) {
        LJIIZILJ().LJII(obj, interfaceC729460SjQ);
    }

    @Override // X.C0CWQ
    public final void LJIIJJI(Context context, InterfaceC497601wk interfaceC497601wk) {
        LJIIZILJ().LJIIJJI(context, interfaceC497601wk);
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onPublishProgress(int i, C1434900nRY c1434900nRY) {
        LJIIZILJ().onPublishProgress(i, c1434900nRY);
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onPublishSuccess(PublishModel publishModel, CreateAwemeResponse createAwemeResponse) {
        LJIIZILJ().onPublishSuccess(publishModel, createAwemeResponse);
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onSynthesisSuccess(PublishModel publishModel, String str) {
        LJIIZILJ().onSynthesisSuccess(publishModel, str);
    }

    @Override // X.InterfaceC1441160nbe
    public final void updatePreviewCoverPath(String str, String str2) {
        LJIIZILJ().updatePreviewCoverPath(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onPublishFailed(PublishModel publishModel, C1434650nR9 c1434650nR9, String str) {
        LJIIZILJ().onPublishFailed(publishModel, c1434650nR9, str);
    }
}
