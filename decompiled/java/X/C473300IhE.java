package X;

import Y.AfS143S0200000_7;
import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.livesetting.feed.LiveInfeedSkylightEntranceSetting;
import com.bytedance.android.livesdk.livesetting.feed.LiveNearbyTabSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSkylightNearByEntranceSetting;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0IhE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C473300IhE implements InterfaceC475140IkC {
    public final int LIZIZ;
    public final boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public long LJFF;
    public final MutableLiveData<Pair<Integer, BaseListResponse<FeedItem, FeedExtra>>> LJI;
    public WeakReference<InterfaceC420801kM> LJII;
    public WeakReference<InterfaceC420801kM> LJIIIIZZ;

    @Override // X.InterfaceC475140IkC
    public final void LJII() {
        this.LJI.setValue(null);
        BaseListResponse baseListResponseLIZ = C473270IhB.LIZ(null);
        if (baseListResponseLIZ != null) {
            MutableLiveData<Pair<Integer, BaseListResponse<FeedItem, FeedExtra>>> mutableLiveData = this.LJI;
            InterfaceC475140IkC.LIZ.getClass();
            mutableLiveData.setValue(new Pair<>(1, baseListResponseLIZ));
        }
        this.LJFF = 0L;
        this.LIZLLL = false;
    }

    @Override // X.InterfaceC475140IkC
    public final BaseListResponse<FeedItem, FeedExtra> LJIIIIZZ() {
        Pair<Integer, BaseListResponse<FeedItem, FeedExtra>> value = this.LJI.getValue();
        if (value != null) {
            return value.getSecond();
        }
        return null;
    }

    @Override // X.InterfaceC475140IkC
    public final long LIZ() {
        return this.LJFF;
    }

    @Override // X.InterfaceC475140IkC
    public final boolean LJIIIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC475140IkC
    public final boolean LIZJ(C19EG c19eg) {
        Pair<Integer, BaseListResponse<FeedItem, FeedExtra>> value;
        BaseListResponse<FeedItem, FeedExtra> second;
        List<FeedItem> list;
        if (!this.LIZLLL || (value = this.LJI.getValue()) == null || (second = value.getSecond()) == null || (list = second.data) == null || !C500260Jjc.LJJIJIIJI(list)) {
            if (C473270IhB.LIZIZ) {
                if (!((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocationPermissionGranted(c19eg) || LiveNearbyTabSetting.INSTANCE.enable()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC475140IkC
    public final void LJ(Observer<Pair<Integer, BaseListResponse<FeedItem, FeedExtra>>> observer) {
        this.LJI.removeObserver(observer);
    }

    @Override // X.InterfaceC475140IkC
    public final void LJFF(Observer<Pair<Integer, BaseListResponse<FeedItem, FeedExtra>>> observer) {
        this.LJI.observeForever(observer);
    }

    @Override // X.InterfaceC475140IkC
    public final void LJI(String str) {
        InterfaceC420801kM interfaceC420801kM;
        InterfaceC420801kM interfaceC420801kM2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stopPollingNearbyData ");
        sbLIZ.append(str);
        sbLIZ.append(" + ");
        sbLIZ.append(hashCode());
        C20441214yg.LJIIIZ("NearbyDataManager", C2188811AlT.LIZIZ(sbLIZ));
        WeakReference<InterfaceC420801kM> weakReference = this.LJII;
        if (weakReference != null && (interfaceC420801kM2 = weakReference.get()) != null) {
            interfaceC420801kM2.dispose();
        }
        this.LJII = null;
        WeakReference<InterfaceC420801kM> weakReference2 = this.LJIIIIZZ;
        if (weakReference2 != null && (interfaceC420801kM = weakReference2.get()) != null) {
            interfaceC420801kM.dispose();
        }
        this.LJIIIIZZ = null;
    }

    public C473300IhE(int i, boolean z) {
        this.LIZIZ = i;
        this.LIZJ = z;
        MutableLiveData<Pair<Integer, BaseListResponse<FeedItem, FeedExtra>>> mutableLiveData = new MutableLiveData<>();
        this.LJI = mutableLiveData;
        BaseListResponse baseListResponseLIZ = C473270IhB.LIZ(null);
        if (baseListResponseLIZ != null) {
            InterfaceC475140IkC.LIZ.getClass();
            mutableLiveData.setValue(new Pair<>(1, baseListResponseLIZ));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    @Override // X.InterfaceC475140IkC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C11JF LIZIZ(final int r15, X.EnumC471720Ieg r16, final kotlin.jvm.functions.Function2 r17) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C473300IhE.LIZIZ(int, X.0Ieg, kotlin.jvm.functions.Function2):X.11JF");
    }

    @Override // X.InterfaceC475140IkC
    public final void LIZLLL(Context context, EnumC471720Ieg enumC471720Ieg, EnumC473310IhF enumC473310IhF, String str, String str2, boolean z) {
        InterfaceC420801kM interfaceC420801kM;
        InterfaceC420801kM interfaceC420801kM2;
        InterfaceC420801kM interfaceC420801kM3;
        InterfaceC420801kM interfaceC420801kM4;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startPollingNearbyData start + ");
        sbLIZ.append(hashCode());
        C20441214yg.LJIIIZ("NearbyDataManager", C2188811AlT.LIZIZ(sbLIZ));
        EnumC473310IhF enumC473310IhF2 = EnumC473310IhF.INIT;
        if (enumC473310IhF == enumC473310IhF2) {
            LJII();
        } else if (enumC473310IhF == EnumC473310IhF.RESUME && !this.LJ) {
            return;
        }
        if (context != null && LiveSkylightNearByEntranceSetting.entranceEnable() && LiveInfeedSkylightEntranceSetting.matchNearbyEntrance(str, str2) && !z) {
            if (this.LIZJ) {
                boolean zIsLocationPermissionGranted = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocationPermissionGranted(context);
                if ((this.LIZIZ != 1 || !LiveSkylightNearByEntranceSetting.enableBanner()) && !zIsLocationPermissionGranted) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("startPollingNearbyData gps permission denied + ");
                    sbLIZ2.append(hashCode());
                    C20441214yg.LJIIIZ("NearbyDataManager", C2188811AlT.LIZIZ(sbLIZ2));
                    return;
                }
            }
            if (enumC473310IhF == enumC473310IhF2) {
                this.LJ = true;
            }
            WeakReference<InterfaceC420801kM> weakReference = this.LJII;
            if (weakReference != null && (interfaceC420801kM4 = weakReference.get()) != null && !interfaceC420801kM4.isDisposed()) {
                return;
            }
            long jDataUpdateTime = LiveSkylightNearByEntranceSetting.dataUpdateTime();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("startPollingNearbyData success + ");
            sbLIZ3.append(hashCode());
            C20441214yg.LJIIIZ("NearbyDataManager", C2188811AlT.LIZIZ(sbLIZ3));
            WeakReference<InterfaceC420801kM> weakReference2 = this.LJII;
            if (weakReference2 != null && (interfaceC420801kM3 = weakReference2.get()) != null) {
                interfaceC420801kM3.dispose();
            }
            if (this.LIZIZ == 0) {
                this.LJII = new WeakReference<>(C11NZ.LJJJJLI(jDataUpdateTime, TimeUnit.SECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS143S0200000_7((Object) this, (EmoteModel) enumC471720Ieg, (InterfaceC1631620sYq<? super EmoteModel, ? super String, ? super Integer, Unit>) 31), new C09JN() { // from class: X.0IhG
                    @Override // X.C09JN
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                        C1C7U.LIZ("SkylightNearbyDataManager@a178.startPollingNearbyData$subscribe$2");
                        C1C7U.LIZIZ("SkylightNearbyDataManager@a178.startPollingNearbyData$subscribe$2");
                    }
                }));
            }
            if (enumC473310IhF == enumC473310IhF2) {
                if (this.LIZIZ == 0) {
                    InterfaceC475140IkC.LIZ.getClass();
                    LIZIZ(3, enumC471720Ieg, null);
                    return;
                }
                WeakReference<InterfaceC420801kM> weakReference3 = this.LJIIIIZZ;
                if (weakReference3 != null && (interfaceC420801kM2 = weakReference3.get()) != null && !interfaceC420801kM2.isDisposed()) {
                    return;
                }
                WeakReference<InterfaceC420801kM> weakReference4 = this.LJIIIIZZ;
                if (weakReference4 != null && (interfaceC420801kM = weakReference4.get()) != null) {
                    interfaceC420801kM.dispose();
                }
                InterfaceC475140IkC.LIZ.getClass();
                this.LJIIIIZZ = new WeakReference<>(LIZIZ(3, enumC471720Ieg, null));
            }
        }
    }
}
