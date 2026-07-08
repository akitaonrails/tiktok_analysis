package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0kTw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1321060kTw {
    public static volatile boolean LIZ;
    public static boolean LIZIZ;

    public static final AbstractC1327750kej LIZLLL(C1323050kX9 c1323050kX9) {
        C1325860kbg.LIZLLL(C1323050kX9.LJIJJ(c1323050kX9), null, null, C2097608Jq.LJ());
        return (AbstractC1327750kej) c1323050kX9.get();
    }

    public static final void LJ(Runnable runnable) {
        if (C786410Ut5.u3().getName().equals("myna-image-request-thread")) {
            runnable.run();
        } else {
            C1168270gVV.LIZ.getClass();
            ((Executor) C1168270gVV.LJII.getValue()).execute(runnable);
        }
    }

    public static final C1323050kX9<AbstractC1327750kej> LIZJ(InterfaceC1325150kaX<InterfaceC1324680kZm, AbstractC1327750kej> interfaceC1325150kaX, InterfaceC1324680kZm interfaceC1324680kZm) {
        if (interfaceC1325150kaX == null) {
            return null;
        }
        C1323050kX9<AbstractC1327750kej> c1323050kX9 = interfaceC1325150kaX.get(interfaceC1324680kZm);
        if (c1323050kX9 != null && !((C1328060kfE) c1323050kX9.get().getQualityInfo()).LIZJ) {
            c1323050kX9.close();
            return null;
        }
        return c1323050kX9;
    }

    public static final Drawable LIZ(C1323050kX9<AbstractC1327750kej> c1323050kX9, InterfaceC1320130kSR interfaceC1320130kSR, Drawable drawable) {
        C1322350kW1.LJFF(C1323050kX9.LJIJJ(c1323050kX9));
        AbstractC1327750kej abstractC1327750kej = c1323050kX9.get();
        Drawable drawableLIZ = interfaceC1320130kSR.LIZ(abstractC1327750kej, drawable);
        if (drawableLIZ == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Unrecognized image class: ");
            sbLIZ.append(abstractC1327750kej);
            C1325860kbg.LIZIZ(new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ)), null, C2097608Jq.LJ());
            return null;
        }
        return drawableLIZ;
    }

    public static C1321070kTx LIZIZ(Context context, boolean z, Object obj, InterfaceC1321110kU1 interfaceC1321110kU1) {
        C1321070kTx c1321070kTx = new C1321070kTx(context);
        C1320310kSj c1320310kSj = InterfaceC1320380kSq.LIZJ;
        C1331070kk5 c1331070kk5LJFF = c1321070kTx.LJFF();
        if (c1331070kk5LJFF != null) {
            c1331070kk5LJFF.LJIIZILJ(c1320310kSj);
        }
        c1321070kTx.LLJ = obj;
        C1331070kk5 c1331070kk5LJFF2 = c1321070kTx.LJFF();
        if (c1331070kk5LJFF2 != null) {
            c1331070kk5LJFF2.LJIJI(0);
        }
        c1321070kTx.LLJJ = interfaceC1321110kU1;
        c1321070kTx.LLILLJJLI = z;
        return c1321070kTx;
    }
}
