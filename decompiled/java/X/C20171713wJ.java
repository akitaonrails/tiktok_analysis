package X;

import Y.ARunnableS130S0100000_30;
import android.app.Activity;
import android.content.Context;
import android.view.Window;
import androidx.lifecycle.Lifecycle;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.story.stickercreate.SocialStickerMetaData;
import com.ss.android.ugc.aweme.creative.model.story.stickercreate.StoryCommonStickerModel;
import com.ss.android.ugc.aweme.creative.model.story.stickercreate.StorySocialEventStickerMobParam;
import com.ss.android.ugc.aweme.creative.model.story.stickercreate.StorySocialEventStickerModel;
import com.ss.android.ugc.aweme.creative.model.story.stickercreate.StoryStreakModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.mob.record.IRecordMobService;
import com.ss.android.ugc.aweme.social.sticker.model.StorySocialEventPrepareData;
import com.ss.android.ugc.aweme.social.sticker.model.StorySocialEventStickerData;
import com.ss.android.ugc.aweme.social.sticker.model.base.SocialStickerColorStyle;
import com.ss.android.ugc.aweme.social.sticker.model.base.SocialStickerMapData;
import com.ss.android.ugc.aweme.social.sticker.model.base.SocialStickerResourceMetaData;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AwS403S0200000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13wJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20171713wJ implements InterfaceC1728106pj {
    public Context LIZ;
    public final int LIZIZ;
    public final long LIZJ;
    public DialogC1389620mGW LIZLLL;
    public boolean LJ;
    public final C054G LJFF;
    public EnumC20169713vz LJI;
    public final StorySocialEventPrepareData LJII;
    public long LJIIIIZZ;
    public final C01GW LJIIIZ;
    public final C01GW LJIIJ;
    public final C20170113w3 LJIIJJI;

    public void LIZLLL(C2344009Gk c2344009Gk) {
    }

    public final boolean LJI() {
        if (((Boolean) C263470AUf.LIZ.getValue()).booleanValue()) {
            DialogC1389620mGW dialogC1389620mGW = this.LIZLLL;
            return dialogC1389620mGW != null && dialogC1389620mGW.isShowing() && this.LJ;
        }
        DialogC1389620mGW dialogC1389620mGW2 = this.LIZLLL;
        return dialogC1389620mGW2 != null && dialogC1389620mGW2.isShowing();
    }

    @Override // X.InterfaceC1728106pj
    public void LIZJ(Function1<? super StorySocialEventPrepareData, Unit> function1) {
        if (function1 != null) {
            function1.invoke(this.LJII);
        }
        StorySocialEventPrepareData storySocialEventPrepareData = this.LJII;
        C20171513wH c20171513wH = new C20171513wH();
        c20171513wH.setFlowId(this.LJII.getCreationId());
        c20171513wH.setPreload(true);
        storySocialEventPrepareData.setPerformanceMetaData(c20171513wH);
        C20170113w3 c20170113w3 = this.LJIIJJI;
        c20170113w3.LIZIZ((C20169913w1) this.LJIIIZ.getValue());
        c20170113w3.LIZIZ((C20169913w1) this.LJIIJ.getValue());
        c20170113w3.LIZ(((C20169913w1) this.LJIIJ.getValue()).LIZ, ((C20171213wE) this.LJIIIZ.getValue()).LIZLLL);
    }

    public final void LJ(boolean z) {
        DialogC1389620mGW dialogC1389620mGW;
        Object c098200Yq;
        Activity activityLIZ;
        C19EG c19eg;
        Lifecycle lifecycle;
        if (((Boolean) C263470AUf.LIZ.getValue()).booleanValue() && z) {
            this.LJ = false;
            try {
                activityLIZ = C1388190mED.LIZ(this.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null && (lifecycle = c19eg.getLifecycle()) != null && (lifecycle instanceof AbstractC1563340qmi)) {
                ((AbstractC1563340qmi) lifecycle).LIZ(EnumC682280QpW.ADD_OBSERVER, new AwS403S0200000_2(lifecycle, this, 32));
                return;
            } else {
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
                C189200o6.m5exceptionOrNullimpl(c098200Yq);
            }
        }
        DialogC1389620mGW dialogC1389620mGW2 = this.LIZLLL;
        if (dialogC1389620mGW2 != null && dialogC1389620mGW2.isShowing() && (dialogC1389620mGW = this.LIZLLL) != null) {
            C0FNV.LIZ(dialogC1389620mGW);
        }
        this.LJ = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJFF(Function0<Unit> function0) {
        SocialStickerResourceMetaData next;
        T localPath;
        SocialStickerMapData data;
        SocialStickerColorStyle background;
        String resId;
        SocialStickerResourceMetaData next2;
        Object c098200Yq;
        if (function0 != null) {
            function0.invoke();
        }
        C1728406pm.LIZ.getClass();
        ConcurrentMap concurrentMapLIZIZ = C1728406pm.LIZIZ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : concurrentMapLIZIZ.entrySet()) {
            if (entry.getValue().hashCode() == hashCode()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            C1728406pm.LIZ.getClass();
            C1728406pm.LIZIZ().remove(entry2.getKey());
        }
        T localPath2 = 0;
        if (C0BWO.LIZ()) {
            String creationId = this.LJII.getCreationId();
            AnonymousClass0522 anonymousClass0522 = AnonymousClass0522.LIZ;
            try {
                anonymousClass0522.getClass();
                AnonymousClass0522.LIZ().remove(creationId);
                c098200Yq = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C493101w1(anonymousClass0522, null), 3);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.LIZ, "//openVideoEdit");
        smartRouteBuildRoute.withParam("shoot_way", this.LJII.getEnterEditParam().getMobData().getShootWay());
        C259800zU c259800zU = new C259800zU();
        Iterator<SocialStickerResourceMetaData> it2 = this.LJII.getStickerData().getResources().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.getId(), "background")) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        SocialStickerResourceMetaData socialStickerResourceMetaData = next;
        if (socialStickerResourceMetaData != null) {
            localPath = socialStickerResourceMetaData.getLocalPath();
        } else {
            localPath = 0;
        }
        c259800zU.element = localPath;
        if (localPath == 0 && (data = this.LJII.getStickerData().getData()) != null && (background = data.getBackground()) != null && (resId = background.getResId()) != null) {
            Iterator<SocialStickerResourceMetaData> it3 = this.LJII.getStickerData().getResources().iterator();
            while (true) {
                if (it3.hasNext()) {
                    next2 = it3.next();
                    if (Intrinsics.LJFF(next2.getId(), resId)) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            SocialStickerResourceMetaData socialStickerResourceMetaData2 = next2;
            if (socialStickerResourceMetaData2 != null) {
                localPath2 = socialStickerResourceMetaData2.getLocalPath();
            }
            c259800zU.element = localPath2;
        }
        String str = (String) c259800zU.element;
        if (str == null) {
            str = "";
        }
        smartRouteBuildRoute.withParam("media_path", str);
        smartRouteBuildRoute.withParam("creation_id", this.LJII.getCreationId());
        smartRouteBuildRoute.withParam("story_event_sticker_data", this.LJII.getEnterEditParamString());
        smartRouteBuildRoute.open();
    }

    public final void LJII(Context context) {
        Object obj;
        Window window;
        Window window2;
        DialogC1389620mGW dialogC1389620mGW = this.LIZLLL;
        if (dialogC1389620mGW != null && dialogC1389620mGW.isShowing()) {
            return;
        }
        if (this.LIZLLL == null) {
            if (context == null) {
                context = this.LIZ;
            }
            DialogC1389620mGW dialogC1389620mGW2 = new DialogC1389620mGW(context);
            dialogC1389620mGW2.LJJLJ(R.string.txr);
            this.LIZLLL = dialogC1389620mGW2;
        }
        DialogC1389620mGW dialogC1389620mGW3 = this.LIZLLL;
        if (dialogC1389620mGW3 != null) {
            C786410Ut5.J4(dialogC1389620mGW3);
        }
        try {
            DialogC1389620mGW dialogC1389620mGW4 = this.LIZLLL;
            if (dialogC1389620mGW4 != null && (window2 = dialogC1389620mGW4.getWindow()) != null) {
                window2.setGravity(17);
                window2.setLayout(-2, -2);
                window = window2;
            } else {
                window = null;
            }
            C189200o6.m2constructorimpl(window);
            obj = window;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        C189200o6.m5exceptionOrNullimpl(obj);
        this.LJ = true;
        long j = this.LIZJ;
        if (j <= 0) {
            return;
        }
        C786410Ut5.LJLIIL(j, C0CAU.LIZ, new ARunnableS130S0100000_30(this, 16));
    }

    @Override // X.InterfaceC1728106pj
    public final void cancel(boolean z) {
        int i;
        this.LJI = EnumC20169713vz.PENDING;
        C20171113wD c20171113wD = C20171113wD.LIZ;
        C20168613vo c20168613vo = new C20168613vo("total");
        EnumC20169713vz enumC20169713vz = EnumC20169713vz.FAILED;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LJIIIIZZ;
        boolean z2 = !LJI();
        if (z) {
            i = 1004;
        } else {
            i = 1003;
        }
        C20170413w6 c20170413w6 = new C20170413w6(c20168613vo, enumC20169713vz, jCurrentTimeMillis, null, Integer.valueOf(i), false, z2, 0, 168);
        StorySocialEventPrepareData storySocialEventPrepareData = this.LJII;
        c20171113wD.getClass();
        C20171113wD.LIZ(c20170413w6, storySocialEventPrepareData);
        this.LJIIIIZZ = 0L;
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C20170913wB(this, null), 3);
    }

    @Override // X.InterfaceC1728106pj
    public final void LIZ(Context context, Function0<Unit> function0) {
        Integer numValueOf;
        String flowId;
        StorySocialEventStickerMobParam mobData = this.LJII.getEnterEditParam().getMobData();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_method", mobData.getEnterMethod());
        StoryStreakModel storyStreakModel = this.LJII.getEnterEditParam().getStoryStreakModel();
        if (storyStreakModel != null) {
            numValueOf = Integer.valueOf(storyStreakModel.getStreakLevel());
        } else {
            numValueOf = null;
        }
        c2344009Gk.LJIIIIZZ("streak_level", String.valueOf(numValueOf));
        c2344009Gk.LJIIIIZZ("story_theme", String.valueOf(this.LIZIZ));
        LIZLLL(c2344009Gk);
        Map<String, String> map = c2344009Gk.LIZ;
        IRecordMobService iRecordMobService = (IRecordMobService) PluggableExtentionKt.pluggableSpi$default(IRecordMobService.class, false, false, false, 14, null);
        if (iRecordMobService != null) {
            iRecordMobService.LIZLLL(new C1449410nox(this.LJII.getCreationId(), mobData.getShootWay(), mobData.getEnterFrom(), null, null, null, null, null, 248), map);
        }
        if (context != null) {
            this.LIZ = context;
        }
        int i = C20170813wA.LIZ[this.LJI.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                C20171513wH performanceMetaData = this.LJII.getPerformanceMetaData();
                if (performanceMetaData != null) {
                    performanceMetaData.setPreload(false);
                }
                LJII(context);
                return;
            }
            LJII(context);
            C20171513wH performanceMetaData2 = this.LJII.getPerformanceMetaData();
            if (performanceMetaData2 != null) {
                performanceMetaData2.setPreload(false);
            }
            C20171513wH performanceMetaData3 = this.LJII.getPerformanceMetaData();
            if (performanceMetaData3 != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                C20171513wH performanceMetaData4 = this.LJII.getPerformanceMetaData();
                if (performanceMetaData4 != null) {
                    flowId = performanceMetaData4.getFlowId();
                } else {
                    flowId = null;
                }
                sbLIZ.append(flowId);
                sbLIZ.append('+');
                performanceMetaData3.setFlowId(C2188811AlT.LIZIZ(sbLIZ));
            }
            LIZIZ(function0, null);
            return;
        }
        C20171113wD c20171113wD = C20171113wD.LIZ;
        C20170413w6 c20170413w6 = new C20170413w6(new C20168613vo("total"), EnumC20169713vz.SUCCESS, 0L, null, null, true, false, 0, 156);
        StorySocialEventPrepareData storySocialEventPrepareData = this.LJII;
        c20171113wD.getClass();
        C20171113wD.LIZ(c20170413w6, storySocialEventPrepareData);
        if (((Boolean) C263470AUf.LIZ.getValue()).booleanValue()) {
            LJII(context);
            LJ(true);
        }
        LJFF(function0);
    }

    @Override // X.InterfaceC1728106pj
    public final void LIZIZ(Function0<Unit> function0, Function1<? super Boolean, Unit> function1) {
        EnumC20169713vz enumC20169713vz = this.LJI;
        EnumC20169713vz enumC20169713vz2 = EnumC20169713vz.RUNNING;
        if (enumC20169713vz == enumC20169713vz2) {
            return;
        }
        this.LJI = enumC20169713vz2;
        C23250099c.LIZLLL(this.LJFF, null, null, new C20171013wC(this, function1, function0, null), 3);
    }

    public C20171713wJ(int i, long j, Context context) {
        this.LIZ = context;
        this.LIZIZ = i;
        this.LIZJ = j;
        C054G c054gLIZ = C2296808zG.LIZ(C0PEM.LIZJ);
        this.LJFF = c054gLIZ;
        this.LJI = EnumC20169713vz.PENDING;
        StorySocialEventPrepareData storySocialEventPrepareData = new StorySocialEventPrepareData(new StorySocialEventStickerData(new ArrayList(), new SocialStickerMapData(null, null, null, null), new SocialStickerMetaData(null, null, null, null, null)), UUID.randomUUID().toString(), new StorySocialEventStickerModel(true, 0, new StoryCommonStickerModel(720, 1280, null, "", new ArrayList(), new ArrayList(), false, null), null, null, new StorySocialEventStickerMobParam("", "", "")), "");
        storySocialEventPrepareData.setContext(new WeakReference<>(this.LIZ));
        storySocialEventPrepareData.getEnterEditParam().setCelebrationType(i);
        this.LJII = storySocialEventPrepareData;
        this.LJIIIZ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(358));
        this.LJIIJ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(359));
        this.LJIIJJI = new C20170113w3(c054gLIZ);
    }
}
