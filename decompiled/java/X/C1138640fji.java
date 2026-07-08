package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftResourceManagerSettings;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0fji, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1138640fji {
    public static final /* synthetic */ int LIZ = 0;

    static {
        Map<String, Object> map = C1338270kvh.LIZ;
    }

    public static final boolean LJIIIIZZ() {
        return ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isRegressionTest() || ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLiveInhouse();
    }

    public static final long LIZIZ(boolean z) {
        long folderSize;
        C1140890fnL.LIZLLL().getClass();
        C1138630fjh c1138630fjh = C1138630fjh.LIZ;
        C0VSJ c0vsj = new C0VSJ(C1142700fqG.LJFF().LIZIZ.LIZ.LIZ());
        if (c0vsj.exists() && c0vsj.isDirectory()) {
            folderSize = FileUtils.INSTANCE.getFolderSize(c0vsj);
        } else {
            folderSize = 0;
        }
        if (z) {
            if (LiveGiftResourceManagerSettings.INSTANCE.enableDeleteAll()) {
                C1139900flk c1139900flk = new C1139900flk(C1138630fjh.LJI);
                c1139900flk.LIZLLL = EnumC1138770fjv.DELETE_ALL;
                C1140310fmP c1140310fmPLIZ = C1140130fm7.LIZ();
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (c1140310fmPLIZ != null) {
                    c1140310fmPLIZ.LIZ(new AbstractC1140580fmq() { // from class: X.0fmK
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(null);
                        }

                        @Override // X.AbstractC1140580fmq
                        public final void LIZ(C1139900flk c1139900flk2) throws JSONException {
                            List<String> list;
                            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                            Long lValueOf = null;
                            if (c1139900flk2 != null) {
                                list = c1139900flk2.LJIILIIL;
                                lValueOf = Long.valueOf(c1139900flk2.LJIIL);
                            } else {
                                list = null;
                            }
                            C248700xh.LIZ(list, lValueOf, jElapsedRealtime2, "delete_all");
                        }
                    }, c1139900flk);
                }
                ((ConcurrentHashMap) C1142700fqG.LJFF().LJ).clear();
            }
        } else {
            C1139900flk c1139900flk2 = new C1139900flk(C1138630fjh.LJI);
            c1139900flk2.LIZLLL = EnumC1138770fjv.ONLY_CHECK;
            C1140310fmP c1140310fmPLIZ2 = C1140130fm7.LIZ();
            if (c1140310fmPLIZ2 != null) {
                c1140310fmPLIZ2.LIZ(new AbstractC1140580fmq() { // from class: X.0fmi
                    @Override // X.AbstractC1140580fmq
                    public final void LIZ(C1139900flk c1139900flk3) throws JSONException {
                        C248700xh.LIZ(null, null, 0L, "check_only");
                    }
                }, c1139900flk2);
            }
        }
        return Long.valueOf(folderSize).longValue();
    }

    public static final AssetsModel LIZLLL(long j) {
        C1140890fnL.LIZLLL().getClass();
        return C1138630fjh.LJFF(j);
    }

    public static Gift LJI(long j) {
        return GiftManager.inst().findGiftById(j);
    }

    public static final void LIZ(AssetsModel assetsModel, boolean z) {
        C1140890fnL.LIZLLL().getClass();
        C1138630fjh.LIZ.LIZ(assetsModel, z);
    }

    public static final String LJ(long j, Integer num) {
        String str;
        C1140890fnL.LIZLLL().getClass();
        C1138630fjh c1138630fjh = C1138630fjh.LIZ;
        AssetsModel assetsModelLJFF = C1138630fjh.LJFF(j);
        C1139230fkf c1139230fkfLIZ = C1138630fjh.LJI().LIZ(assetsModelLJFF, 0, num);
        if (assetsModelLJFF != null) {
            if (c1139230fkfLIZ != null) {
                str = c1139230fkfLIZ.LJ;
            } else {
                str = null;
            }
            String resourceFormat = assetsModelLJFF.getResourceFormat(str);
            if (resourceFormat != null) {
                return resourceFormat;
            }
        }
        return "unknown";
    }

    public static String LJFF(long j, boolean z) {
        C1140890fnL.LIZLLL().getClass();
        C1138630fjh c1138630fjh = C1138630fjh.LIZ;
        return C1142700fqG.LJFF().LJ(C1138630fjh.LJI().LIZ(C1138630fjh.LJFF(j), 0, null), Boolean.valueOf(z));
    }

    public static final boolean LJII(Integer num, Long l) {
        long jLongValue;
        C1138360fjG c1138360fjGLIZLLL = C1140890fnL.LIZLLL();
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        c1138360fjGLIZLLL.getClass();
        C1138630fjh c1138630fjh = C1138630fjh.LIZ;
        return C1138630fjh.LJI().LIZIZ(LIZLLL(jLongValue), num);
    }

    public static final C11JF LJIIIZ(int i, long j, Collection collection, InterfaceC1133140faq interfaceC1133140faq) {
        C1140890fnL.LIZLLL().getClass();
        C1138630fjh c1138630fjh = C1138630fjh.LIZ;
        return C1138630fjh.LJIIJ(i, Long.valueOf(j), false, collection, interfaceC1133140faq);
    }

    public static final void LIZJ(Long l, InterfaceC1138820fk0 interfaceC1138820fk0, int i, Map<String, String> map, Integer num) {
        if (l != null) {
            C1138360fjG c1138360fjGLIZLLL = C1140890fnL.LIZLLL();
            long jLongValue = l.longValue();
            c1138360fjGLIZLLL.getClass();
            C1138630fjh.LIZLLL(jLongValue, interfaceC1138820fk0, i, map, null, num);
        }
    }
}
