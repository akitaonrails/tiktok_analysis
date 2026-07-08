package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.1AZd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2181471AZd implements InterfaceC968390bJ7 {
    public final InterfaceC954180awC LL;
    public final C1AXQ LLILLJJLI;
    public final CopyOnWriteArraySet<InterfaceC1280020jPk> LLILLL = new CopyOnWriteArraySet<>();
    public final List<InterfaceC2182181Aam> LLILZ = new ArrayList();
    public final List<InterfaceC2182021AaW> LLILZIL = new ArrayList();
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;

    public final InterfaceC2182051AaZ LIZ() {
        InterfaceC954180awC interfaceC954180awC = this.LL;
        if (interfaceC954180awC instanceof InterfaceC968520bJK) {
            return ((InterfaceC968520bJK) interfaceC954180awC).LLJJIJI();
        }
        return null;
    }

    @Override // X.InterfaceC955150axl
    public final void LJJI() {
        List<C1276780jKW> listLJ;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL = this.LL.LLIIJLIL();
        if (interfaceC937900aVwLLIIJLIL instanceof InterfaceC955150axl) {
            ((InterfaceC955150axl) interfaceC937900aVwLLIIJLIL).LJJI();
        } else {
            if (!(interfaceC937900aVwLLIIJLIL instanceof InterfaceC2181771Aa7) || (listLJ = LJ(((InterfaceC2181771Aa7) interfaceC937900aVwLLIIJLIL).LJIJJ())) == null) {
                return;
            }
            this.LLILLJJLI.LJJLIIIIJ(listLJ);
        }
    }

    @Override // X.InterfaceC968390bJ7
    public final void release() {
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL = this.LL.LLIIJLIL();
        if (interfaceC937900aVwLLIIJLIL instanceof InterfaceC955150axl) {
            ((InterfaceC955150axl) interfaceC937900aVwLLIIJLIL).LJIJJ((InterfaceC1280020jPk) this.LLILZLL.getValue());
        } else if (interfaceC937900aVwLLIIJLIL instanceof InterfaceC2181771Aa7) {
            this.LLILLJJLI.LJLI(null);
        }
        ((ArrayList) this.LLILZ).clear();
        ((ArrayList) this.LLILZIL).clear();
        this.LLILLL.clear();
    }

    public static List LJ(C2182171Aal c2182171Aal) {
        if (c2182171Aal == null) {
            return null;
        }
        C2181961AaQ c2181961AaQ = c2182171Aal.LIZ;
        C1283980jW8 c1283980jW8 = c2181961AaQ.LIZJ.LIZIZ;
        double d = c1283980jW8.LIZJ - c1283980jW8.LIZ;
        double d2 = c1283980jW8.LIZLLL - c1283980jW8.LIZIZ;
        List<C2181741Aa4> list = c2181961AaQ.LIZLLL;
        ArrayList<C2181741Aa4> arrayList = new ArrayList();
        for (C2181741Aa4 c2181741Aa4 : list) {
            EnumC1283210jUt enumC1283210jUt = c2181741Aa4.LJIIIIZZ.LIZ;
            if (enumC1283210jUt == EnumC1283210jUt.RtcUserId || enumC1283210jUt == EnumC1283210jUt.RtcStreamId) {
                arrayList.add(c2181741Aa4);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (C2181741Aa4 c2181741Aa42 : arrayList) {
            String str = c2181741Aa42.LJIIIIZZ.LIZIZ;
            int i = (int) c2181741Aa42.LIZIZ;
            C1283980jW8 c1283980jW82 = c2181741Aa42.LIZLLL.LIZIZ;
            double d3 = c1283980jW82.LIZ;
            double d4 = c1283980jW82.LIZIZ;
            arrayList2.add(new C1276780jKW(str, (float) (d3 / d), (float) (d4 / d2), (float) ((c1283980jW82.LIZJ - d3) / d), (float) ((c1283980jW82.LIZLLL - d4) / d2), (int) c2181741Aa42.LJII, i));
        }
        return arrayList2;
    }

    @Override // X.InterfaceC955150axl
    public final void LIZLLL(InterfaceC1280020jPk interfaceC1280020jPk) {
        this.LLILLL.add(interfaceC1280020jPk);
    }

    @Override // X.InterfaceC955150axl
    public final void LJIJJ(InterfaceC1280020jPk interfaceC1280020jPk) {
        this.LLILLL.remove(interfaceC1280020jPk);
    }

    public C2181471AZd(C965340bEC c965340bEC, C968900bJw c968900bJw) {
        this.LL = c965340bEC;
        this.LLILLJJLI = c968900bJw;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C1285500jYa(this));
        this.LLILZLL = c01gwLIZIZ;
        C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new C2182141Aai(this));
        this.LLIZ = c01gwLIZIZ2;
        C01GW c01gwLIZIZ3 = C452501pT.LIZIZ(new C2182151Aaj(this));
        this.LLIZLLLIL = c01gwLIZIZ3;
        InterfaceC964790bDJ interfaceC964790bDJLLJLILLLLZIIL = c965340bEC.LLJLILLLLZIIL();
        if (interfaceC964790bDJLLJLILLLLZIIL instanceof InterfaceC955150axl) {
            ((InterfaceC955150axl) interfaceC964790bDJLLJLILLLLZIIL).LIZLLL((InterfaceC1280020jPk) c01gwLIZIZ.getValue());
            return;
        }
        if (!(interfaceC964790bDJLLJLILLLLZIIL instanceof InterfaceC2181771Aa7)) {
            return;
        }
        ((InterfaceC2181771Aa7) interfaceC964790bDJLLJLILLLLZIIL).LLF((InterfaceC2182131Aah) c01gwLIZIZ2.getValue());
        InterfaceC2182051AaZ interfaceC2182051AaZLIZ = LIZ();
        if (interfaceC2182051AaZLIZ != null) {
            ((C2181391AYv) interfaceC2182051AaZLIZ).LJIIIIZZ((C1AZC) c01gwLIZIZ3.getValue());
        }
        c968900bJw.LJLI((InterfaceC1280020jPk) c01gwLIZIZ.getValue());
    }

    public static boolean LIZJ(InterfaceC2181771Aa7 interfaceC2181771Aa7, String str, List list) {
        String str2;
        C2181811AaB next;
        Integer numValueOf;
        Integer numValueOf2;
        String str3;
        EnumC1283210jUt enumC1283210jUt;
        C2182031AaX c2182031AaXLJJII = interfaceC2181771Aa7.LJJII();
        List<C2181811AaB> listLJLJJLL = interfaceC2181771Aa7.LJLJJLL();
        if (c2182031AaXLJJII == null || listLJLJJLL == null || c2182031AaXLJJII.LIZIZ.length() == 0 || listLJLJJLL.isEmpty() || !Intrinsics.LJFF(c2182031AaXLJJII.LIZIZ, str) || listLJLJJLL.size() != list.size()) {
            return false;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C957030b0n c957030b0n = (C957030b0n) ListProtector.get(list, i);
            Iterator<C2181811AaB> it2 = listLJLJJLL.iterator();
            while (true) {
                str2 = null;
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.LIZ == c957030b0n.LIZ) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C2181811AaB c2181811AaB = next;
            if (c2181811AaB != null && c957030b0n.LIZ == c2181811AaB.LIZ) {
                PosIdentity posIdentity = c957030b0n.LIZIZ;
                if (posIdentity != null) {
                    numValueOf = Integer.valueOf(posIdentity.type);
                } else {
                    numValueOf = null;
                }
                C1283230jUv c1283230jUv = c2181811AaB.LIZIZ;
                if (c1283230jUv != null && (enumC1283210jUt = c1283230jUv.LIZ) != null) {
                    numValueOf2 = Integer.valueOf(enumC1283210jUt.intoInt());
                } else {
                    numValueOf2 = null;
                }
                if (Intrinsics.LJFF(numValueOf, numValueOf2)) {
                    PosIdentity posIdentity2 = c957030b0n.LIZIZ;
                    if (posIdentity2 != null) {
                        str3 = posIdentity2.value;
                    } else {
                        str3 = null;
                    }
                    C1283230jUv c1283230jUv2 = c2181811AaB.LIZIZ;
                    if (c1283230jUv2 != null) {
                        str2 = c1283230jUv2.LIZIZ;
                    }
                    if (Intrinsics.LJFF(str3, str2)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v38, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, java.util.List] */
    @Override // X.InterfaceC955150axl
    public final void LJIILIIL(EnumC965730bEp enumC965730bEp, C955340ay4 c955340ay4, String str, String str2, boolean z, JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        String str3;
        C955320ay2 c955320ay2 = c955340ay4.LIZ;
        List<C957030b0n> list = c955340ay4.LIZIZ;
        StringBuilder sb = new StringBuilder("startLayoutAnimation: layoutKey:");
        sb.append(c955320ay2.LIZIZ);
        sb.append(", spotList:");
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C957030b0n c957030b0n : list) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("spot_id", c957030b0n.LIZ);
            PosIdentity posIdentity = c957030b0n.LIZIZ;
            if (posIdentity != null) {
                str3 = posIdentity.value;
            } else {
                str3 = null;
            }
            jSONObject3.put("value", str3);
            arrayList.add(jSONObject3);
        }
        sb.append(arrayList);
        sb.append(", effectId:");
        sb.append(str);
        sb.append(", effectResPath:");
        sb.append(str2);
        sb.append(", enableLocalAnimation:");
        sb.append(z);
        C20441214yg.LIZIZ("LayoutAnimationManager", sb.toString());
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL = this.LL.LLIIJLIL();
        if (interfaceC937900aVwLLIIJLIL instanceof InterfaceC2181771Aa7) {
            InterfaceC2181771Aa7 interfaceC2181771Aa7 = (InterfaceC2181771Aa7) interfaceC937900aVwLLIIJLIL;
            if (LIZJ(interfaceC2181771Aa7, c955320ay2.LIZIZ, list)) {
                C20441214yg.LIZIZ("LayoutAnimationManager", "startLayoutAnimation: same update info, ignore");
                return;
            }
            if (this.LL.LJJJLIIL() == EnumC952680atm.SINGLE_VIEWMODE && z && C123100dR.LIZ(str2)) {
                C259800zU c259800zU = new C259800zU();
                c259800zU.element = LJ(interfaceC2181771Aa7.LJIJJ());
                C20324614fs c20324614fs = new C20324614fs(c955320ay2.LIZIZ, new C2181631AZt(c955320ay2, this, str, str2, c259800zU, jSONObject, jSONObject2));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("startLayoutAnimation: add effect layout animation task[");
                sbLIZ.append(c20324614fs.LIZJ);
                sbLIZ.append("], layoutKey:");
                sbLIZ.append(c955320ay2.LIZIZ);
                C20441214yg.LIZIZ("LayoutAnimationManager", C2188811AlT.LIZIZ(sbLIZ));
                ((ArrayList) this.LLILZ).clear();
                ((ArrayList) this.LLILZ).add(c20324614fs);
            }
            C259800zU c259800zU2 = new C259800zU();
            InterfaceC2182051AaZ interfaceC2182051AaZLIZ = LIZ();
            if (interfaceC2182051AaZLIZ != null) {
                C1AZ9 c1az9 = ((C2181391AYv) interfaceC2182051AaZLIZ).LJII().LIZIZ;
                int i = (int) c1az9.LIZIZ;
                int i2 = (int) c1az9.LIZJ;
                ?? LJIILL = this.LLILLJJLI.LJIILL();
                if (interfaceC2182051AaZLIZ instanceof InterfaceC1276590jKD) {
                    ((InterfaceC1276590jKD) interfaceC2182051AaZLIZ).mixStream(i, i2, LJIILL);
                    c259800zU2.element = LJIILL;
                }
            }
            C2181711Aa1 c2181711Aa1 = new C2181711Aa1(c955320ay2.LIZIZ, new C2181581AZo(c955320ay2, this, str, str2, c259800zU2, jSONObject, jSONObject2));
            C20441214yg.LIZIZ("LayoutAnimationManager", "startLayoutAnimation: add remote layout animation task, layoutKey:" + c955320ay2.LIZIZ + ", taskId:" + c2181711Aa1.LIZJ);
            ((ArrayList) this.LLILZIL).clear();
            ((ArrayList) this.LLILZIL).add(c2181711Aa1);
            C973010bQZ c973010bQZ = C973010bQZ.LIZ;
            ((InterfaceC940060aZQ) interfaceC937900aVwLLIIJLIL).LLIL(enumC965730bEp, c955340ay4, C973010bQZ.LJFF("startLayoutAnimation"));
        }
    }

    @Override // X.InterfaceC955150axl
    public final void LIZIZ(String str, List<LinkUser> list, String str2, String str3, boolean z, JSONObject jSONObject, JSONObject jSONObject2, Function0<Unit> function0) {
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL = this.LL.LLIIJLIL();
        if (interfaceC937900aVwLLIIJLIL instanceof InterfaceC955150axl) {
            ((InterfaceC955150axl) interfaceC937900aVwLLIIJLIL).LIZIZ(str, list, str2, str3, z, jSONObject, jSONObject2, function0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.util.List] */
    @Override // X.InterfaceC955150axl
    public final void LJIILJJIL(EnumC965730bEp enumC965730bEp, byte[] bArr, String str, List<C957030b0n> list, String str2, String str3, boolean z, JSONObject jSONObject, JSONObject jSONObject2, C917100ZyO c917100ZyO) throws JSONException {
        String str4;
        StringBuilder sb = new StringBuilder("startLayoutAnimation: layoutKey:");
        sb.append(str);
        sb.append(", spotList:");
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C957030b0n c957030b0n : (ArrayList) list) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("spot_id", c957030b0n.LIZ);
            PosIdentity posIdentity = c957030b0n.LIZIZ;
            if (posIdentity != null) {
                str4 = posIdentity.value;
            } else {
                str4 = null;
            }
            jSONObject3.put("value", str4);
            arrayList.add(jSONObject3);
        }
        sb.append(arrayList);
        sb.append(", effectId:");
        sb.append(str2);
        sb.append(", effectResPath:");
        sb.append(str3);
        sb.append(", enableLocalAnimation:");
        sb.append(z);
        C20441214yg.LIZIZ("LayoutAnimationManager", sb.toString());
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL = this.LL.LLIIJLIL();
        if (interfaceC937900aVwLLIIJLIL instanceof InterfaceC2181771Aa7) {
            InterfaceC2181771Aa7 interfaceC2181771Aa7 = (InterfaceC2181771Aa7) interfaceC937900aVwLLIIJLIL;
            if (LIZJ(interfaceC2181771Aa7, str, list)) {
                C20441214yg.LIZIZ("LayoutAnimationManager", "startLayoutAnimation: same update info, ignore");
                return;
            }
            if (this.LL.LJJJLIIL() == EnumC952680atm.SINGLE_VIEWMODE && z && C123100dR.LIZ(str3)) {
                C259800zU c259800zU = new C259800zU();
                c259800zU.element = LJ(interfaceC2181771Aa7.LJIJJ());
                C20324614fs c20324614fs = new C20324614fs(str, new C2181611AZr(this, str, str2, str3, c259800zU, jSONObject, jSONObject2));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("startLayoutAnimation: add effect layout animation task[");
                sbLIZ.append(c20324614fs.LIZJ);
                sbLIZ.append("], layoutKey:");
                sbLIZ.append(str);
                C20441214yg.LIZIZ("LayoutAnimationManager", C2188811AlT.LIZIZ(sbLIZ));
                ((ArrayList) this.LLILZ).clear();
                ((ArrayList) this.LLILZ).add(c20324614fs);
            }
            C259800zU c259800zU2 = new C259800zU();
            InterfaceC2182051AaZ interfaceC2182051AaZLIZ = LIZ();
            if (interfaceC2182051AaZLIZ != null) {
                C1AZ9 c1az9 = ((C2181391AYv) interfaceC2182051AaZLIZ).LJII().LIZIZ;
                int i = (int) c1az9.LIZIZ;
                int i2 = (int) c1az9.LIZJ;
                ?? LJIILL = this.LLILLJJLI.LJIILL();
                if (interfaceC2182051AaZLIZ instanceof InterfaceC1276590jKD) {
                    ((InterfaceC1276590jKD) interfaceC2182051AaZLIZ).mixStream(i, i2, LJIILL);
                    c259800zU2.element = LJIILL;
                }
            }
            C2181711Aa1 c2181711Aa1 = new C2181711Aa1(str, new C2181571AZn(this, str, str2, str3, c259800zU2, jSONObject, jSONObject2));
            C20441214yg.LIZIZ("LayoutAnimationManager", "startLayoutAnimation: add remote layout animation task, layoutKey:" + str + ", taskId:" + c2181711Aa1.LIZJ);
            ((ArrayList) this.LLILZIL).clear();
            ((ArrayList) this.LLILZIL).add(c2181711Aa1);
            ((InterfaceC940060aZQ) interfaceC937900aVwLLIIJLIL).LJLI(enumC965730bEp, bArr, c917100ZyO, C13BV.INSTANCE);
        }
    }
}
