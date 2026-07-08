package X;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.creative.model.audio.PreCheckResultModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.AwS154S0101000_14;

/* JADX INFO: renamed from: X.0XjC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C856720XjC extends AbstractC856750XjF {
    public final VideoPublishEditModel LIZLLL;
    public final ArrayList<AbstractC856710XjB> LJ;
    public final InterfaceC1455860nzM LJFF;

    @Override // X.AbstractC856750XjF
    public final void LIZ() {
        HashMap<Integer, PreCheckResultModel> detectResults;
        PreCheckResultModel preCheckResultModel;
        AbstractC856710XjB next;
        PreCheckResultModel preCheckResultModel2;
        PreCheckResultModel preCheckResultModel3;
        AbstractC856710XjB next2;
        HashMap<Integer, PreCheckResultModel> detectResults2 = this.LIZLLL.creativeModel.audioCopyrightDetectModel.getDetectResults();
        if (detectResults2 != null && (preCheckResultModel3 = detectResults2.get(Integer.valueOf(C0FPS.LONG_VIDEO.getScene()))) != null && preCheckResultModel3.hasShowResult) {
            Iterator<AbstractC856710XjB> it2 = this.LJ.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                } else {
                    next2 = it2.next();
                    if (next2.LIZ() == C0FPS.LONG_VIDEO.getScene()) {
                        break;
                    }
                }
            }
            AbstractC856710XjB abstractC856710XjB = next2;
            if (abstractC856710XjB != null) {
                abstractC856710XjB.LIZ = null;
            }
        }
        HashMap<Integer, PreCheckResultModel> detectResults3 = this.LIZLLL.creativeModel.audioCopyrightDetectModel.getDetectResults();
        if (detectResults3 != null && (preCheckResultModel2 = detectResults3.get(Integer.valueOf(C0FPS.ECOMMERCE.getScene()))) != null && preCheckResultModel2.hasShowResult) {
            Iterator<AbstractC856710XjB> it3 = this.LJ.iterator();
            while (it3.hasNext()) {
                it3.next().LIZ = null;
            }
        }
        if (!C362380EIq.LIZ() || (detectResults = this.LIZLLL.creativeModel.audioCopyrightDetectModel.getDetectResults()) == null || (preCheckResultModel = detectResults.get(Integer.valueOf(C0FPS.SHORT_VIDEO.getScene()))) == null || !preCheckResultModel.hasShowResult) {
            return;
        }
        Iterator<AbstractC856710XjB> it4 = this.LJ.iterator();
        while (true) {
            if (!it4.hasNext()) {
                next = null;
                break;
            } else {
                next = it4.next();
                if (next.LIZ() == C0FPS.SHORT_VIDEO.getScene()) {
                    break;
                }
            }
        }
        AbstractC856710XjB abstractC856710XjB2 = next;
        if (abstractC856710XjB2 != null) {
            abstractC856710XjB2.LIZ = null;
        }
    }

    @Override // X.AbstractC856750XjF
    public final int LIZIZ() {
        return EnumC856780XjI.POSSIBLE_SUBSCRIBE_LONG_VIDEO_CHECK_TYPE.getCheckType();
    }

    @Override // X.AbstractC856750XjF
    public final AbstractC856710XjB LIZJ() {
        AbstractC856710XjB abstractC856710XjB = null;
        if (!C362380EIq.LIZ()) {
            if (C857680Xkk.LIZIZ(this.LIZLLL)) {
                Iterator<AbstractC856710XjB> it2 = this.LJ.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    AbstractC856710XjB next = it2.next();
                    if (next.LIZ() == C0FPS.ECOMMERCE.getScene()) {
                        abstractC856710XjB = next;
                        break;
                    }
                }
                return abstractC856710XjB;
            }
            Iterator<AbstractC856710XjB> it3 = this.LJ.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                AbstractC856710XjB next2 = it3.next();
                if (next2.LIZ() == C0FPS.LONG_VIDEO.getScene()) {
                    abstractC856710XjB = next2;
                    break;
                }
            }
            return abstractC856710XjB;
        }
        if (C857680Xkk.LIZIZ(this.LIZLLL)) {
            Iterator<AbstractC856710XjB> it4 = this.LJ.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                AbstractC856710XjB next3 = it4.next();
                if (next3.LIZ() == C0FPS.ECOMMERCE.getScene()) {
                    abstractC856710XjB = next3;
                    break;
                }
            }
            return abstractC856710XjB;
        }
        if (C384190F4n.LIZIZ(this.LJFF)) {
            Iterator<AbstractC856710XjB> it5 = this.LJ.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    break;
                }
                AbstractC856710XjB next4 = it5.next();
                if (next4.LIZ() == C0FPS.LONG_VIDEO.getScene()) {
                    abstractC856710XjB = next4;
                    break;
                }
            }
            return abstractC856710XjB;
        }
        Iterator<AbstractC856710XjB> it6 = this.LJ.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            AbstractC856710XjB next5 = it6.next();
            if (next5.LIZ() == C0FPS.SHORT_VIDEO.getScene()) {
                abstractC856710XjB = next5;
                break;
            }
        }
        return abstractC856710XjB;
    }

    @Override // X.AbstractC856750XjF
    public final ArrayList<AbstractC856710XjB> LJ() {
        return this.LJ;
    }

    @Override // X.AbstractC856750XjF
    public final InterfaceC1455860nzM LJFF() {
        return this.LJFF;
    }

    @Override // X.AbstractC856750XjF
    public final VideoPublishEditModel LJI() {
        return this.LIZLLL;
    }

    public C856720XjC(VideoPublishEditModel videoPublishEditModel, ArrayList arrayList, InterfaceC1446740nke interfaceC1446740nke) {
        super(videoPublishEditModel, arrayList, interfaceC1446740nke);
        this.LIZLLL = videoPublishEditModel;
        this.LJ = arrayList;
        this.LJFF = interfaceC1446740nke;
    }

    @Override // X.AbstractC856750XjF
    public final void LJIIIIZZ(FragmentManager fragmentManager, Context context, VideoPublishEditModel videoPublishEditModel, int i, AwS154S0101000_14 awS154S0101000_14, AwS154S0101000_14 awS154S0101000_142) {
        AbstractC856710XjB next;
        Iterator<AbstractC856710XjB> it2 = this.LJ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LIZ() == C0FPS.ECOMMERCE.getScene()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AbstractC856710XjB abstractC856710XjB = next;
        if (abstractC856710XjB != null) {
            abstractC856710XjB.LJ(fragmentManager, context, videoPublishEditModel, i, awS154S0101000_14, awS154S0101000_142);
        }
    }
}
