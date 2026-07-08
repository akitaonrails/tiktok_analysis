package X;

import com.ss.android.ugc.aweme.feed.model.StoryGetStreaksInfoResponse;
import com.ss.android.ugc.aweme.story.model.streaks.StoryStreakEnterEditParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.1206, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.streaks.util.StoryStreaksPreload$preload$1", f = "StoryStreaksPreload.kt", l = {82, 83}, m = "invokeSuspend")
public final class AnonymousClass1206 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public AnonymousClass1206(InterfaceC1364105Vn<? super AnonymousClass1206> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass1206(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String peerUid;
        long mufDaysCount;
        int mufDaysCount2;
        C1C7U.LIZ("StoryStreaksPreload@e3a6.preload$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("StoryStreaksPreload@e3a6.preload$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C126I.LJ = true;
            C126I c126i = C126I.LIZ;
            c126i.getClass();
            if (C126I.LJIIIZ <= 0) {
                StoryStreakEnterEditParam storyStreakEnterEditParam = C126I.LJII;
                if (storyStreakEnterEditParam != null && (mufDaysCount2 = storyStreakEnterEditParam.getMufDaysCount()) > 0) {
                    C126I.LJIIIZ = mufDaysCount2;
                } else {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C06NT c06nt = C06NT.LIZIZ;
                    StoryStreakEnterEditParam storyStreakEnterEditParam2 = C126I.LJII;
                    if (storyStreakEnterEditParam2 == null || (peerUid = storyStreakEnterEditParam2.getPeerUid()) == null) {
                        peerUid = "";
                    }
                    StoryGetStreaksInfoResponse storyGetStreaksInfoResponseLJ = c06nt.LJ(peerUid);
                    if (storyGetStreaksInfoResponseLJ != null) {
                        mufDaysCount = storyGetStreaksInfoResponseLJ.getMufDaysCount();
                    } else {
                        mufDaysCount = 0;
                    }
                    C126I.LJIIIZ = (int) mufDaysCount;
                    C126M.LJIIJ = System.currentTimeMillis() - jCurrentTimeMillis;
                }
            }
            this.LL = 1;
            if (c126i.LIZLLL(this) == objLJFF) {
                C1C7U.LIZIZ("StoryStreaksPreload@e3a6.preload$1");
                return objLJFF;
            }
        }
        C126I c126i2 = C126I.LIZ;
        this.LL = 2;
        if (c126i2.LIZIZ(this) == objLJFF) {
            C1C7U.LIZIZ("StoryStreaksPreload@e3a6.preload$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StoryStreaksPreload@e3a6.preload$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new AnonymousClass1206(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
