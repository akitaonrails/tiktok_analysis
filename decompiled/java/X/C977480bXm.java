package X;

import android.animation.ValueAnimator;
import com.bytedance.android.live.liveinteract.multihost.biz.link.view.MultiCoHostWindowManager;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0bXm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C977480bXm extends C09AY implements Function1<C970900bNA, Unit> {
    public final /* synthetic */ C977470bXl LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C977480bXm(C977470bXl c977470bXl) {
        super(1);
        this.LL = c977470bXl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C970900bNA c970900bNA) {
        MultiCoHostWindowManager multiCoHostWindowManager;
        ViewOnClickListenerC986770bml viewOnClickListenerC986770bmlLJ;
        boolean z;
        MultiCoHostWindowManager multiCoHostWindowManager2;
        ViewOnClickListenerC986770bml viewOnClickListenerC986770bmlLJ2;
        C970900bNA c970900bNA2 = c970900bNA;
        if (c970900bNA2.LIZIZ) {
            if (!this.LL.LLILZ.contains(Integer.valueOf(c970900bNA2.LIZ.hashCode()))) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("trigger updateWindow when CoHostWindowView tag:");
                sbLIZ.append(c970900bNA2.LIZ.getTag());
                sbLIZ.append(" added, cachedWindowViewSet.size:");
                sbLIZ.append(this.LL.LLILZ.size());
                C20441214yg.LIZIZ("MatchPersonalScoreComponent", C2188811AlT.LIZIZ(sbLIZ));
                C977470bXl c977470bXl = this.LL;
                c977470bXl.getClass();
                if (C915980Zwa.LJFF().RY(false).compareTo(EnumC964170bCJ.MATCH_START) >= 0 && C970370bMJ.LJIIIIZZ()) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("update window, latestLinkSeq = ");
                    sbLIZ2.append(c977470bXl.LLILZIL);
                    C20441214yg.LIZIZ("MatchPersonalScoreComponent", C2188811AlT.LIZIZ(sbLIZ2));
                    List<C954460awe> list = c977470bXl.LLILZIL;
                    if (list != null) {
                        int i = 0;
                        for (C954460awe c954460awe : list) {
                            int i2 = i + 1;
                            String str = null;
                            if (i >= 0) {
                                C954460awe c954460awe2 = c954460awe;
                                MatchBaseWidget matchBaseWidget = c977470bXl.LLILLJJLI;
                                if (matchBaseWidget != null && (multiCoHostWindowManager2 = matchBaseWidget.LLILLJJLI) != null && (viewOnClickListenerC986770bmlLJ2 = multiCoHostWindowManager2.LJ(c954460awe2.LJIIJJI)) != null) {
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("after finalCall, updateWindow ");
                                    C754570Tip c754570Tip = c954460awe2.LJIJJ;
                                    if (c754570Tip != null) {
                                        str = c754570Tip.LIZIZ;
                                    }
                                    sbLIZ3.append(str);
                                    sbLIZ3.append(", linkedMicIndex:");
                                    sbLIZ3.append(i);
                                    sbLIZ3.append(", ");
                                    C20441214yg.LIZIZ("MatchPersonalScoreComponent", C2188811AlT.LIZIZ(sbLIZ3));
                                    c977470bXl.LLILZ.add(Integer.valueOf(viewOnClickListenerC986770bmlLJ2.hashCode()));
                                    c977470bXl.LJI();
                                } else {
                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                    sbLIZ4.append("after finalCall, updateWindow cannot find window of ");
                                    C754570Tip c754570Tip2 = c954460awe2.LJIJJ;
                                    if (c754570Tip2 != null) {
                                        str = c754570Tip2.LIZIZ;
                                    }
                                    sbLIZ4.append(str);
                                    C20441214yg.LJ("MatchPersonalScoreComponent", C2188811AlT.LIZIZ(sbLIZ4));
                                }
                                i = i2;
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                    }
                    for (C954460awe c954460awe3 : C915980Zwa.LJII().LJIJJ()) {
                        MatchBaseWidget matchBaseWidget2 = c977470bXl.LLILLJJLI;
                        if (matchBaseWidget2 != null && (multiCoHostWindowManager = matchBaseWidget2.LLILLJJLI) != null && (viewOnClickListenerC986770bmlLJ = multiCoHostWindowManager.LJ(c954460awe3.LJIIJJI)) != null) {
                            if (SettingsManager.INSTANCE.getBooleanValue("live_match_enlarge_keep_power_up_enable", true) && C915980Zwa.LJFF().QS0()) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (C970370bMJ.LJIIIIZZ() && !z) {
                                viewOnClickListenerC986770bmlLJ.LLJLL.clear();
                                viewOnClickListenerC986770bmlLJ.LLJLLIL.clear();
                                viewOnClickListenerC986770bmlLJ.LLJLLL.clear();
                                ((ArrayList) viewOnClickListenerC986770bmlLJ.LLL).clear();
                                viewOnClickListenerC986770bmlLJ.LLJZ.clear();
                                viewOnClickListenerC986770bmlLJ.LLJZIJLIL.clear();
                                viewOnClickListenerC986770bmlLJ.LLLF.clear();
                                viewOnClickListenerC986770bmlLJ.LLLFF.clear();
                                viewOnClickListenerC986770bmlLJ.LLLFFI.clear();
                                ((ArrayList) viewOnClickListenerC986770bmlLJ.LLLII).clear();
                                viewOnClickListenerC986770bmlLJ.LLLFZ.clear();
                                viewOnClickListenerC986770bmlLJ.LLLI.clear();
                                if (!viewOnClickListenerC986770bmlLJ.LLLIIII.isEmpty()) {
                                    for (Map.Entry entry : ((LinkedHashMap) viewOnClickListenerC986770bmlLJ.LLLIIII).entrySet()) {
                                        ValueAnimator valueAnimator = (ValueAnimator) entry.getKey();
                                        entry.getValue();
                                        valueAnimator.cancel();
                                    }
                                }
                            }
                        }
                    }
                    c977470bXl.LLILZLL.run();
                }
            }
        } else {
            this.LL.LLILZ.remove(Integer.valueOf(c970900bNA2.LIZ.hashCode()));
        }
        return Unit.LIZ;
    }
}
