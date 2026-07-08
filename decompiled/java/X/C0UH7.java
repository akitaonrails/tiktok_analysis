package X;

import android.content.res.Resources;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0UH7, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UH7 {
    public static EnumC776090UcR LIZ(int i) {
        String resourceEntryName;
        EnumC776090UcR enumC776090UcR;
        EnumC776090UcR[] enumC776090UcRArrValues = EnumC776090UcR.values();
        int length = enumC776090UcRArrValues.length;
        int i2 = 0;
        while (true) {
            resourceEntryName = null;
            if (i2 < length) {
                enumC776090UcR = enumC776090UcRArrValues[i2];
                if (enumC776090UcR.getTag() == i) {
                    break;
                }
                i2++;
            } else {
                enumC776090UcR = null;
                break;
            }
        }
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest() && enumC776090UcR == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Please set up LiveHostSettingItem with tag: ");
            sbLIZ.append(i);
            sbLIZ.append(", tag: ");
            try {
                resourceEntryName = C497740JfY.LJII().getResources().getResourceEntryName(i);
            } catch (Resources.NotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            sbLIZ.append(resourceEntryName);
            sbLIZ.append(' ');
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
        }
        return enumC776090UcR;
    }
}
