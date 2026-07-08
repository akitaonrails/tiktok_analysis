package X;

import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.story.stickercreate.StorySocialEventStickerMobParam;
import com.ss.android.ugc.aweme.creative.model.story.stickercreate.StoryStreakModel;
import com.ss.android.ugc.aweme.social.schema.OpenStoryCelebrationEditAction;
import com.ss.android.ugc.aweme.social.sticker.model.StorySocialEventPrepareData;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0npN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1449670npN extends C09AY implements Function1<StorySocialEventPrepareData, Unit> {
    public final /* synthetic */ OpenStoryCelebrationEditAction LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C259800zU<Integer> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Bundle LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1449670npN(OpenStoryCelebrationEditAction openStoryCelebrationEditAction, String str, C259800zU<Integer> c259800zU, String str2, Bundle bundle) {
        super(1);
        this.LL = openStoryCelebrationEditAction;
        this.LLILLJJLI = str;
        this.LLILLL = c259800zU;
        this.LLILZ = str2;
        this.LLILZIL = bundle;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(StorySocialEventPrepareData storySocialEventPrepareData) {
        Object c098200Yq;
        Object c098200Yq2;
        Object c098200Yq3;
        int iIntValue;
        Integer numLJIIJJI;
        String string;
        Integer numLJIIJJI2;
        Object c098200Yq4;
        Integer numLJIIJJI3;
        StorySocialEventPrepareData storySocialEventPrepareData2 = storySocialEventPrepareData;
        OpenStoryCelebrationEditAction openStoryCelebrationEditAction = this.LL;
        String str = this.LLILLJJLI;
        int iIntValue2 = this.LLILLL.element.intValue();
        String str2 = this.LLILZ;
        Bundle bundle = this.LLILZIL;
        openStoryCelebrationEditAction.getClass();
        try {
            c098200Yq = C018G.LIZIZ(str, "enter_method");
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        String string2 = null;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str3 = (String) c098200Yq;
        try {
            c098200Yq2 = C018G.LIZIZ(str, "enter_from");
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq2)) {
            c098200Yq2 = null;
        }
        String str4 = (String) c098200Yq2;
        try {
            c098200Yq3 = C018G.LIZIZ(str, "extra");
            C189200o6.m2constructorimpl(c098200Yq3);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            c098200Yq3 = new C098200Yq(th3);
            C189200o6.m2constructorimpl(c098200Yq3);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq3)) {
            c098200Yq3 = null;
        }
        String str5 = (String) c098200Yq3;
        StorySocialEventStickerMobParam mobData = storySocialEventPrepareData2.getEnterEditParam().getMobData();
        if (str4 == null) {
            str4 = "";
        }
        mobData.setEnterFrom(str4);
        if (str3 == null) {
            str3 = "";
        }
        mobData.setEnterMethod(str3);
        storySocialEventPrepareData2.getEnterEditParam().setCelebrationType(iIntValue2);
        storySocialEventPrepareData2.setToUserId(str2);
        storySocialEventPrepareData2.setExtra(str5);
        int iIntValue3 = 0;
        if (iIntValue2 != 7) {
            if (iIntValue2 == 9) {
                try {
                    c098200Yq4 = C018G.LIZIZ(str, "conversation_id");
                    C189200o6.m2constructorimpl(c098200Yq4);
                } catch (Throwable th4) {
                    TryCatchGuardChecker.doCheck(th4);
                    c098200Yq4 = new C098200Yq(th4);
                    C189200o6.m2constructorimpl(c098200Yq4);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq4)) {
                    c098200Yq4 = null;
                }
                StoryStreakModel storyStreakModel = new StoryStreakModel(-1, (String) c098200Yq4, false, true, 0, null, null, 0, 0);
                if (bundle != null) {
                    string2 = bundle.getString("extra", "");
                }
                if (string2 != null) {
                    Iterator it2 = a0.LJJLIIIJILLIZJL(string2, new String[]{"&"}, 0, 6).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL((String) it2.next(), new String[]{"="}, 0, 6);
                        if (Intrinsics.LJFF(C13LP.LJJJLZIJ(0, listLJJLIIIJILLIZJL), "level")) {
                            String str6 = (String) C13LP.LJJJLZIJ(1, listLJJLIIIJILLIZJL);
                            if (str6 != null && (numLJIIJJI3 = C2095008Iq.LJIIJJI(str6)) != null) {
                                iIntValue3 = numLJIIJJI3.intValue();
                            }
                            storyStreakModel.setStreakLevel(iIntValue3);
                        }
                    }
                }
                storySocialEventPrepareData2.getEnterEditParam().setStoryStreakModel(storyStreakModel);
                storySocialEventPrepareData2.getEnterEditParam().getMobData().setShootWay("streaks_pet_to_story");
                storySocialEventPrepareData2.setNeedWindowToast(true);
            }
        } else {
            if (bundle != null) {
                string2 = bundle.getString("conID");
            }
            if (bundle != null && (string = bundle.getString("streak_days")) != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(string)) != null) {
                iIntValue = numLJIIJJI2.intValue();
            } else {
                iIntValue = 0;
                if (bundle != null) {
                }
                storySocialEventPrepareData2.getEnterEditParam().setStoryStreakModel(new StoryStreakModel(iIntValue3, string2, false, true, 0, null, null, 0, iIntValue));
                storySocialEventPrepareData2.getEnterEditParam().getMobData().setShootWay("streaks_to_story");
            }
            String string3 = bundle.getString("streak_level");
            if (string3 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(string3)) != null) {
                iIntValue3 = numLJIIJJI.intValue();
            }
            storySocialEventPrepareData2.getEnterEditParam().setStoryStreakModel(new StoryStreakModel(iIntValue3, string2, false, true, 0, null, null, 0, iIntValue));
            storySocialEventPrepareData2.getEnterEditParam().getMobData().setShootWay("streaks_to_story");
        }
        return Unit.LIZ;
    }
}
