package X;

import Y.ARunnableS56S0300000_23;
import android.os.Handler;
import android.util.Pair;
import com.bytedance.geckox.AppSettingsManager;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.policy.meta.file.ChannelFileRecordSettings;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.List;

/* JADX INFO: renamed from: X.0qTP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1551370qTP extends AbstractC1552240qUo<Pair<UpdatePackage, Long>, Pair<UpdatePackage, Long>> {
    @Override // X.AbstractC1552240qUo
    public final Object LIZJ(InterfaceC1552320qUw<Pair<UpdatePackage, Long>> interfaceC1552320qUw, Pair<UpdatePackage, Long> pair) {
        Pair<UpdatePackage, Long> pair2 = pair;
        UpdatePackage updatePackage = (UpdatePackage) pair2.first;
        Object obj = pair2.second;
        AppSettingsManager appSettingsManager = C1957007lY.LIZ;
        if (appSettingsManager.LIZ().getEnabled()) {
            try {
                C1551940qUK c1551940qUK = C797990VSb.LIZ;
                c1551940qUK.LIZIZ();
                C0VSJ c0vsj = new C0VSJ(new C0VSJ(c1551940qUK.LIZLLL.getRootDirectory(), updatePackage.getAccessKey()), updatePackage.getChannel());
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(obj);
                sbLIZ.append(File.separator);
                sbLIZ.append("res");
                C0VSJ c0vsj2 = new C0VSJ(c0vsj, C2188811AlT.LIZIZ(sbLIZ));
                if (c0vsj2.isDirectory()) {
                    List listLIZ = C08LA.LIZ(c0vsj2);
                    C1553130qWF.LIZ("gecko-debug-tag-ChannelFileRecord", "intercept: enqueue file record refresh, ak=", updatePackage.getAccessKey(), "channel=", updatePackage.getChannel(), "version=", obj, "bundleCount=", Integer.valueOf(listLIZ.size()), "res=", c0vsj2.getAbsolutePath());
                    C1551360qTO c1551360qTO = C1551360qTO.LIZ;
                    ChannelFileRecordSettings channelFileRecordSettingsLIZ = appSettingsManager.LIZ();
                    if (channelFileRecordSettingsLIZ.getEnabled()) {
                        C1551360qTO.LIZ.getClass();
                        C786410Ut5.LJJZZIII((Handler) C1551360qTO.LJIIIIZZ.getValue(), new ARunnableS56S0300000_23(channelFileRecordSettingsLIZ, updatePackage, listLIZ, 16));
                    }
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("skip file record: no res dir ");
                    sbLIZ2.append(c0vsj2.getAbsolutePath());
                    C1553130qWF.LIZ("gecko-debug-tag-ChannelFileRecord", C2188811AlT.LIZIZ(sbLIZ2));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("ChannelFileRecordUpdateInterceptor: ");
                sbLIZ3.append(th.getMessage());
                C1553130qWF.LJ("gecko-debug-tag-ChannelFileRecord", C2188811AlT.LIZIZ(sbLIZ3), th);
            }
        }
        return interfaceC1552320qUw.proceed(pair2);
    }
}
