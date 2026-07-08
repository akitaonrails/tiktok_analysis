package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.livesdk.entity.PlayRule;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS147S0110000_31;
import kotlin.jvm.internal.AwS168S0101000_31;
import kotlin.jvm.internal.AwS49S0200100_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookContent;

/* JADX INFO: renamed from: X.14oK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20377014oK {
    public static final /* synthetic */ int LJIIJJI = 0;
    public final Function0<Boolean> LIZ;
    public final InterfaceC20377114oL LIZIZ;
    public C20425514w9 LIZJ;
    public final C20359714lX LIZLLL;
    public HashMap<Long, PlayRule> LJ;
    public final C20379114of LJFF;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;

    public final void LIZIZ() {
        C20441214yg.LJIIIZ("PlaybookDetailHandlerV2", "onDestroy");
        C20359714lX c20359714lX = this.LIZLLL;
        c20359714lX.LJIIIIZZ();
        c20359714lX.LJI();
        c20359714lX.LIZ.zQ2(c20359714lX);
        Iterator<T> it2 = this.LJ.values().iterator();
        while (it2.hasNext()) {
            ((PlayRule) it2.next()).destroy();
        }
        this.LJ.clear();
        this.LIZIZ.LJFF(this);
    }

    public final String toString() {
        return this.LJFF.toString();
    }

    public final void LIZ(boolean z) {
        C20379114of c20379114of = this.LJFF;
        Playbook playbook = c20379114of.LIZ;
        C20360614lg c20360614lg = c20379114of.LIZIZ;
        if (playbook != null && c20360614lg != null && this.LJIIIZ) {
            C20359714lX c20359714lX = this.LIZLLL;
            c20359714lX.LJIILIIL = c20379114of;
            c20359714lX.LJIILL = playbook;
            c20359714lX.LJIILJJIL = c20360614lg;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("callBackPlaybookDetailListener, playbookDetail=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", flowStrChange=");
        sbLIZ.append(z);
        sbLIZ.append(", isShowingDetail=");
        sbLIZ.append(this.LJI);
        C20441214yg.LJIIIZ("PlaybookDetailHandlerV2", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZIZ.LIZLLL(this.LJFF, z, this.LJI);
    }

    public final void LIZLLL(boolean z) {
        boolean z2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isDecorationPlaybook, value=");
        sbLIZ.append(z);
        C20441214yg.LJIIIZ("PlaybookDetailHandlerV2", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LJIIJ != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LJIIJ = z;
        if (z2) {
            if (z) {
                this.LIZIZ.LJ(this.LJFF);
            } else {
                this.LIZIZ.LIZJ();
                C403501hZ.LIZ(new AwS575S0100000_31(this, 1467));
            }
        }
    }

    public final void LIZJ(C20361314ln c20361314ln, long j) {
        if (PlaybookUtilKt.LJJIJIIJIL(this.LJFF, j, c20361314ln)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onUIConfigChange, success, uiConfig=");
            sbLIZ.append(c20361314ln);
            sbLIZ.append(", stateId=");
            sbLIZ.append(j);
            sbLIZ.append(", playbookDetail=");
            sbLIZ.append(this.LJFF);
            C20441214yg.LJIIIZ("PlaybookDetailHandlerV2", C2188811AlT.LIZIZ(sbLIZ));
            LIZ(false);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onUIConfigChange, fail, uiConfig=");
        sbLIZ2.append(c20361314ln);
        sbLIZ2.append(", stateId=");
        sbLIZ2.append(j);
        sbLIZ2.append(", playbookDetail=");
        sbLIZ2.append(this.LJFF);
        C20441214yg.LJIIIZ("PlaybookDetailHandlerV2", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final void LJFF(boolean z, boolean z2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setIsShowingDetail, isShowingDetail=");
        sbLIZ.append(z);
        C20441214yg.LJIIIZ("PlaybookDetailHandlerV2", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("isShowingDetail, value=");
        sbLIZ2.append(z);
        C20441214yg.LJIIIZ("PlaybookDetailHandlerV2", C2188811AlT.LIZIZ(sbLIZ2));
        this.LJI = z;
        if (!z) {
            C403501hZ.LIZ(new AwS147S0110000_31(this, z2, 2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(boolean r17, boolean r18, boolean r19) {
        /*
            r16 = this;
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "setIsRunningDetail, isRunningDetail="
            r1.append(r0)
            r3 = r17
            r1.append(r3)
            java.lang.String r0 = ", delayAutoRunFlag="
            r1.append(r0)
            r5 = r18
            r1.append(r5)
            java.lang.String r0 = ", isUserTriggered="
            r1.append(r0)
            r4 = r19
            r1.append(r4)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r2 = "PlaybookDetailHandlerV2"
            X.C20441214yg.LJIIIZ(r2, r0)
            r6 = r16
            r6.LJII = r5
            r6.LJIIIIZZ = r4
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "isRunningDetail, value="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C20441214yg.LJIIIZ(r2, r0)
            boolean r0 = r6.LJIIIZ
            r2 = 0
            if (r0 == r3) goto Lb9
            r0 = 1
        L4a:
            r6.LJIIIZ = r3
            if (r0 == 0) goto La0
            boolean r0 = X.C500260Jjc.LJJIL()
            if (r0 != 0) goto La0
            boolean r0 = com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreModelKt.currentUserIsAnchor()
            if (r0 == 0) goto La0
            X.14of r0 = r6.LJFF
            webcast.data.multi_guest_play.Playbook r7 = r0.LIZ
            X.14lg r8 = r0.LIZIZ
            if (r7 == 0) goto La0
            if (r8 == 0) goto La0
            if (r3 == 0) goto Lb3
            com.bytedance.android.livesdk.livesetting.linkmic.PlaybookAutoRunTypeSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.PlaybookAutoRunTypeSetting.INSTANCE
            boolean r0 = r0.enable()
            if (r0 == 0) goto La5
            X.14of r0 = r6.LJFF
            webcast.data.multi_guest_play.Playbook r0 = r0.LIZ
            int r0 = r0.automationUserSetting
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.14of r0 = r6.LJFF
            webcast.data.multi_guest_play.Playbook r0 = r0.LIZ
            webcast.data.multi_guest_play.PlaybookContent r0 = r0.content
            if (r0 == 0) goto La3
            boolean r0 = r0.supportAutomation
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L86:
            boolean r0 = X.C500260Jjc.LJJJI(r0)
            boolean r0 = com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt.LJIJJLI(r0, r1)
            if (r0 == 0) goto La5
            r9 = 1
            boolean r0 = r6.LJII
            if (r0 == 0) goto La6
            kotlin.jvm.internal.AwS61S0310000_31 r5 = new kotlin.jvm.internal.AwS61S0310000_31
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            r0 = 700(0x2bc, double:3.46E-321)
            X.C500260Jjc.LJJLIIIJJI(r0, r5)
        La0:
            r6.LJII = r2
            return
        La3:
            r0 = 0
            goto L86
        La5:
            r9 = 0
        La6:
            X.14lX r10 = r6.LIZLLL
            X.14of r11 = r6.LJFF
            boolean r15 = r6.LJIIIIZZ
            r12 = r7
            r13 = r8
            r14 = r9
            r10.LJIIL(r11, r12, r13, r14, r15)
            goto La0
        Lb3:
            X.14lX r0 = r6.LIZLLL
            r0.LJIIIIZZ()
            goto La0
        Lb9:
            r0 = 0
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20377014oK.LJ(boolean, boolean, boolean):void");
    }

    public C20377014oK(WeakReference weakReference, C20378314oX c20378314oX, DataChannel dataChannel, Playbook playbook, boolean z, InterfaceC20377114oL interfaceC20377114oL) {
        C20425514w9 c20425514w9;
        String str;
        this.LIZ = c20378314oX;
        this.LIZIZ = interfaceC20377114oL;
        InterfaceC20356214ky interfaceC20356214ky = new InterfaceC20356214ky() { // from class: X.14oJ
            @Override // X.InterfaceC20356214ky
            public final void LIZ(C20361314ln c20361314ln, long j) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onUpdate, uiConfig=");
                sbLIZ.append(c20361314ln);
                sbLIZ.append(", stateId=");
                sbLIZ.append(j);
                C20441214yg.LJIIIZ("PlaybookDetailHandlerV2", C2188811AlT.LIZIZ(sbLIZ));
                C20377014oK c20377014oK = this.LIZ;
                if (c20377014oK.LJFF == null) {
                    C403501hZ.LIZ(new AwS49S0200100_31(c20377014oK, c20361314ln, j, 1));
                } else {
                    c20377014oK.LIZJ(c20361314ln, j);
                }
            }
        };
        InterfaceC20354714kj interfaceC20354714kj = new InterfaceC20354714kj() { // from class: X.14oP
            @Override // X.InterfaceC20354714kj
            public final void LIZ() {
            }

            @Override // X.InterfaceC20354714kj
            public final void LIZJ(String str2, long j) {
            }

            @Override // X.InterfaceC20354714kj
            public final void LJ() {
            }

            @Override // X.InterfaceC20354714kj
            public final void LJFF(int i, long j) {
            }

            @Override // X.InterfaceC20354714kj
            public final void LJI(long j) {
            }

            @Override // X.InterfaceC20354714kj
            public final void LJII() {
            }

            @Override // X.InterfaceC20354714kj
            public final void LJIIIIZZ(int i, long j) {
            }

            @Override // X.InterfaceC20354714kj
            public final void LJIIJ() {
            }

            @Override // X.InterfaceC20354714kj
            public final void LIZIZ(long j, String str2, boolean z2) {
                C403501hZ.LIZ(new C20377614oQ(str2, j, this.LIZ));
            }
        };
        InterfaceC20360214lc interfaceC20360214lc = new InterfaceC20360214lc() { // from class: X.14oN
            @Override // X.InterfaceC20360214lc
            public final void onStateChange(int i) {
                C403501hZ.LIZ(new AwS168S0101000_31(i, this.LIZ, 1));
            }
        };
        InterfaceC20359614lW interfaceC20359614lW = new InterfaceC20359614lW() { // from class: X.14oO
            @Override // X.InterfaceC20359614lW
            public final void LIZ(int i, long j, List list) {
                C500260Jjc.LJJLIIIJILLIZJL(new C20377214oM(list, i, j, this.LIZ));
            }
        };
        InterfaceC20360014la interfaceC20360014la = new InterfaceC20360014la() { // from class: X.14ld
            @Override // X.InterfaceC20360014la
            public final void LJ() {
                C20441214yg.LJIIIZ("PlaybookDecoration", "detailHandler, onDecorationStepStart");
                this.LIZ.LIZLLL(true);
                this.LIZ.LIZ(false);
            }

            @Override // X.InterfaceC20360014la
            public final void LIZ(String str2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("detailHandler, onDecorationFail, failReason=");
                sbLIZ.append(str2);
                C20441214yg.LJIIIZ("PlaybookDecoration", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // X.InterfaceC20360014la
            public final void LIZIZ(C20359414lU c20359414lU) {
                C20441214yg.LJIIIZ("PlaybookDecoration", "detailHandler, onDecorationStepUndoStart");
                this.LIZ.LIZ(false);
            }

            @Override // X.InterfaceC20360014la
            public final void LIZLLL(C20359414lU c20359414lU) {
                C20441214yg.LJIIIZ("PlaybookDecoration", "detailHandler, onDecorationStepUndoFinish");
                this.LIZ.LIZ(false);
                this.LIZ.LIZLLL(false);
            }

            @Override // X.InterfaceC20360014la
            public final void LJFF(C20361214lm c20361214lm) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("detailHandler, onDecorationEntityStart, name=");
                sbLIZ.append(c20361214lm.LIZ);
                C20441214yg.LJIIIZ("PlaybookDecoration", C2188811AlT.LIZIZ(sbLIZ));
                this.LIZ.LIZ(false);
            }

            @Override // X.InterfaceC20360014la
            public final void LJI(C20359414lU c20359414lU) {
                C20441214yg.LJIIIZ("PlaybookDecoration", "detailHandler, onDecorationStepSuccess");
                this.LIZ.LIZ(false);
            }

            @Override // X.InterfaceC20360014la
            public final void LIZJ(C20361214lm c20361214lm, boolean z2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("detailHandler, onDecorationEntityFinish, name=");
                sbLIZ.append(c20361214lm.LIZ);
                sbLIZ.append(", isSuccess=");
                sbLIZ.append(z2);
                C20441214yg.LJIIIZ("PlaybookDecoration", C2188811AlT.LIZIZ(sbLIZ));
                this.LIZ.LIZ(false);
            }
        };
        this.LIZJ = new C20425514w9(c20378314oX);
        C20359714lX c20359714lX = new C20359714lX(weakReference, dataChannel, interfaceC20356214ky, interfaceC20354714kj, interfaceC20360214lc, interfaceC20359614lW, interfaceC20360014la, playbook);
        this.LIZLLL = c20359714lX;
        this.LJ = new HashMap<>();
        this.LJFF = PlaybookUtilKt.LJFF(playbook, c20359714lX, this.LIZJ, interfaceC20377114oL.LJI(PlaybookUtilKt.LIZIZ(playbook)), true, "detail");
        this.LJI = z;
        this.LJIIIIZZ = true;
        if (interfaceC20377114oL.LIZIZ() && (c20425514w9 = this.LIZJ) != null) {
            PlaybookContent playbookContent = playbook.content;
            c20425514w9.LJIILJJIL((playbookContent == null || (str = playbookContent.flowStr) == null) ? "" : str);
        }
        LIZ(false);
    }
}
