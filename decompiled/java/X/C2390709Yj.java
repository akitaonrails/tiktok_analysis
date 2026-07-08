package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.model.MinisPkg;
import com.ss.android.ugc.aweme.minis.model.MinisPkgConfig;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: X.09Yj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.performance.nativegame.MinisNativeGameDownloadManager$downloadNativePkg$3", f = "MinisNativeGameDownloadManager.kt", l = {249}, m = "invokeSuspend")
public final class C2390709Yj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ MinisPkgConfig LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ SchemaParserData LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ Context LLIZLLLIL;
    public final /* synthetic */ MinisPkg LLJ;
    public final /* synthetic */ C259800zU<String> LLJI;
    public final /* synthetic */ boolean LLJIJIL;
    public final /* synthetic */ C259800zU<C2391409Yq> LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2390709Yj(String str, MinisPkgConfig minisPkgConfig, String str2, SchemaParserData schemaParserData, boolean z, boolean z2, Context context, MinisPkg minisPkg, C259800zU<String> c259800zU, boolean z3, C259800zU<C2391409Yq> c259800zU2, InterfaceC1364105Vn<? super C2390709Yj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = minisPkgConfig;
        this.LLILZ = str2;
        this.LLILZIL = schemaParserData;
        this.LLILZLL = z;
        this.LLIZ = z2;
        this.LLIZLLLIL = context;
        this.LLJ = minisPkg;
        this.LLJI = c259800zU;
        this.LLJIJIL = z3;
        this.LLJILJIL = c259800zU2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2390709Yj(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objLIZ = obj;
        C1C7U.LIZ("MinisNativeGameDownloadManager@99.downloadNativePkg$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLIZ);
            } else {
                C155000ia.LIZIZ(objLIZ);
                C2390509Yh c2390509Yh = C2390509Yh.LIZ;
                String str = this.LLILLJJLI;
                MinisPkgConfig minisPkgConfig = this.LLILLL;
                String str2 = this.LLILZ;
                c2390509Yh.getClass();
                if (C2390509Yh.LJIJJ(str, minisPkgConfig, str2)) {
                    JSONArray jSONArray = C2196361Axe.LIZ;
                    C2196361Axe.LIZJ(this.LLILZIL, this.LLILZ, this.LLILZLL, this.LLIZ, true);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("MinisNativeGameDownloadManager@99.downloadNativePkg$3");
                    return unit;
                }
                Context context = this.LLIZLLLIL;
                String str3 = this.LLILLJJLI;
                MinisPkgConfig minisPkgConfig2 = this.LLILLL;
                MinisPkg minisPkg = this.LLJ;
                SchemaParserData schemaParserData = this.LLILZIL;
                boolean z = this.LLILZLL;
                boolean z2 = this.LLIZ;
                this.LL = 1;
                objLIZ = c2390509Yh.LIZ(context, str3, minisPkgConfig2, minisPkg, schemaParserData, z, z2, this);
                if (objLIZ == objLJFF) {
                    C1C7U.LIZIZ("MinisNativeGameDownloadManager@99.downloadNativePkg$3");
                    return objLJFF;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            CopyOnWriteArrayList<InterfaceC2391909Yv> copyOnWriteArrayList = C2390509Yh.LIZLLL.get(this.LLJILJIL.element.LIZIZ);
            if (copyOnWriteArrayList != null) {
                C259800zU<C2391409Yq> c259800zU = this.LLJILJIL;
                Iterator<InterfaceC2391909Yv> it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZJ(c259800zU.element, e);
                }
            }
            C2390509Yh.LIZLLL.remove(this.LLJILJIL.element.LIZIZ);
        }
        if (!((Boolean) objLIZ).booleanValue()) {
            CopyOnWriteArrayList<InterfaceC2391909Yv> copyOnWriteArrayList2 = C2390509Yh.LIZLLL.get(this.LLJ.md5);
            if (copyOnWriteArrayList2 != null) {
                C259800zU<C2391409Yq> c259800zU2 = this.LLJILJIL;
                Iterator<InterfaceC2391909Yv> it3 = copyOnWriteArrayList2.iterator();
                while (it3.hasNext()) {
                    it3.next().LIZJ(c259800zU2.element, new Exception("decompress dependency pkg fail"));
                }
            }
            C2390509Yh.LIZLLL.remove(this.LLJ.md5);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("MinisNativeGameDownloadManager@99.downloadNativePkg$3");
            return unit2;
        }
        MinisPkg minisPkg2 = this.LLJ;
        String str4 = minisPkg2.url;
        String str5 = "";
        if (str4 == null) {
            str4 = "";
        }
        String str6 = minisPkg2.md5;
        C2390509Yh.LIZ.getClass();
        String strLJIIZILJ = C2390509Yh.LJIIZILJ();
        String str7 = this.LLJI.element;
        C1227904rF c1227904rF = C1227904rF.LIZ;
        MinisPkg minisPkg3 = this.LLJ;
        c1227904rF.getClass();
        String strLJI = C1227904rF.LJI(minisPkg3);
        if (strLJI != null) {
            str5 = strLJI;
        }
        String strLJIILJJIL = C2390509Yh.LJIILJJIL(this.LLILLJJLI);
        final SchemaParserData schemaParserData2 = this.LLILZIL;
        final String str8 = this.LLILZ;
        final boolean z3 = this.LLILZLL;
        final boolean z4 = this.LLIZ;
        final String str9 = this.LLILLJJLI;
        final Context context2 = this.LLIZLLLIL;
        C2391409Yq c2391409Yq = new C2391409Yq(str4, str6, str6, strLJIIZILJ, str7, str8, str5, new InterfaceC2391809Yu() { // from class: X.09Yl
            @Override // X.InterfaceC2391809Yu
            public final void LIZIZ(C2391409Yq c2391409Yq2) {
                JSONArray jSONArray2 = C2196361Axe.LIZ;
                C2196361Axe.LIZJ(schemaParserData2, str8, z3, z4, false);
                CopyOnWriteArrayList<InterfaceC2391909Yv> copyOnWriteArrayList3 = C2390509Yh.LIZLLL.get(c2391409Yq2.LIZIZ);
                if (copyOnWriteArrayList3 != null) {
                    Iterator<InterfaceC2391909Yv> it4 = copyOnWriteArrayList3.iterator();
                    while (it4.hasNext()) {
                        it4.next().LIZLLL(c2391409Yq2);
                    }
                }
            }

            @Override // X.InterfaceC2391809Yu
            public final void LIZJ(C2391409Yq c2391409Yq2) throws JSONException {
                boolean zLIZIZ;
                C2390509Yh c2390509Yh2 = C2390509Yh.LIZ;
                String str10 = c2391409Yq2.LJ;
                c2390509Yh2.getClass();
                C2390509Yh.LIZIZ.remove(str10);
                C2390509Yh.LIZJ.remove(str10);
                if (C2390509Yh.LJIL(str9, c2391409Yq2.LJFF)) {
                    Context context3 = context2;
                    String str11 = str9;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(C2390509Yh.LJIIZILJ());
                    sbLIZ.append('/');
                    sbLIZ.append(c2391409Yq2.LIZJ);
                    zLIZIZ = c2390509Yh2.LIZIZ(context3, str11, C2188811AlT.LIZIZ(sbLIZ), c2391409Yq2.LJIIIIZZ, c2391409Yq2.LJFF, c2391409Yq2.LJI, false);
                } else {
                    zLIZIZ = true;
                }
                JSONArray jSONArray2 = C2196361Axe.LIZ;
                C2196361Axe.LIZIZ(schemaParserData2, str8, zLIZIZ, true, zLIZIZ, "", z3, z4);
                CopyOnWriteArrayList<InterfaceC2391909Yv> copyOnWriteArrayList3 = C2390509Yh.LIZLLL.get(c2391409Yq2.LIZIZ);
                if (copyOnWriteArrayList3 != null) {
                    Iterator<InterfaceC2391909Yv> it4 = copyOnWriteArrayList3.iterator();
                    while (it4.hasNext()) {
                        it4.next().LIZ(c2391409Yq2, zLIZIZ);
                    }
                }
                C2390509Yh.LIZLLL.remove(c2391409Yq2.LIZIZ);
            }

            @Override // X.InterfaceC2391809Yu
            public final void LIZ(C2391409Yq c2391409Yq2, int i2) {
                CopyOnWriteArrayList<InterfaceC2391909Yv> copyOnWriteArrayList3 = C2390509Yh.LIZLLL.get(c2391409Yq2.LIZIZ);
                if (copyOnWriteArrayList3 != null) {
                    Iterator<InterfaceC2391909Yv> it4 = copyOnWriteArrayList3.iterator();
                    while (it4.hasNext()) {
                        it4.next().LIZIZ(c2391409Yq2, i2);
                    }
                }
            }

            @Override // X.InterfaceC2391809Yu
            public final void LIZLLL(C2391409Yq c2391409Yq2, Exception exc) throws JSONException {
                String message;
                C2390509Yh c2390509Yh2 = C2390509Yh.LIZ;
                String str10 = c2391409Yq2.LJ;
                c2390509Yh2.getClass();
                C2390509Yh.LIZIZ.remove(str10);
                C2390509Yh.LIZJ.remove(str10);
                JSONArray jSONArray2 = C2196361Axe.LIZ;
                SchemaParserData schemaParserData3 = schemaParserData2;
                String str11 = str8;
                if (exc != null) {
                    message = exc.getMessage();
                } else {
                    message = null;
                }
                C2196361Axe.LIZIZ(schemaParserData3, str11, false, false, false, String.valueOf(message), z3, z4);
                CopyOnWriteArrayList<InterfaceC2391909Yv> copyOnWriteArrayList3 = C2390509Yh.LIZLLL.get(c2391409Yq2.LIZIZ);
                if (copyOnWriteArrayList3 != null) {
                    Iterator<InterfaceC2391909Yv> it4 = copyOnWriteArrayList3.iterator();
                    while (it4.hasNext()) {
                        it4.next().LIZJ(c2391409Yq2, exc);
                    }
                }
                C2390509Yh.LIZLLL.remove(c2391409Yq2.LIZIZ);
            }
        }, strLJIILJJIL, null, false, 6912);
        C2390509Yh.LIZIZ.put(this.LLJI.element, c2391409Yq);
        if (this.LLJIJIL) {
            C2390509Yh.LIZJ.put(this.LLJI.element, c2391409Yq);
        }
        C2391509Yr.LIZ.getClass();
        C2391509Yr.LIZ(c2391409Yq);
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("MinisNativeGameDownloadManager@99.downloadNativePkg$3");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
