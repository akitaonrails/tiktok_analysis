package com.bytedance.android.live.liveinteract.multilive.guset.util;

import X.C473410IhP;
import X.C925990aCj;
import X.C926050aCp;
import X.C926090aCt;
import X.C926160aD0;
import X.InterfaceC925800aCQ;
import X.InterfaceC948500an2;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@InterfaceC948500an2(name = "DATA_MULTI_GUEST_ENTER_INTENT_HANDLER")
public final class MultiGuestEnterIntentHandlerV2 implements InterfaceC925800aCQ {
    public final DataChannel LIZ;
    public final Room LIZIZ;
    public final EnterRoomConfig LIZJ;
    public final LifecycleOwner LIZLLL;
    public final C926090aCt LJ;
    public final C926160aD0 LJFF;
    public final C925990aCj LJI;

    @Override // X.InterfaceC925800aCQ
    public final void LIZ() {
        Runnable runnable = this.LJFF.LIZ;
        if (runnable != null) {
            C473410IhP.LIZ().removeCallbacks(runnable);
        }
        this.LJFF.LIZ = null;
    }

    @Override // X.InterfaceC925800aCQ
    public final String LIZIZ() {
        int i;
        C926090aCt c926090aCt = this.LJ;
        if (c926090aCt.LJIIIIZZ == 2 && ((i = c926090aCt.LJI) == 3 || i == 4)) {
            c926090aCt.LJIIIIZZ = 0;
            return "invited_by_guest";
        }
        int i2 = c926090aCt.LJI;
        if (i2 != 3 && i2 != 2) {
            return "";
        }
        c926090aCt.LJI = 0;
        c926090aCt.LJIIIIZZ = 0;
        return "outside_liveroom";
    }

    @Override // X.InterfaceC925800aCQ
    public final int LIZJ() {
        C926090aCt c926090aCt = this.LJ;
        String str = c926090aCt.LJFF;
        c926090aCt.LJFF = "";
        int iHashCode = str.hashCode();
        return iHashCode != -1697667698 ? iHashCode != -1595775075 ? (iHashCode == 619566230 && str.equals("multi_guest_invite")) ? 1 : 0 : str.equals("multi_guest_invite_by_empty_mask") ? 3 : 0 : str.equals("multi_guest_invite_by_capsule") ? 2 : 0;
    }

    @Override // X.InterfaceC925800aCQ
    public final int LIZLLL() {
        C926090aCt c926090aCt = this.LJ;
        int i = Intrinsics.LJFF(c926090aCt.LJ, "deeplink_share_source") ? 2 : Intrinsics.LJFF(c926090aCt.LJ, "private_message_share_source") ? 1 : 0;
        c926090aCt.LJ = "";
        return i;
    }

    @Override // X.InterfaceC925800aCQ
    public final C926050aCp LJ() {
        return this.LJ.LIZLLL;
    }

    @Override // X.InterfaceC925800aCQ
    public final String LJFF() {
        this.LJ.getClass();
        return "room";
    }

    /* JADX WARN: Can't wrap try/catch for region: R(38:9|(1:105)(1:13)|14|(1:16)|(1:22)|(1:28)|(1:34)|(1:40)|(1:104)(1:44)|45|(1:103)(1:49)|50|(1:(1:102)(1:101))(2:54|(1:56)(0))|57|(1:63)|64|(1:70)|71|(2:73|(3:96|80|(1:82))(4:77|(1:79)(2:93|(1:95)(0))|80|(0)))(1:97)|(16:90|(0)(1:106)|256|107|110|(1:209)(1:114)|115|SW:116|118|(4:120|(1:122)(1:193)|123|(1:125))(0)|126|(2:128|(2:130|(1:132)(1:190))(1:191))(1:192)|133|(1:136)|(1:138)|(2:210|(2:212|(9:214|(3:218|219|(2:221|222)(2:229|230))|231|(1:252)(8:239|(1:243)|244|(1:246)|247|(1:249)|250|251)|253|247|(0)|250|251)(8:223|(3:225|219|(0)(0))|231|(3:233|252|253)(0)|247|(0)|250|251))(8:226|(3:228|219|(0)(0))|231|(0)(0)|247|(0)|250|251))(10:142|(1:144)|145|(1:147)(1:189)|148|SW:149|151|(1:153)|154|155))(1:86)|87|(1:89)(0)|256|107|110|(2:112|209)(0)|115|SW:116|118|(0)(0)|126|(0)(0)|133|(1:136)(0)|(0)|(1:140)|210|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0143, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0144, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r14);
        r1 = X.C2188811AlT.LIZ();
        r1.append("buildMgEnterParamsJson fail: ");
        r1.append(r14);
        X.C20441214yg.LIZIZ("MGEnterRouteDataSource", X.C2188811AlT.LIZIZ(r1));
        r19 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0131 A[PHI: r15
      0x0131: PHI (r15v1 int) = (r15v0 int), (r15v4 int) binds: [B:91:0x0109, B:88:0x0103] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0119  */
    /* JADX WARN: Type inference failed for: r0v153, types: [X.0aCj] */
    /* JADX WARN: Type inference failed for: r3v12, types: [X.0aCn] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v8, types: [X.0aCn, X.0aD2] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC925800aCQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI() {
        /*
            Method dump skipped, instruction units count: 1414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multilive.guset.util.MultiGuestEnterIntentHandlerV2.LJI():void");
    }

    @Override // X.InterfaceC925800aCQ
    public final String LJII() {
        C926090aCt c926090aCt = this.LJ;
        if (c926090aCt.LJII != 3) {
            return "";
        }
        c926090aCt.LJII = 0;
        return "outside_liveroom";
    }

    @Override // X.InterfaceC925800aCQ
    public final void clear() {
        C926090aCt c926090aCt = this.LJ;
        c926090aCt.LJI = 0;
        c926090aCt.LJII = 0;
        c926090aCt.LIZLLL = null;
    }

    public MultiGuestEnterIntentHandlerV2(LifecycleOwner lifecycleOwner, Room room, EnterRoomConfig enterRoomConfig, DataChannel dataChannel) {
        this.LIZ = dataChannel;
        this.LIZIZ = room;
        this.LIZJ = enterRoomConfig;
        this.LIZLLL = lifecycleOwner;
        this.LJ = new C926090aCt(lifecycleOwner, room, enterRoomConfig);
        C926160aD0 c926160aD0 = new C926160aD0();
        this.LJFF = c926160aD0;
        this.LJI = new C925990aCj(dataChannel, room, c926160aD0);
    }
}
