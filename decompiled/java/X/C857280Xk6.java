package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS665S0100000_16;

/* JADX INFO: renamed from: X.0Xk6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C857280Xk6 extends AbstractC857240Xk2<Unit> {
    public final Activity LLILZ;
    public final VideoPublishEditModel LLILZIL;
    public final List<Integer> LLILZLL = C1697810uHb.LJIILJJIL(100101, -113);
    public final String LLIZ = EnumC856470Xin.PUBLISH_NO_SPACE_CHECK.getValue().getSecond();

    @Override // X.AbstractC857240Xk2
    public final String LIZJ() {
        return this.LLIZ;
    }

    @Override // X.AbstractC857240Xk2
    public final void LIZ(C857220Xk0 c857220Xk0) {
        Integer num;
        C1433530nPL c1433530nPLLIZLLL;
        C1433530nPL c1433530nPLLIZLLL2;
        if (!C1428470nHB.LJJZZI(this.LLILZIL) && !C1428470nHB.LJJJZ(this.LLILZIL)) {
            C01GW c01gw = C263340ATs.LIZ;
            if (((Number) c01gw.getValue()).intValue() != -1) {
                long jLJI = C0WYJ.LJI() / ((long) 1048576);
                int iIntValue = ((Number) c01gw.getValue()).intValue();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PublishNoSpaceChecker: availableDiskSize ");
                sbLIZ.append(jLJI);
                sbLIZ.append(", minThresholdSpaceSize ");
                sbLIZ.append(iIntValue);
                C2188811AlT.LIZIZ(sbLIZ);
                if (jLJI < iIntValue) {
                    VideoPublishEditModel videoPublishEditModel = this.LLILZIL;
                    String str = videoPublishEditModel.creativeModel.prePublishStatusModel.postPagePrePublishId;
                    String editPagePrePublishId = videoPublishEditModel.getEditPagePrePublishId();
                    C1433730nPf.LIZ.getClass();
                    Integer num2 = null;
                    if (str == null || (c1433530nPLLIZLLL2 = C1433730nPf.LJ.LIZLLL(str)) == null || (num = c1433530nPLLIZLLL2.LJII) == null) {
                        if (editPagePrePublishId != null && (c1433530nPLLIZLLL = C1433730nPf.LJ.LIZLLL(editPagePrePublishId)) != null) {
                            num2 = c1433530nPLLIZLLL.LJII;
                        }
                        num = num2;
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("PublishNoSpaceChecker: NoSpaceErrorCodes ");
                    sbLIZ2.append(this.LLILZLL);
                    sbLIZ2.append(", PrePublishErrorCode ");
                    sbLIZ2.append(num);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    if (num != null && this.LLILZLL.contains(num)) {
                        if (C0DHG.LIZ() && C1388190mED.LIZ(this.LLILZ) != null) {
                            C632670Orh.LIZIZ(this.LLILZ, new C19719212De(1635288347, new AwS665S0100000_16(this, 4), true));
                        } else {
                            C1397580mTM c1397580mTM = new C1397580mTM(this.LLILZ);
                            c1397580mTM.LJFF(2131829606);
                            c1397580mTM.LIZ(2131849118);
                            C985403tE.LIZ(c1397580mTM, new AwS591S0100000_12(this, 907));
                            new C1397510mTF(c1397580mTM).LIZLLL();
                        }
                        c857220Xk0.cancel();
                        return;
                    }
                }
                c857220Xk0.LIZ(this);
                return;
            }
        }
        c857220Xk0.LIZ(this);
    }

    public C857280Xk6(C19GS c19gs, VideoPublishEditModel videoPublishEditModel) {
        this.LLILZ = c19gs;
        this.LLILZIL = videoPublishEditModel;
    }
}
