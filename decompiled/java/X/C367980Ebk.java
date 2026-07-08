package X;

import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Ebk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C367980Ebk extends C09AY implements Function1<C0E82, Unit> {
    public final /* synthetic */ C359740E8m LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C367980Ebk(C359740E8m c359740E8m) {
        super(1);
        this.LL = c359740E8m;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0E82 c0e82) {
        C367970Ebj multiTrackAdapter;
        C368020Ebo c368020Ebo;
        C367970Ebj multiTrackAdapter2;
        int paddingTop;
        int i;
        boolean z;
        C0E82 c0e822 = c0e82;
        int i2 = 0;
        if (c0e822.LIZ) {
            C368000Ebm c368000Ebm = this.LL.LLJJJIL;
            if (c368000Ebm != null && (multiTrackAdapter2 = c368000Ebm.getMultiTrackAdapter()) != null) {
                long j = c0e822.LIZIZ;
                int i3 = c0e822.LIZJ;
                C368020Ebo c368020Ebo2 = multiTrackAdapter2.LJJIFFI;
                if (!c368020Ebo2.LJJJ) {
                    c368020Ebo2.LJJJ = true;
                    c368020Ebo2.LJJIJL.cancel();
                    c368020Ebo2.LIZ.LIZLLL(true);
                    c368020Ebo2.LIZ.setOnlyOne$editor_trackpanel_release(false);
                    c368020Ebo2.LJIL = i3;
                    c368020Ebo2.LJIJI = j;
                    c368020Ebo2.LJIJJLI = c368020Ebo2.LIZ.getPaddingTop() + (c368020Ebo2.LJIL * (c368020Ebo2.LJIIJJI + c368020Ebo2.LJIIL));
                    boolean z2 = false;
                    for (Map.Entry entry : ((LinkedHashMap) c368020Ebo2.LIZ.LLLI).entrySet()) {
                        NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) entry.getKey();
                        C369110EdZ c369110EdZ = (C369110EdZ) entry.getValue();
                        InterfaceC368720Ecw interfaceC368720Ecw = c369110EdZ.LIZIZ;
                        if (interfaceC368720Ecw instanceof C367650EbD) {
                            boolean z3 = ((C367650EbD) interfaceC368720Ecw).LLILLL.LLLIIIL;
                            if (c369110EdZ.LIZ == i3 && !z3) {
                                if (Math.abs((nLETimeSpaceNode.getEndTime() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - j) < 5) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                ((C367650EbD) c369110EdZ.LIZIZ).LLILLL.setDrawEndDivider(z);
                                if (z) {
                                    z2 = true;
                                }
                            }
                        }
                    }
                    c368020Ebo2.LJJIIJZLJL = z2;
                    if ((C0FU0.LIZ(64.0f) + c368020Ebo2.LIZ.getHeight()) - C0FU0.LIZ(80.0f) < (c368020Ebo2.LJIIJJI + c368020Ebo2.LJIIL) * 2) {
                        c368020Ebo2.LIZ.setOnlyOne$editor_trackpanel_release(true);
                        c368020Ebo2.LIZ.setShowTrackNum$editor_trackpanel_release((int) Math.ceil(r7.getHeight() / (c368020Ebo2.LJIIJJI + c368020Ebo2.LJIIL)));
                    }
                    int paddingTop2 = c368020Ebo2.LIZ.getPaddingTop() + (c368020Ebo2.LJIL * (c368020Ebo2.LJIIJJI + c368020Ebo2.LJIIL));
                    int scrollY = paddingTop2 - c368020Ebo2.LIZ.getScrollY();
                    if (scrollY < 0) {
                        i2 = scrollY;
                    } else {
                        int i4 = paddingTop2 + c368020Ebo2.LJIIJJI + c368020Ebo2.LJIIL;
                        C368630Ecn c368630Ecn = c368020Ebo2.LIZ;
                        if (c368630Ecn.LLJZIJLIL) {
                            paddingTop = c368630Ecn.getPaddingTop();
                            i = c368020Ebo2.LJIIJJI + c368020Ebo2.LJIIL;
                        } else {
                            paddingTop = c368630Ecn.getPaddingTop();
                            i = (c368020Ebo2.LJIIJJI + c368020Ebo2.LJIIL) * 2;
                        }
                        int scrollY2 = (i4 - (paddingTop + i)) - c368020Ebo2.LIZ.getScrollY();
                        if (scrollY2 > 0) {
                            i2 = scrollY2;
                        }
                    }
                    c368020Ebo2.LIZ.LJIILL(i2);
                    c368020Ebo2.LJJIJL.start();
                }
            }
        } else {
            C368000Ebm c368000Ebm2 = this.LL.LLJJJIL;
            if (c368000Ebm2 != null && (multiTrackAdapter = c368000Ebm2.getMultiTrackAdapter()) != null && (c368020Ebo = multiTrackAdapter.LJJIFFI) != null) {
                c368020Ebo.LJJJ = false;
                c368020Ebo.LJJIJL.cancel();
                c368020Ebo.LIZ.LIZLLL(false);
                c368020Ebo.LIZ.setOnlyOne$editor_trackpanel_release(false);
            }
        }
        return Unit.LIZ;
    }
}
