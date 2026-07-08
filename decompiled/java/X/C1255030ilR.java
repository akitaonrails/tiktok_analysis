package X;

import Y.ARunnableS13S1200000_8;
import android.app.Activity;
import android.os.Message;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS103S0201000_19;
import kotlin.jvm.internal.AwS46S0301000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ilR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1255030ilR implements InterfaceC1254900ilE, WeakHandler.IHandler, C0OO0 {
    public C1255650imR LL;
    public InterfaceC1255040ilS LLILLJJLI;
    public int LLILLL;
    public String LLILZ;
    public List<C2259691DcV> LLILZIL;
    public InterfaceC1255580imK LLILZLL;

    @Override // X.InterfaceC1254900ilE
    public final void LIZ() {
        this.LLILLL = 0;
    }

    @Override // X.C0OO0
    public final void LIZJ() {
        C1255650imR c1255650imR = this.LL;
        if (c1255650imR != null) {
            c1255650imR.LJIILJJIL(2);
        }
    }

    @Override // X.C0OO0
    public final void LIZLLL() {
        C1255650imR c1255650imR = this.LL;
        if (c1255650imR != null) {
            c1255650imR.getClass();
        }
    }

    public C1255030ilR() {
        new WeakHandler(this);
    }

    @Override // X.InterfaceC1254900ilE
    public final void LIZIZ(String str) {
        this.LLILZ = str;
        InterfaceC1255040ilS interfaceC1255040ilS = this.LLILLJJLI;
        if (interfaceC1255040ilS != null) {
            interfaceC1255040ilS.dN2(str);
        }
    }

    @Override // X.C0OO0
    public final void LJFF(InterfaceC1255040ilS interfaceC1255040ilS) {
        this.LLILLJJLI = interfaceC1255040ilS;
    }

    public final void LJII(int i) {
        if (i != -1) {
            ArrayList arrayList = new ArrayList();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(i);
            sbLIZ.append("");
            arrayList.add(new C2259691DcV("source", C2188811AlT.LIZIZ(sbLIZ)));
            String str = this.LLILZ;
            this.LLILZ = str;
            this.LLILZIL = arrayList;
            C1255650imR c1255650imR = this.LL;
            if (c1255650imR != null) {
                InterfaceC1254900ilE interfaceC1254900ilE = c1255650imR.LIZLLL;
                if (interfaceC1254900ilE != null) {
                    interfaceC1254900ilE.LIZ();
                }
                C810560Vqw.LIZLLL(new ARunnableS13S1200000_8(c1255650imR, str, arrayList, 2), 0);
                return;
            }
            return;
        }
        String str2 = this.LLILZ;
        this.LLILZ = str2;
        this.LLILZIL = null;
        C1255650imR c1255650imR2 = this.LL;
        if (c1255650imR2 == null) {
            return;
        }
        InterfaceC1254900ilE interfaceC1254900ilE2 = c1255650imR2.LIZLLL;
        if (interfaceC1254900ilE2 != null) {
            interfaceC1254900ilE2.LIZ();
        }
        C810560Vqw.LIZLLL(new ARunnableS13S1200000_8(c1255650imR2, str2, null, 2), 0);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        String message2;
        String strLIZIZ;
        String message3;
        if (this.LLILLJJLI != null) {
            if (HandlerHook.getMessageObj(message.obj) instanceof Exception) {
                HandlerHook.getMessageObj(message.obj);
                Exception exc = (Exception) HandlerHook.getMessageObj(message.obj);
                if (this.LL != null) {
                    int i = this.LLILLL;
                    if (!(exc instanceof C0XIR) && !(exc instanceof FileNotFoundException) && !(exc instanceof NullPointerException) && i <= 3) {
                        if (exc.getMessage() == null) {
                            message3 = "";
                        } else {
                            message3 = exc.getMessage();
                        }
                        if (!message3.contains("Content-Length") && (!message3.contains("expected") || !message3.contains("received"))) {
                            int i2 = this.LLILLL + 1;
                            this.LLILLL = i2;
                            C1255650imR c1255650imR = this.LL;
                            int i3 = (i2 << 1) * LSPassThroughRecordSizeConfig.DEFAULT;
                            String str = this.LLILZ;
                            List<C2259691DcV> list = this.LLILZIL;
                            c1255650imR.getClass();
                            C810560Vqw.LIZLLL(new ARunnableS13S1200000_8(c1255650imR, str, list, 2), i3);
                            return;
                        }
                    }
                }
                C2241008qG c2241008qG = new C2241008qG();
                boolean z = exc instanceof C0XIR;
                if (z) {
                    message2 = ((C0XIR) exc).getErrorMsg();
                } else {
                    message2 = exc.getMessage();
                }
                c2241008qG.LIZ.put("errorDesc", message2);
                if (z) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(((C23112093u) exc).getErrorCode());
                    sbLIZ.append("");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    strLIZIZ = "-1";
                }
                c2241008qG.LIZ.put("errorCode", strLIZIZ);
                c2241008qG.LIZ.put("imageUrl", this.LLILZ);
                JSONObject jSONObjectLJ = c2241008qG.LJ();
                CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
                C793770VBv.LJIIJJI("aweme_avartar_upload_error_rate", 1, jSONObjectLJ);
                InterfaceC1255580imK interfaceC1255580imK = this.LLILZLL;
                if (interfaceC1255580imK != null) {
                    interfaceC1255580imK.LJI(exc);
                }
                C2344809Gs.LJI((Throwable) HandlerHook.getMessageObj(message.obj));
                this.LLILLJJLI.hO((Exception) HandlerHook.getMessageObj(message.obj));
                return;
            }
            if (!(HandlerHook.getMessageObj(message.obj) instanceof AvatarUri)) {
                return;
            }
            this.LLILLJJLI.Eb0((AvatarUri) HandlerHook.getMessageObj(message.obj));
            CopyOnWriteArrayList<Runnable> copyOnWriteArrayList2 = C794240VDq.LIZ;
            C793770VBv.LJIIJJI("aweme_avartar_upload_error_rate", 0, null);
            InterfaceC1255580imK interfaceC1255580imK2 = this.LLILZLL;
            if (interfaceC1255580imK2 == null) {
                return;
            }
            interfaceC1255580imK2.LJFF();
        }
    }

    @Override // X.C0OO0
    public final void LJ(int i, Activity activity, String str) {
        String str2 = str;
        C1255650imR c1255650imR = this.LL;
        if (c1255650imR == null) {
            return;
        }
        String[] strArrLIZIZ = C1244120iTq.LIZIZ(c1255650imR.LJI, 0, 5);
        HashMap map = new HashMap();
        String str3 = "";
        if (C123100dR.LIZ(str2)) {
            if (str2 == null) {
                str2 = "";
            }
            map.put("btn_name", str2);
        }
        C1247510iZJ[] c1247510iZJArr = new C1247510iZJ[2];
        C1247510iZJ c1247510iZJ = new C1247510iZJ();
        String str4 = (String) C1244120iTq.LIZ(0, strArrLIZIZ);
        if (str4 == null) {
            str4 = "";
        }
        c1247510iZJ.LIZ = str4;
        c1247510iZJ.LIZ(new AwS46S0301000_19(i, activity, c1255650imR, map, 2));
        c1247510iZJArr[0] = c1247510iZJ;
        C1247510iZJ c1247510iZJ2 = new C1247510iZJ();
        String str5 = (String) C1244120iTq.LIZ(1, strArrLIZIZ);
        if (str5 != null) {
            str3 = str5;
        }
        c1247510iZJ2.LIZ = str3;
        c1247510iZJ2.LIZ(new AwS103S0201000_19(i, c1255650imR, map, 3));
        c1247510iZJArr[1] = c1247510iZJ2;
        List listLJIILJJIL = C1697810uHb.LJIILJJIL(c1247510iZJArr);
        if (C1067920dte.LIZ() && i != 10 && i != 11 && activity != null) {
            C1247510iZJ c1247510iZJ3 = new C1247510iZJ();
            c1247510iZJ3.LIZLLL = true;
            c1247510iZJ3.LIZIZ(2131820642);
            c1247510iZJ3.LIZ(new AwS598S0100000_19(activity, 606));
            ListProtector.add(listLJIILJJIL, 0, c1247510iZJ3);
            C1221880hty.LJFF("show");
        }
        C1390850mIV c1390850mIV = new C1390850mIV();
        c1390850mIV.LIZ.LL = new DialogInterfaceOnCancelListenerC1265930j31(c1255650imR, 3);
        c1390850mIV.LJI(listLJIILJJIL);
        TuxActionSheet tuxActionSheetLIZJ = c1390850mIV.LIZJ();
        C1391850mK7.LIZIZ(tuxActionSheetLIZJ, "take_upload_photo_nscreen");
        Fragment fragment = c1255650imR.LIZIZ;
        if (fragment != null && fragment.isAdded()) {
            tuxActionSheetLIZJ.show(c1255650imR.LIZIZ.getParentFragmentManager(), "Click profile Avatar Image");
            return;
        }
        Activity activity2 = c1255650imR.LIZ;
        if (!(activity2 instanceof C19EG)) {
            return;
        }
        tuxActionSheetLIZJ.show(((C19EG) activity2).getSupportFragmentManager(), "Click profile Avatar Image");
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0205, code lost:
    
        if (r3 != false) goto L90;
     */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0209  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.C0OO0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onActivityResult(int r23, int r24, android.content.Intent r25) {
        /*
            Method dump skipped, instruction units count: 567
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1255030ilR.onActivityResult(int, int, android.content.Intent):boolean");
    }

    @Override // X.C0OO0
    public final void LJI(Activity activity, Fragment fragment, int i, HashMap<String, String> map) {
        this.LLILZLL = C1254910ilF.LIZ(Integer.valueOf(i), map);
        this.LL = new C1255650imR(activity, fragment, new WeakHandler(this), this, i, this.LLILZLL);
    }
}
