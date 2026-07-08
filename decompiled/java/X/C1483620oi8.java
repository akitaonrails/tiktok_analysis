package X;

import Y.ACallableS428S0100000_23;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: X.0oi8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1483620oi8 extends AbstractC1483760oiM {
    public final InterfaceC1483670oiD LIZIZ;
    public final C1483640oiA LIZJ;
    public InterfaceC1482530ogN LIZLLL;
    public final C1482520ogM LJ;
    public boolean LJFF;
    public InterfaceC1479620obg LJI;
    public boolean LJII;
    public final WeakHashMap<InterfaceC1483820oiS, C1483870oiX> LJIIIIZZ;
    public final WeakHashMap<InterfaceC1483820oiS, String> LJIIIZ;
    public WeakReference<InterfaceC1483820oiS> LJIIJ;
    public final C1024680clu LJIIJJI;
    public int LJIIL;

    @Override // X.InterfaceC1484830ok5
    public final void LIZLLL(InterfaceC1483820oiS interfaceC1483820oiS) {
    }

    @Override // X.InterfaceC1484830ok5
    public final void pause() {
        LJIIJ(true);
        this.LJII = false;
        this.LIZIZ.pause();
        this.LIZJ.pause();
    }

    @Override // X.InterfaceC1484830ok5
    public final void resume() {
        LJIIJ(false);
        this.LJII = false;
        if (!this.LJFF) {
            this.LJII = true;
        } else {
            this.LIZIZ.resume();
            this.LIZJ.resume();
        }
    }

    @Override // X.InterfaceC1484830ok5
    public final void stop() {
        this.LJIIJ = null;
        this.LJII = false;
        this.LIZIZ.stop();
        this.LIZJ.stop();
    }

    @Override // X.InterfaceC1484830ok5
    public final InterfaceC1483420oho LJIIIZ() {
        return new C1481770of9(this.LIZIZ.LJIIIZ());
    }

    @Override // X.InterfaceC1484830ok5
    public final InterfaceC1488100opM LJIILIIL() {
        return new C1483800oiQ(this.LIZIZ);
    }

    @Override // X.InterfaceC1484830ok5
    public final InterfaceC650720Pfi getLegacy() {
        return this.LIZIZ.getLegacy();
    }

    @Override // X.InterfaceC1484830ok5
    public final InterfaceC1483850oiV getPlayState() {
        return new C1484060oiq(this.LIZIZ.getPlayState());
    }

    @Override // X.InterfaceC1484830ok5
    public final void reset() {
        this.LIZIZ.reset();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    @Override // X.AbstractC1483760oiM, X.InterfaceC1484830ok5
    public final void release() {
        ?? Values;
        super.release();
        this.LJIIJ = null;
        this.LJII = false;
        this.LIZIZ.release();
        this.LIZJ.release();
        if (C1474810oTv.LLLIIIL()) {
            Set<InterfaceC1483820oiS> setKeySet = this.LJIIIZ.keySet();
            Values = new ArrayList();
            Iterator<InterfaceC1483820oiS> it2 = setKeySet.iterator();
            while (it2.hasNext()) {
                Object obj = it2.next().getParams().get("PlayerHostInfoTag");
                if (obj != null) {
                    Values.add(obj);
                }
            }
        } else {
            Values = this.LJIIIIZZ.values();
        }
        Iterator it3 = Values.iterator();
        while (it3.hasNext()) {
            InterfaceC1482650ogZ interfaceC1482650ogZ = ((C1483870oiX) it3.next()).LIZ;
            if (interfaceC1482650ogZ != null) {
                interfaceC1482650ogZ.release();
            }
        }
    }

    @Override // X.InterfaceC1484830ok5
    public final InterfaceC1483670oiD LJIILL() {
        return this.LIZIZ;
    }

    public C1483620oi8(C1478410oZj c1478410oZj) {
        C1024680clu c1024680clu = new C1024680clu();
        this.LJIIJJI = c1024680clu;
        this.LJIIL = -1;
        if (C582130MsN.LIZ().getConfig().getSimPlayerExperiment().isOpenPlayerReleaseOpt()) {
            this.LIZIZ = new C1483660oiC(c1478410oZj);
        } else {
            this.LIZIZ = C1475650oVH.LIZ().LJIIIIZZ(new C1476570oWl(c1478410oZj.LJFF, false, c1478410oZj.LJ, false));
        }
        C1482520ogM c1482520ogM = new C1482520ogM(this.LIZLLL, this.LIZIZ);
        this.LJ = c1482520ogM;
        c1482520ogM.LLJILJIL = c1024680clu;
        this.LIZIZ.LJJIJ(c1482520ogM);
        this.LJIIIIZZ = new WeakHashMap<>();
        this.LJIIIZ = new WeakHashMap<>();
        this.LIZJ = new C1483640oiA(c1478410oZj, this.LIZIZ, c1482520ogM);
        this.LIZIZ.LJIL(C1475000oUE.LJIIIIZZ());
        this.LIZIZ.LJIILIIL().LIZIZ(new C1481200oeE());
    }

    @Override // X.InterfaceC1484830ok5
    public final void LIZ(boolean z) {
        this.LIZIZ.LIZ(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0oSX, X.0oiF] */
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
    @Override // X.InterfaceC1484830ok5
    public final void LIZJ(final InterfaceC1483820oiS interfaceC1483820oiS) {
        C1483870oiX c1483870oiX;
        InterfaceC1482650ogZ interfaceC1482650ogZLIZIZ;
        this.LJIIJ = new WeakReference<>(interfaceC1483820oiS);
        this.LJFF = false;
        interfaceC1483820oiS.pe();
        FrameLayout playViewContainer = interfaceC1483820oiS.getPlayViewContainer();
        if (playViewContainer != null) {
            if (C1474810oTv.LLLIIIL()) {
                if (!this.LJIIIZ.containsKey(interfaceC1483820oiS) || (c1483870oiX = (C1483870oiX) interfaceC1483820oiS.getParams().get("PlayerHostInfoTag")) == null) {
                    c1483870oiX = new C1483870oiX();
                    interfaceC1483820oiS.getParams().put("PlayerHostInfoTag", c1483870oiX);
                    this.LJIIIZ.put(interfaceC1483820oiS, "PlayerHostInfoTag");
                }
            } else {
                c1483870oiX = this.LJIIIIZZ.get(interfaceC1483820oiS);
                if (c1483870oiX == null) {
                    c1483870oiX = new C1483870oiX();
                    this.LJIIIIZZ.put(interfaceC1483820oiS, c1483870oiX);
                }
            }
            if (c1483870oiX.LIZ == null) {
                if (C1474810oTv.LJJZ()) {
                    interfaceC1482650ogZLIZIZ = (InterfaceC1482650ogZ) C0C83.INS.waitRunOnMain(new ACallableS428S0100000_23(playViewContainer, 8));
                } else {
                    interfaceC1482650ogZLIZIZ = C1482640ogY.LIZIZ(playViewContainer, C1480850odf.LIZJ.isUseSurfaceView());
                }
                c1483870oiX.LIZ = interfaceC1482650ogZLIZIZ;
            }
            if (c1483870oiX.LIZIZ == null) {
                final InterfaceC1482650ogZ interfaceC1482650ogZ = c1483870oiX.LIZ;
                ?? r1 = new InterfaceC1473950oSX() { // from class: X.0oiF
                    @Override // X.InterfaceC1473950oSX
                    public final /* synthetic */ void LLF(int i, int i2) {
                    }

                    @Override // X.InterfaceC1473950oSX
                    public final /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                    }

                    @Override // X.InterfaceC1473950oSX
                    public final void LIZ() {
                        WeakReference<InterfaceC1483820oiS> weakReference = this.LLILLL.LJIIJ;
                        InterfaceC1483820oiS interfaceC1483820oiS2 = weakReference != null ? weakReference.get() : null;
                        Object[] objArr = new Object[8];
                        objArr[0] = Boolean.valueOf(this.LLILLL.LJII);
                        objArr[1] = Boolean.valueOf(interfaceC1483820oiS2 == interfaceC1483820oiS);
                        objArr[2] = interfaceC1483820oiS2;
                        objArr[3] = interfaceC1483820oiS;
                        objArr[4] = interfaceC1482650ogZ.getView();
                        objArr[5] = interfaceC1482650ogZ.getSurface();
                        objArr[6] = this;
                        objArr[7] = interfaceC1482650ogZ;
                        C786410Ut5.j4("doAttachWithContainer ——> onSurfaceDestroyed: mHasPendingResume:%s, isCurrentPlayerHost:%s, currentPlayingHost:%s, attachHost:%s, holderView:%s, holderSurface:%s, listener:%s, surfaceHolder:%s", objArr);
                        if (interfaceC1483820oiS2 != interfaceC1483820oiS) {
                            return;
                        }
                        C1483620oi8 c1483620oi8 = this.LLILLL;
                        c1483620oi8.LJFF = false;
                        c1483620oi8.LIZIZ.setSurface(null);
                    }

                    @Override // X.InterfaceC1473950oSX
                    public final void LLILLIZIL(int i, int i2) {
                        InterfaceC1483820oiS interfaceC1483820oiS2;
                        WeakReference<InterfaceC1483820oiS> weakReference = this.LLILLL.LJIIJ;
                        if (weakReference != null) {
                            interfaceC1483820oiS2 = weakReference.get();
                        } else {
                            interfaceC1483820oiS2 = null;
                        }
                        Object[] objArr = new Object[8];
                        boolean z = false;
                        objArr[0] = Boolean.valueOf(this.LLILLL.LJII);
                        if (interfaceC1483820oiS2 == interfaceC1483820oiS) {
                            z = true;
                        }
                        objArr[1] = Boolean.valueOf(z);
                        objArr[2] = interfaceC1483820oiS2;
                        objArr[3] = interfaceC1483820oiS;
                        objArr[4] = interfaceC1482650ogZ.getView();
                        objArr[5] = interfaceC1482650ogZ.getSurface();
                        objArr[6] = this;
                        objArr[7] = interfaceC1482650ogZ;
                        C786410Ut5.j4("doAttachWithContainer ——> onSurfaceAvailable: mHasPendingResume:%s, isCurrentPlayerHost:%s, currentPlayingHost:%s, attachHost:%s, holderView:%s, holderSurface:%s, listener:%s, surfaceHolder:%s", objArr);
                        if (interfaceC1483820oiS2 != interfaceC1483820oiS) {
                            return;
                        }
                        C1483620oi8 c1483620oi8 = this.LLILLL;
                        c1483620oi8.LJFF = true;
                        c1483620oi8.LIZIZ.setSurface(interfaceC1482650ogZ.getSurface());
                        C1483620oi8 c1483620oi82 = this.LLILLL;
                        InterfaceC1479620obg interfaceC1479620obg = c1483620oi82.LJI;
                        if (interfaceC1479620obg != null && c1483620oi82.LJFF) {
                            c1483620oi82.LJ(interfaceC1479620obg);
                            c1483620oi82.LJI = null;
                        }
                        C1483620oi8 c1483620oi83 = this.LLILLL;
                        if (c1483620oi83.LJII) {
                            c1483620oi83.LIZIZ.resume();
                        }
                    }
                };
                interfaceC1482650ogZ.Dn(r1);
                if (interfaceC1483820oiS.getCustomSurfaceLifecycleListener() != null) {
                    interfaceC1482650ogZ.Dn(interfaceC1483820oiS.getCustomSurfaceLifecycleListener());
                }
                c1483870oiX.LIZIZ = r1;
            }
            InterfaceC1482650ogZ interfaceC1482650ogZ2 = c1483870oiX.LIZ;
            if (interfaceC1482650ogZ2.getSurface() != null && interfaceC1482650ogZ2.getSurface().isValid()) {
                this.LJFF = true;
                this.LIZIZ.setSurface(interfaceC1482650ogZ2.getSurface());
            }
        }
    }

    @Override // X.InterfaceC1484830ok5
    public final void LJ(InterfaceC1479620obg interfaceC1479620obg) {
        int iIntValue;
        this.LJIIL++;
        C1024680clu c1024680clu = this.LJIIJJI;
        c1024680clu.getClass();
        c1024680clu.LIZIZ = interfaceC1479620obg.getKey();
        this.LJII = false;
        C1482520ogM c1482520ogM = this.LJ;
        if (interfaceC1479620obg.LIZLLL() != null) {
            interfaceC1479620obg.LIZLLL().getClass();
        }
        c1482520ogM.getClass();
        if (this.LJFF) {
            this.LIZIZ.LJJJJJL(C1479540obY.LIZ(interfaceC1479620obg, null));
            C1482520ogM c1482520ogM2 = this.LJ;
            String key = interfaceC1479620obg.getKey();
            HashMap<String, Object> mapLJ = interfaceC1479620obg.LJ();
            c1482520ogM2.getClass();
            C1482520ogM.LJII(key, mapLJ);
            this.LIZJ.LJ(interfaceC1479620obg);
            C1479570obb c1479570obbLIZLLL = interfaceC1479620obg.LIZLLL();
            if (c1479570obbLIZLLL != null && c1479570obbLIZLLL.LJJ) {
                ((C1483800oiQ) LJIILIIL()).mute();
                return;
            }
            return;
        }
        InterfaceC1479620obg interfaceC1479620obg2 = this.LJI;
        if ((interfaceC1479620obg2 == null || !TextUtils.equals(interfaceC1479620obg2.getKey(), interfaceC1479620obg.getKey())) && ((iIntValue = ((Number) C1474810oTv.Q3.getValue()).intValue()) == 0 || (iIntValue == 1 && this.LJIIL == 0))) {
            if (C582130MsN.LIZ().getConfig().getSimPlayerExperiment().enableNoSurfacePreRenderWithoutRender()) {
                interfaceC1479620obg.LIZLLL().LIZJ = true;
            }
            this.LIZIZ.LJJJLZIJ(C1479540obY.LIZ(interfaceC1479620obg, null));
        }
        if (C582130MsN.LIZ().getConfig().getSimPlayerExperiment().enableNoSurfacePreRenderWithoutRender()) {
            interfaceC1479620obg.LIZLLL().LIZJ = false;
        }
        if (C582130MsN.LIZ().getConfig().getSimPlayerExperiment().enableNoSurfacePreRenderWithoutRenderForStartup()) {
            interfaceC1479620obg.LIZLLL().LIZJ = false;
        }
        this.LJI = interfaceC1479620obg;
    }

    public final void LJIIJ(boolean z) {
        C1483870oiX c1483870oiX;
        InterfaceC1482650ogZ interfaceC1482650ogZ;
        if (Build.VERSION.SDK_INT >= 26 || this.LJIIJ == null) {
            return;
        }
        if (C1474810oTv.LLLIIIL()) {
            InterfaceC1483820oiS interfaceC1483820oiS = this.LJIIJ.get();
            if (interfaceC1483820oiS != null) {
                c1483870oiX = (C1483870oiX) interfaceC1483820oiS.getParams().get("PlayerHostInfoTag");
            } else {
                return;
            }
        } else {
            c1483870oiX = this.LJIIIIZZ.get(this.LJIIJ.get());
        }
        if (c1483870oiX == null || (interfaceC1482650ogZ = c1483870oiX.LIZ) == null) {
            return;
        }
        if (z) {
            interfaceC1482650ogZ.LIZ();
        } else {
            interfaceC1482650ogZ.LJFF();
        }
    }

    @Override // X.InterfaceC1484830ok5
    public final void LJIIJJI(InterfaceC1483820oiS interfaceC1483820oiS) {
        this.LJIIJ = null;
        if (C1474810oTv.LLLIIIL()) {
            this.LJIIIZ.remove(interfaceC1483820oiS);
        } else {
            this.LJIIIIZZ.remove(interfaceC1483820oiS);
        }
    }

    @Override // X.InterfaceC1484830ok5
    public final void LJIILLIIL(InterfaceC1482530ogN interfaceC1482530ogN) {
        this.LIZLLL = interfaceC1482530ogN;
        this.LJ.LLILLJJLI = interfaceC1482530ogN;
    }

    @Override // X.AbstractC1483760oiM, X.InterfaceC1484830ok5
    public final void LJIIZILJ(InterfaceC1482530ogN interfaceC1482530ogN) {
        C1482520ogM c1482520ogM = this.LJ;
        if (c1482520ogM != null) {
            c1482520ogM.LIZ(interfaceC1482530ogN);
        }
    }

    @Override // X.InterfaceC1484830ok5
    public final void LJJII(String str) {
        this.LIZJ.LJJII(str);
    }

    @Override // X.AbstractC1483760oiM, X.InterfaceC1484830ok5
    public final void LJJIIZ(InterfaceC1482530ogN interfaceC1482530ogN) {
        C1482520ogM c1482520ogM = this.LJ;
        if (c1482520ogM != null) {
            c1482520ogM.LIZLLL(interfaceC1482530ogN);
        }
    }

    @Override // X.AbstractC1483760oiM, X.InterfaceC1484830ok5
    public final void LJJIIZI(InterfaceC1481870ofJ interfaceC1481870ofJ) {
        this.LJ.LLILZ = interfaceC1481870ofJ;
    }

    @Override // X.InterfaceC1484830ok5
    public final void LJJJIL(InterfaceC1479620obg interfaceC1479620obg) {
        this.LIZIZ.LJJJLZIJ(C1479540obY.LIZ(interfaceC1479620obg, null));
    }

    @Override // X.InterfaceC1484830ok5
    public final void LJJJLIIL(InterfaceC1472880oQo interfaceC1472880oQo) {
        this.LIZIZ.LJJZZI(interfaceC1472880oQo);
    }

    @Override // X.AbstractC1483760oiM, X.InterfaceC1484830ok5
    public final void LJJLIIIJL(InterfaceC585470Mxl interfaceC585470Mxl) {
        this.LIZIZ.LJIILIIL().LIZ(interfaceC585470Mxl);
    }

    @Override // X.InterfaceC1484830ok5
    public final void seek(float f) {
        this.LIZIZ.seek(f);
    }

    @Override // X.InterfaceC1484830ok5
    public final void setLoop(boolean z) {
        this.LIZIZ.setLoop(z);
    }

    @Override // X.InterfaceC1484830ok5
    public final void setSpeed(float f) {
        this.LIZIZ.setSpeed(f);
        this.LJIIJJI.LIZ(f);
    }

    @Override // X.InterfaceC1484830ok5
    public final void stop(String str) {
        this.LJIIJ = null;
        this.LJII = false;
        this.LIZIZ.stop();
        this.LIZJ.stop();
        C1482520ogM c1482520ogM = this.LJ;
        c1482520ogM.LLIZ = false;
        c1482520ogM.LLIZLLLIL = str;
    }

    @Override // X.InterfaceC1484830ok5
    public final void LJIIIIZZ(String str, List<InterfaceC1479620obg> list) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setPlayList: ");
        sbLIZ.append(list.size());
        C2188811AlT.LIZIZ(sbLIZ);
        this.LIZJ.LJIIIIZZ(str, list);
    }
}
