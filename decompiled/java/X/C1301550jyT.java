package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import java.util.Map;
import java.util.Objects;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0jyT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1301550jyT extends AbstractC1301300jy4 {
    public final InterfaceC2220701Bvo LIZ;
    public final InterfaceC1304870k3p LIZIZ;

    public static byte[] LJII(String str) {
        int iLJJJ = a0.LJJJ(str, "base64,", 0, false, 6);
        if (iLJJJ == -1) {
            return null;
        }
        try {
            System.currentTimeMillis();
            byte[] bArrDecode = Base64.decode(str.substring(iLJJJ + 7), 0);
            System.currentTimeMillis();
            return bArrDecode;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            e.toString();
            return null;
        }
    }

    public static void LJIIIIZZ(String str) {
        if (str != null && str.length() > 200) {
            str.substring(0, 200);
        }
    }

    @Override // X.AbstractC1301300jy4
    public final byte[] LIZIZ(String str) {
        boolean z;
        Object obj;
        Object obj2;
        boolean z2 = true;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        if (u.LJJIIJZLJL(str, "data:", false)) {
            return LJII(str);
        }
        if (Regex.find$default(new Regex("^[a-zA-Z]+://"), str, 0, 2, null) == null) {
            z2 = false;
        }
        if (z2) {
            try {
                C2220231Bv3 c2220231Bv3 = this.LIZ.LJJJZ(0, -1, str, "binary").LIZIZ;
                if (c2220231Bv3.LIZ) {
                    Map<String, Object> map = c2220231Bv3.LIZLLL;
                    if (map != null) {
                        obj = map.get("data");
                    } else {
                        obj = null;
                    }
                    if (!(obj instanceof byte[])) {
                        return null;
                    }
                    return (byte[]) obj;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                e.toString();
            }
            return null;
        }
        try {
            C2220231Bv3 c2220231Bv32 = this.LIZ.LJJJZ(0, -1, str, "binary").LIZIZ;
            if (c2220231Bv32.LIZ) {
                Map<String, Object> map2 = c2220231Bv32.LIZLLL;
                if (map2 != null) {
                    obj2 = map2.get("data");
                } else {
                    obj2 = null;
                }
                if (!(obj2 instanceof byte[])) {
                    return null;
                }
                return (byte[]) obj2;
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            e2.toString();
        }
        return null;
    }

    @Override // X.AbstractC1301300jy4
    public final String LJI(String str) {
        Object obj;
        String str2;
        if (str != null && str.length() != 0) {
            if (u.LJJIIJZLJL(str, "data:", false)) {
                return str;
            }
            if (!u.LJJIIJZLJL(str, "http://", false) && !u.LJJIIJZLJL(str, "https://", false)) {
                C2220221Bv2 c2220221Bv2LJJLIIIIJ = this.LIZ.LJJLIIIIJ(str);
                C2220231Bv3 c2220231Bv3 = c2220221Bv2LJJLIIIIJ.LIZIZ;
                if (c2220231Bv3.LIZ) {
                    Map<String, Object> map = c2220231Bv3.LIZLLL;
                    if (map == null || (obj = map.get("data")) == null) {
                        Map<String, Object> map2 = c2220221Bv2LJJLIIIIJ.LIZIZ.LIZLLL;
                        if (map2 != null) {
                            obj = map2.get("url");
                        } else {
                            obj = null;
                        }
                    }
                    if ((obj instanceof String) && (str2 = (String) obj) != null && str2.length() != 0) {
                        return str2;
                    }
                }
                return str;
            }
            return UriProtector.parse(str).toString();
        }
        return "";
    }

    public C1301550jyT(InterfaceC2220701Bvo interfaceC2220701Bvo, C1524360plq c1524360plq) {
        this.LIZ = interfaceC2220701Bvo;
        this.LIZIZ = c1524360plq;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0jyU] */
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
    @Override // X.AbstractC1301300jy4
    public final void LIZJ(String str, final InterfaceC1301360jyA interfaceC1301360jyA) {
        byte[] bArr;
        if (str == null) {
            interfaceC1301360jyA.reject("url empty");
            return;
        }
        LJIIIIZZ(str);
        if (u.LJJIIJZLJL(str, "data:", false)) {
            byte[] bArrLJII = LJII(str);
            if (bArrLJII != null) {
                interfaceC1301360jyA.LIZ(bArrLJII, bArrLJII.length);
                return;
            } else {
                interfaceC1301360jyA.reject("data url decode null");
                return;
            }
        }
        if (!u.LJJIIJZLJL(str, "http://", false) && !u.LJJIIJZLJL(str, "https://", false)) {
            C2220231Bv3 c2220231Bv3 = this.LIZ.LJJJZ(0, -1, str, "binary").LIZIZ;
            if (!c2220231Bv3.LIZ) {
                interfaceC1301360jyA.reject("load failure");
                return;
            }
            Map<String, Object> map = c2220231Bv3.LIZLLL;
            Object obj = null;
            if (map != null) {
                obj = map.get("data");
            }
            if ((obj instanceof byte[]) && (bArr = (byte[]) obj) != null && bArr.length != 0) {
                interfaceC1301360jyA.LIZ(bArr, bArr.length);
                return;
            } else {
                interfaceC1301360jyA.reject("empty data");
                return;
            }
        }
        this.LIZIZ.LJJLIL(str, new InterfaceC1304860k3o() { // from class: X.0jyU
            @Override // X.InterfaceC1304860k3o
            public final void LIZIZ() {
                interfaceC1301360jyA.reject("load failure");
            }

            @Override // X.InterfaceC1304860k3o
            public final void LIZ(C1524380pls c1524380pls) {
                if (c1524380pls.LIZ) {
                    C1524430plx c1524430plx = c1524380pls.LIZLLL;
                    byte[] bArrLIZ = null;
                    if (c1524430plx != null) {
                        bArrLIZ = c1524430plx.LIZ();
                    }
                    if ((bArrLIZ instanceof byte[]) && bArrLIZ != null && bArrLIZ.length != 0) {
                        interfaceC1301360jyA.LIZ(bArrLIZ, bArrLIZ.length);
                        return;
                    } else {
                        interfaceC1301360jyA.reject("empty data");
                        return;
                    }
                }
                interfaceC1301360jyA.reject("load failure");
            }
        });
    }

    @Override // X.AbstractC1301300jy4
    public final void LJ(final String str, final InterfaceC1301370jyB interfaceC1301370jyB) {
        if (str == null) {
            interfaceC1301370jyB.reject("url empty");
        } else {
            LIZJ(str, new InterfaceC1301360jyA() { // from class: X.0jyS
                @Override // X.InterfaceC1301360jyA
                public final void reject(String str2) {
                    interfaceC1301370jyB.reject(str2);
                }

                @Override // X.InterfaceC1301360jyA
                public final void LIZ(byte[] bArr, int i) {
                    boolean z = false;
                    Bitmap bitmapDecodeByteArray = null;
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options.inPremultiplied = false;
                        bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                        Objects.toString(bitmapDecodeByteArray.getConfig());
                        bitmapDecodeByteArray.getWidth();
                        bitmapDecodeByteArray.getHeight();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        e.toString();
                        if (bitmapDecodeByteArray == null) {
                            C1301550jyT c1301550jyT = this.LIZ;
                            String str2 = str;
                            c1301550jyT.getClass();
                            C1301550jyT.LJIIIIZZ(str2);
                            interfaceC1301370jyB.reject("Empty bitmap !!!");
                            return;
                        }
                    }
                    C1301550jyT c1301550jyT2 = this.LIZ;
                    String str3 = str;
                    c1301550jyT2.getClass();
                    C1301550jyT.LJIIIIZZ(str3);
                    int width = bitmapDecodeByteArray.getWidth() * 4 * bitmapDecodeByteArray.getHeight();
                    if (width != bitmapDecodeByteArray.getByteCount()) {
                        Bitmap bitmapCopy = bitmapDecodeByteArray.copy(Bitmap.Config.ARGB_8888, false);
                        if (bitmapCopy != null) {
                            if (width == bitmapCopy.getByteCount()) {
                                z = true;
                                interfaceC1301370jyB.LIZ(bitmapCopy);
                            }
                            bitmapCopy.recycle();
                            BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCopy);
                            if (z) {
                                return;
                            }
                        }
                        interfaceC1301370jyB.reject("Decode type of bitmap may not correct !!!");
                        return;
                    }
                    interfaceC1301370jyB.LIZ(bitmapDecodeByteArray);
                }
            });
        }
    }

    @Override // X.AbstractC1301300jy4
    public final void LJFF(String str, final C1301480jyM c1301480jyM) {
        byte[] bArr;
        if (str == null) {
            c1301480jyM.LIZJ("loadUrlWithStreamDelegate url empty !!!");
            return;
        }
        LJIIIIZZ(str);
        if (u.LJJIIJZLJL(str, "data:", false)) {
            byte[] bArrLJII = LJII(str);
            if (bArrLJII != null) {
                c1301480jyM.LIZLLL(bArrLJII.length);
                c1301480jyM.LIZ(bArrLJII, bArrLJII.length);
                c1301480jyM.LIZIZ();
                return;
            }
            c1301480jyM.LIZJ("data url decode null");
            return;
        }
        if (!u.LJJIIJZLJL(str, "http://", false) && !u.LJJIIJZLJL(str, "https://", false)) {
            C2220231Bv3 c2220231Bv3 = this.LIZ.LJJJZ(0, -1, str, "binary").LIZIZ;
            if (!c2220231Bv3.LIZ) {
                c1301480jyM.LIZJ("load failure");
                return;
            }
            Map<String, Object> map = c2220231Bv3.LIZLLL;
            Object obj = null;
            if (map != null) {
                obj = map.get("data");
            }
            if ((obj instanceof byte[]) && (bArr = (byte[]) obj) != null && bArr.length != 0) {
                c1301480jyM.LIZLLL(bArr.length);
                c1301480jyM.LIZ(bArr, bArr.length);
                c1301480jyM.LIZIZ();
                return;
            }
            c1301480jyM.LIZJ("empty data");
            return;
        }
        LIZJ(str, new InterfaceC1301360jyA() { // from class: X.0jy8
            @Override // X.InterfaceC1301360jyA
            public final void reject(String str2) {
                ((C1301480jyM) c1301480jyM).LIZJ(str2);
            }

            @Override // X.InterfaceC1301360jyA
            public final void LIZ(byte[] bArr2, int i) {
                ((C1301480jyM) c1301480jyM).LIZLLL(bArr2.length);
                ((C1301480jyM) c1301480jyM).LIZ(bArr2, bArr2.length);
                ((C1301480jyM) c1301480jyM).LIZIZ();
            }
        });
    }
}
