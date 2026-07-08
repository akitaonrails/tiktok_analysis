package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkMicState;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bDI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C964780bDI extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C964760bDG LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C964780bDI(C964760bDG c964760bDG) {
        super(0);
        this.LL = c964760bDG;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        RtcUserInfo rtcUserInfoG0 = this.LL.LIZLLL.G0();
        if (rtcUserInfoG0 != null) {
            boolean zLIZJ = this.LL.LIZLLL.LJIILIIL() ? C954950axR.LIZJ(this.LL.LIZLLL.LJJIIJ().LIZ) : LinkMicState.Companion.isFrameLinked(this.LL.LIZLLL.LLJLLIL());
            C1AZW c1azw = C1AZW.LIZ;
            String idStr = this.LL.LIZIZ.getIdStr();
            if (idStr == null) {
                idStr = "";
            }
            String str = rtcUserInfoG0.linkMicId;
            String strU3 = this.LL.LIZLLL.U3();
            String str2 = rtcUserInfoG0.isOwner() ? "anchor" : !zLIZJ ? "audience" : "guest";
            int i = this.LL.LIZ;
            String str3 = i != 0 ? i != 2 ? i != 4 ? "" : "multi_guest" : "multi_host" : "union";
            c1azw.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("channelId:");
            sbLIZ.append(strU3);
            sbLIZ.append(", linkMicId:");
            sbLIZ.append(str);
            sbLIZ.append(", roomId:");
            sbLIZ.append(idStr);
            sbLIZ.append(", role:");
            sbLIZ.append(str2);
            sbLIZ.append(", scene:");
            sbLIZ.append(str3);
            sbLIZ.append(", rustSdkVersion = ");
            sbLIZ.append("");
            C20441214yg.LIZIZ("LinkMicALoggerImpl", C2188811AlT.LIZIZ(sbLIZ));
            C1AZW.LJI = strU3;
            C1AZW.LJFF = str;
            C1AZW.LJ = idStr;
            C1AZW.LJII = str2;
            C1AZW.LJIIIIZZ = str3;
            C1AZW.LJIIJ = "";
            C1AZW.LJIIIZ = Intrinsics.LJFF(str2, "anchor");
            String str4 = this.LL.LJI;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("updateLinkMicALoggerContext scene=");
            sbLIZ2.append(this.LL.LIZ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            c1azw.getClass();
            C1AZW.LIZ(str4, strLIZIZ, null, null);
        }
        return Unit.LIZ;
    }
}
