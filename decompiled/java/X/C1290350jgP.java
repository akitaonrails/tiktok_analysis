package X;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.component.svg.UISvg;
import j27.s;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.0jgP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1290350jgP {
    public final WeakReference<UISvg> LIZ;
    public final s LIZIZ;
    public final HashMap<String, Bitmap> LIZJ = new HashMap<>();

    public void LIZ() {
        Iterator<Map.Entry<String, Bitmap>> it2 = this.LIZJ.entrySet().iterator();
        while (it2.hasNext()) {
            try {
                C786410Ut5.LJJJJ(it2.next().getValue());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        this.LIZJ.clear();
    }

    public C1290350jgP(s sVar) {
        this.LIZIZ = sVar;
    }

    public C1290350jgP(s sVar, UISvg uISvg) {
        this.LIZIZ = sVar;
        this.LIZ = new WeakReference<>(uISvg);
    }

    public final void LIZIZ(final String str, final InterfaceC1290370jgR interfaceC1290370jgR) {
        if (this.LIZJ.containsKey(str)) {
            LynxLog.d("UISVG", "requestBitmapSync got from bitmap cache ");
            interfaceC1290370jgR.LIZ(this.LIZJ.get(str));
            return;
        }
        C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(UriProtector.parse(C1294030jmL.LIZ(this.LIZIZ, str, false)));
        C1315790kLR.LIZ(c1325700kbQLIZLLL);
        final InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSYLJI = C1322200kVm.LIZ().LJI(c1325700kbQLIZLLL.LIZ(), "lynx_SvgResourceManager");
        ((AbstractC1321260kUG) interfaceC1320200kSYLJI).LIZJ(new AbstractC447090Hg3() { // from class: X.0jgQ
            @Override // X.C0HWE
            public final void LJ(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
                interfaceC1290370jgR.onFailed();
                if (interfaceC1320200kSY != null) {
                    interfaceC1320200kSY.close();
                }
            }

            @Override // X.AbstractC447090Hg3
            public final void LJI(Bitmap bitmap) {
                UISvg uISvg;
                if (interfaceC1320200kSYLJI.LIZ() && bitmap != null) {
                    LynxLog.d("UISVG Bitmap", "has come");
                    this.LIZLLL.LIZJ.put(str, Bitmap.createBitmap(bitmap));
                    interfaceC1320200kSYLJI.close();
                    WeakReference<UISvg> weakReference = this.LIZLLL.LIZ;
                    if (weakReference != null && (uISvg = weakReference.get()) != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("fetch bitmap the image url is :");
                        sbLIZ.append(str);
                        sbLIZ.append(" ui-svg hashCode:");
                        sbLIZ.append(uISvg.hashCode());
                        LynxLog.i("lynx_UISvg", C2188811AlT.LIZIZ(sbLIZ));
                        uISvg.LJJIIZI();
                    }
                }
            }
        }, C822690WPb.LIZ());
    }

    public final void LIZJ(final String str, final InterfaceC1290410jgV interfaceC1290410jgV) {
        if (TextUtils.isEmpty(str)) {
            interfaceC1290410jgV.onError("src is empty!");
            return;
        }
        s sVar = this.LIZIZ;
        if (sVar.LLL != null) {
            interfaceC1290410jgV.onStart();
            this.LIZIZ.LLL.LIZIZ(new C1301600jyY(str, EnumC1299880jvm.LynxResourceTypeSVG), new InterfaceC1290540jgi<byte[]>() { // from class: X.0jgU
                @Override // X.InterfaceC1290540jgi
                public final void LIZ(C1289590jfB<byte[]> c1289590jfB) {
                    String strLIZIZ;
                    if (c1289590jfB.LIZ == EnumC1288980jeC.SUCCESS) {
                        byte[] bArr = c1289590jfB.LIZIZ;
                        if (bArr == null) {
                            interfaceC1290410jgV.onError("data is empty!");
                            return;
                        }
                        String str2 = new String(bArr, StandardCharsets.UTF_8);
                        try {
                            C2257191DWj c2257191DWjLIZJ = C2257191DWj.LIZJ(str2);
                            InterfaceC1290380jgS interfaceC1290380jgS = interfaceC1290410jgV;
                            if (interfaceC1290380jgS instanceof InterfaceC1290410jgV) {
                                ((InterfaceC1290410jgV) interfaceC1290380jgS).LIZ(str2, c2257191DWjLIZJ);
                                return;
                            } else {
                                interfaceC1290380jgS.onSuccess();
                                return;
                            }
                        } catch (C1324260kZ6 e) {
                            TryCatchGuardChecker.doCheck(e);
                            interfaceC1290410jgV.onError(e.toString());
                            return;
                        }
                    }
                    InterfaceC1290380jgS interfaceC1290380jgS2 = interfaceC1290410jgV;
                    Throwable th = c1289590jfB.LIZJ;
                    if (th != null) {
                        strLIZIZ = th.toString();
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("svg fetch src failed! ");
                        sbLIZ.append(str);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    }
                    interfaceC1290380jgS2.onError(strLIZIZ);
                }
            });
            return;
        }
        String strLIZ = C1294030jmL.LIZ(sVar, str, false);
        if (TextUtils.isEmpty(strLIZ)) {
            interfaceC1290410jgV.onError("url is empty!");
        } else {
            if (TextUtils.isEmpty(UriProtector.parse(strLIZ).getScheme())) {
                interfaceC1290410jgV.onError("scheme is Empty!");
                return;
            }
            interfaceC1290410jgV.onStart();
            C846680XJi.LIZ().LIZIZ(new C1288950je9(strLIZ, this.LIZIZ.LLJLLL), new InterfaceC846700XJk() { // from class: X.0jgT
                @Override // X.InterfaceC846700XJk
                public final void LIZ(C846690XJj c846690XJj) {
                    String strLIZ2;
                    try {
                        strLIZ2 = C2106308Mz.LIZ(c846690XJj.LIZJ);
                    } catch (C1324260kZ6 e) {
                        TryCatchGuardChecker.doCheck(e);
                        c846690XJj.LIZIZ = e.toString();
                        LynxLog.DTHROW(new RuntimeException(e));
                    }
                    if (TextUtils.isEmpty(strLIZ2)) {
                        c846690XJj.LIZIZ = "data is empty!";
                        interfaceC1290410jgV.onError(c846690XJj.LIZIZ);
                        return;
                    }
                    C2257191DWj c2257191DWjLIZJ = C2257191DWj.LIZJ(strLIZ2);
                    InterfaceC1290380jgS interfaceC1290380jgS = interfaceC1290410jgV;
                    if (interfaceC1290380jgS instanceof InterfaceC1290410jgV) {
                        ((InterfaceC1290410jgV) interfaceC1290380jgS).LIZ(strLIZ2, c2257191DWjLIZJ);
                    } else {
                        interfaceC1290380jgS.onSuccess();
                    }
                }

                @Override // X.InterfaceC846700XJk
                public final void LIZIZ(C846690XJj c846690XJj) {
                    interfaceC1290410jgV.onError(c846690XJj.LIZIZ);
                }
            });
        }
    }
}
