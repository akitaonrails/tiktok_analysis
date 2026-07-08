package X;

import Y.AObserverS211S0100000_7;
import Y.AObserverS218S0100000_14;
import Y.AObserverS230S0100000_28;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.geofencing.model.TranslatedRegion;
import com.ss.android.ugc.aweme.geofencing.ui.GeoFencingStatusFragment;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.story.publish.ISocialPublishBridgeService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.AwS78S1000000_28;

/* JADX INFO: renamed from: X.10HW, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10HW extends C193N<InterfaceC857270Xk5, C190T, C10J1> implements InterfaceC857270Xk5 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public static final int LLJJI;
    public final InterfaceC1731706qJ LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;
    public final InterfaceC1731706qJ LLJ;
    public final MutableLiveData<List<TranslatedRegion>> LLJI;
    public final Function0<C190T> LLJIJIL;
    public final C10J1 LLJILJIL;
    public final C10J3 LLJILJILJ;
    public final InterfaceC1738600vLO LLJILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C10HW.class, "fragmentActivity", "getFragmentActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C10HW.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C10HW.class, "syncModule", "getSyncModule()Lcom/ss/android/ugc/aweme/shortvideo/BasePublishSyncModule;", 0);
        c09r3.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLJJI = 8;
    }

    private final C19EG O4() {
        return (C19EG) this.LLIZ.getValue(this, LLJJ[0]);
    }

    private final VideoPublishEditModel P4() {
        return (VideoPublishEditModel) this.LLIZLLLIL.getValue(this, LLJJ[1]);
    }

    public final AbstractC855580XhM T4() {
        return (AbstractC855580XhM) this.LLJ.getValue(this, LLJJ[2]);
    }

    @Override // X.InterfaceC857270Xk5
    public List<String> h20() {
        List<TranslatedRegion> value = this.LLJI.getValue();
        if (value == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(value, 10));
        Iterator<TranslatedRegion> it2 = value.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().code);
        }
        return arrayList;
    }

    public final void n5() {
        List<TranslatedRegion> value = this.LLJI.getValue();
        if (value == null) {
            return;
        }
        int size = value.size();
        String str = "";
        if (size != 0) {
            if (size != 1) {
                String string = O4().getString(2131835570, ((TranslatedRegion) C13LP.LJJJJZI(value)).translation, Integer.valueOf(value.size() - 1));
                if (string != null) {
                    str = string;
                }
            } else {
                str = ((TranslatedRegion) C13LP.LJJJJZI(value)).translation;
            }
        }
        i3(new AwS78S1000000_28(str, 4));
    }

    @Override // X.C193N, X.C193O
    public void Q3() {
        Z4(P4().geofencingSetting);
        if (C1428470nHB.LJJZZI(P4()) && !((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().isAccuratePrivateAccount()) {
            d5(new AObserverS218S0100000_14(this, 12));
        }
        C10HZ.LIZ.getClass();
        C10HZ.LIZIZ = false;
        C10HX.LIZ.getClass();
        AtomicBoolean atomicBoolean = C10HX.LIZIZ;
        if (atomicBoolean.compareAndSet(false, true)) {
            try {
                ISocialPublishBridgeService iSocialPublishBridgeService = (ISocialPublishBridgeService) ServiceManager.get().getService(ISocialPublishBridgeService.class);
                if (iSocialPublishBridgeService != null) {
                    iSocialPublishBridgeService.Kg(C10HX.LIZLLL, C10HX.LIZJ);
                } else {
                    atomicBoolean.set(false);
                    C201955140j.LJFF("GeoFencingHistoryReg", "ISocialPublishBridgeService unavailable; registration deferred");
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C10HX.LIZIZ.set(false);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("addPublishCallback failed: ");
                sbLIZ.append(th.getMessage());
                C201955140j.LJFF("GeoFencingHistoryReg", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Serializable, java.lang.Object[]] */
    public final void k5() {
        C19EG c19egO4 = O4();
        List<TranslatedRegion> value = this.LLJI.getValue();
        if (value == null) {
            value = C13BV.INSTANCE;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("extra.read_only", false);
        C786410Ut5.LJJIZ(bundle, "extra.region.list", value.toArray(new TranslatedRegion[0]));
        C786410Ut5.LJJJI("enter_from", "video_post_page", bundle);
        GeoFencingStatusFragment geoFencingStatusFragment = new GeoFencingStatusFragment();
        geoFencingStatusFragment.setArguments(bundle);
        geoFencingStatusFragment.LLILZLL = new C10HS() { // from class: X.10HV
            public final void LIZIZ(List<TranslatedRegion> list) {
                this.LIZ.LLJI.setValue(list);
            }

            @Override // X.C10HS
            public final void LIZ(int i, List list) {
                LIZIZ(list);
            }
        };
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJI = geoFencingStatusFragment;
        tuxSheet.LLJLILLLLZIIL = false;
        c1390920mIc.LJIIIIZZ(1);
        int iLJIIIIZZ = (int) (((double) C12ES.LJIIIIZZ(c19egO4)) * 0.9d);
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLJJL = iLJIIIIZZ;
        tuxSheet2.LLILLL = true;
        tuxSheet2.LLJLLIL = true;
        tuxSheet2.show(c19egO4.getSupportFragmentManager(), "GeoFencingSelectionFragment");
    }

    @Override // X.C193N, X.C193O
    public /* bridge */ /* synthetic */ Object B3() {
        return this.LLJILJIL;
    }

    @Override // X.C193N, X.C193O
    public InterfaceC1738600vLO E3() {
        return this.LLJILLL;
    }

    @Override // X.C193N
    public C10J3 H4() {
        return this.LLJILJILJ;
    }

    public C10J1 K4() {
        return this.LLJILJIL;
    }

    @Override // X.C193N, X.C193O, X.AbstractC1664470tPp
    public Function0<C190T> o2() {
        return this.LLJIJIL;
    }

    public C10HW(C1DRG c1drg) {
        super(c1drg);
        this.LLIZ = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJ = C1664770tQJ.LIZ(getDiContainer(), AbstractC855580XhM.class, null);
        this.LLJI = new MutableLiveData<>();
        this.LLJIJIL = AFwS217S0000000_28.get$arr$(369);
        this.LLJILJIL = new C10J1(new AwS607S0100000_28(this, 139), AFwS271S0000000_28.get$arr$(213));
        this.LLJILJILJ = AnonymousClass1937.LIZ;
        this.LLJILLL = EnumC214771193h.GEO_FENCING;
    }

    public final void Z4(List<String> list) {
        this.LLJI.observe(this, new AObserverS230S0100000_28(this, 45));
        C19216110Fr c19216110Fr = C19216110Fr.LIZ;
        AwS429S0200000_28 awS429S0200000_28 = new AwS429S0200000_28(this, (C10HW) list, (List<String>) 56);
        c19216110Fr.getClass();
        C19216110Fr.LIZ(awS429S0200000_28);
    }

    public final void d5(Observer<List<String>> observer) {
        C19220210Hg.LIZ(this.LLJI, AFwS237S0000000_7.get$arr$(188)).observe(this, observer);
    }

    @Override // X.InterfaceC857270Xk5
    public void lA2(Observer<Boolean> observer) {
        this.LLJI.observe(this, new AObserverS211S0100000_7(observer, 28));
    }

    @Override // X.InterfaceC857270Xk5
    public void LE2(int i, int i2, Intent intent) {
        List<TranslatedRegion> listLIZ;
        if (i2 != -1 || intent == null || (listLIZ = C10HU.LIZ(intent)) == null) {
            return;
        }
        this.LLJI.setValue(listLIZ);
    }
}
