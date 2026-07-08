package X;

import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CommonMobParamModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.event.EventData;
import com.ss.android.ugc.aweme.experiment.StoryAlbumEnterEditLaunchParams;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0L2H, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L2H extends AbstractC2255721DQs<C05YF> implements C05YF, C0F1U, InterfaceC379610EuV {
    public static final C0L2F LLJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public static final Set<C0LEK> LLJIJIL;
    public final C1DRG LL;
    public final Function0<StoryAlbumEnterEditLaunchParams> LLILLJJLI;
    public final String LLILLL;
    public final C05YF LLILZ = this;
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0L2H.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJ = new C0L2F();
        LLJIJIL = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
    }

    public final VideoPublishEditModel LJJJLIIL() {
        return (VideoPublishEditModel) this.LLILZIL.getValue(this, LLJI[0]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        Object c098200Yq;
        StoryAlbumEnterEditLaunchParams storyAlbumEnterEditLaunchParams;
        String str;
        CreativeModel creativeModel;
        EventData eventData;
        CreativeModel creativeModel2;
        CommonMobParamModel commonMobParamModel;
        CreativeModel creativeModel3;
        CommonMobParamModel commonMobParamModel2;
        boolean z;
        boolean z2;
        super.onCreate();
        try {
            C0L2I c0l2i = C0L2I.LJFF;
            c0l2i.LIZIZ();
            C0L2J c0l2j = C0L2J.LJFF;
            c0l2j.LIZIZ();
            C0L2K c0l2k = C0L2K.LJFF;
            c0l2k.LIZIZ();
            Function0<StoryAlbumEnterEditLaunchParams> function0 = this.LLILLJJLI;
            if (function0 == null || (storyAlbumEnterEditLaunchParams = function0.invoke()) == null) {
                VideoPublishEditModel videoPublishEditModelLJJJLIIL = LJJJLIIL();
                String str2 = null;
                String str3 = videoPublishEditModelLJJJLIIL != null ? videoPublishEditModelLJJJLIIL.mShootWay : null;
                VideoPublishEditModel videoPublishEditModelLJJJLIIL2 = LJJJLIIL();
                if (videoPublishEditModelLJJJLIIL2 == null || (creativeModel3 = videoPublishEditModelLJJJLIIL2.creativeModel) == null || (commonMobParamModel2 = creativeModel3.commonMobModel) == null || (str = commonMobParamModel2.shootEnterMethod) == null) {
                    VideoPublishEditModel videoPublishEditModelLJJJLIIL3 = LJJJLIIL();
                    str = (videoPublishEditModelLJJJLIIL3 == null || (creativeModel = videoPublishEditModelLJJJLIIL3.creativeModel) == null || (eventData = creativeModel.eventData) == null) ? null : eventData.shootEnterMethod;
                }
                VideoPublishEditModel videoPublishEditModelLJJJLIIL4 = LJJJLIIL();
                if (videoPublishEditModelLJJJLIIL4 != null && (creativeModel2 = videoPublishEditModelLJJJLIIL4.creativeModel) != null && (commonMobParamModel = creativeModel2.commonMobModel) != null) {
                    str2 = commonMobParamModel.shootEnterFrom;
                }
                storyAlbumEnterEditLaunchParams = new StoryAlbumEnterEditLaunchParams(str3, str, str2);
            }
            boolean z3 = false;
            if (C0L2G.LIZ(storyAlbumEnterEditLaunchParams)) {
                C0L2G.LIZ.getClass();
                z = C0L2G.LIZIZ().mimeTypeCacheEnabled;
            } else {
                z = false;
            }
            if (C0L2G.LIZ(storyAlbumEnterEditLaunchParams)) {
                C0L2G.LIZ.getClass();
                z2 = C0L2G.LIZIZ().decodeBoundsCacheEnabled;
            } else {
                z2 = false;
            }
            if (C0L2G.LIZ(storyAlbumEnterEditLaunchParams)) {
                C0L2G.LIZ.getClass();
                z3 = C0L2G.LIZIZ().veMetadataCacheEnabled;
            }
            if (z || z2 || z3) {
                if (z) {
                    c0l2i.LIZ(this);
                    this.LLILZLL = true;
                }
                if (z2) {
                    c0l2j.LIZ(this);
                    this.LLIZ = true;
                }
                if (z3) {
                    c0l2k.LIZ(this);
                    this.LLIZLLLIL = true;
                }
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        Object c098200Yq;
        super.onDestroy();
        boolean z = this.LLILZLL;
        if (z || this.LLIZ || this.LLIZLLLIL) {
            if (z) {
                try {
                    C0L2I.LJFF.LIZLLL(this);
                    this.LLILZLL = false;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
            }
            if (this.LLIZ) {
                C0L2J.LJFF.LIZLLL(this);
                this.LLIZ = false;
            }
            if (this.LLIZLLLIL) {
                C0L2K.LJFF.LIZLLL(this);
                this.LLIZLLLIL = false;
            }
            c098200Yq = Integer.valueOf(Log.d(this.LLILLL, "onDestroy disarm gate"));
            C189200o6.m2constructorimpl(c098200Yq);
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
        }
    }

    @Override // X.AbstractC2255721DQs
    public C05YF getApiComponent() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C0L2H(C1DRG c1drg, Function0<StoryAlbumEnterEditLaunchParams> function0, String str) {
        this.LL = c1drg;
        this.LLILLJJLI = function0;
        this.LLILLL = str;
    }
}
