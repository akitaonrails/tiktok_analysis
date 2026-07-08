package X;

import Y.ACallableS31S1000000_30;
import Y.ACallableS416S0100000_9;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.video.local.LocalVideoUrlModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS145S1200000_30;
import kotlin.jvm.internal.AwS431S0200000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14Ee, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20231414Ee {
    public final boolean LIZ;
    public final HashMap<String, LocalVideoUrlModel> LIZIZ;
    public volatile boolean LIZJ;
    public final List<String> LIZLLL;
    public long LJ;
    public final List<LocalVideoUrlModel> LJFF;

    public static int LIZJ() {
        try {
            return C0CLW.LIZIZ.LIZ.getLocalVideoCacheMaxLength().intValue() * 1024 * 1024;
        } catch (C316660CbA e) {
            TryCatchGuardChecker.doCheck(e);
            return 157286400;
        }
    }

    public C20231414Ee() {
        boolean zLIZ = C286930BMl.LIZ();
        this.LIZ = zLIZ;
        this.LIZIZ = zLIZ ? new LinkedHashMap<>(0, 0.75f, true) : new HashMap<>();
        this.LIZLLL = new ArrayList();
        this.LJFF = new ArrayList();
    }

    public final LocalVideoUrlModel LIZIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.LIZIZ.get(str);
    }

    public final boolean LIZLLL(LocalVideoUrlModel localVideoUrlModel) {
        int iIntValue;
        if (this.LIZ) {
            if (localVideoUrlModel != null && !TextUtils.isEmpty(localVideoUrlModel.localPath) && new C0VSJ(localVideoUrlModel.localPath).exists()) {
                return false;
            }
        } else if (localVideoUrlModel != null && !TextUtils.isEmpty(localVideoUrlModel.localPath) && new C0VSJ(localVideoUrlModel.localPath).exists()) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - localVideoUrlModel.getCreateTime();
            try {
                iIntValue = C0CLW.LIZIZ.LIZ.getLocalVideoCacheMaxAge().intValue() * 60 * LSPassThroughRecordSizeConfig.DEFAULT;
            } catch (C316660CbA e) {
                TryCatchGuardChecker.doCheck(e);
                iIntValue = 259200000;
            }
            if (jElapsedRealtime <= iIntValue) {
                return false;
            }
        }
        return true;
    }

    public final void LJ(LocalVideoUrlModel localVideoUrlModel) {
        if (localVideoUrlModel.getSourceId() == null) {
            return;
        }
        AwS431S0200000_30 awS431S0200000_30 = new AwS431S0200000_30(this, localVideoUrlModel, 24);
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            awS431S0200000_30.invoke();
        } else {
            C15O7.LIZIZ(new ACallableS416S0100000_9(awS431S0200000_30, 5), C15O7.LJIIIIZZ, null);
        }
    }

    public final void LJFF(Collection<? extends LocalVideoUrlModel> collection) {
        Iterator it2 = C13LP.LJLLLL(new Comparator() { // from class: X.14Eg
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                VideoUrlModel videoUrlModel = (VideoUrlModel) obj;
                VideoUrlModel videoUrlModel2 = (VideoUrlModel) obj2;
                if (videoUrlModel.getCreateTime() == videoUrlModel2.getCreateTime()) {
                    return 0;
                }
                if (videoUrlModel.getCreateTime() > videoUrlModel2.getCreateTime()) {
                    return 1;
                }
                return -1;
            }
        }, collection).iterator();
        while (it2.hasNext()) {
            LJ((LocalVideoUrlModel) it2.next());
        }
    }

    public final void LJI(Collection<? extends LocalVideoUrlModel> collection) {
        Iterator it2 = C13LP.LJLLLL(new Comparator() { // from class: X.14Ef
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                LocalVideoUrlModel localVideoUrlModel = (LocalVideoUrlModel) obj;
                LocalVideoUrlModel localVideoUrlModel2 = (LocalVideoUrlModel) obj2;
                if (localVideoUrlModel.accessedTime.longValue() > localVideoUrlModel2.accessedTime.longValue()) {
                    return 1;
                }
                if (localVideoUrlModel.accessedTime.longValue() < localVideoUrlModel2.accessedTime.longValue()) {
                    return -1;
                }
                return 0;
            }
        }, collection).iterator();
        while (it2.hasNext()) {
            LJ((LocalVideoUrlModel) it2.next());
        }
    }

    public final void LJII(String str) {
        LocalVideoUrlModel localVideoUrlModel;
        if (!TextUtils.isEmpty(str) && (localVideoUrlModel = this.LIZIZ.get(str)) != null) {
            long jLIZ = LIZ(localVideoUrlModel.getSourceId(), localVideoUrlModel.localPath, new AwS145S1200000_30(this, str, localVideoUrlModel, 0));
            this.LIZJ = true;
            this.LJ -= jLIZ;
        }
    }

    public final boolean LJIIIIZZ(long j, boolean z) {
        boolean z2;
        long length;
        long length2;
        ArrayList<LocalVideoUrlModel> arrayList = new ArrayList();
        if (z && !((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().needAvoidTimeControl()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.LIZ) {
            Iterator<Map.Entry<String, LocalVideoUrlModel>> it2 = this.LIZIZ.entrySet().iterator();
            long j2 = 0;
            while (it2.hasNext()) {
                LocalVideoUrlModel value = it2.next().getValue();
                C0VSJ c0vsj = new C0VSJ(value.localPath);
                if (c0vsj.exists()) {
                    length2 = c0vsj.length();
                } else {
                    length2 = 0;
                }
                arrayList.add(value);
                j2 += length2;
                this.LJ -= length2;
                if (j2 >= j) {
                    break;
                }
            }
        } else {
            int i = 0;
            long j3 = 0;
            while (j3 < j && i < ((ArrayList) this.LJFF).size()) {
                int i2 = i + 1;
                LocalVideoUrlModel localVideoUrlModel = (LocalVideoUrlModel) ListProtector.get(this.LJFF, i);
                C0VSJ c0vsj2 = new C0VSJ(localVideoUrlModel.localPath);
                long jElapsedRealtime = SystemClock.elapsedRealtime() - localVideoUrlModel.getCreateTime();
                SettingsManager.LIZLLL().getClass();
                if (jElapsedRealtime >= SettingsManager.LJFF("cache_keep_time_threshold", 0L) || z2) {
                    if (c0vsj2.exists()) {
                        length = c0vsj2.length();
                    } else {
                        length = 0;
                    }
                    arrayList.add(localVideoUrlModel);
                    j3 += length;
                    this.LJ -= length;
                }
                i = i2;
            }
        }
        for (LocalVideoUrlModel localVideoUrlModel2 : arrayList) {
            LIZ(localVideoUrlModel2.getSourceId(), localVideoUrlModel2.localPath, new AwS431S0200000_30(this, localVideoUrlModel2, 25));
        }
        this.LIZJ = true;
        if (this.LJ > j) {
            return true;
        }
        return false;
    }

    public final long LIZ(final String str, final String str2, final Function0<Unit> function0) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str) && !((ArrayList) this.LIZLLL).contains(str)) {
            C0VSJ c0vsj = new C0VSJ(str2);
            if (c0vsj.exists()) {
                long length = c0vsj.length();
                ((ArrayList) this.LIZLLL).add(str);
                C15O7.LIZIZ(new ACallableS31S1000000_30(str2, 0), C823050WQl.LIZLLL(), null).LJ(new InterfaceC2385309Wh() { // from class: X.0Xmm
                    @Override // X.InterfaceC2385309Wh
                    public final Object then(C15O7 c15o7) {
                        C1C7U.LIZ("LocalVideoCache@1ed3.deleteCacheFile$3");
                        ((ArrayList) this.LIZ.LIZLLL).remove(str);
                        function0.invoke();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("LocalVideoCache=>delete video cache,filePath:");
                        sbLIZ.append(str2);
                        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("LocalVideoCache@1ed3.deleteCacheFile$3");
                        return unit;
                    }
                }, C15O7.LJIIIIZZ, null);
                return length;
            }
            return 0L;
        }
        return 0L;
    }
}
